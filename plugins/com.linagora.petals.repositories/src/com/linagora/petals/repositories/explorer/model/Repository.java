/******************************************************************************
 * Copyright (c) 2010-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.repositories.explorer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.swt.graphics.Image;

/**
 * An abstract repository.
 * <p>
 * A repository is not defined by the technology behind the repository, but by
 * API used to query it.
 * </p>
 * 
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class Repository {

	/**
	 * The repository name.
	 */
	private String name;

	/**
	 * The repository image
	 */
	protected Image image;

	/**
	 * The repository description.
	 */
	protected String description;

	/**
	 * 
	 */
	private final List<QueryApiBean> queryApiBeans = new ArrayList<QueryApiBean> ();



	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName( String name ) {
		this.name = name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription( String description ) {
		this.description = description;
	}


	/**
	 * @return the image
	 */
	public Image getImage() {
		return this.image;
	}


	/**
	 * @param o
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean addQueryApiBean( QueryApiBean o ) {
		return this.queryApiBeans.add( o );
	}


	/**
	 * @param c
	 * @return
	 * @see java.util.List#addAll(java.util.Collection)
	 */
	public boolean addAllQueryApiBean( Collection<? extends QueryApiBean> c ) {
		return this.queryApiBeans.addAll( c );
	}


	/**
	 * @return
	 * @see java.util.List#listIterator()
	 */
	public ListIterator<QueryApiBean> listIteratorForQueryApiBean() {
		return this.queryApiBeans.listIterator();
	}


	/**
	 * @param o
	 * @return
	 * @see java.util.List#remove(java.lang.Object)
	 */
	public boolean removeQueryApiBean( Object o ) {
		return this.queryApiBeans.remove( o );
	}


	/**
	 * Releases the resources managed by this repository.
	 */
	public void releaseResource() {

		if( this.image != null ) {
			this.image.dispose();
			this.image = null;
		}
	}
}
