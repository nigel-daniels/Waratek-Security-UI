/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.util;

import com.waratek.rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.waratek.rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2014 Waratek Ltd.";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RulesPackage.RULE_DOCUMENT: {
				RuleDocument ruleDocument = (RuleDocument)theEObject;
				T result = caseRuleDocument(ruleDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseRule(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseRule(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECTION: {
				Reflection reflection = (Reflection)theEObject;
				T result = caseReflection(reflection);
				if (result == null) result = caseRule(reflection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECT_PACKAGE: {
				ReflectPackage reflectPackage = (ReflectPackage)theEObject;
				T result = caseReflectPackage(reflectPackage);
				if (result == null) result = caseReflection(reflectPackage);
				if (result == null) result = caseRule(reflectPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECT_CLASS: {
				ReflectClass reflectClass = (ReflectClass)theEObject;
				T result = caseReflectClass(reflectClass);
				if (result == null) result = caseReflection(reflectClass);
				if (result == null) result = caseRule(reflectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECT_CONSTRUCTOR: {
				ReflectConstructor reflectConstructor = (ReflectConstructor)theEObject;
				T result = caseReflectConstructor(reflectConstructor);
				if (result == null) result = caseReflection(reflectConstructor);
				if (result == null) result = caseRule(reflectConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECT_METHOD: {
				ReflectMethod reflectMethod = (ReflectMethod)theEObject;
				T result = caseReflectMethod(reflectMethod);
				if (result == null) result = caseReflection(reflectMethod);
				if (result == null) result = caseRule(reflectMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.REFLECT_FIELD: {
				ReflectField reflectField = (ReflectField)theEObject;
				T result = caseReflectField(reflectField);
				if (result == null) result = caseReflection(reflectField);
				if (result == null) result = caseRule(reflectField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.THROWABLE_CLASS: {
				ThrowableClass throwableClass = (ThrowableClass)theEObject;
				T result = caseThrowableClass(throwableClass);
				if (result == null) result = caseRule(throwableClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.CLASS_LINK: {
				ClassLink classLink = (ClassLink)theEObject;
				T result = caseClassLink(classLink);
				if (result == null) result = caseRule(classLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.NATIVE: {
				Native native_ = (Native)theEObject;
				T result = caseNative(native_);
				if (result == null) result = caseRule(native_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RulesPackage.SQL_INJECTION: {
				SQLInjection sqlInjection = (SQLInjection)theEObject;
				T result = caseSQLInjection(sqlInjection);
				if (result == null) result = caseRule(sqlInjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleDocument(RuleDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflection(Reflection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectPackage(ReflectPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectClass(ReflectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectConstructor(ReflectConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectMethod(ReflectMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflect Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflect Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectField(ReflectField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throwable Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwable Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowableClass(ThrowableClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassLink(ClassLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNative(Native object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Injection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Injection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLInjection(SQLInjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
