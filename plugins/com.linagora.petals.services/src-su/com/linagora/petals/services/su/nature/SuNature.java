/******************************************************************************
 * Copyright (c) 2008-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.su.nature;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * The nature given to SU projects.
 * When adding this nature, it also adds an incremental builder to the project.
 * 
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SuNature implements IProjectNature {

	/** The project to configure. */
	private IProject project;

	/** The ID of the SU nature. */
	public static final String NATURE_ID = "com.linagora.petals.tools.eclipse.su.main.nature"; //$NON-NLS-1$


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature
	 * #configure()
	 */
	public void configure() throws CoreException {

		IProjectDescription desc = this.project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy( commands, 0, newCommands, 0, commands.length );
		ICommand command = desc.newCommand ();
		command.setBuilderName( SuBuilder.BUILDER_ID );
		newCommands[ newCommands.length - 1 ] = command;

		desc.setBuildSpec( newCommands );
		this.project.setDescription( desc, null );
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature
	 * #deconfigure()
	 */
	public void deconfigure() throws CoreException {

		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();

		for( int i = 0; i < commands.length; ++i ) {
			if( commands[i].getBuilderName().equals( SuBuilder.BUILDER_ID )) {
				ICommand[] newCommands = new ICommand[ commands.length - 1 ];
				System.arraycopy( commands, 0, newCommands, 0, i );
				System.arraycopy( commands, i + 1, newCommands, i, commands.length - i - 1 );
				description.setBuildSpec( newCommands );
				return;
			}
		}
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature
	 * #getProject()
	 */
	public IProject getProject() {
		return this.project;
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature
	 * #setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject( IProject project ) {
		this.project = project;
	}
}
