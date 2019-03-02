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
 
package com.linagora.petals.services.mail.v32;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.linagora.petals.services.mail.generated.MailService32;
import com.linagora.petals.services.mail.mail.MailPackage;
import com.linagora.petals.services.mail.v31.MailProvideWizard31;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.linagora.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class MailProvideWizard32 extends MailProvideWizard31 {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new MailDescription32();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {
		IFile wsdlFile = resourceFolder.getFile( "MailService.wsdl" );
		createFile( wsdlFile, new MailService32().generate( abstractEndpoint ), monitor );
		return Status.OK_STATUS;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.mail.wizards.MailProvideWizard31
	 * #presetServiceValues(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	public void presetServiceValues( AbstractEndpoint ae ) {
		super.presetServiceValues( ae );
		ae.eSet( MailPackage.Literals.MAIL_PROVIDES__CONTENT_TYPE, "text/plain" );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getLastCustomWizardPages()
	 */
	@Override
	protected AbstractSuWizardPage[] getLastCustomWizardPages() {
		return new AbstractSuWizardPage[] { new SimpleFeatureListSuWizardPage(
				MailPackage.Literals.MAIL_PROVIDES__SCHEME,
				MailPackage.Literals.MAIL_PROVIDES__HOST,
				MailPackage.Literals.MAIL_PROVIDES__PORT,
				MailPackage.Literals.MAIL_PROVIDES__USER,
				MailPackage.Literals.MAIL_PROVIDES__PASSWORD,
				MailPackage.Literals.MAIL_PROVIDES__FROM,
				MailPackage.Literals.MAIL_PROVIDES__TO,
				MailPackage.Literals.MAIL_PROVIDES__REPLY,
				MailPackage.Literals.MAIL_PROVIDES__SUBJECT,
				MailPackage.Literals.MAIL_PROVIDES__HELOHOST,
				MailPackage.Literals.MAIL_PROVIDES__SEND_MODE,
				MailPackage.Literals.MAIL_PROVIDES__CONTENT_TYPE)
		};
	}
}
