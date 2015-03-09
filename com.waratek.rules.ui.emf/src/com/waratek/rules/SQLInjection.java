/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.SQLInjection#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getSQLInjection()
 * @model
 * @generated
 */
public interface SQLInjection extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * The literals are from the enumeration {@link com.waratek.rules.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see com.waratek.rules.Database
	 * @see #setDatabase(Database)
	 * @see com.waratek.rules.RulesPackage#getSQLInjection_Database()
	 * @model
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link com.waratek.rules.SQLInjection#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see com.waratek.rules.Database
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // SQLInjection
