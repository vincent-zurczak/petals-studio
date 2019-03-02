/******************************************************************************
 * Copyright (c) 2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.flowable.v1x;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.StringUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.SwtFactory;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuWizardPage;

/**
 * @author Vincent Zurczak - Linagora
 */
public class FlowablePage1x extends AbstractSuWizardPage {

	private String tenantId = "my_tenant";
	private String categoryId = "samples";
	private String processfile = "collaboration.bpmn";


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.XsdBasedAbstractSuPage
	 * #dialogChanged()
	 */
	@Override
	public boolean validate() {

		String errorMsg = null;
		if( StringUtils.isEmpty( this.tenantId ))
			errorMsg = "You must specify the tenant ID.";
		else if( StringUtils.isEmpty( this.categoryId ))
			errorMsg = "You must specify the category ID.";
		else if( StringUtils.isEmpty( this.processfile ))
			errorMsg = "You must specify the process file's name.";
		else if( ! this.processfile.toLowerCase().endsWith( ".bpmn" ))
			errorMsg = "The process file's name must end with '.bpmn'.";

		updateStatus( errorMsg );
		return errorMsg == null;
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage
	 * #createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl( Composite parent ) {

		setDescription( "Specify the process properties." );

		// Create the composite container and define its layout.
		final Composite container = new Composite( parent, SWT.NONE );
		GridLayoutFactory.swtDefaults().extendedMargins( 15, 15, 20, 0 ).numColumns( 2 ).applyTo( container );
		container.setLayoutData( new GridData( GridData.FILL_BOTH ));
		setControl( container );

		// Add the fields to edit
		SwtFactory.createLabel( container, "Tenant ID:", "The tenant ID" );
		Text text = SwtFactory.createSimpleTextField( container, true );
		text.setText( this.tenantId );
		text.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				FlowablePage1x.this.tenantId = ((Text) e.widget).getText().trim();
				validate();
			}
		});

		SwtFactory.createLabel( container, "Category ID:", "The category ID" );
		text = SwtFactory.createSimpleTextField( container, true );
		text.setText( this.categoryId );
		text.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				FlowablePage1x.this.categoryId = ((Text) e.widget).getText().trim();
				validate();
			}
		});

		SwtFactory.createLabel( container, "Process file:", "The name of the process file" );
		text = SwtFactory.createSimpleTextField( container, true );
		text.setText( this.processfile );
		text.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				FlowablePage1x.this.processfile = ((Text) e.widget).getText().trim();
				validate();
			}
		});


		// Initialize the page
		validate();
		updateStatus( null );
	}


	/**
	 * @return the tenantId
	 */
	public String getTenantId() {
		return this.tenantId;
	}


	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return this.categoryId;
	}


	/**
	 * @return the processfile
	 */
	public String getProcessfile() {
		return this.processfile;
	}
}
