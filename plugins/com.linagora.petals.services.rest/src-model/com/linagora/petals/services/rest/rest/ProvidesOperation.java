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
package com.linagora.petals.services.rest.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getUri <em>Uri</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWadl <em>Wadl</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWsdl2 <em>Wsdl2</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType <em>Http Body Type</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest <em>Buffer Request</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates <em>Trust All Certificates</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getXpathParam <em>Xpath Param</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHeaders <em>Headers</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getXsl <em>Xsl</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs <em>Response Body As</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getFormData <em>Form Data</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getOnHttpStatus <em>On Http Status</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getNamespaceMapping <em>Namespace Mapping</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation()
 * @model extendedMetaData="name='ProvidesOperation' kind='elementOnly'"
 * @generated
 */
public interface ProvidesOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.RestOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The REST method to invoke.
	 * L'opération REST à invoquer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @see #isSetHttpMethod()
	 * @see #unsetHttpMethod()
	 * @see #setHttpMethod(RestOperation)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='http-method' namespace='##targetNamespace'"
	 * @generated
	 */
	RestOperation getHttpMethod();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @see #isSetHttpMethod()
	 * @see #unsetHttpMethod()
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(RestOperation value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpMethod()
	 * @see #getHttpMethod()
	 * @see #setHttpMethod(RestOperation)
	 * @generated
	 */
	void unsetHttpMethod();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod <em>Http Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Method</em>' attribute is set.
	 * @see #unsetHttpMethod()
	 * @see #getHttpMethod()
	 * @see #setHttpMethod(RestOperation)
	 * @generated
	 */
	boolean isSetHttpMethod();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL of the REST end-point to invoke.
	 * L'URL du service REST à appeler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Wadl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An URL pointing to a WASL file.
	 * L'URL d'un fichier WADL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wadl</em>' attribute.
	 * @see #setWadl(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Wadl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='wadl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWadl();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWadl <em>Wadl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wadl</em>' attribute.
	 * @see #getWadl()
	 * @generated
	 */
	void setWadl(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An URL pointing to a WSDL 2.0 file.
	 * L'URL d'un WSDL 2.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wsdl2</em>' attribute.
	 * @see #setWsdl2(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Wsdl2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='wsdl2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWsdl2();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWsdl2 <em>Wsdl2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl2</em>' attribute.
	 * @see #getWsdl2()
	 * @generated
	 */
	void setWsdl2(String value);

	/**
	 * Returns the value of the '<em><b>Http Body Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.HttpBodyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Body Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Body Type</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @see #isSetHttpBodyType()
	 * @see #unsetHttpBodyType()
	 * @see #setHttpBodyType(HttpBodyType)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='http-body-type' namespace='##targetNamespace'"
	 * @generated
	 */
	HttpBodyType getHttpBodyType();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType <em>Http Body Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body Type</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @see #isSetHttpBodyType()
	 * @see #unsetHttpBodyType()
	 * @see #getHttpBodyType()
	 * @generated
	 */
	void setHttpBodyType(HttpBodyType value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType <em>Http Body Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyType()
	 * @see #getHttpBodyType()
	 * @see #setHttpBodyType(HttpBodyType)
	 * @generated
	 */
	void unsetHttpBodyType();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType <em>Http Body Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body Type</em>' attribute is set.
	 * @see #unsetHttpBodyType()
	 * @see #getHttpBodyType()
	 * @see #setHttpBodyType(HttpBodyType)
	 * @generated
	 */
	boolean isSetHttpBodyType();

	/**
	 * Returns the value of the '<em><b>Buffer Request</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Request</em>' attribute.
	 * @see #isSetBufferRequest()
	 * @see #unsetBufferRequest()
	 * @see #setBufferRequest(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_BufferRequest()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='buffer-request' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBufferRequest();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest <em>Buffer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Request</em>' attribute.
	 * @see #isSetBufferRequest()
	 * @see #unsetBufferRequest()
	 * @see #isBufferRequest()
	 * @generated
	 */
	void setBufferRequest(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest <em>Buffer Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBufferRequest()
	 * @see #isBufferRequest()
	 * @see #setBufferRequest(boolean)
	 * @generated
	 */
	void unsetBufferRequest();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest <em>Buffer Request</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buffer Request</em>' attribute is set.
	 * @see #unsetBufferRequest()
	 * @see #isBufferRequest()
	 * @see #setBufferRequest(boolean)
	 * @generated
	 */
	boolean isSetBufferRequest();

	/**
	 * Returns the value of the '<em><b>Trust All Certificates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust All Certificates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust All Certificates</em>' attribute.
	 * @see #isSetTrustAllCertificates()
	 * @see #unsetTrustAllCertificates()
	 * @see #setTrustAllCertificates(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_TrustAllCertificates()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='trust-all-certificates' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTrustAllCertificates();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates <em>Trust All Certificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust All Certificates</em>' attribute.
	 * @see #isSetTrustAllCertificates()
	 * @see #unsetTrustAllCertificates()
	 * @see #isTrustAllCertificates()
	 * @generated
	 */
	void setTrustAllCertificates(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates <em>Trust All Certificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrustAllCertificates()
	 * @see #isTrustAllCertificates()
	 * @see #setTrustAllCertificates(boolean)
	 * @generated
	 */
	void unsetTrustAllCertificates();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates <em>Trust All Certificates</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trust All Certificates</em>' attribute is set.
	 * @see #unsetTrustAllCertificates()
	 * @see #isTrustAllCertificates()
	 * @see #setTrustAllCertificates(boolean)
	 * @generated
	 */
	boolean isSetTrustAllCertificates();

	/**
	 * Returns the value of the '<em><b>Xpath Param</b></em>' containment reference list.
	 * The list contents are of type {@link com.linagora.petals.services.rest.rest.RestParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath Param</em>' containment reference list.
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_XpathParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xpath-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestParam> getXpathParam();

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(RestAuthentication)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Authentication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='authentication' namespace='##targetNamespace'"
	 * @generated
	 */
	RestAuthentication getAuthentication();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(RestAuthentication value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference.
	 * @see #setHeaders(RestHeaders)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Headers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='headers' namespace='##targetNamespace'"
	 * @generated
	 */
	RestHeaders getHeaders();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHeaders <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' containment reference.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(RestHeaders value);

	/**
	 * Returns the value of the '<em><b>Xsl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xsl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsl</em>' containment reference.
	 * @see #setXsl(XslParameter)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_Xsl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsl' namespace='##targetNamespace'"
	 * @generated
	 */
	XslParameter getXsl();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getXsl <em>Xsl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsl</em>' containment reference.
	 * @see #getXsl()
	 * @generated
	 */
	void setXsl(XslParameter value);

	/**
	 * Returns the value of the '<em><b>Response Body As</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.ResponseBodyAs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Body As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Body As</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @see #isSetResponseBodyAs()
	 * @see #unsetResponseBodyAs()
	 * @see #setResponseBodyAs(ResponseBodyAs)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_ResponseBodyAs()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='response-body-as' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseBodyAs getResponseBodyAs();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs <em>Response Body As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Body As</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @see #isSetResponseBodyAs()
	 * @see #unsetResponseBodyAs()
	 * @see #getResponseBodyAs()
	 * @generated
	 */
	void setResponseBodyAs(ResponseBodyAs value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs <em>Response Body As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponseBodyAs()
	 * @see #getResponseBodyAs()
	 * @see #setResponseBodyAs(ResponseBodyAs)
	 * @generated
	 */
	void unsetResponseBodyAs();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs <em>Response Body As</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Response Body As</em>' attribute is set.
	 * @see #unsetResponseBodyAs()
	 * @see #getResponseBodyAs()
	 * @see #setResponseBodyAs(ResponseBodyAs)
	 * @generated
	 */
	boolean isSetResponseBodyAs();

	/**
	 * Returns the value of the '<em><b>Json Xml Mapping Convention</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.JsonXmlMappingConvention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Xml Mapping Convention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Xml Mapping Convention</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @see #isSetJsonXmlMappingConvention()
	 * @see #unsetJsonXmlMappingConvention()
	 * @see #setJsonXmlMappingConvention(JsonXmlMappingConvention)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_JsonXmlMappingConvention()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='json-xml-mapping-convention' namespace='##targetNamespace'"
	 * @generated
	 */
	JsonXmlMappingConvention getJsonXmlMappingConvention();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Xml Mapping Convention</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @see #isSetJsonXmlMappingConvention()
	 * @see #unsetJsonXmlMappingConvention()
	 * @see #getJsonXmlMappingConvention()
	 * @generated
	 */
	void setJsonXmlMappingConvention(JsonXmlMappingConvention value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJsonXmlMappingConvention()
	 * @see #getJsonXmlMappingConvention()
	 * @see #setJsonXmlMappingConvention(JsonXmlMappingConvention)
	 * @generated
	 */
	void unsetJsonXmlMappingConvention();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Json Xml Mapping Convention</em>' attribute is set.
	 * @see #unsetJsonXmlMappingConvention()
	 * @see #getJsonXmlMappingConvention()
	 * @see #setJsonXmlMappingConvention(JsonXmlMappingConvention)
	 * @generated
	 */
	boolean isSetJsonXmlMappingConvention();

	/**
	 * Returns the value of the '<em><b>Form Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.linagora.petals.services.rest.rest.FormData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Data</em>' containment reference list.
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_FormData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form-data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormData> getFormData();

	/**
	 * Returns the value of the '<em><b>On Http Status</b></em>' containment reference list.
	 * The list contents are of type {@link com.linagora.petals.services.rest.rest.OnHttpStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Http Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Http Status</em>' containment reference list.
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_OnHttpStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='on-http-status' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnHttpStatus> getOnHttpStatus();

	/**
	 * Returns the value of the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Multiple Pi</em>' attribute.
	 * @see #isSetHttpBodyToJsonMultiplePi()
	 * @see #unsetHttpBodyToJsonMultiplePi()
	 * @see #setHttpBodyToJsonMultiplePi(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonMultiplePi()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Multiple Pi</em>' attribute.
	 * @see #isSetHttpBodyToJsonMultiplePi()
	 * @see #unsetHttpBodyToJsonMultiplePi()
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @generated
	 */
	void setHttpBodyToJsonMultiplePi(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonMultiplePi()
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @see #setHttpBodyToJsonMultiplePi(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonMultiplePi();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body To Json Multiple Pi</em>' attribute is set.
	 * @see #unsetHttpBodyToJsonMultiplePi()
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @see #setHttpBodyToJsonMultiplePi(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyToJsonMultiplePi();

	/**
	 * Returns the value of the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the JSON-XML conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body From Json Multiple Pi</em>' attribute.
	 * @see #isSetHttpBodyFromJsonMultiplePi()
	 * @see #unsetHttpBodyFromJsonMultiplePi()
	 * @see #setHttpBodyFromJsonMultiplePi(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyFromJsonMultiplePi()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-from-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyFromJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body From Json Multiple Pi</em>' attribute.
	 * @see #isSetHttpBodyFromJsonMultiplePi()
	 * @see #unsetHttpBodyFromJsonMultiplePi()
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @generated
	 */
	void setHttpBodyFromJsonMultiplePi(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyFromJsonMultiplePi()
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @see #setHttpBodyFromJsonMultiplePi(boolean)
	 * @generated
	 */
	void unsetHttpBodyFromJsonMultiplePi();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body From Json Multiple Pi</em>' attribute is set.
	 * @see #unsetHttpBodyFromJsonMultiplePi()
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @see #setHttpBodyFromJsonMultiplePi(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyFromJsonMultiplePi();

	/**
	 * Returns the value of the '<em><b>Http Body To Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyToJsonVirtualRoot(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonVirtualRoot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='http-body-to-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyToJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 */
	void setHttpBodyToJsonVirtualRoot(String value);

	/**
	 * Returns the value of the '<em><b>Http Body From Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the JSON-XML conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body From Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyFromJsonVirtualRoot(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyFromJsonVirtualRoot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='http-body-from-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyFromJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body From Json Virtual Root</em>' attribute.
	 * @see #getHttpBodyFromJsonVirtualRoot()
	 * @generated
	 */
	void setHttpBodyFromJsonVirtualRoot(String value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Auto Array</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Auto Array</em>' attribute.
	 * @see #isSetHttpBodyToJsonAutoArray()
	 * @see #unsetHttpBodyToJsonAutoArray()
	 * @see #setHttpBodyToJsonAutoArray(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonAutoArray()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-array' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoArray();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Auto Array</em>' attribute.
	 * @see #isSetHttpBodyToJsonAutoArray()
	 * @see #unsetHttpBodyToJsonAutoArray()
	 * @see #isHttpBodyToJsonAutoArray()
	 * @generated
	 */
	void setHttpBodyToJsonAutoArray(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonAutoArray()
	 * @see #isHttpBodyToJsonAutoArray()
	 * @see #setHttpBodyToJsonAutoArray(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonAutoArray();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body To Json Auto Array</em>' attribute is set.
	 * @see #unsetHttpBodyToJsonAutoArray()
	 * @see #isHttpBodyToJsonAutoArray()
	 * @see #setHttpBodyToJsonAutoArray(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyToJsonAutoArray();

	/**
	 * Returns the value of the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Auto Primitive</em>' attribute.
	 * @see #isSetHttpBodyToJsonAutoPrimitive()
	 * @see #unsetHttpBodyToJsonAutoPrimitive()
	 * @see #setHttpBodyToJsonAutoPrimitive(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonAutoPrimitive()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoPrimitive();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Auto Primitive</em>' attribute.
	 * @see #isSetHttpBodyToJsonAutoPrimitive()
	 * @see #unsetHttpBodyToJsonAutoPrimitive()
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @generated
	 */
	void setHttpBodyToJsonAutoPrimitive(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonAutoPrimitive()
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @see #setHttpBodyToJsonAutoPrimitive(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonAutoPrimitive();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body To Json Auto Primitive</em>' attribute is set.
	 * @see #unsetHttpBodyToJsonAutoPrimitive()
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @see #setHttpBodyToJsonAutoPrimitive(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyToJsonAutoPrimitive();

	/**
	 * Returns the value of the '<em><b>Http Body To Json Pretty Print</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Pretty Print</em>' attribute.
	 * @see #isSetHttpBodyToJsonPrettyPrint()
	 * @see #unsetHttpBodyToJsonPrettyPrint()
	 * @see #setHttpBodyToJsonPrettyPrint(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonPrettyPrint()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-pretty-print' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonPrettyPrint();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Pretty Print</em>' attribute.
	 * @see #isSetHttpBodyToJsonPrettyPrint()
	 * @see #unsetHttpBodyToJsonPrettyPrint()
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @generated
	 */
	void setHttpBodyToJsonPrettyPrint(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonPrettyPrint()
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @see #setHttpBodyToJsonPrettyPrint(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonPrettyPrint();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body To Json Pretty Print</em>' attribute is set.
	 * @see #unsetHttpBodyToJsonPrettyPrint()
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @see #setHttpBodyToJsonPrettyPrint(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyToJsonPrettyPrint();

	/**
	 * Returns the value of the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Ns Declarations</em>' attribute.
	 * @see #isSetHttpBodyToJsonNsDeclarations()
	 * @see #unsetHttpBodyToJsonNsDeclarations()
	 * @see #setHttpBodyToJsonNsDeclarations(boolean)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_HttpBodyToJsonNsDeclarations()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-ns-declarations' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonNsDeclarations();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Ns Declarations</em>' attribute.
	 * @see #isSetHttpBodyToJsonNsDeclarations()
	 * @see #unsetHttpBodyToJsonNsDeclarations()
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @generated
	 */
	void setHttpBodyToJsonNsDeclarations(boolean value);

	/**
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonNsDeclarations()
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @see #setHttpBodyToJsonNsDeclarations(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonNsDeclarations();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Http Body To Json Ns Declarations</em>' attribute is set.
	 * @see #unsetHttpBodyToJsonNsDeclarations()
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @see #setHttpBodyToJsonNsDeclarations(boolean)
	 * @generated
	 */
	boolean isSetHttpBodyToJsonNsDeclarations();

	/**
	 * Returns the value of the '<em><b>Namespace Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Mapping</em>' attribute.
	 * @see #setNamespaceMapping(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getProvidesOperation_NamespaceMapping()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='namespace-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamespaceMapping();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getNamespaceMapping <em>Namespace Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Mapping</em>' attribute.
	 * @see #getNamespaceMapping()
	 * @generated
	 */
	void setNamespaceMapping(String value);

} // ProvidesOperation
