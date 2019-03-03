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
 
package com.linagora.petals.services.eip.designer.edit.commands;

import org.eclipse.gef.commands.Command;

import com.linagora.petals.services.eip.designer.model.AbstractNode;
import com.linagora.petals.services.eip.designer.model.Endpoint;

/**
 * A command to update an attribute of an end-point.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EndpointSetAttributeCommand extends Command {

	private final String edptProperty;
	private Object oldValue, newValue;
	private Endpoint endpoint;



	/**
	 * Constructor.
	 * @param edptProperty
	 */
	public EndpointSetAttributeCommand( String edptProperty ) {
		this.edptProperty = edptProperty;
	}


	/**
	 * @param newValue the newValue to set
	 */
	public void setNewValue( Object newValue ) {
		this.newValue = newValue;
	}


	/**
	 * @param endpoint the end-point to set
	 */
	public void setEndpoint( Endpoint endpoint ) {
		this.endpoint = endpoint;

		if( AbstractNode.PROPERTY_ENDPOINT_NAME.equals( this.edptProperty ))
			this.oldValue = endpoint.getEndpointName();
		else if( AbstractNode.PROPERTY_INTERFACE_NAME.equals( this.edptProperty ))
			this.oldValue = endpoint.getInterfaceName();
		else if( AbstractNode.PROPERTY_INTERFACE_NAMESPACE.equals( this.edptProperty ))
			this.oldValue = endpoint.getInterfaceNamespace();
		else if( AbstractNode.PROPERTY_SERVICE_NAME.equals( this.edptProperty ))
			this.oldValue = endpoint.getServiceName();
		else if( AbstractNode.PROPERTY_SERVICE_NAMESPACE.equals( this.edptProperty ))
			this.oldValue = endpoint.getServiceNamespace();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return true;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return true;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {

		if( AbstractNode.PROPERTY_ENDPOINT_NAME.equals( this.edptProperty ))
			this.endpoint.setEndpointName((String) this.newValue );
		else if( AbstractNode.PROPERTY_INTERFACE_NAME.equals( this.edptProperty ))
			this.endpoint.setInterfaceName((String) this.newValue );
		else if( AbstractNode.PROPERTY_INTERFACE_NAMESPACE.equals( this.edptProperty ))
			this.endpoint.setInterfaceNamespace((String) this.newValue );
		else if( AbstractNode.PROPERTY_SERVICE_NAME.equals( this.edptProperty ))
			this.endpoint.setServiceName((String) this.newValue );
		else if( AbstractNode.PROPERTY_SERVICE_NAMESPACE.equals( this.edptProperty ))
			this.endpoint.setServiceNamespace((String) this.newValue );
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {

		if( AbstractNode.PROPERTY_ENDPOINT_NAME.equals( this.edptProperty ))
			this.endpoint.setEndpointName((String) this.oldValue );
		else if( AbstractNode.PROPERTY_INTERFACE_NAME.equals( this.edptProperty ))
			this.endpoint.setInterfaceName((String) this.oldValue );
		else if( AbstractNode.PROPERTY_INTERFACE_NAMESPACE.equals( this.edptProperty ))
			this.endpoint.setInterfaceNamespace((String) this.oldValue );
		else if( AbstractNode.PROPERTY_SERVICE_NAME.equals( this.edptProperty ))
			this.endpoint.setServiceName((String) this.oldValue );
		else if( AbstractNode.PROPERTY_SERVICE_NAMESPACE.equals( this.edptProperty ))
			this.endpoint.setServiceNamespace((String) this.oldValue );
	}
}
