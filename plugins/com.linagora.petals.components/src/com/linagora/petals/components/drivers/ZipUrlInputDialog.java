/******************************************************************************
 * Copyright (c) 2011-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.components.drivers;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.bpel.common.wsdl.helpers.UriAndUrlHelper;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;

import com.linagora.petals.common.internal.provisional.emf.InvalidJbiXmlException;
import com.linagora.petals.components.PetalsComponentsPlugin;
import com.linagora.petals.components.utils.ArtifactArchiveUtils;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ZipUrlInputDialog extends InputDialog {

	private Properties slProperties;
	private boolean cancelled = false;


	/**
	 * Constructor.
	 * @param shell
	 * @param url
	 */
	public ZipUrlInputDialog( Shell shell, URL url ) {

		super( 	shell,
				"Shared Library URL",
				"Enter the URL of a Petals Shared Library.",
				url == null ? "" : url.toString(),
					new IInputValidator() {

			@Override
			public String isValid( String newText ) {

				String s = null;
				try {
					URI uri = UriAndUrlHelper.urlToUri( newText );
					uri.toURL();

				} catch( Exception e ) {
					s = "This URL is invalid.";
				}

				return s;
			}
		});
	}


	/*
	 * (non-Jsdoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {

		// Parse the jbi.xml of the URL
		ProgressMonitorDialog dlg = new ProgressMonitorDialog( getShell());
		dlg.setOpenOnRun( true );
		try {
			dlg.run( true, true, new IRunnableWithProgress() {

				@Override
				public void run( IProgressMonitor monitor )
				throws InvocationTargetException, InterruptedException {

					// To report progression and support cancellation, the parsing is made in another thread
					final AtomicBoolean isParsed = new AtomicBoolean( false );
					Thread parsingThread = new Thread() {
						@Override
						public void run() {

							try {
								URI uri = UriAndUrlHelper.urlToUri( getValue());
								ZipUrlInputDialog.this.slProperties = ArtifactArchiveUtils.getSharedLibraryVersion( uri );

							} catch( InvalidJbiXmlException e ) {
								PetalsComponentsPlugin.log( e, IStatus.ERROR );

							} finally {
								isParsed.set( true );
							}
						}
					};

					try {
						monitor.beginTask( "", IProgressMonitor.UNKNOWN );
						parsingThread.start();
						while( ! isParsed.get()) {
							Thread.sleep( 500 );
							monitor.worked( 2 );

							// Cancelled operation? Let the thread finish its job...
							if( monitor.isCanceled()) {
								ZipUrlInputDialog.this.cancelled = true;
								break;
							}
						}

					} finally {
						monitor.done();
					}
				}
			});

		} catch( InvocationTargetException e ) {
			PetalsComponentsPlugin.log( e, IStatus.ERROR );

		} catch( InterruptedException e ) {
			// nothing
		}

		// Close the dialog
		super.okPressed();
	}


	/**
	 * @return the SL name (to call after OK was pressed)
	 */
	public String getName() {
		return this.slProperties != null ? this.slProperties.getProperty( ArtifactArchiveUtils.SL_NAME ) : null;
	}


	/**
	 * @return the SL version (to call after OK was pressed)
	 */
	public String getVersion() {
		return this.slProperties != null ? this.slProperties.getProperty( ArtifactArchiveUtils.SL_VERSION ) : null;
	}


	/**
	 * @return the cancelled
	 */
	public boolean isCancelled() {
		return this.cancelled;
	}
}
