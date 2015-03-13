/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.ClassLink;
import com.waratek.rules.ClassLinkParameter;
import com.waratek.rules.RulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.waratek.rules.impl.ClassLinkImpl#getClassLinkParameter <em>Class Link Parameter</em>}</li>
 *   <li>{@link com.waratek.rules.impl.ClassLinkImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.waratek.rules.impl.ClassLinkImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassLinkImpl extends RuleImpl implements ClassLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The default value of the '{@link #getClassLinkParameter() <em>Class Link Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLinkParameter()
	 * @generated
	 * @ordered
	 */
	protected static final ClassLinkParameter CLASS_LINK_PARAMETER_EDEFAULT = ClassLinkParameter.CLASS;

	/**
	 * The cached value of the '{@link #getClassLinkParameter() <em>Class Link Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLinkParameter()
	 * @generated
	 * @ordered
	 */
	protected ClassLinkParameter classLinkParameter = CLASS_LINK_PARAMETER_EDEFAULT;

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
	protected static final String SIGNATURE_EDEFAULT = null;

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
	protected ClassLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.CLASS_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.CLASS_LINK__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLinkParameter getClassLinkParameter()
	{
		return classLinkParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassLinkParameter(ClassLinkParameter newClassLinkParameter)
	{
		ClassLinkParameter oldClassLinkParameter = classLinkParameter;
		classLinkParameter = newClassLinkParameter == null ? CLASS_LINK_PARAMETER_EDEFAULT : newClassLinkParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.CLASS_LINK__CLASS_LINK_PARAMETER, oldClassLinkParameter, classLinkParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.CLASS_LINK__SIGNATURE, oldSignature, signature));
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
			case RulesPackage.CLASS_LINK__CLASS_LINK_PARAMETER:
				return getClassLinkParameter();
			case RulesPackage.CLASS_LINK__QUALIFIED_NAME:
				return getQualifiedName();
			case RulesPackage.CLASS_LINK__SIGNATURE:
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
			case RulesPackage.CLASS_LINK__CLASS_LINK_PARAMETER:
				setClassLinkParameter((ClassLinkParameter)newValue);
				return;
			case RulesPackage.CLASS_LINK__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case RulesPackage.CLASS_LINK__SIGNATURE:
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
			case RulesPackage.CLASS_LINK__CLASS_LINK_PARAMETER:
				setClassLinkParameter(CLASS_LINK_PARAMETER_EDEFAULT);
				return;
			case RulesPackage.CLASS_LINK__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case RulesPackage.CLASS_LINK__SIGNATURE:
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
			case RulesPackage.CLASS_LINK__CLASS_LINK_PARAMETER:
				return classLinkParameter != CLASS_LINK_PARAMETER_EDEFAULT;
			case RulesPackage.CLASS_LINK__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case RulesPackage.CLASS_LINK__SIGNATURE:
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
		result.append(" (classLinkParameter: ");
		result.append(classLinkParameter);
		result.append(", qualifiedName: ");
		result.append(qualifiedName);
		result.append(", signature: ");
		result.append(signature);
		result.append(')');
		return result.toString();
	}

} //ClassLinkImpl
