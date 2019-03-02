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

package com.linagora.petals.common.internal.provisional.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.linagora.petals.common.internal.provisional.utils.SwtFactory;

/**
 * A text widget designed to sit next to {@link QNameText}s.
 * <p>
 * We use {@link StyledText} because some OS draw borders around native widgets like Texts.
 * Styled texts are not native widgets.
 * </p>
 *
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class WrappedText extends Composite {

	private final StyledText styledText;


	/**
	 * Constructor.
	 * @param parent
	 */
	public WrappedText( Composite parent ) {
		this( parent, null, null );
	}


	/**
	 * Constructor.
	 * @param parent
	 * @param defaultLocalPart
	 * @param defaultNamespace
	 * @see SwtFactory#createWrappedTextField(Composite)
	 */
	public WrappedText( Composite parent, String defaultLocalPart, String defaultNamespace ) {
		super( parent, SWT.BORDER );
		setBackground( getDisplay().getSystemColor( SWT.COLOR_WHITE ));

		GridLayout layout = new GridLayout();
		layout.marginHeight = 3;
		layout.marginWidth = 4;
		setLayout( layout );
		setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));

		this.styledText = new StyledText( this, SWT.SINGLE );
		this.styledText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Control
	 * #setEnabled(boolean)
	 */
	@Override
	public void setEnabled( boolean enabled ) {
		this.styledText.setEnabled( enabled );

		int colorId = enabled ? SWT.COLOR_WHITE : SWT.COLOR_WIDGET_BACKGROUND;
		Color color = getDisplay().getSystemColor( colorId );

		this.styledText.setBackground( color );
		setBackground( color );

		super.setEnabled( enabled );
	}


	/**
	 * @return the styledText
	 */
	public StyledText getStyledText() {
		return this.styledText;
	}


	/**
	 * @return
	 * @see org.eclipse.swt.custom.StyledText#getText()
	 */
	public String getText() {
		return this.styledText.getText();
	}


	/**
	 * @param text
	 * @see org.eclipse.swt.custom.StyledText#setText(java.lang.String)
	 */
	public void setText( String text ) {
		this.styledText.setText( text );
	}
}
