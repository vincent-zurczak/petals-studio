/******************************************************************************
 * Copyright (c) 2012-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.soap.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.linagora.petals.common.internal.provisional.emf.EObjectUIHelper;
import com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition;
import com.linagora.petals.services.cdk.editor.CDK5JBIEndpointUIHelper;
import com.linagora.petals.services.soap.soap.SoapPackage;
import com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class SoapProvidesEditorContribution extends JbiEditorDetailsContribution {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution
	 * #addMainSUContent(com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.ui.forms.widgets.FormToolkit,
	 * org.eclipse.swt.widgets.Composite, com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition)
	 */
	@Override
	public void addMainSUContent( final AbstractEndpoint endpoint, FormToolkit toolkit, final Composite mainTab, ISharedEdition ise ) {

		Composite composite = createCommonProvideSection( mainTab, toolkit );
		CDK5JBIEndpointUIHelper.createProvidesUI(endpoint, toolkit, composite, ise);

		composite = createEditorSection( mainTab, toolkit, "SOAP Parameters", true );
		EObjectUIHelper.generateEditorWidgets(
				endpoint,
				toolkit,
				composite,
				ise.getEditingDomain(),
				ise.getDataBindingContext(),
				true,
				SoapPackage.Literals.SOAP_PROVIDES__ADDRESS,
				SoapPackage.Literals.SOAP_PROVIDES__SOAP_VERSION);
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution
	 * #addAdvancedSUContent(com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.ui.forms.widgets.FormToolkit,
	 * org.eclipse.swt.widgets.Composite, com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition)
	 */
	@Override
	public void addAdvancedSUContent(AbstractEndpoint endpoint, FormToolkit toolkit, Composite advancedTab, ISharedEdition ise) {

		Composite composite = createEditorSection( advancedTab, toolkit, "Miscellaneous" );
		EObjectUIHelper.generateEditorWidgets(endpoint, toolkit, composite, ise.getEditingDomain(), ise.getDataBindingContext(), true,
					SoapPackage.Literals.SOAP_PROVIDES__CHUNKED_MODE,
					SoapPackage.Literals.SOAP_PROVIDES__CLEANUP_TRANSPORT,
					SoapPackage.Literals.SOAP_PROVIDES__HTTP_BASIC_AUTH_USERNAME,
					SoapPackage.Literals.SOAP_PROVIDES__HTTP_BASIC_AUTH_PASSWORD,
					SoapPackage.Literals.SOAP_PROVIDES__ENABLE_COMPATIBILITY_FOR);

		// Not described in the XML schema, and not detailed on the wiki
//		composite = createEditorSection( advancedTab, toolkit, "SOAP Headers" );
//		EObjectUIHelper.generateWidgets(endpoint, toolkit, composite, ise.getEditingDomain(), ise.getDataBindingContext(), true,
//					SoapPackage.Literals.SOAP_PROVIDES__HEADERS_FILTER,
//					SoapPackage.Literals.SOAP_PROVIDES__INJECT_HEADERS,
//					SoapPackage.Literals.SOAP_PROVIDES__HEADERS_TO_INJECT);

		composite = createEditorSection( advancedTab, toolkit, "Proxy Settings" );
		EObjectUIHelper.generateEditorWidgets(endpoint, toolkit, composite, ise.getEditingDomain(), ise.getDataBindingContext(), true,
					SoapPackage.Literals.SOAP_PROVIDES__PROXY_HOST,
					SoapPackage.Literals.SOAP_PROVIDES__PROXY_PORT,
					SoapPackage.Literals.SOAP_PROVIDES__PROXY_USER,
					SoapPackage.Literals.SOAP_PROVIDES__PROXY_PASSWORD,
					SoapPackage.Literals.SOAP_PROVIDES__PROXY_DOMAIN);

		composite = createEditorSection( advancedTab, toolkit, "HTTPS" );
		EObjectUIHelper.generateEditorWidgets(endpoint, toolkit, composite, ise.getEditingDomain(), ise.getDataBindingContext(), true,
					SoapPackage.Literals.SOAP_PROVIDES__HTTPS_KEYSTORE_FILE,
					SoapPackage.Literals.SOAP_PROVIDES__HTTPS_KEYSTORE_PASSWORD,
					SoapPackage.Literals.SOAP_PROVIDES__HTTPS_TRUSTSTORE_FILE,
					SoapPackage.Literals.SOAP_PROVIDES__HTTPS_TRUSTSTORE_PASSWORD );

		// Not described in the XML schema, and not detailed on the wiki
//		composite = createEditorSection( advancedTab, toolkit, "WS-Addressing" );
//		EObjectUIHelper.generateWidgets(endpoint, toolkit, composite, ise.getEditingDomain(), ise.getDataBindingContext(), true,
//					SoapPackage.Literals.SOAP_PROVIDES__ENABLE_WSA,
//					SoapPackage.Literals.SOAP_PROVIDES__WSA_FROM,
//					SoapPackage.Literals.SOAP_PROVIDES__WSA_REPLY_TO,
//					SoapPackage.Literals.SOAP_PROVIDES__WSA_FAULT_TO);

		composite = createEditorSection( advancedTab, toolkit, "CDK Parameters" );
		CDK5JBIEndpointUIHelper.generateDefaultCdkWidgetsForProvidesEditor( endpoint, toolkit, composite, ise );
	}
}
