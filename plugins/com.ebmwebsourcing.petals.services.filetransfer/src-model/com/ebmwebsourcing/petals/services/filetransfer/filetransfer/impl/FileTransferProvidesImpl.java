/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl;

import com.ebmwebsourcing.petals.services.filetransfer.filetransfer.CopyMode;
import com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferExtension;
import com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferPackage;
import com.ebmwebsourcing.petals.services.filetransfer.filetransfer.FileTransferProvides;

import com.sun.java.xml.ns.jbi.impl.ProvidesImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl.FileTransferProvidesImpl#getFilePattern <em>File Pattern</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl.FileTransferProvidesImpl#getReadDirectory <em>Read Directory</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl.FileTransferProvidesImpl#getBackupDirectory <em>Backup Directory</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl.FileTransferProvidesImpl#getWriteDirectory <em>Write Directory</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.filetransfer.filetransfer.impl.FileTransferProvidesImpl#getCopyMode <em>Copy Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTransferProvidesImpl extends ProvidesImpl implements FileTransferProvides {
	/**
	 * The default value of the '{@link #getFilePattern() <em>File Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePattern() <em>File Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePattern()
	 * @generated
	 * @ordered
	 */
	protected String filePattern = FILE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadDirectory() <em>Read Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadDirectory() <em>Read Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadDirectory()
	 * @generated
	 * @ordered
	 */
	protected String readDirectory = READ_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackupDirectory() <em>Backup Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKUP_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackupDirectory() <em>Backup Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupDirectory()
	 * @generated
	 * @ordered
	 */
	protected String backupDirectory = BACKUP_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteDirectory() <em>Write Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteDirectory() <em>Write Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteDirectory()
	 * @generated
	 * @ordered
	 */
	protected String writeDirectory = WRITE_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyMode() <em>Copy Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMode()
	 * @generated
	 * @ordered
	 */
	protected static final CopyMode COPY_MODE_EDEFAULT = CopyMode.CONTENT_ONLY;

	/**
	 * The cached value of the '{@link #getCopyMode() <em>Copy Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyMode()
	 * @generated
	 * @ordered
	 */
	protected CopyMode copyMode = COPY_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTransferProvidesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileTransferPackage.Literals.FILE_TRANSFER_PROVIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePattern() {
		return filePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePattern(String newFilePattern) {
		String oldFilePattern = filePattern;
		filePattern = newFilePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN, oldFilePattern, filePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReadDirectory() {
		return readDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadDirectory(String newReadDirectory) {
		String oldReadDirectory = readDirectory;
		readDirectory = newReadDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY, oldReadDirectory, readDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackupDirectory() {
		return backupDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackupDirectory(String newBackupDirectory) {
		String oldBackupDirectory = backupDirectory;
		backupDirectory = newBackupDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY, oldBackupDirectory, backupDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWriteDirectory() {
		return writeDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteDirectory(String newWriteDirectory) {
		String oldWriteDirectory = writeDirectory;
		writeDirectory = newWriteDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackage.FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY, oldWriteDirectory, writeDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyMode getCopyMode() {
		return copyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyMode(CopyMode newCopyMode) {
		CopyMode oldCopyMode = copyMode;
		copyMode = newCopyMode == null ? COPY_MODE_EDEFAULT : newCopyMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FileTransferPackage.FILE_TRANSFER_PROVIDES__COPY_MODE, oldCopyMode, copyMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN:
				return getFilePattern();
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY:
				return getReadDirectory();
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY:
				return getBackupDirectory();
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY:
				return getWriteDirectory();
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__COPY_MODE:
				return getCopyMode();
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
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN:
				setFilePattern((String)newValue);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY:
				setReadDirectory((String)newValue);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY:
				setBackupDirectory((String)newValue);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY:
				setWriteDirectory((String)newValue);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__COPY_MODE:
				setCopyMode((CopyMode)newValue);
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
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN:
				setFilePattern(FILE_PATTERN_EDEFAULT);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY:
				setReadDirectory(READ_DIRECTORY_EDEFAULT);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY:
				setBackupDirectory(BACKUP_DIRECTORY_EDEFAULT);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY:
				setWriteDirectory(WRITE_DIRECTORY_EDEFAULT);
				return;
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__COPY_MODE:
				setCopyMode(COPY_MODE_EDEFAULT);
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
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN:
				return FILE_PATTERN_EDEFAULT == null ? filePattern != null : !FILE_PATTERN_EDEFAULT.equals(filePattern);
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY:
				return READ_DIRECTORY_EDEFAULT == null ? readDirectory != null : !READ_DIRECTORY_EDEFAULT.equals(readDirectory);
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY:
				return BACKUP_DIRECTORY_EDEFAULT == null ? backupDirectory != null : !BACKUP_DIRECTORY_EDEFAULT.equals(backupDirectory);
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__WRITE_DIRECTORY:
				return WRITE_DIRECTORY_EDEFAULT == null ? writeDirectory != null : !WRITE_DIRECTORY_EDEFAULT.equals(writeDirectory);
			case FileTransferPackage.FILE_TRANSFER_PROVIDES__COPY_MODE:
				return copyMode != COPY_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FileTransferExtension.class) {
			switch (derivedFeatureID) {
				case FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN: return FileTransferPackage.FILE_TRANSFER_EXTENSION__FILE_PATTERN;
				case FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY: return FileTransferPackage.FILE_TRANSFER_EXTENSION__READ_DIRECTORY;
				case FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY: return FileTransferPackage.FILE_TRANSFER_EXTENSION__BACKUP_DIRECTORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FileTransferExtension.class) {
			switch (baseFeatureID) {
				case FileTransferPackage.FILE_TRANSFER_EXTENSION__FILE_PATTERN: return FileTransferPackage.FILE_TRANSFER_PROVIDES__FILE_PATTERN;
				case FileTransferPackage.FILE_TRANSFER_EXTENSION__READ_DIRECTORY: return FileTransferPackage.FILE_TRANSFER_PROVIDES__READ_DIRECTORY;
				case FileTransferPackage.FILE_TRANSFER_EXTENSION__BACKUP_DIRECTORY: return FileTransferPackage.FILE_TRANSFER_PROVIDES__BACKUP_DIRECTORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filePattern: ");
		result.append(filePattern);
		result.append(", readDirectory: ");
		result.append(readDirectory);
		result.append(", backupDirectory: ");
		result.append(backupDirectory);
		result.append(", writeDirectory: ");
		result.append(writeDirectory);
		result.append(", copyMode: ");
		result.append(copyMode);
		result.append(')');
		return result.toString();
	}

} //FileTransferProvidesImpl
