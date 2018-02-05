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
 
package com.ebmwebsourcing.petals.common.internal.projectscnf;

import java.text.SimpleDateFormat;

/**
 * A class used to measure events.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class StatisticsTimer {

	public boolean enabled = false;
	private Long start;
	private final Object LOCK = new Object();
	private final SimpleDateFormat df = new SimpleDateFormat( "s','S's'" );


	/**
	 * Starts the measures.
	 * @param prefix a prefix to the message
	 */
	public void start( String prefix ) {

		if( ! this.enabled )
			return;

		System.out.println( "-------------------------" );
		System.out.println((prefix != null ? prefix : "") + "Starting measures... Total time: 0,000s" );
		synchronized( this.LOCK ) {
			this.start = System.currentTimeMillis();
		}
	}


	/**
	 * Stops the measures.
	 * @param prefix a prefix to the message
	 */
	public void stop( String prefix ) {

		if( ! this.enabled || this.start == null )
			return;

		Long diff;
		synchronized( this.LOCK ) {
			diff = System.currentTimeMillis() - this.start;
			this.start = null;
		}

		System.out.println((prefix != null ? prefix : "") + "Stopping measures. Total time: " + this.df.format( diff ));
		System.out.println( "-------------------------" );
	}


	/**
	 * Logs a message and the total time elapsed.
	 * @param message
	 */
	public void track( String message ) {

		if( ! this.enabled || this.start == null )
			return;

		Long diff;
		synchronized( this.LOCK ) {
			diff = System.currentTimeMillis() - this.start;
		}

		System.out.println( message + " Total time: " + this.df.format( diff ));
	}


	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return this.enabled;
	}


	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled( boolean enabled ) {
		this.enabled = enabled;
	}
}
