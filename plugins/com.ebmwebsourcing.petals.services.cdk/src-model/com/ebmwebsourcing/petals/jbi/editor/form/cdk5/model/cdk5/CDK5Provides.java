/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5;

import com.sun.java.xml.ns.jbi.Provides;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDK5 Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isValidateWsdl <em>Validate Wsdl</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardSecuritySubject <em>Forward Security Subject</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardMessageProperties <em>Forward Message Properties</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardAttachments <em>Forward Attachments</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getWsdl <em>Wsdl</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getRetryPolicy <em>Retry Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides()
 * @model extendedMetaData="name=''"
 * @generated
 */
public interface CDK5Provides extends CDKService, Provides {
	/**
	 * Returns the value of the '<em><b>Validate Wsdl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Wsdl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Wsdl</em>' attribute.
	 * @see #setValidateWsdl(boolean)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_ValidateWsdl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='validate-wsdl' group='#cdkExtContainer'"
	 * @generated
	 */
	boolean isValidateWsdl();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isValidateWsdl <em>Validate Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Wsdl</em>' attribute.
	 * @see #isValidateWsdl()
	 * @generated
	 */
	void setValidateWsdl(boolean value);

	/**
	 * Returns the value of the '<em><b>Forward Security Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Security Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Security Subject</em>' attribute.
	 * @see #isSetForwardSecuritySubject()
	 * @see #unsetForwardSecuritySubject()
	 * @see #setForwardSecuritySubject(boolean)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_ForwardSecuritySubject()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='forward-security-subject' group='#cdkExtContainer'"
	 * @generated
	 */
	boolean isForwardSecuritySubject();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardSecuritySubject <em>Forward Security Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Security Subject</em>' attribute.
	 * @see #isSetForwardSecuritySubject()
	 * @see #unsetForwardSecuritySubject()
	 * @see #isForwardSecuritySubject()
	 * @generated
	 */
	void setForwardSecuritySubject(boolean value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardSecuritySubject <em>Forward Security Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForwardSecuritySubject()
	 * @see #isForwardSecuritySubject()
	 * @see #setForwardSecuritySubject(boolean)
	 * @generated
	 */
	void unsetForwardSecuritySubject();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardSecuritySubject <em>Forward Security Subject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Forward Security Subject</em>' attribute is set.
	 * @see #unsetForwardSecuritySubject()
	 * @see #isForwardSecuritySubject()
	 * @see #setForwardSecuritySubject(boolean)
	 * @generated
	 */
	boolean isSetForwardSecuritySubject();

	/**
	 * Returns the value of the '<em><b>Forward Message Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Message Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Message Properties</em>' attribute.
	 * @see #isSetForwardMessageProperties()
	 * @see #unsetForwardMessageProperties()
	 * @see #setForwardMessageProperties(boolean)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_ForwardMessageProperties()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='forward-message-properties' group='#cdkExtContainer'"
	 * @generated
	 */
	boolean isForwardMessageProperties();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardMessageProperties <em>Forward Message Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Message Properties</em>' attribute.
	 * @see #isSetForwardMessageProperties()
	 * @see #unsetForwardMessageProperties()
	 * @see #isForwardMessageProperties()
	 * @generated
	 */
	void setForwardMessageProperties(boolean value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardMessageProperties <em>Forward Message Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForwardMessageProperties()
	 * @see #isForwardMessageProperties()
	 * @see #setForwardMessageProperties(boolean)
	 * @generated
	 */
	void unsetForwardMessageProperties();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardMessageProperties <em>Forward Message Properties</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Forward Message Properties</em>' attribute is set.
	 * @see #unsetForwardMessageProperties()
	 * @see #isForwardMessageProperties()
	 * @see #setForwardMessageProperties(boolean)
	 * @generated
	 */
	boolean isSetForwardMessageProperties();

	/**
	 * Returns the value of the '<em><b>Forward Attachments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Attachments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Attachments</em>' attribute.
	 * @see #isSetForwardAttachments()
	 * @see #unsetForwardAttachments()
	 * @see #setForwardAttachments(boolean)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_ForwardAttachments()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='forward-attachments' group='#cdkExtContainer'"
	 * @generated
	 */
	boolean isForwardAttachments();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardAttachments <em>Forward Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Attachments</em>' attribute.
	 * @see #isSetForwardAttachments()
	 * @see #unsetForwardAttachments()
	 * @see #isForwardAttachments()
	 * @generated
	 */
	void setForwardAttachments(boolean value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardAttachments <em>Forward Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForwardAttachments()
	 * @see #isForwardAttachments()
	 * @see #setForwardAttachments(boolean)
	 * @generated
	 */
	void unsetForwardAttachments();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#isForwardAttachments <em>Forward Attachments</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Forward Attachments</em>' attribute is set.
	 * @see #unsetForwardAttachments()
	 * @see #isForwardAttachments()
	 * @see #setForwardAttachments(boolean)
	 * @generated
	 */
	boolean isSetForwardAttachments();

	/**
	 * Returns the value of the '<em><b>Wsdl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl</em>' attribute.
	 * @see #isSetWsdl()
	 * @see #unsetWsdl()
	 * @see #setWsdl(String)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_Wsdl()
	 * @model unsettable="true" derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='wsdl' group='#cdkExtContainer'"
	 * @generated
	 */
	String getWsdl();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getWsdl <em>Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl</em>' attribute.
	 * @see #isSetWsdl()
	 * @see #unsetWsdl()
	 * @see #getWsdl()
	 * @generated
	 */
	void setWsdl(String value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getWsdl <em>Wsdl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWsdl()
	 * @see #getWsdl()
	 * @see #setWsdl(String)
	 * @generated
	 */
	void unsetWsdl();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getWsdl <em>Wsdl</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wsdl</em>' attribute is set.
	 * @see #unsetWsdl()
	 * @see #getWsdl()
	 * @see #setWsdl(String)
	 * @generated
	 */
	boolean isSetWsdl();

	/**
	 * Returns the value of the '<em><b>Retry Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Policy</em>' attribute.
	 * @see #setRetryPolicy(String)
	 * @see com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.Cdk5Package#getCDK5Provides_RetryPolicy()
	 * @model derived="true"
	 *        extendedMetaData="kind='element' namespace='http://petals.ow2.org/components/extensions/version-5' name='validate-wsdl' group='#cdkExtContainer'"
	 * @generated
	 */
	String getRetryPolicy();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.CDK5Provides#getRetryPolicy <em>Retry Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Policy</em>' attribute.
	 * @see #getRetryPolicy()
	 * @generated
	 */
	void setRetryPolicy(String value);

} // CDK5Provides
