/******************************************************************************
 * Copyright (c) 2008-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.services.su.wizards.pages;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * The abstract page used in the wizards of this plug-in.
 * <p>
 * Every sub-class instantiated from the extension-point should extend this class
 * or one of its subclasses, and define an empty constructor.
 * </p>
 *
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class AbstractSuWizardPage extends WizardPage {

	/**
	 * Count the number of these pages and ensure they never have the same name.
	 */
	private static AtomicInteger cpt = new AtomicInteger( 0 );



	/**
	 * Constructor defining the page name.
	 */
	public AbstractSuWizardPage() {
		super( "AbstractSuPage_" + cpt.getAndIncrement());
	}


	/**
	 * Constructor defining the page name.
	 * @param pageName
	 */
	public AbstractSuWizardPage( String pageName ) {
		super( pageName );
	}


	/**
	 * Registers a help ID and associates it with a wizard.
	 * @param container the container
	 * @param helpId the context help ID
	 */
	protected void setHelpContextId( Composite container, String helpId ) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp( container, helpId );
	}


	/**
	 * Validates the page's input.
	 * <p>
	 * This call must be explicit, it is not automatic.
	 * </p>
	 * @return true if the page is valid, false otherwise
	 */
	public abstract boolean validate();


	/**
	 * Display the error message provided as parameter and prevent the user from going further in the wizard.
	 * @param message the error message to display, or null to display nothing.
	 */
	protected final void updateStatus( String message ) {
		setErrorMessage( message );
		setPageComplete( message == null );
	}


	/**
	 * @return the first provides or consumes block (not null)
	 */
	protected AbstractEndpoint getNewlyCreatedEndpoint() {
		return getWizard().getNewlyCreatedEndpoint();
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage
	 * #getWizard()
	 */
	@Override
	public AbstractServiceUnitWizard getWizard() {
		return (AbstractServiceUnitWizard) super.getWizard();
	}
}
