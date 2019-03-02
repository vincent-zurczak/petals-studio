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
 
package com.linagora.petals.services.soap.v41;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.linagora.petals.common.internal.provisional.emf.EObjectUIHelper;
import com.linagora.petals.common.internal.provisional.utils.SwtFactory;
import com.linagora.petals.services.soap.soap.SoapPackage;
import com.linagora.petals.services.soap.soap.SoapVersion;
import com.linagora.petals.services.su.extensions.SuWizardSettings;
import com.linagora.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class SoapProvidesWizardPage41 extends SimpleFeatureListSuWizardPage {

	private String oldSoapVersion, oldSoapAddress;


	/**
	 * Constructor.
	 */
	public SoapProvidesWizardPage41() {
		this(
			SoapPackage.Literals.SOAP_PROVIDES__ADDRESS,
			SoapPackage.Literals.SOAP_PROVIDES__SOAP_VERSION,
			SoapPackage.Literals.SOAP_PROVIDES__CHUNKED_MODE,
			SoapPackage.Literals.SOAP_PROVIDES__CLEANUP_TRANSPORT,
			SoapPackage.Literals.SOAP_PROVIDES__MODE
			);
	}
	
	protected SoapProvidesWizardPage41(EStructuralFeature... features) {
		super(features);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage
	 * #createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.dbc = new DataBindingContext();

		Composite res = new Composite(parent, SWT.NONE);
		SwtFactory.applyNewGridLayout( res, 2, false, 15, 15, 0, 15 );
		setControl(res);

		FormToolkit tk = new FormToolkit(getShell().getDisplay());
		EObjectUIHelper.generateWidgets(getNewlyCreatedEndpoint(), tk, res, null, this.dbc, false,
			SoapPackage.Literals.SOAP_PROVIDES__ADDRESS,
			SoapPackage.Literals.SOAP_PROVIDES__SOAP_VERSION,
			SoapPackage.Literals.SOAP_PROVIDES__CHUNKED_MODE,
			SoapPackage.Literals.SOAP_PROVIDES__CLEANUP_TRANSPORT );
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
			if( this.oldSoapAddress == null || this.oldSoapAddress.equals( settings.soapAddress )) {
				this.oldSoapAddress = settings.soapAddress;
				refresh = true;
			}

			if( this.oldSoapVersion == null || this.oldSoapVersion.equals( settings.soapVersion )) {
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
