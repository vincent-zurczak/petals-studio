/******************************************************************************
 * Copyright (c) 2012-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.services.jsr181.editor;

import com.linagora.petals.services.su.editor.extensibility.EditorContributionSupport;
import com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class JaxWsEditorContribution extends EditorContributionSupport {

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.EditorContributionSupport
	 * #getProvidesContribution()
	 */
	@Override
	protected JbiEditorDetailsContribution getProvidesContribution() {
		return new JaxWsProvidesEditorContribution();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.extensibility.EditorContributionSupport
	 * #getConsumesContribution()
	 */
	@Override
	protected JbiEditorDetailsContribution getConsumesContribution() {
		return null;
	}
}
