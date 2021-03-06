/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.Native;
import com.waratek.rules.NativeAction;
import com.waratek.rules.RulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Native</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.waratek.rules.impl.NativeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.waratek.rules.impl.NativeImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link com.waratek.rules.impl.NativeImpl#getNativeAction <em>Native Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NativeImpl extends RuleImpl implements Native {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSUM_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected String checksum = CHECKSUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeAction() <em>Native Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeAction()
	 * @generated
	 * @ordered
	 */
	protected static final NativeAction NATIVE_ACTION_EDEFAULT = NativeAction.BLACKLIST;

	/**
	 * The cached value of the '{@link #getNativeAction() <em>Native Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeAction()
	 * @generated
	 * @ordered
	 */
	protected NativeAction nativeAction = NATIVE_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.NATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		if (newPath == null) {newPath = "";}
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.NATIVE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setChecksum(String newChecksum) {
		String oldChecksum = checksum;
		if (newChecksum == null) {newChecksum = "";}
		checksum = newChecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.NATIVE__CHECKSUM, oldChecksum, checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeAction getNativeAction()
	{
		return nativeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeAction(NativeAction newNativeAction)
	{
		NativeAction oldNativeAction = nativeAction;
		nativeAction = newNativeAction == null ? NATIVE_ACTION_EDEFAULT : newNativeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.NATIVE__NATIVE_ACTION, oldNativeAction, nativeAction));
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
			case RulesPackage.NATIVE__PATH:
				return getPath();
			case RulesPackage.NATIVE__CHECKSUM:
				return getChecksum();
			case RulesPackage.NATIVE__NATIVE_ACTION:
				return getNativeAction();
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
			case RulesPackage.NATIVE__PATH:
				setPath((String)newValue);
				return;
			case RulesPackage.NATIVE__CHECKSUM:
				setChecksum((String)newValue);
				return;
			case RulesPackage.NATIVE__NATIVE_ACTION:
				setNativeAction((NativeAction)newValue);
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
			case RulesPackage.NATIVE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case RulesPackage.NATIVE__CHECKSUM:
				setChecksum(CHECKSUM_EDEFAULT);
				return;
			case RulesPackage.NATIVE__NATIVE_ACTION:
				setNativeAction(NATIVE_ACTION_EDEFAULT);
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
			case RulesPackage.NATIVE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case RulesPackage.NATIVE__CHECKSUM:
				return CHECKSUM_EDEFAULT == null ? checksum != null : !CHECKSUM_EDEFAULT.equals(checksum);
			case RulesPackage.NATIVE__NATIVE_ACTION:
				return nativeAction != NATIVE_ACTION_EDEFAULT;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", checksum: ");
		result.append(checksum);
		result.append(", nativeAction: ");
		result.append(nativeAction);
		result.append(')');
		return result.toString();
	}

} //NativeImpl
