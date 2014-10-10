/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public interface FilePropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);


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
	 * @return the path
	 * 
	 */
	public String getPath();

	/**
	 * Defines a new path
	 * @param newValue the new path to set
	 * 
	 */
	public void setPath(String newValue);


	/**
	 * @return the fileParameter
	 * 
	 */
	public Enumerator getFileParameter();

	/**
	 * Init the fileParameter
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initFileParameter(Object input, Enumerator current);

	/**
	 * Defines a new fileParameter
	 * @param newValue the new fileParameter to set
	 * 
	 */
	public void setFileParameter(Enumerator newValue);





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
