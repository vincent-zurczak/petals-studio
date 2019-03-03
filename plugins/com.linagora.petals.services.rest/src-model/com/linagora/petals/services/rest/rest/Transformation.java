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
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.Transformation#getXsl <em>Xsl</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getTransformation()
 * @model extendedMetaData="name='Transformation' kind='elementOnly'"
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Xsl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsl</em>' attribute.
	 * @see #setXsl(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getTransformation_Xsl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='xsl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXsl();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.Transformation#getXsl <em>Xsl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsl</em>' attribute.
	 * @see #getXsl()
	 * @generated
	 */
	void setXsl(String value);

} // Transformation
