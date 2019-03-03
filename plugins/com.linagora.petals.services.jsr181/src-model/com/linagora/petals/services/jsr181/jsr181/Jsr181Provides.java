/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.jsr181.jsr181;

import com.sun.java.xml.ns.jbi.Provides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.linagora.petals.services.jsr181.jsr181.Jsr181Provides#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.linagora.petals.services.jsr181.jsr181.Jsr181Package#getJsr181Provides()
 * @model extendedMetaData="name=''"
 * @generated
 */
public interface Jsr181Provides extends Provides {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see com.linagora.petals.services.jsr181.jsr181.Jsr181Package#getJsr181Provides_Clazz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='class' group='#group:0' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.jsr181.jsr181.Jsr181Provides#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // Jsr181Provides
