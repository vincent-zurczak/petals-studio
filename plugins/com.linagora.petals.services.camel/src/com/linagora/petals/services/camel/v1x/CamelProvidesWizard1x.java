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

package com.linagora.petals.services.camel.v1x;

import javax.xml.namespace.QName;

import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;
import com.linagora.petals.services.cdk.cdk5.Cdk5Package;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Vincent Zurczak - Linagora
 */
public class CamelProvidesWizard1x extends CamelWizard1x {

	@Override
	protected void presetServiceValues( AbstractEndpoint endpoint ) {
		endpoint.eSet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL, null);
	}

	@Override
	protected void postSetEndpointProperties( AbstractEndpoint abstractEndpoint ) {

		abstractEndpoint.eSet( Cdk5Package.Literals.CDK5_PROVIDES__WSDL, "route.wsdl" );
		abstractEndpoint.setInterfaceName( new QName( "http://petals.ow2.org", "HelloInterface" ));
		abstractEndpoint.setServiceName( new QName( "http://petals.ow2.org", "HelloService" ));
		abstractEndpoint.setEndpointName( PetalsConstants.AUTO_GENERATE );
	}
}
