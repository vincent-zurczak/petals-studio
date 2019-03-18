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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.linagora.petals.common.internal.provisional.preferences.PreferencesManager;
import com.linagora.petals.common.internal.provisional.swt.DefaultSelectionListener;
import com.linagora.petals.common.internal.provisional.swt.DefaultTreeContentProvider;
import com.linagora.petals.common.internal.provisional.swt.PhantomText;
import com.linagora.petals.common.internal.provisional.ui.FixedShellTooltip;
import com.linagora.petals.common.internal.provisional.utils.PetalsConstants;
import com.linagora.petals.common.internal.provisional.utils.PlatformUtils;
import com.linagora.petals.common.internal.provisional.utils.StringUtils;
import com.linagora.petals.common.internal.provisional.utils.SwtFactory;
import com.linagora.petals.services.PetalsServicesPlugin;
import com.linagora.petals.services.su.extensions.ExtensionManager;
import com.linagora.petals.services.su.extensions.IComponentDescription;
import com.linagora.petals.services.su.extensions.PetalsKeyWords;
import com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.linagora.petals.services.su.wizards.FinishServiceCreationStrategy;
import com.linagora.petals.services.su.wizards.PetalsMode;

/**
 * Choose the kind of SU to create.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class ChoicePage extends WizardSelectionPage {

	public static final String PAGE_NAME = "ChoicePage";

	private final FinishServiceCreationStrategy strategy;
	private final Image bcImg, seImg, tipImg;

	private Image helpImg;
	private Font boldFont;
	private FixedShellTooltip helpTooltip;


	/**
	 * Constructor.
	 * @param strategy
	 */
	public ChoicePage( FinishServiceCreationStrategy strategy ) {
		super( PAGE_NAME );
		this.strategy = strategy;

		setTitle( "Service Unit Project" );
		setDescription( "Select the Petals component to configure and its version." );

		this.bcImg = PetalsServicesPlugin.loadImage( "icons/obj16/choice_bc_16x16.png" );
		this.seImg = PetalsServicesPlugin.loadImage( "icons/obj16/choice_se_16x16.png" );
		this.tipImg = PetalsServicesPlugin.loadImage( "icons/obj16/smartmode_co.gif" );
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage
	 * #createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl( Composite parent ) {

		// Create the composite container and define its layout
		final Composite container = SwtFactory.createComposite( parent );
		setControl( container );
		SwtFactory.applyNewGridLayout( container, 2, false, 15, 0, 15, 15 );
		SwtFactory.applyHorizontalGridData( container );


		// Add a tool tip to display in case of problem
		this.helpTooltip = new FixedShellTooltip( getShell(), true, 90 ) {
			@Override
			public void populateTooltip( Composite parent ) {

				GridLayout layout = new GridLayout();
				layout.verticalSpacing = 2;
				parent.setLayout( layout );
				parent.setLayoutData( new GridData( GridData.FILL_BOTH ));
				parent.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_LIST_BACKGROUND ));

				try {
					ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin(
								PetalsConstants.PETALS_COMMON_PLUGIN_ID, "icons/petals/thinking_hard.png" );

					if( desc != null )
						ChoicePage.this.helpImg = desc.createImage();

					parent.setBackgroundMode( SWT.INHERIT_DEFAULT );
					Label imgLabel = new Label( parent, SWT.NONE );
					imgLabel.setImage( ChoicePage.this.helpImg );
					imgLabel.setLayoutData( new GridData( SWT.CENTER, SWT.DEFAULT, true, true ));

				} catch( Exception e ) {
					PetalsServicesPlugin.log( e, IStatus.WARNING );
				}

				FontData[] fd = PlatformUtils.getModifiedFontData( getFont().getFontData(), SWT.BOLD );
				ChoicePage.this.boldFont = new Font( getShell().getDisplay(), fd );
				Label titleLabel = new Label( parent, SWT.NONE );
				titleLabel.setFont( ChoicePage.this.boldFont );
				GridData layoutData = new GridData( SWT.CENTER, SWT.DEFAULT, true, true );
				layoutData.verticalIndent = 5;
				titleLabel.setLayoutData( layoutData );
				titleLabel.setText( "What does this error mean?" );

				Label l = new Label( parent, SWT.WRAP );
				l.setText( "This wizard will generate, among other things, Maven artifacts." );
				layoutData = new GridData();
				layoutData.verticalIndent = 8;
				l.setLayoutData( layoutData );

				RowLayout rowLayout = new RowLayout( SWT.HORIZONTAL );
				rowLayout.marginLeft = 0;
				rowLayout.marginTop = 0;
				rowLayout.marginRight = 0;
				rowLayout.marginBottom = 0;
				rowLayout.spacing = 0;

				Composite rowComposite = new Composite( parent, SWT.NONE );
				rowComposite.setLayout( rowLayout );
				rowComposite.setLayoutData( new GridData( SWT.CENTER, SWT.DEFAULT, true, true ));

				new Label( rowComposite, SWT.WRAP ).setText( "Unfortunately, there is a problem with the " );
				Link link = new Link( rowComposite, SWT.WRAP | SWT.NO_FOCUS );
				link.setText( "<A>the Petals Maven preferences</A>" );
				new Label( rowComposite, SWT.WRAP ).setText( "." );
				new Label( parent, SWT.WRAP ).setText( "Please, make them correct." );

				link.addSelectionListener( new DefaultSelectionListener() {
					@Override
					public void widgetSelected( SelectionEvent e ) {
						try {
							PreferencesUtil.createPreferenceDialogOn(
										new Shell(),
										"com.linagora.petals.services.prefs.maven",
										null, null ).open();

						} catch( Exception e1 ) {
							PetalsServicesPlugin.log( e1, IStatus.ERROR );
						}
					}
				});
			}
		};


		// Prepare the input
		Comparator<AbstractServiceUnitWizard> comparator = new Comparator<AbstractServiceUnitWizard>() {
			@Override
			public int compare( AbstractServiceUnitWizard o1, AbstractServiceUnitWizard o2 ) {
				String v1 = o1.getComponentVersionDescription().getComponentVersion();
				String v2 = o2.getComponentVersionDescription().getComponentVersion();
				return - v1.compareTo( v2 ); // negative so that the most recent is first
			}
		};

		final Map<String,Collection<AbstractServiceUnitWizard>> componentNameToHandlers = new TreeMap<> ();
		final Map<String,AbstractServiceUnitWizard> componentIdToHandler = new TreeMap<> ();
		final Map<PetalsKeyWords,Set<String>> keywordToComponentName = new TreeMap<> ();

		for( PetalsMode petalsMode : PetalsMode.values()) {
			for( AbstractServiceUnitWizard handler : ExtensionManager.INSTANCE.findComponentWizards( petalsMode )) {
				for( PetalsKeyWords keyword : handler.getComponentVersionDescription().getKeyWords()) {
					Set<String> list = keywordToComponentName.get( keyword );
					if( list == null )
						list = new TreeSet<> ();

					String componentVersion = handler.getComponentVersionDescription().getComponentVersion();
					String componentName = handler.getComponentVersionDescription().getComponentName();
					list.add( componentName );
					keywordToComponentName.put( keyword, list );

					Collection<AbstractServiceUnitWizard> handlers = componentNameToHandlers.get( componentName );
					if( handlers == null )
						handlers = new TreeSet<>( comparator );

					handlers.add( handler );
					componentNameToHandlers.put( componentName, handlers );
					componentIdToHandler.put( componentName + petalsMode + componentVersion, handler );
				}
			}
		}


		// Add the selection area
		final PhantomText searchText = new PhantomText( container, SWT.SINGLE | SWT.BORDER );
		searchText.setDefaultValue( "Search..." );
		GridDataFactory.swtDefaults().grab( true, false ).align( SWT.FILL, SWT.TOP ).span( 2, 1 ).applyTo( searchText );

		final TreeViewer componentsViewer = new TreeViewer( container, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION );
		GridDataFactory.fillDefaults().span( 2, 1 ).hint( 380, 300 ).applyTo( componentsViewer.getTree());
		componentsViewer.setLabelProvider( new LabelProvider() {
			@Override
			public String getText( Object element ) {

				String result;
				if( element instanceof String ) {

					IComponentDescription desc = componentNameToHandlers.get( element ).iterator().next().getComponentVersionDescription();
					String componentName = desc.getComponentName();
					String componentAlias = desc.getComponentAlias();
					String annotation = desc.getComponentAnnotation();

					StringBuilder sb = new StringBuilder();
					if( StringUtils.isEmpty( componentName ))
						sb.append( componentAlias );	// Generic component
					else
						sb.append( componentAlias + "    -  " + componentName );

					if( ! StringUtils.isEmpty( annotation ))
						sb.append( "    ( " + annotation + " )" );

					result = sb.toString();

				} else {
					result = super.getText( element );
				}

				return result;
			}

			@Override
			public Image getImage( Object element ) {

				Image result = ChoicePage.this.seImg;
				if( PetalsKeyWords.connector.equals( element )
						|| element instanceof String
						&& componentNameToHandlers.get( element ).iterator().next().getComponentVersionDescription().isBc())
					result = ChoicePage.this.bcImg;

				return result;
			}
		});

		componentsViewer.setContentProvider( new DefaultTreeContentProvider() {
			@Override
			public Object[] getElements( Object inputElement ) {
				return keywordToComponentName.keySet().toArray();
			}

			@Override
			public Object[] getChildren( Object parentElement ) {

				Object[] result;
				if( parentElement instanceof PetalsKeyWords ) {
					Collection<String> componentNames = keywordToComponentName.get( parentElement );
					result = componentNames == null ? new Object[ 0 ] : componentNames.toArray();

				} else {
					result = new Object[ 0 ];
				}

				return result;
			}

			@Override
			public boolean hasChildren( Object element ) {
				return element instanceof PetalsKeyWords;
			}
		});

		componentsViewer.addFilter( new ViewerFilter() {
			@Override
			public boolean select( Viewer viewer, Object parentElement, Object element ) {

				boolean result = false;
				String filter = searchText.getTextValue().trim().toLowerCase();
				if( filter.length() == 0 )
					result = true;

				else if( element instanceof PetalsKeyWords ) {
					Set<String> names = keywordToComponentName.get( element );
					if( names != null ) {
						for( String s : names ) {
							if( select( viewer, null, s )) {
								result = true;
								break;
							}
						}
					}
				}

				else if( element instanceof String )
					result = ((String) element).toLowerCase().contains( filter );

				return result;
			}
		});

		componentsViewer.setInput( new Object());
		if( keywordToComponentName.size() > 0 )
			componentsViewer.expandToLevel( keywordToComponentName.keySet().iterator().next(), 1 );


		// Display the available versions
		new Label( container, SWT.NONE ).setText( "Component Version:" );
		final ComboViewer versionCombo = new ComboViewer( container, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY );
		GridData layoutData = new GridData();
		layoutData.widthHint = 130;
		versionCombo.getCombo().setLayoutData( layoutData );
		versionCombo.setContentProvider( new ArrayContentProvider());
		versionCombo.setLabelProvider( new LabelProvider() {
			@Override
			public String getText( Object element ) {
				return ((AbstractServiceUnitWizard) element).getComponentVersionDescription().getComponentVersion();
			}
		});


		// Selection for the mode
		new Label( container, SWT.NONE ).setText( "Component Mode:" );
		final ComboViewer modeCombo = new ComboViewer( container, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY );
		layoutData = new GridData();
		layoutData.widthHint = 130;
		modeCombo.getCombo().setLayoutData( layoutData );
		modeCombo.setContentProvider( new ArrayContentProvider());
		modeCombo.setLabelProvider( new LabelProvider());


		// The description label
		Composite subC = new Composite( container, SWT.NONE );
		GridLayoutFactory.swtDefaults().numColumns( 2 ).margins( 0, 0 ).applyTo( subC );
		GridDataFactory.swtDefaults().indent( 0, 5 ).span( 2, 1 ).applyTo( subC );

		final Label descriptionImgLabel = new Label( subC, SWT.NONE );
		descriptionImgLabel.setImage( this.tipImg );
		descriptionImgLabel.setVisible( false );
		final Label descriptionLabel = new Label( subC, SWT.NONE );


		// Selection listeners
		searchText.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				componentsViewer.refresh();
				if( searchText.getTextValue().trim().length() == 0 )
					componentsViewer.collapseAll();
				else
					componentsViewer.expandAll();
			}
		});


		componentsViewer.addSelectionChangedListener( new ISelectionChangedListener() {
			@Override
			public void selectionChanged( SelectionChangedEvent event ) {

				// Get the selection
				Object o = ((IStructuredSelection) event.getSelection()).getFirstElement();
				Collection<?> input;
				if( o == null || o instanceof PetalsKeyWords )
					input = Collections.emptyList();
				else
					input = componentNameToHandlers.get( o );

				// Default selection - there is always one
				versionCombo.setInput( input );
				versionCombo.getCombo().setVisibleItemCount( input.size() > 0 ? input.size() : 1 );
				if( ! input.isEmpty()) {
					descriptionImgLabel.setVisible( true );
					versionCombo.setSelection( new StructuredSelection( input.iterator().next()));
					versionCombo.getCombo().notifyListeners( SWT.Selection, new Event());

				} else {
					setPageComplete( false );
					setSelectedNode( null );
					descriptionImgLabel.setVisible( false );
					descriptionLabel.setText( "" );
					descriptionLabel.getParent().layout();
				}
			}
		});


		versionCombo.addSelectionChangedListener( new ISelectionChangedListener() {
			@Override
			public void selectionChanged( SelectionChangedEvent event ) {
				AbstractServiceUnitWizard suWizard = (AbstractServiceUnitWizard) ((IStructuredSelection) event.getSelection()).getFirstElement();
				if( suWizard == null )
					return;

				setPageComplete( true );
				List<PetalsMode> supportedModes = new ArrayList<>( 2 );
				if( suWizard.getComponentVersionDescription().isProvide() || suWizard.getComponentVersionDescription().isProxy()) {
					supportedModes.add( PetalsMode.provides );
				}

				if( suWizard.getComponentVersionDescription().isConsume()) {
					supportedModes.add( PetalsMode.consumes );
				}

				PetalsMode currentPetalsMode = (PetalsMode) ((IStructuredSelection) modeCombo.getSelection()).getFirstElement();
				modeCombo.setInput( supportedModes );
				PetalsMode nextPetalsMode = supportedModes.contains( currentPetalsMode ) ? currentPetalsMode : supportedModes.get( 0 );

				modeCombo.setSelection( new StructuredSelection( nextPetalsMode ));
				modeCombo.getCombo().notifyListeners( SWT.Selection, new Event());
			}
		});


		modeCombo.addSelectionChangedListener( new ISelectionChangedListener() {
			@Override
			public void selectionChanged( SelectionChangedEvent event ) {

				// We have the right component and version...
				AbstractServiceUnitWizard suWizard = (AbstractServiceUnitWizard) ((IStructuredSelection) versionCombo.getSelection()).getFirstElement();
				if( suWizard == null )
					return;

				PetalsMode petalsMode = (PetalsMode) ((IStructuredSelection) modeCombo.getSelection()).getFirstElement();
				String desc = petalsMode == PetalsMode.provides ?
						suWizard.getComponentVersionDescription().getProvideDescription()
						: suWizard.getComponentVersionDescription().getConsumeDescription();

				descriptionLabel.setText( desc );
				descriptionLabel.getParent().getParent().layout();

				// ... but not the right mode (and wizard)
				String componentVersion = suWizard.getComponentVersionDescription().getComponentVersion();
				String componentName = suWizard.getComponentVersionDescription().getComponentName();
				String key = componentName + petalsMode + componentVersion;

				suWizard = componentIdToHandler.get( key );
				setSelectedNode( getWizardNode( suWizard ));
			}
		});


		// Initialize
		if( PreferencesManager.isMavenTemplateConfigurationValid())
			this.helpTooltip.hide();

		componentsViewer.getTree().setFocus();
	}


	/**
	 * @param wizard
	 * @return
	 */
	protected IWizardNode getWizardNode(AbstractServiceUnitWizard wizard) {
		wizard.setStrategy( this.strategy );
		return new ComponentWizardDescriptionWizardNode(wizard);
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #dispose()
	 */
	@Override
	public void dispose() {

		this.helpTooltip.dispose();
		if( this.helpImg != null && ! this.helpImg.isDisposed())
			this.helpImg.dispose();

		if( this.seImg != null && ! this.seImg.isDisposed())
			this.seImg.dispose();

		if( this.bcImg != null && ! this.bcImg.isDisposed())
			this.bcImg.dispose();

		if( this.tipImg != null && ! this.tipImg.isDisposed())
			this.tipImg.dispose();

		if( this.boldFont != null && ! this.boldFont.isDisposed())
			this.boldFont.dispose();

		super.dispose();
	}
}
