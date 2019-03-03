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
 
package com.linagora.petals.repositories.search;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

import com.linagora.petals.repositories.PetalsRepositoriesPlugin;

/**
 * An action that opens the search dialog and shows the "Service Search" tab.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class OpenServiceSearchDialogAction implements IWorkbenchWindowActionDelegate {

	/**
	 * The ID of the search page for services.
	 */
	private static final String SERVICE_SEARCH_PAGE_ID = "com.linagora.petals.repositories.search";



	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate
	 * #dispose()
	 */
	public void dispose() {
		// nothing
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate
	 * #init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init( IWorkbenchWindow window ) {
		// nothing
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate
	 * #run(org.eclipse.jface.action.IAction)
	 */
	public void run( IAction action ) {

		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = null;
		if( workbench != null )
			window = workbench.getActiveWorkbenchWindow();

		if( window != null )
			NewSearchUI.openSearchDialog( window, SERVICE_SEARCH_PAGE_ID );
		else
			PetalsRepositoriesPlugin.log( "The search dialog could not be open.", IStatus.ERROR );
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate
	 * #selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged( IAction action, ISelection selection ) {
		// nothing
	}
}
