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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sun.java.xml.ns.jbi.Connection#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link com.sun.java.xml.ns.jbi.Connection#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sun.java.xml.ns.jbi.JbiPackage#getConnection()
 * @model extendedMetaData="name='Connection' kind='elementOnly'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference.
	 * @see #setConsumer(Consumer)
	 * @see com.sun.java.xml.ns.jbi.JbiPackage#getConnection_Consumer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consumer' namespace='##targetNamespace'"
	 * @generated
	 */
	Consumer getConsumer();

	/**
	 * Sets the value of the '{@link com.sun.java.xml.ns.jbi.Connection#getConsumer <em>Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' containment reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(Consumer value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Provider)
	 * @see com.sun.java.xml.ns.jbi.JbiPackage#getConnection_Provider()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link com.sun.java.xml.ns.jbi.Connection#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

} // Connection
