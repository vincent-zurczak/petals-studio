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

package com.linagora.petals.services.cdk;

import org.eclipse.emf.ecore.xml.type.internal.QName;

import com.linagora.petals.common.generation.Mep;
import com.linagora.petals.services.cdk.cdk5.Cdk5Package;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Consumes;
import com.sun.java.xml.ns.jbi.Provides;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public final class Cdk5Utils {

	/**
	 * Private constructor for utility class.
	 */
	private Cdk5Utils() {
		// nothing
	}


	/**
	 * Initializes a provide block.
	 * @param provides
	 */
	public static void setInitialProvidesValues(Provides provides) {
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__TIMEOUT, 30000);
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__VALIDATE_WSDL, true);
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__FORWARD_SECURITY_SUBJECT, false);
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__FORWARD_MESSAGE_PROPERTIES, false);
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__FORWARD_ATTACHMENTS, false);
		provides.eSet(Cdk5Package.Literals.CDK5_PROVIDES__WSDL, null);
	}


	/**
	 * Initializes a consume block.
	 * <p>
	 * Be careful, the operation is set here.
	 * If it should not be written, it should be set to null.
	 * </p>
	 *
	 * @param consumes
	 */
	public static void setInitialConsumesValues(Consumes consumes) {
		consumes.eSet( Cdk5Package.Literals.CDK5_CONSUMES__TIMEOUT, 30000 );
		consumes.eSet( Cdk5Package.Literals.CDK5_CONSUMES__OPERATION, new QName( "workaround" ));
		consumes.eSet( Cdk5Package.Literals.CDK5_CONSUMES__MEP, null );
	}


	/**
	 * Sets the appropriate MEP value.
	 * @param ae
	 * @param mep
	 */
	public static void setMep( AbstractEndpoint ae, Mep mep ) {
		if( mep == null || mep == Mep.UNKNOWN )
			ae.eSet( Cdk5Package.Literals.CDK5_CONSUMES__MEP, null );
		else
			ae.eSet( Cdk5Package.Literals.CDK5_CONSUMES__MEP, String.valueOf( mep ));
	}
}
