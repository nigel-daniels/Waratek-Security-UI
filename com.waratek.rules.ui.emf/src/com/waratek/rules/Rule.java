/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link com.waratek.rules.Rule#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends Lines {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"Deny"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see com.waratek.rules.Action
	 * @see #setAction(Action)
	 * @see com.waratek.rules.RulesPackage#getRule_Action()
	 * @model default="Deny"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Rule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see com.waratek.rules.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute.
	 * The default value is <code>"Warning"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.Log}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute.
	 * @see com.waratek.rules.Log
	 * @see #setLog(Log)
	 * @see com.waratek.rules.RulesPackage#getRule_Log()
	 * @model default="Warning"
	 * @generated
	 */
	Log getLog();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Rule#getLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' attribute.
	 * @see com.waratek.rules.Log
	 * @see #getLog()
	 * @generated
	 */
	void setLog(Log value);

} // Rule
