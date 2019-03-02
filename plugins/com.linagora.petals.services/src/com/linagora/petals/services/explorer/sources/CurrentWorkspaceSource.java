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
 
package com.linagora.petals.services.explorer.sources;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.linagora.petals.common.internal.provisional.utils.JbiXmlUtils;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.explorer.model.ServiceUnitBean;
import com.linagora.petals.services.su.jbiproperties.PetalsSPPropertiesManager;
import com.linagora.petals.services.utils.ServiceProjectRelationUtils;
import com.sun.java.xml.ns.jbi.Jbi;

/**
 * A source looking for end-points in the current workspace.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class CurrentWorkspaceSource extends EndpointSource {

	public CurrentWorkspaceSource() {
		super( "Workspace", "workspace-su-source" );
		this.description = "The Petals services defined in the current workspace.";
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.AbstractSuSource
	 * #dispose()
	 */
	@Override
	public void dispose() {
		// nothing
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.sources.EndpointSource
	 * #refreshServiceUnits(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected Collection<ServiceUnitBean> refreshServiceUnits( IProgressMonitor monitor ) {

		if( monitor == null )
			monitor = new NullProgressMonitor();

		List<ServiceUnitBean> suBeans = new ArrayList<ServiceUnitBean>();
		for( IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				if( ! project.isAccessible()
							|| ! ServiceProjectRelationUtils.isSuProject( project ))
					continue;

				monitor.worked( 1 );
				Jbi jbi;
				try {
					jbi = JbiXmlUtils.getJbiXmlModel( project );
				} catch( Exception e ) {
					continue;
				}

				if( jbi.getServices() == null )
					continue;

				ServiceUnitBean suBean = new ServiceUnitBean();
				suBean.setSource( this );
				suBean.setJbiXmlLocation( jbi.eResource().getURI().toFileString());
				suBean.setServiceUnitName( project.getName());

				Properties projectProperties = PetalsSPPropertiesManager.getProperties( project );
				suBean.setComponentName( projectProperties.getProperty( PetalsSPPropertiesManager.COMPONENT_DEPLOYMENT_ID ));

				getEndpointBeans( jbi, suBean );
				if( suBean.getEndpoints().size() > 0 )
					suBeans.add( suBean );

				jbi = null;

			} catch( Exception e ) {
				PetalsServicesPlugin.log( e, IStatus.WARNING, "Invalid jbi.xml located in " + project.getName() + "." );
			}
		}

		return suBeans;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.explorer.sources.EndpointSource
	 * #getWsdlContainerLocation(com.linagora.petals.services.explorer.model.ServiceUnitBean)
	 */
	@Override
	public String getWsdlContainerLocation( ServiceUnitBean suBean ) {

		String jbiXmlLocation = suBean.getJbiXmlLocation();
		if( jbiXmlLocation == null )
			return "";

		// Case simple project: the WSDL is in the resources folder
		File f = new File( jbiXmlLocation ).getParentFile();
		if( "META-INF".equals( f.getName()))
			return new File( f.getParentFile(), "resources" ).getAbsolutePath();

		// Case Maven project: the WSDL is in the same folder
		return f.getAbsolutePath();
	}
}
