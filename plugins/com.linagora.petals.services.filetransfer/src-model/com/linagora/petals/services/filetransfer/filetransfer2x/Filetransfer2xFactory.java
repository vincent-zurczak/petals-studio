/******************************************************************************
 * Copyright (c) 2012-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.filetransfer.filetransfer2x;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.filetransfer.filetransfer2x.Filetransfer2xPackage
 * @generated
 */
public interface Filetransfer2xFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Filetransfer2xFactory eINSTANCE = com.linagora.petals.services.filetransfer.filetransfer2x.impl.Filetransfer2xFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Transfer Provides</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Transfer Provides</em>'.
	 * @generated
	 */
	FileTransferProvides createFileTransferProvides();

	/**
	 * Returns a new object of class '<em>File Transfer Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Transfer Consumes</em>'.
	 * @generated
	 */
	FileTransferConsumes createFileTransferConsumes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Filetransfer2xPackage getFiletransfer2xPackage();

} //Filetransfer2xFactory
