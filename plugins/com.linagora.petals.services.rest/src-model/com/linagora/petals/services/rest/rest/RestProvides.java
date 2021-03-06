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

import com.sun.java.xml.ns.jbi.Provides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestProvides#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.RestProvides#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestProvides()
 * @model extendedMetaData="name=''"
 * @generated
 */
public interface RestProvides extends Provides {
	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base path to access REST resources
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestProvides_BasePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='base-path' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestProvides#getBasePath <em>Base Path</em>}' attribute.
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
	 * @see #setMapping(ProvidesMapping)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getRestProvides_Mapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mapping' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	ProvidesMapping getMapping();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.RestProvides#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(ProvidesMapping value);

} // RestProvides
