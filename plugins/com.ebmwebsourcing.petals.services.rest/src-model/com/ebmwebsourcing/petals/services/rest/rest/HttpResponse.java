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
package com.ebmwebsourcing.petals.services.rest.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getHeader <em>Header</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse()
 * @model extendedMetaData="name='HttpResponse' kind='elementOnly'"
 * @generated
 */
public interface HttpResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link com.ebmwebsourcing.petals.services.rest.rest.RestHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RestHeader> getHeader();

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
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonMultiplePi()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonMultiplePi()
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @see #setHttpBodyToJsonMultiplePi(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonMultiplePi();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Http Body To Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyToJsonVirtualRoot(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonVirtualRoot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='http-body-to-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyToJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 */
	void setHttpBodyToJsonVirtualRoot(String value);

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
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonAutoArray()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-array' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoArray();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonAutoArray()
	 * @see #isHttpBodyToJsonAutoArray()
	 * @see #setHttpBodyToJsonAutoArray(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonAutoArray();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute is set.
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
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonAutoPrimitive()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoPrimitive();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonAutoPrimitive()
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @see #setHttpBodyToJsonAutoPrimitive(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonAutoPrimitive();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute is set.
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
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonPrettyPrint()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-pretty-print' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonPrettyPrint();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonPrettyPrint()
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @see #setHttpBodyToJsonPrettyPrint(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonPrettyPrint();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute is set.
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
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_HttpBodyToJsonNsDeclarations()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='http-body-to-json-ns-declarations' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonNsDeclarations();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute.
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
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHttpBodyToJsonNsDeclarations()
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @see #setHttpBodyToJsonNsDeclarations(boolean)
	 * @generated
	 */
	void unsetHttpBodyToJsonNsDeclarations();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(int)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getHttpResponse_Code()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.HttpResponse#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	boolean isSetCode();

} // HttpResponse
