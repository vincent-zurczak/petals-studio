/****************************************************************************
 *
 * Copyright (c) 2008-2011, EBM WebSourcing
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/

package com.ebmwebsourcing.petals.services.ejb.v12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import com.ebmwebsourcing.commons.jbi.internal.provisional.beans.XmlElement;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.StringUtils;
import com.ebmwebsourcing.petals.services.ejb.Messages;
import com.ebmwebsourcing.petals.services.su.extensions.SuWizardSettings;
import com.ebmwebsourcing.petals.services.su.extensions.WizardConfiguration;
import com.ebmwebsourcing.petals.services.su.wizards.generation.EclipseSuBean;
import com.ebmwebsourcing.petals.services.su.wizards.legacy.swt.AbstractWizardListener;
import com.ebmwebsourcing.petals.services.su.wizards.legacy.swt.FileList;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuPage;

/**
 * Located after the VERSION page.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class EJBCustomSpecificationPage12 extends AbstractSuPage {

	/**
	 * Key for {@link EclipseSuBean}
	 */
	public static final String JEE_LIBS = "JEE_LIBS";

	private FileList ejbFiles;
	private FileList jeeFiles;
	private String wsdlName, className;


	/**
	 * Empty constructor. Required empty to be instantiated by the main plug-in.
	 */
	public EJBCustomSpecificationPage12() {
		super( "EJBCustomSpecificationPage12" );
	}


	/**
	 * Constructor with the page name as argument.
	 * @param pageName
	 */
	public EJBCustomSpecificationPage12( String pageName ) {
		super( pageName );
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.AbstractSuPage
	 * #setBasicFields(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void setBasicFields( String suType, String suTypeVersion, String pluginId ) {

		super.setBasicFields( suType, suTypeVersion, pluginId );
		registerNamespace( "ejb", "http://petals.ow2.org/components/ejb/version-1.2" );
		registerNamespace( "petalsCDK", "http://petals.ow2.org/components/extensions/version-4.0" );
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.pages.AbstractSuPage#
	 * setHelpContextId(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void setHelpContextId( Composite container ) {
		// Nothing.
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.AbstractSuPage
	 * #updatePage(com.ebmwebsourcing.petals.tools.eclipse.su.main.wizards.WizardConfiguration)
	 */
	public void updatePage( WizardConfiguration wizardConfiguration ) {
		// nothing
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.XsdBasedAbstractSuPage
	 * #dialogChanged()
	 */
	@Override
	public boolean validate() {

		// Validate the class
		String error = null;
		if( StringUtils.isEmpty( this.className ))
			error = "You have to define the name of the EJB's remote interface.";
		else if( StringUtils.isEmpty( this.wsdlName ))
			error = "You have to give a name to the WSDL that will be generated.";
		else if( ! this.wsdlName.endsWith( ".wsdl" ))
			error = "The WSDL name must end with the '.wsdl' extension.";

		// Fill-in the next page...
		if( error == null ) {
			IDialogSettings settings = getWizard().getDialogSettings();
			String simpleName = getSimpleClassName( this.className );

			// CXF will take whatever value we put
			// These values are the ones generated by Java to EasyWSDL
			settings.put( SuWizardSettings.SRV_NAME_VALUE, simpleName );
			settings.put( SuWizardSettings.EDPT_NAME_VALUE, simpleName + "Port" );
			settings.put( SuWizardSettings.ITF_NAME_VALUE, simpleName + "PortType" );

			String[] parts = this.className.split( "\\." );
			StringBuilder ns = new StringBuilder( "http://" );
			if( parts.length > 1 ) {
				for( int i=parts.length-2; i>0; i-- )
					ns.append( parts[ i ] + "." );
				ns.append( parts[ 0 ]);
			}

			// CXF 2.2.x also adds a "/" at the end of the name space
			// We assume it is the general behavior of CXF
			ns.append( "/" );

			settings.put( SuWizardSettings.SRV_NS_VALUE, ns.toString());
			settings.put( SuWizardSettings.ITF_NS_VALUE, ns.toString());
		}

		setPageComplete( error == null );
		return error == null;
	}


	/**
	 * @param qualifiedName
	 * @return
	 */
	private String getSimpleClassName( String qualifiedClassName ) {
		String[] parts = qualifiedClassName.split( "\\." );
		return parts[ parts.length - 1 ];
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.AbstractSuPage
	 * #fillInData(com.ebmwebsourcing.petals.tools.eclipse.su.main.wizards.generation.EclipseSuBean)
	 */
	@Override
	public void fillInData( EclipseSuBean suBean ) {

		// Add jar files to the list of files to import.
		for( String fileUrl : this.ejbFiles.getFilePaths( true )) {
			getFileImportManager().registerXmlFileElement( new XmlElement(), fileUrl, "" );
		}

		// Libs for JEE Java2WSDL
		suBean.customObjects.put(JEE_LIBS, this.ejbFiles.getFilePaths(false));

		// Save the class name
		suBean.customObjects.put( "ejbClassName", this.className );

		// Create the WSDL name
		suBean.setCreatedWsdlMarkupValue( this.wsdlName );

		// Save the JBI page data - since it is not shown to the user
		IDialogSettings settings = getWizard().getDialogSettings();
		suBean.setConsume( false );
		suBean.setEndpointName( settings.get( SuWizardSettings.EDPT_NAME_VALUE ));

		suBean.setInterfaceName( settings.get( SuWizardSettings.ITF_NAME_VALUE ));
		suBean.setInterfaceNamespaceUri( settings.get( SuWizardSettings.ITF_NS_VALUE ));

		suBean.setServiceName( settings.get( SuWizardSettings.SRV_NAME_VALUE ));
		suBean.setServiceNamespaceUri( settings.get( SuWizardSettings.SRV_NS_VALUE ));
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage
	 * #createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl( Composite parent ) {

		// Create the composite container and define its layout.
		final Composite container = new Composite( parent, SWT.NONE );

		// Set help link for documentation page.
		setHelpContextId( container );

		GridLayout layout = new GridLayout ();
		layout.marginLeft = layout.marginRight = 5;
		container.setLayout( layout );
		container.setLayoutData( new GridData( GridData.FILL_BOTH ));


		// Business Libraries
		this.ejbFiles = new FileList( null, container, Messages.ejbLibsText );
		this.ejbFiles.setFilterNames( new String[] { "Jar (*.jar)" });
		this.ejbFiles.setFilterExtensions( new String[] { "*.jar" });
		this.ejbFiles.addListener( new AbstractWizardListener () {
			public void valueHasChanged() {
				validate();
			}
		});

		// Server Libraries
		this.jeeFiles = new FileList( null, container, Messages.serverLibsText );
		this.jeeFiles.setFilterNames( new String[] { "Jar (*.jar)" });
		this.jeeFiles.setFilterExtensions( new String[] { "*.jar" });
		this.jeeFiles.addListener( new AbstractWizardListener () {
			public void valueHasChanged() {
				validate();
			}
		});



		// Class browser
		Composite subC = new Composite( container, SWT.NONE );
		subC.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		layout = new GridLayout( 3, false );
		layout.marginHeight = layout.marginWidth = 0;
		layout.marginTop = 10;
		subC.setLayout( layout );

		new Label( subC, SWT.NONE ).setText( "EJB's Remote Interface:" );
		final Text classText = new Text( subC, SWT.SINGLE | SWT.BORDER );
		classText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));

		Button browseButton = new Button( subC, SWT.PUSH );
		browseButton.setText( "Browse..." );
		browseButton.addSelectionListener( new SelectionAdapter() {
			@Override
			public void widgetSelected( SelectionEvent e ) {
				String cName = openClassSelectionDialog();
				if( cName != null ) {
					classText.setText( cName );
					classText.setSelection( cName.length());
				}
			}
		});


		// The WSDL name
		new Label( subC, SWT.NONE ).setText( "WSDL File Name:" );
		final Text wsdlText = new Text( subC, SWT.SINGLE | SWT.BORDER );
		GridData layoutData = new GridData( GridData.FILL_HORIZONTAL );
		layoutData.horizontalSpan = 2;
		wsdlText.setLayoutData( layoutData );
		wsdlText.addModifyListener( new ModifyListener() {
			public void modifyText( ModifyEvent e ) {
				EJBCustomSpecificationPage12.this.wsdlName = wsdlText.getText().trim();
				validate();
			}
		});

		classText.addModifyListener( new ModifyListener() {
			public void modifyText( ModifyEvent e ) {
				EJBCustomSpecificationPage12.this.className = classText.getText().trim();
				String newWsdlName = getSimpleClassName( EJBCustomSpecificationPage12.this.className ) + ".wsdl";
				wsdlText.setText( newWsdlName );
				wsdlText.setSelection( newWsdlName.length());
			}
		});


		// Complete the page
		validate();
		String msg = getErrorMessage();
		if( msg != null ) {
			setErrorMessage( null );
			setMessage( msg, IMessageProvider.INFORMATION );
		}

		setControl( container );
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.AbstractSuPage
	 * #reloadDataFromConfiguration()
	 */
	@Override
	public void reloadDataFromConfiguration() {
		// nothing
	}


	/**
	 * Opens a dialog to select a class contained in the JAR files.
	 * @return the selected class name, or null if CANCEL was clicked
	 */
	private String openClassSelectionDialog() {

		// Get all the classes in the JAR
		List<String> classNames = new ArrayList<String> ();
		List<String> allLibs = new ArrayList<String>();
		allLibs.addAll(Arrays.asList(this.ejbFiles.getFilePaths(false)));
		for( String path : allLibs ) {
			JarFile jarFile;
			try {
				jarFile = new JarFile( path );

			} catch( IOException e ) {
				continue;
			}

			Enumeration<JarEntry> entries = jarFile.entries();
			while( entries.hasMoreElements()) {
				String entryName = entries.nextElement().getName();
				if( entryName.endsWith( ".class" )
							&& ! entryName.contains( "$" )) {
					entryName = entryName.substring( 0, entryName.length() - 6 );
					entryName = entryName.replaceAll( "/", "." );
					classNames.add( entryName );
				}
			}
		}

		// Display them in a dialog
		ElementListSelectionDialog dlg =
					new ElementListSelectionDialog( getShell(), new LabelProvider());

		dlg.setTitle( "Class Selection" );
		dlg.setElements( classNames.toArray());
		dlg.setMessage( "Select the EJB's remote interface" );
		dlg.setFilter( this.className != null ? this.className : "*" );
		dlg.setAllowDuplicates( false );
		dlg.setIgnoreCase( false );
		dlg.setMultipleSelection( false );

		String result = null;
		if( dlg.open() == Window.OK )
			result = (String) dlg.getFirstResult();

		return result;
	}

	public FileList getEJBFiles() {
		return this.ejbFiles;
	}


	public FileList getJEEFiles() {
		return this.jeeFiles;
	}
}
