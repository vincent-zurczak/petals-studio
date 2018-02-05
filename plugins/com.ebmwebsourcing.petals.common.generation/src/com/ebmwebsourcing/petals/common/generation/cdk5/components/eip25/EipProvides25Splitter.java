/******************************************************************************
 * Copyright (c) 2009-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.common.generation.cdk5.components.eip25;

import com.ebmwebsourcing.petals.common.generation.cdk5.CdkProvides5;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipProvides25Splitter extends CdkProvides5 {

	private String test;
	private boolean attachment, faultRobust, exceptionRobust;


	/**
	 * Constructor.
	 */
	public EipProvides25Splitter() {
		super();
		addNamespace( "eip", "http://petals.ow2.org/components/eip/version-2" );
	}


	/*
	 * (non-Jsdoc)
	 * @see com.ebmwebsourcing.petals.common.generation.AbstractJbiXmlBean
	 * #getComponentSection()
	 */
	@Override
	public String getComponentSection() {

		StringBuffer buf = new StringBuffer();
		buf.append( "\t\t\t<eip:eip>splitter</eip:eip>\n" );
		buf.append( "\t\t\t<eip:test>" + this.test + "</eip:test>\n" );
		buf.append( "\t\t\t<eip:attachment>" + this.attachment + "</eip:attachment>\n" );
		buf.append( "\t\t\t<eip:fault-robust>" + this.faultRobust + "</eip:fault-robust>\n" );
		buf.append( "\t\t\t<eip:exception-robust>" + this.exceptionRobust + "</eip:exception-robust>" );

		return buf.toString();
	}


	/*
	 * (non-Jsdoc)
	 * @see com.ebmwebsourcing.petals.common.generation.AbstractJbiXmlBean
	 * #getSuType()
	 */
	@Override
	public final String getSuType() {
		return "EIP";
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.common.generation.AbstractJbiXmlBean
	 * #isBc()
	 */
	@Override
	public boolean isBc() {
		return false;
	}


	/**
	 * @param test the test to set
	 */
	public void setTest( String test ) {
		this.test = test;
	}


	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment( boolean attachment ) {
		this.attachment = attachment;
	}


	/**
	 * @param faultRobust the faultRobust to set
	 */
	public void setFaultRobust( boolean faultRobust ) {
		this.faultRobust = faultRobust;
	}


	/**
	 * @param exceptionRobust the exceptionRobust to set
	 */
	public void setExceptionRobust( boolean exceptionRobust ) {
		this.exceptionRobust = exceptionRobust;
	}
}
