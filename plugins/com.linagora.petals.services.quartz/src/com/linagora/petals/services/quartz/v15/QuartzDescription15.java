/******************************************************************************
 * Copyright (c) 2016, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.quartz.v15;

import com.linagora.petals.services.quartz.v11.QuartzDescription11;

/**
 * @author Victor Noel - Linagora
 */
public class QuartzDescription15 extends QuartzDescription11 {

	@Override
	public boolean isBc() {
		return true;
	}
	
	@Override
	public String getComponentName() {
		return "petals-bc-quartz";
	}
	
	@Override
	public String getComponentVersion() {
		return "1.5.2";
	}
}
