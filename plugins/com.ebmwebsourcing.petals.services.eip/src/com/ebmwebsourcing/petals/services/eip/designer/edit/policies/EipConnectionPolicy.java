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
 
package com.ebmwebsourcing.petals.services.eip.designer.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.ebmwebsourcing.petals.services.eip.designer.edit.commands.EipConnectionCreateCommand;
import com.ebmwebsourcing.petals.services.eip.designer.edit.commands.EipConnectionReconnectCommand;
import com.ebmwebsourcing.petals.services.eip.designer.model.AbstractNode;
import com.ebmwebsourcing.petals.services.eip.designer.model.EipConnection;
import com.ebmwebsourcing.petals.services.eip.designer.model.EipNode;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipConnectionPolicy extends GraphicalNodeEditPolicy {

	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
	 * #getConnectionCompleteCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	@Override
	protected Command getConnectionCompleteCommand( CreateConnectionRequest request ) {

		EipConnectionCreateCommand cmd = (EipConnectionCreateCommand) request.getStartCommand();
		AbstractNode targetNode = (AbstractNode) getHost().getModel();
		cmd.setTargetNode( targetNode );

		return cmd;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
	 * #getConnectionCreateCommand(org.eclipse.gef.requests.CreateConnectionRequest)
	 */
	@Override
	protected Command getConnectionCreateCommand( CreateConnectionRequest request ) {

		EipConnectionCreateCommand cmd = null;
		if( getHost().getModel() instanceof EipNode ) {
			cmd = new EipConnectionCreateCommand();
			cmd.setSourceNode( (EipNode) getHost().getModel());
			request.setStartCommand( cmd );
		}

		return cmd;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
	 * #getReconnectSourceCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	@Override
	protected Command getReconnectSourceCommand( ReconnectRequest request ) {

		EipConnection conn = (EipConnection) request.getConnectionEditPart().getModel();
		EipNode eipNode = (EipNode) getHost().getModel();
		EipConnectionReconnectCommand cmd = new EipConnectionReconnectCommand( conn );
		cmd.setNewSourceNode( eipNode );

		return cmd;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy
	 * #getReconnectTargetCommand(org.eclipse.gef.requests.ReconnectRequest)
	 */
	@Override
	protected Command getReconnectTargetCommand( ReconnectRequest request ) {

		EipConnection conn = (EipConnection) request.getConnectionEditPart().getModel();
		AbstractNode targetNode = (AbstractNode) getHost().getModel();
		EipConnectionReconnectCommand cmd = new EipConnectionReconnectCommand( conn );
		cmd.setNewTargetNode( targetNode );

		return cmd;
	}
}
