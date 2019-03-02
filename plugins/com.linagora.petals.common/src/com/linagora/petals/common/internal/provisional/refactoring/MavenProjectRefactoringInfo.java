/******************************************************************************
 * Copyright (c) 2010-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.internal.provisional.refactoring;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;

/**
 * An object that holds information for the refactoring.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class MavenProjectRefactoringInfo {

	private IProject project;
	private String newName;
	private final Map<String,Boolean> options = new HashMap<String,Boolean> ();

	/**
	 * @return the project
	 */
	public IProject getProject() {
		return this.project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject( IProject project ) {
		this.project = project;
	}

	/**
	 * @return the newName
	 */
	public String getNewName() {
		return this.newName;
	}

	/**
	 * @param newName the newName to set
	 */
	public void setNewName( String newName ) {
		this.newName = newName;
	}

	/**
	 * @return the options
	 */
	public Map<String,Boolean> getOptions() {
		return this.options;
	}
}
