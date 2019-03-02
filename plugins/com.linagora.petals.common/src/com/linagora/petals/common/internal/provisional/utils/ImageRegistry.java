/******************************************************************************
 * Copyright (c) 2010-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.common.internal.provisional.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;

import com.linagora.petals.common.internal.PetalsCommonPlugin;

/**
 * An image registry used in the Petals project explorer.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public final class ImageRegistry {

	private ImageDescriptor errorOvrDesc;
	private ImageDescriptor warningOverDesc;

	public final Map<ImageDescriptor,Image> baseImages = new HashMap<ImageDescriptor,Image> ();
	public final Map<ImageDescriptor,Image> warningImages = new HashMap<ImageDescriptor,Image> ();
	public final Map<ImageDescriptor,Image> errorImages = new HashMap<ImageDescriptor,Image> ();



	/**
	 * Constructor.
	 */
	public ImageRegistry() {

		try {
			this.errorOvrDesc = PetalsCommonPlugin.getImageDescriptor( "icons/ovr16/error_co.gif" );
		} catch( Exception e ) {
			PetalsCommonPlugin.log( e, IStatus.ERROR );
		}

		try {
			this.warningOverDesc  = PetalsCommonPlugin.getImageDescriptor( "icons/ovr16/warning_co.gif" );
		} catch( Exception e ) {
			PetalsCommonPlugin.log( e, IStatus.ERROR );
		}
	}


	/**
	 * @param descriptor
	 * @return
	 */
	public Image getBaseImage( ImageDescriptor descriptor ) {

		Image img = this.baseImages.get( descriptor );
		if( img == null ) {
			img = descriptor.createImage();
			this.baseImages.put( descriptor, img );
		}

		return img;
	}


	/**
	 * @param descriptor
	 * @return
	 */
	public Image getWarningImage( ImageDescriptor descriptor ) {

		Image img = this.warningImages.get( descriptor );
		if( img == null ) {
			Image baseImg = getBaseImage( descriptor );
			DecorationOverlayIcon overlay = new DecorationOverlayIcon( baseImg, this.warningOverDesc, IDecoration.BOTTOM_LEFT );
			img = overlay.createImage();
			this.warningImages.put( descriptor, img );
		}

		return img;
	}


	/**
	 * @param descriptor
	 * @return
	 */
	public Image getErrorImage( ImageDescriptor descriptor ) {

		Image img = this.errorImages.get( descriptor );
		if( img == null ) {
			Image baseImg = getBaseImage( descriptor );
			DecorationOverlayIcon overlay = new DecorationOverlayIcon( baseImg, this.errorOvrDesc, IDecoration.BOTTOM_LEFT );
			img = overlay.createImage();
			this.errorImages.put( descriptor, img );
		}

		return img;
	}


	/**
	 * Disposes the resources.
	 */
	public void dispose() {

		for( Image img : this.baseImages.values()) {
			img.dispose();
			img = null;
		}

		for( Image img : this.warningImages.values()) {
			img.dispose();
			img = null;
		}

		for( Image img : this.errorImages.values()) {
			img.dispose();
			img = null;
		}

		this.baseImages.clear();
		this.warningImages.clear();
		this.errorImages.clear();
	}
}
