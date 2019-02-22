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

package com.ebmwebsourcing.petals.services.rest.v1x;

import com.ebmwebsourcing.petals.services.rest.rest.RestPackage;
import com.ebmwebsourcing.petals.services.su.wizards.pages.SimpleFeatureListSuWizardPage;

/**
 * @author Vincent Zurczak - Linagora
 */
public class RestProvidesWizardPage1x extends SimpleFeatureListSuWizardPage {

	/**
	 * Constructor.
	 */
	public RestProvidesWizardPage1x() {
		super(
			RestPackage.Literals.REST_PROVIDES__BASE_PATH
		);
	}
}
