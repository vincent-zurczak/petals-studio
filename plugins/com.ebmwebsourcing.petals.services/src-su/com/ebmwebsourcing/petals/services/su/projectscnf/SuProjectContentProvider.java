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
 
package com.ebmwebsourcing.petals.services.su.projectscnf;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.AbstractTreeViewer;

import com.ebmwebsourcing.petals.common.internal.provisional.projectscnf.PetalsProjectCategory;
import com.ebmwebsourcing.petals.common.internal.provisional.projectscnf.PetalsProjectContentProvider;
import com.ebmwebsourcing.petals.services.PetalsServicesPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SuProjectContentProvider extends PetalsProjectContentProvider {

	/*
	 * (non-Jsdoc)
	 * @see com.ebmwebsourcing.petals.common.internal.provisional.projectscnf.PetalsProjectContentProvider
	 * #resourcesRemoved(java.util.Collection)
	 */
	@Override
	public void resourcesRemoved( Collection<IResource> resources ) {

		if( !( this.viewer instanceof AbstractTreeViewer ))
			return;

		// Deletion of SA projects => refresh the SU category
		// Associations are cached, so refreshing does not take long
		for( final IResource res : resources ) {
			if( res instanceof IProject ) {

				PetalsProjectCategory cat = getProjectCategoryById( SuProjectCategory.SU_CATEGORY_ID );
				if( cat == null )
					PetalsServicesPlugin.log( "The SU project category could not be found.", IStatus.ERROR );
				else
					this.runnables.add( getRefreshRunnable( cat ));
			}
		}

		// And always apply the basic treatment
		super.resourcesRemoved( resources );
	}
}
