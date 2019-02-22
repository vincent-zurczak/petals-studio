/******************************************************************************
 * Copyright (c) 2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Linagora - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.rest;

/**
 * @author Vincent Zurczak - Linagora
 */
public class RestDescription12 extends RestDescription {

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription#getComponentVersion()
	 */
	@Override
	public String getComponentVersion() {
		return "1.2";
	}

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription#isProvide()
	 */
	@Override
	public boolean isProvide() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription#isConsume()
	 */
	@Override
	public boolean isConsume() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription#isProxy()
	 */
	@Override
	public boolean isProxy() {
		return false;
	}
}
