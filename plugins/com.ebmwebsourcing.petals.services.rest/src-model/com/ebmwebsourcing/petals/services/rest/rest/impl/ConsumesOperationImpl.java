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

import com.ebmwebsourcing.petals.services.rest.rest.ConsumesOperation;
import com.ebmwebsourcing.petals.services.rest.rest.IncomingPayload;
import com.ebmwebsourcing.petals.services.rest.rest.OnJbiResponse;
import com.ebmwebsourcing.petals.services.rest.rest.RestOperation;
import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumes Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getPathTemplate <em>Path Template</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getIncomingPayload <em>Incoming Payload</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getHttpBodyFromJsonVirtualRoot1 <em>Http Body From Json Virtual Root1</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getXmlTemplate <em>Xml Template</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ConsumesOperationImpl#getOnJbiResponse <em>On Jbi Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumesOperationImpl extends MinimalEObjectImpl.Container implements ConsumesOperation {
	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final RestOperation HTTP_METHOD_EDEFAULT = RestOperation.GET;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected RestOperation httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * This is true if the Http Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpMethodESet;

	/**
	 * The default value of the '{@link #getPathTemplate() <em>Path Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathTemplate() <em>Path Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathTemplate()
	 * @generated
	 * @ordered
	 */
	protected String pathTemplate = PATH_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpBodyFromJsonVirtualRoot() <em>Http Body From Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyFromJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpBodyFromJsonVirtualRoot() <em>Http Body From Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyFromJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected String httpBodyFromJsonVirtualRoot = HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingPayload() <em>Incoming Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPayload()
	 * @generated
	 * @ordered
	 */
	protected IncomingPayload incomingPayload;

	/**
	 * The default value of the '{@link #isHttpBodyFromJsonMultiplePi() <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHttpBodyFromJsonMultiplePi() <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyFromJsonMultiplePi = HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT;

	/**
	 * This is true if the Http Body From Json Multiple Pi attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyFromJsonMultiplePiESet;

	/**
	 * The default value of the '{@link #getHttpBodyFromJsonVirtualRoot1() <em>Http Body From Json Virtual Root1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyFromJsonVirtualRoot1()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpBodyFromJsonVirtualRoot1() <em>Http Body From Json Virtual Root1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyFromJsonVirtualRoot1()
	 * @generated
	 * @ordered
	 */
	protected String httpBodyFromJsonVirtualRoot1 = HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXmlTemplate() <em>Xml Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTemplate()
	 * @generated
	 * @ordered
	 */
	protected EObject xmlTemplate;

	/**
	 * The cached value of the '{@link #getOnJbiResponse() <em>On Jbi Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnJbiResponse()
	 * @generated
	 * @ordered
	 */
	protected OnJbiResponse onJbiResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumesOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.CONSUMES_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestOperation getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMethod(RestOperation newHttpMethod) {
		RestOperation oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		boolean oldHttpMethodESet = httpMethodESet;
		httpMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__HTTP_METHOD, oldHttpMethod, httpMethod, !oldHttpMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpMethod() {
		RestOperation oldHttpMethod = httpMethod;
		boolean oldHttpMethodESet = httpMethodESet;
		httpMethod = HTTP_METHOD_EDEFAULT;
		httpMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.CONSUMES_OPERATION__HTTP_METHOD, oldHttpMethod, HTTP_METHOD_EDEFAULT, oldHttpMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpMethod() {
		return httpMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathTemplate() {
		return pathTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathTemplate(String newPathTemplate) {
		String oldPathTemplate = pathTemplate;
		pathTemplate = newPathTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__PATH_TEMPLATE, oldPathTemplate, pathTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpBodyFromJsonVirtualRoot() {
		return httpBodyFromJsonVirtualRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyFromJsonVirtualRoot(String newHttpBodyFromJsonVirtualRoot) {
		String oldHttpBodyFromJsonVirtualRoot = httpBodyFromJsonVirtualRoot;
		httpBodyFromJsonVirtualRoot = newHttpBodyFromJsonVirtualRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT, oldHttpBodyFromJsonVirtualRoot, httpBodyFromJsonVirtualRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingPayload getIncomingPayload() {
		return incomingPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingPayload(IncomingPayload newIncomingPayload, NotificationChain msgs) {
		IncomingPayload oldIncomingPayload = incomingPayload;
		incomingPayload = newIncomingPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD, oldIncomingPayload, newIncomingPayload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingPayload(IncomingPayload newIncomingPayload) {
		if (newIncomingPayload != incomingPayload) {
			NotificationChain msgs = null;
			if (incomingPayload != null)
				msgs = ((InternalEObject)incomingPayload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD, null, msgs);
			if (newIncomingPayload != null)
				msgs = ((InternalEObject)newIncomingPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD, null, msgs);
			msgs = basicSetIncomingPayload(newIncomingPayload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD, newIncomingPayload, newIncomingPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyFromJsonMultiplePi() {
		return httpBodyFromJsonMultiplePi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyFromJsonMultiplePi(boolean newHttpBodyFromJsonMultiplePi) {
		boolean oldHttpBodyFromJsonMultiplePi = httpBodyFromJsonMultiplePi;
		httpBodyFromJsonMultiplePi = newHttpBodyFromJsonMultiplePi;
		boolean oldHttpBodyFromJsonMultiplePiESet = httpBodyFromJsonMultiplePiESet;
		httpBodyFromJsonMultiplePiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI, oldHttpBodyFromJsonMultiplePi, httpBodyFromJsonMultiplePi, !oldHttpBodyFromJsonMultiplePiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyFromJsonMultiplePi() {
		boolean oldHttpBodyFromJsonMultiplePi = httpBodyFromJsonMultiplePi;
		boolean oldHttpBodyFromJsonMultiplePiESet = httpBodyFromJsonMultiplePiESet;
		httpBodyFromJsonMultiplePi = HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT;
		httpBodyFromJsonMultiplePiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI, oldHttpBodyFromJsonMultiplePi, HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT, oldHttpBodyFromJsonMultiplePiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyFromJsonMultiplePi() {
		return httpBodyFromJsonMultiplePiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpBodyFromJsonVirtualRoot1() {
		return httpBodyFromJsonVirtualRoot1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyFromJsonVirtualRoot1(String newHttpBodyFromJsonVirtualRoot1) {
		String oldHttpBodyFromJsonVirtualRoot1 = httpBodyFromJsonVirtualRoot1;
		httpBodyFromJsonVirtualRoot1 = newHttpBodyFromJsonVirtualRoot1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1, oldHttpBodyFromJsonVirtualRoot1, httpBodyFromJsonVirtualRoot1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getXmlTemplate() {
		return xmlTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlTemplate(EObject newXmlTemplate, NotificationChain msgs) {
		EObject oldXmlTemplate = xmlTemplate;
		xmlTemplate = newXmlTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__XML_TEMPLATE, oldXmlTemplate, newXmlTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlTemplate(EObject newXmlTemplate) {
		if (newXmlTemplate != xmlTemplate) {
			NotificationChain msgs = null;
			if (xmlTemplate != null)
				msgs = ((InternalEObject)xmlTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__XML_TEMPLATE, null, msgs);
			if (newXmlTemplate != null)
				msgs = ((InternalEObject)newXmlTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__XML_TEMPLATE, null, msgs);
			msgs = basicSetXmlTemplate(newXmlTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__XML_TEMPLATE, newXmlTemplate, newXmlTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnJbiResponse getOnJbiResponse() {
		return onJbiResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnJbiResponse(OnJbiResponse newOnJbiResponse, NotificationChain msgs) {
		OnJbiResponse oldOnJbiResponse = onJbiResponse;
		onJbiResponse = newOnJbiResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE, oldOnJbiResponse, newOnJbiResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnJbiResponse(OnJbiResponse newOnJbiResponse) {
		if (newOnJbiResponse != onJbiResponse) {
			NotificationChain msgs = null;
			if (onJbiResponse != null)
				msgs = ((InternalEObject)onJbiResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE, null, msgs);
			if (newOnJbiResponse != null)
				msgs = ((InternalEObject)newOnJbiResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE, null, msgs);
			msgs = basicSetOnJbiResponse(newOnJbiResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE, newOnJbiResponse, newOnJbiResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD:
				return basicSetIncomingPayload(null, msgs);
			case RestPackage.CONSUMES_OPERATION__XML_TEMPLATE:
				return basicSetXmlTemplate(null, msgs);
			case RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE:
				return basicSetOnJbiResponse(null, msgs);
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
			case RestPackage.CONSUMES_OPERATION__HTTP_METHOD:
				return getHttpMethod();
			case RestPackage.CONSUMES_OPERATION__PATH_TEMPLATE:
				return getPathTemplate();
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return getHttpBodyFromJsonVirtualRoot();
			case RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD:
				return getIncomingPayload();
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isHttpBodyFromJsonMultiplePi();
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1:
				return getHttpBodyFromJsonVirtualRoot1();
			case RestPackage.CONSUMES_OPERATION__XML_TEMPLATE:
				return getXmlTemplate();
			case RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE:
				return getOnJbiResponse();
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
			case RestPackage.CONSUMES_OPERATION__HTTP_METHOD:
				setHttpMethod((RestOperation)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__PATH_TEMPLATE:
				setPathTemplate((String)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot((String)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD:
				setIncomingPayload((IncomingPayload)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				setHttpBodyFromJsonMultiplePi((Boolean)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1:
				setHttpBodyFromJsonVirtualRoot1((String)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__XML_TEMPLATE:
				setXmlTemplate((EObject)newValue);
				return;
			case RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE:
				setOnJbiResponse((OnJbiResponse)newValue);
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
			case RestPackage.CONSUMES_OPERATION__HTTP_METHOD:
				unsetHttpMethod();
				return;
			case RestPackage.CONSUMES_OPERATION__PATH_TEMPLATE:
				setPathTemplate(PATH_TEMPLATE_EDEFAULT);
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot(HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD:
				setIncomingPayload((IncomingPayload)null);
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				unsetHttpBodyFromJsonMultiplePi();
				return;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1:
				setHttpBodyFromJsonVirtualRoot1(HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1_EDEFAULT);
				return;
			case RestPackage.CONSUMES_OPERATION__XML_TEMPLATE:
				setXmlTemplate((EObject)null);
				return;
			case RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE:
				setOnJbiResponse((OnJbiResponse)null);
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
			case RestPackage.CONSUMES_OPERATION__HTTP_METHOD:
				return isSetHttpMethod();
			case RestPackage.CONSUMES_OPERATION__PATH_TEMPLATE:
				return PATH_TEMPLATE_EDEFAULT == null ? pathTemplate != null : !PATH_TEMPLATE_EDEFAULT.equals(pathTemplate);
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT == null ? httpBodyFromJsonVirtualRoot != null : !HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT.equals(httpBodyFromJsonVirtualRoot);
			case RestPackage.CONSUMES_OPERATION__INCOMING_PAYLOAD:
				return incomingPayload != null;
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isSetHttpBodyFromJsonMultiplePi();
			case RestPackage.CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1:
				return HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1_EDEFAULT == null ? httpBodyFromJsonVirtualRoot1 != null : !HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1_EDEFAULT.equals(httpBodyFromJsonVirtualRoot1);
			case RestPackage.CONSUMES_OPERATION__XML_TEMPLATE:
				return xmlTemplate != null;
			case RestPackage.CONSUMES_OPERATION__ON_JBI_RESPONSE:
				return onJbiResponse != null;
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
		result.append(" (httpMethod: ");
		if (httpMethodESet) result.append(httpMethod); else result.append("<unset>");
		result.append(", pathTemplate: ");
		result.append(pathTemplate);
		result.append(", httpBodyFromJsonVirtualRoot: ");
		result.append(httpBodyFromJsonVirtualRoot);
		result.append(", httpBodyFromJsonMultiplePi: ");
		if (httpBodyFromJsonMultiplePiESet) result.append(httpBodyFromJsonMultiplePi); else result.append("<unset>");
		result.append(", httpBodyFromJsonVirtualRoot1: ");
		result.append(httpBodyFromJsonVirtualRoot1);
		result.append(')');
		return result.toString();
	}

} //ConsumesOperationImpl
