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
package com.ebmwebsourcing.petals.services.rest.rest.impl;

import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;
import com.ebmwebsourcing.petals.services.rest.rest.XslParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xsl Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.XslParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.XslParameterImpl#isIsJsonResult <em>Is Json Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XslParameterImpl extends MinimalEObjectImpl.Container implements XslParameter {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsJsonResult() <em>Is Json Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJsonResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_JSON_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsJsonResult() <em>Is Json Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJsonResult()
	 * @generated
	 * @ordered
	 */
	protected boolean isJsonResult = IS_JSON_RESULT_EDEFAULT;

	/**
	 * This is true if the Is Json Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isJsonResultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XslParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.XSL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.XSL_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsJsonResult() {
		return isJsonResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJsonResult(boolean newIsJsonResult) {
		boolean oldIsJsonResult = isJsonResult;
		isJsonResult = newIsJsonResult;
		boolean oldIsJsonResultESet = isJsonResultESet;
		isJsonResultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.XSL_PARAMETER__IS_JSON_RESULT, oldIsJsonResult, isJsonResult, !oldIsJsonResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsJsonResult() {
		boolean oldIsJsonResult = isJsonResult;
		boolean oldIsJsonResultESet = isJsonResultESet;
		isJsonResult = IS_JSON_RESULT_EDEFAULT;
		isJsonResultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.XSL_PARAMETER__IS_JSON_RESULT, oldIsJsonResult, IS_JSON_RESULT_EDEFAULT, oldIsJsonResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsJsonResult() {
		return isJsonResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.XSL_PARAMETER__VALUE:
				return getValue();
			case RestPackage.XSL_PARAMETER__IS_JSON_RESULT:
				return isIsJsonResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestPackage.XSL_PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case RestPackage.XSL_PARAMETER__IS_JSON_RESULT:
				setIsJsonResult((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestPackage.XSL_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case RestPackage.XSL_PARAMETER__IS_JSON_RESULT:
				unsetIsJsonResult();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestPackage.XSL_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case RestPackage.XSL_PARAMETER__IS_JSON_RESULT:
				return isSetIsJsonResult();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", isJsonResult: ");
		if (isJsonResultESet) result.append(isJsonResult); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XslParameterImpl
