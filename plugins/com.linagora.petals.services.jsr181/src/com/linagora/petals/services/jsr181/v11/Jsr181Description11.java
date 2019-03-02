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
 
package com.linagora.petals.services.jsr181.v11;

import java.io.IOException;

import com.linagora.petals.common.internal.provisional.utils.JaxWsUtils;
import com.linagora.petals.services.jsr181.Jsr181Description;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class Jsr181Description11 extends Jsr181Description {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentVersion()
	 */
	@Override
	public String getComponentVersion() {
		return "1.1";
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
		return false;
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
	 * #validatePrerequisites()
	 */
	@Override
	public String validatePrerequisites() {

		String errorMsg = null;
		try {
			JaxWsUtils.getJavaExecutable( true );
			JaxWsUtils.getJavaExecutable( false );

		} catch( IOException e ) {
			errorMsg = e.getMessage();
		}

		return errorMsg;
	}
}
