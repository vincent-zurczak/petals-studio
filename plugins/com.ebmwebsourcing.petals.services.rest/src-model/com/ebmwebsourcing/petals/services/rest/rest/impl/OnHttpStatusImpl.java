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

import com.ebmwebsourcing.petals.services.rest.rest.Condition;
import com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus;
import com.ebmwebsourcing.petals.services.rest.rest.Otherwise;
import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Http Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getOut <em>Out</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getError <em>Error</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getOtherwiseOut <em>Otherwise Out</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getOtherwiseFault <em>Otherwise Fault</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.OnHttpStatusImpl#getOtherwiseError <em>Otherwise Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnHttpStatusImpl extends MinimalEObjectImpl.Container implements OnHttpStatus {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected Condition out;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected Condition fault;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected Condition error;

	/**
	 * The cached value of the '{@link #getOtherwiseOut() <em>Otherwise Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwiseOut()
	 * @generated
	 * @ordered
	 */
	protected Otherwise otherwiseOut;

	/**
	 * The cached value of the '{@link #getOtherwiseFault() <em>Otherwise Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwiseFault()
	 * @generated
	 * @ordered
	 */
	protected Otherwise otherwiseFault;

	/**
	 * The cached value of the '{@link #getOtherwiseError() <em>Otherwise Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherwiseError()
	 * @generated
	 * @ordered
	 */
	protected Otherwise otherwiseError;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnHttpStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.ON_HTTP_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOut(Condition newOut, NotificationChain msgs) {
		Condition oldOut = out;
		out = newOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OUT, oldOut, newOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(Condition newOut) {
		if (newOut != out) {
			NotificationChain msgs = null;
			if (out != null)
				msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OUT, null, msgs);
			if (newOut != null)
				msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OUT, null, msgs);
			msgs = basicSetOut(newOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OUT, newOut, newOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getFault() {
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFault(Condition newFault, NotificationChain msgs) {
		Condition oldFault = fault;
		fault = newFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__FAULT, oldFault, newFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault(Condition newFault) {
		if (newFault != fault) {
			NotificationChain msgs = null;
			if (fault != null)
				msgs = ((InternalEObject)fault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__FAULT, null, msgs);
			if (newFault != null)
				msgs = ((InternalEObject)newFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__FAULT, null, msgs);
			msgs = basicSetFault(newFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__FAULT, newFault, newFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(Condition newError, NotificationChain msgs) {
		Condition oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(Condition newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__ERROR, null, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__ERROR, null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise getOtherwiseOut() {
		return otherwiseOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwiseOut(Otherwise newOtherwiseOut, NotificationChain msgs) {
		Otherwise oldOtherwiseOut = otherwiseOut;
		otherwiseOut = newOtherwiseOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT, oldOtherwiseOut, newOtherwiseOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwiseOut(Otherwise newOtherwiseOut) {
		if (newOtherwiseOut != otherwiseOut) {
			NotificationChain msgs = null;
			if (otherwiseOut != null)
				msgs = ((InternalEObject)otherwiseOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT, null, msgs);
			if (newOtherwiseOut != null)
				msgs = ((InternalEObject)newOtherwiseOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT, null, msgs);
			msgs = basicSetOtherwiseOut(newOtherwiseOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT, newOtherwiseOut, newOtherwiseOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise getOtherwiseFault() {
		return otherwiseFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwiseFault(Otherwise newOtherwiseFault, NotificationChain msgs) {
		Otherwise oldOtherwiseFault = otherwiseFault;
		otherwiseFault = newOtherwiseFault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT, oldOtherwiseFault, newOtherwiseFault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwiseFault(Otherwise newOtherwiseFault) {
		if (newOtherwiseFault != otherwiseFault) {
			NotificationChain msgs = null;
			if (otherwiseFault != null)
				msgs = ((InternalEObject)otherwiseFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT, null, msgs);
			if (newOtherwiseFault != null)
				msgs = ((InternalEObject)newOtherwiseFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT, null, msgs);
			msgs = basicSetOtherwiseFault(newOtherwiseFault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT, newOtherwiseFault, newOtherwiseFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise getOtherwiseError() {
		return otherwiseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherwiseError(Otherwise newOtherwiseError, NotificationChain msgs) {
		Otherwise oldOtherwiseError = otherwiseError;
		otherwiseError = newOtherwiseError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR, oldOtherwiseError, newOtherwiseError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwiseError(Otherwise newOtherwiseError) {
		if (newOtherwiseError != otherwiseError) {
			NotificationChain msgs = null;
			if (otherwiseError != null)
				msgs = ((InternalEObject)otherwiseError).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR, null, msgs);
			if (newOtherwiseError != null)
				msgs = ((InternalEObject)newOtherwiseError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR, null, msgs);
			msgs = basicSetOtherwiseError(newOtherwiseError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR, newOtherwiseError, newOtherwiseError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.ON_HTTP_STATUS__OUT:
				return basicSetOut(null, msgs);
			case RestPackage.ON_HTTP_STATUS__FAULT:
				return basicSetFault(null, msgs);
			case RestPackage.ON_HTTP_STATUS__ERROR:
				return basicSetError(null, msgs);
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT:
				return basicSetOtherwiseOut(null, msgs);
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT:
				return basicSetOtherwiseFault(null, msgs);
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR:
				return basicSetOtherwiseError(null, msgs);
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
			case RestPackage.ON_HTTP_STATUS__OUT:
				return getOut();
			case RestPackage.ON_HTTP_STATUS__FAULT:
				return getFault();
			case RestPackage.ON_HTTP_STATUS__ERROR:
				return getError();
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT:
				return getOtherwiseOut();
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT:
				return getOtherwiseFault();
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR:
				return getOtherwiseError();
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
			case RestPackage.ON_HTTP_STATUS__OUT:
				setOut((Condition)newValue);
				return;
			case RestPackage.ON_HTTP_STATUS__FAULT:
				setFault((Condition)newValue);
				return;
			case RestPackage.ON_HTTP_STATUS__ERROR:
				setError((Condition)newValue);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT:
				setOtherwiseOut((Otherwise)newValue);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT:
				setOtherwiseFault((Otherwise)newValue);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR:
				setOtherwiseError((Otherwise)newValue);
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
			case RestPackage.ON_HTTP_STATUS__OUT:
				setOut((Condition)null);
				return;
			case RestPackage.ON_HTTP_STATUS__FAULT:
				setFault((Condition)null);
				return;
			case RestPackage.ON_HTTP_STATUS__ERROR:
				setError((Condition)null);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT:
				setOtherwiseOut((Otherwise)null);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT:
				setOtherwiseFault((Otherwise)null);
				return;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR:
				setOtherwiseError((Otherwise)null);
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
			case RestPackage.ON_HTTP_STATUS__OUT:
				return out != null;
			case RestPackage.ON_HTTP_STATUS__FAULT:
				return fault != null;
			case RestPackage.ON_HTTP_STATUS__ERROR:
				return error != null;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_OUT:
				return otherwiseOut != null;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_FAULT:
				return otherwiseFault != null;
			case RestPackage.ON_HTTP_STATUS__OTHERWISE_ERROR:
				return otherwiseError != null;
		}
		return super.eIsSet(featureID);
	}

} //OnHttpStatusImpl
