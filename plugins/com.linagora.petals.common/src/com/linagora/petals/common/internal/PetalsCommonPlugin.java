/******************************************************************************
 * Copyright (c) 2008-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.common.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.linagora.petals.common.internal.provisional.utils.PetalsImages;

/**
 * The activator class controls the plug-in life cycle
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class PetalsCommonPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.linagora.petals.common";

	// The shared instance
	private static PetalsCommonPlugin plugin;

	// Keep a clipboard
	private Clipboard clipboard;


	/**
	 * The constructor
	 */
	public PetalsCommonPlugin() {
		// nothing
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin
	 * #start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start( BundleContext context ) throws Exception {
		super.start( context );
		plugin = this;
	}


	/**
	 * Sets default editors for XSD and WSDL.
	 * <p>
	 * Was called in {@link #start(BundleContext)}.
	 * However, this editor is not yet mature. It displays error markers directly and
	 * does not support XML type edition. The default one is less problematic.
	 * </p>
	 * <p>
	 * See PETALSSTUD-222.
	 * </p>
	 */
//	private void setDefaultEditors() {
//		IEditorRegistry registry = PlatformUI.getWorkbench().getEditorRegistry();
//		registry.setDefaultEditor( "*.xsd", DataTypesEditor.EDITOR_ID );
//		registry.setDefaultEditor( "*.wsdl", ServiceInterfaceEditor.EDITOR_ID );
//	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin
	 * #stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop( BundleContext context ) throws Exception {
		plugin = null;
		super.stop( context );

		try {
			PetalsImages.INSTANCE.dispose();
			if( this.clipboard != null && ! this.clipboard.isDisposed()) {
				this.clipboard.dispose();
				this.clipboard = null;
			}
		} catch( Exception e ) {
			// nothing
		}
	}


	/**
	 * Returns the shared instance
	 * @return the shared instance
	 */
	public static PetalsCommonPlugin getDefault() {
		return plugin;
	}


	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor( String path ) {
		return imageDescriptorFromPlugin( PLUGIN_ID, path );
	}


	/**
	 * Logs an exception.
	 * @param e the exception to log
	 * @param severity the severity, given as one of the {@link IStatus} constants
	 */
	public static void log( Exception e, int severity ) {

		String msg = e.getMessage();
		if( msg == null || msg.trim().length() == 0 )
			msg = "An error occurred.";

		IStatus status = new Status( severity, PLUGIN_ID, msg, e );
		getDefault().getLog().log( status );
	}


	/**
	 * Logs a message.
	 * @param message the message to log
	 * @param severity the severity, given as one of the {@link IStatus} constants
	 */
	public static void log( String message, int severity ) {
		IStatus status = new Status( severity, PLUGIN_ID, message );
		getDefault().getLog().log( status );
	}


	/**
	 * Logs a message and an exception.
	 * @param e the exception to log
	 * @param severity the severity, given as one of the {@link IStatus} constants
	 * @param message the message to log
	 */
	public static void log( Exception e, int severity, String message ) {
		IStatus status = new Status( severity, PLUGIN_ID, message, e );
		getDefault().getLog().log( status );
	}


	/**
	 * @param display
	 * @return the clip board
	 */
	public Clipboard getClipboard( Display display ) {
		if( this.clipboard == null )
			this.clipboard = new Clipboard( display );

		return this.clipboard;
	}
}
