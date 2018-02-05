/******************************************************************************
 * Copyright (c) 2011-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.services.jms.jms;

import com.sun.java.xml.ns.jbi.AbstractExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiProviderURL <em>Jndi Provider URL</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiInitialContextFactory <em>Jndi Initial Context Factory</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiDestinationName <em>Jndi Destination Name</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiConnectionFactory <em>Jndi Connection Factory</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getUser <em>User</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#isTransacted <em>Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension()
 * @model abstract="true"
 *        extendedMetaData="name=''"
 * @generated
 */
public interface JmsExtension extends AbstractExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Jndi Provider URL</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Provider URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Provider URL</em>' attribute.
	 * @see #isSetJndiProviderURL()
	 * @see #unsetJndiProviderURL()
	 * @see #setJndiProviderURL(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_JndiProviderURL()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='jndi-provider-url' namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getJndiProviderURL();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiProviderURL <em>Jndi Provider URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Provider URL</em>' attribute.
	 * @see #isSetJndiProviderURL()
	 * @see #unsetJndiProviderURL()
	 * @see #getJndiProviderURL()
	 * @generated
	 */
	void setJndiProviderURL(String value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiProviderURL <em>Jndi Provider URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJndiProviderURL()
	 * @see #getJndiProviderURL()
	 * @see #setJndiProviderURL(String)
	 * @generated
	 */
	void unsetJndiProviderURL();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiProviderURL <em>Jndi Provider URL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jndi Provider URL</em>' attribute is set.
	 * @see #unsetJndiProviderURL()
	 * @see #getJndiProviderURL()
	 * @see #setJndiProviderURL(String)
	 * @generated
	 */
	boolean isSetJndiProviderURL();

	/**
	 * Returns the value of the '<em><b>Jndi Initial Context Factory</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Initial Context Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Initial Context Factory</em>' attribute.
	 * @see #isSetJndiInitialContextFactory()
	 * @see #unsetJndiInitialContextFactory()
	 * @see #setJndiInitialContextFactory(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_JndiInitialContextFactory()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='jndi-initial-context-factory' namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getJndiInitialContextFactory();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiInitialContextFactory <em>Jndi Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Initial Context Factory</em>' attribute.
	 * @see #isSetJndiInitialContextFactory()
	 * @see #unsetJndiInitialContextFactory()
	 * @see #getJndiInitialContextFactory()
	 * @generated
	 */
	void setJndiInitialContextFactory(String value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiInitialContextFactory <em>Jndi Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJndiInitialContextFactory()
	 * @see #getJndiInitialContextFactory()
	 * @see #setJndiInitialContextFactory(String)
	 * @generated
	 */
	void unsetJndiInitialContextFactory();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiInitialContextFactory <em>Jndi Initial Context Factory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jndi Initial Context Factory</em>' attribute is set.
	 * @see #unsetJndiInitialContextFactory()
	 * @see #getJndiInitialContextFactory()
	 * @see #setJndiInitialContextFactory(String)
	 * @generated
	 */
	boolean isSetJndiInitialContextFactory();

	/**
	 * Returns the value of the '<em><b>Jndi Destination Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Destination Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Destination Name</em>' attribute.
	 * @see #isSetJndiDestinationName()
	 * @see #unsetJndiDestinationName()
	 * @see #setJndiDestinationName(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_JndiDestinationName()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='jndi-destination-name' namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getJndiDestinationName();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiDestinationName <em>Jndi Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Destination Name</em>' attribute.
	 * @see #isSetJndiDestinationName()
	 * @see #unsetJndiDestinationName()
	 * @see #getJndiDestinationName()
	 * @generated
	 */
	void setJndiDestinationName(String value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiDestinationName <em>Jndi Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJndiDestinationName()
	 * @see #getJndiDestinationName()
	 * @see #setJndiDestinationName(String)
	 * @generated
	 */
	void unsetJndiDestinationName();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiDestinationName <em>Jndi Destination Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jndi Destination Name</em>' attribute is set.
	 * @see #unsetJndiDestinationName()
	 * @see #getJndiDestinationName()
	 * @see #setJndiDestinationName(String)
	 * @generated
	 */
	boolean isSetJndiDestinationName();

	/**
	 * Returns the value of the '<em><b>Jndi Connection Factory</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Connection Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Connection Factory</em>' attribute.
	 * @see #isSetJndiConnectionFactory()
	 * @see #unsetJndiConnectionFactory()
	 * @see #setJndiConnectionFactory(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_JndiConnectionFactory()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" derived="true"
	 *        extendedMetaData="name='jndi-connection-factory' namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getJndiConnectionFactory();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiConnectionFactory <em>Jndi Connection Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Connection Factory</em>' attribute.
	 * @see #isSetJndiConnectionFactory()
	 * @see #unsetJndiConnectionFactory()
	 * @see #getJndiConnectionFactory()
	 * @generated
	 */
	void setJndiConnectionFactory(String value);

	/**
	 * Unsets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiConnectionFactory <em>Jndi Connection Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJndiConnectionFactory()
	 * @see #getJndiConnectionFactory()
	 * @see #setJndiConnectionFactory(String)
	 * @generated
	 */
	void unsetJndiConnectionFactory();

	/**
	 * Returns whether the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getJndiConnectionFactory <em>Jndi Connection Factory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jndi Connection Factory</em>' attribute is set.
	 * @see #unsetJndiConnectionFactory()
	 * @see #getJndiConnectionFactory()
	 * @see #setJndiConnectionFactory(String)
	 * @generated
	 */
	boolean isSetJndiConnectionFactory();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_User()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" derived="true"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_Password()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" derived="true"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Transacted</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacted</em>' attribute.
	 * @see #setTransacted(boolean)
	 * @see com.ebmwebsourcing.petals.services.jms.jms.JmsPackage#getJmsExtension_Transacted()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 *        extendedMetaData="namespace='##targetNamespace' kind='element' group='#group:0'"
	 * @generated
	 */
	boolean isTransacted();

	/**
	 * Sets the value of the '{@link com.ebmwebsourcing.petals.services.jms.jms.JmsExtension#isTransacted <em>Transacted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transacted</em>' attribute.
	 * @see #isTransacted()
	 * @generated
	 */
	void setTransacted(boolean value);

} // JmsExtension
