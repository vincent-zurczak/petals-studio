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
 
package com.linagora.petals.services.sa.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import com.linagora.petals.common.internal.provisional.formeditor.AbstractJbiEditorPersonality;
import com.linagora.petals.common.internal.provisional.formeditor.ISharedEdition;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.editor.ServicesLabelProvider;
import com.sun.java.xml.ns.jbi.Jbi;

/**
 * The SA personality for the JBI editor.
 */
public class SaPersonality extends AbstractJbiEditorPersonality {

	private ILabelProvider statusLineLabelProvider;


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.editor.IServicesFormEditorPersonality
	 * #getStatusLineLabelProvider()
	 */
	@Override
	public ILabelProvider getStatusLineLabelProvider() {
		if( this.statusLineLabelProvider == null )
			this.statusLineLabelProvider = new ServicesLabelProvider();

		return this.statusLineLabelProvider;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.editor.IServicesFormEditorPersonality
	 * #dispose()
	 */
	@Override
	public void dispose() {
		if( this.statusLineLabelProvider != null )
			this.statusLineLabelProvider.dispose();
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.editor.IServicesFormEditorPersonality
	 * #matchesPersonality(org.eclipse.core.resources.IFile)
	 */
	@Override
	public boolean matchesPersonality( Jbi jbi, IFile jbiXmlFile ) {
		return jbi.getServiceAssembly() != null;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.IJbiEditorPersonality
	 * #getTitle()
	 */
	@Override
	public String getTitle() {
		return "Service Assembly";
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.IJbiEditorPersonality
	 * #getTitleImage()
	 */
	@Override
	public Image getTitleImage() {
		return PetalsServicesPlugin.loadImage( "icons/obj16/service_assembly.png" );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.editor.IJbiEditorPersonality
	 * #createControl(org.eclipse.swt.widgets.Composite, com.linagora.petals.services.su.editor.ISharedEdition)
	 */
	@Override
	public void createControl( Composite parent, ISharedEdition ise ) {
		new SaEditionComposite( parent, ise );
	}
}
