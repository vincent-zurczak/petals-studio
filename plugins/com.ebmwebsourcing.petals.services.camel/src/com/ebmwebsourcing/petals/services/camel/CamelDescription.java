/******************************************************************************
 * Copyright (c) 2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.camel;

import java.util.Arrays;
import java.util.List;

import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.extensions.PetalsKeyWords;

/**
 * @author Vincent Zurczak - Linagora
 */
public abstract class CamelDescription extends ComponentVersionDescription {

	@Override
	public boolean isBc() {
		return false;
	}

	@Override
	public String getComponentName() {
		return "petals-se-camel";
	}

	@Override
	public String getComponentAlias() {
		return "Camel";
	}

	@Override
	public String getComponentAnnotation() {
		return null;
	}

	@Override
	public String getProvideDescription() {
		return "Execute Camel routes in Petals.";
	}

	@Override
	public String getConsumeDescription() {
		return "Execute Camel routes in Petals.";
	}

	@Override
	public List<PetalsKeyWords> getKeyWords() {
		return Arrays.asList( PetalsKeyWords.composition, PetalsKeyWords.integration );
	}

	@Override
	public boolean isProvide() {
		return true;
	}

	@Override
	public boolean isConsume() {
		return false;
	}

	@Override
	public boolean isProxy() {
		return true;
	}
}
