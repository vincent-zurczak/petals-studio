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
 * A representation of the model object '<em><b>On Jbi Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnOut <em>On Out</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnFault <em>On Fault</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnError <em>On Error</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultOut <em>On Default Out</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultError <em>On Default Error</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultFault <em>On Default Fault</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse()
 * @model extendedMetaData="name='OnJbiResponse' kind='elementOnly'"
 * @generated
 */
public interface OnJbiResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>On Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Out</em>' containment reference.
	 * @see #setOnOut(Condition)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnOut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-out' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getOnOut();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnOut <em>On Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Out</em>' containment reference.
	 * @see #getOnOut()
	 * @generated
	 */
	void setOnOut(Condition value);

	/**
	 * Returns the value of the '<em><b>On Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Fault</em>' containment reference.
	 * @see #setOnFault(Condition)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnFault()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-fault' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getOnFault();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnFault <em>On Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Fault</em>' containment reference.
	 * @see #getOnFault()
	 * @generated
	 */
	void setOnFault(Condition value);

	/**
	 * Returns the value of the '<em><b>On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Error</em>' containment reference.
	 * @see #setOnError(Condition)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnError()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-error' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getOnError();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnError <em>On Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Error</em>' containment reference.
	 * @see #getOnError()
	 * @generated
	 */
	void setOnError(Condition value);

	/**
	 * Returns the value of the '<em><b>On Default Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Default Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Default Out</em>' containment reference.
	 * @see #setOnDefaultOut(OnCase)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnDefaultOut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-default-out' namespace='##targetNamespace'"
	 * @generated
	 */
	OnCase getOnDefaultOut();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultOut <em>On Default Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Default Out</em>' containment reference.
	 * @see #getOnDefaultOut()
	 * @generated
	 */
	void setOnDefaultOut(OnCase value);

	/**
	 * Returns the value of the '<em><b>On Default Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Default Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Default Error</em>' containment reference.
	 * @see #setOnDefaultError(OnCase)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnDefaultError()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-default-error' namespace='##targetNamespace'"
	 * @generated
	 */
	OnCase getOnDefaultError();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultError <em>On Default Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Default Error</em>' containment reference.
	 * @see #getOnDefaultError()
	 * @generated
	 */
	void setOnDefaultError(OnCase value);

	/**
	 * Returns the value of the '<em><b>On Default Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Default Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Default Fault</em>' containment reference.
	 * @see #setOnDefaultFault(OnCase)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getOnJbiResponse_OnDefaultFault()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-default-fault' namespace='##targetNamespace'"
	 * @generated
	 */
	OnCase getOnDefaultFault();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultFault <em>On Default Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Default Fault</em>' containment reference.
	 * @see #getOnDefaultFault()
	 * @generated
	 */
	void setOnDefaultFault(OnCase value);

} // OnJbiResponse
