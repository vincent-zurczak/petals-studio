/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.croquis.internal.projectscnf;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;

import com.linagora.petals.common.croquis.internal.provisional.ICroquisExtension;
import com.linagora.petals.common.internal.PetalsCommonPlugin;
import com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class CroquisProjectCategory extends PetalsProjectCategory {

	public static final String CROQUIS_CATEGORY_ID = "petals.category.croquis";


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return PetalsCommonPlugin.getImageDescriptor( "icons/obj16/croquis.png" );
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getLabel()
	 */
	@Override
	public String getLabel() {
		return "Croquis";
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.ui.navigator.IDescriptionProvider
	 * #getDescription(java.lang.Object)
	 */
	public String getDescription( Object o ) {
		return "The croquis for Petals ESB";
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getDisplayOrder()
	 */
	@Override
	public int getDisplayOrder() {
		return 6;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getId()
	 */
	@Override
	public String getId() {
		return CROQUIS_CATEGORY_ID;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #projectMatches(org.eclipse.core.resources.IProject)
	 */
	@Override
	public boolean projectMatches( IProject project ) {

		/* In a first time, we assume croquis will be limited to folders.
		 * If by any (bad) luck, a croquis had to be an IProject (e.g. for Java reasons), then we would see...
		 */
		boolean result = false;
		if( project.exists()
					&& ICroquisExtension.CROQUIS_PROJECT_NAME.equals( project.getName())) {
			result = true;
		}

		return result;
	};


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #isRootProjectVisible()
	 */
	@Override
	public boolean isRootProjectVisible() {
		return false;
	}
}
