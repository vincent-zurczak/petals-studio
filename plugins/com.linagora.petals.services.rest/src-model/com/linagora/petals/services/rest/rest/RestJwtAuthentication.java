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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jwt Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getClaim <em>Claim</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith <em>Compress With</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getSignWith <em>Sign With</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestJwtAuthentication()
 * @model extendedMetaData="name='RestJwtAuthentication' kind='elementOnly'"
 * @generated
 */
public interface RestJwtAuthentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference list.
	 * The list contents are of type {@link com.linagora.petals.services.rest.rest.JwtClaim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference list.
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestJwtAuthentication_Claim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claim' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JwtClaim> getClaim();

	/**
	 * Returns the value of the '<em><b>Compress With</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.JwtCompression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compress With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compress With</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @see #isSetCompressWith()
	 * @see #unsetCompressWith()
	 * @see #setCompressWith(JwtCompression)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestJwtAuthentication_CompressWith()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='compress-with' namespace='##targetNamespace'"
	 * @generated
	 */
	JwtCompression getCompressWith();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith <em>Compress With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compress With</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @see #isSetCompressWith()
	 * @see #unsetCompressWith()
	 * @see #getCompressWith()
	 * @generated
	 */
	void setCompressWith(JwtCompression value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith <em>Compress With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressWith()
	 * @see #getCompressWith()
	 * @see #setCompressWith(JwtCompression)
	 * @generated
	 */
	void unsetCompressWith();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith <em>Compress With</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compress With</em>' attribute is set.
	 * @see #unsetCompressWith()
	 * @see #getCompressWith()
	 * @see #setCompressWith(JwtCompression)
	 * @generated
	 */
	boolean isSetCompressWith();

	/**
	 * Returns the value of the '<em><b>Sign With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign With</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign With</em>' containment reference.
	 * @see #setSignWith(JwtSignature)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestJwtAuthentication_SignWith()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sign-with' namespace='##targetNamespace'"
	 * @generated
	 */
	JwtSignature getSignWith();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getSignWith <em>Sign With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign With</em>' containment reference.
	 * @see #getSignWith()
	 * @generated
	 */
	void setSignWith(JwtSignature value);

} // RestJwtAuthentication
