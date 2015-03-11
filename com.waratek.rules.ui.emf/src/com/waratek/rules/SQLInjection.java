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
 *   <li>{@link com.waratek.rules.SQLInjection#isAnsiQuotes <em>Ansi Quotes</em>}</li>
 *   <li>{@link com.waratek.rules.SQLInjection#isNoBackSlashEscapes <em>No Back Slash Escapes</em>}</li>
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
	 * The default value is <code>"Oracle"</code>.
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
	 * @model default="Oracle"
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

	/**
	 * Returns the value of the '<em><b>Ansi Quotes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ansi Quotes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ansi Quotes</em>' attribute.
	 * @see #setAnsiQuotes(boolean)
	 * @see com.waratek.rules.RulesPackage#getSQLInjection_AnsiQuotes()
	 * @model default="false"
	 * @generated
	 */
	boolean isAnsiQuotes();

	/**
	 * Sets the value of the '{@link com.waratek.rules.SQLInjection#isAnsiQuotes <em>Ansi Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ansi Quotes</em>' attribute.
	 * @see #isAnsiQuotes()
	 * @generated
	 */
	void setAnsiQuotes(boolean value);

	/**
	 * Returns the value of the '<em><b>No Back Slash Escapes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Back Slash Escapes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Back Slash Escapes</em>' attribute.
	 * @see #setNoBackSlashEscapes(boolean)
	 * @see com.waratek.rules.RulesPackage#getSQLInjection_NoBackSlashEscapes()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoBackSlashEscapes();

	/**
	 * Sets the value of the '{@link com.waratek.rules.SQLInjection#isNoBackSlashEscapes <em>No Back Slash Escapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Back Slash Escapes</em>' attribute.
	 * @see #isNoBackSlashEscapes()
	 * @generated
	 */
	void setNoBackSlashEscapes(boolean value);

} // SQLInjection
