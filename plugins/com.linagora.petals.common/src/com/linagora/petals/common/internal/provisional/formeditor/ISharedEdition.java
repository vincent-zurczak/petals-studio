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
 
package com.linagora.petals.common.internal.provisional.formeditor;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.forms.widgets.FormToolkit;

import com.sun.java.xml.ns.jbi.Jbi;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public interface ISharedEdition extends IEditingDomainProvider {

	FormToolkit getFormToolkit();
	DataBindingContext getDataBindingContext();
	IFile getEditedFile();
	Jbi getJbiModel();
}
