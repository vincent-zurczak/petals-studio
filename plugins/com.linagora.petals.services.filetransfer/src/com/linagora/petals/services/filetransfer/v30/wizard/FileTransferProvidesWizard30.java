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
 
package com.linagora.petals.services.filetransfer.v30.wizard;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.linagora.petals.services.cdk.Cdk5Utils;
import com.linagora.petals.services.cdk.cdk5.Cdk5Package;
import com.linagora.petals.services.filetransfer.filetransfer3.Filetransfer3Package;
import com.linagora.petals.services.filetransfer.generated.FileTransferService;
import com.linagora.petals.services.filetransfer.v30.FileTransferDescription30;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.linagora.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.linagora.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Provides;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 * @author Mickaël Istria - EBM WebSourcing
 */
public class FileTransferProvidesWizard30 extends AbstractServiceUnitWizard {

	/**
	 * Constructor.
	 */
	public FileTransferProvidesWizard30() {
		super();
		this.settings.showWsdl = false;
		this.settings.activateInterfaceName = false;
		this.settings.activateServiceNameOnly = true;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new FileTransferDescription30();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #predefineJbiValues(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	public void presetServiceValues( AbstractEndpoint ae ) {
		ae.setInterfaceName(new QName("http://petals.ow2.org/components/filetransfer/version-3", "FileTransferType"));
		ae.setServiceName( new QName( "http://petals.ow2.org/components/filetransfer/version-3", "change-it" ));
		Cdk5Utils.setInitialProvidesValues((Provides)ae);
		ae.eSet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL, "FileTransferService.wsdl");
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {
		IFile wsdlFile = resourceFolder.getFile( "FileTransferService.wsdl" );
		createFile( wsdlFile, new FileTransferService().generate( abstractEndpoint ), monitor );
		return Status.OK_STATUS;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getLastCustomWizardPages()
	 */
	@Override
	protected AbstractSuWizardPage[] getLastCustomWizardPages() {
		return new AbstractSuWizardPage[] { new SimpleFeatureListSuWizardPage(
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__FOLDER,
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__BACKUP_DIRECTORY,
				Filetransfer3Package.Literals.FILE_TRANSFER3_PROVIDES__FILENAME
		)};
	}
}
