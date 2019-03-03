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
 
package com.linagora.petals.services.eip.designer.edit.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.linagora.petals.services.eip.designer.edit.commands.EipNodeCreateCommand;
import com.linagora.petals.services.eip.designer.edit.commands.EndpointCreateCommand;
import com.linagora.petals.services.eip.designer.edit.commands.NodeChangeLayoutCommand;
import com.linagora.petals.services.eip.designer.edit.parts.EipChainEditPart;
import com.linagora.petals.services.eip.designer.model.AbstractNode;
import com.linagora.petals.services.eip.designer.model.EipChain;
import com.linagora.petals.services.eip.designer.model.EipNode;
import com.linagora.petals.services.eip.designer.model.Endpoint;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class NodeEditLocationPolicy extends XYLayoutEditPolicy {

	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy
	 * #createChangeConstraintCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	@Override
	protected Command createChangeConstraintCommand( EditPart child, Object constraint ) {

		NodeChangeLayoutCommand command = null;
		if( child.getModel() instanceof AbstractNode
					&& constraint instanceof Rectangle ) {

			command = new NodeChangeLayoutCommand();
			command.setNode((AbstractNode) child.getModel());

			Point location = new Point(((Rectangle) constraint).x, ((Rectangle) constraint).y );
			command.setLocation( location );
		}

		return command;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy
	 * #getCommand(org.eclipse.gef.Request)
	 */
	@Override
	public Command getCommand( Request request ) {

		// RESIZE is disabled
		if( request.getType() == REQ_RESIZE_CHILDREN )
			return null;

		return super.getCommand( request );
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy
	 * #getCreateCommand(org.eclipse.gef.requests.CreateRequest)
	 */
	@Override
	protected Command getCreateCommand( CreateRequest request ) {

		if( request.getType() == REQ_CREATE
					&& getHost() instanceof EipChainEditPart ) {

			Object o = request.getNewObject();

			// EIP node
			if( o instanceof EipNode ) {
				EipNodeCreateCommand cmd = new EipNodeCreateCommand();
				cmd.setEipChain((EipChain) getHost().getModel());
				cmd.setNewEipNode((EipNode) o);

				Object constraint = getConstraintFor( request );
				if( constraint instanceof Point )
					cmd.setLocation((Point) constraint);
				else if( constraint instanceof Rectangle )
					cmd.setLocation( new Point(((Rectangle) constraint).x, ((Rectangle) constraint).y ));

				return cmd;
			}

			// End-point
			else if( o instanceof Endpoint ) {
				EndpointCreateCommand cmd = new EndpointCreateCommand();
				cmd.setEipChain((EipChain) getHost().getModel());
				cmd.setNewEndpoint((Endpoint) o);

				Object constraint = getConstraintFor( request );
				if( constraint instanceof Point )
					cmd.setLocation((Point) constraint);
				else if( constraint instanceof Rectangle )
					cmd.setLocation( new Point(((Rectangle) constraint).x, ((Rectangle) constraint).y ));

				return cmd;
			}
		}

		return null;
	}
}
