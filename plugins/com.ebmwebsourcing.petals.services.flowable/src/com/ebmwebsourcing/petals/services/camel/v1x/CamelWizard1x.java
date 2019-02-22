/******************************************************************************
 * Copyright (c) 2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.camel.v1x;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ebmwebsourcing.petals.common.internal.provisional.maven.MavenBean;
import com.ebmwebsourcing.petals.common.internal.provisional.maven.MavenBean.Scope;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.JavaUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.services.camel.CamelDescription13;
import com.ebmwebsourcing.petals.services.camel.PetalsCamelPlugin;
import com.ebmwebsourcing.petals.services.camel.camel.CamelPackage;
import com.ebmwebsourcing.petals.services.cdk.cdk5.Cdk5Package;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Vincent Zurczak - Linagora
 */
public class CamelWizard1x extends AbstractServiceUnitWizard {

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getAdditionalMavenDependencies()
	 */
	@Override
	public List<MavenBean> getAdditionalMavenDependencies() {

		List<MavenBean> result = new ArrayList<> ();
		MavenBean bean = new MavenBean();
		bean.setArtifactId( "camel-petals" );
		bean.setGroupId( "org.ow2.petals" );
		bean.setVersion( getComponentVersionDescription().getComponentVersion() + ".0" );
		bean.setScope( Scope.PROVIDED );
		result.add( bean );

		bean = new MavenBean();
		bean.setArtifactId( "camel-core" );
		bean.setGroupId( "org.apache.camel" );
		bean.setVersion( "2.17.1" );
		bean.setScope( Scope.PROVIDED );
		result.add( bean );

		bean = new MavenBean();
		bean.setArtifactId( "petals-se-camel-junit" );
		bean.setGroupId( "org.ow2.petals" );
		bean.setVersion( getComponentVersionDescription().getComponentVersion() + ".0" );
		bean.setScope( Scope.TEST );
		result.add( bean );

		return result;
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {

		// Update the jbi.xml file (use your own implementation of "services")
		abstractEndpoint.eSet( Cdk5Package.Literals.CDK5_PROVIDES__WSDL, "route.wsdl" );
		abstractEndpoint.eSet( CamelPackage.Literals.POJO_PROVIDES__CLASS_NAME, "MyCamelRoutes.xml" );
		abstractEndpoint.eSet( CamelPackage.Literals.POJO_PROVIDES__CLASS_NAME, "com.linagora.camel.routes.MyCamelRoutes.java" );

		// Generate resources
		IStatus result = Status.OK_STATUS;
		try {
			// Generate the sample routes in Java
			JavaUtils.createJavaProject( resourceFolder.getProject());
			IFolder srcFolder = resourceFolder.getProject().getFolder(PetalsConstants.LOC_SRC_FOLDER);
			IFolder targetFolder = srcFolder.getFolder("com/linagora/camel/routes");
			if( ! targetFolder.exists()
					&& ! targetFolder.getLocation().toFile().mkdirs())
				throw new IOException( "Could not create packages for a Camel project." );

			srcFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			IFile file = targetFolder.getFile("MyCamelroutes.java");
			if( ! file.exists())
				file.create( getClass().getResourceAsStream("MyCamelRoutes.java_"), true, monitor);

			// Generate the sample routes in XML
			file = resourceFolder.getFile("MyCamelroutes.xml");
			if( ! file.exists())
				file.create( getClass().getResourceAsStream("MyCamelRoutes.xml_"), true, monitor);

			// Create a basic WSDL


		} catch( CoreException e ) {
			PetalsCamelPlugin.log( e, IStatus.ERROR );

		} catch( IOException e ) {
			PetalsCamelPlugin.log( e, IStatus.ERROR );
		}

		return result;
	}


	@Override
	protected boolean isJavaProject() {
		return true;
	}


	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new CamelDescription13();
	}
}
