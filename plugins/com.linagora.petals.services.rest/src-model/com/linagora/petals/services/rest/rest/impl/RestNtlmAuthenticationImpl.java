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
package com.linagora.petals.services.rest.rest.impl;

import com.linagora.petals.services.rest.rest.RestNtlmAuthentication;
import com.linagora.petals.services.rest.rest.RestPackage;
import com.linagora.petals.services.rest.rest.RestProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ntlm Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestNtlmAuthenticationImpl extends MinimalEObjectImpl.Container implements RestNtlmAuthentication {
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected RestProperty username;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected RestProperty password;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected RestProperty domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestNtlmAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.REST_NTLM_AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestProperty getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsername(RestProperty newUsername, NotificationChain msgs) {
		RestProperty oldUsername = username;
		username = newUsername;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__USERNAME, oldUsername, newUsername);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(RestProperty newUsername) {
		if (newUsername != username) {
			NotificationChain msgs = null;
			if (username != null)
				msgs = ((InternalEObject)username).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__USERNAME, null, msgs);
			if (newUsername != null)
				msgs = ((InternalEObject)newUsername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__USERNAME, null, msgs);
			msgs = basicSetUsername(newUsername, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__USERNAME, newUsername, newUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestProperty getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(RestProperty newPassword, NotificationChain msgs) {
		RestProperty oldPassword = password;
		password = newPassword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD, oldPassword, newPassword);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(RestProperty newPassword) {
		if (newPassword != password) {
			NotificationChain msgs = null;
			if (password != null)
				msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD, null, msgs);
			if (newPassword != null)
				msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD, null, msgs);
			msgs = basicSetPassword(newPassword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD, newPassword, newPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestProperty getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(RestProperty newDomain, NotificationChain msgs) {
		RestProperty oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(RestProperty newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.REST_NTLM_AUTHENTICATION__USERNAME:
				return basicSetUsername(null, msgs);
			case RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD:
				return basicSetPassword(null, msgs);
			case RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN:
				return basicSetDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.REST_NTLM_AUTHENTICATION__USERNAME:
				return getUsername();
			case RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD:
				return getPassword();
			case RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN:
				return getDomain();
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
			case RestPackage.REST_NTLM_AUTHENTICATION__USERNAME:
				setUsername((RestProperty)newValue);
				return;
			case RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD:
				setPassword((RestProperty)newValue);
				return;
			case RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN:
				setDomain((RestProperty)newValue);
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
			case RestPackage.REST_NTLM_AUTHENTICATION__USERNAME:
				setUsername((RestProperty)null);
				return;
			case RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD:
				setPassword((RestProperty)null);
				return;
			case RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN:
				setDomain((RestProperty)null);
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
			case RestPackage.REST_NTLM_AUTHENTICATION__USERNAME:
				return username != null;
			case RestPackage.REST_NTLM_AUTHENTICATION__PASSWORD:
				return password != null;
			case RestPackage.REST_NTLM_AUTHENTICATION__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //RestNtlmAuthenticationImpl
