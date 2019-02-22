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
 * A representation of the model object '<em><b>Xsl Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#getValue <em>Value</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#isIsJsonResult <em>Is Json Result</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getXslParameter()
 * @model extendedMetaData="name='XslParameter' kind='simple'"
 * @generated
 */
public interface XslParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getXslParameter_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Json Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Json Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Json Result</em>' attribute.
	 * @see #isSetIsJsonResult()
	 * @see #unsetIsJsonResult()
	 * @see #setIsJsonResult(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getXslParameter_IsJsonResult()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='is-json-result'"
	 * @generated
	 */
	boolean isIsJsonResult();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#isIsJsonResult <em>Is Json Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Json Result</em>' attribute.
	 * @see #isSetIsJsonResult()
	 * @see #unsetIsJsonResult()
	 * @see #isIsJsonResult()
	 * @generated
	 */
	void setIsJsonResult(boolean value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#isIsJsonResult <em>Is Json Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsJsonResult()
	 * @see #isIsJsonResult()
	 * @see #setIsJsonResult(boolean)
	 * @generated
	 */
	void unsetIsJsonResult();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.XslParameter#isIsJsonResult <em>Is Json Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Json Result</em>' attribute is set.
	 * @see #unsetIsJsonResult()
	 * @see #isIsJsonResult()
	 * @see #setIsJsonResult(boolean)
	 * @generated
	 */
	boolean isSetIsJsonResult();

} // XslParameter
