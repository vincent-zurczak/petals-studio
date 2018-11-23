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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumes Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.ConsumesMapping#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getConsumesMapping()
 * @model extendedMetaData="name='ConsumesMapping' kind='elementOnly'"
 * @generated
 */
public interface ConsumesMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link com.ebmwebsourcing.petals.services.rest.rest.ConsumesOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getConsumesMapping_Operation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsumesOperation> getOperation();

} // ConsumesMapping
