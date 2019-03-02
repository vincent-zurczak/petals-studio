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

package com.ebmwebsourcing.petals.services.flowable.v1x;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.IoUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.services.cdk.Cdk5Utils;
import com.ebmwebsourcing.petals.services.cdk.cdk5.Cdk5Package;
import com.ebmwebsourcing.petals.services.flowable.FlowableDescription12;
import com.ebmwebsourcing.petals.services.flowable.PetalsFlowablePlugin;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.ebmwebsourcing.petals.services.su.wizards.CreateJBIStrategy;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Provides;

/**
 * @author Vincent Zurczak - Linagora
 */
public class FlowableWizard1x extends AbstractServiceUnitWizard {
	private FlowablePage1x flowablePage;


	/**
	 * Constructor.
	 */
	public FlowableWizard1x() {
		super();
		this.settings.showWsdl = false;
		this.settings.openJbiEditor = false;
		this.settings.activateServiceNameOnly = true;
	}


	@Override
	protected AbstractSuWizardPage[] getLastCustomWizardPages() {

		AbstractSuWizardPage[] result = super.getCustomWizardPagesBeforeJbi();
		if( ! this.usedInEditor ) {
			this.flowablePage = new FlowablePage1x();
			 result = new AbstractSuWizardPage[] { this.flowablePage };
		}

		return result;
	}


	@Override
	public void presetServiceValues( AbstractEndpoint abstractEndpoint ) {
		Cdk5Utils.setInitialProvidesValues((Provides) abstractEndpoint);
		if( ! this.usedInEditor ) {
			abstractEndpoint.eSet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL, "process.wsdl");
		}
	}


	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new FlowableDescription12();
	}


	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performFinish()
	 */
	@Override
	public boolean performFinish() {
		if( ! this.usedInEditor ) {
			setStrategy( new FlowableJBIStrategy( this.flowablePage ));
		}

		return super.performFinish();
	}


	@Override
	protected IStatus performLastActions( IFolder resourceDirectory, AbstractEndpoint newlyCreatedEndpoint, IProgressMonitor monitor ) {

		// Generate resources
		IStatus result = Status.OK_STATUS;
		if( ! this.usedInEditor ) {
			try {
				// Generate the sample process
				IFile file = resourceDirectory.getFile( this.flowablePage.getProcessfile());
				if( ! file.exists())
					file.create( getClass().getResourceAsStream("process.bpmn_"), true, monitor);

				// Create a basic WSDL
				file = resourceDirectory.getFile("process.wsdl");
				if( ! file.exists()) {
					ByteArrayOutputStream os = new ByteArrayOutputStream();
					IoUtils.copyStream( getClass().getResourceAsStream("process.wsdl_"), os );
					String content = os.toString( "UTF-8" );
					content = content.replace( "%INTERFACE_NAMESPACE%", newlyCreatedEndpoint.getInterfaceName().getNamespaceURI());
					content = content.replace( "%INTERFACE_NAME%", newlyCreatedEndpoint.getInterfaceName().getLocalPart());
					content = content.replace( "%SERVICE_NAME%", newlyCreatedEndpoint.getServiceName().getLocalPart());
					content = content.replace( "%EDPT_NAME%", newlyCreatedEndpoint.getEndpointName());

					file.create( new ByteArrayInputStream( content.getBytes( StandardCharsets.UTF_8 )), true, monitor);
				}

			} catch( CoreException | IOException e ) {
				PetalsFlowablePlugin.log( e, IStatus.ERROR );
			}
		}

		return result;
	}


	/**
	 * @author Vincent Zurczak - Linagora
	 */
	private static class FlowableJBIStrategy extends CreateJBIStrategy {
		private final FlowablePage1x flowablePage;

		/**
		 * Constructor.
		 * @param flowablePage
		 */
		public FlowableJBIStrategy( FlowablePage1x flowablePage ) {
			this.flowablePage = flowablePage;
		}

		/* (non-Javadoc)
		 * @see com.ebmwebsourcing.petals.services.su.wizards.CreateJBIStrategy
		 * #finishWizard(com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard,
		 * com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor)
		 */
		@Override
		public void finishWizard( AbstractServiceUnitWizard wizard, AbstractEndpoint endpoint, IProgressMonitor monitor )
		throws Exception {

			// Use the same namespace for both the interface and service
			String uri = endpoint.getInterfaceName().getNamespaceURI();
			endpoint.setServiceName( new QName( uri, endpoint.getServiceName().getLocalPart()));

			// Perform the super task
			super.finishWizard( wizard, endpoint, monitor );

			// Load the jbi.xml file and update it
			final IFile jbiXmlFile = this.project.getFile( PetalsConstants.LOC_JBI_FILE );
			String content = IoUtils.readFileContent( jbiXmlFile );

			content = content.replace( "</jbi:services>", "\n    <!-- Flowable global stuff --></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-flowable:tenant_id>" + this.flowablePage.getTenantId() + "</petals-se-flowable:tenant_id></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-flowable:category_id>" + this.flowablePage.getCategoryId() + "</petals-se-flowable:category_id></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-flowable:process_file>" + this.flowablePage.getProcessfile() + "</petals-se-flowable:process_file></jbi:services>" );
			content = content.replace( "</jbi:services>", "\n    <petals-se-flowable:version>1</petals-se-flowable:version>\n  </jbi:services>" );
			content = content.replace( "xmlns:jbi", "xmlns:petals-se-flowable=\"http://petals.ow2.org/components/petals-se-flowable/1.0\" xmlns:jbi" );
			jbiXmlFile.setContents( new ByteArrayInputStream( content.getBytes( StandardCharsets.UTF_8 )), true, false, monitor );

			// Open the BPMN file
			final IFile bpmnFile = jbiXmlFile.getParent().getFile( new Path( this.flowablePage.getProcessfile()));
			final IEditorDescriptor editorDesc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor( bpmnFile.getName());
			wizard.getShell().getDisplay().syncExec( new Runnable() {
				@Override
				public void run() {
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						page.openEditor( new FileEditorInput( bpmnFile ), editorDesc.getId());

					} catch( PartInitException e ) {
						PetalsFlowablePlugin.log( e, IStatus.ERROR );
					}
				}
			});

			// Select it in the Petals project view
			wizard.getResourcesToSelect().add( bpmnFile );
		}
	}
}
