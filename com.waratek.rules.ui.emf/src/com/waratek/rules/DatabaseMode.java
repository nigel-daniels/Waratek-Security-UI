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
 * A representation of the literals of the enumeration '<em><b>Database Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.waratek.rules.RulesPackage#getDatabaseMode()
 * @model
 * @generated
 */
public enum DatabaseMode implements Enumerator
{
	/**
	 * The '<em><b>Ansiquotes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANSIQUOTES_VALUE
	 * @generated
	 * @ordered
	 */
	ANSIQUOTES(0, "ansiquotes", "ansiquotes"),

	/**
	 * The '<em><b>Nobackslashescapes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOBACKSLASHESCAPES_VALUE
	 * @generated
	 * @ordered
	 */
	NOBACKSLASHESCAPES(1, "nobackslashescapes", "nobackslashescapes");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The '<em><b>Ansiquotes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ansiquotes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANSIQUOTES
	 * @model name="ansiquotes"
	 * @generated
	 * @ordered
	 */
	public static final int ANSIQUOTES_VALUE = 0;

	/**
	 * The '<em><b>Nobackslashescapes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nobackslashescapes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOBACKSLASHESCAPES
	 * @model name="nobackslashescapes"
	 * @generated
	 * @ordered
	 */
	public static final int NOBACKSLASHESCAPES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Database Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatabaseMode[] VALUES_ARRAY =
		new DatabaseMode[]
		{
			ANSIQUOTES,
			NOBACKSLASHESCAPES,
		};

	/**
	 * A public read-only list of all the '<em><b>Database Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatabaseMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Database Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseMode get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DatabaseMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseMode getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DatabaseMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseMode get(int value)
	{
		switch (value)
		{
			case ANSIQUOTES_VALUE: return ANSIQUOTES;
			case NOBACKSLASHESCAPES_VALUE: return NOBACKSLASHESCAPES;
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
	private DatabaseMode(int value, String name, String literal)
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
	
} //DatabaseMode
