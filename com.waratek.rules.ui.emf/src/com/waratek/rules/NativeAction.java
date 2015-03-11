/**
 * Copyright 2015 Waratek Ltd.
 */
package com.waratek.rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Native Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.waratek.rules.RulesPackage#getNativeAction()
 * @model
 * @generated
 */
public enum NativeAction implements Enumerator
{
	/**
	 * The '<em><b>Blacklist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACKLIST_VALUE
	 * @generated
	 * @ordered
	 */
	BLACKLIST(0, "blacklist", "Blacklist"),

	/**
	 * The '<em><b>Greylist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREYLIST_VALUE
	 * @generated
	 * @ordered
	 */
	GREYLIST(1, "greylist", "Greylist"),

	/**
	 * The '<em><b>Whitelist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITELIST_VALUE
	 * @generated
	 * @ordered
	 */
	WHITELIST(2, "whitelist", "Whitelist");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The '<em><b>Blacklist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blacklist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACKLIST
	 * @model name="blacklist" literal="Blacklist"
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_VALUE = 0;

	/**
	 * The '<em><b>Greylist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greylist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREYLIST
	 * @model name="greylist" literal="Greylist"
	 * @generated
	 * @ordered
	 */
	public static final int GREYLIST_VALUE = 1;

	/**
	 * The '<em><b>Whitelist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Whitelist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITELIST
	 * @model name="whitelist" literal="Whitelist"
	 * @generated
	 * @ordered
	 */
	public static final int WHITELIST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Native Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NativeAction[] VALUES_ARRAY =
		new NativeAction[]
		{
			BLACKLIST,
			GREYLIST,
			WHITELIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Native Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NativeAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Native Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NativeAction get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			NativeAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Native Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NativeAction getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			NativeAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Native Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NativeAction get(int value)
	{
		switch (value)
		{
			case BLACKLIST_VALUE: return BLACKLIST;
			case GREYLIST_VALUE: return GREYLIST;
			case WHITELIST_VALUE: return WHITELIST;
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
	private NativeAction(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //NativeAction
