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
 
package com.linagora.petals.services.eip.designer.edit;

import org.eclipse.gef.requests.CreationFactory;

import com.linagora.petals.services.eip.designer.model.EipConnection;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ConnectionCreationFactory implements CreationFactory {

	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.requests.CreationFactory
	 * #getNewObject()
	 */
	public Object getNewObject() {
		return null;
	}

	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.requests.CreationFactory
	 * #getObjectType()
	 */
	public Object getObjectType() {
		return EipConnection.class;
	}
}
