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
 
package com.linagora.petals.services.eip.designer.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;

import com.linagora.petals.services.eip.designer.edit.commands.NodePasteCommand;

/**
 * An action to paste nodes on the diagram.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PasteNodeAction extends SelectionAction {

	/**
	 * Constructor.
	 * @param part
	 */
	public PasteNodeAction( IWorkbenchPart part ) {
		super( part );
		setLazyEnablementCalculation( true );
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction
	 * #init()
	 */
	@Override
	protected void init() {

		super.init();

		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		setText( "Paste" );
		setId( ActionFactory.PASTE.getId());
		setHoverImageDescriptor( sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE ));
		setImageDescriptor( sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE ));
		setDisabledImageDescriptor( sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE_DISABLED ));

		setEnabled( false );
	}


	/**
	 * @return
	 */
	private Command createPasteCommand() {
		return new NodePasteCommand();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction
	 * #calculateEnabled()
	 */
	@Override
	protected boolean calculateEnabled() {
		Command cmd = createPasteCommand();
		return cmd != null && cmd.canExecute();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.jface.action.Action
	 * #run()
	 */
	@Override
	public void run() {
		Command cmd = createPasteCommand();
		if( cmd != null && cmd.canExecute())
			execute( cmd );
	}
}
