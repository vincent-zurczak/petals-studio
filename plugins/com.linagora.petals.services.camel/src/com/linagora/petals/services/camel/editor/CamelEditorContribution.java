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

package com.linagora.petals.services.camel.editor;

import com.linagora.petals.services.su.editor.extensibility.EditorContributionSupport;
import com.linagora.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;

/**
 * @author Vincent Zurczak - Linagora
 */
public class CamelEditorContribution extends EditorContributionSupport {

	@Override
	protected JbiEditorDetailsContribution getProvidesContribution() {
		return new CamelProvidesEditorContribution();
	}

	@Override
	protected JbiEditorDetailsContribution getConsumesContribution() {
		return new CamelConsumesEditorContribution();
	}
}
