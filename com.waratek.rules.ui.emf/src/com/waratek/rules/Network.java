/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.waratek.rules.Network#getHost <em>Host</em>}</li>
 *   <li>{@link com.waratek.rules.Network#getPort <em>Port</em>}</li>
 *   <li>{@link com.waratek.rules.Network#getNetworkParameter <em>Network Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.waratek.rules.RulesPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Rule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2014 Waratek Ltd.";

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.waratek.rules.RulesPackage#getNetwork_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Network#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.waratek.rules.RulesPackage#getNetwork_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Network#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Network Parameter</b></em>' attribute.
	 * The default value is <code>"Connect"</code>.
	 * The literals are from the enumeration {@link com.waratek.rules.NetworkParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Parameter</em>' attribute.
	 * @see com.waratek.rules.NetworkParameter
	 * @see #setNetworkParameter(NetworkParameter)
	 * @see com.waratek.rules.RulesPackage#getNetwork_NetworkParameter()
	 * @model default="Connect"
	 * @generated
	 */
	NetworkParameter getNetworkParameter();

	/**
	 * Sets the value of the '{@link com.waratek.rules.Network#getNetworkParameter <em>Network Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Parameter</em>' attribute.
	 * @see com.waratek.rules.NetworkParameter
	 * @see #getNetworkParameter()
	 * @generated
	 */
	void setNetworkParameter(NetworkParameter value);

} // Network
