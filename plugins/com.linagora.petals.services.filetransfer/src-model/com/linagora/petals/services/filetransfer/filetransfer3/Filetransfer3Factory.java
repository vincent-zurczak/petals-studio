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
 
package com.linagora.petals.services.filetransfer.filetransfer3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.linagora.petals.services.filetransfer.filetransfer3.Filetransfer3Package
 * @generated
 */
public interface Filetransfer3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Filetransfer3Factory eINSTANCE = com.linagora.petals.services.filetransfer.filetransfer3.impl.Filetransfer3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Transfer3 Provides</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Transfer3 Provides</em>'.
	 * @generated
	 */
	FileTransfer3Provides createFileTransfer3Provides();

	/**
	 * Returns a new object of class '<em>File Transfer3 Consumes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Transfer3 Consumes</em>'.
	 * @generated
	 */
	FileTransfer3Consumes createFileTransfer3Consumes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Filetransfer3Package getFiletransfer3Package();

} //Filetransfer3Factory
