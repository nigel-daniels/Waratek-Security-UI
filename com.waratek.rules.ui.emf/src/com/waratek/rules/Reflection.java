/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.Reflection#getReflectionParameter <em>Reflection Parameter</em>}</li>
 *   <li>{@link com.waratek.rules.Reflection#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.waratek.rules.Reflection#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getReflection()
 * @model
 * @generated
 */
public interface Reflection extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Reflection Parameter</b></em>' attribute.
	 * The default value is <code>"Method"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.ReflectionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflection Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflection Parameter</em>' attribute.
	 * @see com.waratek.rules.ReflectionParameter
	 * @see #setReflectionParameter(ReflectionParameter)
	 * @see com.waratek.rules.RulesPackage#getReflection_ReflectionParameter()
	 * @model default="Method"
	 * @generated
	 */
	ReflectionParameter getReflectionParameter();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Reflection#getReflectionParameter <em>Reflection Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflection Parameter</em>' attribute.
	 * @see com.waratek.rules.ReflectionParameter
	 * @see #getReflectionParameter()
	 * @generated
	 */
	void setReflectionParameter(ReflectionParameter value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see com.waratek.rules.RulesPackage#getReflection_QualifiedName()
	 * @model default=""
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Reflection#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see com.waratek.rules.RulesPackage#getReflection_Signature()
	 * @model default=""
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Reflection#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // Reflection
