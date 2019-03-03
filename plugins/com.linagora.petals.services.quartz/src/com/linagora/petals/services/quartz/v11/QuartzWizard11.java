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
 
package com.linagora.petals.services.quartz.v11;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.linagora.petals.services.cdk.Cdk5Utils;
import com.linagora.petals.services.cdk.cdk5.Cdk5Package;
import com.linagora.petals.services.quartz.quartz.QuartzPackage;
import com.linagora.petals.services.su.extensions.ComponentVersionDescription;
import com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard;
import com.linagora.petals.services.su.wizards.pages.AbstractSuWizardPage;
import com.sun.java.xml.ns.jbi.AbstractEndpoint;
import com.sun.java.xml.ns.jbi.Consumes;

/**
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class QuartzWizard11 extends AbstractServiceUnitWizard {

	/* (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getComponentVersionDescription()
	 */
	@Override
	public ComponentVersionDescription getComponentVersionDescription() {
		return new QuartzDescription11();
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #presetServiceValues(com.sun.java.xml.ns.jbi.AbstractEndpoint)
	 */
	@Override
	protected void presetServiceValues(AbstractEndpoint endpoint) {
		Cdk5Utils.setInitialConsumesValues((Consumes) endpoint);
		endpoint.eSet(QuartzPackage.Literals.QUARTZ_CONSUMES__CRON_EXPRESSION, "* */5 * * *");
		endpoint.eSet(QuartzPackage.Literals.QUARTZ_CONSUMES__CONTENT, "<!-- Put the XML message to send here -->");
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #getCustomWizardPagesAfterJbi()
	 */
	@Override
	protected AbstractSuWizardPage[] getLastCustomWizardPages() {
		return new AbstractSuWizardPage[] { new QuartzComponentSpecificPage1x() };
	}

	/*
	 * (non-Javadoc)
	 * @see com.linagora.petals.services.su.wizards.AbstractServiceUnitWizard
	 * #performLastActions(org.eclipse.core.resources.IFolder, com.sun.java.xml.ns.jbi.AbstractEndpoint, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus performLastActions(IFolder resourceDirectory,	AbstractEndpoint ae, IProgressMonitor monitor) {

		ae.eSet( Cdk5Package.Literals.CDK5_CONSUMES__OPERATION, this.settings.invokedOperation );
		Cdk5Utils.setMep( ae, this.settings.invocationMep );

		return Status.OK_STATUS;
	}
}
