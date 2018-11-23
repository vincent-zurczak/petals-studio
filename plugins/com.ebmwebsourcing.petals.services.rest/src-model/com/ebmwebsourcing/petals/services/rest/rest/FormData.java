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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getExtractedByXpath <em>Extracted By Xpath</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#isAsAttachment <em>As Attachment</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getFormData()
 * @model extendedMetaData="name='FormData' kind='elementOnly'"
 * @generated
 */
public interface FormData extends EObject {
	/**
	 * Returns the value of the '<em><b>Extracted By Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extracted By Xpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extracted By Xpath</em>' attribute.
	 * @see #setExtractedByXpath(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getFormData_ExtractedByXpath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='extracted-by-xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtractedByXpath();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getExtractedByXpath <em>Extracted By Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extracted By Xpath</em>' attribute.
	 * @see #getExtractedByXpath()
	 * @generated
	 */
	void setExtractedByXpath(String value);

	/**
	 * Returns the value of the '<em><b>Attachment Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Name</em>' containment reference.
	 * @see #setAttachmentName(RestProperty)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getFormData_AttachmentName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attachment-name' namespace='##targetNamespace'"
	 * @generated
	 */
	RestProperty getAttachmentName();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getAttachmentName <em>Attachment Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Name</em>' containment reference.
	 * @see #getAttachmentName()
	 * @generated
	 */
	void setAttachmentName(RestProperty value);

	/**
	 * Returns the value of the '<em><b>As Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Attachment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Attachment</em>' attribute.
	 * @see #isSetAsAttachment()
	 * @see #unsetAsAttachment()
	 * @see #setAsAttachment(boolean)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getFormData_AsAttachment()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='as-attachment'"
	 * @generated
	 */
	boolean isAsAttachment();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#isAsAttachment <em>As Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Attachment</em>' attribute.
	 * @see #isSetAsAttachment()
	 * @see #unsetAsAttachment()
	 * @see #isAsAttachment()
	 * @generated
	 */
	void setAsAttachment(boolean value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#isAsAttachment <em>As Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAsAttachment()
	 * @see #isAsAttachment()
	 * @see #setAsAttachment(boolean)
	 * @generated
	 */
	void unsetAsAttachment();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#isAsAttachment <em>As Attachment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>As Attachment</em>' attribute is set.
	 * @see #unsetAsAttachment()
	 * @see #isAsAttachment()
	 * @see #setAsAttachment(boolean)
	 * @generated
	 */
	boolean isSetAsAttachment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ebmwebsourcing.petals.services.rest.rest.restPackage#getFormData_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.rest.rest.FormData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FormData
