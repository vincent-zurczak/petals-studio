package com.ebmwebsourcing.petals.services.su.extensions.generic;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ebmwebsourcing.petals.services.su.extensions.ComponentVersionDescription;
import com.ebmwebsourcing.petals.services.su.wizards.ComponentCreationWizard;
import com.ebmwebsourcing.petals.services.su.wizards.pages.AbstractSuPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Jbi;

public class GenericComponentWizard extends ComponentCreationWizard {

	private final GenericComponentDescription genDesc = new GenericComponentDescription();
	
	@Override
	protected void presetServiceValues(AbstractEndpoint endpoint) {
	}

	@Override
	protected AbstractSuPage[] getCustomWizardPagesAfterJbi() {
		return null;
	}

	@Override
	protected AbstractSuPage[] getCustomWizardPagesAfterProject() {
		return null;
	}

	@Override
	protected AbstractSuPage[] getCustomWizardPagesBeforeProject() {
		return new AbstractSuPage[] {
				new GenericSuWizardPage()
		};
	}

	@Override
	protected IStatus performActionsBeforeWrittingJbiXml(
			IFolder resourceDirectory, Jbi jbiInstance2,
			IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}

	@Override
	protected IStatus performLastActions(IFolder resourceDirectory,
			AbstractEndpoint newlyCreatedEndpoint, IProgressMonitor monitor,
			List<Object> elementsToSelect) {
		return Status.OK_STATUS;
	}

	@Override
	protected boolean isJavaProject() {
		return false;
	}

	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return genDesc;
	}

}
