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
package com.linagora.petals.services.rest.rest.impl;

import com.linagora.petals.services.rest.rest.JwtSignature;
import com.linagora.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl#getKeyFileUrl <em>Key File Url</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JwtSignatureImpl extends MinimalEObjectImpl.Container implements JwtSignature {
	/**
	 * The default value of the '{@link #getKeyFileUrl() <em>Key File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFileUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_FILE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyFileUrl() <em>Key File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyFileUrl()
	 * @generated
	 * @ordered
	 */
	protected String keyFileUrl = KEY_FILE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JwtSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.JWT_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyFileUrl() {
		return keyFileUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFileUrl(String newKeyFileUrl) {
		String oldKeyFileUrl = keyFileUrl;
		keyFileUrl = newKeyFileUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.JWT_SIGNATURE__KEY_FILE_URL, oldKeyFileUrl, keyFileUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.JWT_SIGNATURE__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.JWT_SIGNATURE__KEY_FILE_URL:
				return getKeyFileUrl();
			case RestPackage.JWT_SIGNATURE__ALGORITHM:
				return getAlgorithm();
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
			case RestPackage.JWT_SIGNATURE__KEY_FILE_URL:
				setKeyFileUrl((String)newValue);
				return;
			case RestPackage.JWT_SIGNATURE__ALGORITHM:
				setAlgorithm((String)newValue);
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
			case RestPackage.JWT_SIGNATURE__KEY_FILE_URL:
				setKeyFileUrl(KEY_FILE_URL_EDEFAULT);
				return;
			case RestPackage.JWT_SIGNATURE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
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
			case RestPackage.JWT_SIGNATURE__KEY_FILE_URL:
				return KEY_FILE_URL_EDEFAULT == null ? keyFileUrl != null : !KEY_FILE_URL_EDEFAULT.equals(keyFileUrl);
			case RestPackage.JWT_SIGNATURE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
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
		result.append(" (keyFileUrl: ");
		result.append(keyFileUrl);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(')');
		return result.toString();
	}

} //JwtSignatureImpl
