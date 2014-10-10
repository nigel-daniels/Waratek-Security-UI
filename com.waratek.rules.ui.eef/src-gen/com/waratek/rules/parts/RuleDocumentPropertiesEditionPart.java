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
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public interface RuleDocumentPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the scope
	 * 
	 */
	public Enumerator getScope();

	/**
	 * Init the scope
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initScope(Object input, Enumerator current);

	/**
	 * Defines a new scope
	 * @param newValue the new scope to set
	 * 
	 */
	public void setScope(Enumerator newValue);





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
