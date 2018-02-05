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
 
package com.ebmwebsourcing.petals.services.eip.designer.edit.commands;

import org.eclipse.gef.commands.Command;

import com.ebmwebsourcing.petals.services.eip.designer.model.AbstractNode;
import com.ebmwebsourcing.petals.services.eip.designer.model.EipChain;
import com.ebmwebsourcing.petals.services.eip.designer.model.EipConnection;
import com.ebmwebsourcing.petals.services.eip.designer.model.EipNode;

/**
 * A command to create an EIP connection.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipConnectionCreateCommand extends Command {

	private EipNode sourceNode;
	private AbstractNode targetNode;
	private EipConnection conn;


	/**
	 * @param sourceNode the sourceNode to set
	 */
	public void setSourceNode( EipNode sourceNode ) {
		this.sourceNode = sourceNode;
	}


	/**
	 * @param targetNode the targetNode to set
	 */
	public void setTargetNode( AbstractNode targetNode ) {
		this.targetNode = targetNode;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command
	 * #canExecute()
	 */
	@Override
	public boolean canExecute() {

		return this.sourceNode != null
		&& this.targetNode != null
		&& ! this.sourceNode.equals( this.targetNode )
		&& this.targetNode.getIncomingConnection() == null;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command
	 * #execute()
	 */
	@Override
	public void execute() {
		EipChain eipChain = this.sourceNode.getEipChain();
		this.conn = new EipConnection( eipChain.getNewConnectionId(), this.sourceNode, this.targetNode );
		this.conn.connect();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command
	 * #canUndo()
	 */
	@Override
	public boolean canUndo() {
		return this.sourceNode != null && this.targetNode != null && this.conn != null;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.commands.Command
	 * #undo()
	 */
	@Override
	public void undo() {
		this.conn.disconnect();
	}
}
