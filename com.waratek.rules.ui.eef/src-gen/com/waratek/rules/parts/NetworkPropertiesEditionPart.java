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
public interface NetworkPropertiesEditionPart {

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
	 * @return the host
	 * 
	 */
	public String getHost();

	/**
	 * Defines a new host
	 * @param newValue the new host to set
	 * 
	 */
	public void setHost(String newValue);


	/**
	 * @return the port
	 * 
	 */
	public String getPort();

	/**
	 * Defines a new port
	 * @param newValue the new port to set
	 * 
	 */
	public void setPort(String newValue);


	/**
	 * @return the networkParameter
	 * 
	 */
	public Enumerator getNetworkParameter();

	/**
	 * Init the networkParameter
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initNetworkParameter(Object input, Enumerator current);

	/**
	 * Defines a new networkParameter
	 * @param newValue the new networkParameter to set
	 * 
	 */
	public void setNetworkParameter(Enumerator newValue);





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
