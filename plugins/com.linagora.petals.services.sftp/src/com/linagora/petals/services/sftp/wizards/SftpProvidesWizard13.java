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
 
package com.linagora.petals.services.sftp.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.linagora.petals.services.sftp.SftpDescription13;
import com.linagora.petals.services.sftp.generated.SftpService13;
import com.linagora.petals.services.sftp.sftp.SftpPackage;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.linagora.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 * @author Mickaël Istria - EBM WebSourcing
 */
public class SftpProvidesWizard13 extends SftpProvidesWizard12 {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new SftpDescription13();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {
		IFile wsdlFile = resourceFolder.getFile( "SftpService.wsdl" );
		createFile( wsdlFile, new SftpService13().generate( abstractEndpoint ), monitor );
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
				SftpPackage.Literals.SFTP_PROVIDES__SERVER,
				SftpPackage.Literals.SFTP_PROVIDES__PORT,
				SftpPackage.Literals.SFTP_PROVIDES__USER,
				SftpPackage.Literals.SFTP_PROVIDES__PASSWORD,
				SftpPackage.Literals.SFTP_PROVIDES__PRIVATEKEY,
				SftpPackage.Literals.SFTP_PROVIDES__PASSPHRASE,
				SftpPackage.Literals.SFTP_PROVIDES__FOLDER,
				SftpPackage.Literals.SFTP_PROVIDES__MAX_IDLE_TIME,
				SftpPackage.Literals.SFTP_PROVIDES__OVERWRITE,
				SftpPackage.Literals.SFTP_PROVIDES__MAX_CONNECTION )
		};
	}
}
