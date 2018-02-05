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
 
package com.ebmwebsourcing.petals.services.sa.refactoring;

import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;

import com.ebmwebsourcing.petals.common.internal.provisional.refactoring.MavenProjectRefactoringExtension;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsRefactoringUtils;
import com.ebmwebsourcing.petals.services.utils.ServiceProjectRelationUtils;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class RefactoringExtensionForSa extends MavenProjectRefactoringExtension {

	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.common.internal.provisional.refactoring.MavenProjectRefactoringExtension
	 * #createChange(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Change createChange( IProgressMonitor pm ) throws CoreException,
	OperationCanceledException {

		IFile jbiXmlFile = getInfo().getProject().getFile( PetalsConstants.LOC_JBI_FILE );
		TextFileChange textFileChange = PetalsRefactoringUtils.buildTextFileChange(
					jbiXmlFile,
					Pattern.quote( getInfo().getProject().getName()),
					null,
					null,
					getInfo().getNewName());

		Change result = null;
		if( textFileChange != null )
			result = textFileChange;

		return result;
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.common.internal.provisional.refactoring.MavenProjectRefactoringExtension
	 * #determineEnablement()
	 */
	@Override
	public void determineEnablement() {
		boolean enabled = ServiceProjectRelationUtils.isSaProject( getInfo().getProject());
		setEnabled( enabled );
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.common.internal.provisional.refactoring.MavenProjectRefactoringExtension
	 * #checkFinalConditions(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.ltk.core.refactoring.RefactoringStatus,
	 * org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext)
	 */
	@Override
	public void checkFinalConditions(
				IProgressMonitor pm,
				RefactoringStatus status,
				CheckConditionsContext context )
	throws CoreException, OperationCanceledException {

		// nothing
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.common.internal.provisional.refactoring.MavenProjectRefactoringExtension
	 * #checkInitialConditions(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.ltk.core.refactoring.RefactoringStatus)
	 */
	@Override
	public void checkInitialConditions( IProgressMonitor pm, RefactoringStatus status )
	throws CoreException, OperationCanceledException {

		// nothing
	}
}
