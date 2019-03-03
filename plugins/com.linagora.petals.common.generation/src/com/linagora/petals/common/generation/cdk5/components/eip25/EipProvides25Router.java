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
 
package com.linagora.petals.common.generation.cdk5.components.eip25;

import java.util.ArrayList;
import java.util.List;

import com.linagora.petals.common.generation.cdk5.CdkProvides5;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipProvides25Router extends CdkProvides5 {

	private boolean isXpathCondition;
	private boolean faultToException;
	private final List<String> routingConditions;


	/**
	 * Constructor.
	 */
	public EipProvides25Router() {
		super();
		this.routingConditions = new ArrayList<String> ();
		addNamespace( "eip", "http://petals.ow2.org/components/eip/version-2" );
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.generation.AbstractJbiXmlBean
	 * #getComponentSection()
	 */
	@Override
	public String getComponentSection() {

		StringBuffer buf = new StringBuffer();
		buf.append( "\t\t\t<eip:eip>router</eip:eip>\n" );

		if( this.isXpathCondition ) {
			for( String cond : this.routingConditions )
				buf.append( "\t\t\t<eip:test>" + cond + "</eip:test>\n" );
		} else {
			for( String cond : this.routingConditions )
				buf.append( "\t\t\t<eip:test-operation>" + cond + "</eip:test-operation>\n" );
		}

		buf.append( "\t\t\t<eip:fault-to-exception>" + this.faultToException + "</eip:fault-to-exception>" );
		return buf.toString();
	}


	/*
	 * (non-Jsdoc)
	 * @see com.linagora.petals.common.generation.AbstractJbiXmlBean
	 * #getSuType()
	 */
	@Override
	public final String getSuType() {
		return "EIP";
	}


	/**
	 * @param e
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean addRoutingCondition( String e ) {
		return this.routingConditions.add( e );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.common.generation.AbstractJbiXmlBean
	 * #isBc()
	 */
	@Override
	public boolean isBc() {
		return false;
	}


	/**
	 * @param isXpathCondition the isXpathCondition to set
	 */
	public void setXpathCondition( boolean isXpathCondition ) {
		this.isXpathCondition = isXpathCondition;
	}


	/**
	 * @param faultToException the faultToException to set
	 */
	public void setFaultToException( boolean faultToException ) {
		this.faultToException = faultToException;
	}
}
