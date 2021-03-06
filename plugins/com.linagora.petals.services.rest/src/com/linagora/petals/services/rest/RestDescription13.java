/******************************************************************************
 * Copyright (c) 2018-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.rest;

/**
 * @author Vincent Zurczak - Linagora
 */
public class RestDescription13 extends RestDescription {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription#getComponentVersion()
	 */
	@Override
	public String getComponentVersion() {
		return "1.3";
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription#isProvide()
	 */
	@Override
	public boolean isProvide() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription#isConsume()
	 */
	@Override
	public boolean isConsume() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription#isProxy()
	 */
	@Override
	public boolean isProxy() {
		return false;
	}
}
