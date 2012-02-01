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
package com.ebmwebsourcing.petals.services.ejb.editor;

import com.ebmwebsourcing.petals.services.su.editor.extensibility.EditorContributionSupport;
import com.ebmwebsourcing.petals.services.su.editor.extensibility.JbiEditorDetailsContribution;

/**
 * 
 * @author Mickael Istria (EBM Websourcing)
 *
 */
public class EJBEditorExtension extends EditorContributionSupport {

	@Override
	protected JbiEditorDetailsContribution getProvidesContribution() {
		return new EJBProvidesEditorContribution();
	}

	@Override
	protected JbiEditorDetailsContribution getConsumesContribution() {
		// TODO Auto-generated method stub
		return null;
	}

}
