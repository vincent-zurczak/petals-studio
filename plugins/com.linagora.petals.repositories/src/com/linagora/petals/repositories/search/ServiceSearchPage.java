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

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


/**
 * 
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ServiceSearchPage extends DialogPage implements ISearchPage {

	/**
	 * Constructor.
	 */
	public ServiceSearchPage() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructor.
	 * @param title
	 */
	public ServiceSearchPage( String title ) {
		super( title );
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructor.
	 * @param title
	 * @param image
	 */
	public ServiceSearchPage( String title, ImageDescriptor image ) {
		super( title, image );
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see org.eclipse.search.ui.ISearchPage#performAction()
	 */
	public boolean performAction() {
		// TODO Auto-generated method stub
		return false;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.search.ui.ISearchPage#setContainer(org.eclipse.search.ui.ISearchPageContainer)
	 */
	public void setContainer( ISearchPageContainer container ) {
		// TODO Auto-generated method stub

	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl( Composite parent ) {

		Composite container = new Composite( parent, SWT.NONE );
		container.setLayout( new GridLayout());
		container.setLayoutData( new GridData( GridData.FILL_BOTH ));

		new Label( container, SWT.NONE ).setText( "Hello World!" );
		setControl( container );
	}
}
