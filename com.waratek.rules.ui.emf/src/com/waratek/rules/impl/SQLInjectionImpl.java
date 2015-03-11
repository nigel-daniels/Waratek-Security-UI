/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.Database;
import com.waratek.rules.RulesPackage;
import com.waratek.rules.SQLInjection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.waratek.rules.impl.SQLInjectionImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.waratek.rules.impl.SQLInjectionImpl#isAnsiQuotes <em>Ansi Quotes</em>}</li>
 *   <li>{@link com.waratek.rules.impl.SQLInjectionImpl#isNoBackSlashEscapes <em>No Back Slash Escapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLInjectionImpl extends RuleImpl implements SQLInjection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final Database DATABASE_EDEFAULT = Database.ORACLE;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database = DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnsiQuotes() <em>Ansi Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnsiQuotes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSI_QUOTES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnsiQuotes() <em>Ansi Quotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnsiQuotes()
	 * @generated
	 * @ordered
	 */
	protected boolean ansiQuotes = ANSI_QUOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoBackSlashEscapes() <em>No Back Slash Escapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoBackSlashEscapes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_BACK_SLASH_ESCAPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoBackSlashEscapes() <em>No Back Slash Escapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoBackSlashEscapes()
	 * @generated
	 * @ordered
	 */
	protected boolean noBackSlashEscapes = NO_BACK_SLASH_ESCAPES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLInjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.SQL_INJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase == null ? DATABASE_EDEFAULT : newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SQL_INJECTION__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnsiQuotes()
	{
		return ansiQuotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnsiQuotes(boolean newAnsiQuotes)
	{
		boolean oldAnsiQuotes = ansiQuotes;
		ansiQuotes = newAnsiQuotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SQL_INJECTION__ANSI_QUOTES, oldAnsiQuotes, ansiQuotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoBackSlashEscapes()
	{
		return noBackSlashEscapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoBackSlashEscapes(boolean newNoBackSlashEscapes)
	{
		boolean oldNoBackSlashEscapes = noBackSlashEscapes;
		noBackSlashEscapes = newNoBackSlashEscapes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.SQL_INJECTION__NO_BACK_SLASH_ESCAPES, oldNoBackSlashEscapes, noBackSlashEscapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case RulesPackage.SQL_INJECTION__DATABASE:
				return getDatabase();
			case RulesPackage.SQL_INJECTION__ANSI_QUOTES:
				return isAnsiQuotes();
			case RulesPackage.SQL_INJECTION__NO_BACK_SLASH_ESCAPES:
				return isNoBackSlashEscapes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case RulesPackage.SQL_INJECTION__DATABASE:
				setDatabase((Database)newValue);
				return;
			case RulesPackage.SQL_INJECTION__ANSI_QUOTES:
				setAnsiQuotes((Boolean)newValue);
				return;
			case RulesPackage.SQL_INJECTION__NO_BACK_SLASH_ESCAPES:
				setNoBackSlashEscapes((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case RulesPackage.SQL_INJECTION__DATABASE:
				setDatabase(DATABASE_EDEFAULT);
				return;
			case RulesPackage.SQL_INJECTION__ANSI_QUOTES:
				setAnsiQuotes(ANSI_QUOTES_EDEFAULT);
				return;
			case RulesPackage.SQL_INJECTION__NO_BACK_SLASH_ESCAPES:
				setNoBackSlashEscapes(NO_BACK_SLASH_ESCAPES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case RulesPackage.SQL_INJECTION__DATABASE:
				return database != DATABASE_EDEFAULT;
			case RulesPackage.SQL_INJECTION__ANSI_QUOTES:
				return ansiQuotes != ANSI_QUOTES_EDEFAULT;
			case RulesPackage.SQL_INJECTION__NO_BACK_SLASH_ESCAPES:
				return noBackSlashEscapes != NO_BACK_SLASH_ESCAPES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (database: ");
		result.append(database);
		result.append(", ansiQuotes: ");
		result.append(ansiQuotes);
		result.append(", noBackSlashEscapes: ");
		result.append(noBackSlashEscapes);
		result.append(')');
		return result.toString();
	}

} //SQLInjectionImpl
