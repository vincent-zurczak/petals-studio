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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Response Body As</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.rest.rest.RestPackage#getResponseBodyAs()
 * @model extendedMetaData="name='ResponseBodyAs'"
 * @generated
 */
public enum ResponseBodyAs implements Enumerator {
	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(0, "auto", "auto"),

	/**
	 * The '<em><b>Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_VALUE
	 * @generated
	 * @ordered
	 */
	XML(1, "xml", "xml"),

	/**
	 * The '<em><b>Json</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(2, "json", "json"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(3, "attachment", "attachment");

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 0;

	/**
	 * The '<em><b>Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xml</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML
	 * @model name="xml"
	 * @generated
	 * @ordered
	 */
	public static final int XML_VALUE = 1;

	/**
	 * The '<em><b>Json</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Json</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model name="json"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 2;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attachment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT
	 * @model name="attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Response Body As</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResponseBodyAs[] VALUES_ARRAY =
		new ResponseBodyAs[] {
			AUTO,
			XML,
			JSON,
			ATTACHMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Response Body As</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResponseBodyAs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Response Body As</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseBodyAs get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseBodyAs result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Body As</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseBodyAs getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseBodyAs result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Body As</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseBodyAs get(int value) {
		switch (value) {
			case AUTO_VALUE: return AUTO;
			case XML_VALUE: return XML;
			case JSON_VALUE: return JSON;
			case ATTACHMENT_VALUE: return ATTACHMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResponseBodyAs(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ResponseBodyAs
