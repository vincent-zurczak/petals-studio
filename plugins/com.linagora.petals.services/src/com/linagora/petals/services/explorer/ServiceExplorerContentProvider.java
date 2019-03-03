/******************************************************************************
 * Copyright (c) 2009-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.explorer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;

import com.linagora.petals.services.explorer.model.EndpointBean;
import com.linagora.petals.services.explorer.model.ServiceUnitBean;
import com.linagora.petals.services.explorer.sources.EndpointSource;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ServiceExplorerContentProvider implements ITreeContentProvider, ISourceChangeListener {

	private TreeViewer viewer;


	/**
	 * Constructor.
	 */
	public ServiceExplorerContentProvider() {
		SourceManager.getInstance().registerListener( this );
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider
	 * #getChildren(java.lang.Object)
	 */
	public Object[] getChildren( Object parentElement ) {

		if( parentElement instanceof EndpointSource ) {
			List<Object> result = new ArrayList<Object>();
			Collection<ServiceUnitBean> beans = ((EndpointSource) parentElement).getServiceUnits();
			for( ServiceUnitBean bean : beans ) {
				if( bean.countEndpoints() == 1 )
					result.addAll( bean.getEndpoints());
				else
					result.add( bean );
			}

			return result.toArray();

		} else if( parentElement instanceof ServiceUnitBean )
			return ((ServiceUnitBean) parentElement).getEndpoints().toArray();

		return new Object[ 0 ];
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider
	 * #getParent(java.lang.Object)
	 */
	public Object getParent( Object element ) {

		if( element instanceof EndpointBean ) {
			ServiceUnitBean sub = ((EndpointBean) element).getServiceUnit();
			if( sub == null )
				return null;

			if( sub.countEndpoints() > 1 )
				return sub;

			return sub.getSource();
		}
		else if( element instanceof ServiceUnitBean )
			return ((ServiceUnitBean) element).getSource();

		return null;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider
	 * #hasChildren(java.lang.Object)
	 */
	public boolean hasChildren( Object element ) {

		if( element instanceof EndpointSource ) {
			Collection<ServiceUnitBean> beans = ((EndpointSource) element).getServiceUnits();
			return beans != null && beans.size() > 0;
		}
		else if( element instanceof ServiceUnitBean )
			return 0 < ((ServiceUnitBean) element).getEndpoints().size();

		return false;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider
	 * #getElements(java.lang.Object)
	 */
	public Object[] getElements( Object inputElement ) {
		return SourceManager.getInstance().getSources().toArray();
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		SourceManager.getInstance().unregisterListener( this );
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider
	 * #inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged( Viewer viewer, Object oldInput, Object newInput ) {
		this.viewer = (TreeViewer) viewer;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.ISourceChangeListener
	 * #sourceAdded(com.linagora.petals.services.explorer.sources.EndpointSource)
	 */
	public void sourceAdded( final EndpointSource source ) {

		Display.getDefault().asyncExec( new Runnable() {
			public void run() {
				Object input = ServiceExplorerContentProvider.this.viewer.getInput();
				ServiceExplorerContentProvider.this.viewer.add( input, source );
				ServiceExplorerContentProvider.this.viewer.expandToLevel( source, 1 );
				ServiceExplorerContentProvider.this.viewer.setSelection( new StructuredSelection( source ));
			}
		});
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.ISourceChangeListener
	 * #sourceChanged(com.linagora.petals.services.explorer.sources.EndpointSource)
	 */
	public void sourceChanged( final EndpointSource source ) {

		Display.getDefault().asyncExec( new Runnable() {
			public void run() {

				boolean wasExpanded = ServiceExplorerContentProvider.this.viewer.getExpandedState( source );
				ServiceExplorerContentProvider.this.viewer.refresh( source );
				if( wasExpanded ) {
					ServiceExplorerContentProvider.this.viewer.expandToLevel( source, 1 );
					ServiceExplorerContentProvider.this.viewer.setSelection( new StructuredSelection( source ));
				}
			}
		});
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.ISourceChangeListener
	 * #sourceRemoved(com.linagora.petals.services.explorer.sources.EndpointSource)
	 */
	public void sourceRemoved( final EndpointSource source ) {

		Display.getDefault().asyncExec( new Runnable() {
			public void run() {
				ServiceExplorerContentProvider.this.viewer.remove( source );
			}
		});
	}
}
