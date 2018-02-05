/******************************************************************************
 * Copyright (c) 2010-2018, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.ebmwebsourcing.petals.common.extensions.internal.provisional;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import org.apache.cxf.tools.java2ws.JavaToWS;
import org.apache.cxf.tools.wsdlto.WSDLToJava;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.osgi.framework.Bundle;

import com.ebmwebsourcing.petals.common.extensions.PetalsCommonWsdlExtPlugin;
import com.ebmwebsourcing.petals.common.internal.provisional.preferences.PreferencesManager;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.IoUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.JavaUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.StringUtils;

/**
 * A set of utility methods for WSDL and based on an external library (e.g. CXF).
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class WsdlExtUtils {

	/**
	 * Generates a WSDL from a class that is located inside a Java project.
	 * @param wsdlName
	 * @param className
	 * @param outputDirectoryName
	 * @param jp
	 * @return the WSDL file (may not exist in case of error)
	 * FIXME: do we need to capture this kind of error?
	 */
	public static File generateWsdlFile(
				String wsdlName,
				String className,
				String outputDirectoryName,
				IJavaProject jp ) {

		List<String> classpath = JavaUtils.getClasspath( jp, true, true );
		String[] classPathDirectories = new String[ classpath.size()];
		return generateWsdlFile(
					wsdlName,
					outputDirectoryName,
					className,
					classpath.toArray( classPathDirectories ),
					outputDirectoryName,
					null,
					null,
					new NullProgressMonitor()); // TODO replace by a provided monitor
	}


	/**
	 * Generates a WSDL file from a class with a specified class path.
	 * @param wsdlName
	 * @param outputDestination
	 * @param className
	 * @param classPathDirectories
	 * @param buildDirectory
	 * @param endpointName
	 * @param serviceName
	 * @param monitor
	 * @return the WSDL file (may not exist in case of error)
	 * FIXME: do we need to capture this kind of error?
	 */
	public static File generateWsdlFile(
				String wsdlName,
				String outputDestination,
				String className,
				String[] classPathDirectories,
				String buildDirectory,
				String endpointName,
				String serviceName,
				IProgressMonitor monitor ) {

		final boolean logCxf = PreferencesManager.logAllCXFTraces();
		List<String> arguments = new ArrayList<String> ();
		List<String> classpath = new ArrayList<String> ();
		classpath.addAll( Arrays.asList( classPathDirectories ));
		classpath.addAll( getCXFLibs());

		arguments.add( "-wsdl" );
		if( logCxf )
			arguments.add( "-verbose" );
		else
			arguments.add( "-quiet" );

		arguments.add( "-o" );
		arguments.add( wsdlName );

		if( serviceName != null ) {
			arguments.add( "-servicename" );
			arguments.add( serviceName );
		}

		if( endpointName != null ) {
			arguments.add( "-portname" );
			arguments.add( endpointName );
		}

		arguments.add( "-createxsdimports" );
		arguments.add( "-d" ); //$NON-NLS-1$
		arguments.add( outputDestination );
		arguments.add(className);

		final StringBuilder sb = new StringBuilder();
		try {
			// Run CXF in a separate process
			IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
            IVMRunner vmRunner = vmInstall.getVMRunner( ILaunchManager.RUN_MODE );
            VMRunnerConfiguration vmRunnerConfiguration = new VMRunnerConfiguration(
            		JavaToWS.class.getName(),
                    classpath.toArray( new String[ classpath.size()]));
            vmRunnerConfiguration.setProgramArguments( arguments.toArray( new String[ arguments.size()]));

			// Create the launch
            final IStreamListener streamListener = new IStreamListener() {
				@Override
				public void streamAppended( String text, IStreamMonitor monitor ) {
					if( ! StringUtils.isEmpty( text ))
						sb.append( text + "\n" );
				}
			};

            ILaunch launch = new Launch(null, ILaunchManager.RUN_MODE, null) {
            	@Override
            	public void addProcess( IProcess process ) {
            		super.addProcess( process );

            		try {
            			process.getStreamsProxy().getErrorStreamMonitor().addListener( streamListener );
            			process.getStreamsProxy().getOutputStreamMonitor().addListener( streamListener );

            		} catch( Exception e ) {
            			PetalsCommonWsdlExtPlugin.log( e, IStatus.WARNING );
            		}
            	}
            };

            // Start the execution
            vmRunner.run( vmRunnerConfiguration, launch, monitor );

            // Wait for the Java process to have completed its work
            for( int i=0; i<10; i++ ) {
            	if( launch.isTerminated())
            		break;

            	Thread.sleep( 1000 );
            }

		} catch( Exception e ) {
			PetalsCommonWsdlExtPlugin.log( e, IStatus.ERROR );

		} finally {
			if( logCxf ) {
				Exception e = new Exception( sb.toString());
				String msg = "CXF Logs for a Java to WSDL conversion.\n";
				PetalsCommonWsdlExtPlugin.log( e, IStatus.INFO, msg );
			}
		}

		return new File( outputDestination, wsdlName );
	}


	/**
	 * @return the CXF libraries
	 */
	private static Collection<? extends String> getCXFLibs() {

		List<String> res = new ArrayList<String>();
		Bundle cxfBundle = Platform.getBundle( "com.ebmwebsourcing.petals.libs.cxf" );
		Enumeration<URL> cxfLibs = cxfBundle.findEntries( "lib", "*", false );
		URL currentLib = null;
		while( cxfLibs.hasMoreElements()) {
			currentLib = cxfLibs.nextElement();
			try {
				URL url = FileLocator.toFileURL( currentLib );
				if( ! url.toString().endsWith( ".jar" ))
					continue;

				File f = IoUtils.convertToFile( url.toString());
				String path = f != null ? f.getAbsolutePath() : null;

				if( path != null )
					res.add( path );
				else
					PetalsCommonWsdlExtPlugin.log( "A CXF library could not be resolved as a file: " + url, IStatus.ERROR );

			} catch( Exception ex ) {
				PetalsCommonWsdlExtPlugin.log(ex, IStatus.ERROR);
			}
		}

		return res;
	}


	/**
	 * Generates a Java interface from a WSDL definition.
	 * @param wsdlUri the WSDL URI.
	 * @param outputDestination the directory where the Java files must be generated
	 */
	public static void generateJavaCode( String wsdlUri, String outputDestination ) {

		List<String> arguments = new ArrayList<String> ();
		arguments.add( "-autoNameResolution" ); //$NON-NLS-1$
		arguments.add( "-quiet" ); //$NON-NLS-1$

		arguments.add( "-d" ); //$NON-NLS-1$
		arguments.add( outputDestination );
		arguments.add( wsdlUri );

		String[] args = new String[ arguments.size()];
		try {
			// TODO in case of issue: replace with a VMRunner (cf generateWSDLFile)
			WSDLToJava.main( arguments.toArray( args ));

		} catch( Exception e ) {
			PetalsCommonWsdlExtPlugin.log( e, IStatus.ERROR );
		}
	}


	/**
	 * Generates a Java client for a Web Service.
	 * @param wsdlUri the WSDL URI.
	 * @param outputDestination the directory where the Java files must be generated
	 */
	public static void generateWebServiceClient( String wsdlUri, String outputDestination ) {

		List<String> arguments = new ArrayList<String> ();
		arguments.add( "-autoNameResolution" ); //$NON-NLS-1$
		arguments.add( "-quiet" ); //$NON-NLS-1$
		arguments.add( "-client" ); //$NON-NLS-1$

		arguments.add( "-d" ); //$NON-NLS-1$
		arguments.add( outputDestination );
		arguments.add( wsdlUri );

		String[] args = new String[ arguments.size()];
		try {
			// TODO in case of issue: replace with a VMRunner (cf generateWSDLFile)
			WSDLToJava.main( arguments.toArray( args ));

		} catch( Exception e ) {
			PetalsCommonWsdlExtPlugin.log( e, IStatus.ERROR );
		}
	}

}
