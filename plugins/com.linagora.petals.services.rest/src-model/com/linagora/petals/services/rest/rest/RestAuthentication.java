/**
 * Copyright (c) 2018, Linagora
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
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestAuthentication#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestAuthentication#getJwt <em>Jwt</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestAuthentication#getNtlm <em>Ntlm</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestAuthentication()
 * @model extendedMetaData="name='RestAuthentication' kind='elementOnly'"
 * @generated
 */
public interface RestAuthentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(RestBasicAuthentication)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestAuthentication_Basic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basic' namespace='##targetNamespace'"
	 * @generated
	 */
	RestBasicAuthentication getBasic();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getBasic <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(RestBasicAuthentication value);

	/**
	 * Returns the value of the '<em><b>Jwt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jwt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jwt</em>' containment reference.
	 * @see #setJwt(RestJwtAuthentication)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestAuthentication_Jwt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jwt' namespace='##targetNamespace'"
	 * @generated
	 */
	RestJwtAuthentication getJwt();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getJwt <em>Jwt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jwt</em>' containment reference.
	 * @see #getJwt()
	 * @generated
	 */
	void setJwt(RestJwtAuthentication value);

	/**
	 * Returns the value of the '<em><b>Ntlm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ntlm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ntlm</em>' containment reference.
	 * @see #setNtlm(RestNtlmAuthentication)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestAuthentication_Ntlm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ntlm' namespace='##targetNamespace'"
	 * @generated
	 */
	RestNtlmAuthentication getNtlm();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getNtlm <em>Ntlm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ntlm</em>' containment reference.
	 * @see #getNtlm()
	 * @generated
	 */
	void setNtlm(RestNtlmAuthentication value);

} // RestAuthentication
