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

package com.linagora.petals.services.jsr181;

import java.util.Arrays;
import java.util.List;

import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.extensions.PetalsKeyWords;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class Jsr181Description extends ComponentVersionDescription {

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
		return "petals-se-jsr181";
	}


	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.extensions.ComponentVersionDescription
	 * #getComponentAlias()
	 */
	@Override
	public String getComponentAlias() {
		return "Jsr181";
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
		return "Hard-code a Petals service with JAX-WS.";
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
}
