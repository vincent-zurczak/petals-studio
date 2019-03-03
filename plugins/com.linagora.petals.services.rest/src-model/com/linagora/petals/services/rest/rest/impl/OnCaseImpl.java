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

import com.linagora.petals.services.rest.rest.HttpResponse;
import com.linagora.petals.services.rest.rest.OnCase;
import com.linagora.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.OnCaseImpl#getHttpResponse <em>Http Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnCaseImpl extends ConditionImpl implements OnCase {
	/**
	 * The cached value of the '{@link #getHttpResponse() <em>Http Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpResponse()
	 * @generated
	 * @ordered
	 */
	protected HttpResponse httpResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.ON_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpResponse getHttpResponse() {
		return httpResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpResponse(HttpResponse newHttpResponse, NotificationChain msgs) {
		HttpResponse oldHttpResponse = httpResponse;
		httpResponse = newHttpResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.ON_CASE__HTTP_RESPONSE, oldHttpResponse, newHttpResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpResponse(HttpResponse newHttpResponse) {
		if (newHttpResponse != httpResponse) {
			NotificationChain msgs = null;
			if (httpResponse != null)
				msgs = ((InternalEObject)httpResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_CASE__HTTP_RESPONSE, null, msgs);
			if (newHttpResponse != null)
				msgs = ((InternalEObject)newHttpResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.ON_CASE__HTTP_RESPONSE, null, msgs);
			msgs = basicSetHttpResponse(newHttpResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.ON_CASE__HTTP_RESPONSE, newHttpResponse, newHttpResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.ON_CASE__HTTP_RESPONSE:
				return basicSetHttpResponse(null, msgs);
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
			case RestPackage.ON_CASE__HTTP_RESPONSE:
				return getHttpResponse();
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
			case RestPackage.ON_CASE__HTTP_RESPONSE:
				setHttpResponse((HttpResponse)newValue);
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
			case RestPackage.ON_CASE__HTTP_RESPONSE:
				setHttpResponse((HttpResponse)null);
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
			case RestPackage.ON_CASE__HTTP_RESPONSE:
				return httpResponse != null;
		}
		return super.eIsSet(featureID);
	}

} //OnCaseImpl
