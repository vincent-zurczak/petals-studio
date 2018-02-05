/******************************************************************************
 * Copyright (c) 2011-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.common.croquis.internal.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.ebmwebsourcing.petals.common.croquis.internal.provisional.CroquisNewWizardPage;
import com.ebmwebsourcing.petals.common.croquis.internal.provisional.ICroquisExtension;
import com.ebmwebsourcing.petals.common.internal.PetalsCommonPlugin;

/**
 * A wizard to create a croquis.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class CroquisNewWizard extends Wizard implements INewWizard {

	private CroquisNewWizardPage mainPage;
	private IStatus status;


	/**
	 * Constructor.
	 */
	public CroquisNewWizard() {
		setNeedsProgressMonitor( true );
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.jface.wizard.Wizard
	 * #addPages()
	 */
	@Override
	public void addPages() {
		this.mainPage = new CroquisNewWizardPage();
		addPage( this.mainPage );
	}


	/* (non-Jsdoc)
	 * @see org.eclipse.ui.IWorkbenchWizard
	 * #init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init( IWorkbench workbench, IStructuredSelection selection ) {
		// nothing
	}


	/* (non-Jsdoc)
	 * @see org.eclipse.jface.wizard.Wizard
	 * #performFinish()
	 */
	@Override
	public boolean performFinish() {

		final ICroquisExtension extension = this.mainPage.getSelectedExtension();
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			@Override
			protected void execute( IProgressMonitor monitor )
			throws CoreException, InvocationTargetException, InterruptedException {

				try {
					monitor.beginTask( "Creating resources for the croquis...", IProgressMonitor.UNKNOWN );
					CroquisNewWizard.this.status = extension.performFinish( monitor );

				} catch( Exception e ) {
					throw new InvocationTargetException( e );

				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run( true, false, op );
		} catch( Exception e ) {
			return false;
		}

		boolean result = this.status != null && this.status.isOK();
		if( result ) {
			try {
				extension.performAfterFinish();

			}catch( Exception e ) {
				PetalsCommonPlugin.log( e, IStatus.ERROR );
			}
		}

		return result;
	}
}
