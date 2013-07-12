/****************************************************************************
 *
 * Copyright (c) 2009-2013, Linagora
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to Linagora (80, rue Roque de Fillol - 92800 Puteaux, France).
 *
 *****************************************************************************/

package com.ebmwebsourcing.petals.services.explorer.dnd;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.navigator.CommonDragAdapterAssistant;

import com.ebmwebsourcing.petals.services.explorer.model.EndpointBean;

/**
 * Drag end-points from the service explorer to other Eclipse views and editors.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ServiceExplorerDragAdapterAssistant
extends CommonDragAdapterAssistant {


	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonDragAdapterAssistant
	 * #getSupportedTransferTypes()
	 */
	@Override
	public Transfer[] getSupportedTransferTypes() {
		return new Transfer[] { TextTransfer.getInstance()};
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonDragAdapterAssistant
	 * #setDragData(
	 * 		org.eclipse.swt.dnd.DragSourceEvent,
	 * 		org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public boolean setDragData( DragSourceEvent anEvent, IStructuredSelection aSelection ) {

		boolean activated = false;
		if( aSelection.getFirstElement() instanceof EndpointBean ) {

			EndpointBean edpt = (EndpointBean) aSelection.getFirstElement();
			StringBuffer sb = new StringBuffer();
			sb.append( "petals-" );
			sb.append( "|srvNs=" );
			sb.append( edpt.getServiceName().getNamespaceURI());
			sb.append( "|srvName=" );
			sb.append( edpt.getServiceName().getLocalPart());
			sb.append( "|itfNs=" );
			sb.append( edpt.getInterfaceName().getNamespaceURI());
			sb.append( "|itfName=" );
			sb.append( edpt.getInterfaceName().getLocalPart());
			sb.append( "|edptName=" );
			sb.append( edpt.getEndpointName());
			sb.append( "|wsdlUri=" );
			if( edpt.getWsdlUri() != null )
				sb.append( edpt.getWsdlUri());

			anEvent.data = sb.toString();
			activated = true;
		}

		return activated;
	}
}
