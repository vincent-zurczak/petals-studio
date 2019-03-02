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
 
package com.linagora.petals.services.validation.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.linagora.petals.common.internal.provisional.emf.EObjectUIHelper;
import com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition;
import com.linagora.petals.common.internal.provisional.swt.TextWithButtonComposite;
import com.linagora.petals.common.internal.provisional.utils.SwtFactory;
import com.linagora.petals.services.cdk.editor.CDK5JBIEndpointUIHelper;
import com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;
import com.linagora.petals.services.validation.validation.ValidationPackage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class ValidationProvidesEditorContribution extends JbiEditorDetailsContribution {

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

		composite = createEditorSection( mainTab, toolkit, "Validation Parameters", true );
		createLabel( toolkit, composite, "XML Schema *:", "Relative path to the XSD File");

		IFile jbiXmlFile = ise.getEditedFile();
		TextWithButtonComposite browser = SwtFactory.createWorkspaceFileBrowser( composite, jbiXmlFile.getParent(), jbiXmlFile, "XSD" );
		browser.setLayoutData( new GridData(SWT.FILL, SWT.DEFAULT, true, false));
		ise.getDataBindingContext().bindValue(SWTObservables.observeText(browser.getText(), SWT.Modify),
		EObjectUIHelper.createCustomEmfEditObservable( ise.getEditingDomain(), endpoint, ValidationPackage.Literals.VALIDATION_PROVIDES__SCHEMA ));
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution
	 * #addAdvancedSUContent(com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.ui.forms.widgets.FormToolkit,
	 * org.eclipse.swt.widgets.Composite, com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition)
	 */
	@Override
	public void addAdvancedSUContent(AbstractEndpoint endpoint, FormToolkit toolkit, Composite advancedTab, ISharedEdition ise) {

		Composite composite = createEditorSection( advancedTab, toolkit, "CDK Parameters" );
		CDK5JBIEndpointUIHelper.generateDefaultCdkWidgetsForProvidesEditor( endpoint, toolkit, composite, ise );
	}
}
