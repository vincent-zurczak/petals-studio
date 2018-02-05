/******************************************************************************
 * Copyright (c) 2009-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.server.handlers;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ebmwebsourcing.petals.server.PetalsServerPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsHandler3x implements IPetalsVersionHandler {

	/**
	 * Constructor.
	 */
	public PetalsHandler3x() {
		// nothing
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.server.handlers.IPetalsVersionHandler
	 * #cleanServerInstallation(org.eclipse.core.runtime.IPath)
	 */
	public IStatus cleanServerInstallation( IPath installPath ) {

		IPath lockedFilePath = installPath.append( "locked" );
		if( lockedFilePath.toFile().delete())
			return Status.OK_STATUS;

		return Status.CANCEL_STATUS;
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.server.handlers.IPetalsVersionHandler
	 * #getRuntimeClass()
	 */
	public String getRuntimeClass() {
		return "org.ow2.petals.distribution.platform.Main";
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.server.handlers.IPetalsVersionHandler
	 * #getRuntimeClasspath(org.eclipse.core.runtime.IPath)
	 */
	public List<File> getRuntimeClasspath( IPath installPath ) {

		File folder = installPath.append( "lib" ).toFile();
		if( ! folder.exists() || ! folder.isDirectory())
			return Collections.emptyList();

		List<File> result = new ArrayList<File> ();
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept( File dir, String name ) {
				return name.endsWith( ".zip" ) || name.endsWith( ".jar" );
			}
		};

		for( File f : folder.listFiles( filter ))
			result.add( f );

		return result;
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.server.handlers.IPetalsVersionHandler
	 * #isServerInstallationDirty(org.eclipse.core.runtime.IPath)
	 */
	public boolean isServerInstallationDirty( IPath installPath ) {

		IPath lockedFilePath = installPath.append( "locked" );
		return lockedFilePath.toFile().exists();
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.server.handlers.IPetalsVersionHandler
	 * #verifyInstallPath(org.eclipse.core.runtime.IPath)
	 */
	public IStatus verifyInstallPath( IPath installPath ) {

		if( installPath == null )
			return new Status(
						IStatus.INFO,
						PetalsServerPlugin.PLUGIN_ID,
			"No install directory means a remote runtime." );

		if( ! installPath.toFile().exists())
			return new Status(
						IStatus.ERROR,
						PetalsServerPlugin.PLUGIN_ID,
			"The selected install directory does not exist." );

		IPath libPath = installPath.append( "lib" );
		if( ! libPath.toFile().exists())
			return new Status(
						IStatus.ERROR,
						PetalsServerPlugin.PLUGIN_ID,
			"The selected install directory does not have a 'lib' folder." );

		if( ! installPath.append( "conf/server.properties" ).toFile().exists())
			return new Status(
						IStatus.ERROR,
						PetalsServerPlugin.PLUGIN_ID,
			"The selected install directory does not have a 'conf/server.properties' file." );

		if( ! installPath.append( "conf/topology.xml" ).toFile().exists())
			return new Status(
						IStatus.ERROR,
						PetalsServerPlugin.PLUGIN_ID,
			"The selected install directory does not have a 'conf/topology.xml' file." );

		return Status.OK_STATUS;
	}
}
