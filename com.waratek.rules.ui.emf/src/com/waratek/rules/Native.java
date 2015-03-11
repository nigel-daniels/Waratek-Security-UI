/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.Native#getPath <em>Path</em>}</li>
 *   <li>{@link com.waratek.rules.Native#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link com.waratek.rules.Native#getNativeAction <em>Native Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getNative()
 * @model
 * @generated
 */
public interface Native extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.waratek.rules.RulesPackage#getNative_Path()
	 * @model default=""
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Native#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(String)
	 * @see com.waratek.rules.RulesPackage#getNative_Checksum()
	 * @model default=""
	 * @generated
	 */
	String getChecksum();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Native#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(String value);

	/**
	 * Returns the value of the '<em><b>Native Action</b></em>' attribute.
	 * The default value is <code>"Blacklist"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.NativeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Action</em>' attribute.
	 * @see com.waratek.rules.NativeAction
	 * @see #setNativeAction(NativeAction)
	 * @see com.waratek.rules.RulesPackage#getNative_NativeAction()
	 * @model default="Blacklist"
	 * @generated
	 */
	NativeAction getNativeAction();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Native#getNativeAction <em>Native Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Action</em>' attribute.
	 * @see com.waratek.rules.NativeAction
	 * @see #getNativeAction()
	 * @generated
	 */
	void setNativeAction(NativeAction value);

} // Native
