/******************************************************************************
 * Copyright (c) 2008-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.soap.v40;

import com.linagora.petals.services.soap.soap.SoapPackage;
import com.linagora.petals.services.soap.soap.SoapVersion;
import com.linagora.petals.services.su.extensions.SuWizardSettings;
import com.linagora.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class SoapProvidesWizardPage40 extends SimpleFeatureListSuWizardPage {

	private String oldSoapVersion, oldSoapAddress;


	/**
	 * Constructor.
	 */
	public SoapProvidesWizardPage40() {
		super(
			SoapPackage.Literals.SOAP_PROVIDES__ADDRESS,
			SoapPackage.Literals.SOAP_PROVIDES__SOAP_VERSION,
			SoapPackage.Literals.SOAP_PROVIDES__CHUNKED_MODE,
			SoapPackage.Literals.SOAP_PROVIDES__SYNCHONOUS_TIMEOUT,
			SoapPackage.Literals.SOAP_PROVIDES__CLEANUP_TRANSPORT,
			SoapPackage.Literals.SOAP_PROVIDES__SYNCHONOUS_TIMEOUT
			);
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #setVisible(boolean)
	 */
	@Override
	public void setVisible( boolean visible ) {

		if( visible ) {
			boolean refresh = false;
			SuWizardSettings settings = getWizard().getSettings();
			if( this.oldSoapAddress == null || ! this.oldSoapAddress.equals( settings.soapAddress )) {
				this.oldSoapAddress = settings.soapAddress;
				refresh = true;
			}

			if( this.oldSoapVersion == null || ! this.oldSoapVersion.equals( settings.soapVersion )) {
				this.oldSoapVersion = settings.soapVersion;
				refresh = true;
			}

			if( refresh ) {
				getNewlyCreatedEndpoint().eSet( SoapPackage.Literals.SOAP_PROVIDES__ADDRESS, settings.soapAddress );
				SoapVersion soapVersion = null;
				if( "1.1".equals( settings.soapVersion ))
					soapVersion = SoapVersion.SOAP_11;
				else if( "1.2".equals( settings.soapVersion ))
					soapVersion = SoapVersion.SOAP_12;

				getNewlyCreatedEndpoint().eSet( SoapPackage.Literals.SOAP_PROVIDES__SOAP_VERSION, soapVersion );
			}
		}

		super.setVisible( visible );
	}
}
