/******************************************************************************
 * Copyright (c) 2009-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/
 
package com.linagora.petals.components.wizards;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;

import com.linagora.petals.components.PetalsComponentsPlugin;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class SharedLibraryNewWizard extends AbstractArtifactNewWizard {

	private IProject project;
	private SharedLibraryNewWizardPage page;


	/**
	 * Constructor.
	 */
	public SharedLibraryNewWizard() {
		super();
		setNeedsProgressMonitor( true );

		setWindowTitle( "New Shared Library" );
		setDefaultPageImageDescriptor( PetalsComponentsPlugin.getImageDescriptor( "icons/wizban/wiz_shared_library.png" ));
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		this.page = new SharedLibraryNewWizardPage ();
		addPage( this.page );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.components.wizards.AbstractArtifactNewWizard
	 * #doFinish(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	void doFinish( IProgressMonitor monitor ) throws Exception {

		monitor.beginTask( "Creating " + this.page.getArtifactName() + "...", IProgressMonitor.UNKNOWN );

		// Create the project
		this.project = ResourcesPlugin.getWorkspace().getRoot().getProject( this.page.getArtifactName());
		URI projectLocationURI = this.page.getProjectLocationURI();
		if( projectLocationURI != null ) {
			IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription( this.page.getArtifactName());
			projectDescription.setLocationURI( projectLocationURI );
			this.project.create( projectDescription, monitor );
		}
		else {
			// ProjectLocation = null => create it in the workspace
			this.project.create( monitor );
		}

		// Copy the template files
		this.project.open( monitor );
		copyTemplate( "templates/shared-library/readme.txt", this.project.getFile( "readme.txt" ), monitor );
		copyTemplate( "templates/shared-library/pom.xml", this.project.getFile( "pom.xml" ), monitor );
		if( this.page.getPetalsContainer() == PetalsContainerVersion.petals3_1 )
			copyTemplate( "templates/shared-library/jbi.xml", this.project.getFile( "src/main/jbi/jbi.xml" ), monitor );
		else
			copyTemplate( "templates/shared-library/jbi.xml", this.project.getFile( "src/main/resources/jbi/jbi.xml" ), monitor );

		monitor.worked( 20 );
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.components.wizards.AbstractArtifactNewWizard
	 * #getProject()
	 */
	@Override
	IProject getProject() {

		if( this.project == null && this.page != null )
			this.project = ResourcesPlugin.getWorkspace().getRoot().getProject( this.page.getArtifactName());

		return this.project;
	}


	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.components.wizards.AbstractArtifactNewWizard
	 * #replaceKeywords(java.lang.String)
	 */
	@Override
	String replaceKeywords( String string ) {

		return string.replace( "{NAME}", this.page.getArtifactName())
				.replace( "{ARTIFACT_ID}", this.page.getArtifactName())
				.replace( "{GROUP_ID}", this.page.getGroupId())
				.replace( "{DESCRIPTION}", this.page.getDescription())
				.replace( "{AUTHOR}", System.getProperty( "user.name" ));
	}
}
