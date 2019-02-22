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

import com.ebmwebsourcing.petals.services.cdk.cdk5.CDK5Consumes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.RestConsumes#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.RestConsumes#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getRestConsumes()
 * @model
 * @generated
 */
public interface RestConsumes extends CDK5Consumes {
	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base path to access REST resources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getRestConsumes_BasePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='base-path' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.RestConsumes#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(ConsumesMapping)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getRestConsumes_Mapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	ConsumesMapping getMapping();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.RestConsumes#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(ConsumesMapping value);

} // RestConsumes
