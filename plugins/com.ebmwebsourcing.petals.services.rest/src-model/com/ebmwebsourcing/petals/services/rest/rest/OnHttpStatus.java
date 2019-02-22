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
package com.ebmwebsourcing.petals.services.rest.rest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Http Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOut <em>Out</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getFault <em>Fault</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getError <em>Error</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseOut <em>Otherwise Out</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseFault <em>Otherwise Fault</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseError <em>Otherwise Error</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus()
 * @model extendedMetaData="name='OnHttpStatus' kind='elementOnly'"
 * @generated
 */
public interface OnHttpStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(Condition)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_Out()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='out' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getOut();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Condition value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference.
	 * @see #setFault(Condition)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_Fault()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fault' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getFault();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getFault <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault</em>' containment reference.
	 * @see #getFault()
	 * @generated
	 */
	void setFault(Condition value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(Condition)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_Error()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getError();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(Condition value);

	/**
	 * Returns the value of the '<em><b>Otherwise Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise Out</em>' containment reference.
	 * @see #setOtherwiseOut(Otherwise)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_OtherwiseOut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='otherwise-out' namespace='##targetNamespace'"
	 * @generated
	 */
	Otherwise getOtherwiseOut();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseOut <em>Otherwise Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise Out</em>' containment reference.
	 * @see #getOtherwiseOut()
	 * @generated
	 */
	void setOtherwiseOut(Otherwise value);

	/**
	 * Returns the value of the '<em><b>Otherwise Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise Fault</em>' containment reference.
	 * @see #setOtherwiseFault(Otherwise)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_OtherwiseFault()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='otherwise-fault' namespace='##targetNamespace'"
	 * @generated
	 */
	Otherwise getOtherwiseFault();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseFault <em>Otherwise Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise Fault</em>' containment reference.
	 * @see #getOtherwiseFault()
	 * @generated
	 */
	void setOtherwiseFault(Otherwise value);

	/**
	 * Returns the value of the '<em><b>Otherwise Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise Error</em>' containment reference.
	 * @see #setOtherwiseError(Otherwise)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getOnHttpStatus_OtherwiseError()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='otherwise-error' namespace='##targetNamespace'"
	 * @generated
	 */
	Otherwise getOtherwiseError();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus#getOtherwiseError <em>Otherwise Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise Error</em>' containment reference.
	 * @see #getOtherwiseError()
	 * @generated
	 */
	void setOtherwiseError(Otherwise value);

} // OnHttpStatus
