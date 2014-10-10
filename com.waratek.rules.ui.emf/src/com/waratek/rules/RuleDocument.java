/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.RuleDocument#getName <em>Name</em>}</li>
 *   <li>{@link com.waratek.rules.RuleDocument#getRules <em>Rules</em>}</li>
 *   <li>{@link com.waratek.rules.RuleDocument#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getRuleDocument()
 * @model
 * @generated
 */
public interface RuleDocument extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2014 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.waratek.rules.RulesPackage#getRuleDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.waratek.rules.RuleDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.waratek.rules.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see com.waratek.rules.RulesPackage#getRuleDocument_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"JVC"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see com.waratek.rules.Scope
	 * @see #setScope(Scope)
	 * @see com.waratek.rules.RulesPackage#getRuleDocument_Scope()
	 * @model default="JVC"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link com.waratek.rules.RuleDocument#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see com.waratek.rules.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // RuleDocument
