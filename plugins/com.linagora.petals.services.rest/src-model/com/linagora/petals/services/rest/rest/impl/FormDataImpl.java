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

import com.linagora.petals.services.rest.rest.FormData;
import com.linagora.petals.services.rest.rest.RestPackage;
import com.linagora.petals.services.rest.rest.RestProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl#getExtractedByXpath <em>Extracted By Xpath</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl#isAsAttachment <em>As Attachment</em>}</li>
 *   <li>{@link com.linagora.petals.services.rest.rest.impl.FormDataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormDataImpl extends MinimalEObjectImpl.Container implements FormData {
	/**
	 * The default value of the '{@link #getExtractedByXpath() <em>Extracted By Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractedByXpath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRACTED_BY_XPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtractedByXpath() <em>Extracted By Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractedByXpath()
	 * @generated
	 * @ordered
	 */
	protected String extractedByXpath = EXTRACTED_BY_XPATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachmentName() <em>Attachment Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentName()
	 * @generated
	 * @ordered
	 */
	protected RestProperty attachmentName;

	/**
	 * The default value of the '{@link #isAsAttachment() <em>As Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AS_ATTACHMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsAttachment() <em>As Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsAttachment()
	 * @generated
	 * @ordered
	 */
	protected boolean asAttachment = AS_ATTACHMENT_EDEFAULT;

	/**
	 * This is true if the As Attachment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean asAttachmentESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.FORM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtractedByXpath() {
		return extractedByXpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractedByXpath(String newExtractedByXpath) {
		String oldExtractedByXpath = extractedByXpath;
		extractedByXpath = newExtractedByXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.FORM_DATA__EXTRACTED_BY_XPATH, oldExtractedByXpath, extractedByXpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestProperty getAttachmentName() {
		return attachmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentName(RestProperty newAttachmentName, NotificationChain msgs) {
		RestProperty oldAttachmentName = attachmentName;
		attachmentName = newAttachmentName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.FORM_DATA__ATTACHMENT_NAME, oldAttachmentName, newAttachmentName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentName(RestProperty newAttachmentName) {
		if (newAttachmentName != attachmentName) {
			NotificationChain msgs = null;
			if (attachmentName != null)
				msgs = ((InternalEObject)attachmentName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.FORM_DATA__ATTACHMENT_NAME, null, msgs);
			if (newAttachmentName != null)
				msgs = ((InternalEObject)newAttachmentName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.FORM_DATA__ATTACHMENT_NAME, null, msgs);
			msgs = basicSetAttachmentName(newAttachmentName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.FORM_DATA__ATTACHMENT_NAME, newAttachmentName, newAttachmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsAttachment() {
		return asAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsAttachment(boolean newAsAttachment) {
		boolean oldAsAttachment = asAttachment;
		asAttachment = newAsAttachment;
		boolean oldAsAttachmentESet = asAttachmentESet;
		asAttachmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.FORM_DATA__AS_ATTACHMENT, oldAsAttachment, asAttachment, !oldAsAttachmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAsAttachment() {
		boolean oldAsAttachment = asAttachment;
		boolean oldAsAttachmentESet = asAttachmentESet;
		asAttachment = AS_ATTACHMENT_EDEFAULT;
		asAttachmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestPackage.FORM_DATA__AS_ATTACHMENT, oldAsAttachment, AS_ATTACHMENT_EDEFAULT, oldAsAttachmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAsAttachment() {
		return asAttachmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.FORM_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.FORM_DATA__ATTACHMENT_NAME:
				return basicSetAttachmentName(null, msgs);
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
			case RestPackage.FORM_DATA__EXTRACTED_BY_XPATH:
				return getExtractedByXpath();
			case RestPackage.FORM_DATA__ATTACHMENT_NAME:
				return getAttachmentName();
			case RestPackage.FORM_DATA__AS_ATTACHMENT:
				return isAsAttachment();
			case RestPackage.FORM_DATA__NAME:
				return getName();
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
			case RestPackage.FORM_DATA__EXTRACTED_BY_XPATH:
				setExtractedByXpath((String)newValue);
				return;
			case RestPackage.FORM_DATA__ATTACHMENT_NAME:
				setAttachmentName((RestProperty)newValue);
				return;
			case RestPackage.FORM_DATA__AS_ATTACHMENT:
				setAsAttachment((Boolean)newValue);
				return;
			case RestPackage.FORM_DATA__NAME:
				setName((String)newValue);
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
			case RestPackage.FORM_DATA__EXTRACTED_BY_XPATH:
				setExtractedByXpath(EXTRACTED_BY_XPATH_EDEFAULT);
				return;
			case RestPackage.FORM_DATA__ATTACHMENT_NAME:
				setAttachmentName((RestProperty)null);
				return;
			case RestPackage.FORM_DATA__AS_ATTACHMENT:
				unsetAsAttachment();
				return;
			case RestPackage.FORM_DATA__NAME:
				setName(NAME_EDEFAULT);
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
			case RestPackage.FORM_DATA__EXTRACTED_BY_XPATH:
				return EXTRACTED_BY_XPATH_EDEFAULT == null ? extractedByXpath != null : !EXTRACTED_BY_XPATH_EDEFAULT.equals(extractedByXpath);
			case RestPackage.FORM_DATA__ATTACHMENT_NAME:
				return attachmentName != null;
			case RestPackage.FORM_DATA__AS_ATTACHMENT:
				return isSetAsAttachment();
			case RestPackage.FORM_DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (extractedByXpath: ");
		result.append(extractedByXpath);
		result.append(", asAttachment: ");
		if (asAttachmentESet) result.append(asAttachment); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormDataImpl
