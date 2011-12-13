/**
 * Copyright (c) 2011, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 */
package com.ebmwebsourcing.petals.services.ftp.ftp3.impl;

import com.ebmwebsourcing.petals.jbi.editor.form.cdk5.model.cdk5.impl.CDK5ProvidesImpl;

import com.ebmwebsourcing.petals.services.ftp.ftp3.ConnectionType;
import com.ebmwebsourcing.petals.services.ftp.ftp3.Ftp3Package;
import com.ebmwebsourcing.petals.services.ftp.ftp3.FtpProvides;
import com.ebmwebsourcing.petals.services.ftp.ftp3.TransferType;

import com.sun.java.xml.ns.jbi.impl.ProvidesImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ftp Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#isDeleteProcessedFiles <em>Delete Processed Files</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#isOverwrite <em>Overwrite</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getServer <em>Server</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getUser <em>User</em>}</li>
 *   <li>{@link com.ebmwebsourcing.petals.services.ftp.ftp3.impl.FtpProvidesImpl#getTransferType <em>Transfer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FtpProvidesImpl extends ProvidesImpl implements FtpProvides {
	/**
	 * The default value of the '{@link #getConnectionMode() <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType CONNECTION_MODE_EDEFAULT = ConnectionType.ACTIVE;

	/**
	 * The cached value of the '{@link #getConnectionMode() <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMode()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionMode = CONNECTION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeleteProcessedFiles() <em>Delete Processed Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteProcessedFiles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_PROCESSED_FILES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteProcessedFiles() <em>Delete Processed Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteProcessedFiles()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteProcessedFiles = DELETE_PROCESSED_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	protected String folder = FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverwrite() <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverwrite() <em>Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwrite()
	 * @generated
	 * @ordered
	 */
	protected boolean overwrite = OVERWRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected String server = SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected static final TransferType TRANSFER_TYPE_EDEFAULT = TransferType.AUTO;

	/**
	 * The cached value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected TransferType transferType = TRANSFER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FtpProvidesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ftp3Package.Literals.FTP_PROVIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getConnectionMode() {
		return connectionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionMode(ConnectionType newConnectionMode) {
		ConnectionType oldConnectionMode = connectionMode;
		connectionMode = newConnectionMode == null ? CONNECTION_MODE_EDEFAULT : newConnectionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__CONNECTION_MODE, oldConnectionMode, connectionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteProcessedFiles() {
		return deleteProcessedFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteProcessedFiles(boolean newDeleteProcessedFiles) {
		boolean oldDeleteProcessedFiles = deleteProcessedFiles;
		deleteProcessedFiles = newDeleteProcessedFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__DELETE_PROCESSED_FILES, oldDeleteProcessedFiles, deleteProcessedFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(String newFolder) {
		String oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__FOLDER, oldFolder, folder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverwrite() {
		return overwrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverwrite(boolean newOverwrite) {
		boolean oldOverwrite = overwrite;
		overwrite = newOverwrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__OVERWRITE, oldOverwrite, overwrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(String newServer) {
		String oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType getTransferType() {
		return transferType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferType(TransferType newTransferType) {
		TransferType oldTransferType = transferType;
		transferType = newTransferType == null ? TRANSFER_TYPE_EDEFAULT : newTransferType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ftp3Package.FTP_PROVIDES__TRANSFER_TYPE, oldTransferType, transferType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ftp3Package.FTP_PROVIDES__CONNECTION_MODE:
				return getConnectionMode();
			case Ftp3Package.FTP_PROVIDES__DELETE_PROCESSED_FILES:
				return isDeleteProcessedFiles();
			case Ftp3Package.FTP_PROVIDES__FILENAME:
				return getFilename();
			case Ftp3Package.FTP_PROVIDES__FOLDER:
				return getFolder();
			case Ftp3Package.FTP_PROVIDES__OVERWRITE:
				return isOverwrite();
			case Ftp3Package.FTP_PROVIDES__PASSWORD:
				return getPassword();
			case Ftp3Package.FTP_PROVIDES__PORT:
				return getPort();
			case Ftp3Package.FTP_PROVIDES__SERVER:
				return getServer();
			case Ftp3Package.FTP_PROVIDES__USER:
				return getUser();
			case Ftp3Package.FTP_PROVIDES__TRANSFER_TYPE:
				return getTransferType();
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
			case Ftp3Package.FTP_PROVIDES__CONNECTION_MODE:
				setConnectionMode((ConnectionType)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__DELETE_PROCESSED_FILES:
				setDeleteProcessedFiles((Boolean)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__FILENAME:
				setFilename((String)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__FOLDER:
				setFolder((String)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__OVERWRITE:
				setOverwrite((Boolean)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__PASSWORD:
				setPassword((String)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__PORT:
				setPort((Integer)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__SERVER:
				setServer((String)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__USER:
				setUser((String)newValue);
				return;
			case Ftp3Package.FTP_PROVIDES__TRANSFER_TYPE:
				setTransferType((TransferType)newValue);
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
			case Ftp3Package.FTP_PROVIDES__CONNECTION_MODE:
				setConnectionMode(CONNECTION_MODE_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__DELETE_PROCESSED_FILES:
				setDeleteProcessedFiles(DELETE_PROCESSED_FILES_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__FOLDER:
				setFolder(FOLDER_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__OVERWRITE:
				setOverwrite(OVERWRITE_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__SERVER:
				setServer(SERVER_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__USER:
				setUser(USER_EDEFAULT);
				return;
			case Ftp3Package.FTP_PROVIDES__TRANSFER_TYPE:
				setTransferType(TRANSFER_TYPE_EDEFAULT);
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
			case Ftp3Package.FTP_PROVIDES__CONNECTION_MODE:
				return connectionMode != CONNECTION_MODE_EDEFAULT;
			case Ftp3Package.FTP_PROVIDES__DELETE_PROCESSED_FILES:
				return deleteProcessedFiles != DELETE_PROCESSED_FILES_EDEFAULT;
			case Ftp3Package.FTP_PROVIDES__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case Ftp3Package.FTP_PROVIDES__FOLDER:
				return FOLDER_EDEFAULT == null ? folder != null : !FOLDER_EDEFAULT.equals(folder);
			case Ftp3Package.FTP_PROVIDES__OVERWRITE:
				return overwrite != OVERWRITE_EDEFAULT;
			case Ftp3Package.FTP_PROVIDES__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case Ftp3Package.FTP_PROVIDES__PORT:
				return port != PORT_EDEFAULT;
			case Ftp3Package.FTP_PROVIDES__SERVER:
				return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
			case Ftp3Package.FTP_PROVIDES__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case Ftp3Package.FTP_PROVIDES__TRANSFER_TYPE:
				return transferType != TRANSFER_TYPE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connectionMode: ");
		result.append(connectionMode);
		result.append(", deleteProcessedFiles: ");
		result.append(deleteProcessedFiles);
		result.append(", filename: ");
		result.append(filename);
		result.append(", folder: ");
		result.append(folder);
		result.append(", overwrite: ");
		result.append(overwrite);
		result.append(", password: ");
		result.append(password);
		result.append(", port: ");
		result.append(port);
		result.append(", server: ");
		result.append(server);
		result.append(", user: ");
		result.append(user);
		result.append(", transferType: ");
		result.append(transferType);
		result.append(')');
		return result.toString();
	}

} //FtpProvidesImpl