/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface ClassLinkPropertiesEditionPart {

	/**
	 * @return the action
	 * 
	 */
	public Enumerator getAction();

	/**
	 * Init the action
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initAction(Object input, Enumerator current);

	/**
	 * Defines a new action
	 * @param newValue the new action to set
	 * 
	 */
	public void setAction(Enumerator newValue);


	/**
	 * @return the log
	 * 
	 */
	public Enumerator getLog();

	/**
	 * Init the log
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initLog(Object input, Enumerator current);

	/**
	 * Defines a new log
	 * @param newValue the new log to set
	 * 
	 */
	public void setLog(Enumerator newValue);


	/**
	 * @return the descriptorName
	 * 
	 */
	public String getDescriptorName();

	/**
	 * Defines a new descriptorName
	 * @param newValue the new descriptorName to set
	 * 
	 */
	public void setDescriptorName(String newValue);





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
