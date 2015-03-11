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
public interface SQLInjectionPropertiesEditionPart {

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
	 * @return the database
	 * 
	 */
	public Enumerator getDatabase();

	/**
	 * Init the database
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initDatabase(Object input, Enumerator current);

	/**
	 * Defines a new database
	 * @param newValue the new database to set
	 * 
	 */
	public void setDatabase(Enumerator newValue);


	/**
	 * @return the ansiQuotes
	 * 
	 */
	public Boolean getAnsiQuotes();

	/**
	 * Defines a new ansiQuotes
	 * @param newValue the new ansiQuotes to set
	 * 
	 */
	public void setAnsiQuotes(Boolean newValue);


	/**
	 * @return the noBackslashEscapes
	 * 
	 */
	public Boolean getNoBackslashEscapes();

	/**
	 * Defines a new noBackslashEscapes
	 * @param newValue the new noBackslashEscapes to set
	 * 
	 */
	public void setNoBackslashEscapes(Boolean newValue);





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
