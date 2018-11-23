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

import com.ebmwebsourcing.petals.services.rest.rest.HttpResponse;
import com.ebmwebsourcing.petals.services.rest.rest.RestHeader;
import com.ebmwebsourcing.petals.services.rest.rest.restPackage;

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
 * An implementation of the model object '<em><b>Http Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.HttpResponseImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpResponseImpl extends MinimalEObjectImpl.Container implements HttpResponse {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<RestHeader> header;

	/**
	 * The default value of the '{@link #isHttpBodyToJsonMultiplePi() <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyToJsonMultiplePi() <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonMultiplePi = HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT;

	/**
	 * This is true if the Http Body To Json Multiple Pi attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonMultiplePiESet;

	/**
	 * The default value of the '{@link #getHttpBodyToJsonVirtualRoot() <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpBodyToJsonVirtualRoot() <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected String httpBodyToJsonVirtualRoot = HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHttpBodyToJsonAutoArray() <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonAutoArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyToJsonAutoArray() <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonAutoArray()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonAutoArray = HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT;

	/**
	 * This is true if the Http Body To Json Auto Array attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonAutoArrayESet;

	/**
	 * The default value of the '{@link #isHttpBodyToJsonAutoPrimitive() <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyToJsonAutoPrimitive() <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonAutoPrimitive = HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT;

	/**
	 * This is true if the Http Body To Json Auto Primitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonAutoPrimitiveESet;

	/**
	 * The default value of the '{@link #isHttpBodyToJsonPrettyPrint() <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyToJsonPrettyPrint() <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonPrettyPrint = HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT;

	/**
	 * This is true if the Http Body To Json Pretty Print attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonPrettyPrintESet;

	/**
	 * The default value of the '{@link #isHttpBodyToJsonNsDeclarations() <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyToJsonNsDeclarations() <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonNsDeclarations = HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT;

	/**
	 * This is true if the Http Body To Json Ns Declarations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyToJsonNsDeclarationsESet;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return restPackage.Literals.HTTP_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestHeader> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<RestHeader>(RestHeader.class, this, restPackage.HTTP_RESPONSE__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonMultiplePi() {
		return httpBodyToJsonMultiplePi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonMultiplePi(boolean newHttpBodyToJsonMultiplePi) {
		boolean oldHttpBodyToJsonMultiplePi = httpBodyToJsonMultiplePi;
		httpBodyToJsonMultiplePi = newHttpBodyToJsonMultiplePi;
		boolean oldHttpBodyToJsonMultiplePiESet = httpBodyToJsonMultiplePiESet;
		httpBodyToJsonMultiplePiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI, oldHttpBodyToJsonMultiplePi, httpBodyToJsonMultiplePi, !oldHttpBodyToJsonMultiplePiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyToJsonMultiplePi() {
		boolean oldHttpBodyToJsonMultiplePi = httpBodyToJsonMultiplePi;
		boolean oldHttpBodyToJsonMultiplePiESet = httpBodyToJsonMultiplePiESet;
		httpBodyToJsonMultiplePi = HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT;
		httpBodyToJsonMultiplePiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI, oldHttpBodyToJsonMultiplePi, HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT, oldHttpBodyToJsonMultiplePiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyToJsonMultiplePi() {
		return httpBodyToJsonMultiplePiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpBodyToJsonVirtualRoot() {
		return httpBodyToJsonVirtualRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonVirtualRoot(String newHttpBodyToJsonVirtualRoot) {
		String oldHttpBodyToJsonVirtualRoot = httpBodyToJsonVirtualRoot;
		httpBodyToJsonVirtualRoot = newHttpBodyToJsonVirtualRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT, oldHttpBodyToJsonVirtualRoot, httpBodyToJsonVirtualRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonAutoArray() {
		return httpBodyToJsonAutoArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonAutoArray(boolean newHttpBodyToJsonAutoArray) {
		boolean oldHttpBodyToJsonAutoArray = httpBodyToJsonAutoArray;
		httpBodyToJsonAutoArray = newHttpBodyToJsonAutoArray;
		boolean oldHttpBodyToJsonAutoArrayESet = httpBodyToJsonAutoArrayESet;
		httpBodyToJsonAutoArrayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY, oldHttpBodyToJsonAutoArray, httpBodyToJsonAutoArray, !oldHttpBodyToJsonAutoArrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyToJsonAutoArray() {
		boolean oldHttpBodyToJsonAutoArray = httpBodyToJsonAutoArray;
		boolean oldHttpBodyToJsonAutoArrayESet = httpBodyToJsonAutoArrayESet;
		httpBodyToJsonAutoArray = HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT;
		httpBodyToJsonAutoArrayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY, oldHttpBodyToJsonAutoArray, HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT, oldHttpBodyToJsonAutoArrayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyToJsonAutoArray() {
		return httpBodyToJsonAutoArrayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonAutoPrimitive() {
		return httpBodyToJsonAutoPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonAutoPrimitive(boolean newHttpBodyToJsonAutoPrimitive) {
		boolean oldHttpBodyToJsonAutoPrimitive = httpBodyToJsonAutoPrimitive;
		httpBodyToJsonAutoPrimitive = newHttpBodyToJsonAutoPrimitive;
		boolean oldHttpBodyToJsonAutoPrimitiveESet = httpBodyToJsonAutoPrimitiveESet;
		httpBodyToJsonAutoPrimitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, oldHttpBodyToJsonAutoPrimitive, httpBodyToJsonAutoPrimitive, !oldHttpBodyToJsonAutoPrimitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyToJsonAutoPrimitive() {
		boolean oldHttpBodyToJsonAutoPrimitive = httpBodyToJsonAutoPrimitive;
		boolean oldHttpBodyToJsonAutoPrimitiveESet = httpBodyToJsonAutoPrimitiveESet;
		httpBodyToJsonAutoPrimitive = HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT;
		httpBodyToJsonAutoPrimitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, oldHttpBodyToJsonAutoPrimitive, HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT, oldHttpBodyToJsonAutoPrimitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyToJsonAutoPrimitive() {
		return httpBodyToJsonAutoPrimitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonPrettyPrint() {
		return httpBodyToJsonPrettyPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonPrettyPrint(boolean newHttpBodyToJsonPrettyPrint) {
		boolean oldHttpBodyToJsonPrettyPrint = httpBodyToJsonPrettyPrint;
		httpBodyToJsonPrettyPrint = newHttpBodyToJsonPrettyPrint;
		boolean oldHttpBodyToJsonPrettyPrintESet = httpBodyToJsonPrettyPrintESet;
		httpBodyToJsonPrettyPrintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT, oldHttpBodyToJsonPrettyPrint, httpBodyToJsonPrettyPrint, !oldHttpBodyToJsonPrettyPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyToJsonPrettyPrint() {
		boolean oldHttpBodyToJsonPrettyPrint = httpBodyToJsonPrettyPrint;
		boolean oldHttpBodyToJsonPrettyPrintESet = httpBodyToJsonPrettyPrintESet;
		httpBodyToJsonPrettyPrint = HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT;
		httpBodyToJsonPrettyPrintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT, oldHttpBodyToJsonPrettyPrint, HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT, oldHttpBodyToJsonPrettyPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyToJsonPrettyPrint() {
		return httpBodyToJsonPrettyPrintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonNsDeclarations() {
		return httpBodyToJsonNsDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonNsDeclarations(boolean newHttpBodyToJsonNsDeclarations) {
		boolean oldHttpBodyToJsonNsDeclarations = httpBodyToJsonNsDeclarations;
		httpBodyToJsonNsDeclarations = newHttpBodyToJsonNsDeclarations;
		boolean oldHttpBodyToJsonNsDeclarationsESet = httpBodyToJsonNsDeclarationsESet;
		httpBodyToJsonNsDeclarationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS, oldHttpBodyToJsonNsDeclarations, httpBodyToJsonNsDeclarations, !oldHttpBodyToJsonNsDeclarationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyToJsonNsDeclarations() {
		boolean oldHttpBodyToJsonNsDeclarations = httpBodyToJsonNsDeclarations;
		boolean oldHttpBodyToJsonNsDeclarationsESet = httpBodyToJsonNsDeclarationsESet;
		httpBodyToJsonNsDeclarations = HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT;
		httpBodyToJsonNsDeclarationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS, oldHttpBodyToJsonNsDeclarations, HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT, oldHttpBodyToJsonNsDeclarationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyToJsonNsDeclarations() {
		return httpBodyToJsonNsDeclarationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		boolean oldCodeESet = codeESet;
		codeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, restPackage.HTTP_RESPONSE__CODE, oldCode, code, !oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCode() {
		int oldCode = code;
		boolean oldCodeESet = codeESet;
		code = CODE_EDEFAULT;
		codeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, restPackage.HTTP_RESPONSE__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case restPackage.HTTP_RESPONSE__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
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
			case restPackage.HTTP_RESPONSE__HEADER:
				return getHeader();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isHttpBodyToJsonMultiplePi();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return getHttpBodyToJsonVirtualRoot();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isHttpBodyToJsonAutoArray();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isHttpBodyToJsonAutoPrimitive();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isHttpBodyToJsonPrettyPrint();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isHttpBodyToJsonNsDeclarations();
			case restPackage.HTTP_RESPONSE__CODE:
				return getCode();
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
			case restPackage.HTTP_RESPONSE__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends RestHeader>)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				setHttpBodyToJsonMultiplePi((Boolean)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot((String)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				setHttpBodyToJsonAutoArray((Boolean)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				setHttpBodyToJsonAutoPrimitive((Boolean)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				setHttpBodyToJsonPrettyPrint((Boolean)newValue);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				setHttpBodyToJsonNsDeclarations((Boolean)newValue);
				return;
			case restPackage.HTTP_RESPONSE__CODE:
				setCode((Integer)newValue);
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
			case restPackage.HTTP_RESPONSE__HEADER:
				getHeader().clear();
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				unsetHttpBodyToJsonMultiplePi();
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot(HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				unsetHttpBodyToJsonAutoArray();
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				unsetHttpBodyToJsonAutoPrimitive();
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				unsetHttpBodyToJsonPrettyPrint();
				return;
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				unsetHttpBodyToJsonNsDeclarations();
				return;
			case restPackage.HTTP_RESPONSE__CODE:
				unsetCode();
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
			case restPackage.HTTP_RESPONSE__HEADER:
				return header != null && !header.isEmpty();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isSetHttpBodyToJsonMultiplePi();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT == null ? httpBodyToJsonVirtualRoot != null : !HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT.equals(httpBodyToJsonVirtualRoot);
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isSetHttpBodyToJsonAutoArray();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isSetHttpBodyToJsonAutoPrimitive();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isSetHttpBodyToJsonPrettyPrint();
			case restPackage.HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isSetHttpBodyToJsonNsDeclarations();
			case restPackage.HTTP_RESPONSE__CODE:
				return isSetCode();
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
		result.append(" (httpBodyToJsonMultiplePi: ");
		if (httpBodyToJsonMultiplePiESet) result.append(httpBodyToJsonMultiplePi); else result.append("<unset>");
		result.append(", httpBodyToJsonVirtualRoot: ");
		result.append(httpBodyToJsonVirtualRoot);
		result.append(", httpBodyToJsonAutoArray: ");
		if (httpBodyToJsonAutoArrayESet) result.append(httpBodyToJsonAutoArray); else result.append("<unset>");
		result.append(", httpBodyToJsonAutoPrimitive: ");
		if (httpBodyToJsonAutoPrimitiveESet) result.append(httpBodyToJsonAutoPrimitive); else result.append("<unset>");
		result.append(", httpBodyToJsonPrettyPrint: ");
		if (httpBodyToJsonPrettyPrintESet) result.append(httpBodyToJsonPrettyPrint); else result.append("<unset>");
		result.append(", httpBodyToJsonNsDeclarations: ");
		if (httpBodyToJsonNsDeclarationsESet) result.append(httpBodyToJsonNsDeclarations); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HttpResponseImpl
