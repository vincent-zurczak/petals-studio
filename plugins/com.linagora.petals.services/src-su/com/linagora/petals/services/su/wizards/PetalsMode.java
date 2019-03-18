/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.su.wizards;

/**
 * The two Petals modes.
 * <ul>
 * 	<li><i>Provides</i> defines services providers.</li>
 *  <li><i>Consumes</i> defines pure service consumers.</li>
 *  <li>
 *  <i>Proxies</i> and <i>orchestrators</i> are both providers and consumers. However,
 *  the consume part is considered as a part of the implementation and is thus not relevant.
 *  Proxies and orchestrators are considered as service providers.
 *  </li>
 * </ul>
 *
 * @author Vincent Zurczak - EBM WebSourcing
 */
public enum PetalsMode {
	provides, consumes;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {

		String result;
		switch( this ) {
		case provides:
			result = "Provides";
			break;
		case consumes:
			result = "Consumes";
			break;
		default:
			result = "";
		}

		return result;
	};


	/**
	 * Resolves a mode from its string value.
	 * @param s a string
	 * @return a Petals mode, or null if the string does not match anything
	 */
	public static PetalsMode resolveString( String s ) {

		PetalsMode result = null;
		for( PetalsMode mode : values()) {
			if( mode.toString().equals( s )) {
				result = mode;
				break;
			}
		}

		return result;
	}
}
