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

package com.linagora.petals.common.tests.utils;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import com.linagora.petals.common.internal.provisional.utils.IoUtils;
import com.linagora.petals.common.internal.provisional.utils.WsdlUtils;
import com.linagora.petals.common.internal.provisional.utils.WsdlUtils.JbiBasicBean;
import com.linagora.petals.common.internal.provisional.utils.WsdlUtils.SoapVersion;

/**
 * Tests the WSDL utilities (parsing and update).
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class TestWsdlUtils extends TestCase {

	/**
	 * Tests a simple WSDL (one service, one port type, one file).
	 * <p>
	 * The WSDL has one SOAP binding, version 1.1.
	 * </p>
	 *
	 * @throws Exception
	 */
	@Test
	public void testWsdlParsing1() throws Exception {

		URL url = getClass().getResource( "/wsdl/tuxDroid.wsdl" );
		List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( url.toString());
		Assert.assertTrue( beans.size() == 1 );

		JbiBasicBean bean = beans.get( 0 );
		Assert.assertEquals( bean.getInterfaceName().getLocalPart(), "TuxDroidPortType" );
		Assert.assertEquals( bean.getServiceName().getLocalPart(), "TuxDroid" );
		Assert.assertEquals( bean.getEndpointName(), "TuxDroidPort" );
		Assert.assertTrue( bean.getSoapVersion() == SoapVersion.v11 );
		Assert.assertTrue( bean.getOperations().size() == 11 );
	}


	/**
	 * Tests a simple WSDL (one service, one port type, one file).
	 * <p>
	 * The WSDL has one SOAP binding, version 1.2.
	 * </p>
	 *
	 * @throws Exception
	 */
	@Test
	public void testWsdlParsing2() throws Exception {

		URL url = getClass().getResource( "/wsdl/hello_soap12.wsdl" );
		List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( url.toString());
		Assert.assertTrue( beans.size() == 1 );

		JbiBasicBean bean = beans.get( 0 );
		Assert.assertEquals( bean.getInterfaceName().getLocalPart(), "ExamplePort" );
		Assert.assertEquals( bean.getServiceName().getLocalPart(), "ExampleService" );
		Assert.assertEquals( bean.getEndpointName(), "ExamplePort" );
		Assert.assertTrue( bean.getSoapVersion() == SoapVersion.v12 );
		Assert.assertTrue( bean.getOperations().size() == 1 );
	}


	/**
	 * Tests a more complex WSDL (one service, one port type, two ports, one file).
	 * <p>
	 * The WSDL has one SOAP binding version 1.1 and one with version 1.2.
	 * </p>
	 *
	 * @throws Exception
	 */
	@Test
	public void testWsdlParsing3() throws Exception {

		URL url = getClass().getResource( "/wsdl/tuxDroid_WithTwoPorts.wsdl" );
		List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( url.toString());
		Assert.assertEquals(2, beans.size());

		for( JbiBasicBean bean : beans ) {
			Assert.assertEquals("TuxDroidPortType", bean.getInterfaceName().getLocalPart());
			Assert.assertEquals("TuxDroid", bean.getServiceName().getLocalPart());
			Assert.assertEquals(11, bean.getOperations().size());

			if( bean.getSoapVersion() == SoapVersion.v11 ) {
				Assert.assertEquals( bean.getSoapAddress(), "http://localhost:9090/TuxDroidPort" );
				Assert.assertEquals("TuxDroidPort", bean.getEndpointName());
			} else {
				Assert.assertEquals( bean.getSoapAddress(), "http://www.example.org/" );
				Assert.assertEquals("TuxDroidPort_Soap12", bean.getEndpointName());
			}
		}
	}


	/**
	 * Tests the end-point update in a WSDL.
	 * @throws Exception
	 */
	@Test
	public void testWsdlUpdate1() throws Exception {

		// Copy the WSDL
		URL url = getClass().getResource( "/wsdl/tuxDroid.wsdl" );
		InputStream in =  url.openStream();
		File tempFile = File.createTempFile( "petals_test_", ".wsdl" );
		IoUtils.copyStream( in, tempFile );
		in.close();

		try {
			// Update the WSDL
			WsdlUtils.INSTANCE.updateEndpointNameInWsdl( tempFile, new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid" ), "TuxDroidPort", "paf" );

			// Check the update
			List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( tempFile.toURI());
			Assert.assertTrue( beans.size() == 1 );
			Assert.assertEquals( beans.get( 0 ).getEndpointName(), "paf" );

		} finally {
			// Delete the temporary WSDL
			IoUtils.deleteFilesRecursively( tempFile );
		}
	}


	/**
	 * Tests the service and end-point update in a WSDL.
	 * @throws Exception
	 */
	@Test
	public void testWsdlUpdate2() throws Exception {

		// Copy the WSDL
		URL url = getClass().getResource( "/wsdl/tuxDroid.wsdl" );
		InputStream in =  url.openStream();
		File tempFile = File.createTempFile( "petals_test_", ".wsdl" );
		IoUtils.copyStream( in, tempFile );
		in.close();

		try {
			// Update the WSDL
			WsdlUtils.INSTANCE.updateEndpointAndServiceNamesInWsdl(
					tempFile,
					new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid" ),
					new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid-renamed" ),
					"TuxDroidPort",
					"paf" );

			// Check the update
			List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( tempFile.toURI());
			Assert.assertTrue( beans.size() == 1 );
			Assert.assertEquals( beans.get( 0 ).getServiceName().getLocalPart(), "TuxDroid-renamed" );
			Assert.assertEquals( beans.get( 0 ).getEndpointName(), "paf" );

		} finally {
			// Delete the temporary WSDL
			IoUtils.deleteFilesRecursively( tempFile );
		}
	}


	/**
	 * Tests the service and end-point update in a WSDL with 2 SOAP bindings.
	 * @throws Exception
	 */
	@Test
	public void testWsdlUpdate3() throws Exception {

		// Copy the WSDL
		URL url = getClass().getResource( "/wsdl/tuxDroid_WithTwoPorts.wsdl" );
		InputStream in =  url.openStream();
		File tempFile = File.createTempFile( "petals_test_", ".wsdl" );
		IoUtils.copyStream( in, tempFile );
		in.close();

		try {
			// Update the WSDL
			WsdlUtils.INSTANCE.updateEndpointNameInWsdl(
					tempFile,
					new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid" ),
					"TuxDroidPort",
					"paf" );

			// Check the update
			List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( tempFile.toURI());
			Assert.assertTrue( beans.size() == 2 );
			for( JbiBasicBean bean : beans ) {
				if( bean.getSoapVersion() == SoapVersion.v11 )
					Assert.assertEquals( bean.getEndpointName(), "paf" );
				else
					Assert.assertEquals( bean.getEndpointName(), "TuxDroidPort_Soap12" );
			}

			// Update the WSDL
			WsdlUtils.INSTANCE.updateEndpointNameInWsdl(
					tempFile,
					new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid" ),
					"TuxDroidPort_Soap12",
					"pif" );

			// Check the update
			beans = WsdlUtils.INSTANCE.parse( tempFile.toURI());
			Assert.assertTrue( beans.size() == 2 );
			for( JbiBasicBean bean : beans ) {
				if( bean.getSoapVersion() == SoapVersion.v11 )
					Assert.assertEquals( bean.getEndpointName(), "paf" );
				else
					Assert.assertEquals( bean.getEndpointName(), "pif" );
			}

		} finally {
			// Delete the temporary WSDL
			IoUtils.deleteFilesRecursively( tempFile );
		}
	}


	/**
	 * Tests the end-point update in a WSDL when the old end-point name is unknown.
	 * @throws Exception
	 */
	@Test
	public void testWsdlUpdate4() throws Exception {

		// Copy the WSDL
		URL url = getClass().getResource( "/wsdl/tuxDroid.wsdl" );
		InputStream in =  url.openStream();
		File tempFile = File.createTempFile( "petals_test_", ".wsdl" );
		IoUtils.copyStream( in, tempFile );
		in.close();

		try {
			// Update the WSDL
			WsdlUtils.INSTANCE.updateEndpointNameInWsdl( tempFile, new QName( "http://tuxdroid.ebmwebsourcing.com/", "TuxDroid" ), null, "paf" );

			// Check the update
			List<JbiBasicBean> beans = WsdlUtils.INSTANCE.parse( tempFile.toURI());
			Assert.assertTrue( beans.size() == 1 );
			Assert.assertEquals( beans.get( 0 ).getEndpointName(), "paf" );

		} finally {
			// Delete the temporary WSDL
			IoUtils.deleteFilesRecursively( tempFile );
		}
	}
}
