/**
 * Copyright (c) 2018-2019, Linagora
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     EBM WebSourcing - initial API and implementation
 */
package com.linagora.petals.services.rest.rest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ntlm Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getUsername <em>Username</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getPassword <em>Password</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestNtlmAuthentication()
 * @model extendedMetaData="name='RestNtlmAuthentication' kind='elementOnly'"
 * @generated
 */
public interface RestNtlmAuthentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' containment reference.
	 * @see #setUsername(RestProperty)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestNtlmAuthentication_Username()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='username' namespace='##targetNamespace'"
	 * @generated
	 */
	RestProperty getUsername();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getUsername <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' containment reference.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(RestProperty value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(RestProperty)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestNtlmAuthentication_Password()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	RestProperty getPassword();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(RestProperty value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(RestProperty)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestNtlmAuthentication_Domain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	RestProperty getDomain();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RestProperty value);

} // RestNtlmAuthentication
