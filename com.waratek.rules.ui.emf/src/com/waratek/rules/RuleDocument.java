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
 *   <li>{@link com.waratek.rules.RuleDocument#getVersion <em>Version</em>}</li>
 *   <li>{@link com.waratek.rules.RuleDocument#getLines <em>Lines</em>}</li>
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
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"One"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see com.waratek.rules.Version
	 * @see #setVersion(Version)
	 * @see com.waratek.rules.RulesPackage#getRuleDocument_Version()
	 * @model default="One"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link com.waratek.rules.RuleDocument#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see com.waratek.rules.Version
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link com.waratek.rules.Lines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see com.waratek.rules.RulesPackage#getRuleDocument_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lines> getLines();

} // RuleDocument
