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
 
package com.linagora.petals.common.internal.provisional.databinding;

import javax.xml.namespace.QName;

import org.eclipse.core.databinding.conversion.Converter;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public class LocalQNameToStringConverter extends Converter {

	/**
	 * Constructor.
	 */
	public LocalQNameToStringConverter() {
		super(QName.class, String.class);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter
	 * #convert(java.lang.Object)
	 */
	@Override
	public Object convert(Object fromObject) {
		return ((QName)fromObject).getLocalPart();
	}
}
