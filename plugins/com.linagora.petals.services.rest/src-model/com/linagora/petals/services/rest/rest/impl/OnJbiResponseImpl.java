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

import com.linagora.petals.services.rest.rest.Condition;
import com.linagora.petals.services.rest.rest.OnCase;
import com.linagora.petals.services.rest.rest.OnJbiResponse;
import com.linagora.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Jbi Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnOut <em>On Out</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnFault <em>On Fault</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnError <em>On Error</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnDefaultOut <em>On Default Out</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnDefaultError <em>On Default Error</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl#getOnDefaultFault <em>On Default Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnJbiResponseImpl extends MinimalEObjectImpl.Container implements OnJbiResponse {
	/**
	 * The cached value of the '{@link #getOnOut() <em>On Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnOut()
	 * @generated
	 * @ordered
	 */
	protected Condition onOut;

	/**
	 * The cached value of the '{@link #getOnFault() <em>On Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFault()
	 * @generated
	 * @ordered
	 */
	protected Condition onFault;

	/**
	 * The cached value of the '{@link #getOnError() <em>On Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnError()
	 * @generated
	 * @ordered
	 */
	protected Condition onError;

	/**
	 * The cached value of the '{@link #getOnDefaultOut() <em>On Default Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDefaultOut()
	 * @generated
	 * @ordered
	 */
	protected OnCase onDefaultOut;

	/**
	 * The cached value of the '{@link #getOnDefaultError() <em>On Default Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDefaultError()
	 * @generated
	 * @ordered
	 */
	protected OnCase onDefaultError;

	/**
	 * The cached value of the '{@link #getOnDefaultFault() <em>On Default Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDefaultFault()
	 * @generated
	 * @ordered
	 */
	protected OnCase onDefaultFault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnJbiResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.ON_JBI_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOnOut() {
		return onOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnOut(Condition newOnOut, NotificationChain msgs) {
		Condition oldOnOut = onOut;
		onOut = newOnOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_OUT, oldOnOut, newOnOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnOut(Condition newOnOut) {
		if (newOnOut != onOut) {
			NotificationChain msgs = null;
			if (onOut != null)
				msgs = ((InternalEObject)onOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_OUT, null, msgs);
			if (newOnOut != null)
				msgs = ((InternalEObject)newOnOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_OUT, null, msgs);
			msgs = basicSetOnOut(newOnOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_OUT, newOnOut, newOnOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOnFault() {
		return onFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnFault(Condition newOnFault, NotificationChain msgs) {
		Condition oldOnFault = onFault;
		onFault = newOnFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_FAULT, oldOnFault, newOnFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFault(Condition newOnFault) {
		if (newOnFault != onFault) {
			NotificationChain msgs = null;
			if (onFault != null)
				msgs = ((InternalEObject)onFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_FAULT, null, msgs);
			if (newOnFault != null)
				msgs = ((InternalEObject)newOnFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_FAULT, null, msgs);
			msgs = basicSetOnFault(newOnFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_FAULT, newOnFault, newOnFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOnError() {
		return onError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnError(Condition newOnError, NotificationChain msgs) {
		Condition oldOnError = onError;
		onError = newOnError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_ERROR, oldOnError, newOnError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnError(Condition newOnError) {
		if (newOnError != onError) {
			NotificationChain msgs = null;
			if (onError != null)
				msgs = ((InternalEObject)onError).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_ERROR, null, msgs);
			if (newOnError != null)
				msgs = ((InternalEObject)newOnError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_ERROR, null, msgs);
			msgs = basicSetOnError(newOnError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_ERROR, newOnError, newOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCase getOnDefaultOut() {
		return onDefaultOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDefaultOut(OnCase newOnDefaultOut, NotificationChain msgs) {
		OnCase oldOnDefaultOut = onDefaultOut;
		onDefaultOut = newOnDefaultOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT, oldOnDefaultOut, newOnDefaultOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDefaultOut(OnCase newOnDefaultOut) {
		if (newOnDefaultOut != onDefaultOut) {
			NotificationChain msgs = null;
			if (onDefaultOut != null)
				msgs = ((InternalEObject)onDefaultOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT, null, msgs);
			if (newOnDefaultOut != null)
				msgs = ((InternalEObject)newOnDefaultOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT, null, msgs);
			msgs = basicSetOnDefaultOut(newOnDefaultOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT, newOnDefaultOut, newOnDefaultOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCase getOnDefaultError() {
		return onDefaultError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDefaultError(OnCase newOnDefaultError, NotificationChain msgs) {
		OnCase oldOnDefaultError = onDefaultError;
		onDefaultError = newOnDefaultError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR, oldOnDefaultError, newOnDefaultError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDefaultError(OnCase newOnDefaultError) {
		if (newOnDefaultError != onDefaultError) {
			NotificationChain msgs = null;
			if (onDefaultError != null)
				msgs = ((InternalEObject)onDefaultError).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR, null, msgs);
			if (newOnDefaultError != null)
				msgs = ((InternalEObject)newOnDefaultError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR, null, msgs);
			msgs = basicSetOnDefaultError(newOnDefaultError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR, newOnDefaultError, newOnDefaultError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCase getOnDefaultFault() {
		return onDefaultFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDefaultFault(OnCase newOnDefaultFault, NotificationChain msgs) {
		OnCase oldOnDefaultFault = onDefaultFault;
		onDefaultFault = newOnDefaultFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT, oldOnDefaultFault, newOnDefaultFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDefaultFault(OnCase newOnDefaultFault) {
		if (newOnDefaultFault != onDefaultFault) {
			NotificationChain msgs = null;
			if (onDefaultFault != null)
				msgs = ((InternalEObject)onDefaultFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT, null, msgs);
			if (newOnDefaultFault != null)
				msgs = ((InternalEObject)newOnDefaultFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT, null, msgs);
			msgs = basicSetOnDefaultFault(newOnDefaultFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT, newOnDefaultFault, newOnDefaultFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.ON_JBI_RESPONSE__ON_OUT:
				return basicSetOnOut(null, msgs);
			case RestPackage.ON_JBI_RESPONSE__ON_FAULT:
				return basicSetOnFault(null, msgs);
			case RestPackage.ON_JBI_RESPONSE__ON_ERROR:
				return basicSetOnError(null, msgs);
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT:
				return basicSetOnDefaultOut(null, msgs);
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR:
				return basicSetOnDefaultError(null, msgs);
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT:
				return basicSetOnDefaultFault(null, msgs);
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
			case RestPackage.ON_JBI_RESPONSE__ON_OUT:
				return getOnOut();
			case RestPackage.ON_JBI_RESPONSE__ON_FAULT:
				return getOnFault();
			case RestPackage.ON_JBI_RESPONSE__ON_ERROR:
				return getOnError();
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT:
				return getOnDefaultOut();
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR:
				return getOnDefaultError();
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT:
				return getOnDefaultFault();
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
			case RestPackage.ON_JBI_RESPONSE__ON_OUT:
				setOnOut((Condition)newValue);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_FAULT:
				setOnFault((Condition)newValue);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_ERROR:
				setOnError((Condition)newValue);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT:
				setOnDefaultOut((OnCase)newValue);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR:
				setOnDefaultError((OnCase)newValue);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT:
				setOnDefaultFault((OnCase)newValue);
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
			case RestPackage.ON_JBI_RESPONSE__ON_OUT:
				setOnOut((Condition)null);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_FAULT:
				setOnFault((Condition)null);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_ERROR:
				setOnError((Condition)null);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT:
				setOnDefaultOut((OnCase)null);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR:
				setOnDefaultError((OnCase)null);
				return;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT:
				setOnDefaultFault((OnCase)null);
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
			case RestPackage.ON_JBI_RESPONSE__ON_OUT:
				return onOut != null;
			case RestPackage.ON_JBI_RESPONSE__ON_FAULT:
				return onFault != null;
			case RestPackage.ON_JBI_RESPONSE__ON_ERROR:
				return onError != null;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_OUT:
				return onDefaultOut != null;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_ERROR:
				return onDefaultError != null;
			case RestPackage.ON_JBI_RESPONSE__ON_DEFAULT_FAULT:
				return onDefaultFault != null;
		}
		return super.eIsSet(featureID);
	}

} //OnJbiResponseImpl
