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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumes Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getPathTemplate <em>Path Template</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getIncomingPayload <em>Incoming Payload</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot1 <em>Http Body From Json Virtual Root1</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getXmlTemplate <em>Xml Template</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getOnJbiResponse <em>On Jbi Response</em>}</li>
 * </ul>
 *
 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation()
 * @model extendedMetaData="name='ConsumesOperation' kind='elementOnly'"
 * @generated
 */
public interface ConsumesOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.linagora.petals.services.rest.rest.RestOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @see #isSetHttpMethod()
	 * @see #unsetHttpMethod()
	 * @see #setHttpMethod(RestOperation)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_HttpMethod()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='http-method' namespace='##targetNamespace'"
	 * @generated
	 */
	RestOperation getHttpMethod();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod <em>Http Method</em>}' attribute.
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
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpMethod()
	 * @see #getHttpMethod()
	 * @see #setHttpMethod(RestOperation)
	 * @generated
	 */
	void unsetHttpMethod();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod <em>Http Method</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Path Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Template</em>' attribute.
	 * @see #setPathTemplate(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_PathTemplate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='path-template' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPathTemplate();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getPathTemplate <em>Path Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Template</em>' attribute.
	 * @see #getPathTemplate()
	 * @generated
	 */
	void setPathTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Http Body From Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Body From Json Virtual Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Body From Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyFromJsonVirtualRoot(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_HttpBodyFromJsonVirtualRoot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='http-body-from-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyFromJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body From Json Virtual Root</em>' attribute.
	 * @see #getHttpBodyFromJsonVirtualRoot()
	 * @generated
	 */
	void setHttpBodyFromJsonVirtualRoot(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Payload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Payload</em>' containment reference.
	 * @see #setIncomingPayload(IncomingPayload)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_IncomingPayload()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='incoming-payload' namespace='##targetNamespace'"
	 * @generated
	 */
	IncomingPayload getIncomingPayload();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getIncomingPayload <em>Incoming Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Payload</em>' containment reference.
	 * @see #getIncomingPayload()
	 * @generated
	 */
	void setIncomingPayload(IncomingPayload value);

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
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_HttpBodyFromJsonMultiplePi()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-from-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyFromJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute.
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
	 * Unsets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyFromJsonMultiplePi()
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @see #setHttpBodyFromJsonMultiplePi(boolean)
	 * @generated
	 */
	void unsetHttpBodyFromJsonMultiplePi();

	/**
	 * Returns whether the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Http Body From Json Virtual Root1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the JSON-XML conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body From Json Virtual Root1</em>' attribute.
	 * @see #setHttpBodyFromJsonVirtualRoot1(String)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_HttpBodyFromJsonVirtualRoot1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='http-body-from-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyFromJsonVirtualRoot1();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot1 <em>Http Body From Json Virtual Root1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body From Json Virtual Root1</em>' attribute.
	 * @see #getHttpBodyFromJsonVirtualRoot1()
	 * @generated
	 */
	void setHttpBodyFromJsonVirtualRoot1(String value);

	/**
	 * Returns the value of the '<em><b>Xml Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Template</em>' containment reference.
	 * @see #setXmlTemplate(EObject)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_XmlTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xml-template' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getXmlTemplate();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getXmlTemplate <em>Xml Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Template</em>' containment reference.
	 * @see #getXmlTemplate()
	 * @generated
	 */
	void setXmlTemplate(EObject value);

	/**
	 * Returns the value of the '<em><b>On Jbi Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Jbi Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Jbi Response</em>' containment reference.
	 * @see #setOnJbiResponse(OnJbiResponse)
	 * @see com.linagora.petals.services.rest.rest.RestPackage#getConsumesOperation_OnJbiResponse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='on-jbi-response' namespace='##targetNamespace'"
	 * @generated
	 */
	OnJbiResponse getOnJbiResponse();

	/**
	 * Sets the value of the '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getOnJbiResponse <em>On Jbi Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Jbi Response</em>' containment reference.
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	void setOnJbiResponse(OnJbiResponse value);

} // ConsumesOperation
