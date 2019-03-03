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
 
package com.linagora.petals.services.sa.projectscnf;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;

import com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.utils.ServiceProjectRelationUtils;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SaProjectCategory extends PetalsProjectCategory {

	public static final String SA_CATEGORY_ID = "petals.category.service-assemblies";


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return PetalsServicesPlugin.getImageDescriptor( "icons/obj16/service_assembly.png" );
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getLabel()
	 */
	@Override
	public String getLabel() {
		return "Service Assemblies";
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.ui.navigator.IDescriptionProvider
	 * #getDescription(java.lang.Object)
	 */
	@Override
	public String getDescription( Object o ) {
		return "The service assembly projects for Petals ESB";
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getDisplayOrder()
	 */
	@Override
	public int getDisplayOrder() {
		return 3;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #getId()
	 */
	@Override
	public String getId() {
		return SA_CATEGORY_ID;
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.internal.provisional.projectscnf.PetalsProjectCategory
	 * #projectMatches(org.eclipse.core.resources.IProject)
	 */
	@Override
	public boolean projectMatches( IProject project ) {
		return project.exists() && ServiceProjectRelationUtils.isSaProject( project );
	};
}
