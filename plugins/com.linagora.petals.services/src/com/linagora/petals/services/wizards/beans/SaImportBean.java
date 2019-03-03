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
 
package com.linagora.petals.services.wizards.beans;

import java.util.Collection;
import java.util.HashSet;

/**
 * A bean used in the creation of a Petals SA project.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SaImportBean extends ServiceImportBean {

	private final Collection<SuImportBean> suBeans = new HashSet<SuImportBean> ();


	/**
	 * Constructor.
	 */
	public SaImportBean() {
		super();
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.Collection#add(java.lang.Object)
	 */
	public boolean addSuBean( SuImportBean o ) {
		return this.suBeans.add( o );
	}

	/**
	 * @param c
	 * @return
	 * @see java.util.Collection#addAll(java.util.Collection)
	 */
	public boolean addAllSuBeans( Collection<? extends SuImportBean> c ) {
		return this.suBeans.addAll( c );
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.Collection#remove(java.lang.Object)
	 */
	public boolean removeSuBean( Object o ) {
		return this.suBeans.remove( o );
	}

	/**
	 * @return
	 * @see java.util.Collection#size()
	 */
	public int countSuBeans() {
		return this.suBeans.size();
	}

	/**
	 * @return the suBeans
	 */
	public Collection<SuImportBean> getSuBeans() {
		return this.suBeans;
	}
}
