/**
 * Copyright (c) 2018-2019, Linagora
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

import com.sun.java.xml.ns.jbi.JbiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.rest.rest.RestFactory
 * @model kind="package"
 * @generated
 */
public interface RestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petals.ow2.org/components/rest/version-1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = com.linagora.petals.services.rest.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestProvidesImpl <em>Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestProvidesImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestProvides()
	 * @generated
	 */
	int REST_PROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__GROUP = JbiPackage.PROVIDES__GROUP;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__OTHER = JbiPackage.PROVIDES__OTHER;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__LOCAL = JbiPackage.PROVIDES__LOCAL;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__ENDPOINT_NAME = JbiPackage.PROVIDES__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__INTERFACE_NAME = JbiPackage.PROVIDES__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__SERVICE_NAME = JbiPackage.PROVIDES__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__BASE_PATH = JbiPackage.PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES__MAPPING = JbiPackage.PROVIDES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROVIDES_FEATURE_COUNT = JbiPackage.PROVIDES_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestConsumesImpl <em>Consumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestConsumesImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestConsumes()
	 * @generated
	 */
	int REST_CONSUMES = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__GROUP = JbiPackage.CONSUMES__GROUP;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__OTHER = JbiPackage.CONSUMES__OTHER;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__LOCAL = JbiPackage.CONSUMES__LOCAL;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__ENDPOINT_NAME = JbiPackage.CONSUMES__ENDPOINT_NAME;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__INTERFACE_NAME = JbiPackage.CONSUMES__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__SERVICE_NAME = JbiPackage.CONSUMES__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__BASE_PATH = JbiPackage.CONSUMES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES__MAPPING = JbiPackage.CONSUMES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CONSUMES_FEATURE_COUNT = JbiPackage.CONSUMES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.ConditionImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ORDER_ID = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.ConsumesMappingImpl <em>Consumes Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.ConsumesMappingImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getConsumesMapping()
	 * @generated
	 */
	int CONSUMES_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_MAPPING__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Consumes Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.ConsumesOperationImpl <em>Consumes Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.ConsumesOperationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getConsumesOperation()
	 * @generated
	 */
	int CONSUMES_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__HTTP_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Path Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__PATH_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Http Body From Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Incoming Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__INCOMING_PAYLOAD = 3;

	/**
	 * The feature id for the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI = 4;

	/**
	 * The feature id for the '<em><b>Http Body From Json Virtual Root1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1 = 5;

	/**
	 * The feature id for the '<em><b>Xml Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__XML_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>On Jbi Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION__ON_JBI_RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Consumes Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMES_OPERATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl <em>Form Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.FormDataImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getFormData()
	 * @generated
	 */
	int FORM_DATA = 5;

	/**
	 * The feature id for the '<em><b>Extracted By Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA__EXTRACTED_BY_XPATH = 0;

	/**
	 * The feature id for the '<em><b>Attachment Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA__ATTACHMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>As Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA__AS_ATTACHMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA__NAME = 3;

	/**
	 * The number of structural features of the '<em>Form Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_DATA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.HttpResponseImpl <em>Http Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.HttpResponseImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpResponse()
	 * @generated
	 */
	int HTTP_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI = 1;

	/**
	 * The feature id for the '<em><b>Http Body To Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Http Body To Json Auto Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY = 3;

	/**
	 * The feature id for the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Http Body To Json Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT = 5;

	/**
	 * The feature id for the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__CODE = 7;

	/**
	 * The number of structural features of the '<em>Http Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.IncomingPayloadImpl <em>Incoming Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.IncomingPayloadImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getIncomingPayload()
	 * @generated
	 */
	int INCOMING_PAYLOAD = 7;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PAYLOAD__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Incoming Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_PAYLOAD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.JwtClaimImpl <em>Jwt Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.JwtClaimImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtClaim()
	 * @generated
	 */
	int JWT_CLAIM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_CLAIM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_CLAIM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Jwt Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_CLAIM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl <em>Jwt Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtSignature()
	 * @generated
	 */
	int JWT_SIGNATURE = 9;

	/**
	 * The feature id for the '<em><b>Key File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SIGNATURE__KEY_FILE_URL = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SIGNATURE__ALGORITHM = 1;

	/**
	 * The number of structural features of the '<em>Jwt Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JWT_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.OnCaseImpl <em>On Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.OnCaseImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnCase()
	 * @generated
	 */
	int ON_CASE = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CASE__CONDITION = CONDITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CASE__TRANSFORMATION = CONDITION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CASE__ORDER_ID = CONDITION__ORDER_ID;

	/**
	 * The feature id for the '<em><b>Http Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CASE__HTTP_RESPONSE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_CASE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.OnHttpStatusImpl <em>On Http Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.OnHttpStatusImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnHttpStatus()
	 * @generated
	 */
	int ON_HTTP_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__OUT = 0;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__FAULT = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Otherwise Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__OTHERWISE_OUT = 3;

	/**
	 * The feature id for the '<em><b>Otherwise Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__OTHERWISE_FAULT = 4;

	/**
	 * The feature id for the '<em><b>Otherwise Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS__OTHERWISE_ERROR = 5;

	/**
	 * The number of structural features of the '<em>On Http Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_HTTP_STATUS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl <em>On Jbi Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnJbiResponse()
	 * @generated
	 */
	int ON_JBI_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>On Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_OUT = 0;

	/**
	 * The feature id for the '<em><b>On Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_FAULT = 1;

	/**
	 * The feature id for the '<em><b>On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_ERROR = 2;

	/**
	 * The feature id for the '<em><b>On Default Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_DEFAULT_OUT = 3;

	/**
	 * The feature id for the '<em><b>On Default Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_DEFAULT_ERROR = 4;

	/**
	 * The feature id for the '<em><b>On Default Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE__ON_DEFAULT_FAULT = 5;

	/**
	 * The number of structural features of the '<em>On Jbi Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_JBI_RESPONSE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.OtherwiseImpl <em>Otherwise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.OtherwiseImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOtherwise()
	 * @generated
	 */
	int OTHERWISE = 13;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERWISE__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Otherwise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERWISE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.ProvidesMappingImpl <em>Provides Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.ProvidesMappingImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getProvidesMapping()
	 * @generated
	 */
	int PROVIDES_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MAPPING__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Provides Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.ProvidesOperationImpl <em>Provides Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.ProvidesOperationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getProvidesOperation()
	 * @generated
	 */
	int PROVIDES_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__URI = 1;

	/**
	 * The feature id for the '<em><b>Wadl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__WADL = 2;

	/**
	 * The feature id for the '<em><b>Wsdl2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__WSDL2 = 3;

	/**
	 * The feature id for the '<em><b>Http Body Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Buffer Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__BUFFER_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Trust All Certificates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES = 6;

	/**
	 * The feature id for the '<em><b>Xpath Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__XPATH_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__AUTHENTICATION = 8;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HEADERS = 9;

	/**
	 * The feature id for the '<em><b>Xsl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__XSL = 10;

	/**
	 * The feature id for the '<em><b>Response Body As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__RESPONSE_BODY_AS = 11;

	/**
	 * The feature id for the '<em><b>Json Xml Mapping Convention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION = 12;

	/**
	 * The feature id for the '<em><b>Form Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__FORM_DATA = 13;

	/**
	 * The feature id for the '<em><b>On Http Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__ON_HTTP_STATUS = 14;

	/**
	 * The feature id for the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI = 15;

	/**
	 * The feature id for the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI = 16;

	/**
	 * The feature id for the '<em><b>Http Body To Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT = 17;

	/**
	 * The feature id for the '<em><b>Http Body From Json Virtual Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT = 18;

	/**
	 * The feature id for the '<em><b>Http Body To Json Auto Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY = 19;

	/**
	 * The feature id for the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE = 20;

	/**
	 * The feature id for the '<em><b>Http Body To Json Pretty Print</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT = 21;

	/**
	 * The feature id for the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS = 22;

	/**
	 * The feature id for the '<em><b>Namespace Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION__NAMESPACE_MAPPING = 23;

	/**
	 * The number of structural features of the '<em>Provides Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestAuthentication()
	 * @generated
	 */
	int REST_AUTHENTICATION = 16;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_AUTHENTICATION__BASIC = 0;

	/**
	 * The feature id for the '<em><b>Jwt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_AUTHENTICATION__JWT = 1;

	/**
	 * The feature id for the '<em><b>Ntlm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_AUTHENTICATION__NTLM = 2;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_AUTHENTICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestBasicAuthenticationImpl <em>Basic Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestBasicAuthenticationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestBasicAuthentication()
	 * @generated
	 */
	int REST_BASIC_AUTHENTICATION = 17;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_BASIC_AUTHENTICATION__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_BASIC_AUTHENTICATION__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Basic Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_BASIC_AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestHeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestHeaderImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestHeader()
	 * @generated
	 */
	int REST_HEADER = 18;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_HEADER__CONSTANT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_HEADER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_HEADER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestHeadersImpl <em>Headers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestHeadersImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestHeaders()
	 * @generated
	 */
	int REST_HEADERS = 19;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_HEADERS__HEADER = 0;

	/**
	 * The number of structural features of the '<em>Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_HEADERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestJwtAuthenticationImpl <em>Jwt Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestJwtAuthenticationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestJwtAuthentication()
	 * @generated
	 */
	int REST_JWT_AUTHENTICATION = 20;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_JWT_AUTHENTICATION__CLAIM = 0;

	/**
	 * The feature id for the '<em><b>Compress With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_JWT_AUTHENTICATION__COMPRESS_WITH = 1;

	/**
	 * The feature id for the '<em><b>Sign With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_JWT_AUTHENTICATION__SIGN_WITH = 2;

	/**
	 * The number of structural features of the '<em>Jwt Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_JWT_AUTHENTICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl <em>Ntlm Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestNtlmAuthentication()
	 * @generated
	 */
	int REST_NTLM_AUTHENTICATION = 21;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_NTLM_AUTHENTICATION__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_NTLM_AUTHENTICATION__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_NTLM_AUTHENTICATION__DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Ntlm Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_NTLM_AUTHENTICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestParamImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestParam()
	 * @generated
	 */
	int REST_PARAM = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PARAM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PARAM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.RestPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.RestPropertyImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestProperty()
	 * @generated
	 */
	int REST_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROPERTY__CONSTANT = 0;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROPERTY__XPATH = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.TransformationImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 24;

	/**
	 * The feature id for the '<em><b>Xsl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__XSL = 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.XPathConditionImpl <em>XPath Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.XPathConditionImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getXPathCondition()
	 * @generated
	 */
	int XPATH_CONDITION = 25;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_CONDITION__XPATH = 0;

	/**
	 * The number of structural features of the '<em>XPath Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.impl.XslParameterImpl <em>Xsl Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.impl.XslParameterImpl
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getXslParameter()
	 * @generated
	 */
	int XSL_PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Json Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_PARAMETER__IS_JSON_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Xsl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSL_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.HttpBodyType <em>Http Body Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpBodyType()
	 * @generated
	 */
	int HTTP_BODY_TYPE = 27;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.JsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJsonXmlMappingConvention()
	 * @generated
	 */
	int JSON_XML_MAPPING_CONVENTION = 28;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.JwtCompression <em>Jwt Compression</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtCompression()
	 * @generated
	 */
	int JWT_COMPRESSION = 29;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.ResponseBodyAs <em>Response Body As</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getResponseBodyAs()
	 * @generated
	 */
	int RESPONSE_BODY_AS = 30;

	/**
	 * The meta object id for the '{@link com.linagora.petals.services.rest.rest.RestOperation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestOperation()
	 * @generated
	 */
	int REST_OPERATION = 31;

	/**
	 * The meta object id for the '<em>Http Body Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpBodyTypeObject()
	 * @generated
	 */
	int HTTP_BODY_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Json Xml Mapping Convention Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJsonXmlMappingConventionObject()
	 * @generated
	 */
	int JSON_XML_MAPPING_CONVENTION_OBJECT = 33;

	/**
	 * The meta object id for the '<em>Jwt Compression Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtCompressionObject()
	 * @generated
	 */
	int JWT_COMPRESSION_OBJECT = 34;

	/**
	 * The meta object id for the '<em>Response Body As Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getResponseBodyAsObject()
	 * @generated
	 */
	int RESPONSE_BODY_AS_OBJECT = 35;

	/**
	 * The meta object id for the '<em>Operation Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestOperationObject()
	 * @generated
	 */
	int REST_OPERATION_OBJECT = 36;


	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProvides
	 * @generated
	 */
	EClass getRestProvides();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestProvides#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProvides#getBasePath()
	 * @see #getRestProvides()
	 * @generated
	 */
	EAttribute getRestProvides_BasePath();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestProvides#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProvides#getMapping()
	 * @see #getRestProvides()
	 * @generated
	 */
	EReference getRestProvides_Mapping();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestConsumes
	 * @generated
	 */
	EClass getRestConsumes();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestConsumes#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestConsumes#getBasePath()
	 * @see #getRestConsumes()
	 * @generated
	 */
	EAttribute getRestConsumes_BasePath();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestConsumes#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestConsumes#getMapping()
	 * @see #getRestConsumes()
	 * @generated
	 */
	EReference getRestConsumes_Mapping();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see com.linagora.petals.services.rest.rest.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.linagora.petals.services.rest.rest.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.Condition#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see com.linagora.petals.services.rest.rest.Condition#getTransformation()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.Condition#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see com.linagora.petals.services.rest.rest.Condition#getOrderId()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_OrderId();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.ConsumesMapping <em>Consumes Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes Mapping</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesMapping
	 * @generated
	 */
	EClass getConsumesMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.ConsumesMapping#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesMapping#getOperation()
	 * @see #getConsumesMapping()
	 * @generated
	 */
	EReference getConsumesMapping_Operation();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.ConsumesOperation <em>Consumes Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumes Operation</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation
	 * @generated
	 */
	EClass getConsumesOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpMethod()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EAttribute getConsumesOperation_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getPathTemplate <em>Path Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Template</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getPathTemplate()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EAttribute getConsumesOperation_PathTemplate();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body From Json Virtual Root</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EAttribute getConsumesOperation_HttpBodyFromJsonVirtualRoot();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getIncomingPayload <em>Incoming Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming Payload</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getIncomingPayload()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EReference getConsumesOperation_IncomingPayload();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body From Json Multiple Pi</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#isHttpBodyFromJsonMultiplePi()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EAttribute getConsumesOperation_HttpBodyFromJsonMultiplePi();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot1 <em>Http Body From Json Virtual Root1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body From Json Virtual Root1</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getHttpBodyFromJsonVirtualRoot1()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EAttribute getConsumesOperation_HttpBodyFromJsonVirtualRoot1();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getXmlTemplate <em>Xml Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Template</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getXmlTemplate()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EReference getConsumesOperation_XmlTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ConsumesOperation#getOnJbiResponse <em>On Jbi Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Jbi Response</em>'.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation#getOnJbiResponse()
	 * @see #getConsumesOperation()
	 * @generated
	 */
	EReference getConsumesOperation_OnJbiResponse();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.FormData <em>Form Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Data</em>'.
	 * @see com.linagora.petals.services.rest.rest.FormData
	 * @generated
	 */
	EClass getFormData();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.FormData#getExtractedByXpath <em>Extracted By Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extracted By Xpath</em>'.
	 * @see com.linagora.petals.services.rest.rest.FormData#getExtractedByXpath()
	 * @see #getFormData()
	 * @generated
	 */
	EAttribute getFormData_ExtractedByXpath();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.FormData#getAttachmentName <em>Attachment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachment Name</em>'.
	 * @see com.linagora.petals.services.rest.rest.FormData#getAttachmentName()
	 * @see #getFormData()
	 * @generated
	 */
	EReference getFormData_AttachmentName();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.FormData#isAsAttachment <em>As Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Attachment</em>'.
	 * @see com.linagora.petals.services.rest.rest.FormData#isAsAttachment()
	 * @see #getFormData()
	 * @generated
	 */
	EAttribute getFormData_AsAttachment();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.FormData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.linagora.petals.services.rest.rest.FormData#getName()
	 * @see #getFormData()
	 * @generated
	 */
	EAttribute getFormData_Name();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.HttpResponse <em>Http Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Response</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse
	 * @generated
	 */
	EClass getHttpResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.HttpResponse#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#getHeader()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EReference getHttpResponse_Header();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Multiple Pi</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonMultiplePi()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonMultiplePi();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Virtual Root</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#getHttpBodyToJsonVirtualRoot()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonVirtualRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Auto Array</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoArray()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonAutoArray();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Auto Primitive</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonAutoPrimitive()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonAutoPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Pretty Print</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonPrettyPrint()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonPrettyPrint();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Ns Declarations</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#isHttpBodyToJsonNsDeclarations()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_HttpBodyToJsonNsDeclarations();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.HttpResponse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse#getCode()
	 * @see #getHttpResponse()
	 * @generated
	 */
	EAttribute getHttpResponse_Code();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.IncomingPayload <em>Incoming Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Payload</em>'.
	 * @see com.linagora.petals.services.rest.rest.IncomingPayload
	 * @generated
	 */
	EClass getIncomingPayload();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.IncomingPayload#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see com.linagora.petals.services.rest.rest.IncomingPayload#getTransformation()
	 * @see #getIncomingPayload()
	 * @generated
	 */
	EReference getIncomingPayload_Transformation();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.JwtClaim <em>Jwt Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Claim</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtClaim
	 * @generated
	 */
	EClass getJwtClaim();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.JwtClaim#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtClaim#getName()
	 * @see #getJwtClaim()
	 * @generated
	 */
	EReference getJwtClaim_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.JwtClaim#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtClaim#getValue()
	 * @see #getJwtClaim()
	 * @generated
	 */
	EReference getJwtClaim_Value();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.JwtSignature <em>Jwt Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Signature</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtSignature
	 * @generated
	 */
	EClass getJwtSignature();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.JwtSignature#getKeyFileUrl <em>Key File Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key File Url</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtSignature#getKeyFileUrl()
	 * @see #getJwtSignature()
	 * @generated
	 */
	EAttribute getJwtSignature_KeyFileUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.JwtSignature#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtSignature#getAlgorithm()
	 * @see #getJwtSignature()
	 * @generated
	 */
	EAttribute getJwtSignature_Algorithm();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.OnCase <em>On Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Case</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnCase
	 * @generated
	 */
	EClass getOnCase();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnCase#getHttpResponse <em>Http Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Response</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnCase#getHttpResponse()
	 * @see #getOnCase()
	 * @generated
	 */
	EReference getOnCase_HttpResponse();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.OnHttpStatus <em>On Http Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Http Status</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus
	 * @generated
	 */
	EClass getOnHttpStatus();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getOut()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_Out();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getFault()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_Fault();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getError()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_Error();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseOut <em>Otherwise Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise Out</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseOut()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_OtherwiseOut();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseFault <em>Otherwise Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise Fault</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseFault()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_OtherwiseFault();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseError <em>Otherwise Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otherwise Error</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus#getOtherwiseError()
	 * @see #getOnHttpStatus()
	 * @generated
	 */
	EReference getOnHttpStatus_OtherwiseError();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.OnJbiResponse <em>On Jbi Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Jbi Response</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse
	 * @generated
	 */
	EClass getOnJbiResponse();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnOut <em>On Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Out</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnOut()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnOut();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnFault <em>On Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Fault</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnFault()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnFault();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnError <em>On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Error</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnError()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnError();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultOut <em>On Default Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Default Out</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultOut()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnDefaultOut();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultError <em>On Default Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Default Error</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultError()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnDefaultError();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultFault <em>On Default Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Default Fault</em>'.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse#getOnDefaultFault()
	 * @see #getOnJbiResponse()
	 * @generated
	 */
	EReference getOnJbiResponse_OnDefaultFault();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.Otherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Otherwise</em>'.
	 * @see com.linagora.petals.services.rest.rest.Otherwise
	 * @generated
	 */
	EClass getOtherwise();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.Otherwise#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see com.linagora.petals.services.rest.rest.Otherwise#getTransformation()
	 * @see #getOtherwise()
	 * @generated
	 */
	EReference getOtherwise_Transformation();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.ProvidesMapping <em>Provides Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Mapping</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesMapping
	 * @generated
	 */
	EClass getProvidesMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.ProvidesMapping#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesMapping#getOperation()
	 * @see #getProvidesMapping()
	 * @generated
	 */
	EReference getProvidesMapping_Operation();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.ProvidesOperation <em>Provides Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Operation</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation
	 * @generated
	 */
	EClass getProvidesOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpMethod()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getUri()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_Uri();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWadl <em>Wadl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wadl</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getWadl()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_Wadl();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getWsdl2 <em>Wsdl2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl2</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getWsdl2()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_Wsdl2();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType <em>Http Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body Type</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyType()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyType();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest <em>Buffer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Request</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isBufferRequest()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_BufferRequest();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates <em>Trust All Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust All Certificates</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isTrustAllCertificates()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_TrustAllCertificates();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getXpathParam <em>Xpath Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xpath Param</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getXpathParam()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_XpathParam();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getAuthentication()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_Authentication();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Headers</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getHeaders()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_Headers();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getXsl <em>Xsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xsl</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getXsl()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_Xsl();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs <em>Response Body As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Body As</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getResponseBodyAs()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_ResponseBodyAs();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Xml Mapping Convention</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getJsonXmlMappingConvention()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_JsonXmlMappingConvention();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getFormData <em>Form Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Data</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getFormData()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_FormData();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getOnHttpStatus <em>On Http Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Http Status</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getOnHttpStatus()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EReference getProvidesOperation_OnHttpStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi <em>Http Body To Json Multiple Pi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Multiple Pi</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonMultiplePi()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonMultiplePi();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi <em>Http Body From Json Multiple Pi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body From Json Multiple Pi</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyFromJsonMultiplePi()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyFromJsonMultiplePi();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyToJsonVirtualRoot <em>Http Body To Json Virtual Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Virtual Root</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyToJsonVirtualRoot()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonVirtualRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyFromJsonVirtualRoot <em>Http Body From Json Virtual Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body From Json Virtual Root</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getHttpBodyFromJsonVirtualRoot()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyFromJsonVirtualRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray <em>Http Body To Json Auto Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Auto Array</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoArray()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonAutoArray();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive <em>Http Body To Json Auto Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Auto Primitive</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonAutoPrimitive()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonAutoPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint <em>Http Body To Json Pretty Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Pretty Print</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonPrettyPrint()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonPrettyPrint();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations <em>Http Body To Json Ns Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Body To Json Ns Declarations</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#isHttpBodyToJsonNsDeclarations()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_HttpBodyToJsonNsDeclarations();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.ProvidesOperation#getNamespaceMapping <em>Namespace Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Mapping</em>'.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation#getNamespaceMapping()
	 * @see #getProvidesOperation()
	 * @generated
	 */
	EAttribute getProvidesOperation_NamespaceMapping();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestAuthentication
	 * @generated
	 */
	EClass getRestAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestAuthentication#getBasic()
	 * @see #getRestAuthentication()
	 * @generated
	 */
	EReference getRestAuthentication_Basic();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getJwt <em>Jwt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jwt</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestAuthentication#getJwt()
	 * @see #getRestAuthentication()
	 * @generated
	 */
	EReference getRestAuthentication_Jwt();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestAuthentication#getNtlm <em>Ntlm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ntlm</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestAuthentication#getNtlm()
	 * @see #getRestAuthentication()
	 * @generated
	 */
	EReference getRestAuthentication_Ntlm();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestBasicAuthentication <em>Basic Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Authentication</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestBasicAuthentication
	 * @generated
	 */
	EClass getRestBasicAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestBasicAuthentication#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestBasicAuthentication#getUsername()
	 * @see #getRestBasicAuthentication()
	 * @generated
	 */
	EReference getRestBasicAuthentication_Username();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestBasicAuthentication#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestBasicAuthentication#getPassword()
	 * @see #getRestBasicAuthentication()
	 * @generated
	 */
	EReference getRestBasicAuthentication_Password();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestHeader
	 * @generated
	 */
	EClass getRestHeader();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestHeader#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestHeader#getConstant()
	 * @see #getRestHeader()
	 * @generated
	 */
	EAttribute getRestHeader_Constant();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestHeader#getName()
	 * @see #getRestHeader()
	 * @generated
	 */
	EAttribute getRestHeader_Name();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headers</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestHeaders
	 * @generated
	 */
	EClass getRestHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.RestHeaders#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestHeaders#getHeader()
	 * @see #getRestHeaders()
	 * @generated
	 */
	EReference getRestHeaders_Header();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication <em>Jwt Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jwt Authentication</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestJwtAuthentication
	 * @generated
	 */
	EClass getRestJwtAuthentication();

	/**
	 * Returns the meta object for the containment reference list '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claim</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestJwtAuthentication#getClaim()
	 * @see #getRestJwtAuthentication()
	 * @generated
	 */
	EReference getRestJwtAuthentication_Claim();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith <em>Compress With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compress With</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestJwtAuthentication#getCompressWith()
	 * @see #getRestJwtAuthentication()
	 * @generated
	 */
	EAttribute getRestJwtAuthentication_CompressWith();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication#getSignWith <em>Sign With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sign With</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestJwtAuthentication#getSignWith()
	 * @see #getRestJwtAuthentication()
	 * @generated
	 */
	EReference getRestJwtAuthentication_SignWith();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication <em>Ntlm Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ntlm Authentication</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestNtlmAuthentication
	 * @generated
	 */
	EClass getRestNtlmAuthentication();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getUsername()
	 * @see #getRestNtlmAuthentication()
	 * @generated
	 */
	EReference getRestNtlmAuthentication_Username();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getPassword()
	 * @see #getRestNtlmAuthentication()
	 * @generated
	 */
	EReference getRestNtlmAuthentication_Password();

	/**
	 * Returns the meta object for the containment reference '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestNtlmAuthentication#getDomain()
	 * @see #getRestNtlmAuthentication()
	 * @generated
	 */
	EReference getRestNtlmAuthentication_Domain();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestParam
	 * @generated
	 */
	EClass getRestParam();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestParam#getValue()
	 * @see #getRestParam()
	 * @generated
	 */
	EAttribute getRestParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestParam#getName()
	 * @see #getRestParam()
	 * @generated
	 */
	EAttribute getRestParam_Name();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.RestProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProperty
	 * @generated
	 */
	EClass getRestProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestProperty#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProperty#getConstant()
	 * @see #getRestProperty()
	 * @generated
	 */
	EAttribute getRestProperty_Constant();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.RestProperty#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestProperty#getXpath()
	 * @see #getRestProperty()
	 * @generated
	 */
	EAttribute getRestProperty_Xpath();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see com.linagora.petals.services.rest.rest.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.Transformation#getXsl <em>Xsl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsl</em>'.
	 * @see com.linagora.petals.services.rest.rest.Transformation#getXsl()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Xsl();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.XPathCondition <em>XPath Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPath Condition</em>'.
	 * @see com.linagora.petals.services.rest.rest.XPathCondition
	 * @generated
	 */
	EClass getXPathCondition();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.XPathCondition#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see com.linagora.petals.services.rest.rest.XPathCondition#getXpath()
	 * @see #getXPathCondition()
	 * @generated
	 */
	EAttribute getXPathCondition_Xpath();

	/**
	 * Returns the meta object for class '{@link com.linagora.petals.services.rest.rest.XslParameter <em>Xsl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xsl Parameter</em>'.
	 * @see com.linagora.petals.services.rest.rest.XslParameter
	 * @generated
	 */
	EClass getXslParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.XslParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.linagora.petals.services.rest.rest.XslParameter#getValue()
	 * @see #getXslParameter()
	 * @generated
	 */
	EAttribute getXslParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.linagora.petals.services.rest.rest.XslParameter#isIsJsonResult <em>Is Json Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Json Result</em>'.
	 * @see com.linagora.petals.services.rest.rest.XslParameter#isIsJsonResult()
	 * @see #getXslParameter()
	 * @generated
	 */
	EAttribute getXslParameter_IsJsonResult();

	/**
	 * Returns the meta object for enum '{@link com.linagora.petals.services.rest.rest.HttpBodyType <em>Http Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Body Type</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @generated
	 */
	EEnum getHttpBodyType();

	/**
	 * Returns the meta object for enum '{@link com.linagora.petals.services.rest.rest.JsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Json Xml Mapping Convention</em>'.
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @generated
	 */
	EEnum getJsonXmlMappingConvention();

	/**
	 * Returns the meta object for enum '{@link com.linagora.petals.services.rest.rest.JwtCompression <em>Jwt Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jwt Compression</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @generated
	 */
	EEnum getJwtCompression();

	/**
	 * Returns the meta object for enum '{@link com.linagora.petals.services.rest.rest.ResponseBodyAs <em>Response Body As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Body As</em>'.
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @generated
	 */
	EEnum getResponseBodyAs();

	/**
	 * Returns the meta object for enum '{@link com.linagora.petals.services.rest.rest.RestOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @generated
	 */
	EEnum getRestOperation();

	/**
	 * Returns the meta object for data type '{@link com.linagora.petals.services.rest.rest.HttpBodyType <em>Http Body Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Http Body Type Object</em>'.
	 * @see com.linagora.petals.services.rest.rest.HttpBodyType
	 * @model instanceClass="com.linagora.petals.services.rest.rest.HttpBodyType"
	 *        extendedMetaData="name='HttpBodyType:Object' baseType='HttpBodyType'"
	 * @generated
	 */
	EDataType getHttpBodyTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.linagora.petals.services.rest.rest.JsonXmlMappingConvention <em>Json Xml Mapping Convention Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Json Xml Mapping Convention Object</em>'.
	 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
	 * @model instanceClass="com.linagora.petals.services.rest.rest.JsonXmlMappingConvention"
	 *        extendedMetaData="name='JsonXmlMappingConvention:Object' baseType='JsonXmlMappingConvention'"
	 * @generated
	 */
	EDataType getJsonXmlMappingConventionObject();

	/**
	 * Returns the meta object for data type '{@link com.linagora.petals.services.rest.rest.JwtCompression <em>Jwt Compression Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Jwt Compression Object</em>'.
	 * @see com.linagora.petals.services.rest.rest.JwtCompression
	 * @model instanceClass="com.linagora.petals.services.rest.rest.JwtCompression"
	 *        extendedMetaData="name='JwtCompression:Object' baseType='JwtCompression'"
	 * @generated
	 */
	EDataType getJwtCompressionObject();

	/**
	 * Returns the meta object for data type '{@link com.linagora.petals.services.rest.rest.ResponseBodyAs <em>Response Body As Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Response Body As Object</em>'.
	 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
	 * @model instanceClass="com.linagora.petals.services.rest.rest.ResponseBodyAs"
	 *        extendedMetaData="name='ResponseBodyAs:Object' baseType='ResponseBodyAs'"
	 * @generated
	 */
	EDataType getResponseBodyAsObject();

	/**
	 * Returns the meta object for data type '{@link com.linagora.petals.services.rest.rest.RestOperation <em>Operation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Object</em>'.
	 * @see com.linagora.petals.services.rest.rest.RestOperation
	 * @model instanceClass="com.linagora.petals.services.rest.rest.RestOperation"
	 *        extendedMetaData="name='RestOperation:Object' baseType='RestOperation'"
	 * @generated
	 */
	EDataType getRestOperationObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestProvidesImpl <em>Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestProvidesImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestProvides()
		 * @generated
		 */
		EClass REST_PROVIDES = eINSTANCE.getRestProvides();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_PROVIDES__BASE_PATH = eINSTANCE.getRestProvides_BasePath();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_PROVIDES__MAPPING = eINSTANCE.getRestProvides_Mapping();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestConsumesImpl <em>Consumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestConsumesImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestConsumes()
		 * @generated
		 */
		EClass REST_CONSUMES = eINSTANCE.getRestConsumes();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_CONSUMES__BASE_PATH = eINSTANCE.getRestConsumes_BasePath();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CONSUMES__MAPPING = eINSTANCE.getRestConsumes_Mapping();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.ConditionImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__TRANSFORMATION = eINSTANCE.getCondition_Transformation();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__ORDER_ID = eINSTANCE.getCondition_OrderId();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.ConsumesMappingImpl <em>Consumes Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.ConsumesMappingImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getConsumesMapping()
		 * @generated
		 */
		EClass CONSUMES_MAPPING = eINSTANCE.getConsumesMapping();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_MAPPING__OPERATION = eINSTANCE.getConsumesMapping_Operation();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.ConsumesOperationImpl <em>Consumes Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.ConsumesOperationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getConsumesOperation()
		 * @generated
		 */
		EClass CONSUMES_OPERATION = eINSTANCE.getConsumesOperation();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMES_OPERATION__HTTP_METHOD = eINSTANCE.getConsumesOperation_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Path Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMES_OPERATION__PATH_TEMPLATE = eINSTANCE.getConsumesOperation_PathTemplate();

		/**
		 * The meta object literal for the '<em><b>Http Body From Json Virtual Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT = eINSTANCE.getConsumesOperation_HttpBodyFromJsonVirtualRoot();

		/**
		 * The meta object literal for the '<em><b>Incoming Payload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_OPERATION__INCOMING_PAYLOAD = eINSTANCE.getConsumesOperation_IncomingPayload();

		/**
		 * The meta object literal for the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI = eINSTANCE.getConsumesOperation_HttpBodyFromJsonMultiplePi();

		/**
		 * The meta object literal for the '<em><b>Http Body From Json Virtual Root1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT1 = eINSTANCE.getConsumesOperation_HttpBodyFromJsonVirtualRoot1();

		/**
		 * The meta object literal for the '<em><b>Xml Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_OPERATION__XML_TEMPLATE = eINSTANCE.getConsumesOperation_XmlTemplate();

		/**
		 * The meta object literal for the '<em><b>On Jbi Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMES_OPERATION__ON_JBI_RESPONSE = eINSTANCE.getConsumesOperation_OnJbiResponse();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl <em>Form Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.FormDataImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getFormData()
		 * @generated
		 */
		EClass FORM_DATA = eINSTANCE.getFormData();

		/**
		 * The meta object literal for the '<em><b>Extracted By Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA__EXTRACTED_BY_XPATH = eINSTANCE.getFormData_ExtractedByXpath();

		/**
		 * The meta object literal for the '<em><b>Attachment Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_DATA__ATTACHMENT_NAME = eINSTANCE.getFormData_AttachmentName();

		/**
		 * The meta object literal for the '<em><b>As Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA__AS_ATTACHMENT = eINSTANCE.getFormData_AsAttachment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_DATA__NAME = eINSTANCE.getFormData_Name();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.HttpResponseImpl <em>Http Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.HttpResponseImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpResponse()
		 * @generated
		 */
		EClass HTTP_RESPONSE = eINSTANCE.getHttpResponse();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_RESPONSE__HEADER = eINSTANCE.getHttpResponse_Header();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_MULTIPLE_PI = eINSTANCE.getHttpResponse_HttpBodyToJsonMultiplePi();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Virtual Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_VIRTUAL_ROOT = eINSTANCE.getHttpResponse_HttpBodyToJsonVirtualRoot();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Auto Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_ARRAY = eINSTANCE.getHttpResponse_HttpBodyToJsonAutoArray();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE = eINSTANCE.getHttpResponse_HttpBodyToJsonAutoPrimitive();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Pretty Print</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_PRETTY_PRINT = eINSTANCE.getHttpResponse_HttpBodyToJsonPrettyPrint();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__HTTP_BODY_TO_JSON_NS_DECLARATIONS = eINSTANCE.getHttpResponse_HttpBodyToJsonNsDeclarations();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__CODE = eINSTANCE.getHttpResponse_Code();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.IncomingPayloadImpl <em>Incoming Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.IncomingPayloadImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getIncomingPayload()
		 * @generated
		 */
		EClass INCOMING_PAYLOAD = eINSTANCE.getIncomingPayload();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_PAYLOAD__TRANSFORMATION = eINSTANCE.getIncomingPayload_Transformation();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.JwtClaimImpl <em>Jwt Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.JwtClaimImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtClaim()
		 * @generated
		 */
		EClass JWT_CLAIM = eINSTANCE.getJwtClaim();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_CLAIM__NAME = eINSTANCE.getJwtClaim_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JWT_CLAIM__VALUE = eINSTANCE.getJwtClaim_Value();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl <em>Jwt Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.JwtSignatureImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtSignature()
		 * @generated
		 */
		EClass JWT_SIGNATURE = eINSTANCE.getJwtSignature();

		/**
		 * The meta object literal for the '<em><b>Key File Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SIGNATURE__KEY_FILE_URL = eINSTANCE.getJwtSignature_KeyFileUrl();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JWT_SIGNATURE__ALGORITHM = eINSTANCE.getJwtSignature_Algorithm();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.OnCaseImpl <em>On Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.OnCaseImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnCase()
		 * @generated
		 */
		EClass ON_CASE = eINSTANCE.getOnCase();

		/**
		 * The meta object literal for the '<em><b>Http Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_CASE__HTTP_RESPONSE = eINSTANCE.getOnCase_HttpResponse();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.OnHttpStatusImpl <em>On Http Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.OnHttpStatusImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnHttpStatus()
		 * @generated
		 */
		EClass ON_HTTP_STATUS = eINSTANCE.getOnHttpStatus();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__OUT = eINSTANCE.getOnHttpStatus_Out();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__FAULT = eINSTANCE.getOnHttpStatus_Fault();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__ERROR = eINSTANCE.getOnHttpStatus_Error();

		/**
		 * The meta object literal for the '<em><b>Otherwise Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__OTHERWISE_OUT = eINSTANCE.getOnHttpStatus_OtherwiseOut();

		/**
		 * The meta object literal for the '<em><b>Otherwise Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__OTHERWISE_FAULT = eINSTANCE.getOnHttpStatus_OtherwiseFault();

		/**
		 * The meta object literal for the '<em><b>Otherwise Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_HTTP_STATUS__OTHERWISE_ERROR = eINSTANCE.getOnHttpStatus_OtherwiseError();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl <em>On Jbi Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.OnJbiResponseImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOnJbiResponse()
		 * @generated
		 */
		EClass ON_JBI_RESPONSE = eINSTANCE.getOnJbiResponse();

		/**
		 * The meta object literal for the '<em><b>On Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_OUT = eINSTANCE.getOnJbiResponse_OnOut();

		/**
		 * The meta object literal for the '<em><b>On Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_FAULT = eINSTANCE.getOnJbiResponse_OnFault();

		/**
		 * The meta object literal for the '<em><b>On Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_ERROR = eINSTANCE.getOnJbiResponse_OnError();

		/**
		 * The meta object literal for the '<em><b>On Default Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_DEFAULT_OUT = eINSTANCE.getOnJbiResponse_OnDefaultOut();

		/**
		 * The meta object literal for the '<em><b>On Default Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_DEFAULT_ERROR = eINSTANCE.getOnJbiResponse_OnDefaultError();

		/**
		 * The meta object literal for the '<em><b>On Default Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_JBI_RESPONSE__ON_DEFAULT_FAULT = eINSTANCE.getOnJbiResponse_OnDefaultFault();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.OtherwiseImpl <em>Otherwise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.OtherwiseImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getOtherwise()
		 * @generated
		 */
		EClass OTHERWISE = eINSTANCE.getOtherwise();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHERWISE__TRANSFORMATION = eINSTANCE.getOtherwise_Transformation();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.ProvidesMappingImpl <em>Provides Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.ProvidesMappingImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getProvidesMapping()
		 * @generated
		 */
		EClass PROVIDES_MAPPING = eINSTANCE.getProvidesMapping();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_MAPPING__OPERATION = eINSTANCE.getProvidesMapping_Operation();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.ProvidesOperationImpl <em>Provides Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.ProvidesOperationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getProvidesOperation()
		 * @generated
		 */
		EClass PROVIDES_OPERATION = eINSTANCE.getProvidesOperation();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_METHOD = eINSTANCE.getProvidesOperation_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__URI = eINSTANCE.getProvidesOperation_Uri();

		/**
		 * The meta object literal for the '<em><b>Wadl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__WADL = eINSTANCE.getProvidesOperation_Wadl();

		/**
		 * The meta object literal for the '<em><b>Wsdl2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__WSDL2 = eINSTANCE.getProvidesOperation_Wsdl2();

		/**
		 * The meta object literal for the '<em><b>Http Body Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TYPE = eINSTANCE.getProvidesOperation_HttpBodyType();

		/**
		 * The meta object literal for the '<em><b>Buffer Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__BUFFER_REQUEST = eINSTANCE.getProvidesOperation_BufferRequest();

		/**
		 * The meta object literal for the '<em><b>Trust All Certificates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__TRUST_ALL_CERTIFICATES = eINSTANCE.getProvidesOperation_TrustAllCertificates();

		/**
		 * The meta object literal for the '<em><b>Xpath Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__XPATH_PARAM = eINSTANCE.getProvidesOperation_XpathParam();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__AUTHENTICATION = eINSTANCE.getProvidesOperation_Authentication();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__HEADERS = eINSTANCE.getProvidesOperation_Headers();

		/**
		 * The meta object literal for the '<em><b>Xsl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__XSL = eINSTANCE.getProvidesOperation_Xsl();

		/**
		 * The meta object literal for the '<em><b>Response Body As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__RESPONSE_BODY_AS = eINSTANCE.getProvidesOperation_ResponseBodyAs();

		/**
		 * The meta object literal for the '<em><b>Json Xml Mapping Convention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__JSON_XML_MAPPING_CONVENTION = eINSTANCE.getProvidesOperation_JsonXmlMappingConvention();

		/**
		 * The meta object literal for the '<em><b>Form Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__FORM_DATA = eINSTANCE.getProvidesOperation_FormData();

		/**
		 * The meta object literal for the '<em><b>On Http Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_OPERATION__ON_HTTP_STATUS = eINSTANCE.getProvidesOperation_OnHttpStatus();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Multiple Pi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_MULTIPLE_PI = eINSTANCE.getProvidesOperation_HttpBodyToJsonMultiplePi();

		/**
		 * The meta object literal for the '<em><b>Http Body From Json Multiple Pi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_MULTIPLE_PI = eINSTANCE.getProvidesOperation_HttpBodyFromJsonMultiplePi();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Virtual Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_VIRTUAL_ROOT = eINSTANCE.getProvidesOperation_HttpBodyToJsonVirtualRoot();

		/**
		 * The meta object literal for the '<em><b>Http Body From Json Virtual Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_FROM_JSON_VIRTUAL_ROOT = eINSTANCE.getProvidesOperation_HttpBodyFromJsonVirtualRoot();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Auto Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_ARRAY = eINSTANCE.getProvidesOperation_HttpBodyToJsonAutoArray();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Auto Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_AUTO_PRIMITIVE = eINSTANCE.getProvidesOperation_HttpBodyToJsonAutoPrimitive();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Pretty Print</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_PRETTY_PRINT = eINSTANCE.getProvidesOperation_HttpBodyToJsonPrettyPrint();

		/**
		 * The meta object literal for the '<em><b>Http Body To Json Ns Declarations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__HTTP_BODY_TO_JSON_NS_DECLARATIONS = eINSTANCE.getProvidesOperation_HttpBodyToJsonNsDeclarations();

		/**
		 * The meta object literal for the '<em><b>Namespace Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDES_OPERATION__NAMESPACE_MAPPING = eINSTANCE.getProvidesOperation_NamespaceMapping();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestAuthenticationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestAuthentication()
		 * @generated
		 */
		EClass REST_AUTHENTICATION = eINSTANCE.getRestAuthentication();

		/**
		 * The meta object literal for the '<em><b>Basic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_AUTHENTICATION__BASIC = eINSTANCE.getRestAuthentication_Basic();

		/**
		 * The meta object literal for the '<em><b>Jwt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_AUTHENTICATION__JWT = eINSTANCE.getRestAuthentication_Jwt();

		/**
		 * The meta object literal for the '<em><b>Ntlm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_AUTHENTICATION__NTLM = eINSTANCE.getRestAuthentication_Ntlm();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestBasicAuthenticationImpl <em>Basic Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestBasicAuthenticationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestBasicAuthentication()
		 * @generated
		 */
		EClass REST_BASIC_AUTHENTICATION = eINSTANCE.getRestBasicAuthentication();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_BASIC_AUTHENTICATION__USERNAME = eINSTANCE.getRestBasicAuthentication_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_BASIC_AUTHENTICATION__PASSWORD = eINSTANCE.getRestBasicAuthentication_Password();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestHeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestHeaderImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestHeader()
		 * @generated
		 */
		EClass REST_HEADER = eINSTANCE.getRestHeader();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_HEADER__CONSTANT = eINSTANCE.getRestHeader_Constant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_HEADER__NAME = eINSTANCE.getRestHeader_Name();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestHeadersImpl <em>Headers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestHeadersImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestHeaders()
		 * @generated
		 */
		EClass REST_HEADERS = eINSTANCE.getRestHeaders();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_HEADERS__HEADER = eINSTANCE.getRestHeaders_Header();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestJwtAuthenticationImpl <em>Jwt Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestJwtAuthenticationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestJwtAuthentication()
		 * @generated
		 */
		EClass REST_JWT_AUTHENTICATION = eINSTANCE.getRestJwtAuthentication();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_JWT_AUTHENTICATION__CLAIM = eINSTANCE.getRestJwtAuthentication_Claim();

		/**
		 * The meta object literal for the '<em><b>Compress With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_JWT_AUTHENTICATION__COMPRESS_WITH = eINSTANCE.getRestJwtAuthentication_CompressWith();

		/**
		 * The meta object literal for the '<em><b>Sign With</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_JWT_AUTHENTICATION__SIGN_WITH = eINSTANCE.getRestJwtAuthentication_SignWith();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl <em>Ntlm Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestNtlmAuthenticationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestNtlmAuthentication()
		 * @generated
		 */
		EClass REST_NTLM_AUTHENTICATION = eINSTANCE.getRestNtlmAuthentication();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_NTLM_AUTHENTICATION__USERNAME = eINSTANCE.getRestNtlmAuthentication_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_NTLM_AUTHENTICATION__PASSWORD = eINSTANCE.getRestNtlmAuthentication_Password();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_NTLM_AUTHENTICATION__DOMAIN = eINSTANCE.getRestNtlmAuthentication_Domain();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestParamImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestParam()
		 * @generated
		 */
		EClass REST_PARAM = eINSTANCE.getRestParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_PARAM__VALUE = eINSTANCE.getRestParam_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_PARAM__NAME = eINSTANCE.getRestParam_Name();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.RestPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.RestPropertyImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestProperty()
		 * @generated
		 */
		EClass REST_PROPERTY = eINSTANCE.getRestProperty();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_PROPERTY__CONSTANT = eINSTANCE.getRestProperty_Constant();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_PROPERTY__XPATH = eINSTANCE.getRestProperty_Xpath();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.TransformationImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Xsl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__XSL = eINSTANCE.getTransformation_Xsl();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.XPathConditionImpl <em>XPath Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.XPathConditionImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getXPathCondition()
		 * @generated
		 */
		EClass XPATH_CONDITION = eINSTANCE.getXPathCondition();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPATH_CONDITION__XPATH = eINSTANCE.getXPathCondition_Xpath();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.impl.XslParameterImpl <em>Xsl Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.impl.XslParameterImpl
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getXslParameter()
		 * @generated
		 */
		EClass XSL_PARAMETER = eINSTANCE.getXslParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSL_PARAMETER__VALUE = eINSTANCE.getXslParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Is Json Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSL_PARAMETER__IS_JSON_RESULT = eINSTANCE.getXslParameter_IsJsonResult();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.HttpBodyType <em>Http Body Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.HttpBodyType
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpBodyType()
		 * @generated
		 */
		EEnum HTTP_BODY_TYPE = eINSTANCE.getHttpBodyType();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.JsonXmlMappingConvention <em>Json Xml Mapping Convention</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJsonXmlMappingConvention()
		 * @generated
		 */
		EEnum JSON_XML_MAPPING_CONVENTION = eINSTANCE.getJsonXmlMappingConvention();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.JwtCompression <em>Jwt Compression</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.JwtCompression
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtCompression()
		 * @generated
		 */
		EEnum JWT_COMPRESSION = eINSTANCE.getJwtCompression();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.ResponseBodyAs <em>Response Body As</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getResponseBodyAs()
		 * @generated
		 */
		EEnum RESPONSE_BODY_AS = eINSTANCE.getResponseBodyAs();

		/**
		 * The meta object literal for the '{@link com.linagora.petals.services.rest.rest.RestOperation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.RestOperation
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestOperation()
		 * @generated
		 */
		EEnum REST_OPERATION = eINSTANCE.getRestOperation();

		/**
		 * The meta object literal for the '<em>Http Body Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.HttpBodyType
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getHttpBodyTypeObject()
		 * @generated
		 */
		EDataType HTTP_BODY_TYPE_OBJECT = eINSTANCE.getHttpBodyTypeObject();

		/**
		 * The meta object literal for the '<em>Json Xml Mapping Convention Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.JsonXmlMappingConvention
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJsonXmlMappingConventionObject()
		 * @generated
		 */
		EDataType JSON_XML_MAPPING_CONVENTION_OBJECT = eINSTANCE.getJsonXmlMappingConventionObject();

		/**
		 * The meta object literal for the '<em>Jwt Compression Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.JwtCompression
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getJwtCompressionObject()
		 * @generated
		 */
		EDataType JWT_COMPRESSION_OBJECT = eINSTANCE.getJwtCompressionObject();

		/**
		 * The meta object literal for the '<em>Response Body As Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.ResponseBodyAs
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getResponseBodyAsObject()
		 * @generated
		 */
		EDataType RESPONSE_BODY_AS_OBJECT = eINSTANCE.getResponseBodyAsObject();

		/**
		 * The meta object literal for the '<em>Operation Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.linagora.petals.services.rest.rest.RestOperation
		 * @see com.linagora.petals.services.rest.rest.impl.RestPackageImpl#getRestOperationObject()
		 * @generated
		 */
		EDataType REST_OPERATION_OBJECT = eINSTANCE.getRestOperationObject();

	}

} //RestPackage
