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

import com.linagora.petals.services.rest.rest.RestAuthentication;
import com.linagora.petals.services.rest.rest.RestBasicAuthentication;
import com.linagora.petals.services.rest.rest.RestJwtAuthentication;
import com.linagora.petals.services.rest.rest.RestNtlmAuthentication;
import com.linagora.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl#getJwt <em>Jwt</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl#getNtlm <em>Ntlm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestAuthenticationImpl extends MinimalEObjectImpl.Container implements RestAuthentication {
	/**
	 * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic()
	 * @generated
	 * @ordered
	 */
	protected RestBasicAuthentication basic;

	/**
	 * The cached value of the '{@link #getJwt() <em>Jwt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJwt()
	 * @generated
	 * @ordered
	 */
	protected RestJwtAuthentication jwt;

	/**
	 * The cached value of the '{@link #getNtlm() <em>Ntlm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNtlm()
	 * @generated
	 * @ordered
	 */
	protected RestNtlmAuthentication ntlm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.REST_AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBasicAuthentication getBasic() {
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(RestBasicAuthentication newBasic, NotificationChain msgs) {
		RestBasicAuthentication oldBasic = basic;
		basic = newBasic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__BASIC, oldBasic, newBasic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic(RestBasicAuthentication newBasic) {
		if (newBasic != basic) {
			NotificationChain msgs = null;
			if (basic != null)
				msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__BASIC, null, msgs);
			if (newBasic != null)
				msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__BASIC, null, msgs);
			msgs = basicSetBasic(newBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__BASIC, newBasic, newBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestJwtAuthentication getJwt() {
		return jwt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJwt(RestJwtAuthentication newJwt, NotificationChain msgs) {
		RestJwtAuthentication oldJwt = jwt;
		jwt = newJwt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__JWT, oldJwt, newJwt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJwt(RestJwtAuthentication newJwt) {
		if (newJwt != jwt) {
			NotificationChain msgs = null;
			if (jwt != null)
				msgs = ((InternalEObject)jwt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__JWT, null, msgs);
			if (newJwt != null)
				msgs = ((InternalEObject)newJwt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__JWT, null, msgs);
			msgs = basicSetJwt(newJwt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__JWT, newJwt, newJwt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestNtlmAuthentication getNtlm() {
		return ntlm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNtlm(RestNtlmAuthentication newNtlm, NotificationChain msgs) {
		RestNtlmAuthentication oldNtlm = ntlm;
		ntlm = newNtlm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__NTLM, oldNtlm, newNtlm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNtlm(RestNtlmAuthentication newNtlm) {
		if (newNtlm != ntlm) {
			NotificationChain msgs = null;
			if (ntlm != null)
				msgs = ((InternalEObject)ntlm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__NTLM, null, msgs);
			if (newNtlm != null)
				msgs = ((InternalEObject)newNtlm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_AUTHENTICATION__NTLM, null, msgs);
			msgs = basicSetNtlm(newNtlm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_AUTHENTICATION__NTLM, newNtlm, newNtlm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.REST_AUTHENTICATION__BASIC:
				return basicSetBasic(null, msgs);
			case RestPackage.REST_AUTHENTICATION__JWT:
				return basicSetJwt(null, msgs);
			case RestPackage.REST_AUTHENTICATION__NTLM:
				return basicSetNtlm(null, msgs);
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
			case RestPackage.REST_AUTHENTICATION__BASIC:
				return getBasic();
			case RestPackage.REST_AUTHENTICATION__JWT:
				return getJwt();
			case RestPackage.REST_AUTHENTICATION__NTLM:
				return getNtlm();
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
			case RestPackage.REST_AUTHENTICATION__BASIC:
				setBasic((RestBasicAuthentication)newValue);
				return;
			case RestPackage.REST_AUTHENTICATION__JWT:
				setJwt((RestJwtAuthentication)newValue);
				return;
			case RestPackage.REST_AUTHENTICATION__NTLM:
				setNtlm((RestNtlmAuthentication)newValue);
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
			case RestPackage.REST_AUTHENTICATION__BASIC:
				setBasic((RestBasicAuthentication)null);
				return;
			case RestPackage.REST_AUTHENTICATION__JWT:
				setJwt((RestJwtAuthentication)null);
				return;
			case RestPackage.REST_AUTHENTICATION__NTLM:
				setNtlm((RestNtlmAuthentication)null);
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
			case RestPackage.REST_AUTHENTICATION__BASIC:
				return basic != null;
			case RestPackage.REST_AUTHENTICATION__JWT:
				return jwt != null;
			case RestPackage.REST_AUTHENTICATION__NTLM:
				return ntlm != null;
		}
		return super.eIsSet(featureID);
	}

} //RestAuthenticationImpl
