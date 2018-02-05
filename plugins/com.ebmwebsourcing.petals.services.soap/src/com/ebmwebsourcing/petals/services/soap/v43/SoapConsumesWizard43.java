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
 
package com.ebmwebsourcing.petals.services.soap.v43;

import com.ebmwebsourcing.petals.services.soap.v41.SoapConsumesWizard41;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;

/**
 * @author Vincent Zurczak - Linagora
 */
public class SoapConsumesWizard43 extends SoapConsumesWizard41 {

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new SoapDescription43();
	}
}
