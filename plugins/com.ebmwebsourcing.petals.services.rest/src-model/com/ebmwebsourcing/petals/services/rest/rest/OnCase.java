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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.OnCase#getHttpResponse <em>Http Response</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getOnCase()
 * @model extendedMetaData="name='OnCase' kind='elementOnly'"
 * @generated
 */
public interface OnCase extends Condition {
	/**
	 * Returns the value of the '<em><b>Http Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Response</em>' containment reference.
	 * @see #setHttpResponse(HttpResponse)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getOnCase_HttpResponse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='http-response' namespace='##targetNamespace'"
	 * @generated
	 */
	HttpResponse getHttpResponse();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.OnCase#getHttpResponse <em>Http Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Response</em>' containment reference.
	 * @see #getHttpResponse()
	 * @generated
	 */
	void setHttpResponse(HttpResponse value);

} // OnCase
