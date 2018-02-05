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
 
package com.ebmwebsourcing.petals.common.internal.commands;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.ebmwebsourcing.petals.common.internal.PetalsCommonPlugin;

/**
 * A handler that opens the default Web browser at a given URL.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class VisitWebLinkHandler extends AbstractHandler {

	private static final String URL_PARAMETER = "url";


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler
	 * #execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute( ExecutionEvent event ) throws ExecutionException {

		String urlAsString = event.getParameter( URL_PARAMETER );
		if( urlAsString != null ) {
			try {
				URL url = new URL( urlAsString.trim());
				PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL( url );

			} catch( PartInitException e ) {
				PetalsCommonPlugin.log( e, IStatus.ERROR );

			} catch( MalformedURLException e ) {
				PetalsCommonPlugin.log( e, IStatus.ERROR );
			}
		}

		return null;
	}
}
