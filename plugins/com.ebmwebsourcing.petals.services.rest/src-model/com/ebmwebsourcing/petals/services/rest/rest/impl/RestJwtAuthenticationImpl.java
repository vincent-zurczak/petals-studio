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

import com.ebmwebsourcing.petals.services.rest.rest.JwtClaim;
import com.ebmwebsourcing.petals.services.rest.rest.JwtCompression;
import com.ebmwebsourcing.petals.services.rest.rest.JwtSignature;
import com.ebmwebsourcing.petals.services.rest.rest.RestJwtAuthentication;
import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jwt Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.RestJwtAuthenticationImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.RestJwtAuthenticationImpl#getCompressWith <em>Compress With</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.RestJwtAuthenticationImpl#getSignWith <em>Sign With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestJwtAuthenticationImpl extends MinimalEObjectImpl.Container implements RestJwtAuthentication {
	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected EList<JwtClaim> claim;

	/**
	 * The default value of the '{@link #getCompressWith() <em>Compress With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressWith()
	 * @generated
	 * @ordered
	 */
	protected static final JwtCompression COMPRESS_WITH_EDEFAULT = JwtCompression.DEF;

	/**
	 * The cached value of the '{@link #getCompressWith() <em>Compress With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressWith()
	 * @generated
	 * @ordered
	 */
	protected JwtCompression compressWith = COMPRESS_WITH_EDEFAULT;

	/**
	 * This is true if the Compress With attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressWithESet;

	/**
	 * The cached value of the '{@link #getSignWith() <em>Sign With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignWith()
	 * @generated
	 * @ordered
	 */
	protected JwtSignature signWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestJwtAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.REST_JWT_AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JwtClaim> getClaim() {
		if (claim == null) {
			claim = new EObjectContainmentEList<JwtClaim>(JwtClaim.class, this, RestPackage.REST_JWT_AUTHENTICATION__CLAIM);
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtCompression getCompressWith() {
		return compressWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressWith(JwtCompression newCompressWith) {
		JwtCompression oldCompressWith = compressWith;
		compressWith = newCompressWith == null ? COMPRESS_WITH_EDEFAULT : newCompressWith;
		boolean oldCompressWithESet = compressWithESet;
		compressWithESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH, oldCompressWith, compressWith, !oldCompressWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressWith() {
		JwtCompression oldCompressWith = compressWith;
		boolean oldCompressWithESet = compressWithESet;
		compressWith = COMPRESS_WITH_EDEFAULT;
		compressWithESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH, oldCompressWith, COMPRESS_WITH_EDEFAULT, oldCompressWithESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressWith() {
		return compressWithESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtSignature getSignWith() {
		return signWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignWith(JwtSignature newSignWith, NotificationChain msgs) {
		JwtSignature oldSignWith = signWith;
		signWith = newSignWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH, oldSignWith, newSignWith);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignWith(JwtSignature newSignWith) {
		if (newSignWith != signWith) {
			NotificationChain msgs = null;
			if (signWith != null)
				msgs = ((InternalEObject)signWith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH, null, msgs);
			if (newSignWith != null)
				msgs = ((InternalEObject)newSignWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH, null, msgs);
			msgs = basicSetSignWith(newSignWith, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH, newSignWith, newSignWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.REST_JWT_AUTHENTICATION__CLAIM:
				return ((InternalEList<?>)getClaim()).basicRemove(otherEnd, msgs);
			case RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH:
				return basicSetSignWith(null, msgs);
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
			case RestPackage.REST_JWT_AUTHENTICATION__CLAIM:
				return getClaim();
			case RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH:
				return getCompressWith();
			case RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH:
				return getSignWith();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestPackage.REST_JWT_AUTHENTICATION__CLAIM:
				getClaim().clear();
				getClaim().addAll((Collection<? extends JwtClaim>)newValue);
				return;
			case RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH:
				setCompressWith((JwtCompression)newValue);
				return;
			case RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH:
				setSignWith((JwtSignature)newValue);
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
			case RestPackage.REST_JWT_AUTHENTICATION__CLAIM:
				getClaim().clear();
				return;
			case RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH:
				unsetCompressWith();
				return;
			case RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH:
				setSignWith((JwtSignature)null);
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
			case RestPackage.REST_JWT_AUTHENTICATION__CLAIM:
				return claim != null && !claim.isEmpty();
			case RestPackage.REST_JWT_AUTHENTICATION__COMPRESS_WITH:
				return isSetCompressWith();
			case RestPackage.REST_JWT_AUTHENTICATION__SIGN_WITH:
				return signWith != null;
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
		result.append(" (compressWith: ");
		if (compressWithESet) result.append(compressWith); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RestJwtAuthenticationImpl
