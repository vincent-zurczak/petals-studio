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

package com.ebmwebsourcing.petals.services.camel.v1x;

import javax.xml.namespace.QName;

import com.ebmwebsourcing.petals.services.camel.camel.CamelPackage;
import com.ebmwebsourcing.petals.services.cdk.Cdk5Utils;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Consumes;

/**
 * @author Vincent Zurczak - Linagora
 */
public class CamelConsumesWizard1x extends CamelWizard1x {

	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #predefineJbiValues(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	public void presetServiceValues( AbstractEndpoint abstractEndpoint ) {
		Cdk5Utils.setInitialConsumesValues((Consumes) abstractEndpoint);
		abstractEndpoint.eSet( CamelPackage.Literals.CAMEL_CONSUMES__SERVICE_ID, "my-service-alias-for-camel" );
	}


	@Override
	protected void postSetEndpointProperties( AbstractEndpoint abstractEndpoint ) {
		abstractEndpoint.setInterfaceName( new QName( "http://petals.ow2.org", "HelloInterface2" ));
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getLastCustomWizardPages()
	 */
	@Override
	protected AbstractSuWizardPage[] getLastCustomWizardPages() {
		return new AbstractSuWizardPage[] { new SimpleFeatureListSuWizardPage(
			CamelPackage.Literals.CAMEL_CONSUMES__SERVICE_ID
		)};
	}
}
