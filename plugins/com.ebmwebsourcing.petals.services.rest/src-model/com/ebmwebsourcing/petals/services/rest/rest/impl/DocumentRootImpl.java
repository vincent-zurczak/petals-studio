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

import com.ebmwebsourcing.petals.services.rest.rest.DocumentRoot;
import com.ebmwebsourcing.petals.services.rest.rest.restPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.impl.DocumentRootImpl#getNamespaceMapping <em>Namespace Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

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
	 * The default value of the '{@link #getHttpBodyFromJsonVirtualRoot() <em>Http Body From Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyFromJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT = null;

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
	 * The default value of the '{@link #isHttpBodyToJsonAutoPrimitive() <em>Http Body To Json Auto Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonAutoPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT = false;

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
	 * The default value of the '{@link #isHttpBodyToJsonNsDeclarations() <em>Http Body To Json Ns Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHttpBodyToJsonNsDeclarations()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT = false;

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
	 * The default value of the '{@link #getHttpBodyToJsonVirtualRoot() <em>Http Body To Json Virtual Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpBodyToJsonVirtualRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return restPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, restPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return (String)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__BASE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__BASE_PATH, newBasePath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyFromJsonMultiplePi() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyFromJsonMultiplePi(boolean newHttpBodyFromJsonMultiplePi) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI, newHttpBodyFromJsonMultiplePi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpBodyFromJsonVirtualRoot() {
		return (String)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyFromJsonVirtualRoot(String newHttpBodyFromJsonVirtualRoot) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT, newHttpBodyFromJsonVirtualRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonAutoArray() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonAutoArray(boolean newHttpBodyToJsonAutoArray) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY, newHttpBodyToJsonAutoArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonAutoPrimitive() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonAutoPrimitive(boolean newHttpBodyToJsonAutoPrimitive) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE, newHttpBodyToJsonAutoPrimitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonMultiplePi() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonMultiplePi(boolean newHttpBodyToJsonMultiplePi) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI, newHttpBodyToJsonMultiplePi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonNsDeclarations() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonNsDeclarations(boolean newHttpBodyToJsonNsDeclarations) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS, newHttpBodyToJsonNsDeclarations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHttpBodyToJsonPrettyPrint() {
		return (Boolean)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonPrettyPrint(boolean newHttpBodyToJsonPrettyPrint) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT, newHttpBodyToJsonPrettyPrint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpBodyToJsonVirtualRoot() {
		return (String)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpBodyToJsonVirtualRoot(String newHttpBodyToJsonVirtualRoot) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT, newHttpBodyToJsonVirtualRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceMapping() {
		return (String)getMixed().get(restPackage.Literals.DOCUMENT_ROOT__NAMESPACE_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceMapping(String newNamespaceMapping) {
		((FeatureMap.Internal)getMixed()).set(restPackage.Literals.DOCUMENT_ROOT__NAMESPACE_MAPPING, newNamespaceMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case restPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case restPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case restPackage.DOCUMENT_ROOT__BASE_PATH:
				return getBasePath();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isHttpBodyFromJsonMultiplePi();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return getHttpBodyFromJsonVirtualRoot();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isHttpBodyToJsonAutoArray();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isHttpBodyToJsonAutoPrimitive();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isHttpBodyToJsonMultiplePi();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isHttpBodyToJsonNsDeclarations();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isHttpBodyToJsonPrettyPrint();
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return getHttpBodyToJsonVirtualRoot();
			case restPackage.DOCUMENT_ROOT__NAMESPACE_MAPPING:
				return getNamespaceMapping();
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
			case restPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case restPackage.DOCUMENT_ROOT__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				setHttpBodyFromJsonMultiplePi((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot((String)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				setHttpBodyToJsonAutoArray((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				setHttpBodyToJsonAutoPrimitive((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				setHttpBodyToJsonMultiplePi((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				setHttpBodyToJsonNsDeclarations((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				setHttpBodyToJsonPrettyPrint((Boolean)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot((String)newValue);
				return;
			case restPackage.DOCUMENT_ROOT__NAMESPACE_MAPPING:
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
			case restPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case restPackage.DOCUMENT_ROOT__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				setHttpBodyFromJsonMultiplePi(HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				setHttpBodyFromJsonVirtualRoot(HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				setHttpBodyToJsonAutoArray(HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				setHttpBodyToJsonAutoPrimitive(HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				setHttpBodyToJsonMultiplePi(HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				setHttpBodyToJsonNsDeclarations(HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				setHttpBodyToJsonPrettyPrint(HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				setHttpBodyToJsonVirtualRoot(HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT);
				return;
			case restPackage.DOCUMENT_ROOT__NAMESPACE_MAPPING:
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
			case restPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case restPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case restPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case restPackage.DOCUMENT_ROOT__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? getBasePath() != null : !BASE_PATH_EDEFAULT.equals(getBasePath());
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_MULTIPLE_PI:
				return isHttpBodyFromJsonMultiplePi() != HTTP_BODY_FROM_JSON_MULTIPLE_PI_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT == null ? getHttpBodyFromJsonVirtualRoot() != null : !HTTP_BODY_FROM_JSON_VIRTUAL_ROOT_EDEFAULT.equals(getHttpBodyFromJsonVirtualRoot());
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_ARRAY:
				return isHttpBodyToJsonAutoArray() != HTTP_BODY_TO_JSON_AUTO_ARRAY_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE:
				return isHttpBodyToJsonAutoPrimitive() != HTTP_BODY_TO_JSON_AUTO_PRIMITIVE_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_MULTIPLE_PI:
				return isHttpBodyToJsonMultiplePi() != HTTP_BODY_TO_JSON_MULTIPLE_PI_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_NS_DECLARATIONS:
				return isHttpBodyToJsonNsDeclarations() != HTTP_BODY_TO_JSON_NS_DECLARATIONS_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_PRETTY_PRINT:
				return isHttpBodyToJsonPrettyPrint() != HTTP_BODY_TO_JSON_PRETTY_PRINT_EDEFAULT;
			case restPackage.DOCUMENT_ROOT__HTTP_BODY_TO_JSON_VIRTUAL_ROOT:
				return HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT == null ? getHttpBodyToJsonVirtualRoot() != null : !HTTP_BODY_TO_JSON_VIRTUAL_ROOT_EDEFAULT.equals(getHttpBodyToJsonVirtualRoot());
			case restPackage.DOCUMENT_ROOT__NAMESPACE_MAPPING:
				return NAMESPACE_MAPPING_EDEFAULT == null ? getNamespaceMapping() != null : !NAMESPACE_MAPPING_EDEFAULT.equals(getNamespaceMapping());
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
