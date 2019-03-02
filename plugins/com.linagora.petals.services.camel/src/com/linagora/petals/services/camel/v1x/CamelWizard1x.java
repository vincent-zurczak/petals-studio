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

package com.linagora.petals.services.camel.v1x;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.linagora.petals.common.internal.provisional.maven.MavenBean;
import com.linagora.petals.common.internal.provisional.maven.MavenBean.Scope;
import com.linagora.petals.common.internal.provisional.utils.IoUtils;
import com.linagora.petals.common.internal.provisional.utils.JavaUtils;
import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;
import com.linagora.petals.services.camel.CamelDescription12;
import com.linagora.petals.services.camel.PetalsCamelPlugin;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.linagora.petals.services.su.wizards.CreateJBIStrategy;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Vincent Zurczak - Linagora
 */
public abstract class CamelWizard1x extends AbstractServiceUnitWizard {

	/**
	 * Constructor.
	 */
	public CamelWizard1x() {
		super();
		this.settings.showJbiPage = false;
		this.settings.openJbiEditor = false;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #setUsedInEditor(boolean)
	 */
	@Override
	public void setUsedInEditor( boolean usedInEditor ) {
		super.setUsedInEditor( usedInEditor );
		this.settings.showJbiPage = usedInEditor;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
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


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performFinish()
	 */
	@Override
	public boolean performFinish() {
		if( ! this.usedInEditor )
			setStrategy( new CamelJBIStrategy());

		return super.performFinish();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {

		// Generate resources
		IStatus result = Status.OK_STATUS;
		if( ! this.usedInEditor ) {
			try {
				// Update the properties
				postSetEndpointProperties( abstractEndpoint );

				// Generate the sample routes in Java
				IJavaProject javaProject = JavaUtils.createJavaProject( resourceFolder.getProject());
				IFolder srcFolder = resourceFolder.getProject().getFolder(PetalsConstants.LOC_SRC_FOLDER);
				IFolder targetFolder = srcFolder.getFolder("com/linagora/camel/routes");
				if( ! targetFolder.exists()
						&& ! targetFolder.getLocation().toFile().mkdirs())
					throw new IOException( "Could not create packages for a Camel project." );

				srcFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				IFile file = targetFolder.getFile("MyCamelRoute.java");
				if( ! file.exists())
					file.create( getClass().getResourceAsStream("MyCamelRoute.java_"), true, monitor);

				// Generate the sample routes in XML
				srcFolder = resourceFolder.getProject().getFolder(PetalsConstants.LOC_JAVA_RES_FOLDER);
				file = srcFolder.getFile("MyCamelRoute.xml");
				if( ! file.exists())
					file.create( getClass().getResourceAsStream("MyCamelRoute.xml_"), true, monitor);

				// Create a basic WSDL
				file = resourceFolder.getFile("route.wsdl");
				if( ! file.exists())
					file.create( getClass().getResourceAsStream("MyCamelRoute.wsdl_"), true, monitor);

				// Find the libraries to add in the project class path
				JavaUtils.updateClasspathWithProjectLibraries( javaProject, monitor, "libs-camel-12" );

			} catch( CoreException e ) {
				PetalsCamelPlugin.log( e, IStatus.ERROR );

			} catch( IOException e ) {
				PetalsCamelPlugin.log( e, IStatus.ERROR );
			}
		}

		return result;
	}


	/**
	 * This method allows to set default values in the creation wizards.
	 * <p>
	 * We do not use {@link #presetServiceValues(AbstractEndpoint)} because it
	 * also generates a default project name. Keeping an empty thing at the beginning
	 * is better.
	 * </p>
	 *
	 * @param abstractEndpoint
	 */
	protected abstract void postSetEndpointProperties( AbstractEndpoint abstractEndpoint );


	@Override
	protected boolean isJavaProject() {
		return true;
	}


	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new CamelDescription12();
	}


	/**
	 * @author Vincent Zurczak - Linagora
	 */
	private static class CamelJBIStrategy extends CreateJBIStrategy {

		/* (non-Javadoc)
		 * @see com.linagora.petals.services.su.wizards.CreateJBIStrategy
		 * #finishWizard(com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard,
		 * com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor)
		 */
		@Override
		public void finishWizard( AbstractServiceUnitWizard wizard, AbstractEndpoint endpoint, IProgressMonitor monitor )
		throws Exception {

			// Perform the super task
			super.finishWizard( wizard, endpoint, monitor );

			// Load the jbi.xml file and update it
			final IFile jbiXmlFile = this.project.getFile( PetalsConstants.LOC_JBI_FILE );
			String content = IoUtils.readFileContent( jbiXmlFile );

			content = content.replace( "</jbi:services>", "\n    <!-- Camel global stuff --></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-camel:java-routes>com.linagora.camel.routes.MyCamelRoute.java</petals-se-camel:java-routes></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-camel:xml-routes>MyCamelRoute.xml</petals-se-camel:xml-routes>\n  </jbi:services>" );
			content = content.replace( "xmlns:petals.ow2.org", "xmlns:petals-se-camel=\"http://petals.ow2.org/components/petals-se-camel/jbi/version-1.0\" xmlns:petals.ow2.org" );
			jbiXmlFile.setContents( new ByteArrayInputStream( content.getBytes( StandardCharsets.UTF_8 )), true, false, monitor );

			// Open the file in the source editor
			wizard.getShell().getDisplay().syncExec( new Runnable() {
				@Override
				public void run() {
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						page.openEditor( new FileEditorInput( jbiXmlFile ), PetalsConstants.PETALS_SOURCE_EDITOR_ID );

					} catch( PartInitException e ) {
						PetalsCamelPlugin.log( e, IStatus.ERROR );
					}
				}
			});


			// Select it in the Petals project view
			wizard.getResourcesToSelect().add( jbiXmlFile );
		}
	}
}
