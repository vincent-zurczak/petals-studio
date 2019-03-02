/******************************************************************************
 * Copyright (c) 2012-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.filetransfer.filetransfer2x.impl;

import com.linagora.petals.services.cdk.cdk5.Cdk5Package;

import com.linagora.petals.services.filetransfer.filetransfer2x.CopyMode;
import com.linagora.petals.services.filetransfer.filetransfer2x.FileTransferConsumes;
import com.linagora.petals.services.filetransfer.filetransfer2x.FileTransferProvides;
import com.linagora.petals.services.filetransfer.filetransfer2x.Filetransfer2xFactory;
import com.linagora.petals.services.filetransfer.filetransfer2x.Filetransfer2xPackage;
import com.linagora.petals.services.filetransfer.filetransfer2x.TransferMode;

import com.linagora.petals.services.filetransfer.filetransfer3.Filetransfer3Package;

import com.linagora.petals.services.filetransfer.filetransfer3.impl.Filetransfer3PackageImpl;

import com.sun.java.xml.ns.jbi.JbiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Filetransfer2xPackageImpl extends EPackageImpl implements Filetransfer2xPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTransferProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTransferConsumesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum copyModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.linagora.petals.services.filetransfer.filetransfer2x.Filetransfer2xPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Filetransfer2xPackageImpl() {
		super(eNS_URI, Filetransfer2xFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Filetransfer2xPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Filetransfer2xPackage init() {
		if (isInited) return (Filetransfer2xPackage)EPackage.Registry.INSTANCE.getEPackage(Filetransfer2xPackage.eNS_URI);

		// Obtain or create and register package
		Filetransfer2xPackageImpl theFiletransfer2xPackage = (Filetransfer2xPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Filetransfer2xPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Filetransfer2xPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Cdk5Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Filetransfer3PackageImpl theFiletransfer3Package = (Filetransfer3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Filetransfer3Package.eNS_URI) instanceof Filetransfer3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Filetransfer3Package.eNS_URI) : Filetransfer3Package.eINSTANCE);

		// Create package meta-data objects
		theFiletransfer2xPackage.createPackageContents();
		theFiletransfer3Package.createPackageContents();

		// Initialize created meta-data
		theFiletransfer2xPackage.initializePackageContents();
		theFiletransfer3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFiletransfer2xPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Filetransfer2xPackage.eNS_URI, theFiletransfer2xPackage);
		return theFiletransfer2xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTransferProvides() {
		return fileTransferProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferProvides_WriteDirectory() {
		return (EAttribute)fileTransferProvidesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferProvides_CopyMode() {
		return (EAttribute)fileTransferProvidesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferProvides_FilePattern() {
		return (EAttribute)fileTransferProvidesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferProvides_ReadDirectory() {
		return (EAttribute)fileTransferProvidesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferProvides_BackupDirectory() {
		return (EAttribute)fileTransferProvidesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTransferConsumes() {
		return fileTransferConsumesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferConsumes_ReadDirectory() {
		return (EAttribute)fileTransferConsumesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferConsumes_BackupDirectory() {
		return (EAttribute)fileTransferConsumesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferConsumes_TransferMode() {
		return (EAttribute)fileTransferConsumesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferConsumes_FilePattern() {
		return (EAttribute)fileTransferConsumesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileTransferConsumes_PollingPeriod() {
		return (EAttribute)fileTransferConsumesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCopyMode() {
		return copyModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferMode() {
		return transferModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filetransfer2xFactory getFiletransfer2xFactory() {
		return (Filetransfer2xFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fileTransferProvidesEClass = createEClass(FILE_TRANSFER_PROVIDES);
		createEAttribute(fileTransferProvidesEClass, FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY);
		createEAttribute(fileTransferProvidesEClass, FILE_TRANSFER_PROVIDES__COPY_MODE);
		createEAttribute(fileTransferProvidesEClass, FILE_TRANSFER_PROVIDES__FILE_PATTERN);
		createEAttribute(fileTransferProvidesEClass, FILE_TRANSFER_PROVIDES__READ_DIRECTORY);
		createEAttribute(fileTransferProvidesEClass, FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY);

		fileTransferConsumesEClass = createEClass(FILE_TRANSFER_CONSUMES);
		createEAttribute(fileTransferConsumesEClass, FILE_TRANSFER_CONSUMES__READ_DIRECTORY);
		createEAttribute(fileTransferConsumesEClass, FILE_TRANSFER_CONSUMES__BACKUP_DIRECTORY);
		createEAttribute(fileTransferConsumesEClass, FILE_TRANSFER_CONSUMES__TRANSFER_MODE);
		createEAttribute(fileTransferConsumesEClass, FILE_TRANSFER_CONSUMES__FILE_PATTERN);
		createEAttribute(fileTransferConsumesEClass, FILE_TRANSFER_CONSUMES__POLLING_PERIOD);

		// Create enums
		copyModeEEnum = createEEnum(COPY_MODE);
		transferModeEEnum = createEEnum(TRANSFER_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JbiPackage theJbiPackage = (JbiPackage)EPackage.Registry.INSTANCE.getEPackage(JbiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fileTransferProvidesEClass.getESuperTypes().add(theJbiPackage.getProvides());
		fileTransferConsumesEClass.getESuperTypes().add(theJbiPackage.getConsumes());

		// Initialize classes and features; add operations and parameters
		initEClass(fileTransferProvidesEClass, FileTransferProvides.class, "FileTransferProvides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileTransferProvides_WriteDirectory(), ecorePackage.getEString(), "writeDirectory", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferProvides_CopyMode(), this.getCopyMode(), "copyMode", "CopyMode.CONTENT_ONLY", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferProvides_FilePattern(), ecorePackage.getEString(), "filePattern", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferProvides_ReadDirectory(), ecorePackage.getEString(), "readDirectory", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferProvides_BackupDirectory(), ecorePackage.getEString(), "backupDirectory", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fileTransferConsumesEClass, FileTransferConsumes.class, "FileTransferConsumes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileTransferConsumes_ReadDirectory(), ecorePackage.getEString(), "readDirectory", null, 1, 1, FileTransferConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferConsumes_BackupDirectory(), ecorePackage.getEString(), "backupDirectory", null, 0, 1, FileTransferConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferConsumes_TransferMode(), this.getTransferMode(), "transferMode", "TransferMode.CONTENT", 0, 1, FileTransferConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferConsumes_FilePattern(), ecorePackage.getEString(), "filePattern", null, 0, 1, FileTransferConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileTransferConsumes_PollingPeriod(), ecorePackage.getEInt(), "pollingPeriod", null, 0, 1, FileTransferConsumes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(copyModeEEnum, CopyMode.class, "CopyMode");
		addEEnumLiteral(copyModeEEnum, CopyMode.CONTENT_ONLY);
		addEEnumLiteral(copyModeEEnum, CopyMode.ATTACHMENTS_ONLY);
		addEEnumLiteral(copyModeEEnum, CopyMode.CONTENT_AND_ATTACHMENTS);

		initEEnum(transferModeEEnum, TransferMode.class, "TransferMode");
		addEEnumLiteral(transferModeEEnum, TransferMode.CONTENT);
		addEEnumLiteral(transferModeEEnum, TransferMode.ATTACHMENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (fileTransferProvidesEClass, 
		   source, 
		   new String[] {
			 "name", ""
		   });		
		addAnnotation
		  (getFileTransferProvides_WriteDirectory(), 
		   source, 
		   new String[] {
			 "name", "write-directory",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferProvides_CopyMode(), 
		   source, 
		   new String[] {
			 "name", "copy-mode",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferProvides_FilePattern(), 
		   source, 
		   new String[] {
			 "name", "file-pattern",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferProvides_ReadDirectory(), 
		   source, 
		   new String[] {
			 "name", "read-directory",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferProvides_BackupDirectory(), 
		   source, 
		   new String[] {
			 "name", "backup-directory",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (fileTransferConsumesEClass, 
		   source, 
		   new String[] {
			 "name", ""
		   });		
		addAnnotation
		  (getFileTransferConsumes_ReadDirectory(), 
		   source, 
		   new String[] {
			 "name", "read-directory",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferConsumes_BackupDirectory(), 
		   source, 
		   new String[] {
			 "name", "backup-directory",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferConsumes_TransferMode(), 
		   source, 
		   new String[] {
			 "name", "transfer-mode",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferConsumes_FilePattern(), 
		   source, 
		   new String[] {
			 "name", "file-pattern",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFileTransferConsumes_PollingPeriod(), 
		   source, 
		   new String[] {
			 "name", "polling-period",
			 "kind", "element",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });
	}

} //Filetransfer2xPackageImpl
