/******************************************************************************
 * Copyright (c) 2012-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.eip.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition;
import com.linagora.petals.services.cdk.editor.CDK5JBIEndpointUIHelper;
import com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;
import com.linagora.petals.services.su.editor.su.JBIEndpointUIHelpers;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class EipConsumesEditorContribution extends JbiEditorDetailsContribution {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution
	 * #addMainSUContent(com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.ui.forms.widgets.FormToolkit,
	 * org.eclipse.swt.widgets.Composite, com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition)
	 */
	@Override
	public void addMainSUContent(final AbstractEndpoint endpoint, FormToolkit toolkit, final Composite mainTab, ISharedEdition ise) {
		Composite composite = createCommonConsumeSection( mainTab, toolkit );
		JBIEndpointUIHelpers.createCommonEndpointUI( endpoint, toolkit, composite, ise );
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
		CDK5JBIEndpointUIHelper.generateDefaultCdkWidgetsForConsumesEditor( endpoint, toolkit, composite, ise );
	}
}
