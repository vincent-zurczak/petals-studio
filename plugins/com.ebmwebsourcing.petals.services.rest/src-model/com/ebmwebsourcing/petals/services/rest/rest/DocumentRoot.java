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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getNamespaceMapping <em>Namespace Mapping</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base path to access REST resources
	 * Le chemin de base pour accéder aux ressources REST
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_BasePath()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base-path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the JSON-XML conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre JSON et XML. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body From Json Multiple Pi</em>' attribute.
	 * @see #setHttpBodyFromJsonMultiplePi(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyFromJsonMultiplePi()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-from-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyFromJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body From Json Multiple Pi</em>' attribute.
	 * @see #isHttpBodyFromJsonMultiplePi()
	 * @generated
	 */
	void setHttpBodyFromJsonMultiplePi(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body From Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the JSON-XML conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre JSON et XML. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body From Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyFromJsonVirtualRoot(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyFromJsonVirtualRoot()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-from-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyFromJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}' attribute.
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
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Auto Array</em>' attribute.
	 * @see #setHttpBodyToJsonAutoArray(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonAutoArray()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-array' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoArray();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Auto Array</em>' attribute.
	 * @see #isHttpBodyToJsonAutoArray()
	 * @generated
	 */
	void setHttpBodyToJsonAutoArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Auto Primitive</em>' attribute.
	 * @see #setHttpBodyToJsonAutoPrimitive(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonAutoPrimitive()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-auto-primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonAutoPrimitive();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Auto Primitive</em>' attribute.
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @generated
	 */
	void setHttpBodyToJsonAutoPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Multiple Pi</em>' attribute.
	 * @see #setHttpBodyToJsonMultiplePi(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonMultiplePi()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-multiple-pi' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonMultiplePi();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Multiple Pi</em>' attribute.
	 * @see #isHttpBodyToJsonMultiplePi()
	 * @generated
	 */
	void setHttpBodyToJsonMultiplePi(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Ns Declarations</em>' attribute.
	 * @see #setHttpBodyToJsonNsDeclarations(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonNsDeclarations()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-ns-declarations' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonNsDeclarations();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Ns Declarations</em>' attribute.
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @generated
	 */
	void setHttpBodyToJsonNsDeclarations(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Pretty Print</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Pretty Print</em>' attribute.
	 * @see #setHttpBodyToJsonPrettyPrint(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonPrettyPrint()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-pretty-print' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHttpBodyToJsonPrettyPrint();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Pretty Print</em>' attribute.
	 * @see #isHttpBodyToJsonPrettyPrint()
	 * @generated
	 */
	void setHttpBodyToJsonPrettyPrint(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Body To Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #setHttpBodyToJsonVirtualRoot(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_HttpBodyToJsonVirtualRoot()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-body-to-json-virtual-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpBodyToJsonVirtualRoot();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Body To Json Virtual Root</em>' attribute.
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 */
	void setHttpBodyToJsonVirtualRoot(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter drives the XML-JSON conversion. See https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * Ce paramètre pilote la conversion entre XML et JSON. Voir https://github.com/beckchr/staxon/wiki/Factory-Configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace Mapping</em>' attribute.
	 * @see #setNamespaceMapping(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.RestPackage#getDocumentRoot_NamespaceMapping()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='namespace-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamespaceMapping();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot#getNamespaceMapping <em>Namespace Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Mapping</em>' attribute.
	 * @see #getNamespaceMapping()
	 * @generated
	 */
	void setNamespaceMapping(String value);

} // DocumentRoot
