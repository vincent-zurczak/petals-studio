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

package com.ebmwebsourcing.petals.services.su.wizards.pages;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormText;

import com.ebmwebsourcing.petals.common.internal.provisional.swt.LinkWithImageComposite;
import com.ebmwebsourcing.petals.common.internal.provisional.swt.TextWithButtonComposite;
import com.ebmwebsourcing.petals.common.internal.provisional.ui.StyledElementListSelectionDialog;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.StringUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.SwtFactory;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlUtils;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.WsdlUtils.JbiBasicBean;
import com.ebmwebsourcing.petals.services.PetalsServicesPlugin;
import com.ebmwebsourcing.petals.services.su.Messages;
import com.ebmwebsourcing.petals.services.su.extensions.SuWizardSettings;
import com.ebmwebsourcing.petals.services.utils.PCStyledLabelProvider;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * JBI page to "provide" a Petals service.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class JbiProvidePage extends JbiAbstractPage {

	protected String wsdlUrl, wsdlParsingError;
	protected boolean importWsdl = true;

	private LinkWithImageComposite wsdlHelper;
	private ControlDecoration wsdlTextDecoration;
	private List<JbiBasicBean> jbiBasicBeans;


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #getDescription()
	 */
	@Override
	public String getDescription() {

		this.jbiBasicBeans = new ArrayList<WsdlUtils.JbiBasicBean> ();
		if( getWizard().getComponentVersionDescription().isBc())
			return "Define the JBI identifier of the resource to expose as a Petals service.";
		else
			return "Define the JBI identifier of the Petals service to create.";
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.tools.eclipse.su.main.pages.AbstractJbiPage
	 * #createCustomControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createCustomControls( Composite container ) {

		if( getWizard().getSettings().showWsdl)
			addWsdlBrowser( container );

		createCommonControls( container, 20 );
		createAutoGenerationWidget( container );
		createExplanationBox( container );
	}


	/**
	 * Shows an explanation text.
	 * @param container
	 */
	private void createExplanationBox( Composite container ) {

		FormText ft = new FormText( container, SWT.BORDER | SWT.WRAP );
		ft.marginWidth = 7;
		ft.marginHeight = 7;
		GridData layoutData = new GridData( GridData.FILL_HORIZONTAL );
		layoutData.horizontalSpan = 2;
		layoutData.verticalIndent = 30;
		layoutData.widthHint = 380;
		layoutData.heightHint = 100;
		ft.setLayoutData( layoutData );

		ft.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_INFO_BACKGROUND ));
		ft.setImage( "tip", this.tipImage );

		StringBuilder sb = new StringBuilder();
		sb.append( "<form>" );
		sb.append( "<p><img href=\"tip\" /> <b>Auto Generated End-points</b></p>" );
		sb.append( "<p>End-points that are generated at deployment time allow to " );
		sb.append( "instantiate several services from a single Service Unit." );
		sb.append( "These services will have the same behavior, same interface, same service name, " );
		sb.append( "but they will have a different identifier.</p>" );
		sb.append( "</form>" );

		ft.setText( sb.toString(), true, false );
	}


	/**
	 * The widgets to indicate to the user that he can choose "auto-generation" for the SU end-point.
	 * @param container
	 */
	private void createAutoGenerationWidget( Composite container ) {

		// Add the button asking if we should generate the end-point.
		new Label( container, SWT.NONE ).setText( "" ); //$NON-NLS-1$
		Button endpointAutoGenerated = SwtFactory.createCheckBoxButton( container, Messages.ProvideJbiPage_8, Messages.ProvideJbiPage_9, false );
		endpointAutoGenerated.addSelectionListener( new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Button button = (Button) e.widget;
				if( button.getSelection()) {	// button is checked
					JbiProvidePage.this.edptText.setEnabled( false );
					getNewlyCreatedEndpoint().setEndpointName( getWizard().getComponentVersionDescription().getAutoGeneratedEndpointValue());
				}
				else {	// button is not checked
					JbiProvidePage.this.edptText.setEnabled( true );
					getNewlyCreatedEndpoint().setEndpointName( JbiProvidePage.this.edptText.getText());
				}

				validate();
			}
		});
	}


	/**
	 * Adds the WSDL browser in the page (case: looking for the WSDL on the hard drive).
	 * @param table
	 */
	private void addWsdlBrowser( final Composite table ) {

		// The WSDL helper
		SwtFactory.createLabel( table, "", null );
		this.wsdlHelper = SwtFactory.createDecoredLink( table, "", this.tipImage );
		SwtFactory.applyHorizontalGridData( this.wsdlHelper );
		this.wsdlHelper.setVisible( false );
		this.wsdlHelper.getLink().addSelectionListener(  new SelectionListener() {
			@Override
			public void widgetSelected( SelectionEvent e ) {
				widgetDefaultSelected( e );
			}

			@Override
			public void widgetDefaultSelected( SelectionEvent e ) {
				PCStyledLabelProvider lp = new PCStyledLabelProvider( getControl());
				StyledElementListSelectionDialog dlg = new StyledElementListSelectionDialog( getShell(), lp );

				dlg.setFilter( "*" );
				dlg.setSize( 120, 20 );
				dlg.setMultipleSelection( false );
				dlg.setTitle( "Service Selection" );
				dlg.setMessage( "Select the service to expose inside Petals." );
				dlg.setElements( JbiProvidePage.this.jbiBasicBeans.toArray());

				if( dlg.open() == Window.OK ) {
					JbiBasicBean bean = (JbiBasicBean) dlg.getResult()[ 0 ];
					JbiProvidePage.this.itfQText.setValue( bean.getInterfaceName());
					JbiProvidePage.this.srvQText.setValue( bean.getServiceName());
					JbiProvidePage.this.edptText.setText( bean.getEndpointName() != null ? bean.getEndpointName() : "" );
				}

				lp.dispose();
			}
		});


		// Create the browser
		SwtFactory.createLabel( table, Messages.ProvideJbiPage_13, "The service description file" );
		TextWithButtonComposite wsdlBrowser = SwtFactory.createFileBrowser( table, false, true, "WSDL" );
		wsdlBrowser.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		wsdlBrowser.getText().addModifyListener( new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				JbiProvidePage.this.wsdlUrl = ((Text) e.widget).getText().trim();
				validate ();
			}
		});


		// Import the WSDL
		SwtFactory.createLabel( table, "", null );
		Button wsdlImportButton = SwtFactory.createCheckBoxButton( table, "Import the WSDL in the project to create", null, this.importWsdl );
		wsdlImportButton.addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected( SelectionEvent e ) {
				widgetDefaultSelected( e );
			}

			@Override
			public void widgetDefaultSelected( SelectionEvent e ) {
				JbiProvidePage.this.importWsdl = ((Button) e.widget).getSelection();
			}
		});


		// Add a decoration on the text.
		this.wsdlTextDecoration = new ControlDecoration( wsdlBrowser.getText(), SWT.LEFT | SWT.BOTTOM );
		this.wsdlTextDecoration.setImage( PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJS_ERROR_TSK ));
		this.wsdlTextDecoration.hide();


		// Add listeners
		wsdlBrowser.addKeyListener( new KeyAdapter () {
			@Override
			public void keyPressed( KeyEvent e ) {
				if( e.character == SWT.CR
							|| e.character == SWT.LF
							|| e.character == SWT.TAB
							|| e.keyCode == SWT.KEYPAD_CR ) {
					runWsdlParsing();
				}
			}
		});

		wsdlBrowser.getButton().addSelectionListener( new SelectionListener() {
			@Override
			public void widgetSelected( SelectionEvent e ) {
				runWsdlParsing();
			}

			@Override
			public void widgetDefaultSelected( SelectionEvent e ) {
				runWsdlParsing();
			}
		});
	}


	/**
	 * Runs the WSDL parsing and updates the WSDL text decoration.
	 * @param wsdlUrl the URL of the WSDL to parse
	 */
	private void runWsdlParsing() {

		// The runnable
		IRunnableWithProgress wsdlParsingOperation = new IRunnableWithProgress() {
			@Override
			public void run( IProgressMonitor monitor ) throws InvocationTargetException {

				monitor.beginTask( Messages.ProvideJbiPage_24, 2 );
				monitor.worked( 1 );
				JbiProvidePage.this.wsdlParsingError = null;
				try {
					JbiProvidePage.this.jbiBasicBeans.clear();
					JbiProvidePage.this.jbiBasicBeans.addAll( WsdlUtils.INSTANCE.parse( JbiProvidePage.this.wsdlUrl ));
					if( JbiProvidePage.this.jbiBasicBeans.isEmpty())
						JbiProvidePage.this.wsdlParsingError = "The WSDL does not contain any service desription.";

				} catch( IllegalArgumentException e1 ) {
					JbiProvidePage.this.wsdlParsingError = "The WSDL URI is invalid.";

				} catch( InvocationTargetException e1 ) {
					JbiProvidePage.this.wsdlParsingError = Messages.ProvideJbiPage_25;

				} finally {
					monitor.done();
				}
			}
		};


		// Run it
		try {
			getContainer().run( true, false, wsdlParsingOperation );

		} catch( Exception e ) {
			PetalsServicesPlugin.log( e, IStatus.ERROR );
		}


		// Update the UI
		JbiProvidePage.this.wsdlTextDecoration.setDescriptionText( this.wsdlParsingError );
		if( this.wsdlParsingError == null )
			JbiProvidePage.this.wsdlTextDecoration.hide();
		else
			JbiProvidePage.this.wsdlTextDecoration.show();

		int size = this.jbiBasicBeans.size();
		if( size > 1 )
			this.wsdlHelper.getLink().setText( "<A>Select another service</A> in the WSDL" + " (" + size + " available)" );
		else if( size == 1 )
			this.wsdlHelper.getLink().setText( "<A>Restore from the WSDL values</A>" + " (" + size + " service available)" );

		this.wsdlHelper.setVisible( size > 0 );
		this.wsdlHelper.layout();

		if( this.jbiBasicBeans.size() > 0 ) {
			JbiBasicBean bean = this.jbiBasicBeans.get( 0 );
			this.itfQText.setValue( bean.getInterfaceName());
			this.srvQText.setValue( bean.getServiceName());
			this.edptText.setText( bean.getEndpointName() != null ? bean.getEndpointName() : "" );
		}
	}


	/*
	 * (non-Javadoc)
	 * @see com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuPage
	 * #validate()
	 */
	@Override
	public boolean validate() {
		setMessage( null );

		// WSDL URL
		if( this.wsdlTextDecoration != null && this.wsdlTextDecoration.isVisible()) {
			updateStatus( Messages.ProvideJbiPage_31 );
			return false;
		}

		// Interface name
		AbstractEndpoint ae = getNewlyCreatedEndpoint();
		SuWizardSettings settings = getWizard().getSettings();
		if( settings.validateInterface && ae.getInterfaceName() == null ) {
			updateStatus( "You have to provide the interface name." );
			return false;
		}

		// Service name
		if( settings.validateServiceName && ae.getServiceName() == null ) {
			updateStatus( "You have to provide the service name." );
			return false;
		}

		// End-point name
		if( settings.validateEndpointName && StringUtils.isEmpty( ae.getEndpointName())) {
			updateStatus( Messages.ProvideJbiPage_37 );
			return false;
		}

		// Update data
		updateStatus( null );
		return true;
	}


	/**
	 * @return the importWsdl
	 */
	public boolean isImportWsdl() {
		return this.importWsdl;
	}


	/**
	 * @return the wsdlUrl
	 */
	public String getWsdlUrl() {
		return this.wsdlUrl;
	}


	/**
	 * @return
	 */
	public String getWsdlFileName() {
		String[] segments = this.wsdlUrl.split("/");
		return segments[segments.length - 1];
	}
}
