/****************************************************************************
 *
 * Copyright (c) 2012, EBM WebSourcing
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/
package com.ebmwebsourcing.petals.services.xslt.wizard;

import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.xslt.XsltDescription24;
import com.ebmwebsourcing.petals.services.xslt.generated.XsltService24;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class XsltWizard24 extends XsltWizard23 {

	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new XsltDescription24();
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.xslt.wizard.XsltWizard23
	 * #getWsdlContent(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	protected String getWsdlContent( AbstractEndpoint abstractEndpoint ) {
		return new XsltService24().generate( abstractEndpoint );
	}
}
