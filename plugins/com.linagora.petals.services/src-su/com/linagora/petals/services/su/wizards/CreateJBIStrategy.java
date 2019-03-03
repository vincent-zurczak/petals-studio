/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.su.wizards;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import com.linagora.petals.common.internal.provisional.utils.JbiXmlUtils;
import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.utils.PetalsServicesProjectUtils;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Consumes;
import com.sun.java.xml.ns.jbi.Jbi;
import com.sun.java.xml.ns.jbi.JbiFactory;
import com.sun.java.xml.ns.jbi.Provides;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class CreateJBIStrategy implements FinishServiceCreationStrategy {

	protected IProject project;


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.FinishServiceCreationStrategy
	 * #finishWizard(com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard, com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void finishWizard(AbstractServiceUnitWizard wizard, AbstractEndpoint endpoint, IProgressMonitor monitor) throws Exception {

		// Create and write the jbi.xml file
		Jbi jbiInstance;
		jbiInstance = JbiFactory.eINSTANCE.createJbi();
		jbiInstance.setVersion(new BigDecimal("1.0"));
		jbiInstance.setServices(JbiFactory.eINSTANCE.createServices());
		jbiInstance.getServices().setBindingComponent(wizard.getComponentVersionDescription().isBc());
		if (endpoint instanceof Provides)
			jbiInstance.getServices().getProvides().add((Provides)endpoint);
		else
			jbiInstance.getServices().getConsumes().add((Consumes)endpoint);

		createProject(wizard, monitor);

		IFile jbiFile = this.project.getFile( PetalsConstants.LOC_JBI_FILE );
		monitor.subTask( "Creating the jbi.xml..." );
		JbiXmlUtils.writeJbiXmlModel( jbiInstance, jbiFile );
		monitor.worked( 1 );

		this.project.refreshLocal( IResource.DEPTH_INFINITE, monitor );


		// Open the jbi.xml?
		IProject project = getSUProject( wizard, monitor );
		final IFile jbiXmlFile = project.getFile( PetalsConstants.LOC_JBI_FILE );
		if( wizard.getSettings().openJbiEditor ) {

			// Do not open it in the WorkspaceModifyOperation
			wizard.getShell().getDisplay().syncExec( new Runnable() {
				@Override
				public void run() {
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						IDE.openEditor( page, jbiXmlFile );

					} catch( PartInitException e ) {
						PetalsServicesPlugin.log( e, IStatus.ERROR );
					}
				}
			});

			// Select it in the Petals project view
			wizard.getResourcesToSelect().add( jbiXmlFile );

		} else if( wizard.getResourcesToSelect().size() == 0 ) {
			wizard.getResourcesToSelect().add( project );
		}
	}


	/**
	 * @param wizard
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public void createProject( AbstractServiceUnitWizard wizard, IProgressMonitor monitor )
	throws CoreException, IOException {

		if (this.project != null)
			return;

		monitor.beginTask( "", IProgressMonitor.UNKNOWN );
		monitor.subTask( "Creating the project structure..." );

		URI locationURI = wizard.projectPage.isAtDefaultlocation() ? null : wizard.projectPage.computeProjectLocation().toURI();
		this.project = PetalsServicesProjectUtils.createSuProject(
				wizard.projectPage.getProjectName(),
				locationURI,
				wizard.getComponentVersionDescription().getComponentName(),
				wizard.getComponentVersionDescription().getComponentVersion(),
				wizard.getComponentVersionDescription().getComponentAlias(),
				wizard.isJavaProject(),
				wizard.getAdditionalMavenDependencies(),
				monitor );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.FinishServiceCreationStrategy
	 * #getSUProject(com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IProject getSUProject( AbstractServiceUnitWizard wizard, IProgressMonitor monitor ) {

		if (this.project == null) {
			try {
				createProject(wizard, monitor);
			} catch (Exception ex) {
				PetalsServicesPlugin.log(ex, IStatus.ERROR);
			}
		}

		return this.project;
	}
}
