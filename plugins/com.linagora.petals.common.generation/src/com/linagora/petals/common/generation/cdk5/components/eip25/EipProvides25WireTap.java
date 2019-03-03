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

import com.linagora.petals.common.generation.cdk5.CdkProvides5;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EipProvides25WireTap extends CdkProvides5 {

	private String wireTapWay;


	/**
	 * An enumeration to help to select the right value.
	 */
	public enum WireTapWay {
		REQUEST, RESPONSE, REQUEST_RESPONSE, REQUEST_ON_RESPONSE;

		/*
		 * (non-Jsdoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {

			String result;
			switch( this ) {
			case REQUEST: result = "request"; break;
			case REQUEST_ON_RESPONSE: result = "request-on-response"; break;
			case REQUEST_RESPONSE: result = "request-response"; break;
			case RESPONSE: result = "response"; break;
			default: result = ""; break;
			}

			return result;
		};
	}


	/**
	 * Constructor.
	 */
	public EipProvides25WireTap() {
		super();
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
		buf.append( "\t\t\t<eip:eip>wire-tap</eip:eip>\n" );
		buf.append( "\t\t\t<eip:wiretap-way>" + this.wireTapWay + "</eip:wiretap-way>" );

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
	 * @param wireTapWay the wireTapWay to set
	 */
	public void setWireTapWay( String wireTapWay ) {
		this.wireTapWay = wireTapWay;
	}


	/**
	 * @param wireTapWay the wireTapWay to set
	 */
	public void setWireTapWay( WireTapWay wireTapWay ) {
		this.wireTapWay = wireTapWay.toString();
	}
}
