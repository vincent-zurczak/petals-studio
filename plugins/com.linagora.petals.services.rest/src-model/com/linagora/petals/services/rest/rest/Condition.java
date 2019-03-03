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
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.Condition#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.Condition#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getCondition()
 * @model extendedMetaData="name='Condition' kind='elementOnly'"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(XPathCondition)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getCondition_Condition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	XPathCondition getCondition();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.Condition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(XPathCondition value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Transformation)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getCondition_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.Condition#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #isSetOrderId()
	 * @see #unsetOrderId()
	 * @see #setOrderId(int)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getCondition_OrderId()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='order-id'"
	 * @generated
	 */
	int getOrderId();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.Condition#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #isSetOrderId()
	 * @see #unsetOrderId()
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(int value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.Condition#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrderId()
	 * @see #getOrderId()
	 * @see #setOrderId(int)
	 * @generated
	 */
	void unsetOrderId();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.Condition#getOrderId <em>Order Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order Id</em>' attribute is set.
	 * @see #unsetOrderId()
	 * @see #getOrderId()
	 * @see #setOrderId(int)
	 * @generated
	 */
	boolean isSetOrderId();

} // Condition
