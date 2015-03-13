/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.ClassLink#getClassLinkParameter <em>Class Link Parameter</em>}</li>
 *   <li>{@link com.waratek.rules.ClassLink#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.waratek.rules.ClassLink#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getClassLink()
 * @model
 * @generated
 */
public interface ClassLink extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

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
	 * @see com.waratek.rules.RulesPackage#getClassLink_QualifiedName()
	 * @model default=""
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link com.waratek.rules.ClassLink#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Class Link Parameter</b></em>' attribute.
	 * The default value is <code>"Class"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.ClassLinkParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Link Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Link Parameter</em>' attribute.
	 * @see com.waratek.rules.ClassLinkParameter
	 * @see #setClassLinkParameter(ClassLinkParameter)
	 * @see com.waratek.rules.RulesPackage#getClassLink_ClassLinkParameter()
	 * @model default="Class"
	 * @generated
	 */
	ClassLinkParameter getClassLinkParameter();

	/**
	 * Sets the value of the '{@link com.waratek.rules.ClassLink#getClassLinkParameter <em>Class Link Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Link Parameter</em>' attribute.
	 * @see com.waratek.rules.ClassLinkParameter
	 * @see #getClassLinkParameter()
	 * @generated
	 */
	void setClassLinkParameter(ClassLinkParameter value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see com.waratek.rules.RulesPackage#getClassLink_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link com.waratek.rules.ClassLink#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // ClassLink
