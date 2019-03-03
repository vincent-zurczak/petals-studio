/******************************************************************************
 * Copyright (c) 2011-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 		Linagora - initial API and implementation
 *******************************************************************************/

package com.linagora.petals.common.internal.provisional.emf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.edit.EditingDomainEObjectObservableValue;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.linagora.petals.common.internal.Messages;
import com.linagora.petals.common.internal.provisional.utils.StringUtils;
import com.linagora.petals.common.internal.provisional.utils.SwtFactory;

/**
 * @author Mickael Istria - EBM WebSourcing
 */
public final class EObjectUIHelper {

	/**
	 * Private constructor for utility class.
	 */
	private EObjectUIHelper() {
		// nothing
	}


	/**
	 * A validator for mandatory fields.
	 */
	private static final class MandatoryFieldValidator implements IValidator {
		private final EStructuralFeature feature;

		/**
		 * Constructor.
		 * @param feature
		 */
		public MandatoryFieldValidator(EStructuralFeature feature) {
			this.feature = feature;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.core.databinding.validation.IValidator
		 * #validate(java.lang.Object)
		 */
		@Override
		public IStatus validate( Object value ) {

			IStatus result = ValidationStatus.ok();
			if( value instanceof String && StringUtils.isEmpty((String) value)) {
				String label = StringUtils.camelCaseToHuman( this.feature.getName());
				label = StringUtils.capitalize( label );
				result = ValidationStatus.error( NLS.bind( Messages.fieldNotSet, label ));
			}

			return result;
		}
	}


	/**
	 * An entry description.
	 */
	public static class EntryDescription {
		public Object widget;
		public EAttribute attribute;

		/**
		 * Constructor.
		 * @param widget
		 * @param att
		 */
		public EntryDescription(Object widget, EAttribute att) {
			this.widget = widget;
			this.attribute = att;
		}
	}


	/**
	 * Generates a 2 column list with left column containing description of widgets and right column containing widget.
	 * @param eObject the eObject to edit
	 * @param toolkit a {@link FormToolkit} to create widgets
	 * @param parent
	 * @param domain the {@link EditingDomain} in case of transactional edition. Can be null, then no transaction is used.
	 * @param dbc
	 * @param toProcessFeatures list of features to edit.
	 * @return
	 */
	public static List<EntryDescription> generateWidgets(
			EObject eObject,
			FormToolkit toolkit,
			Composite parent,
			EditingDomain domain,
			DataBindingContext dbc,
			boolean showDecorator,
			EStructuralFeature... toProcessFeatures ) {

		return generateWidgets(
				eObject, toolkit, null,
				parent, domain, dbc, showDecorator, toProcessFeatures );
	}


	/**
	 * Generates a 2 column list with left column containing description of widgets and right column containing widget.
	 * @param eObject the eObject to edit
	 * @param toolkit a {@link FormToolkit} to create widgets
	 * @param parent
	 * @param domain the {@link EditingDomain} in case of transactional edition. Can be null, then no transaction is used.
	 * @param dbc
	 * @param toProcessFeatures list of features to edit.
	 * @return
	 */
	public static List<EntryDescription> generateEditorWidgets(
			EObject eObject,
			FormToolkit toolkit,
			Composite parent,
			EditingDomain domain,
			DataBindingContext dbc,
			boolean showDecorator,
			EStructuralFeature... toProcessFeatures ) {

		return generateWidgets(
				eObject, toolkit, parent.getDisplay().getSystemColor( SWT.COLOR_DARK_BLUE ),
				parent, domain, dbc, showDecorator, toProcessFeatures );
	}


	/**
	 * Generates a 2 column list with left column containing description of widgets and right column containing widget.
	 * @param eObject the eObject to edit
	 * @param toolkit a {@link FormToolkit} to create widgets
	 * @param labelColor the foreground color for the label
	 * @param parent
	 * @param domain the {@link EditingDomain} in case of transactional edition. Can be null, then no transaction is used.
	 * @param dbc
	 * @param toProcessFeatures list of features to edit.
	 * @return
	 */
	public static List<EntryDescription> generateWidgets(
			EObject eObject,
			FormToolkit toolkit,
			Color labelColor,
			Composite parent,
			EditingDomain domain,
			DataBindingContext dbc,
			boolean showDecorator,
			EStructuralFeature... toProcessFeatures ) {

		Map<EStructuralFeature,String> map = new LinkedHashMap<EStructuralFeature,String> ();
		for( EStructuralFeature feature : toProcessFeatures )
			map.put( feature, null );

		List<EntryDescription> entries = produceWidgets( toolkit, labelColor, parent, map );
		setUpDatabinding( eObject, domain, dbc, showDecorator, entries );
		return entries;
	}


	/**
	 * Generates a 2 column list with left column containing description of widgets and right column containing widget.
	 * @param eObject the eObject to edit
	 * @param toolkit a {@link FormToolkit} to create widgets
	 * @param labelColor the foreground color for the label
	 * @param parent
	 * @param domain the {@link EditingDomain} in case of transactional edition. Can be null, then no transaction is used.
	 * @param dbc
	 * @param toProcessFeatures list of features to edit.
	 * @return
	 */
	public static List<EntryDescription> generateWidget(
			EObject eObject,
			FormToolkit toolkit,
			Composite parent,
			EditingDomain domain,
			DataBindingContext dbc,
			boolean showDecorator,
			EStructuralFeature feature,
			String labelText ) {

		Map<EStructuralFeature,String> map = new LinkedHashMap<EStructuralFeature,String> ();
		map.put( feature, labelText );

		Color labelColor = parent.getDisplay().getSystemColor( SWT.COLOR_DARK_BLUE );
		List<EntryDescription> entries = produceWidgets( toolkit, labelColor, parent, map );
		setUpDatabinding( eObject, domain, dbc, showDecorator, entries );
		return entries;
	}


	/**
	 * Sets up the data binding.
	 * @param eObject
	 * @param domain
	 * @param dbc
	 * @param entries
	 */
	private static void setUpDatabinding(
			EObject eObject,
			EditingDomain domain,
			DataBindingContext dbc,
			boolean showDecorator,
			List<EntryDescription> entries ) {

		for( EntryDescription entry : entries ) {
			IObservableValue widgetObservable = null;
			if( entry.widget instanceof Text )
				widgetObservable = SWTObservables.observeDelayedValue( 300, SWTObservables.observeText((Text) entry.widget, SWT.Modify ));

			else if( entry.widget instanceof StyledText )
				widgetObservable = SWTObservables.observeDelayedValue( 300, SWTObservables.observeText((StyledText) entry.widget, SWT.Modify ));

			else if( entry.widget instanceof Spinner )
				widgetObservable = SWTObservables.observeSelection((Spinner) entry.widget);

			else if( entry.widget instanceof ISelectionProvider )
				widgetObservable = ViewersObservables.observeSingleSelection((ISelectionProvider) entry.widget);

			else if( entry.widget instanceof Button )
				widgetObservable = SWTObservables.observeSelection((Button) entry.widget);

			if( widgetObservable != null ) {
				UpdateValueStrategy targetToModel = new UpdateValueStrategy();
				if( entry.attribute.getLowerBound() > 0 )
					targetToModel.setBeforeSetValidator( new MandatoryFieldValidator( entry.attribute ));

				IObservableValue iov = domain == null ?
						EMFObservables.observeValue( eObject, entry.attribute )
						// : EMFEditObservables.observeValue( domain, eObject, entry.attribute );
						: createCustomEmfEditObservable( domain, eObject, entry.attribute );

				Binding binding;
				if( domain == null )
					binding = dbc.bindValue( widgetObservable, iov, targetToModel, null );
				else
					binding = dbc.bindValue( widgetObservable, iov );

				if( showDecorator && entry.attribute.getLowerBound() > 0 )
					ControlDecorationSupport.create( binding, SWT.TOP | SWT.LEFT );
			}
		}
	}


	/**
	 * Creates an observable using an editing domain.
	 * <p>
	 * This method is a workaround for SetCommands (EMF version <2.7.1).
	 * Keep it, even if it is not used.
	 * </p>
	 *
	 * @param domain
	 * @param eo
	 * @param ea
	 * @return an IObservable value
	 * TODO: replace this method by EMFEditObservables as soon as EMF 2.8.0 or 2.7.2 is out
	 * @See https://bugs.eclipse.org/bugs/show_bug.cgi?id=356291
	 * @See https://bugs.eclipse.org/bugs/show_bug.cgi?id=359043
	 */
	public static IObservableValue createCustomEmfEditObservable( EditingDomain domain, final EObject eo, final EAttribute ea ) {

		return new EditingDomainEObjectObservableValue( domain, eo, ea ) {
			 @Override
			  protected void doSetValue( final Object value ) {
			    Command command = createCustomSetCommand( this.domain, eo, ea, value );
			    this.domain.getCommandStack().execute( command );
			  }
		};
	}


	/**
	 * Creates a custom set command to use with model extensions.
	 * @param domain
	 * @param eo
	 * @param ea
	 * @param value
	 * @return a custom set command (with less checks)
	 * TODO: replace this method by the real SetCommand as soon as EMF 2.8.0 or 2.7.2 is out
	 * @See https://bugs.eclipse.org/bugs/show_bug.cgi?id=356291
	 * @See https://bugs.eclipse.org/bugs/show_bug.cgi?id=359043
	 */
	public static Command createCustomSetCommand( final EditingDomain domain, final EObject eo, final EAttribute ea, final Object value ) {

		return new AbstractOverrideableCommand( domain, "MySetCommand" ) {
			private Object oldValue;

			@Override
			public void doExecute() {
				this.oldValue = eo.eGet( ea );
				eo.eSet( ea, value );
			}

			@Override
			public void doUndo() {
				eo.eSet( ea, this.oldValue );
			}

			@Override
			public void doRedo() {
				execute();
			}

			@Override
			public boolean doCanExecute() {
				return true;
			}
		};
	}


	/**
	 * Produces the widgets.
	 * @param toolkit
	 * @param parent
	 * @param featuresToLabels
	 * @return
	 */
	private static List<EntryDescription> produceWidgets(
			FormToolkit toolkit,
			Color labelColor,
			Composite parent,
			Map<EStructuralFeature,String> featuresToLabels ) {

		List<EntryDescription> entries = new ArrayList<EntryDescription> ();
		for( Map.Entry<EStructuralFeature,String> entry : featuresToLabels.entrySet()) {
			Object widget = null;
			EAttribute attr = (EAttribute) entry.getKey();
			String label = entry.getValue();

			// The label
			// TODO leverage ExtendedMetaData.INSTANCE for tool tip and label
			if( label == null ) {
				label = StringUtils.camelCaseToHuman( attr.getName());
				label = StringUtils.capitalize( label );
				if( attr.getLowerBound() > 0)
					label += " *";
				label += ":";
			}

			Label labelWidget = toolkit.createLabel( parent, label );
			labelWidget.setBackground(parent.getBackground());
			if( labelColor != null )
				labelWidget.setForeground( labelColor );


			// The widget
			Class<?> instanceClass = attr.getEType().getInstanceClass();
			if (instanceClass.equals( String.class )) {

				String lowered = label.toLowerCase();
				if( lowered.contains( "password" ) || lowered.contains( "passphrase" ))
					widget = SwtFactory.createPasswordField( parent, false ).getText();

				else if( lowered.contains( "folder" ) || lowered.contains( "directory" ))
					widget = SwtFactory.createDirectoryBrowser( parent ).getText();

				else
					widget = toolkit.createText(parent, "", SWT.BORDER);

				((Text)widget).setLayoutData(new GridData( GridData.FILL_HORIZONTAL ));

			} else if (instanceClass.equals(Integer.class) || instanceClass.equals(int.class)) {
				widget = new Spinner(parent, SWT.BORDER);
				GridDataFactory.swtDefaults().hint( 100, SWT.DEFAULT ).minSize( 100, SWT.DEFAULT ).applyTo((Spinner) widget);
				((Spinner) widget).setMaximum( Integer.MAX_VALUE );

			} else if (instanceClass.isEnum()) {
				widget = new ComboViewer(parent, SWT.READ_ONLY | SWT.FLAT);
				ComboViewer viewer = (ComboViewer) widget;
				viewer.setContentProvider(new EEnumLiteralsProvider());
				viewer.setLabelProvider(new EEnumNameLabelProvider());
				viewer.setInput(attr.getEType());
				viewer.getCombo().setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));

			} else if (instanceClass.equals(Boolean.class) || instanceClass.equals(boolean.class)) {
				widget = new ComboViewer(parent, SWT.READ_ONLY | SWT.FLAT);
				ComboViewer viewer = (ComboViewer) widget;
				viewer.setContentProvider( new ArrayContentProvider());
				viewer.setLabelProvider(new LabelProvider());
				viewer.setInput( new Boolean[] { Boolean.TRUE, Boolean.FALSE });

				Combo combo = ((ComboViewer) widget).getCombo();
				GridDataFactory.swtDefaults().hint( 100, SWT.DEFAULT ).minSize( 100, SWT.DEFAULT ).applyTo( combo );
			}

			if( widget != null )
				entries.add( new EntryDescription(widget, attr));
		}

		return entries;
	}
}
