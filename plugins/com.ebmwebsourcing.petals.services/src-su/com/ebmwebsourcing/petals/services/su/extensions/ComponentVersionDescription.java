/****************************************************************************
 *
 * Copyright (c) 2010-2013, Linagora
 *
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 *
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 *
 *****************************************************************************/
package com.ebmwebsourcing.petals.services.su.extensions;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IStatus;

import com.ebmwebsourcing.petals.common.generation.Mep;
import com.ebmwebsourcing.petals.services.PetalsServicesPlugin;
import com.ebmwebsourcing.petals.services.su.editor.extensibility.EditorContributionSupport;

/**
 * A bean that holds information about a Petals component's version.
 * @author Vincent Zurczak - EBM WebSourcing
 */
public abstract class ComponentVersionDescription implements IComponentDescription, IExecutableExtension {

	protected String namespce;
	protected IConfigurationElement configurationElement;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.IExecutableExtension
	 * #setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) {
		this.configurationElement = config;
		this.namespce = config.getAttribute("namespace");
	}

	/**
	 * @return the name space
	 */
	public String getNamespace() {
		return this.namespce;
	}

	/**
	 * @return the component's version
	 */
	public abstract String getComponentVersion();

	/**
	 * @return true ONLY if the component supports the definition of service providers
	 */
	public abstract boolean isProvide();

	/**
	 * @return true ONLY if the component supports the definition of service consumers
	 */
	public abstract boolean isConsume();

	/**
	 * @return true ONLY if the component supports the definition of service consumers and providers at the same time
	 */
	public abstract boolean isProxy();

	/**
	 * @return a map associating an operation name and a MEP
	 * <p>
	 * It should include all the operations of the component, independently of the
	 * component version. Actually, it is not possible to determine the target component
	 * from any end-point bean. So, listing them all and letting the user choose is the best
	 * option. By the end, the list of operations of a component should become stable.
	 * </p>
	 */
	public Map<QName,Mep> getDefaultOperations() {
		return new HashMap<QName,Mep> ();
	}

	/**
	 * Returns the MEPs this component supports when used in consume mode.
	 * @return a set of supported MEPs (never null)
	 */
	public Mep[] getSupportedMep() {
		return new Mep[ 0 ];
	}

	/**
	 * @return the value to indicate an end-point is auto-generated at deployment time
	 */
	public String getAutoGeneratedEndpointValue() {
		return "autogenerate";
	}

	/**
	 * Makes sure everything is configured correctly to use the component wizard.
	 * @return null if everything is fine, an error message otherwise
	 */
	public String validatePrerequisites() {
		return null;
	}

	/**
	 * @return the editor contribution for this version
	 */
	public EditorContributionSupport createNewExtensionSupport() {

		EditorContributionSupport support = null;
		try {
			if( this.configurationElement.getAttribute( "editorExtension" ) != null )
				support = (EditorContributionSupport) this.configurationElement.createExecutableExtension( "editorExtension" );

		} catch( Exception ex ) {
			PetalsServicesPlugin.log(ex, IStatus.ERROR);
		}

		return support;
	}
}