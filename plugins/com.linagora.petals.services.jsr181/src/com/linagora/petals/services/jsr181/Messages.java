/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.jsr181;

import org.eclipse.osgi.util.NLS;

/**
 * @author Vincent Zurczak - Linagora
 */
public class Messages extends NLS {

	public static String jsrErrorLabel;

	static {
		initializeMessages("messages", Messages.class);
	}
}
