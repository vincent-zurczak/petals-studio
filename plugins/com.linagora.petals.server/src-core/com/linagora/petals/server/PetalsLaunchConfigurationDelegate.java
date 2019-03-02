/******************************************************************************
 * Copyright (c) 2009-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.server;

import java.io.File;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate2;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.ExecutionArguments;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.ServerUtil;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsLaunchConfigurationDelegate extends
AbstractJavaLaunchConfigurationDelegate implements
ILaunchConfigurationDelegate2 {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate
	 * #launch(
	 * 		org.eclipse.debug.core.ILaunchConfiguration,
	 * 		java.lang.String, org.eclipse.debug.core.ILaunch,
	 * 		org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(
				ILaunchConfiguration configuration,
				String mode,
				ILaunch launch,
				IProgressMonitor monitor )
	throws CoreException {

		IServer server = ServerUtil.getServer( configuration );
		if( server == null ) {
			// log
			return;
		}

		PetalsServerBehavior petalsServerBehavior =
			(PetalsServerBehavior) server.loadAdapter( PetalsServerBehavior.class, monitor );


		// Create the runner
		IVMInstall vm = verifyVMInstall( configuration );
		IVMRunner runner = vm.getVMRunner( mode );
		if( runner == null )
			runner = vm.getVMRunner( ILaunchManager.RUN_MODE );


		// Prepare launch arguments
		ExecutionArguments execArgs = new ExecutionArguments(
					getVMArguments( configuration ),
					getProgramArguments( configuration ));

		String[] envp = getEnvironment( configuration );
		Map<String,Object> vmAttributesMap = getVMSpecificAttributesMap( configuration );


		// The server libraries should be put in the launch configuration
		// by using ServerBehavior#setupLaunchConfiguration( ILaunchConfigurationWorkingCopy, IProgressMonitor )
		String[] classpath = getClasspath( configuration );


		// Create the VM configuration
		File workingDir = verifyWorkingDirectory( configuration );
		String workingDirName = null;
		if( workingDir != null )
			workingDirName = workingDir.getAbsolutePath();

		String mainTypeName = petalsServerBehavior.getRuntimeClass();
		VMRunnerConfiguration runConfig = new VMRunnerConfiguration( mainTypeName, classpath );
		runConfig.setProgramArguments( execArgs.getProgramArgumentsArray());
		runConfig.setVMArguments( execArgs.getVMArgumentsArray());
		runConfig.setVMSpecificAttributesMap( vmAttributesMap );
		runConfig.setWorkingDirectory( workingDirName );
		runConfig.setEnvironment( envp );

		String[] bootpath = getBootpath( configuration );
		if( bootpath != null && bootpath.length > 0 )
			runConfig.setBootClassPath( bootpath );


		// Launch the configuration
		petalsServerBehavior.setupLaunch( launch, mode, monitor );
		try {
			runner.run( runConfig, launch, monitor );
			if( launch.getProcesses().length == 0 )
				petalsServerBehavior.signalLaunchFailed();
			else
				petalsServerBehavior.startListening( launch.getProcesses()[ 0 ]);

		} catch( CoreException e ) {
			petalsServerBehavior.signalLaunchFailed();
			throw e;
		}
	}
}
