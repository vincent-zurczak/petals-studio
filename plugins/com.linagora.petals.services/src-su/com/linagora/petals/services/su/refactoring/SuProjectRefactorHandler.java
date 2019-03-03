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
 
package com.linagora.petals.services.su.refactoring;

import com.linagora.petals.common.internal.provisional.commands.AbstractProjectRefactorHandler;
import com.linagora.petals.common.internal.provisional.refactoring.AbstractRefactoringWizardPage;
import com.linagora.petals.common.internal.provisional.refactoring.MavenProjectRefactoringProcessor;

/**
 * A handler to refactor SA projects.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SuProjectRefactorHandler extends AbstractProjectRefactorHandler {

	private AbstractRefactoringWizardPage userPage;


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.common.internal.provisional.commands.AbstractProjectRefactorHandler
	 * #getRefactoringProcessor()
	 */
	@Override
	public MavenProjectRefactoringProcessor getRefactoringProcessor() {

		RefactoringExtensionForSu ext = new RefactoringExtensionForSu();
		MavenProjectRefactoringProcessor processor =
			new MavenProjectRefactoringProcessor( ext );

		return processor;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.common.internal.provisional.commands.AbstractProjectRefactorHandler
	 * #getUserInputPage()
	 */
	@Override
	public AbstractRefactoringWizardPage getUserInputPage() {

		if( this.userPage == null )
			this.userPage = new SuRefactorUserPage();

		return this.userPage;
	}
}
