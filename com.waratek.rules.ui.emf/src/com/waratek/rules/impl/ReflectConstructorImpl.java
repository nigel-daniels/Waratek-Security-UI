/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.ReflectConstructor;
import com.waratek.rules.RulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflect Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.waratek.rules.impl.ReflectConstructorImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.waratek.rules.impl.ReflectConstructorImpl#getConstructorSignature <em>Constructor Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflectConstructorImpl extends ReflectionImpl implements ReflectConstructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructorSignature() <em>Constructor Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_SIGNATURE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConstructorSignature() <em>Constructor Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorSignature()
	 * @generated
	 * @ordered
	 */
	protected String constructorSignature = CONSTRUCTOR_SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.REFLECT_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		if (newClassName == null) {newClassName = "";}
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFLECT_CONSTRUCTOR__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstructorSignature() {
		return constructorSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setConstructorSignature(String newConstructorSignature) {
		String oldConstructorSignature = constructorSignature;
		if (newConstructorSignature == null) {newConstructorSignature = "";}
		constructorSignature = newConstructorSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFLECT_CONSTRUCTOR__CONSTRUCTOR_SIGNATURE, oldConstructorSignature, constructorSignature));
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
			case RulesPackage.REFLECT_CONSTRUCTOR__CLASS_NAME:
				return getClassName();
			case RulesPackage.REFLECT_CONSTRUCTOR__CONSTRUCTOR_SIGNATURE:
				return getConstructorSignature();
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
			case RulesPackage.REFLECT_CONSTRUCTOR__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case RulesPackage.REFLECT_CONSTRUCTOR__CONSTRUCTOR_SIGNATURE:
				setConstructorSignature((String)newValue);
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
			case RulesPackage.REFLECT_CONSTRUCTOR__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case RulesPackage.REFLECT_CONSTRUCTOR__CONSTRUCTOR_SIGNATURE:
				setConstructorSignature(CONSTRUCTOR_SIGNATURE_EDEFAULT);
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
			case RulesPackage.REFLECT_CONSTRUCTOR__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case RulesPackage.REFLECT_CONSTRUCTOR__CONSTRUCTOR_SIGNATURE:
				return CONSTRUCTOR_SIGNATURE_EDEFAULT == null ? constructorSignature != null : !CONSTRUCTOR_SIGNATURE_EDEFAULT.equals(constructorSignature);
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
		result.append(" (className: ");
		result.append(className);
		result.append(", constructorSignature: ");
		result.append(constructorSignature);
		result.append(')');
		return result.toString();
	}

} //ReflectConstructorImpl
