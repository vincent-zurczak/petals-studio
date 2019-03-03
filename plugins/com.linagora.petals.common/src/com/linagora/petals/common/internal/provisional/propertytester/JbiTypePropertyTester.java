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
 
package com.linagora.petals.common.internal.provisional.propertytester;

import java.io.File;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;

import com.linagora.petals.common.internal.provisional.utils.JbiXmlUtils;
import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;

/**
 * A property tester to check whether an SU project is a sketch project.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class JbiTypePropertyTester extends PropertyTester {

	public static final String SU_TYPE = "SU";
	public static final String SA_TYPE = "SA";
	public static final String SL_TYPE = "SL";
	public static final String COMP_TYPE = "Component";


	/**
	 * Constructor.
	 */
	public JbiTypePropertyTester() {
		// nothing
	}


	/* (non-Javadoc)
	 * @see org.eclipse.core.expressions.IPropertyTester
	 * #test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	public boolean test( Object receiver, String property, Object[] args, Object expectedValue ) {

		boolean result = false;
		if( receiver instanceof IProject ) {
			IProject p = (IProject) receiver;
			if( p.isAccessible()) {

				File jbiXmlFile = p.getFile( PetalsConstants.LOC_JBI_FILE ).getLocation().toFile();
				if( jbiXmlFile.exists()) {

					if( SU_TYPE.equals( expectedValue ))
						result = JbiXmlUtils.describesServiceUnit( jbiXmlFile );
					else if( SA_TYPE.equals( expectedValue ))
						result = JbiXmlUtils.describesServiceAssembly( jbiXmlFile );
					else if( SL_TYPE.equals( expectedValue ))
						result = JbiXmlUtils.describesSharedLibrary( jbiXmlFile );
					else if( COMP_TYPE.equals( expectedValue ))
						result = JbiXmlUtils.describesComponent( jbiXmlFile );
				}
			}
		}

		return result;
	}
}
