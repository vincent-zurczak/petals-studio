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

package com.linagora.petals.studio.utils;

import org.eclipse.core.runtime.IProduct;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.internal.ProductProperties;

import com.linagora.petals.studio.PetalsStudioPlugin;

/**
 * Utility methods for studio's versions.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public final class VersionUtils {

	public static final String DEV_VERSION = "@version@";


	/**
	 * Private constructor for utility class.
	 */
	private VersionUtils() {
		// nothing
	}


	/**
	 * Gets the product build ID.
	 * @return the build ID
	 */
	@SuppressWarnings( "restriction" )
	public static String getProductBuildId() {

		IProduct product = Platform.getProduct();
		String aboutText = null;
		try {
			aboutText = ProductProperties.getAboutText( product );

		} catch( Exception e ) {
			PetalsStudioPlugin.log( e, IStatus.WARNING );
		}

		String[] parts;
		if( aboutText != null )
			parts = aboutText.split( "\n" );
		else
			parts = new String[ 0 ];

		String productBuildId = "";
		for( String s : parts ) {
			if( s.startsWith( "Build ID:" )) {
				productBuildId = s.substring( 9 ).trim();
				break;
			}
		}

		return productBuildId;
	}


	/**
	 * Gets the product version.
	 * @param fullVersion true to get all the digits, false to only get the two first ones
	 * @return the version
	 */
	@SuppressWarnings( "restriction" )
	public static String getProductVersion( boolean fullVersion ) {

		IProduct product = Platform.getProduct();
		String aboutText = null;
		try {
			aboutText = ProductProperties.getAboutText( product );

		} catch( Exception e ) {
			PetalsStudioPlugin.log( e, IStatus.WARNING );
		}

		String[] parts;
		if( aboutText != null )
			parts = aboutText.split( "\n" );
		else
			parts = new String[ 0 ];

		String version = "";
		for( String s : parts ) {
			if( s.startsWith( "Version:" )) {
				version = s.substring( 9 ).trim();
				break;
			}
		}

		// Only accept one dot in the version?
		if( ! fullVersion )
			version = getTwoDigitVersion( version );

		return version;
	}


	/**
	 * Keeps the two first digit of a product version.
	 * @param fullVersion the full product version (may include a version and a qualifier)
	 * @return the version, containing only the major and minor digits (never null)
	 */
	public static String getTwoDigitVersion( String fullVersion ) {

		String version = "";
		if( fullVersion != null && fullVersion.trim().length() > 0 ) {

			// First 2 digits
			String[] parts = fullVersion.split( "\\." );
			if( parts.length > 2 )
				version = parts[ 0 ] + "." + parts[ 1 ];

			// Is there a qualifier?
			int index = fullVersion.lastIndexOf( ' ' );
			if( index != -1 )
				version += fullVersion.substring( index );

			// Development version?
			if( DEV_VERSION.equals( fullVersion ))
				version = "-- DEV --";
		}

		return version;
	}
}
