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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.rest.rest.RestPackage
 * @generated
 */
public interface RestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestFactory eINSTANCE = com.linagora.petals.services.rest.rest.impl.RestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides</em>'.
	 * @generated
	 */
	RestProvides createRestProvides();

	/**
	 * Returns a new object of class '<em>Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumes</em>'.
	 * @generated
	 */
	RestConsumes createRestConsumes();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Consumes Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumes Mapping</em>'.
	 * @generated
	 */
	ConsumesMapping createConsumesMapping();

	/**
	 * Returns a new object of class '<em>Consumes Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumes Operation</em>'.
	 * @generated
	 */
	ConsumesOperation createConsumesOperation();

	/**
	 * Returns a new object of class '<em>Form Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Data</em>'.
	 * @generated
	 */
	FormData createFormData();

	/**
	 * Returns a new object of class '<em>Http Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Response</em>'.
	 * @generated
	 */
	HttpResponse createHttpResponse();

	/**
	 * Returns a new object of class '<em>Incoming Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Payload</em>'.
	 * @generated
	 */
	IncomingPayload createIncomingPayload();

	/**
	 * Returns a new object of class '<em>Jwt Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Claim</em>'.
	 * @generated
	 */
	JwtClaim createJwtClaim();

	/**
	 * Returns a new object of class '<em>Jwt Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Signature</em>'.
	 * @generated
	 */
	JwtSignature createJwtSignature();

	/**
	 * Returns a new object of class '<em>On Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Case</em>'.
	 * @generated
	 */
	OnCase createOnCase();

	/**
	 * Returns a new object of class '<em>On Http Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Http Status</em>'.
	 * @generated
	 */
	OnHttpStatus createOnHttpStatus();

	/**
	 * Returns a new object of class '<em>On Jbi Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Jbi Response</em>'.
	 * @generated
	 */
	OnJbiResponse createOnJbiResponse();

	/**
	 * Returns a new object of class '<em>Otherwise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Otherwise</em>'.
	 * @generated
	 */
	Otherwise createOtherwise();

	/**
	 * Returns a new object of class '<em>Provides Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Mapping</em>'.
	 * @generated
	 */
	ProvidesMapping createProvidesMapping();

	/**
	 * Returns a new object of class '<em>Provides Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Operation</em>'.
	 * @generated
	 */
	ProvidesOperation createProvidesOperation();

	/**
	 * Returns a new object of class '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication</em>'.
	 * @generated
	 */
	RestAuthentication createRestAuthentication();

	/**
	 * Returns a new object of class '<em>Basic Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Authentication</em>'.
	 * @generated
	 */
	RestBasicAuthentication createRestBasicAuthentication();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	RestHeader createRestHeader();

	/**
	 * Returns a new object of class '<em>Headers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Headers</em>'.
	 * @generated
	 */
	RestHeaders createRestHeaders();

	/**
	 * Returns a new object of class '<em>Jwt Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jwt Authentication</em>'.
	 * @generated
	 */
	RestJwtAuthentication createRestJwtAuthentication();

	/**
	 * Returns a new object of class '<em>Ntlm Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ntlm Authentication</em>'.
	 * @generated
	 */
	RestNtlmAuthentication createRestNtlmAuthentication();

	/**
	 * Returns a new object of class '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param</em>'.
	 * @generated
	 */
	RestParam createRestParam();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	RestProperty createRestProperty();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>XPath Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XPath Condition</em>'.
	 * @generated
	 */
	XPathCondition createXPathCondition();

	/**
	 * Returns a new object of class '<em>Xsl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xsl Parameter</em>'.
	 * @generated
	 */
	XslParameter createXslParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestPackage getRestPackage();

} //RestFactory
