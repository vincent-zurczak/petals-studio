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
 
package com.linagora.petals.common.generation.cdk5;

import com.linagora.petals.common.generation.AbstractJbiXmlBean;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class CdkProvides5 extends AbstractJbiXmlBean {

	private String timeout, wsdl;
	private Boolean retryPolicy, validateWsdl, forwardSecuritySubject, forwardMessageProperties, forwardAttachments;


	/**
	 * Constructor.
	 * <p>
	 * Must be called by sub-classes.
	 * </p>
	 */
	public CdkProvides5() {
		super();
		addNamespace( "petalsCDK", "http://petals.ow2.org/components/extensions/version-5" );
	}


	/* (non-Javadoc)
	 * @see com.linagora.jbi.core.jbixml.JbiBeanDelegate#getCdkSection()
	 */
	@Override
	public String getCdkSection() {

		String result = "";

		if( this.timeout != null && ! "0".equals( this.timeout.trim()))
			result += "\t\t\t<petalsCDK:timeout>" + this.timeout + "</petalsCDK:timeout>\n";

		if( this.retryPolicy != null )
			result += "\t\t\t<petalsCDK:retrypolicy>" + this.retryPolicy + "</petalsCDK:retrypolicy>\n";

		if( this.validateWsdl != null )
			result += "\t\t\t<petalsCDK:validate-wsdl>" + this.validateWsdl + "</petalsCDK:validate-wsdl>\n";

		if( this.forwardSecuritySubject != null )
			result += "\t\t\t<petalsCDK:forward-security-subject>" + this.forwardSecuritySubject
			+ "</petalsCDK:forward-security-subject>\n";

		if( this.forwardMessageProperties != null )
			result += "\t\t\t<petalsCDK:forward-message-properties>" + this.forwardMessageProperties
			+ "</petalsCDK:forward-message-properties>\n";

		if( this.forwardAttachments != null )
			result += "\t\t\t<petalsCDK:forward-attachments>" + this.forwardAttachments
			+ "</petalsCDK:forward-attachments>\n";

		if( this.wsdl != null && this.wsdl.trim().length() > 0 )
			result += "\t\t\t<petalsCDK:wsdl>" + this.wsdl + "</petalsCDK:wsdl>\n";
		else
			result += "\t\t\t<petalsCDK:wsdl xsi:nil=\"true\" />\n";

		return result;
	}


	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout( String timeout ) {
		this.timeout = timeout;
	}


	/**
	 * @param wsdl the wsdl to set
	 */
	public void setWsdl( String wsdl ) {
		this.wsdl = wsdl;
	}


	/**
	 * @param retryPolicy the retryPolicy to set
	 */
	public void setRetryPolicy( Boolean retryPolicy ) {
		this.retryPolicy = retryPolicy;
	}


	/**
	 * @param validateWsdl the validateWsdl to set
	 */
	public void setValidateWsdl( Boolean validateWsdl ) {
		this.validateWsdl = validateWsdl;
	}


	/**
	 * @param forwardSecuritySubject the forwardSecuritySubject to set
	 */
	public void setForwardSecuritySubject( Boolean forwardSecuritySubject ) {
		this.forwardSecuritySubject = forwardSecuritySubject;
	}


	/**
	 * @param forwardAttachments the forwardAttachments to set
	 */
	public void setForwardAttachments( Boolean forwardAttachments ) {
		this.forwardAttachments = forwardAttachments;
	}


	/**
	 * @param forwardMessageProperties the forwardMessageProperties to set
	 */
	public void setForwardMessageProperties( Boolean forwardMessageProperties ) {
		this.forwardMessageProperties = forwardMessageProperties;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.jbi.core.jbixml.JbiBeanDelegate#isProvides()
	 */
	@Override
	public boolean isProvides() {
		return true;
	}
}
