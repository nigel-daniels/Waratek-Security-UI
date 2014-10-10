/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Network Parameter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.waratek.rules.RulesPackage#getNetworkParameter()
 * @model
 * @generated
 */
public enum NetworkParameter implements Enumerator {
	/**
	 * The '<em><b>Bind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(0, "bind", "Bind"),

	/**
	 * The '<em><b>Connect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT(1, "connect", "Connect"),

	/**
	 * The '<em><b>Serverbind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVERBIND_VALUE
	 * @generated
	 * @ordered
	 */
	SERVERBIND(2, "serverbind", "ServerBind"),

	/**
	 * The '<em><b>Accept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(3, "accept", "Accept");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2014 Waratek Ltd.";

	/**
	 * The '<em><b>Bind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIND
	 * @model name="bind" literal="Bind"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 0;

	/**
	 * The '<em><b>Connect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT
	 * @model name="connect" literal="Connect"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_VALUE = 1;

	/**
	 * The '<em><b>Serverbind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Serverbind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVERBIND
	 * @model name="serverbind" literal="ServerBind"
	 * @generated
	 * @ordered
	 */
	public static final int SERVERBIND_VALUE = 2;

	/**
	 * The '<em><b>Accept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPT
	 * @model name="accept" literal="Accept"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Network Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NetworkParameter[] VALUES_ARRAY =
		new NetworkParameter[] {
			BIND,
			CONNECT,
			SERVERBIND,
			ACCEPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Network Parameter</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NetworkParameter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Network Parameter</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkParameter get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkParameter result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Parameter</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkParameter getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NetworkParameter result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Network Parameter</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkParameter get(int value) {
		switch (value) {
			case BIND_VALUE: return BIND;
			case CONNECT_VALUE: return CONNECT;
			case SERVERBIND_VALUE: return SERVERBIND;
			case ACCEPT_VALUE: return ACCEPT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NetworkParameter(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NetworkParameter
