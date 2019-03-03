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
 
package com.linagora.petals.services.jsr181.v14;

import com.linagora.petals.services.jsr181.v11.Jsr181ProvidesWizard11;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;

/**
 * @author Vincent Zurczak - Linagora
 */
public class Jsr181ProvidesWizard14 extends Jsr181ProvidesWizard11 {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new Jsr181Description14();
	}
}
