/******************************************************************************
 * Copyright (c) 2010-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.internal.refactoring;

import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

import com.linagora.petals.common.internal.provisional.refactoring.AbstractRefactoringWizardPage;
import com.linagora.petals.common.internal.provisional.refactoring.MavenProjectRefactoringInfo;

/**
 * 
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class MavenProjectRefactoringWizard extends RefactoringWizard {

	private final AbstractRefactoringWizardPage userInputPage;

	/**
	 * Constructor.
	 * <p>
	 * Both the processor and the user input page must have been
	 * initialized first. They must have been passed the model object
	 * used to store refactoring information. For Petals projects,
	 * this class is {@link MavenProjectRefactoringInfo}.
	 * </p>
	 * 
	 * @param refactoring
	 * @param userInputPage
	 */
	public MavenProjectRefactoringWizard(
				Refactoring refactoring,
				AbstractRefactoringWizardPage userInputPage ) {

		super( refactoring, DIALOG_BASED_USER_INTERFACE );
		this.userInputPage = userInputPage;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ltk.ui.refactoring.RefactoringWizard
	 * #addUserInputPages()
	 */
	@Override
	protected void addUserInputPages() {
		setDefaultPageTitle( getRefactoring().getName());
		addPage( this.userInputPage );
	}
}
