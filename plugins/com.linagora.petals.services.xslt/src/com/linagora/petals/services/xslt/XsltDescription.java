/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.xslt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import com.linagora.petals.common.generation.Mep;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.extensions.PetalsKeyWords;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class XsltDescription extends ComponentVersionDescription {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isBc()
	 */
	@Override
	public boolean isBc() {
		return false;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentName()
	 */
	@Override
	public String getComponentName() {
		return "petals-se-xslt";
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentAlias()
	 */
	@Override
	public String getComponentAlias() {
		return "XSLT";
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentAnnotation()
	 */
	@Override
	public String getComponentAnnotation() {
		return null;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getProvideDescription()
	 */
	@Override
	public String getProvideDescription() {
		return "Create a Petals service to transform messages with XSL.";
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getConsumeDescription()
	 */
	@Override
	public String getConsumeDescription() {
		return null;
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getKeyWords()
	 */
	@Override
	public List<PetalsKeyWords> getKeyWords() {
		return Arrays.asList( PetalsKeyWords.engine );
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isProvide()
	 */
	@Override
	public boolean isProvide() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isConsume()
	 */
	@Override
	public boolean isConsume() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #isProxy()
	 */
	@Override
	public boolean isProxy() {
		return false;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getDefaultOperations()
	 */
	@Override
	public Map<QName,Mep> getDefaultOperations() {

		HashMap<QName,Mep> result = new HashMap<QName,Mep> ();
		result.put( new QName( "http://petals.ow2.org/components/xslt/version-2", "transform" ), Mep.IN_OUT );
		result.put( new QName( "http://petals.ow2.org/components/xslt/version-2", "transformToMtomAttachment" ), Mep.IN_OUT );

		return result;
	}
}
