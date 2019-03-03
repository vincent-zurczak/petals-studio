/******************************************************************************
 * Copyright (c) 2012-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.xslt.wizard;

import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.xslt.XsltDescription27;

/**
 * @author Vincent Zurczak - Linagora
 */
public class XsltWizard27 extends XsltWizard25 {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new XsltDescription27();
	}
}
