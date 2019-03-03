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
 * A representation of the model object '<em><b>Jwt Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.JwtSignature#getKeyFileUrl <em>Key File Url</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.JwtSignature#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getJwtSignature()
 * @model extendedMetaData="name='JwtSignature' kind='elementOnly'"
 * @generated
 */
public interface JwtSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Key File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key File Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key File Url</em>' attribute.
	 * @see #setKeyFileUrl(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getJwtSignature_KeyFileUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='key-file-url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyFileUrl();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.JwtSignature#getKeyFileUrl <em>Key File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key File Url</em>' attribute.
	 * @see #getKeyFileUrl()
	 * @generated
	 */
	void setKeyFileUrl(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getJwtSignature_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.JwtSignature#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // JwtSignature
