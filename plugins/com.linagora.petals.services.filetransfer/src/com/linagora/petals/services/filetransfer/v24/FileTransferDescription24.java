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
 
package com.linagora.petals.services.filetransfer.v24;

import com.linagora.petals.services.filetransfer.FileTransferDescription;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class FileTransferDescription24 extends FileTransferDescription {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentVersion()
	 */
	@Override
	public String getComponentVersion() {
		return "2.4";
	}
}
