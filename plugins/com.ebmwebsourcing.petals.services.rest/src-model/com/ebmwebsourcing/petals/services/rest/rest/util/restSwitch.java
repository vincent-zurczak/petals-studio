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
package com.ebmwebsourcing.petals.services.rest.rest.util;

import com.ebmwebsourcing.petals.services.rest.rest.*;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.AbstractExtensibleElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage
 * @generated
 */
public class restSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static restPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public restSwitch() {
		if (modelPackage == null) {
			modelPackage = restPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case restPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.CONSUMES: {
				Consumes consumes = (Consumes)theEObject;
				T result = caseConsumes(consumes);
				if (result == null) result = caseJbi_Consumes(consumes);
				if (result == null) result = caseAbstractEndpoint(consumes);
				if (result == null) result = caseAbstractExtensibleElement(consumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.CONSUMES_MAPPING: {
				ConsumesMapping consumesMapping = (ConsumesMapping)theEObject;
				T result = caseConsumesMapping(consumesMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.CONSUMES_OPERATION: {
				ConsumesOperation consumesOperation = (ConsumesOperation)theEObject;
				T result = caseConsumesOperation(consumesOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.FORM_DATA: {
				FormData formData = (FormData)theEObject;
				T result = caseFormData(formData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.HTTP_RESPONSE: {
				HttpResponse httpResponse = (HttpResponse)theEObject;
				T result = caseHttpResponse(httpResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.INCOMING_PAYLOAD: {
				IncomingPayload incomingPayload = (IncomingPayload)theEObject;
				T result = caseIncomingPayload(incomingPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.JWT_CLAIM: {
				JwtClaim jwtClaim = (JwtClaim)theEObject;
				T result = caseJwtClaim(jwtClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.JWT_SIGNATURE: {
				JwtSignature jwtSignature = (JwtSignature)theEObject;
				T result = caseJwtSignature(jwtSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.ON_CASE: {
				OnCase onCase = (OnCase)theEObject;
				T result = caseOnCase(onCase);
				if (result == null) result = caseCondition(onCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.ON_HTTP_STATUS: {
				OnHttpStatus onHttpStatus = (OnHttpStatus)theEObject;
				T result = caseOnHttpStatus(onHttpStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.ON_JBI_RESPONSE: {
				OnJbiResponse onJbiResponse = (OnJbiResponse)theEObject;
				T result = caseOnJbiResponse(onJbiResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.OTHERWISE: {
				Otherwise otherwise = (Otherwise)theEObject;
				T result = caseOtherwise(otherwise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.PROVIDES: {
				Provides provides = (Provides)theEObject;
				T result = caseProvides(provides);
				if (result == null) result = caseJbi_Provides(provides);
				if (result == null) result = caseAbstractEndpoint(provides);
				if (result == null) result = caseAbstractExtensibleElement(provides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.PROVIDES_MAPPING: {
				ProvidesMapping providesMapping = (ProvidesMapping)theEObject;
				T result = caseProvidesMapping(providesMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.PROVIDES_OPERATION: {
				ProvidesOperation providesOperation = (ProvidesOperation)theEObject;
				T result = caseProvidesOperation(providesOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_AUTHENTICATION: {
				RestAuthentication restAuthentication = (RestAuthentication)theEObject;
				T result = caseRestAuthentication(restAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_BASIC_AUTHENTICATION: {
				RestBasicAuthentication restBasicAuthentication = (RestBasicAuthentication)theEObject;
				T result = caseRestBasicAuthentication(restBasicAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_HEADER: {
				RestHeader restHeader = (RestHeader)theEObject;
				T result = caseRestHeader(restHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_HEADERS: {
				RestHeaders restHeaders = (RestHeaders)theEObject;
				T result = caseRestHeaders(restHeaders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_JWT_AUTHENTICATION: {
				RestJwtAuthentication restJwtAuthentication = (RestJwtAuthentication)theEObject;
				T result = caseRestJwtAuthentication(restJwtAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_NTLM_AUTHENTICATION: {
				RestNtlmAuthentication restNtlmAuthentication = (RestNtlmAuthentication)theEObject;
				T result = caseRestNtlmAuthentication(restNtlmAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_PARAM: {
				RestParam restParam = (RestParam)theEObject;
				T result = caseRestParam(restParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.REST_PROPERTY: {
				RestProperty restProperty = (RestProperty)theEObject;
				T result = caseRestProperty(restProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.XPATH_CONDITION: {
				XPathCondition xPathCondition = (XPathCondition)theEObject;
				T result = caseXPathCondition(xPathCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case restPackage.XSL_PARAMETER: {
				XslParameter xslParameter = (XslParameter)theEObject;
				T result = caseXslParameter(xslParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumes(Consumes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumesMapping(ConsumesMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumesOperation(ConsumesOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormData(FormData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpResponse(HttpResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingPayload(IncomingPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtClaim(JwtClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jwt Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jwt Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJwtSignature(JwtSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnCase(OnCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Http Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Http Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnHttpStatus(OnHttpStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Jbi Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Jbi Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnJbiResponse(OnJbiResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Otherwise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Otherwise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherwise(Otherwise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvides(Provides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesMapping(ProvidesMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesOperation(ProvidesOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestAuthentication(RestAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Basic Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Basic Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestBasicAuthentication(RestBasicAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestHeader(RestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Headers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Headers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestHeaders(RestHeaders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Jwt Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Jwt Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestJwtAuthentication(RestJwtAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Ntlm Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Ntlm Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestNtlmAuthentication(RestNtlmAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestParam(RestParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestProperty(RestProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathCondition(XPathCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xsl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xsl Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXslParameter(XslParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExtensibleElement(AbstractExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEndpoint(AbstractEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJbi_Consumes(com.sun.java.xml.ns.jbi.Consumes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJbi_Provides(com.sun.java.xml.ns.jbi.Provides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //restSwitch
