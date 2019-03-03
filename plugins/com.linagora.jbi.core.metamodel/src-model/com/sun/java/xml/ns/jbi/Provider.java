/******************************************************************************
 * Copyright (c) 2009-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.sun.java.xml.ns.jbi;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sun.java.xml.ns.jbi.Provider#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link com.sun.java.xml.ns.jbi.Provider#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sun.java.xml.ns.jbi.JbiPackage#getProvider()
 * @model extendedMetaData="name='Provider' kind='empty'"
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Name</em>' attribute.
	 * @see #setEndpointName(String)
	 * @see com.sun.java.xml.ns.jbi.JbiPackage#getProvider_EndpointName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='endpoint-name'"
	 * @generated
	 */
	String getEndpointName();

	/**
	 * Sets the value of the '{@link com.sun.java.xml.ns.jbi.Provider#getEndpointName <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Name</em>' attribute.
	 * @see #getEndpointName()
	 * @generated
	 */
	void setEndpointName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(QName)
	 * @see com.sun.java.xml.ns.jbi.JbiPackage#getProvider_ServiceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='service-name'"
	 * @generated
	 */
	QName getServiceName();

	/**
	 * Sets the value of the '{@link com.sun.java.xml.ns.jbi.Provider#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(QName value);

} // Provider
