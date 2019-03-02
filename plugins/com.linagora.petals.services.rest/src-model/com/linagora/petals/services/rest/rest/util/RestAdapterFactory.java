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
package com.linagora.petals.services.rest.rest.util;

import com.linagora.petals.services.cdk.cdk5.CDK5Consumes;
import com.linagora.petals.services.cdk.cdk5.CDK5Provides;

import com.linagora.petals.services.rest.rest.*;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.AbstractExtensibleElement;
import com.sun.java.xml.ns.jbi.Consumes;
import com.sun.java.xml.ns.jbi.Provides;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.rest.rest.RestPackage
 * @generated
 */
public class RestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSwitch<Adapter> modelSwitch =
		new RestSwitch<Adapter>() {
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseRestConsumes(RestConsumes object) {
				return createRestConsumesAdapter();
			}
			@Override
			public Adapter caseConsumesMapping(ConsumesMapping object) {
				return createConsumesMappingAdapter();
			}
			@Override
			public Adapter caseConsumesOperation(ConsumesOperation object) {
				return createConsumesOperationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFormData(FormData object) {
				return createFormDataAdapter();
			}
			@Override
			public Adapter caseHttpResponse(HttpResponse object) {
				return createHttpResponseAdapter();
			}
			@Override
			public Adapter caseIncomingPayload(IncomingPayload object) {
				return createIncomingPayloadAdapter();
			}
			@Override
			public Adapter caseJwtClaim(JwtClaim object) {
				return createJwtClaimAdapter();
			}
			@Override
			public Adapter caseJwtSignature(JwtSignature object) {
				return createJwtSignatureAdapter();
			}
			@Override
			public Adapter caseOnCase(OnCase object) {
				return createOnCaseAdapter();
			}
			@Override
			public Adapter caseOnHttpStatus(OnHttpStatus object) {
				return createOnHttpStatusAdapter();
			}
			@Override
			public Adapter caseOnJbiResponse(OnJbiResponse object) {
				return createOnJbiResponseAdapter();
			}
			@Override
			public Adapter caseOtherwise(Otherwise object) {
				return createOtherwiseAdapter();
			}
			@Override
			public Adapter caseRestProvides(RestProvides object) {
				return createRestProvidesAdapter();
			}
			@Override
			public Adapter caseProvidesMapping(ProvidesMapping object) {
				return createProvidesMappingAdapter();
			}
			@Override
			public Adapter caseProvidesOperation(ProvidesOperation object) {
				return createProvidesOperationAdapter();
			}
			@Override
			public Adapter caseRestAuthentication(RestAuthentication object) {
				return createRestAuthenticationAdapter();
			}
			@Override
			public Adapter caseRestBasicAuthentication(RestBasicAuthentication object) {
				return createRestBasicAuthenticationAdapter();
			}
			@Override
			public Adapter caseRestHeader(RestHeader object) {
				return createRestHeaderAdapter();
			}
			@Override
			public Adapter caseRestHeaders(RestHeaders object) {
				return createRestHeadersAdapter();
			}
			@Override
			public Adapter caseRestJwtAuthentication(RestJwtAuthentication object) {
				return createRestJwtAuthenticationAdapter();
			}
			@Override
			public Adapter caseRestNtlmAuthentication(RestNtlmAuthentication object) {
				return createRestNtlmAuthenticationAdapter();
			}
			@Override
			public Adapter caseRestParam(RestParam object) {
				return createRestParamAdapter();
			}
			@Override
			public Adapter caseRestProperty(RestProperty object) {
				return createRestPropertyAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseXPathCondition(XPathCondition object) {
				return createXPathConditionAdapter();
			}
			@Override
			public Adapter caseXslParameter(XslParameter object) {
				return createXslParameterAdapter();
			}
			@Override
			public Adapter caseAbstractExtensibleElement(AbstractExtensibleElement object) {
				return createAbstractExtensibleElementAdapter();
			}
			@Override
			public Adapter caseAbstractEndpoint(AbstractEndpoint object) {
				return createAbstractEndpointAdapter();
			}
			@Override
			public Adapter caseConsumes(Consumes object) {
				return createConsumesAdapter();
			}
			@Override
			public Adapter caseCDK5Consumes(CDK5Consumes object) {
				return createCDK5ConsumesAdapter();
			}
			@Override
			public Adapter caseProvides(Provides object) {
				return createProvidesAdapter();
			}
			@Override
			public Adapter caseCDK5Provides(CDK5Provides object) {
				return createCDK5ProvidesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestConsumes
	 * @generated
	 */
	public Adapter createRestConsumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.ConsumesMapping <em>Consumes Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.ConsumesMapping
	 * @generated
	 */
	public Adapter createConsumesMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.ConsumesOperation <em>Consumes Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.ConsumesOperation
	 * @generated
	 */
	public Adapter createConsumesOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.FormData <em>Form Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.FormData
	 * @generated
	 */
	public Adapter createFormDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.HttpResponse <em>Http Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.HttpResponse
	 * @generated
	 */
	public Adapter createHttpResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.IncomingPayload <em>Incoming Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.IncomingPayload
	 * @generated
	 */
	public Adapter createIncomingPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.JwtClaim <em>Jwt Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.JwtClaim
	 * @generated
	 */
	public Adapter createJwtClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.JwtSignature <em>Jwt Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.JwtSignature
	 * @generated
	 */
	public Adapter createJwtSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.OnCase <em>On Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.OnCase
	 * @generated
	 */
	public Adapter createOnCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.OnHttpStatus <em>On Http Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.OnHttpStatus
	 * @generated
	 */
	public Adapter createOnHttpStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.OnJbiResponse <em>On Jbi Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.OnJbiResponse
	 * @generated
	 */
	public Adapter createOnJbiResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.Otherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.Otherwise
	 * @generated
	 */
	public Adapter createOtherwiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestProvides
	 * @generated
	 */
	public Adapter createRestProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.ProvidesMapping <em>Provides Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.ProvidesMapping
	 * @generated
	 */
	public Adapter createProvidesMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.ProvidesOperation <em>Provides Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.ProvidesOperation
	 * @generated
	 */
	public Adapter createProvidesOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestAuthentication
	 * @generated
	 */
	public Adapter createRestAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestBasicAuthentication <em>Basic Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestBasicAuthentication
	 * @generated
	 */
	public Adapter createRestBasicAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestHeader
	 * @generated
	 */
	public Adapter createRestHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestHeaders
	 * @generated
	 */
	public Adapter createRestHeadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestJwtAuthentication <em>Jwt Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestJwtAuthentication
	 * @generated
	 */
	public Adapter createRestJwtAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestNtlmAuthentication <em>Ntlm Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestNtlmAuthentication
	 * @generated
	 */
	public Adapter createRestNtlmAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestParam
	 * @generated
	 */
	public Adapter createRestParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.RestProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.RestProperty
	 * @generated
	 */
	public Adapter createRestPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.XPathCondition <em>XPath Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.XPathCondition
	 * @generated
	 */
	public Adapter createXPathConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.rest.rest.XslParameter <em>Xsl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.rest.rest.XslParameter
	 * @generated
	 */
	public Adapter createXslParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.AbstractExtensibleElement <em>Abstract Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.AbstractExtensibleElement
	 * @generated
	 */
	public Adapter createAbstractExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.AbstractEndpoint <em>Abstract Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.AbstractEndpoint
	 * @generated
	 */
	public Adapter createAbstractEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.Consumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.Consumes
	 * @generated
	 */
	public Adapter createConsumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.cdk.cdk5.CDK5Consumes <em>CDK5 Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.cdk.cdk5.CDK5Consumes
	 * @generated
	 */
	public Adapter createCDK5ConsumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sun.java.xml.ns.jbi.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sun.java.xml.ns.jbi.Provides
	 * @generated
	 */
	public Adapter createProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.linagora.petals.services.cdk.cdk5.CDK5Provides <em>CDK5 Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.linagora.petals.services.cdk.cdk5.CDK5Provides
	 * @generated
	 */
	public Adapter createCDK5ProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestAdapterFactory
