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
 
package com.ebmwebsourcing.petals.services.eip.designer.actions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.ebmwebsourcing.petals.services.eip.PetalsEipPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ShowPropertiesAction extends Action {

	/**
	 * Constructor.
	 */
	public ShowPropertiesAction() {

		setId( "com.ebmwebsourcing.petals.services.eip.contextmenu.showproperties" );
		setText( "Show properties" );
		setToolTipText( "Show the properties" );
		setDescription( "Show the properties." );

		ImageDescriptor desc = PetalsEipPlugin.getImageDescriptor( "icons/obj16/properties.gif" );
		setImageDescriptor( desc );
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.jface.action.Action
	 * #run()
	 */
	@Override
	public void run() {

		try {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			page.showView( IPageLayout.ID_PROP_SHEET );

		} catch( PartInitException e ) {
			PetalsEipPlugin.log( e, IStatus.WARNING );
		}
	}
}
