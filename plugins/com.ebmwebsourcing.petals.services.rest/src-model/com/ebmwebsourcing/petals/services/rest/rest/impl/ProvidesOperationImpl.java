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

import com.ebmwebsourcing.petals.services.rest.rest.FormData;
import com.ebmwebsourcing.petals.services.rest.rest.HttpBodyType;
import com.ebmwebsourcing.petals.services.rest.rest.JsonXmlMappingConvention;
import com.ebmwebsourcing.petals.services.rest.rest.OnHttpStatus;
import com.ebmwebsourcing.petals.services.rest.rest.ProvidesOperation;
import com.ebmwebsourcing.petals.services.rest.rest.ResponseBodyAs;
import com.ebmwebsourcing.petals.services.rest.rest.RestAuthentication;
import com.ebmwebsourcing.petals.services.rest.rest.RestHeaders;
import com.ebmwebsourcing.petals.services.rest.rest.RestOperation;
import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;
import com.ebmwebsourcing.petals.services.rest.rest.RestParam;
import com.ebmwebsourcing.petals.services.rest.rest.XslParameter;

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
 * An implementation of the model object '<em><b>Provides Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getWadl <em>Wadl</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getWsdl2 <em>Wsdl2</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getHttpBodyType <em>Http Body Type</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isBufferRequest <em>Buffer Request</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isTrustAllCertificates <em>Trust All Certificates</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getXpathParam <em>Xpath Param</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getXsl <em>Xsl</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getResponseBodyAs <em>Response Body As</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getFormData <em>Form Data</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getOnHttpStatus <em>On Http Status</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.ProvidesOperationImpl#getNamespaceMapping <em>Namespace Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidesOperationImpl extends MinimalEObjectImpl.Container implements ProvidesOperation {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getWadl() <em>Wadl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWadl()
	 * @generated
	 * @ordered
	 */
	protected static final String WADL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWadl() <em>Wadl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWadl()
	 * @generated
	 * @ordered
	 */
	protected String wadl = WADL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdl2() <em>Wsdl2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdl2()
	 * @generated
	 * @ordered
	 */
	protected static final String WSDL2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdl2() <em>Wsdl2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdl2()
	 * @generated
	 * @ordered
	 */
	protected String wsdl2 = WSDL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpBodyType() <em>Http Body Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyType()
	 * @generated
	 * @ordered
	 */
	protected static final HttpBodyType HTTP_BODY_TYPE_EDEFAULT = HttpBodyType.NOBODY;

	/**
	 * The cached value of the '{@link #getHttpBodyType() <em>Http Body Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyType()
	 * @generated
	 * @ordered
	 */
	protected HttpBodyType httpBodyType = HTTP_BODY_TYPE_EDEFAULT;

	/**
	 * This is true if the Http Body Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean httpBodyTypeESet;

	/**
	 * The default value of the '{@link #isBufferRequest() <em>Buffer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufferRequest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUFFER_REQUEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBufferRequest() <em>Buffer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBufferRequest()
	 * @generated
	 * @ordered
	 */
	protected boolean bufferRequest = BUFFER_REQUEST_EDEFAULT;

	/**
	 * This is true if the Buffer Request attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bufferRequestESet;

	/**
	 * The default value of the '{@link #isTrustAllCertificates() <em>Trust All Certificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrustAllCertificates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUST_ALL_CERTIFICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrustAllCertificates() <em>Trust All Certificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrustAllCertificates()
	 * @generated
	 * @ordered
	 */
	protected boolean trustAllCertificates = TRUST_ALL_CERTIFICATES_EDEFAULT;

	/**
	 * This is true if the Trust All Certificates attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trustAllCertificatesESet;

	/**
	 * The cached value of the '{@link #getXpathParam() <em>Xpath Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpathParam()
	 * @generated
	 * @ordered
	 */
	protected EList<RestParam> xpathParam;

	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected RestAuthentication authentication;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected RestHeaders headers;

	/**
	 * The cached value of the '{@link #getXsl() <em>Xsl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsl()
	 * @generated
	 * @ordered
	 */
	protected XslParameter xsl;

	/**
	 * The default value of the '{@link #getResponseBodyAs() <em>Response Body As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBodyAs()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseBodyAs RESPONSE_BODY_AS_EDEFAULT = ResponseBodyAs.AUTO;

	/**
	 * The cached value of the '{@link #getResponseBodyAs() <em>Response Body As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBodyAs()
	 * @generated
	 * @ordered
	 */
	protected ResponseBodyAs responseBodyAs = RESPONSE_BODY_AS_EDEFAULT;

	/**
	 * This is true if the Response Body As attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responseBodyAsESet;

	/**
	 * The default value of the '{@link #getJsonXmlMappingConvention() <em>Json Xml Mapping Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonXmlMappingConvention()
	 * @generated
	 * @ordered
	 */
	protected static final JsonXmlMappingConvention JSON_XML_MAPPING_CONVENTION_EDEFAULT = JsonXmlMappingConvention.MAPPEDCONVENTION;

	/**
	 * The cached value of the '{@link #getJsonXmlMappingConvention() <em>Json Xml Mapping Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonXmlMappingConvention()
	 * @generated
	 * @ordered
	 */
	protected JsonXmlMappingConvention jsonXmlMappingConvention = JSON_XML_MAPPING_CONVENTION_EDEFAULT;

	/**
	 * This is true if the Json Xml Mapping Convention attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean jsonXmlMappingConventionESet;

	/**
	 * The cached value of the '{@link #getFormData() <em>Form Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormData()
	 * @generated
	 * @ordered
	 */
	protected EList<FormData> formData;

	/**
	 * The cached value of the '{@link #getOnHttpStatus() <em>On Http Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnHttpStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<OnHttpStatus> onHttpStatus;

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
	 * The default value of the '{@link #getNamespaceMapping() <em>Namespace Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceMapping() <em>Namespace Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceMapping()
	 * @generated
	 * @ordered
	 */
	protected String namespaceMapping = NAMESPACE_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.PROVIDES_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_METHOD, oldHttpMethod, httpMethod, !oldHttpMethodESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_METHOD, oldHttpMethod, HTTP_METHOD_EDEFAULT, oldHttpMethodESet));
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
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWadl() {
		return wadl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWadl(String newWadl) {
		String oldWadl = wadl;
		wadl = newWadl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__WADL, oldWadl, wadl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsdl2() {
		return wsdl2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdl2(String newWsdl2) {
		String oldWsdl2 = wsdl2;
		wsdl2 = newWsdl2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__WSDL2, oldWsdl2, wsdl2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpBodyType getHttpBodyType() {
		return httpBodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyType(HttpBodyType newHttpBodyType) {
		HttpBodyType oldHttpBodyType = httpBodyType;
		httpBodyType = newHttpBodyType == null ? HTTP_BODY_TYPE_EDEFAULT : newHttpBodyType;
		boolean oldHttpBodyTypeESet = httpBodyTypeESet;
		httpBodyTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE, oldHttpBodyType, httpBodyType, !oldHttpBodyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHttpBodyType() {
		HttpBodyType oldHttpBodyType = httpBodyType;
		boolean oldHttpBodyTypeESet = httpBodyTypeESet;
		httpBodyType = HTTP_BODY_TYPE_EDEFAULT;
		httpBodyTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE, oldHttpBodyType, HTTP_BODY_TYPE_EDEFAULT, oldHttpBodyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHttpBodyType() {
		return httpBodyTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBufferRequest() {
		return bufferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferRequest(boolean newBufferRequest) {
		boolean oldBufferRequest = bufferRequest;
		bufferRequest = newBufferRequest;
		boolean oldBufferRequestESet = bufferRequestESet;
		bufferRequestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST, oldBufferRequest, bufferRequest, !oldBufferRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBufferRequest() {
		boolean oldBufferRequest = bufferRequest;
		boolean oldBufferRequestESet = bufferRequestESet;
		bufferRequest = BUFFER_REQUEST_EDEFAULT;
		bufferRequestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST, oldBufferRequest, BUFFER_REQUEST_EDEFAULT, oldBufferRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBufferRequest() {
		return bufferRequestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrustAllCertificates() {
		return trustAllCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrustAllCertificates(boolean newTrustAllCertificates) {
		boolean oldTrustAllCertificates = trustAllCertificates;
		trustAllCertificates = newTrustAllCertificates;
		boolean oldTrustAllCertificatesESet = trustAllCertificatesESet;
		trustAllCertificatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES, oldTrustAllCertificates, trustAllCertificates, !oldTrustAllCertificatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrustAllCertificates() {
		boolean oldTrustAllCertificates = trustAllCertificates;
		boolean oldTrustAllCertificatesESet = trustAllCertificatesESet;
		trustAllCertificates = TRUST_ALL_CERTIFICATES_EDEFAULT;
		trustAllCertificatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES, oldTrustAllCertificates, TRUST_ALL_CERTIFICATES_EDEFAULT, oldTrustAllCertificatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrustAllCertificates() {
		return trustAllCertificatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestParam> getXpathParam() {
		if (xpathParam == null) {
			xpathParam = new EObjectContainmentEList<RestParam>(RestParam.class, this, RestPackage.PROVIDES_OPERATION__XPATH_PARAM);
		}
		return xpathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAuthentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(RestAuthentication newAuthentication, NotificationChain msgs) {
		RestAuthentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__AUTHENTICATION, oldAuthentication, newAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(RestAuthentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__AUTHENTICATION, null, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__AUTHENTICATION, null, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestHeaders getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaders(RestHeaders newHeaders, NotificationChain msgs) {
		RestHeaders oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HEADERS, oldHeaders, newHeaders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(RestHeaders newHeaders) {
		if (newHeaders != headers) {
			NotificationChain msgs = null;
			if (headers != null)
				msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__HEADERS, null, msgs);
			if (newHeaders != null)
				msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__HEADERS, null, msgs);
			msgs = basicSetHeaders(newHeaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HEADERS, newHeaders, newHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XslParameter getXsl() {
		return xsl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsl(XslParameter newXsl, NotificationChain msgs) {
		XslParameter oldXsl = xsl;
		xsl = newXsl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__XSL, oldXsl, newXsl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsl(XslParameter newXsl) {
		if (newXsl != xsl) {
			NotificationChain msgs = null;
			if (xsl != null)
				msgs = ((InternalEObject)xsl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__XSL, null, msgs);
			if (newXsl != null)
				msgs = ((InternalEObject)newXsl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.PROVIDES_OPERATION__XSL, null, msgs);
			msgs = basicSetXsl(newXsl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__XSL, newXsl, newXsl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBodyAs getResponseBodyAs() {
		return responseBodyAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseBodyAs(ResponseBodyAs newResponseBodyAs) {
		ResponseBodyAs oldResponseBodyAs = responseBodyAs;
		responseBodyAs = newResponseBodyAs == null ? RESPONSE_BODY_AS_EDEFAULT : newResponseBodyAs;
		boolean oldResponseBodyAsESet = responseBodyAsESet;
		responseBodyAsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS, oldResponseBodyAs, responseBodyAs, !oldResponseBodyAsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponseBodyAs() {
		ResponseBodyAs oldResponseBodyAs = responseBodyAs;
		boolean oldResponseBodyAsESet = responseBodyAsESet;
		responseBodyAs = RESPONSE_BODY_AS_EDEFAULT;
		responseBodyAsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS, oldResponseBodyAs, RESPONSE_BODY_AS_EDEFAULT, oldResponseBodyAsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponseBodyAs() {
		return responseBodyAsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonXmlMappingConvention getJsonXmlMappingConvention() {
		return jsonXmlMappingConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonXmlMappingConvention(JsonXmlMappingConvention newJsonXmlMappingConvention) {
		JsonXmlMappingConvention oldJsonXmlMappingConvention = jsonXmlMappingConvention;
		jsonXmlMappingConvention = newJsonXmlMappingConvention == null ? JSON_XML_MAPPING_CONVENTION_EDEFAULT : newJsonXmlMappingConvention;
		boolean oldJsonXmlMappingConventionESet = jsonXmlMappingConventionESet;
		jsonXmlMappingConventionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION, oldJsonXmlMappingConvention, jsonXmlMappingConvention, !oldJsonXmlMappingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJsonXmlMappingConvention() {
		JsonXmlMappingConvention oldJsonXmlMappingConvention = jsonXmlMappingConvention;
		boolean oldJsonXmlMappingConventionESet = jsonXmlMappingConventionESet;
		jsonXmlMappingConvention = JSON_XML_MAPPING_CONVENTION_EDEFAULT;
		jsonXmlMappingConventionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION, oldJsonXmlMappingConvention, JSON_XML_MAPPING_CONVENTION_EDEFAULT, oldJsonXmlMappingConventionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJsonXmlMappingConvention() {
		return jsonXmlMappingConventionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormData> getFormData() {
		if (formData == null) {
			formData = new EObjectContainmentEList<FormData>(FormData.class, this, RestPackage.PROVIDES_OPERATION__FORM_DATA);
		}
		return formData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnHttpStatus> getOnHttpStatus() {
		if (onHttpStatus == null) {
			onHttpStatus = new EObjectContainmentEList<OnHttpStatus>(OnHttpStatus.class, this, RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS);
		}
		return onHttpStatus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI, oldHttpBodyToJsonMultiplePi, httpBodyToJsonMultiplePi, !oldHttpBodyToJsonMultiplePiESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI, oldHttpBodyToJsonMultiplePi, HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT, oldHttpBodyToJsonMultiplePiESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI, oldHttpBodyFromJsonMultiplePi, httpBodyFromJsonMultiplePi, !oldHttpBodyFromJsonMultiplePiESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI, oldHttpBodyFromJsonMultiplePi, HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT, oldHttpBodyFromJsonMultiplePiESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT, oldHttpBodyToJsonVirtualRoot, httpBodyToJsonVirtualRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT, oldHttpBodyFromJsonVirtualRoot, httpBodyFromJsonVirtualRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY, oldHttpBodyToJsonAutoArray, httpBodyToJsonAutoArray, !oldHttpBodyToJsonAutoArrayESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY, oldHttpBodyToJsonAutoArray, HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT, oldHttpBodyToJsonAutoArrayESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, oldHttpBodyToJsonAutoPrimitive, httpBodyToJsonAutoPrimitive, !oldHttpBodyToJsonAutoPrimitiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, oldHttpBodyToJsonAutoPrimitive, HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT, oldHttpBodyToJsonAutoPrimitiveESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT, oldHttpBodyToJsonPrettyPrint, httpBodyToJsonPrettyPrint, !oldHttpBodyToJsonPrettyPrintESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT, oldHttpBodyToJsonPrettyPrint, HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT, oldHttpBodyToJsonPrettyPrintESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS, oldHttpBodyToJsonNsDeclarations, httpBodyToJsonNsDeclarations, !oldHttpBodyToJsonNsDeclarationsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS, oldHttpBodyToJsonNsDeclarations, HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT, oldHttpBodyToJsonNsDeclarationsESet));
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
	public String getNamespaceMapping() {
		return namespaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceMapping(String newNamespaceMapping) {
		String oldNamespaceMapping = namespaceMapping;
		namespaceMapping = newNamespaceMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.PROVIDES_OPERATION__NAMESPACE_MAPPING, oldNamespaceMapping, namespaceMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.PROVIDES_OPERATION__XPATH_PARAM:
				return ((InternalEList<?>)getXpathParam()).basicRemove(otherEnd, msgs);
			case RestPackage.PROVIDES_OPERATION__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
			case RestPackage.PROVIDES_OPERATION__HEADERS:
				return basicSetHeaders(null, msgs);
			case RestPackage.PROVIDES_OPERATION__XSL:
				return basicSetXsl(null, msgs);
			case RestPackage.PROVIDES_OPERATION__FORM_DATA:
				return ((InternalEList<?>)getFormData()).basicRemove(otherEnd, msgs);
			case RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS:
				return ((InternalEList<?>)getOnHttpStatus()).basicRemove(otherEnd, msgs);
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
			case RestPackage.PROVIDES_OPERATION__HTTP_METHOD:
				return getHttpMethod();
			case RestPackage.PROVIDES_OPERATION__URI:
				return getUri();
			case RestPackage.PROVIDES_OPERATION__WADL:
				return getWadl();
			case RestPackage.PROVIDES_OPERATION__WSDL2:
				return getWsdl2();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE:
				return getHttpBodyType();
			case RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST:
				return isBufferRequest();
			case RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES:
				return isTrustAllCertificates();
			case RestPackage.PROVIDES_OPERATION__XPATH_PARAM:
				return getXpathParam();
			case RestPackage.PROVIDES_OPERATION__AUTHENTICATION:
				return getAuthentication();
			case RestPackage.PROVIDES_OPERATION__HEADERS:
				return getHeaders();
			case RestPackage.PROVIDES_OPERATION__XSL:
				return getXsl();
			case RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS:
				return getResponseBodyAs();
			case RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION:
				return getJsonXmlMappingConvention();
			case RestPackage.PROVIDES_OPERATION__FORM_DATA:
				return getFormData();
			case RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS:
				return getOnHttpStatus();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isHttpBodyToJsonMultiplePi();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isHttpBodyFromJsonMultiplePi();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return getHttpBodyToJsonVirtualRoot();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return getHttpBodyFromJsonVirtualRoot();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isHttpBodyToJsonAutoArray();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isHttpBodyToJsonAutoPrimitive();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isHttpBodyToJsonPrettyPrint();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isHttpBodyToJsonNsDeclarations();
			case RestPackage.PROVIDES_OPERATION__NAMESPACE_MAPPING:
				return getNamespaceMapping();
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
			case RestPackage.PROVIDES_OPERATION__HTTP_METHOD:
				setHttpMethod((RestOperation)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__URI:
				setUri((String)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__WADL:
				setWadl((String)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__WSDL2:
				setWsdl2((String)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE:
				setHttpBodyType((HttpBodyType)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST:
				setBufferRequest((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES:
				setTrustAllCertificates((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__XPATH_PARAM:
				getXpathParam().clear();
				getXpathParam().addAll((Collection<? extends RestParam>)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__AUTHENTICATION:
				setAuthentication((RestAuthentication)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HEADERS:
				setHeaders((RestHeaders)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__XSL:
				setXsl((XslParameter)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS:
				setResponseBodyAs((ResponseBodyAs)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION:
				setJsonXmlMappingConvention((JsonXmlMappingConvention)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__FORM_DATA:
				getFormData().clear();
				getFormData().addAll((Collection<? extends FormData>)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS:
				getOnHttpStatus().clear();
				getOnHttpStatus().addAll((Collection<? extends OnHttpStatus>)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				setHttpBodyToJsonMultiplePi((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				setHttpBodyFromJsonMultiplePi((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot((String)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot((String)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				setHttpBodyToJsonAutoArray((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				setHttpBodyToJsonAutoPrimitive((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				setHttpBodyToJsonPrettyPrint((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				setHttpBodyToJsonNsDeclarations((Boolean)newValue);
				return;
			case RestPackage.PROVIDES_OPERATION__NAMESPACE_MAPPING:
				setNamespaceMapping((String)newValue);
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
			case RestPackage.PROVIDES_OPERATION__HTTP_METHOD:
				unsetHttpMethod();
				return;
			case RestPackage.PROVIDES_OPERATION__URI:
				setUri(URI_EDEFAULT);
				return;
			case RestPackage.PROVIDES_OPERATION__WADL:
				setWadl(WADL_EDEFAULT);
				return;
			case RestPackage.PROVIDES_OPERATION__WSDL2:
				setWsdl2(WSDL2_EDEFAULT);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE:
				unsetHttpBodyType();
				return;
			case RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST:
				unsetBufferRequest();
				return;
			case RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES:
				unsetTrustAllCertificates();
				return;
			case RestPackage.PROVIDES_OPERATION__XPATH_PARAM:
				getXpathParam().clear();
				return;
			case RestPackage.PROVIDES_OPERATION__AUTHENTICATION:
				setAuthentication((RestAuthentication)null);
				return;
			case RestPackage.PROVIDES_OPERATION__HEADERS:
				setHeaders((RestHeaders)null);
				return;
			case RestPackage.PROVIDES_OPERATION__XSL:
				setXsl((XslParameter)null);
				return;
			case RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS:
				unsetResponseBodyAs();
				return;
			case RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION:
				unsetJsonXmlMappingConvention();
				return;
			case RestPackage.PROVIDES_OPERATION__FORM_DATA:
				getFormData().clear();
				return;
			case RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS:
				getOnHttpStatus().clear();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				unsetHttpBodyToJsonMultiplePi();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				unsetHttpBodyFromJsonMultiplePi();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot(HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot(HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				unsetHttpBodyToJsonAutoArray();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				unsetHttpBodyToJsonAutoPrimitive();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				unsetHttpBodyToJsonPrettyPrint();
				return;
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				unsetHttpBodyToJsonNsDeclarations();
				return;
			case RestPackage.PROVIDES_OPERATION__NAMESPACE_MAPPING:
				setNamespaceMapping(NAMESPACE_MAPPING_EDEFAULT);
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
			case RestPackage.PROVIDES_OPERATION__HTTP_METHOD:
				return isSetHttpMethod();
			case RestPackage.PROVIDES_OPERATION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case RestPackage.PROVIDES_OPERATION__WADL:
				return WADL_EDEFAULT == null ? wadl != null : !WADL_EDEFAULT.equals(wadl);
			case RestPackage.PROVIDES_OPERATION__WSDL2:
				return WSDL2_EDEFAULT == null ? wsdl2 != null : !WSDL2_EDEFAULT.equals(wsdl2);
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TYPE:
				return isSetHttpBodyType();
			case RestPackage.PROVIDES_OPERATION__BUFFER_REQUEST:
				return isSetBufferRequest();
			case RestPackage.PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES:
				return isSetTrustAllCertificates();
			case RestPackage.PROVIDES_OPERATION__XPATH_PARAM:
				return xpathParam != null && !xpathParam.isEmpty();
			case RestPackage.PROVIDES_OPERATION__AUTHENTICATION:
				return authentication != null;
			case RestPackage.PROVIDES_OPERATION__HEADERS:
				return headers != null;
			case RestPackage.PROVIDES_OPERATION__XSL:
				return xsl != null;
			case RestPackage.PROVIDES_OPERATION__RESPONSE_BODY_AS:
				return isSetResponseBodyAs();
			case RestPackage.PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION:
				return isSetJsonXmlMappingConvention();
			case RestPackage.PROVIDES_OPERATION__FORM_DATA:
				return formData != null && !formData.isEmpty();
			case RestPackage.PROVIDES_OPERATION__ON_HTTP_STATUS:
				return onHttpStatus != null && !onHttpStatus.isEmpty();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isSetHttpBodyToJsonMultiplePi();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isSetHttpBodyFromJsonMultiplePi();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT == null ? httpBodyToJsonVirtualRoot != null : !HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT.equals(httpBodyToJsonVirtualRoot);
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT == null ? httpBodyFromJsonVirtualRoot != null : !HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT.equals(httpBodyFromJsonVirtualRoot);
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isSetHttpBodyToJsonAutoArray();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isSetHttpBodyToJsonAutoPrimitive();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isSetHttpBodyToJsonPrettyPrint();
			case RestPackage.PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isSetHttpBodyToJsonNsDeclarations();
			case RestPackage.PROVIDES_OPERATION__NAMESPACE_MAPPING:
				return NAMESPACE_MAPPING_EDEFAULT == null ? namespaceMapping != null : !NAMESPACE_MAPPING_EDEFAULT.equals(namespaceMapping);
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
		result.append(", uri: ");
		result.append(uri);
		result.append(", wadl: ");
		result.append(wadl);
		result.append(", wsdl2: ");
		result.append(wsdl2);
		result.append(", httpBodyType: ");
		if (httpBodyTypeESet) result.append(httpBodyType); else result.append("<unset>");
		result.append(", bufferRequest: ");
		if (bufferRequestESet) result.append(bufferRequest); else result.append("<unset>");
		result.append(", trustAllCertificates: ");
		if (trustAllCertificatesESet) result.append(trustAllCertificates); else result.append("<unset>");
		result.append(", responseBodyAs: ");
		if (responseBodyAsESet) result.append(responseBodyAs); else result.append("<unset>");
		result.append(", jsonXmlMappingConvention: ");
		if (jsonXmlMappingConventionESet) result.append(jsonXmlMappingConvention); else result.append("<unset>");
		result.append(", httpBodyToJsonMultiplePi: ");
		if (httpBodyToJsonMultiplePiESet) result.append(httpBodyToJsonMultiplePi); else result.append("<unset>");
		result.append(", httpBodyFromJsonMultiplePi: ");
		if (httpBodyFromJsonMultiplePiESet) result.append(httpBodyFromJsonMultiplePi); else result.append("<unset>");
		result.append(", httpBodyToJsonVirtualRoot: ");
		result.append(httpBodyToJsonVirtualRoot);
		result.append(", httpBodyFromJsonVirtualRoot: ");
		result.append(httpBodyFromJsonVirtualRoot);
		result.append(", httpBodyToJsonAutoArray: ");
		if (httpBodyToJsonAutoArrayESet) result.append(httpBodyToJsonAutoArray); else result.append("<unset>");
		result.append(", httpBodyToJsonAutoPrimitive: ");
		if (httpBodyToJsonAutoPrimitiveESet) result.append(httpBodyToJsonAutoPrimitive); else result.append("<unset>");
		result.append(", httpBodyToJsonPrettyPrint: ");
		if (httpBodyToJsonPrettyPrintESet) result.append(httpBodyToJsonPrettyPrint); else result.append("<unset>");
		result.append(", httpBodyToJsonNsDeclarations: ");
		if (httpBodyToJsonNsDeclarationsESet) result.append(httpBodyToJsonNsDeclarations); else result.append("<unset>");
		result.append(", namespaceMapping: ");
		result.append(namespaceMapping);
		result.append(')');
		return result.toString();
	}

} //ProvidesOperationImpl
