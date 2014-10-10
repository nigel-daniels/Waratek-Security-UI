/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.File#getPath <em>Path</em>}</li>
 *   <li>{@link com.waratek.rules.File#getFileParameter <em>File Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2014 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.waratek.rules.RulesPackage#getFile_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.waratek.rules.File#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>File Parameter</b></em>' attribute.
	 * The default value is <code>"Read"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.FileParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Parameter</em>' attribute.
	 * @see com.waratek.rules.FileParameter
	 * @see #setFileParameter(FileParameter)
	 * @see com.waratek.rules.RulesPackage#getFile_FileParameter()
	 * @model default="Read"
	 * @generated
	 */
	FileParameter getFileParameter();

	/**
	 * Sets the value of the '{@link com.waratek.rules.File#getFileParameter <em>File Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Parameter</em>' attribute.
	 * @see com.waratek.rules.FileParameter
	 * @see #getFileParameter()
	 * @generated
	 */
	void setFileParameter(FileParameter value);

} // File
