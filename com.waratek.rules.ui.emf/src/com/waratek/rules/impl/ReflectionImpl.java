/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.Reflection;
import com.waratek.rules.ReflectionParameter;
import com.waratek.rules.RulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.waratek.rules.impl.ReflectionImpl#getReflectionParameter <em>Reflection Parameter</em>}</li>
 *   <li>{@link com.waratek.rules.impl.ReflectionImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.waratek.rules.impl.ReflectionImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReflectionImpl extends RuleImpl implements Reflection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The default value of the '{@link #getReflectionParameter() <em>Reflection Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectionParameter()
	 * @generated
	 * @ordered
	 */
	protected static final ReflectionParameter REFLECTION_PARAMETER_EDEFAULT = ReflectionParameter.METHOD;

	/**
	 * The cached value of the '{@link #getReflectionParameter() <em>Reflection Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectionParameter()
	 * @generated
	 * @ordered
	 */
	protected ReflectionParameter reflectionParameter = REFLECTION_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.REFLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectionParameter getReflectionParameter()
	{
		return reflectionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectionParameter(ReflectionParameter newReflectionParameter)
	{
		ReflectionParameter oldReflectionParameter = reflectionParameter;
		reflectionParameter = newReflectionParameter == null ? REFLECTION_PARAMETER_EDEFAULT : newReflectionParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFLECTION__REFLECTION_PARAMETER, oldReflectionParameter, reflectionParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName()
	{
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setQualifiedName(String newQualifiedName)
	{
		String oldQualifiedName = qualifiedName;
		if (newQualifiedName == null) {newQualifiedName = "";}
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFLECTION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature()
	{
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSignature(String newSignature)
	{
		String oldSignature = signature;
		if (newSignature == null) {newSignature = "";}
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.REFLECTION__SIGNATURE, oldSignature, signature));
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
			case RulesPackage.REFLECTION__REFLECTION_PARAMETER:
				return getReflectionParameter();
			case RulesPackage.REFLECTION__QUALIFIED_NAME:
				return getQualifiedName();
			case RulesPackage.REFLECTION__SIGNATURE:
				return getSignature();
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
			case RulesPackage.REFLECTION__REFLECTION_PARAMETER:
				setReflectionParameter((ReflectionParameter)newValue);
				return;
			case RulesPackage.REFLECTION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case RulesPackage.REFLECTION__SIGNATURE:
				setSignature((String)newValue);
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
			case RulesPackage.REFLECTION__REFLECTION_PARAMETER:
				setReflectionParameter(REFLECTION_PARAMETER_EDEFAULT);
				return;
			case RulesPackage.REFLECTION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case RulesPackage.REFLECTION__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
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
			case RulesPackage.REFLECTION__REFLECTION_PARAMETER:
				return reflectionParameter != REFLECTION_PARAMETER_EDEFAULT;
			case RulesPackage.REFLECTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case RulesPackage.REFLECTION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
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
		result.append(" (reflectionParameter: ");
		result.append(reflectionParameter);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", signature: ");
		result.append(signature);
		result.append(')');
		return result.toString();
	}

} //ReflectionImpl
