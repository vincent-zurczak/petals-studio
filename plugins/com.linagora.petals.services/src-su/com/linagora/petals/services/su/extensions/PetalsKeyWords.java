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

package com.linagora.petals.services.su.extensions;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public enum PetalsKeyWords {

	connector, engine;


	/*
	 * (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {

		String result;
		switch( this ) {
		case connector:
			result = "Connectors";
			break;
		case engine:
			result = "Engines";
			break;
		default:
			result = "";
		}

		return result;
	}


	/**
	 * Resolves a use case from its string value.
	 * @param s a string
	 * @return a Petals use case, or null if the string does not match anything
	 */
	public static PetalsKeyWords resolveString( String s ) {

		PetalsKeyWords result = null;
		for( PetalsKeyWords mode : values()) {
			if( mode.toString().equals( s )) {
				result = mode;
				break;
			}
		}

		return result;
	}
}
