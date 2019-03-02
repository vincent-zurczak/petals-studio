/******************************************************************************
 * Copyright (c) 2011-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.croquis.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;

import com.linagora.petals.common.croquis.internal.provisional.ICroquisExtension;
import com.linagora.petals.common.internal.PetalsCommonPlugin;
import com.linagora.petals.common.internal.provisional.utils.StringUtils;

/**
 * The manager for all the croquis contributions.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class CroquisContributionManager {

	public final static CroquisContributionManager INSTANCE = new CroquisContributionManager();
	private static final String EXTENSION_POINT = "com.linagora.petals.common.croquisExtension";
	private final List<ICroquisExtension> croquisData;


	/**
	 * Constructor.
	 */
	private CroquisContributionManager() {

		// Create the croquis project if necessary
		IProgressMonitor monitor = new NullProgressMonitor();
		IProject croquisProject = ResourcesPlugin.getWorkspace().getRoot().getProject( ICroquisExtension.CROQUIS_PROJECT_NAME );
		if( ! croquisProject.isAccessible()) {
			try {
				if( ! croquisProject.exists())
					croquisProject.create( monitor );

				if( ! croquisProject.isOpen())
					croquisProject.open( monitor );

			} catch( CoreException e ) {
				PetalsCommonPlugin.log( e, IStatus.ERROR );
			}
		}


		// Get the contributions from the extension point
		this.croquisData = new ArrayList<ICroquisExtension> ();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = reg.getConfigurationElementsFor( EXTENSION_POINT );
		for( IConfigurationElement elt : extensions ) {

			String className = elt.getAttribute( "class" );
			if( StringUtils.isEmpty( className )) {
				PetalsCommonPlugin.log( "No project category was found for " + elt.getContributor().getName(), IStatus.ERROR );
				continue;
			}

			// Instantiate the class
			ICroquisExtension ext = null;
			try {
				ext = (ICroquisExtension) elt.createExecutableExtension( "class" );
				this.croquisData.add( ext );

			} catch( CoreException e ) {
				PetalsCommonPlugin.log( "A croquis extension could not be instantiated - " + className, IStatus.ERROR );
			}

			if( ext == null )
				continue;

			// Create the sub-categories if necessary
			try {
				IFolder subF = croquisProject.getFolder( ext.getSubDirectoryName());
				if( ! subF.exists())
					subF.create( true, true, monitor );

			} catch( CoreException e ) {
				PetalsCommonPlugin.log( "A croquis category could not be created (" + ext.getSubDirectoryName() + ").", IStatus.ERROR );
			}
		}
	}


	/**
	 * Checks that all the croquis configuration is ready.
	 */
	public void checkInitialization() {
		// nothing to do, the constructor handles everything
	}


	/**
	 * @return the croquisData
	 */
	public List<ICroquisExtension> getCroquisData() {
		return this.croquisData;
	}
}
