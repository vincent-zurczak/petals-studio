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
 
package com.linagora.petals.services.mail.v35;

import com.linagora.petals.services.mail.v31.MailConsumesWizard31;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;

/**
 * @author Victor Noel - Linagora
 */
public class MailConsumesWizard35 extends MailConsumesWizard31 {

	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new MailDescription35();
	}
}
