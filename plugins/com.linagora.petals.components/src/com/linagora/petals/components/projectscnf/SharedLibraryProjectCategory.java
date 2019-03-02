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
 
package com.linagora.petals.components.projectscnf;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;

import com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory;
import com.linagora.petals.common.internal.provisional.utils.JbiXmlUtils;
import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;
import com.linagora.petals.components.PetalsComponentsPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SharedLibraryProjectCategory extends PetalsProjectCategory {

	public static final String SL_CATEGORY_ID = "petals.category.shared-libraries";


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return PetalsComponentsPlugin.getImageDescriptor( "icons/obj16/sl.png" );
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getLabel()
	 */
	@Override
	public String getLabel() {
		return "Shared Libraries";
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.ui.navigator.IDescriptionProvider
	 * #getDescription(java.lang.Object)
	 */
	@Override
	public String getDescription( Object o ) {
		return "The shared library projects for Petals ESB";
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getDisplayOrder()
	 */
	@Override
	public int getDisplayOrder() {
		return 2;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getId()
	 */
	@Override
	public String getId() {
		return SL_CATEGORY_ID;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #projectMatches(org.eclipse.core.resources.IProject)
	 */
	@Override
	public boolean projectMatches( IProject project ) {

		boolean result = false;
		if( project.exists()) {
			File jbiXmlFile = project.getLocation().append( PetalsConstants.LOC_JBI_FILE ).toFile();
			if( ! jbiXmlFile.exists())
				jbiXmlFile = project.getLocation().append( PetalsConstants.NEW_LOC_JBI_FILE ).toFile();

			result = jbiXmlFile.exists() && JbiXmlUtils.describesSharedLibrary( jbiXmlFile );
		}

		return result;
	};
}
