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
 
package com.linagora.petals.common.internal.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.MoveResourceAction;

import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsMoveHandler extends AbstractHandler {

	private final MoveResourceAction moveAction;
	private final List<IResource> resourcesToMove = new ArrayList<IResource> ();


	/**
	 * Constructor.
	 */
	public PetalsMoveHandler() {

		final Shell shell = new Shell( Display.getDefault());
		this.moveAction = new MoveResourceAction( new IShellProvider() {
			@Override
			public Shell getShell() {
				return shell;
			}
		});
	}


	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler
	 * #execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException {

		this.moveAction.selectionChanged( new StructuredSelection( this.resourcesToMove ));
		this.moveAction.run();
		return null;
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler
	 * #setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled( Object evaluationContext ) {

		this.resourcesToMove.clear();

		// Check the target view
		IWorkbenchPart part = null;
		try {
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		} catch( Exception e ) {
			// nothing
		}

		if( part == null ||
					! PetalsConstants.PETALS_PROJECT_EXPLORER_VIEW_ID.equals( part.getSite().getId())) {
			super.setBaseEnabled( false );
			return;
		}

		// Check the selection
		ISelection s = null;
		try {
			s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		} catch( Exception e1 ) {
			// nothing
		}

		if( s == null || s.isEmpty() || !( s instanceof IStructuredSelection )) {
			super.setBaseEnabled( false );
			return;
		}

		// The selection cannot contain any project.
		// The selection can only contain siblings.
		boolean fine = true;
		IResource parent = null;
		for( Iterator<?> it=((IStructuredSelection) s).iterator(); fine && it.hasNext(); ) {
			Object o = it.next();
			if( o instanceof IResource ) {

				this.resourcesToMove.add((IResource) o);
				if( o instanceof IProject )
					fine = false;
				else if( parent == null )
					parent = ((IResource) o).getParent();
				else if( ! parent.equals(((IResource) o).getParent()))
					fine = false;
			}
			else
				fine = false;
		}

		super.setBaseEnabled( fine );
	}
}
