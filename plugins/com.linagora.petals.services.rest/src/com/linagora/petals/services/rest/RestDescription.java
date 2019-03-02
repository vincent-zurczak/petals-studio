/******************************************************************************
 * Copyright (c) 2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.rest;

import java.util.Arrays;
import java.util.List;

import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.extensions.PetalsKeyWords;

/**
 * @author Vincent Zurczak - Linagora
 */
public abstract class RestDescription extends ComponentVersionDescription {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#isBc()
	 */
	@Override
	public boolean isBc() {
		return true;
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return "petals-bc-rest";
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getComponentAlias()
	 */
	@Override
	public String getComponentAlias() {
		return "REST";
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getComponentAnnotation()
	 */
	@Override
	public String getComponentAnnotation() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getProvideDescription()
	 */
	@Override
	public String getProvideDescription() {
		return "Expose an external REST end-point as a service in Petals.";
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getConsumeDescription()
	 */
	@Override
	public String getConsumeDescription() {
		return "Expose a Petals service as a REST end-point.";
	}

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.IComponentDescription#getKeyWords()
	 */
	@Override
	public List<PetalsKeyWords> getKeyWords() {
		return Arrays.asList( PetalsKeyWords.communication );
	}
}
