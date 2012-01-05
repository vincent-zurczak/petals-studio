/******************************************************************************
 * Copyright (c) 2011, EBM WebSourcing
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     EBM WebSourcing - initial API and implementation
 *******************************************************************************/

package com.ebmwebsourcing.petals.services.jsr181.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import com.ebmwebsourcing.petals.common.internal.provisional.utils.JavaUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.JaxWsUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.JaxWsUtils.JaxWsException;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.PetalsConstants;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.UriUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlImportUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlUtils.JbiBasicBean;
import com.ebmwebsourcing.petals.services.jsr181.Jsr181Constants;
import com.ebmwebsourcing.petals.services.jsr181.Jsr181Description11;
import com.ebmwebsourcing.petals.services.jsr181.PetalsJsr181Plugin;
import com.ebmwebsourcing.petals.services.jsr181.generated.JaxWsImplementation;
import com.ebmwebsourcing.petals.services.jsr181.jsr181.Jsr181Package;
import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.wizards.ComponentCreationWizard;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.JbiPackage;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class Jsr181ProvidesWizard extends ComponentCreationWizard {

	private boolean wsdlFirst;
	private String wsdlUrl;
	
	public Jsr181ProvidesWizard() {
		super();
		settings.showJbiPage = false;
		settings.openJbiEditor = false;
	}
	
	/* (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new Jsr181Description11();
	}

	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public IStatus performLastActions(IFolder resourceFolder, AbstractEndpoint abstractEndpoint, IProgressMonitor monitor) {

		IStatus result = Status.OK_STATUS;
		try {
			// Java project
			IJavaProject jp = JavaUtils.createJavaProject( resourceFolder.getProject());

			// Start working on the JAX-WS part
			if( wsdlFirst ) {
				wsdlFirstApproach( jp, abstractEndpoint, monitor );
			} else {
				implementationFirstApproach( jp.getProject(), abstractEndpoint, monitor );
			}

		} catch( CoreException e ) {
			result = new Status( Status.ERROR, PetalsJsr181Plugin.PLUGIN_ID, "Jsr181 Error", e );
		}

		return result;
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.extensions.ComponentWizardHandler
	 * #validatePrerequisites()
	 */
	public Exception validatePrerequisites() {
		try {
			JaxWsUtils.getJavaExecutable( true );
			JaxWsUtils.getJavaExecutable( false );

		} catch( IOException e ) {
			return e;
		}

		return null;
	}


	/**
	 * Completes the wizard for an implementation-first approach.
	 *
	 * @param project
	 * @param ae
	 * @param resourcesToSelect
	 * @param monitor
	 * TODO: fix it
	 */
	private void implementationFirstApproach( IProject project, AbstractEndpoint ae, IProgressMonitor monitor ) {

		IFolder srcFolder = project.getFolder( PetalsConstants.LOC_SRC_FOLDER );

		String className = (String) ae.eGet(Jsr181Package.Literals.JSR181_PROVIDES__CLAZZ);
		int lastDotIndex = className.lastIndexOf( '.' );
		String packageName, simpleClassName;

		// The page validation guarantees that the class name respects Java conventions
		if( lastDotIndex > 0 ) {
			simpleClassName = className.substring( lastDotIndex + 1 );
			packageName = className.substring( 0, lastDotIndex );
		}
		else {
			simpleClassName = className;
			packageName = "";
		}

		// set Values
		String[] nsParts = packageName.trim().split( "\\." );
		StringBuffer nsStringBuffer = new StringBuffer( "http://" );
		for( int i=nsParts.length - 1; i>0; i-- )
			nsStringBuffer.append( nsParts[ i ] + "." );
		nsStringBuffer.append( nsParts[ 0 ]);
		String namespace = nsStringBuffer.toString();
		
		ae.setServiceName( new QName(namespace, simpleClassName) );
		ae.setInterfaceName( new QName(namespace, simpleClassName) );
		ae.setEndpointName(simpleClassName + "Port");
		
		// Fill-in the generation properties
		Properties generationProperties = new Properties();
		generationProperties.put( Jsr181Constants.INTERFACE_NAME, simpleClassName + "Interface" );
		generationProperties.put( Jsr181Constants.CLASS_NAME, simpleClassName );
		generationProperties.put( Jsr181Constants.PACKAGE_NAME, packageName );
		generationProperties.put( Jsr181Constants.PROJECT_NAME, project.getName());
		generationProperties.put( Jsr181Constants.PROJECT_LOCATION, srcFolder.getProject().getLocation().toString());

		generationProperties.put( Jsr181Constants.SERVICE_NAME, ae.getServiceName().getLocalPart());
		generationProperties.put( Jsr181Constants.PORT_NAME, ae.getEndpointName());
		generationProperties.put( Jsr181Constants.TNS, ae.getServiceName().getNamespaceURI());

		// Create the package
		StringBuffer sb = new StringBuffer();
		for( String path : packageName.trim().split( "\\." ))
			sb.append( path + "/" );

				File packageDirectory = srcFolder.getLocation().append( sb.toString()).toFile();
				if( ! packageDirectory.exists()
						&& ! packageDirectory.mkdirs()) {
					PetalsJsr181Plugin.log( new IOException( "Could not create the Java package." ), IStatus.ERROR );
				}

				try {
					srcFolder.refreshLocal( IResource.DEPTH_INFINITE, monitor );
				} catch( CoreException e ) {
					// nothing
				}

				if( packageDirectory.exists() && ! packageDirectory.isFile()) {

					// Create the JAX-WS implementation
					IFile file = srcFolder.getFile( sb.toString() + simpleClassName + ".java" );
					createFile( file, new JaxWsImplementation().generate( generationProperties ), monitor );

					// Open the implementation in the Java editor
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						IDE.openEditor( page, file );

					} catch( PartInitException e ) {
						PetalsJsr181Plugin.log( e, IStatus.ERROR );

					}
				}
	}


	/**
	 * Completes the wizard for a WSDL-first approach.
	 *
	 * @param jp the Java project
	 * @param ae
	 * @param resourcesToSelect
	 * @param monitor
	 * TODO: fix it
	 */
	private void wsdlFirstApproach( IJavaProject jp, AbstractEndpoint ae, IProgressMonitor monitor ) {

		try {
			// Create the WS implementation
			IProject project = jp.getProject();
			URI wsdlUri = UriUtils.urlToUri( wsdlUrl );

			IFolder srcFolder = project.getFolder( PetalsConstants.LOC_SRC_FOLDER );
			File srcDirectory = srcFolder.getLocation().toFile();

			Map<String,String> buildOptions = new HashMap<String,String> ();
			JaxWsUtils.INSTANCE.generateWsClient( wsdlUri, srcDirectory );
			srcFolder.refreshLocal( IResource.DEPTH_INFINITE, monitor );
			project.build( IncrementalProjectBuilder.FULL_BUILD, JavaCore.BUILDER_ID, buildOptions, monitor );

			srcFolder.refreshLocal( IResource.DEPTH_INFINITE, monitor );
			JaxWsUtils.removeWebServiceClient( jp, monitor );
			Map<String,String> serviceNameToClassName = JaxWsUtils.createJaxWsImplementation( jp, monitor );
			srcFolder.refreshLocal( IResource.DEPTH_INFINITE, monitor );
			project.build( IncrementalProjectBuilder.FULL_BUILD, JavaCore.BUILDER_ID, buildOptions, monitor );

			// Update JBI
			JbiBasicBean bean = WsdlUtils.INSTANCE.parse(wsdlUrl).get(0);
			ae.eSet(JbiPackage.Literals.ABSTRACT_ENDPOINT__INTERFACE_NAME, bean.getInterfaceName());
			ae.eSet(JbiPackage.Literals.ABSTRACT_ENDPOINT__SERVICE_NAME, bean.getServiceName());
			ae.eSet(JbiPackage.Literals.ABSTRACT_ENDPOINT__ENDPOINT_NAME, bean.getEndpointName());
			ae.eSet(Jsr181Package.Literals.JSR181_PROVIDES__CLAZZ, serviceNameToClassName.values().iterator().next());

			// Import the WSDL in the project
			IFolder resFolder = project.getFolder( PetalsConstants.LOC_RES_FOLDER );
			File resFile = resFolder.getLocation().toFile();
			Map<String,File> uriToFile = new WsdlImportUtils().importWsdlOrXsdAndDependencies( resFile, wsdlUrl );
			String wsdlName = wsdlUri.toURL().getFile();
			resFolder.refreshLocal( IResource.DEPTH_INFINITE, monitor );

		} catch( PartInitException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );

		} catch( CoreException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );

		} catch( JaxWsException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );

		} catch( IOException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );

		} catch( InterruptedException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );
		} catch (InvocationTargetException e ) {
			PetalsJsr181Plugin.log( e, IStatus.ERROR );
		}
	}

	@Override
	protected void presetServiceValues(AbstractEndpoint endpoint) {
	}

	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesAfterJbi() {
		return null;
	}

	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesAfterProject() {
		return new AbstractSuWizardPage[] {
			new Jsr181ProvidePage()	
		};
	}

	@Override
	protected AbstractSuWizardPage[] getCustomWizardPagesBeforeProject() {
		Exception prereq = validatePrerequisites();
		if (prereq != null) {
			return new AbstractSuWizardPage[] {
				new ErrorPage(prereq)
			};
		} else {
			return null;
		}
	}

	@Override
	protected IStatus importAdditionalFiles(IFolder resourceDirectory, IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}

	@Override
	protected boolean isJavaProject() {
		return true;
	}

	public boolean isWsdlFirst() {
		return wsdlFirst;
	}

	public void setWsdlFirst(boolean wsdlFirst) {
		this.wsdlFirst = wsdlFirst;
	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}
}
