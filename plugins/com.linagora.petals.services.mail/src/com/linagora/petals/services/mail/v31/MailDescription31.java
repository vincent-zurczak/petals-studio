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
 
package com.linagora.petals.services.mail.v31;

import com.linagora.petals.common.generation.Mep;
import com.linagora.petals.services.mail.MailDescription;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class MailDescription31 extends MailDescription {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentVersion()
	 */
	@Override
	public String getComponentVersion() {
		return "3.1";
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isProvide()
	 */
	@Override
	public boolean isProvide() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isConsume()
	 */
	@Override
	public boolean isConsume() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isProxy()
	 */
	@Override
	public boolean isProxy() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getSupportedMep()
	 */
	@Override
	public Mep[] getSupportedMep() {
		return new Mep[] { Mep.IN_ONLY };
	}
}
