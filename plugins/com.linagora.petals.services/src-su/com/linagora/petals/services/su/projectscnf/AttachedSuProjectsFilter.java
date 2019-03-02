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
 
package com.linagora.petals.services.su.projectscnf;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory;
import com.linagora.petals.services.utils.ServiceProjectRelationUtils;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class AttachedSuProjectsFilter extends ViewerFilter {

	/**
	 * Constructor.
	 */
	public AttachedSuProjectsFilter() {
		// nothing
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter
	 * #select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select( Viewer viewer, Object parentElement, Object element ) {

		boolean result = true;
		PetalsProjectCategory category = null;
		if( parentElement instanceof PetalsProjectCategory ) {
			category = (PetalsProjectCategory) parentElement;
		}
		else if( parentElement instanceof TreePath ) {
			Object o = ((TreePath) parentElement).getFirstSegment();
			if( o instanceof PetalsProjectCategory )
				category = (PetalsProjectCategory) o;
		}

		boolean isInSuCategory = false;
		if( category != null
					&& category.getId().equals( SuProjectCategory.SU_CATEGORY_ID ))
			isInSuCategory = true;

		if( element instanceof IProject && isInSuCategory ) {
			IProject p = (IProject) element;
			result = p.isAccessible() && ServiceProjectRelationUtils.getOrphanSuProjects().contains( p );
		}

		return result;
	}
}
