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
 
package com.linagora.petals.services.filetransfer.v33;

import com.linagora.petals.services.filetransfer.v30.wizard.FileTransferProvidesWizard30;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;

/**
 * @author Victor Noel - Linagora
 */
public class FileTransferProvidesWizard33 extends FileTransferProvidesWizard30 {

	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new FileTransferDescription33();
	}
}
