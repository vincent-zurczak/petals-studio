/******************************************************************************
 * Copyright (c) 2009-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.server.runtime;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.model.RuntimeDelegate;

import com.linagora.petals.server.PetalsServerPlugin;
import com.linagora.petals.server.handlers.IPetalsVersionHandler;

/**
 * The runtime for PEtALS.
 * <p>
 * It is an abstract representation of this server.<br />
 * It concerns elements common to every server for / instance of this runtime.
 * </p>
 * <p>
 * Keep an empty constructor, so that it can be instantiated from the extension-point.
 * </p>
 * 
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsRuntime
extends RuntimeDelegate
implements IPetalsRuntime, IPetalsRuntimeWorkingCopy {

	private final String VM_INSTALL_ID = "petals-vmInstallId";
	private final String VM_INSTALL_TYPE_ID = "petals-vmInstallTypeId";


	/**
	 * @return the VM Install type ID
	 */
	protected String getVMInstallTypeId() {
		return getAttribute( this.VM_INSTALL_TYPE_ID, "" );
	}


	/**
	 * @return the VM Install ID
	 */
	protected String getVMInstallId() {
		return getAttribute( this.VM_INSTALL_ID, "" );
	}


	/**
	 * @return
	 */
	public IPetalsVersionHandler getVersionHandler() {
		IRuntimeType type = getRuntime().getRuntimeType();
		return PetalsServerPlugin.getPetalsVersionHandler( type.getId());
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.server.runtime.IPetalsRuntime
	 * #getRuntimeClasspath()
	 */
	public List<File> getRuntimeClasspath() {
		IPath installPath = getRuntime().getLocation();
		return getVersionHandler().getRuntimeClasspath( installPath );
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jst.server.core.IJavaRuntime
	 * #getVMInstall()
	 */
	public IVMInstall getVMInstall() {

		String id = getVMInstallTypeId();
		if( id.length() == 0 )
			return JavaRuntime.getDefaultVMInstall();

		try {
			IVMInstallType vmInstallType = JavaRuntime.getVMInstallType( id );
			IVMInstall[] vmInstalls = vmInstallType.getVMInstalls();

			id = getVMInstallId();
			for( IVMInstall vmInstall : vmInstalls ) {
				if( id.equals( vmInstall.getId()))
					return vmInstall;
			}

		} catch( Exception e ) {
			// ignore
		}

		return JavaRuntime.getDefaultVMInstall();
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jst.server.core.IJavaRuntime
	 * #isUsingDefaultJRE()
	 */
	public boolean isUsingDefaultJRE() {
		return getVMInstallTypeId() == null;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jst.server.core.IJavaRuntimeWorkingCopy
	 * #setVMInstall(org.eclipse.jdt.launching.IVMInstall)
	 */
	public void setVMInstall( IVMInstall vmInstall ) {

		if( vmInstall == null ) {
			setAttribute( this.VM_INSTALL_ID, "" );
			setAttribute( this.VM_INSTALL_TYPE_ID, "" );
		} else {
			setAttribute( this.VM_INSTALL_ID, vmInstall.getId());
			setAttribute( this.VM_INSTALL_TYPE_ID, vmInstall.getVMInstallType().getId());
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.wst.server.core.model.RuntimeDelegate
	 * #validate()
	 */
	@Override
	public IStatus validate() {

		IPath installPath = getRuntime().getLocation();
		IStatus status = getVersionHandler().verifyInstallPath( installPath );
		return status;
	}
}
