/******************************************************************************
 * Copyright (c) 2010-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.internal.provisional.swt;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;

/**
 * A tool tip to display an image and that reacts to user clicks.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ImageToolitp extends ToolTip {

	private final ImageDescriptor desc;
	private Image img;


	/**
	 * Constructor.
	 * @param control
	 * @param desc (not null)
	 */
	public ImageToolitp( Control control, ImageDescriptor desc ) {
		super( control, ToolTip.RECREATE, true );
		this.desc = desc;
	}


	/* (non-Jsdoc)
	 * @see org.eclipse.jface.window.ToolTip
	 * #createToolTipContentArea(org.eclipse.swt.widgets.Event, org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Composite createToolTipContentArea( Event event, Composite parent ) {

		Composite container = new Composite( parent, SWT.NONE );
		container.setLayout( new FillLayout());

		Label label = new Label( container, SWT.NONE );
		this.img = this.desc.createImage();
		label.setImage( this.img );

		container.setSize( this.img.getBounds().width, this.img.getBounds().height );

		return container;
	}


	/**
	 * Disposes the created resources.
	 */
	public void dispose() {

		if( this.img != null )
			this.img.dispose();
	}
}
