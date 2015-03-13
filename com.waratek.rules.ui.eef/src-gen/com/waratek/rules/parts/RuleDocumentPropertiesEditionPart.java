/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface RuleDocumentPropertiesEditionPart {

	/**
	 * @return the version
	 * 
	 */
	public Enumerator getVersion();

	/**
	 * Init the version
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initVersion(Object input, Enumerator current);

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(Enumerator newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
