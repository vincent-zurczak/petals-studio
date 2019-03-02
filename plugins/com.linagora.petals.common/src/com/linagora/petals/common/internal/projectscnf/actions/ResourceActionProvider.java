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
 
package com.linagora.petals.common.internal.projectscnf.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.navigator.WizardActionGroup;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ResourceActionProvider extends CommonActionProvider {

	private WizardActionGroup newWizardActionGroup;
	private ActionFactory.IWorkbenchAction showDlgAction;


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonActionProvider
	 * #init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init( ICommonActionExtensionSite anExtensionSite ) {

		if( !( anExtensionSite.getViewSite() instanceof ICommonViewerWorkbenchSite ))
			return;

		final ICommonViewerWorkbenchSite site = (ICommonViewerWorkbenchSite) anExtensionSite.getViewSite();
		IWorkbenchWindow window = site.getWorkbenchWindow();
		this.showDlgAction = ActionFactory.NEW.create( window );
		this.newWizardActionGroup = new WizardActionGroup(
					window,
					PlatformUI.getWorkbench().getNewWizardRegistry(),
					WizardActionGroup.TYPE_NEW,
					anExtensionSite.getContentService());
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.actions.ActionGroup
	 * #fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu( IMenuManager menu ) {

		// Override the new...
		MenuManager newManager = new MenuManager( "&New", "petals.projects.resource.new" );
		newManager.add( new Separator( "petals.wizard.new" ));

		// See NewActionProvider for more details
		this.newWizardActionGroup.setContext( getContext());
		this.newWizardActionGroup.fillContextMenu( newManager );

		newManager.add( new Separator( ICommonMenuConstants.GROUP_ADDITIONS ));
		newManager.add( new Separator());
		newManager.add( this.showDlgAction );
		menu.insertBefore( ICommonMenuConstants.GROUP_NEW, newManager );
	}
}
