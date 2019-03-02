/**
 * Copyright (c) 2019, Linagora
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     EBM WebSourcing - initial API and implementation
 */
package com.linagora.petals.services.camel.camel;

import com.sun.java.xml.ns.jbi.Consumes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.camel.camel.CamelConsumes#getServiceId <em>Service Id</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.camel.camel.CamelPackage#getCamelConsumes()
 * @model extendedMetaData="name=''"
 * @generated
 */
public interface CamelConsumes extends Consumes {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short alias to designate a Petals service in a Camel route
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see com.linagora.petals.services.camel.camel.CamelPackage#getCamelConsumes_ServiceId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='service-id' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.camel.camel.CamelConsumes#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

} // CamelConsumes
