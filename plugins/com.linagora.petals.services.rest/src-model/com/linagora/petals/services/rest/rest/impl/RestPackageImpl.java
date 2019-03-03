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
package com.linagora.petals.services.rest.rest.impl;

import com.linagora.petals.services.rest.rest.Condition;
import com.linagora.petals.services.rest.rest.ConsumesMapping;
import com.linagora.petals.services.rest.rest.ConsumesOperation;
import com.linagora.petals.services.rest.rest.FormData;
import com.linagora.petals.services.rest.rest.HttpBodyType;
import com.linagora.petals.services.rest.rest.HttpResponse;
import com.linagora.petals.services.rest.rest.IncomingPayload;
import com.linagora.petals.services.rest.rest.JsonXmlMappingConvention;
import com.linagora.petals.services.rest.rest.JwtClaim;
import com.linagora.petals.services.rest.rest.JwtCompression;
import com.linagora.petals.services.rest.rest.JwtSignature;
import com.linagora.petals.services.rest.rest.OnCase;
import com.linagora.petals.services.rest.rest.OnHttpStatus;
import com.linagora.petals.services.rest.rest.OnJbiResponse;
import com.linagora.petals.services.rest.rest.Otherwise;
import com.linagora.petals.services.rest.rest.ProvidesMapping;
import com.linagora.petals.services.rest.rest.ProvidesOperation;
import com.linagora.petals.services.rest.rest.ResponseBodyAs;
import com.linagora.petals.services.rest.rest.RestAuthentication;
import com.linagora.petals.services.rest.rest.RestBasicAuthentication;
import com.linagora.petals.services.rest.rest.RestConsumes;
import com.linagora.petals.services.rest.rest.RestFactory;
import com.linagora.petals.services.rest.rest.RestHeader;
import com.linagora.petals.services.rest.rest.RestHeaders;
import com.linagora.petals.services.rest.rest.RestJwtAuthentication;
import com.linagora.petals.services.rest.rest.RestNtlmAuthentication;
import com.linagora.petals.services.rest.rest.RestOperation;
import com.linagora.petals.services.rest.rest.RestPackage;
import com.linagora.petals.services.rest.rest.RestParam;
import com.linagora.petals.services.rest.rest.RestProperty;
import com.linagora.petals.services.rest.rest.RestProvides;

import com.linagora.petals.services.rest.rest.Transformation;
import com.linagora.petals.services.rest.rest.XPathCondition;
import com.linagora.petals.services.rest.rest.XslParameter;
import com.sun.java.xml.ns.jbi.JbiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestPackageImpl extends EPackageImpl implements RestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restConsumesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumesMappingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumesOperationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formDataEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpResponseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingPayloadEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtClaimEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jwtSignatureEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onCaseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onHttpStatusEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onJbiResponseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherwiseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesMappingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesOperationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restAuthenticationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restBasicAuthenticationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restHeaderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restHeadersEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restJwtAuthenticationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restNtlmAuthenticationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restParamEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restPropertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPathConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xslParameterEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpBodyTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonXmlMappingConventionEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jwtCompressionEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseBodyAsEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restOperationEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpBodyTypeObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonXmlMappingConventionObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jwtCompressionObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType responseBodyAsObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restOperationObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.linagora.petals.services.rest.rest.RestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestPackageImpl() {
		super(eNS_URI, RestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestPackage init() {
		if (isInited) return (RestPackage)EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RestPackageImpl theRestPackage = registeredRestPackage instanceof RestPackageImpl ? (RestPackageImpl)registeredRestPackage : new RestPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		JbiPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRestPackage.createPackageContents();

		// Initialize created meta-data
		theRestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestPackage.eNS_URI, theRestPackage);
		return theRestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestProvides() {
		return restProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestProvides_BasePath() {
		return (EAttribute)restProvidesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestProvides_Mapping() {
		return (EReference)restProvidesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestConsumes() {
		return restConsumesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestConsumes_BasePath() {
		return (EAttribute)restConsumesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestConsumes_Mapping() {
		return (EReference)restConsumesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Condition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Transformation() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_OrderId() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumesMapping() {
		return consumesMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesMapping_Operation() {
		return (EReference)consumesMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumesOperation() {
		return consumesOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumesOperation_HttpMethod() {
		return (EAttribute)consumesOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumesOperation_PathTemplate() {
		return (EAttribute)consumesOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumesOperation_HttpBodyFromJsonVirtualRoot() {
		return (EAttribute)consumesOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesOperation_IncomingPayload() {
		return (EReference)consumesOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumesOperation_HttpBodyFromJsonMultiplePi() {
		return (EAttribute)consumesOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumesOperation_HttpBodyFromJsonVirtualRoot1() {
		return (EAttribute)consumesOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesOperation_XmlTemplate() {
		return (EReference)consumesOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsumesOperation_OnJbiResponse() {
		return (EReference)consumesOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormData() {
		return formDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormData_ExtractedByXpath() {
		return (EAttribute)formDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormData_AttachmentName() {
		return (EReference)formDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormData_AsAttachment() {
		return (EAttribute)formDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormData_Name() {
		return (EAttribute)formDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpResponse() {
		return httpResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpResponse_Header() {
		return (EReference)httpResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonMultiplePi() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonVirtualRoot() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonAutoArray() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonAutoPrimitive() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonPrettyPrint() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_HttpBodyToJsonNsDeclarations() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResponse_Code() {
		return (EAttribute)httpResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingPayload() {
		return incomingPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingPayload_Transformation() {
		return (EReference)incomingPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtClaim() {
		return jwtClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtClaim_Name() {
		return (EReference)jwtClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJwtClaim_Value() {
		return (EReference)jwtClaimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJwtSignature() {
		return jwtSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSignature_KeyFileUrl() {
		return (EAttribute)jwtSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJwtSignature_Algorithm() {
		return (EAttribute)jwtSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnCase() {
		return onCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnCase_HttpResponse() {
		return (EReference)onCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnHttpStatus() {
		return onHttpStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_Out() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_Fault() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_Error() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_OtherwiseOut() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_OtherwiseFault() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnHttpStatus_OtherwiseError() {
		return (EReference)onHttpStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnJbiResponse() {
		return onJbiResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnOut() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnFault() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnError() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnDefaultOut() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnDefaultError() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnJbiResponse_OnDefaultFault() {
		return (EReference)onJbiResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherwise() {
		return otherwiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherwise_Transformation() {
		return (EReference)otherwiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidesMapping() {
		return providesMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesMapping_Operation() {
		return (EReference)providesMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidesOperation() {
		return providesOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpMethod() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_Uri() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_Wadl() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_Wsdl2() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyType() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_BufferRequest() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_TrustAllCertificates() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_XpathParam() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_Authentication() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_Headers() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_Xsl() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_ResponseBodyAs() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_JsonXmlMappingConvention() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_FormData() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesOperation_OnHttpStatus() {
		return (EReference)providesOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonMultiplePi() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyFromJsonMultiplePi() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonVirtualRoot() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyFromJsonVirtualRoot() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonAutoArray() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonAutoPrimitive() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonPrettyPrint() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_HttpBodyToJsonNsDeclarations() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidesOperation_NamespaceMapping() {
		return (EAttribute)providesOperationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestAuthentication() {
		return restAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestAuthentication_Basic() {
		return (EReference)restAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestAuthentication_Jwt() {
		return (EReference)restAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestAuthentication_Ntlm() {
		return (EReference)restAuthenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestBasicAuthentication() {
		return restBasicAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestBasicAuthentication_Username() {
		return (EReference)restBasicAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestBasicAuthentication_Password() {
		return (EReference)restBasicAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestHeader() {
		return restHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestHeader_Constant() {
		return (EAttribute)restHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestHeader_Name() {
		return (EAttribute)restHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestHeaders() {
		return restHeadersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestHeaders_Header() {
		return (EReference)restHeadersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestJwtAuthentication() {
		return restJwtAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestJwtAuthentication_Claim() {
		return (EReference)restJwtAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestJwtAuthentication_CompressWith() {
		return (EAttribute)restJwtAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestJwtAuthentication_SignWith() {
		return (EReference)restJwtAuthenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestNtlmAuthentication() {
		return restNtlmAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestNtlmAuthentication_Username() {
		return (EReference)restNtlmAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestNtlmAuthentication_Password() {
		return (EReference)restNtlmAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestNtlmAuthentication_Domain() {
		return (EReference)restNtlmAuthenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestParam() {
		return restParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestParam_Value() {
		return (EAttribute)restParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestParam_Name() {
		return (EAttribute)restParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestProperty() {
		return restPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestProperty_Constant() {
		return (EAttribute)restPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestProperty_Xpath() {
		return (EAttribute)restPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Xsl() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPathCondition() {
		return xPathConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXPathCondition_Xpath() {
		return (EAttribute)xPathConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXslParameter() {
		return xslParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXslParameter_Value() {
		return (EAttribute)xslParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXslParameter_IsJsonResult() {
		return (EAttribute)xslParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpBodyType() {
		return httpBodyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJsonXmlMappingConvention() {
		return jsonXmlMappingConventionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJwtCompression() {
		return jwtCompressionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseBodyAs() {
		return responseBodyAsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestOperation() {
		return restOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHttpBodyTypeObject() {
		return httpBodyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJsonXmlMappingConventionObject() {
		return jsonXmlMappingConventionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJwtCompressionObject() {
		return jwtCompressionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResponseBodyAsObject() {
		return responseBodyAsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRestOperationObject() {
		return restOperationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestFactory getRestFactory() {
		return (RestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		restProvidesEClass = createEClass(REST_PROVIDES);
		createEAttribute(restProvidesEClass, REST_PROVIDES__BASE_PATH);
		createEReference(restProvidesEClass, REST_PROVIDES__MAPPING);

		restConsumesEClass = createEClass(REST_CONSUMES);
		createEAttribute(restConsumesEClass, REST_CONSUMES__BASE_PATH);
		createEReference(restConsumesEClass, REST_CONSUMES__MAPPING);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__CONDITION);
		createEReference(conditionEClass, CONDITION__TRANSFORMATION);
		createEAttribute(conditionEClass, CONDITION__ORDER_ID);

		consumesMappingEClass = createEClass(CONSUMES_MAPPING);
		createEReference(consumesMappingEClass, CONSUMES_MAPPING__OPERATION);

		consumesOperationEClass = createEClass(CONSUMES_OPERATION);
		createEAttribute(consumesOperationEClass, CONSUMES_OPERATION__HTTP_METHOD);
		createEAttribute(consumesOperationEClass, CONSUMES_OPERATION__PATH_TEMPLATE);
		createEAttribute(consumesOperationEClass, CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT);
		createEReference(consumesOperationEClass, CONSUMES_OPERATION__INCOMING_PAYLOAD);
		createEAttribute(consumesOperationEClass, CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI);
		createEAttribute(consumesOperationEClass, CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1);
		createEReference(consumesOperationEClass, CONSUMES_OPERATION__XML_TEMPLATE);
		createEReference(consumesOperationEClass, CONSUMES_OPERATION__ON_JBI_RESPONSE);

		formDataEClass = createEClass(FORM_DATA);
		createEAttribute(formDataEClass, FORM_DATA__EXTRACTED_BY_XPATH);
		createEReference(formDataEClass, FORM_DATA__ATTACHMENT_NAME);
		createEAttribute(formDataEClass, FORM_DATA__AS_ATTACHMENT);
		createEAttribute(formDataEClass, FORM_DATA__NAME);

		httpResponseEClass = createEClass(HTTP_RESPONSE);
		createEReference(httpResponseEClass, HTTP_RESPONSE__HEADER);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS);
		createEAttribute(httpResponseEClass, HTTP_RESPONSE__CODE);

		incomingPayloadEClass = createEClass(INCOMING_PAYLOAD);
		createEReference(incomingPayloadEClass, INCOMING_PAYLOAD__TRANSFORMATION);

		jwtClaimEClass = createEClass(JWT_CLAIM);
		createEReference(jwtClaimEClass, JWT_CLAIM__NAME);
		createEReference(jwtClaimEClass, JWT_CLAIM__VALUE);

		jwtSignatureEClass = createEClass(JWT_SIGNATURE);
		createEAttribute(jwtSignatureEClass, JWT_SIGNATURE__KEY_FILE_URL);
		createEAttribute(jwtSignatureEClass, JWT_SIGNATURE__ALGORITHM);

		onCaseEClass = createEClass(ON_CASE);
		createEReference(onCaseEClass, ON_CASE__HTTP_RESPONSE);

		onHttpStatusEClass = createEClass(ON_HTTP_STATUS);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__OUT);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__FAULT);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__ERROR);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__OTHERWISE_OUT);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__OTHERWISE_FAULT);
		createEReference(onHttpStatusEClass, ON_HTTP_STATUS__OTHERWISE_ERROR);

		onJbiResponseEClass = createEClass(ON_JBI_RESPONSE);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_OUT);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_FAULT);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_ERROR);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_DEFAULT_OUT);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_DEFAULT_ERROR);
		createEReference(onJbiResponseEClass, ON_JBI_RESPONSE__ON_DEFAULT_FAULT);

		otherwiseEClass = createEClass(OTHERWISE);
		createEReference(otherwiseEClass, OTHERWISE__TRANSFORMATION);

		providesMappingEClass = createEClass(PROVIDES_MAPPING);
		createEReference(providesMappingEClass, PROVIDES_MAPPING__OPERATION);

		providesOperationEClass = createEClass(PROVIDES_OPERATION);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_METHOD);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__URI);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__WADL);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__WSDL2);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TYPE);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__BUFFER_REQUEST);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__XPATH_PARAM);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__AUTHENTICATION);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__HEADERS);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__XSL);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__RESPONSE_BODY_AS);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__FORM_DATA);
		createEReference(providesOperationEClass, PROVIDES_OPERATION__ON_HTTP_STATUS);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS);
		createEAttribute(providesOperationEClass, PROVIDES_OPERATION__NAMESPACE_MAPPING);

		restAuthenticationEClass = createEClass(REST_AUTHENTICATION);
		createEReference(restAuthenticationEClass, REST_AUTHENTICATION__BASIC);
		createEReference(restAuthenticationEClass, REST_AUTHENTICATION__JWT);
		createEReference(restAuthenticationEClass, REST_AUTHENTICATION__NTLM);

		restBasicAuthenticationEClass = createEClass(REST_BASIC_AUTHENTICATION);
		createEReference(restBasicAuthenticationEClass, REST_BASIC_AUTHENTICATION__USERNAME);
		createEReference(restBasicAuthenticationEClass, REST_BASIC_AUTHENTICATION__PASSWORD);

		restHeaderEClass = createEClass(REST_HEADER);
		createEAttribute(restHeaderEClass, REST_HEADER__CONSTANT);
		createEAttribute(restHeaderEClass, REST_HEADER__NAME);

		restHeadersEClass = createEClass(REST_HEADERS);
		createEReference(restHeadersEClass, REST_HEADERS__HEADER);

		restJwtAuthenticationEClass = createEClass(REST_JWT_AUTHENTICATION);
		createEReference(restJwtAuthenticationEClass, REST_JWT_AUTHENTICATION__CLAIM);
		createEAttribute(restJwtAuthenticationEClass, REST_JWT_AUTHENTICATION__COMPRESS_WITH);
		createEReference(restJwtAuthenticationEClass, REST_JWT_AUTHENTICATION__SIGN_WITH);

		restNtlmAuthenticationEClass = createEClass(REST_NTLM_AUTHENTICATION);
		createEReference(restNtlmAuthenticationEClass, REST_NTLM_AUTHENTICATION__USERNAME);
		createEReference(restNtlmAuthenticationEClass, REST_NTLM_AUTHENTICATION__PASSWORD);
		createEReference(restNtlmAuthenticationEClass, REST_NTLM_AUTHENTICATION__DOMAIN);

		restParamEClass = createEClass(REST_PARAM);
		createEAttribute(restParamEClass, REST_PARAM__VALUE);
		createEAttribute(restParamEClass, REST_PARAM__NAME);

		restPropertyEClass = createEClass(REST_PROPERTY);
		createEAttribute(restPropertyEClass, REST_PROPERTY__CONSTANT);
		createEAttribute(restPropertyEClass, REST_PROPERTY__XPATH);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__XSL);

		xPathConditionEClass = createEClass(XPATH_CONDITION);
		createEAttribute(xPathConditionEClass, XPATH_CONDITION__XPATH);

		xslParameterEClass = createEClass(XSL_PARAMETER);
		createEAttribute(xslParameterEClass, XSL_PARAMETER__VALUE);
		createEAttribute(xslParameterEClass, XSL_PARAMETER__IS_JSON_RESULT);

		// Create enums
		httpBodyTypeEEnum = createEEnum(HTTP_BODY_TYPE);
		jsonXmlMappingConventionEEnum = createEEnum(JSON_XML_MAPPING_CONVENTION);
		jwtCompressionEEnum = createEEnum(JWT_COMPRESSION);
		responseBodyAsEEnum = createEEnum(RESPONSE_BODY_AS);
		restOperationEEnum = createEEnum(REST_OPERATION);

		// Create data types
		httpBodyTypeObjectEDataType = createEDataType(HTTP_BODY_TYPE_OBJECT);
		jsonXmlMappingConventionObjectEDataType = createEDataType(JSON_XML_MAPPING_CONVENTION_OBJECT);
		jwtCompressionObjectEDataType = createEDataType(JWT_COMPRESSION_OBJECT);
		responseBodyAsObjectEDataType = createEDataType(RESPONSE_BODY_AS_OBJECT);
		restOperationObjectEDataType = createEDataType(REST_OPERATION_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JbiPackage theJbiPackage = (JbiPackage)EPackage.Registry.INSTANCE.getEPackage(JbiPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		restProvidesEClass.getESuperTypes().add(theJbiPackage.getProvides());
		restConsumesEClass.getESuperTypes().add(theJbiPackage.getConsumes());
		onCaseEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes and features; add operations and parameters
		initEClass(restProvidesEClass, RestProvides.class, "RestProvides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestProvides_BasePath(), theXMLTypePackage.getString(), "basePath", null, 1, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestProvides_Mapping(), this.getProvidesMapping(), null, "mapping", null, 1, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restConsumesEClass, RestConsumes.class, "RestConsumes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestConsumes_BasePath(), theXMLTypePackage.getString(), "basePath", null, 1, 1, RestConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestConsumes_Mapping(), this.getConsumesMapping(), null, "mapping", null, 1, 1, RestConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Condition(), this.getXPathCondition(), null, "condition", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_OrderId(), theXMLTypePackage.getInt(), "orderId", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumesMappingEClass, ConsumesMapping.class, "ConsumesMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumesMapping_Operation(), this.getConsumesOperation(), null, "operation", null, 1, -1, ConsumesMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumesOperationEClass, ConsumesOperation.class, "ConsumesOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsumesOperation_HttpMethod(), this.getRestOperation(), "httpMethod", null, 1, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsumesOperation_PathTemplate(), theXMLTypePackage.getString(), "pathTemplate", null, 1, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsumesOperation_HttpBodyFromJsonVirtualRoot(), theXMLTypePackage.getString(), "httpBodyFromJsonVirtualRoot", null, 1, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsumesOperation_IncomingPayload(), this.getIncomingPayload(), null, "incomingPayload", null, 1, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsumesOperation_HttpBodyFromJsonMultiplePi(), theXMLTypePackage.getBoolean(), "httpBodyFromJsonMultiplePi", "false", 0, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsumesOperation_HttpBodyFromJsonVirtualRoot1(), theXMLTypePackage.getString(), "httpBodyFromJsonVirtualRoot1", null, 0, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsumesOperation_XmlTemplate(), ecorePackage.getEObject(), null, "xmlTemplate", null, 0, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsumesOperation_OnJbiResponse(), this.getOnJbiResponse(), null, "onJbiResponse", null, 1, 1, ConsumesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formDataEClass, FormData.class, "FormData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormData_ExtractedByXpath(), theXMLTypePackage.getString(), "extractedByXpath", null, 1, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormData_AttachmentName(), this.getRestProperty(), null, "attachmentName", null, 1, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormData_AsAttachment(), theXMLTypePackage.getBoolean(), "asAttachment", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormData_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FormData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpResponseEClass, HttpResponse.class, "HttpResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHttpResponse_Header(), this.getRestHeader(), null, "header", null, 0, -1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonMultiplePi(), theXMLTypePackage.getBoolean(), "httpBodyToJsonMultiplePi", "false", 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonVirtualRoot(), theXMLTypePackage.getString(), "httpBodyToJsonVirtualRoot", null, 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonAutoArray(), theXMLTypePackage.getBoolean(), "httpBodyToJsonAutoArray", "false", 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonAutoPrimitive(), theXMLTypePackage.getBoolean(), "httpBodyToJsonAutoPrimitive", "false", 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonPrettyPrint(), theXMLTypePackage.getBoolean(), "httpBodyToJsonPrettyPrint", "false", 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_HttpBodyToJsonNsDeclarations(), theXMLTypePackage.getBoolean(), "httpBodyToJsonNsDeclarations", "false", 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpResponse_Code(), theXMLTypePackage.getInt(), "code", null, 0, 1, HttpResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomingPayloadEClass, IncomingPayload.class, "IncomingPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingPayload_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, IncomingPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jwtClaimEClass, JwtClaim.class, "JwtClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJwtClaim_Name(), this.getRestProperty(), null, "name", null, 1, 1, JwtClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJwtClaim_Value(), this.getRestProperty(), null, "value", null, 1, 1, JwtClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jwtSignatureEClass, JwtSignature.class, "JwtSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJwtSignature_KeyFileUrl(), theXMLTypePackage.getString(), "keyFileUrl", null, 1, 1, JwtSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJwtSignature_Algorithm(), theXMLTypePackage.getString(), "algorithm", null, 1, 1, JwtSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onCaseEClass, OnCase.class, "OnCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnCase_HttpResponse(), this.getHttpResponse(), null, "httpResponse", null, 1, 1, OnCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onHttpStatusEClass, OnHttpStatus.class, "OnHttpStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnHttpStatus_Out(), this.getCondition(), null, "out", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnHttpStatus_Fault(), this.getCondition(), null, "fault", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnHttpStatus_Error(), this.getCondition(), null, "error", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnHttpStatus_OtherwiseOut(), this.getOtherwise(), null, "otherwiseOut", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnHttpStatus_OtherwiseFault(), this.getOtherwise(), null, "otherwiseFault", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnHttpStatus_OtherwiseError(), this.getOtherwise(), null, "otherwiseError", null, 1, 1, OnHttpStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onJbiResponseEClass, OnJbiResponse.class, "OnJbiResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnJbiResponse_OnOut(), this.getCondition(), null, "onOut", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnJbiResponse_OnFault(), this.getCondition(), null, "onFault", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnJbiResponse_OnError(), this.getCondition(), null, "onError", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnJbiResponse_OnDefaultOut(), this.getOnCase(), null, "onDefaultOut", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnJbiResponse_OnDefaultError(), this.getOnCase(), null, "onDefaultError", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnJbiResponse_OnDefaultFault(), this.getOnCase(), null, "onDefaultFault", null, 1, 1, OnJbiResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherwiseEClass, Otherwise.class, "Otherwise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtherwise_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, Otherwise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providesMappingEClass, ProvidesMapping.class, "ProvidesMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidesMapping_Operation(), this.getProvidesOperation(), null, "operation", null, 1, -1, ProvidesMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providesOperationEClass, ProvidesOperation.class, "ProvidesOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvidesOperation_HttpMethod(), this.getRestOperation(), "httpMethod", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_Uri(), theXMLTypePackage.getString(), "uri", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_Wadl(), theXMLTypePackage.getString(), "wadl", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_Wsdl2(), theXMLTypePackage.getString(), "wsdl2", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyType(), this.getHttpBodyType(), "httpBodyType", null, 1, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_BufferRequest(), theXMLTypePackage.getBoolean(), "bufferRequest", "false", 1, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_TrustAllCertificates(), theXMLTypePackage.getBoolean(), "trustAllCertificates", "false", 1, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_XpathParam(), this.getRestParam(), null, "xpathParam", null, 0, -1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_Authentication(), this.getRestAuthentication(), null, "authentication", null, 1, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_Headers(), this.getRestHeaders(), null, "headers", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_Xsl(), this.getXslParameter(), null, "xsl", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_ResponseBodyAs(), this.getResponseBodyAs(), "responseBodyAs", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_JsonXmlMappingConvention(), this.getJsonXmlMappingConvention(), "jsonXmlMappingConvention", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_FormData(), this.getFormData(), null, "formData", null, 0, -1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidesOperation_OnHttpStatus(), this.getOnHttpStatus(), null, "onHttpStatus", null, 0, -1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonMultiplePi(), theXMLTypePackage.getBoolean(), "httpBodyToJsonMultiplePi", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyFromJsonMultiplePi(), theXMLTypePackage.getBoolean(), "httpBodyFromJsonMultiplePi", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonVirtualRoot(), theXMLTypePackage.getString(), "httpBodyToJsonVirtualRoot", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyFromJsonVirtualRoot(), theXMLTypePackage.getString(), "httpBodyFromJsonVirtualRoot", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonAutoArray(), theXMLTypePackage.getBoolean(), "httpBodyToJsonAutoArray", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonAutoPrimitive(), theXMLTypePackage.getBoolean(), "httpBodyToJsonAutoPrimitive", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonPrettyPrint(), theXMLTypePackage.getBoolean(), "httpBodyToJsonPrettyPrint", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_HttpBodyToJsonNsDeclarations(), theXMLTypePackage.getBoolean(), "httpBodyToJsonNsDeclarations", "false", 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidesOperation_NamespaceMapping(), theXMLTypePackage.getString(), "namespaceMapping", null, 0, 1, ProvidesOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restAuthenticationEClass, RestAuthentication.class, "RestAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestAuthentication_Basic(), this.getRestBasicAuthentication(), null, "basic", null, 0, 1, RestAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestAuthentication_Jwt(), this.getRestJwtAuthentication(), null, "jwt", null, 0, 1, RestAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestAuthentication_Ntlm(), this.getRestNtlmAuthentication(), null, "ntlm", null, 0, 1, RestAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restBasicAuthenticationEClass, RestBasicAuthentication.class, "RestBasicAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestBasicAuthentication_Username(), this.getRestProperty(), null, "username", null, 1, 1, RestBasicAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestBasicAuthentication_Password(), this.getRestProperty(), null, "password", null, 1, 1, RestBasicAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restHeaderEClass, RestHeader.class, "RestHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestHeader_Constant(), theXMLTypePackage.getString(), "constant", null, 1, 1, RestHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestHeader_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RestHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restHeadersEClass, RestHeaders.class, "RestHeaders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestHeaders_Header(), this.getRestHeader(), null, "header", null, 0, -1, RestHeaders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restJwtAuthenticationEClass, RestJwtAuthentication.class, "RestJwtAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestJwtAuthentication_Claim(), this.getJwtClaim(), null, "claim", null, 0, -1, RestJwtAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestJwtAuthentication_CompressWith(), this.getJwtCompression(), "compressWith", null, 1, 1, RestJwtAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestJwtAuthentication_SignWith(), this.getJwtSignature(), null, "signWith", null, 1, 1, RestJwtAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restNtlmAuthenticationEClass, RestNtlmAuthentication.class, "RestNtlmAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestNtlmAuthentication_Username(), this.getRestProperty(), null, "username", null, 1, 1, RestNtlmAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestNtlmAuthentication_Password(), this.getRestProperty(), null, "password", null, 1, 1, RestNtlmAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestNtlmAuthentication_Domain(), this.getRestProperty(), null, "domain", null, 1, 1, RestNtlmAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restParamEClass, RestParam.class, "RestParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestParam_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, RestParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestParam_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RestParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restPropertyEClass, RestProperty.class, "RestProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestProperty_Constant(), theXMLTypePackage.getString(), "constant", null, 0, 1, RestProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestProperty_Xpath(), theXMLTypePackage.getString(), "xpath", null, 0, 1, RestProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Xsl(), theXMLTypePackage.getString(), "xsl", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPathConditionEClass, XPathCondition.class, "XPathCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXPathCondition_Xpath(), theXMLTypePackage.getString(), "xpath", null, 1, 1, XPathCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xslParameterEClass, XslParameter.class, "XslParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXslParameter_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XslParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXslParameter_IsJsonResult(), theXMLTypePackage.getBoolean(), "isJsonResult", "false", 0, 1, XslParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpBodyTypeEEnum, HttpBodyType.class, "HttpBodyType");
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.NOBODY);
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.XML);
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.JSON);
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.POSTQUERYSTRING);
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.MULTIPARTFORMDATA);
		addEEnumLiteral(httpBodyTypeEEnum, HttpBodyType.ATTACHMENT);

		initEEnum(jsonXmlMappingConventionEEnum, JsonXmlMappingConvention.class, "JsonXmlMappingConvention");
		addEEnumLiteral(jsonXmlMappingConventionEEnum, JsonXmlMappingConvention.MAPPEDCONVENTION);

		initEEnum(jwtCompressionEEnum, JwtCompression.class, "JwtCompression");
		addEEnumLiteral(jwtCompressionEEnum, JwtCompression.DEF);
		addEEnumLiteral(jwtCompressionEEnum, JwtCompression.GZIP);

		initEEnum(responseBodyAsEEnum, ResponseBodyAs.class, "ResponseBodyAs");
		addEEnumLiteral(responseBodyAsEEnum, ResponseBodyAs.AUTO);
		addEEnumLiteral(responseBodyAsEEnum, ResponseBodyAs.XML);
		addEEnumLiteral(responseBodyAsEEnum, ResponseBodyAs.JSON);
		addEEnumLiteral(responseBodyAsEEnum, ResponseBodyAs.ATTACHMENT);

		initEEnum(restOperationEEnum, RestOperation.class, "RestOperation");
		addEEnumLiteral(restOperationEEnum, RestOperation.GET);
		addEEnumLiteral(restOperationEEnum, RestOperation.POST);
		addEEnumLiteral(restOperationEEnum, RestOperation.PUT);
		addEEnumLiteral(restOperationEEnum, RestOperation.PATCH);
		addEEnumLiteral(restOperationEEnum, RestOperation.DELETE);

		// Initialize data types
		initEDataType(httpBodyTypeObjectEDataType, HttpBodyType.class, "HttpBodyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonXmlMappingConventionObjectEDataType, JsonXmlMappingConvention.class, "JsonXmlMappingConventionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jwtCompressionObjectEDataType, JwtCompression.class, "JwtCompressionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(responseBodyAsObjectEDataType, ResponseBodyAs.class, "ResponseBodyAsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(restOperationObjectEDataType, RestOperation.class, "RestOperationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (restProvidesEClass,
		   source,
		   new String[] {
			   "name", ""
		   });
		addAnnotation
		  (getRestProvides_BasePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "base-path",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRestProvides_Mapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mapping",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (restConsumesEClass,
		   source,
		   new String[] {
			   "name", ""
		   });
		addAnnotation
		  (getRestConsumes_BasePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "base-path",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRestConsumes_Mapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mapping",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (conditionEClass,
		   source,
		   new String[] {
			   "name", "Condition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCondition_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCondition_Transformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCondition_OrderId(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "order-id"
		   });
		addAnnotation
		  (consumesMappingEClass,
		   source,
		   new String[] {
			   "name", "ConsumesMapping",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsumesMapping_Operation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "operation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (consumesOperationEClass,
		   source,
		   new String[] {
			   "name", "ConsumesOperation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConsumesOperation_HttpMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-method",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_PathTemplate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "path-template",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_HttpBodyFromJsonVirtualRoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-from-json-virtual-root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_IncomingPayload(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "incoming-payload",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_HttpBodyFromJsonMultiplePi(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-from-json-multiple-pi",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_HttpBodyFromJsonVirtualRoot1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-from-json-virtual-root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_XmlTemplate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xml-template",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConsumesOperation_OnJbiResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-jbi-response",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (formDataEClass,
		   source,
		   new String[] {
			   "name", "FormData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFormData_ExtractedByXpath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extracted-by-xpath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormData_AttachmentName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "attachment-name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFormData_AsAttachment(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "as-attachment"
		   });
		addAnnotation
		  (getFormData_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (httpBodyTypeEEnum,
		   source,
		   new String[] {
			   "name", "HttpBodyType"
		   });
		addAnnotation
		  (httpBodyTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "HttpBodyType:Object",
			   "baseType", "HttpBodyType"
		   });
		addAnnotation
		  (httpResponseEClass,
		   source,
		   new String[] {
			   "name", "HttpResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHttpResponse_Header(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "header",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonMultiplePi(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-multiple-pi",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonVirtualRoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-virtual-root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonAutoArray(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-auto-array",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonAutoPrimitive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-auto-primitive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonPrettyPrint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-pretty-print",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_HttpBodyToJsonNsDeclarations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-ns-declarations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getHttpResponse_Code(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "code"
		   });
		addAnnotation
		  (incomingPayloadEClass,
		   source,
		   new String[] {
			   "name", "IncomingPayload",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIncomingPayload_Transformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (jsonXmlMappingConventionEEnum,
		   source,
		   new String[] {
			   "name", "JsonXmlMappingConvention"
		   });
		addAnnotation
		  (jsonXmlMappingConventionObjectEDataType,
		   source,
		   new String[] {
			   "name", "JsonXmlMappingConvention:Object",
			   "baseType", "JsonXmlMappingConvention"
		   });
		addAnnotation
		  (jwtClaimEClass,
		   source,
		   new String[] {
			   "name", "JwtClaim",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getJwtClaim_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJwtClaim_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (jwtCompressionEEnum,
		   source,
		   new String[] {
			   "name", "JwtCompression"
		   });
		addAnnotation
		  (jwtCompressionObjectEDataType,
		   source,
		   new String[] {
			   "name", "JwtCompression:Object",
			   "baseType", "JwtCompression"
		   });
		addAnnotation
		  (jwtSignatureEClass,
		   source,
		   new String[] {
			   "name", "JwtSignature",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getJwtSignature_KeyFileUrl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key-file-url",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJwtSignature_Algorithm(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "algorithm"
		   });
		addAnnotation
		  (onCaseEClass,
		   source,
		   new String[] {
			   "name", "OnCase",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOnCase_HttpResponse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-response",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (onHttpStatusEClass,
		   source,
		   new String[] {
			   "name", "OnHttpStatus",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOnHttpStatus_Out(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnHttpStatus_Fault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fault",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnHttpStatus_Error(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "error",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnHttpStatus_OtherwiseOut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "otherwise-out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnHttpStatus_OtherwiseFault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "otherwise-fault",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnHttpStatus_OtherwiseError(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "otherwise-error",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (onJbiResponseEClass,
		   source,
		   new String[] {
			   "name", "OnJbiResponse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOnJbiResponse_OnOut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnJbiResponse_OnFault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-fault",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnJbiResponse_OnError(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-error",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnJbiResponse_OnDefaultOut(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-default-out",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnJbiResponse_OnDefaultError(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-default-error",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOnJbiResponse_OnDefaultFault(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-default-fault",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (otherwiseEClass,
		   source,
		   new String[] {
			   "name", "Otherwise",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOtherwise_Transformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (providesMappingEClass,
		   source,
		   new String[] {
			   "name", "ProvidesMapping",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProvidesMapping_Operation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "operation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (providesOperationEClass,
		   source,
		   new String[] {
			   "name", "ProvidesOperation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProvidesOperation_HttpMethod(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-method",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Uri(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "uri",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Wadl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wadl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Wsdl2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wsdl2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_BufferRequest(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "buffer-request",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_TrustAllCertificates(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "trust-all-certificates",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_XpathParam(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xpath-param",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Authentication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authentication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Headers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "headers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_Xsl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xsl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_ResponseBodyAs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "response-body-as",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_JsonXmlMappingConvention(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "json-xml-mapping-convention",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_FormData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "form-data",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_OnHttpStatus(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "on-http-status",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonMultiplePi(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-multiple-pi",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyFromJsonMultiplePi(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-from-json-multiple-pi",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonVirtualRoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-virtual-root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyFromJsonVirtualRoot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-from-json-virtual-root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonAutoArray(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-auto-array",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonAutoPrimitive(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-auto-primitive",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonPrettyPrint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-pretty-print",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_HttpBodyToJsonNsDeclarations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "http-body-to-json-ns-declarations",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getProvidesOperation_NamespaceMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namespace-mapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (responseBodyAsEEnum,
		   source,
		   new String[] {
			   "name", "ResponseBodyAs"
		   });
		addAnnotation
		  (responseBodyAsObjectEDataType,
		   source,
		   new String[] {
			   "name", "ResponseBodyAs:Object",
			   "baseType", "ResponseBodyAs"
		   });
		addAnnotation
		  (restAuthenticationEClass,
		   source,
		   new String[] {
			   "name", "RestAuthentication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestAuthentication_Basic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "basic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestAuthentication_Jwt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "jwt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestAuthentication_Ntlm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ntlm",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (restBasicAuthenticationEClass,
		   source,
		   new String[] {
			   "name", "RestBasicAuthentication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestBasicAuthentication_Username(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "username",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestBasicAuthentication_Password(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "password",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (restHeaderEClass,
		   source,
		   new String[] {
			   "name", "RestHeader",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestHeader_Constant(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "constant",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestHeader_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (restHeadersEClass,
		   source,
		   new String[] {
			   "name", "RestHeaders",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestHeaders_Header(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "header",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (restJwtAuthenticationEClass,
		   source,
		   new String[] {
			   "name", "RestJwtAuthentication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestJwtAuthentication_Claim(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "claim",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestJwtAuthentication_CompressWith(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "compress-with",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestJwtAuthentication_SignWith(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sign-with",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (restNtlmAuthenticationEClass,
		   source,
		   new String[] {
			   "name", "RestNtlmAuthentication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestNtlmAuthentication_Username(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "username",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestNtlmAuthentication_Password(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "password",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestNtlmAuthentication_Domain(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "domain",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (restOperationEEnum,
		   source,
		   new String[] {
			   "name", "RestOperation"
		   });
		addAnnotation
		  (restOperationObjectEDataType,
		   source,
		   new String[] {
			   "name", "RestOperation:Object",
			   "baseType", "RestOperation"
		   });
		addAnnotation
		  (restParamEClass,
		   source,
		   new String[] {
			   "name", "RestParam",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRestParam_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getRestParam_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (restPropertyEClass,
		   source,
		   new String[] {
			   "name", "RestProperty",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRestProperty_Constant(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "constant",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRestProperty_Xpath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xpath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (transformationEClass,
		   source,
		   new String[] {
			   "name", "Transformation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransformation_Xsl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xsl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (xPathConditionEClass,
		   source,
		   new String[] {
			   "name", "XPathCondition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getXPathCondition_Xpath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "xpath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (xslParameterEClass,
		   source,
		   new String[] {
			   "name", "XslParameter",
			   "kind", "simple"
		   });
		addAnnotation
		  (getXslParameter_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getXslParameter_IsJsonResult(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "is-json-result"
		   });
	}

} //RestPackageImpl
