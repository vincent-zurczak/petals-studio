/******************************************************************************
 * Copyright (c) 2008-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.services.su.wizards.pages;

import javax.xml.namespace.QName;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.linagora.petals.common.internal.provisional.utils.StringUtils;
import com.linagora.petals.common.internal.provisional.utils.SwtFactory;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.su.extensions.SuWizardSettings;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/**
 * The abstract wizard page showing JBI standard fields.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class JbiAbstractPage extends AbstractSuWizardPage {

	public static final String PAGE_NAME = "JbiPage";
	protected static final String REQUIRED = " *";

	protected Text itfText, itfNsText, srvText, srvNsText, edptText;
	protected Image tipImage;
	protected Color yellowColor;
	protected String labelSuffix = REQUIRED;


	/**
	 * Constructor.
	 * @param suType the component type used by the SU (e.g. FTP, XSLT...).
	 * @param suTypeVersion the version of the Petals component used by the SU.
	 */
	public JbiAbstractPage() {
		super( PAGE_NAME );
		this.tipImage = PetalsServicesPlugin.loadImage( "icons/obj16/smartmode_co.gif" );
		this.yellowColor = new Color( Display.getCurrent(), 255, 255, 225 );
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #dispose()
	 */
	@Override
	public void dispose() {

		if( this.tipImage != null && ! this.tipImage.isDisposed())
			this.tipImage.dispose();

		if( this.yellowColor != null && ! this.yellowColor.isDisposed())
			this.yellowColor.dispose();

		super.dispose();
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public final void createControl( Composite parent ) {

		// Container
		final Composite container = SwtFactory.createComposite( parent );
		setControl( container );
		SwtFactory.applyNewGridLayout( container, 2, false, 10, 15, 0, 15 );
		SwtFactory.applyHorizontalGridData( container );

		// Set the page description
		setDescription( getDescription());

		// Create controls in the form.
		createCustomControls( container );
	}


	/**
	 * This method defines the controls to add in the page.
	 * <p>
	 * It should use {@link JbiAbstractPage#createCommonControls(Composite)}
	 * </p>
	 *
	 * @param container the parent container with a two-column layout
	 */
	protected abstract void createCustomControls( Composite container );


	/**
	 * Create JBI common controls (service, interface and end-point names).
	 * @param parent the parent
	 * @param marginTop the margin above the first widget.
	 */
	protected void createCommonControls( Composite container, int marginTop ) {

		// Interface name
		SuWizardSettings settings = getWizard().getSettings();
		Label l = SwtFactory.createLabel( container, "Interface Name" + REQUIRED + ":", "The qualified name of the service contract" );
		SwtFactory.applyGridData( l, 1, 20 );

		// If there is no WSDL, it is necessary to use the same namespace (at least for SOAP).
		// So, let's use the same here.
		this.itfText = SwtFactory.createSimpleTextField( container, true );
		SwtFactory.applyHorizontalGridData( this.itfText, 1, 20 );

		SwtFactory.createLabel( container, "Interface Namespace" + REQUIRED + ":", "The namespace of the service contract" );
		this.itfNsText = SwtFactory.createSimpleTextField( container, true );

		if( ! settings.activateInterfaceName ) {
			this.itfText.setEditable( false );
			this.itfNsText.setEditable( false );
		}

		ModifyListener itfListener = new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				QName qn = new QName( JbiAbstractPage.this.itfNsText.getText(), JbiAbstractPage.this.itfText.getText());
				getNewlyCreatedEndpoint().setInterfaceName( qn );
				validate();
			}
		};

		this.itfText.addModifyListener( itfListener );
		this.itfNsText.addModifyListener( itfListener );


		// Service name
		l = SwtFactory.createLabel( container, "Service Name" + this.labelSuffix + ":", "The qualified name of the service implementation" );
		SwtFactory.applyGridData( l, 1, marginTop );

		this.srvText = SwtFactory.createSimpleTextField( container, true );
		SwtFactory.applyHorizontalGridData( this.srvText, 1, marginTop );

		SwtFactory.createLabel( container, "Service Namespace" + this.labelSuffix + ":", "The namespace of the service implementation" );
		this.srvNsText = SwtFactory.createSimpleTextField( container, true );

		if( ! settings.activateServiceName ) {
			this.srvText.setEditable( false );
			this.srvNsText.setEditable( false );
		}

		if( settings.activateServiceNameOnly )
			this.srvNsText.setEditable( false );

		ModifyListener srvListener = new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				if( ! ((Text) e.widget).isEnabled())
					return;

				QName qn = new QName( JbiAbstractPage.this.srvNsText.getText(), JbiAbstractPage.this.srvText.getText());
				getNewlyCreatedEndpoint().setInterfaceName( qn );
				validate();
			}
		};

		this.srvText.addModifyListener( srvListener );
		this.srvNsText.addModifyListener( srvListener );


		// End-point name
		l = SwtFactory.createLabel( container, "End-point Name" + this.labelSuffix + ":", "The name of the service deployment point" );
		SwtFactory.applyGridData( l, 1, marginTop );

		this.edptText = SwtFactory.createSimpleTextField( container, true );
		SwtFactory.applyHorizontalGridData( this.edptText, 1, marginTop );

		if( ! settings.activateEndpointName )
			this.edptText.setEditable( false );

		this.edptText.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				if( ! ((Text) e.widget).isEnabled())
					return;

				String edpt = JbiAbstractPage.this.edptText.getText();
				if( StringUtils.isEmpty( edpt ))
					edpt = null;

				getNewlyCreatedEndpoint().setEndpointName( edpt );
				validate();
			}
		});


		// Initialize
		this.itfText.setText( "Interface" );
		this.itfNsText.setText( "http://your.Namespace" );

		this.srvText.setText( "Interface" );
		this.srvNsText.setText( "http://your.Namespace" );
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #setVisible(boolean)
	 */
	@Override
	public void setVisible( boolean visible ) {

		// Update the UI
		if( visible ) {
			AbstractEndpoint ae = getNewlyCreatedEndpoint();
			if( ae.getInterfaceName() != null ) {
				this.itfText.setText( ae.getInterfaceName().getLocalPart() != null ? ae.getInterfaceName().getLocalPart() : "" );
				this.itfNsText.setText( ae.getInterfaceName().getNamespaceURI() != null ? ae.getInterfaceName().getNamespaceURI() : "" );
			}

			if( ae.getServiceName() != null ) {
				this.srvText.setText( ae.getServiceName().getLocalPart() != null ? ae.getServiceName().getLocalPart() : "" );
				this.srvNsText.setText( ae.getServiceName().getNamespaceURI() != null ? ae.getServiceName().getNamespaceURI() : "" );
			}

			String edpt = ae.getEndpointName();
			if( edpt != null
					&& ! getWizard().getComponentVersionDescription().getAutoGeneratedEndpointValue().equals( edpt ))
				this.edptText.setText( edpt == null ? "" : edpt );

			String errorMsg = getErrorMessage();
			if( errorMsg != null ) {
				setMessage( errorMsg, IMessageProvider.INFORMATION );
				setErrorMessage( null );
			}

			setPageComplete( errorMsg == null );
		}

		// Call to super
		super.setVisible( visible );
	}
}
