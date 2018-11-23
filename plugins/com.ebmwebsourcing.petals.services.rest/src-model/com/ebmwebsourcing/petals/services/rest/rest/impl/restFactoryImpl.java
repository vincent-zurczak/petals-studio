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

import com.ebmwebsourcing.petals.services.rest.rest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class restFactoryImpl extends EFactoryImpl implements restFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static restFactory init() {
		try {
			restFactory therestFactory = (restFactory)EPackage.Registry.INSTANCE.getEFactory(restPackage.eNS_URI);
			if (therestFactory != null) {
				return therestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new restFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public restFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case restPackage.CONDITION: return createCondition();
			case restPackage.CONSUMES: return createConsumes();
			case restPackage.CONSUMES_MAPPING: return createConsumesMapping();
			case restPackage.CONSUMES_OPERATION: return createConsumesOperation();
			case restPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case restPackage.FORM_DATA: return createFormData();
			case restPackage.HTTP_RESPONSE: return createHttpResponse();
			case restPackage.INCOMING_PAYLOAD: return createIncomingPayload();
			case restPackage.JWT_CLAIM: return createJwtClaim();
			case restPackage.JWT_SIGNATURE: return createJwtSignature();
			case restPackage.ON_CASE: return createOnCase();
			case restPackage.ON_HTTP_STATUS: return createOnHttpStatus();
			case restPackage.ON_JBI_RESPONSE: return createOnJbiResponse();
			case restPackage.OTHERWISE: return createOtherwise();
			case restPackage.PROVIDES: return createProvides();
			case restPackage.PROVIDES_MAPPING: return createProvidesMapping();
			case restPackage.PROVIDES_OPERATION: return createProvidesOperation();
			case restPackage.REST_AUTHENTICATION: return createRestAuthentication();
			case restPackage.REST_BASIC_AUTHENTICATION: return createRestBasicAuthentication();
			case restPackage.REST_HEADER: return createRestHeader();
			case restPackage.REST_HEADERS: return createRestHeaders();
			case restPackage.REST_JWT_AUTHENTICATION: return createRestJwtAuthentication();
			case restPackage.REST_NTLM_AUTHENTICATION: return createRestNtlmAuthentication();
			case restPackage.REST_PARAM: return createRestParam();
			case restPackage.REST_PROPERTY: return createRestProperty();
			case restPackage.TRANSFORMATION: return createTransformation();
			case restPackage.XPATH_CONDITION: return createXPathCondition();
			case restPackage.XSL_PARAMETER: return createXslParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case restPackage.HTTP_BODY_TYPE:
				return createHttpBodyTypeFromString(eDataType, initialValue);
			case restPackage.JSON_XML_MAPPING_CONVENTION:
				return createJsonXmlMappingConventionFromString(eDataType, initialValue);
			case restPackage.JWT_COMPRESSION:
				return createJwtCompressionFromString(eDataType, initialValue);
			case restPackage.RESPONSE_BODY_AS:
				return createResponseBodyAsFromString(eDataType, initialValue);
			case restPackage.REST_OPERATION:
				return createRestOperationFromString(eDataType, initialValue);
			case restPackage.HTTP_BODY_TYPE_OBJECT:
				return createHttpBodyTypeObjectFromString(eDataType, initialValue);
			case restPackage.JSON_XML_MAPPING_CONVENTION_OBJECT:
				return createJsonXmlMappingConventionObjectFromString(eDataType, initialValue);
			case restPackage.JWT_COMPRESSION_OBJECT:
				return createJwtCompressionObjectFromString(eDataType, initialValue);
			case restPackage.RESPONSE_BODY_AS_OBJECT:
				return createResponseBodyAsObjectFromString(eDataType, initialValue);
			case restPackage.REST_OPERATION_OBJECT:
				return createRestOperationObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case restPackage.HTTP_BODY_TYPE:
				return convertHttpBodyTypeToString(eDataType, instanceValue);
			case restPackage.JSON_XML_MAPPING_CONVENTION:
				return convertJsonXmlMappingConventionToString(eDataType, instanceValue);
			case restPackage.JWT_COMPRESSION:
				return convertJwtCompressionToString(eDataType, instanceValue);
			case restPackage.RESPONSE_BODY_AS:
				return convertResponseBodyAsToString(eDataType, instanceValue);
			case restPackage.REST_OPERATION:
				return convertRestOperationToString(eDataType, instanceValue);
			case restPackage.HTTP_BODY_TYPE_OBJECT:
				return convertHttpBodyTypeObjectToString(eDataType, instanceValue);
			case restPackage.JSON_XML_MAPPING_CONVENTION_OBJECT:
				return convertJsonXmlMappingConventionObjectToString(eDataType, instanceValue);
			case restPackage.JWT_COMPRESSION_OBJECT:
				return convertJwtCompressionObjectToString(eDataType, instanceValue);
			case restPackage.RESPONSE_BODY_AS_OBJECT:
				return convertResponseBodyAsObjectToString(eDataType, instanceValue);
			case restPackage.REST_OPERATION_OBJECT:
				return convertRestOperationObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumes createConsumes() {
		ConsumesImpl consumes = new ConsumesImpl();
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumesMapping createConsumesMapping() {
		ConsumesMappingImpl consumesMapping = new ConsumesMappingImpl();
		return consumesMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumesOperation createConsumesOperation() {
		ConsumesOperationImpl consumesOperation = new ConsumesOperationImpl();
		return consumesOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormData createFormData() {
		FormDataImpl formData = new FormDataImpl();
		return formData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpResponse createHttpResponse() {
		HttpResponseImpl httpResponse = new HttpResponseImpl();
		return httpResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingPayload createIncomingPayload() {
		IncomingPayloadImpl incomingPayload = new IncomingPayloadImpl();
		return incomingPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtClaim createJwtClaim() {
		JwtClaimImpl jwtClaim = new JwtClaimImpl();
		return jwtClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtSignature createJwtSignature() {
		JwtSignatureImpl jwtSignature = new JwtSignatureImpl();
		return jwtSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnCase createOnCase() {
		OnCaseImpl onCase = new OnCaseImpl();
		return onCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnHttpStatus createOnHttpStatus() {
		OnHttpStatusImpl onHttpStatus = new OnHttpStatusImpl();
		return onHttpStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnJbiResponse createOnJbiResponse() {
		OnJbiResponseImpl onJbiResponse = new OnJbiResponseImpl();
		return onJbiResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Otherwise createOtherwise() {
		OtherwiseImpl otherwise = new OtherwiseImpl();
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provides createProvides() {
		ProvidesImpl provides = new ProvidesImpl();
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesMapping createProvidesMapping() {
		ProvidesMappingImpl providesMapping = new ProvidesMappingImpl();
		return providesMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesOperation createProvidesOperation() {
		ProvidesOperationImpl providesOperation = new ProvidesOperationImpl();
		return providesOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAuthentication createRestAuthentication() {
		RestAuthenticationImpl restAuthentication = new RestAuthenticationImpl();
		return restAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestBasicAuthentication createRestBasicAuthentication() {
		RestBasicAuthenticationImpl restBasicAuthentication = new RestBasicAuthenticationImpl();
		return restBasicAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestHeader createRestHeader() {
		RestHeaderImpl restHeader = new RestHeaderImpl();
		return restHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestHeaders createRestHeaders() {
		RestHeadersImpl restHeaders = new RestHeadersImpl();
		return restHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestJwtAuthentication createRestJwtAuthentication() {
		RestJwtAuthenticationImpl restJwtAuthentication = new RestJwtAuthenticationImpl();
		return restJwtAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestNtlmAuthentication createRestNtlmAuthentication() {
		RestNtlmAuthenticationImpl restNtlmAuthentication = new RestNtlmAuthenticationImpl();
		return restNtlmAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestParam createRestParam() {
		RestParamImpl restParam = new RestParamImpl();
		return restParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestProperty createRestProperty() {
		RestPropertyImpl restProperty = new RestPropertyImpl();
		return restProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathCondition createXPathCondition() {
		XPathConditionImpl xPathCondition = new XPathConditionImpl();
		return xPathCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XslParameter createXslParameter() {
		XslParameterImpl xslParameter = new XslParameterImpl();
		return xslParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpBodyType createHttpBodyTypeFromString(EDataType eDataType, String initialValue) {
		HttpBodyType result = HttpBodyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpBodyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonXmlMappingConvention createJsonXmlMappingConventionFromString(EDataType eDataType, String initialValue) {
		JsonXmlMappingConvention result = JsonXmlMappingConvention.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonXmlMappingConventionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtCompression createJwtCompressionFromString(EDataType eDataType, String initialValue) {
		JwtCompression result = JwtCompression.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJwtCompressionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBodyAs createResponseBodyAsFromString(EDataType eDataType, String initialValue) {
		ResponseBodyAs result = ResponseBodyAs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseBodyAsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestOperation createRestOperationFromString(EDataType eDataType, String initialValue) {
		RestOperation result = RestOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpBodyType createHttpBodyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHttpBodyTypeFromString(restPackage.Literals.HTTP_BODY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpBodyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHttpBodyTypeToString(restPackage.Literals.HTTP_BODY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonXmlMappingConvention createJsonXmlMappingConventionObjectFromString(EDataType eDataType, String initialValue) {
		return createJsonXmlMappingConventionFromString(restPackage.Literals.JSON_XML_MAPPING_CONVENTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonXmlMappingConventionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJsonXmlMappingConventionToString(restPackage.Literals.JSON_XML_MAPPING_CONVENTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JwtCompression createJwtCompressionObjectFromString(EDataType eDataType, String initialValue) {
		return createJwtCompressionFromString(restPackage.Literals.JWT_COMPRESSION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJwtCompressionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertJwtCompressionToString(restPackage.Literals.JWT_COMPRESSION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBodyAs createResponseBodyAsObjectFromString(EDataType eDataType, String initialValue) {
		return createResponseBodyAsFromString(restPackage.Literals.RESPONSE_BODY_AS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseBodyAsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResponseBodyAsToString(restPackage.Literals.RESPONSE_BODY_AS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestOperation createRestOperationObjectFromString(EDataType eDataType, String initialValue) {
		return createRestOperationFromString(restPackage.Literals.REST_OPERATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestOperationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestOperationToString(restPackage.Literals.REST_OPERATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public restPackage getrestPackage() {
		return (restPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static restPackage getPackage() {
		return restPackage.eINSTANCE;
	}

} //restFactoryImpl
