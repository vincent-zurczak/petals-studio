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
 
package com.linagora.petals.repositories.explorer.wizards;

import java.net.URI;

import org.eclipse.bpel.common.wsdl.helpers.UriAndUrlHelper;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.linagora.petals.repositories.explorer.model.QueryApiBean;
import com.linagora.petals.repositories.explorer.model.RepositoryQueryApi;
import com.linagora.petals.common.internal.provisional.utils.StringUtils;

/**
 * A dialog to ask for a query API and a query URL.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class QueryApiBeanDefinitionDialog extends TitleAreaDialog {

	private QueryApiBean queryApiBean;
	private String uriAsString;
	private RepositoryQueryApi api;


	/**
	 * Constructor.
	 * @param parentShell
	 * @param queryApiBean
	 */
	public QueryApiBeanDefinitionDialog( Shell parentShell, QueryApiBean queryApiBean ) {
		super( parentShell );

		if( queryApiBean != null )
			this.queryApiBean = queryApiBean;
		else
			this.queryApiBean = new QueryApiBean();
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog
	 * #createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea( Composite parent ) {

		Composite bigContainer = new Composite((Composite) super.createDialogArea( parent ), SWT.NONE );
		GridLayout layout = new GridLayout( 2, false );
		layout.marginWidth = 10;
		bigContainer.setLayout( layout );
		bigContainer.setLayoutData( new GridData( GridData.FILL_BOTH ));


		// Add the API field
		new Label( bigContainer, SWT.NONE ).setText( "Query API:" );
		ComboViewer viewer = new ComboViewer( bigContainer, SWT.BORDER | SWT.READ_ONLY | SWT.DROP_DOWN );
		viewer.getCombo().setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		viewer.setContentProvider( new ArrayContentProvider());
		viewer.setLabelProvider( new LabelProvider() {
			@Override
			public String getText( Object element ) {
				String result = "";
				if( element instanceof RepositoryQueryApi )
					result = ((RepositoryQueryApi) element).toString();
				return result;
			}
		});

		viewer.setInput( RepositoryQueryApi.values());
		viewer.addSelectionChangedListener( new ISelectionChangedListener() {
			public void selectionChanged( SelectionChangedEvent event ) {
				if( ! event.getSelection().isEmpty()) {
					QueryApiBeanDefinitionDialog.this.api =
						(RepositoryQueryApi) ((IStructuredSelection) event.getSelection()).getFirstElement();
					validate();
				}
			}
		});


		// Add the URL field
		new Label( bigContainer, SWT.NONE ).setText( "Query URI:" );
		Text urlText = new Text( bigContainer, SWT.SINGLE | SWT.BORDER );
		urlText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		urlText.addModifyListener( new ModifyListener() {
			public void modifyText( ModifyEvent e ) {
				QueryApiBeanDefinitionDialog.this.uriAsString = ((Text) e.widget).getText();
				validate();
			}
		});


		getShell().setText( "New Query API" );
		setTitle( "Query API" );
		setMessage( "Associate a new Query API with this repository." );
		return bigContainer;
	}


	/**
	 * Validates the dialog fields.
	 */
	private void validate() {

		URI uri = null;
		boolean complete = false;
		if( StringUtils.isEmpty( this.uriAsString )) {
			setErrorMessage( "You must specify the Query URI." );
		} else {
			try {
				uri = UriAndUrlHelper.urlToUri( this.uriAsString );
				complete = true;

			} catch( Exception e ) {
				setErrorMessage( "The Query URI is not a valid URI." );
			}
		}

		if( complete ) {
			setErrorMessage( null );
			this.queryApiBean.setQueryUri( uri );
			this.queryApiBean.setQueryApi( this.api );
		}
	}


	/**
	 * @return the queryApiBean
	 */
	public QueryApiBean getQueryApiBean() {
		return this.queryApiBean;
	}
}
