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

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.dnd.AbstractTransferDropTargetListener;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.ui.PlatformUI;

import com.linagora.petals.services.explorer.model.EndpointBean;

/**
 * A drop target listener for Petals services (dragged from the Petals services view).
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsEndpointDropTargetListener extends AbstractTransferDropTargetListener {

	private final EndpointCreationFactory factory;


	/**
	 * Constructor.
	 * @param viewer
	 */
	public PetalsEndpointDropTargetListener( EditPartViewer viewer ) {
		super( viewer, TextTransfer.getInstance());
		this.factory = new EndpointCreationFactory();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener
	 * #updateTargetRequest()
	 */
	@Override
	protected void updateTargetRequest() {
		((CreateRequest) getTargetRequest()).setLocation( getDropLocation());
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener
	 * #createTargetRequest()
	 */
	@Override
	protected Request createTargetRequest() {
		CreateRequest request = new CreateRequest();
		request.setFactory( this.factory );
		return request;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener
	 * #isEnabled(org.eclipse.swt.dnd.DropTargetEvent)
	 */
	@Override
	public boolean isEnabled( DropTargetEvent event ) {

		boolean enabled = false;
		if( TextTransfer.getInstance().isSupportedType( event.currentDataType )) {
			// We cannot use the content of the dragged data because it is
			// platform dependent (works on Windows XP, not on Linux - and not on Windows 7)
			// => We use the selection instead.

			ISelection s =
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();

			if( ! s.isEmpty()
						&& s instanceof IStructuredSelection ) {
				Object o = ((IStructuredSelection) s).getFirstElement();
				enabled = "com.linagora.petals.services.explorer.model.EndpointBean".equals( o.getClass().getName());
			}

		}
		return enabled;
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener
	 * #handleDragOver()
	 */
	@Override
	protected void handleDragOver() {
		getCurrentEvent().detail = DND.DROP_COPY;
		super.handleDragOver();
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.gef.dnd.AbstractTransferDropTargetListener
	 * #handleDrop()
	 */
	@Override
	protected void handleDrop() {
		EndpointBean endpoint = null;
		ISelection s = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if( ! s.isEmpty() && s instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if (o instanceof EndpointBean) {
				endpoint = (EndpointBean) o;
			}
		}

		if (endpoint == null) {
			return;
		}

		this.factory.setEndpointName(endpoint.getEndpointName());
		this.factory.setInterfaceName(endpoint.getInterfaceName().getLocalPart());
		this.factory.setServiceName(endpoint.getServiceName().getLocalPart());
		this.factory.setInterfaceNamespace(endpoint.getInterfaceName().getNamespaceURI());
		this.factory.setServiceNamespace(endpoint.getServiceName().getNamespaceURI());

		super.handleDrop();
	}
}
