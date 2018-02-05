/******************************************************************************
 * Copyright (c) 2010-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.su.explorer;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.ILinkHelper;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.DomUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.NamespaceUtils;
import com.ebmwebsourcing.petals.services.explorer.SourceManager;
import com.ebmwebsourcing.petals.services.explorer.model.EndpointBean;
import com.ebmwebsourcing.petals.services.explorer.model.ServiceUnitBean;
import com.ebmwebsourcing.petals.services.explorer.sources.EndpointSource;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SuEditorLinkHelper implements ILinkHelper {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.ILinkHelper
	 * #activateEditor(org.eclipse.ui.IWorkbenchPage, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void activateEditor( IWorkbenchPage aPage, IStructuredSelection aSelection ) {

		// nothing
	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.ILinkHelper
	 * #findSelection(org.eclipse.ui.IEditorInput)
	 */
	@Override
	public IStructuredSelection findSelection( IEditorInput anInput ) {

		// Does this editor interest us?
		boolean interested = false;
		if( anInput instanceof IFileEditorInput ) {
			IFile f = ((IFileEditorInput) anInput).getFile();
			interested = "jbi.xml".equals( f.getName());
		}

		// Get the selection from the editor
		EndpointBean myBean = null;
		IEditorPart part = null;
		try {
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findEditor( anInput );
		} catch( Exception e ) {
			// nothing
		}

		if( interested && part != null ) {
			ISelection s = part.getSite().getSelectionProvider().getSelection();
			Object o = null;
			if( s instanceof IStructuredSelection
					&& ! s.isEmpty()
					&& ( o = ((IStructuredSelection) s).getFirstElement()) instanceof Element
					&& "provides".equals( DomUtils.getNodeName((Element) o))) {

				Element elt = (Element) o;
				myBean = new EndpointBean ();
				Attr itfAttr = elt.getAttributeNode( "interface-name" );
				QName itfQName = NamespaceUtils.getQNameAttribute( itfAttr );
				myBean.setInterfaceName( itfQName );

				Attr srvAttr = elt.getAttributeNode( "service-name" );
				QName srvQName = NamespaceUtils.getQNameAttribute( srvAttr );
				myBean.setServiceName( srvQName );

				String edptName = elt.getAttribute( "endpoint-name" );
				myBean.setEndpointName( edptName );
			}
		}


		// Show the selection
		IStructuredSelection selection = null;
		if( interested ) {

			IFile f = ((IFileEditorInput) anInput).getFile();
			String jbiXmlLocation = f.getLocation().toOSString();

			bigLoop: for( EndpointSource source : SourceManager.getInstance().getSources()) {
				for( ServiceUnitBean su : source.getServiceUnits()) {

					if( jbiXmlLocation.equals( su.getJbiXmlLocation())) {
						if( myBean == null ) {
							// We can only select the service unit
							selection = new StructuredSelection( su );
							break bigLoop;

						} else {
							// Find and select an end-point
							for( EndpointBean edpt : su.getEndpoints()) {
								if( edpt.isSimilarTo( myBean )) {
									selection = new StructuredSelection( edpt );
									break bigLoop;
								}
							}
						}
					}
				}
			}
		}

		return selection;
	}
}
