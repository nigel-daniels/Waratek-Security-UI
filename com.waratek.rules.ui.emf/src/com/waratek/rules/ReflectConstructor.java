/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflect Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.ReflectConstructor#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.waratek.rules.ReflectConstructor#getConstructorSignature <em>Constructor Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getReflectConstructor()
 * @model
 * @generated
 */
public interface ReflectConstructor extends Reflection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see com.waratek.rules.RulesPackage#getReflectConstructor_ClassName()
	 * @model default=""
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link com.waratek.rules.ReflectConstructor#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Constructor Signature</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Signature</em>' attribute.
	 * @see #setConstructorSignature(String)
	 * @see com.waratek.rules.RulesPackage#getReflectConstructor_ConstructorSignature()
	 * @model default=""
	 * @generated
	 */
	String getConstructorSignature();

	/**
	 * Sets the value of the '{@link com.waratek.rules.ReflectConstructor#getConstructorSignature <em>Constructor Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Signature</em>' attribute.
	 * @see #getConstructorSignature()
	 * @generated
	 */
	void setConstructorSignature(String value);

} // ReflectConstructor
