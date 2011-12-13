/****************************************************************************
 *
 * Copyright (c) 2008-2011, EBM WebSourcing
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/

package com.ebmwebsourcing.petals.services.su.wizards;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.IoUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.ResourceUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlImportUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlUtils;
import com.ebmwebsourcing.petals.services.PetalsServicesPlugin;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler.CustomPagePosition;
import com.ebmwebsourcing.petals.services.su.extensions.SuWizardSettings;
import com.ebmwebsourcing.petals.services.su.wizards.pages.JbiConsumePage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.JbiProvidePage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.ProjectPage;
import com.ebmwebsourcing.petals.services.utils.PetalsServicesProjectUtils;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Consumes;
import com.sun.java.xml.ns.jbi.Jbi;
import com.sun.java.xml.ns.jbi.JbiFactory;
import com.sun.java.xml.ns.jbi.Provides;
import com.sun.java.xml.ns.jbi.util.JbiResourceFactoryImpl;

/**
 * The specialized wizard for the Petals service units.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ComponentCreationWizard extends Wizard {

	/**
	 * The Petals mode associated with this instance of the wizard.
	 */
	private PetalsMode petalsMode;

	/**
	 * The instance of the JBI object model.
	 */
	private Jbi jbiInstance;
	private AbstractEndpoint endpoint;

	/**
	 * The wizard handler for the selected component version.
	 */
	private ComponentWizardHandler wizardHandler;

	private ProjectPage projectPage;

	private JbiProvidePage jbiProvidePage;



	/**
	 * Constructor.
	 */
	public ComponentCreationWizard(ComponentWizardHandler wizardHandler, PetalsMode petalsMode) {
		super();
		this.petalsMode = petalsMode;
		this.wizardHandler = wizardHandler;
		setNeedsProgressMonitor( true );
		setForcePreviousAndNextButtons( true );
		setDefaultPageImageDescriptor( PetalsServicesPlugin.getImageDescriptor( "icons/wizban/wiz_service_unit.png" ));
		initializeJbiAndEndpoint(petalsMode);
		setDialogSettings(new DialogSettings(this.getClass().getName()));
	}

	public void initializeJbiAndEndpoint(PetalsMode petalsMode) {
		jbiInstance = JbiFactory.eINSTANCE.createJbi();
		jbiInstance.setVersion(new BigDecimal("1.0"));
		jbiInstance.setServices(JbiFactory.eINSTANCE.createServices());
		if (petalsMode == PetalsMode.consumes) {
			endpoint = JbiFactory.eINSTANCE.createConsumes();
			jbiInstance.getServices().getConsumes().add((Consumes)endpoint);
		} else if (petalsMode == PetalsMode.provides) {
			endpoint = JbiFactory.eINSTANCE.createProvides();
			jbiInstance.getServices().getProvides().add((Provides)endpoint);
		}
		wizardHandler.predefineJbiValues(endpoint);
	}

	@Override
	public void addPage(IWizardPage page) {
		super.addPage(page);
		page.setWizard(this);
	}
	
	/**
	 * Adds the first page of the wizard.
	 */
	@Override
	public void addPages() {
		for (IWizardPage page : wizardHandler.getCustomWizardPages(CustomPagePosition.beforeProjectPage)) {
			addPage(page);
		}
		projectPage = new ProjectPage();
		addPage(projectPage);
		for (IWizardPage page : wizardHandler.getCustomWizardPages(CustomPagePosition.afterProjectPage)) {
			addPage(page);
		}
		if (petalsMode == PetalsMode.consumes) {
			addPage(new JbiConsumePage());
		} else if (petalsMode == PetalsMode.provides) {
			jbiProvidePage = new JbiProvidePage();
			addPage(jbiProvidePage);
		}
		for (IWizardPage page : wizardHandler.getCustomWizardPages(CustomPagePosition.afterProjectPage)) {
			addPage(page);
		}		
	}



	/**
	 * Creates the Petals project and selects and open the required elements.
	 */
	@Override
	public boolean performFinish() {

		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject( projectPage.getProjectName());
		final List<Object> elementsToSelect = new ArrayList<Object> ();

		// Define the wizard completion process
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			@Override
			protected void execute( IProgressMonitor monitor )
			throws CoreException, InterruptedException {
				try {
					doFinish( elementsToSelect, monitor );

				} catch( Exception e ) {
					PetalsServicesPlugin.log( e, IStatus.ERROR );

				} finally {
					project.refreshLocal( IResource.DEPTH_INFINITE, null );
					monitor.done();
				}
			}
		};

		// Run it and perform the UI actions
		try {
			// Run the operation.
			getContainer().run( true, false, op );

			// Open the jbi.xml?
			// Do not open it in the WorkspaceModifyOperation
			// The project viewer must be updated before selecting anything in it
			final IFile jbiXmlFile = project.getFile( PetalsConstants.LOC_JBI_FILE );
			if( getDialogSettings().getBoolean( SuWizardSettings.OPEN_JBI_XML )) {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IDE.openEditor( page, jbiXmlFile );
					elementsToSelect.add( jbiXmlFile );

				} catch( PartInitException e ) {
					PetalsServicesPlugin.log( e, IStatus.ERROR );
				}
			}

			// Update the selection
			ResourceUtils.selectResourceInPetalsExplorer( true, elementsToSelect );

		} catch( InterruptedException e ) {
			// nothing

		} catch( Exception e ) {
			PetalsServicesPlugin.log( e, IStatus.ERROR );
		}

		return true;
	}


	/**
	 * Creates the project.
	 * @param elementsToSelect the elements to select (not null)
	 * @param monitor the progress monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	private void doFinish( final List<Object> elementsToSelect, final IProgressMonitor monitor ) throws CoreException, IOException {

		// Create the SU project
		monitor.beginTask( "", IProgressMonitor.UNKNOWN );
		monitor.subTask( "Creating the project structure..." );

		URI locationURI = projectPage.isAtDefaultlocation() ? null : projectPage.computeProjectLocation().toURI();
		IProject project = PetalsServicesProjectUtils.createSuProject(
				projectPage.getProjectName(),
				locationURI,
				this.wizardHandler.getComponentVersionDescription().getComponentName(),
				this.wizardHandler.getComponentVersionDescription().getComponentVersion(),
				this.wizardHandler.getComponentVersionDescription().getComponentAlias(),
				this.wizardHandler.isJavaProject(),
				monitor );


		// Import the WSDL and update the jbi.xml file in consequence
		final IFolder resourceDirectory = project.getFolder( PetalsConstants.LOC_RES_FOLDER );
		final File jbiXmlFile = project.getFile( PetalsConstants.LOC_JBI_FILE ).getLocation().toFile();
		File wsdlFile = null;
		if( petalsMode == PetalsMode.provides) {
			monitor.subTask( "Importing the WSDL..." );

			String wsdlFileLocation = jbiProvidePage.getWsdlUrl();
			if( jbiProvidePage.isImportWsdl() && wsdlFileLocation != null ) {
				WsdlImportUtils wsdlImportUtils = new WsdlImportUtils();
				Map<String,File> fileToUrl = wsdlImportUtils.importWsdlOrXsdAndDependencies( resourceDirectory.getLocation().toFile(), jbiProvidePage.getWsdlUrl());
				wsdlFile = fileToUrl.get( jbiProvidePage.getWsdlUrl());
				wsdlFileLocation = IoUtils.getRelativeLocationToFile( jbiXmlFile, wsdlFile );
			}

			// TODO: set the WSDL URL
			monitor.worked( 1 );
		}


		// Import the files that need to be imported - done by the contributor
		monitor.subTask( "Importing files..." );
		this.wizardHandler.performActionsBeforeWrittingJbiXml( resourceDirectory, this.jbiInstance, monitor );
		monitor.worked( 1 );


		// Update the end-point in the WSDL file?
		if( petalsMode == PetalsMode.provides) {
			if( wsdlFile == null ) {
				PetalsServicesPlugin.log( "A WSDL file was expected but none was found.", IStatus.WARNING );

			} else {
				monitor.subTask( "Updating the WSDL..." );
				AbstractEndpoint ae = getNewlyCreatedEndpoint();
				WsdlUtils.INSTANCE.updateEndpointNameInWsdl( wsdlFile, ae.getServiceName(), ae.getEndpointName());
				monitor.worked( 1 );
			}
		}


		// Create the jbi.xml file
		monitor.subTask( "Creating the jbi.xml..." );
		org.eclipse.emf.common.util.URI emfUri = org.eclipse.emf.common.util.URI.createFileURI( jbiXmlFile.getAbsolutePath());
		Resource resource = new JbiResourceFactoryImpl().createResource( emfUri );
		resource.getContents().add( this.jbiInstance );
		resource.save( Collections.EMPTY_MAP );
		monitor.worked( 1 );


		// Perform the last actions
		monitor.subTask( "Performing extra-actions..." );
		try {
			getShell().getDisplay().syncExec( new Runnable() {
				@Override
				public void run() {

					try {
						resourceDirectory.refreshLocal( IResource.DEPTH_INFINITE, monitor );
						wizardHandler.performLastActions(
								 resourceDirectory, getNewlyCreatedEndpoint(),
								 monitor, elementsToSelect );

					} catch( CoreException e ) {
						PetalsServicesPlugin.log( e, IStatus.ERROR );
					}
				}
			});

		} catch( Exception e ) {
			PetalsServicesPlugin.log( e, IStatus.ERROR );

		} finally {
			project.refreshLocal( IResource.DEPTH_INFINITE, monitor );
			monitor.worked( 1 );
		}
	}


	/**
	 * @return true if this wizard defines a service provider, false for a consumer
	 */
	public PetalsMode getComponentMode() {
		return this.petalsMode;
	}


	/**
	 * @return the componentVersionDescription
	 */
	public ComponentWizardHandler getWizardHandler() {
		return this.wizardHandler;
	}


	/**
	 * @return the first provides or consumes block (not null)
	 */
	public AbstractEndpoint getNewlyCreatedEndpoint() {
		return endpoint;
	}

	public PetalsMode getPetalsMode() {
		return this.petalsMode;
	}

}