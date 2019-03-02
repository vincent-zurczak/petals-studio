/******************************************************************************
 * Copyright (c) 2009-2018, Linagora
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

import java.io.File;
import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.IStatus;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.linagora.petals.common.internal.PetalsCommonPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public final class XPathUtils {

	/**
	 * Not sensitive to name spaces (for instance, but not sure either it will be one day).
	 */
	private static final XPath X_PATH = XPathFactory.newInstance().newXPath();


	/**
	 * Private constructor for utility class.
	 */
	private XPathUtils() {
		// nothing
	}


	/**
	 * @param xPathExpression the XPath expression
	 * @param rootNode the root node, or null for the entire document
	 * @param returnType the return type (see XPathConstants)
	 * @return the result of the evaluated expression
	 */
	public static synchronized Object evaluateXPathExpression(
				String xPathExpression,
				Node rootNode,
				QName returnType ) {

		Object result = null;
		try {
			result = X_PATH.evaluate( xPathExpression, rootNode, returnType );

		} catch( XPathExpressionException e ) {
			PetalsCommonPlugin.log( e, IStatus.WARNING );
		}

		return result;
	}


	/**
	 * Validates a XPath expression.
	 * @param xpathExpression the XPath expression to validate
	 * @return null if the expression is correct, an error message otherwise
	 */
	public static String validateXPathExpression( String xpathExpression ) {

		String msg = null;
		try {
			X_PATH.compile( xpathExpression );

		} catch( Exception e ) {
			String cause = null;
			if( e.getCause() != null )
				e.getCause().getMessage();
			else
				cause = e.getMessage();

			cause = cause == null ? "" : " " + cause;
			msg = "Invalid XPath expression." + cause;
		}

		return msg;
	}


	/**
	 * @param xPathExpression the XPath expression
	 * @param rootNode the root node, or null for the entire document
	 * @param returnType the return type (see XPathConstants)
	 * @return the result of the evaluated expression
	 * @throws ParserConfigurationException
	 * @throws IOException if the file cannot be parsed
	 * @throws SAXException if the file could not be parsed
	 */
	public static synchronized Object evaluateXPathExpression(
				String xPathExpression,
				File xmlFile,
				QName returnType ) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse( xmlFile );
		return evaluateXPathExpression( xPathExpression, document, returnType );
	}
}
