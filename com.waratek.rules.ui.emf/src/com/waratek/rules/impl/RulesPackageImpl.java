/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.impl;

import com.waratek.rules.Action;
import com.waratek.rules.Category;
import com.waratek.rules.ClassLink;
import com.waratek.rules.ClassLinkParameter;
import com.waratek.rules.Comment;
import com.waratek.rules.Database;
import com.waratek.rules.DatabaseMode;
import com.waratek.rules.File;
import com.waratek.rules.FileParameter;
import com.waratek.rules.Lines;
import com.waratek.rules.Log;
import com.waratek.rules.Native;
import com.waratek.rules.NativeAction;
import com.waratek.rules.Network;
import com.waratek.rules.NetworkParameter;
import com.waratek.rules.Option;
import com.waratek.rules.Reflection;
import com.waratek.rules.ReflectionParameter;
import com.waratek.rules.Rule;
import com.waratek.rules.RuleDocument;
import com.waratek.rules.RulesFactory;
import com.waratek.rules.RulesPackage;
import com.waratek.rules.SQLInjection;
import com.waratek.rules.SubCategory;
import com.waratek.rules.ThrowableClass;
import com.waratek.rules.Version;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwableClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlInjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileParameterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkParameterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nativeActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reflectionParameterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classLinkParameterEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.waratek.rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited) return (RulesPackage)EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RulesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleDocument() {
		return ruleDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleDocument_Version() {
		return (EAttribute)ruleDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDocument_Lines()
	{
		return (EReference)ruleDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Action() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Log() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_FileParameter() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Host() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Port() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_NetworkParameter() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflection() {
		return reflectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflection_ReflectionParameter()
	{
		return (EAttribute)reflectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflection_QualifiedName()
	{
		return (EAttribute)reflectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflection_Signature()
	{
		return (EAttribute)reflectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowableClass() {
		return throwableClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrowableClass_ClassName() {
		return (EAttribute)throwableClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassLink() {
		return classLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassLink_QualifiedName()
	{
		return (EAttribute)classLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassLink_ClassLinkParameter()
	{
		return (EAttribute)classLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassLink_Signature()
	{
		return (EAttribute)classLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNative() {
		return nativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNative_Path() {
		return (EAttribute)nativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNative_Checksum() {
		return (EAttribute)nativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNative_NativeAction()
	{
		return (EAttribute)nativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLInjection() {
		return sqlInjectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLInjection_Database() {
		return (EAttribute)sqlInjectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLInjection_AnsiQuotes()
	{
		return (EAttribute)sqlInjectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSQLInjection_NoBackSlashEscapes()
	{
		return (EAttribute)sqlInjectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Comment() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLines()
	{
		return linesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileParameter() {
		return fileParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkParameter() {
		return networkParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLog() {
		return logEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabase() {
		return databaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersion() {
		return versionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNativeAction()
	{
		return nativeActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategory()
	{
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubCategory()
	{
		return subCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReflectionParameter()
	{
		return reflectionParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseMode()
	{
		return databaseModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOption()
	{
		return optionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassLinkParameter()
	{
		return classLinkParameterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ruleDocumentEClass = createEClass(RULE_DOCUMENT);
		createEAttribute(ruleDocumentEClass, RULE_DOCUMENT__VERSION);
		createEReference(ruleDocumentEClass, RULE_DOCUMENT__LINES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__ACTION);
		createEAttribute(ruleEClass, RULE__LOG);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__PATH);
		createEAttribute(fileEClass, FILE__FILE_PARAMETER);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__HOST);
		createEAttribute(networkEClass, NETWORK__PORT);
		createEAttribute(networkEClass, NETWORK__NETWORK_PARAMETER);

		reflectionEClass = createEClass(REFLECTION);
		createEAttribute(reflectionEClass, REFLECTION__REFLECTION_PARAMETER);
		createEAttribute(reflectionEClass, REFLECTION__QUALIFIED_NAME);
		createEAttribute(reflectionEClass, REFLECTION__SIGNATURE);

		throwableClassEClass = createEClass(THROWABLE_CLASS);
		createEAttribute(throwableClassEClass, THROWABLE_CLASS__CLASS_NAME);

		classLinkEClass = createEClass(CLASS_LINK);
		createEAttribute(classLinkEClass, CLASS_LINK__CLASS_LINK_PARAMETER);
		createEAttribute(classLinkEClass, CLASS_LINK__QUALIFIED_NAME);
		createEAttribute(classLinkEClass, CLASS_LINK__SIGNATURE);

		nativeEClass = createEClass(NATIVE);
		createEAttribute(nativeEClass, NATIVE__PATH);
		createEAttribute(nativeEClass, NATIVE__CHECKSUM);
		createEAttribute(nativeEClass, NATIVE__NATIVE_ACTION);

		sqlInjectionEClass = createEClass(SQL_INJECTION);
		createEAttribute(sqlInjectionEClass, SQL_INJECTION__DATABASE);
		createEAttribute(sqlInjectionEClass, SQL_INJECTION__ANSI_QUOTES);
		createEAttribute(sqlInjectionEClass, SQL_INJECTION__NO_BACK_SLASH_ESCAPES);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__COMMENT);

		linesEClass = createEClass(LINES);

		// Create enums
		fileParameterEEnum = createEEnum(FILE_PARAMETER);
		networkParameterEEnum = createEEnum(NETWORK_PARAMETER);
		actionEEnum = createEEnum(ACTION);
		logEEnum = createEEnum(LOG);
		databaseEEnum = createEEnum(DATABASE);
		versionEEnum = createEEnum(VERSION);
		nativeActionEEnum = createEEnum(NATIVE_ACTION);
		categoryEEnum = createEEnum(CATEGORY);
		subCategoryEEnum = createEEnum(SUB_CATEGORY);
		reflectionParameterEEnum = createEEnum(REFLECTION_PARAMETER);
		databaseModeEEnum = createEEnum(DATABASE_MODE);
		optionEEnum = createEEnum(OPTION);
		classLinkParameterEEnum = createEEnum(CLASS_LINK_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruleEClass.getESuperTypes().add(this.getLines());
		fileEClass.getESuperTypes().add(this.getRule());
		networkEClass.getESuperTypes().add(this.getRule());
		reflectionEClass.getESuperTypes().add(this.getRule());
		throwableClassEClass.getESuperTypes().add(this.getRule());
		classLinkEClass.getESuperTypes().add(this.getRule());
		nativeEClass.getESuperTypes().add(this.getRule());
		sqlInjectionEClass.getESuperTypes().add(this.getRule());
		commentEClass.getESuperTypes().add(this.getLines());

		// Initialize classes, features, and operations; add parameters
		initEClass(ruleDocumentEClass, RuleDocument.class, "RuleDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleDocument_Version(), this.getVersion(), "version", "One", 0, 1, RuleDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDocument_Lines(), this.getLines(), null, "lines", null, 0, -1, RuleDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Action(), this.getAction(), "action", "Deny", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Log(), this.getLog(), "log", "Warning", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", "", 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_FileParameter(), this.getFileParameter(), "fileParameter", "Read", 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Host(), ecorePackage.getEString(), "host", "", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Port(), ecorePackage.getEString(), "port", "0", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_NetworkParameter(), this.getNetworkParameter(), "networkParameter", "Connect", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflectionEClass, Reflection.class, "Reflection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReflection_ReflectionParameter(), this.getReflectionParameter(), "reflectionParameter", "Method", 0, 1, Reflection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflection_QualifiedName(), ecorePackage.getEString(), "qualifiedName", "", 0, 1, Reflection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReflection_Signature(), ecorePackage.getEString(), "signature", "", 0, 1, Reflection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throwableClassEClass, ThrowableClass.class, "ThrowableClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrowableClass_ClassName(), ecorePackage.getEString(), "className", "", 0, 1, ThrowableClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classLinkEClass, ClassLink.class, "ClassLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassLink_ClassLinkParameter(), this.getClassLinkParameter(), "classLinkParameter", "Class", 0, 1, ClassLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassLink_QualifiedName(), ecorePackage.getEString(), "qualifiedName", "", 0, 1, ClassLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassLink_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, ClassLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeEClass, Native.class, "Native", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNative_Path(), ecorePackage.getEString(), "path", "", 0, 1, Native.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNative_Checksum(), ecorePackage.getEString(), "checksum", "", 0, 1, Native.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNative_NativeAction(), this.getNativeAction(), "nativeAction", "Blacklist", 0, 1, Native.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlInjectionEClass, SQLInjection.class, "SQLInjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLInjection_Database(), this.getDatabase(), "database", "Oracle", 0, 1, SQLInjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSQLInjection_AnsiQuotes(), ecorePackage.getEBoolean(), "ansiQuotes", "false", 0, 1, SQLInjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSQLInjection_NoBackSlashEscapes(), ecorePackage.getEBoolean(), "noBackSlashEscapes", "false", 0, 1, SQLInjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", "", 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linesEClass, Lines.class, "Lines", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(fileParameterEEnum, FileParameter.class, "FileParameter");
		addEEnumLiteral(fileParameterEEnum, FileParameter.READ);
		addEEnumLiteral(fileParameterEEnum, FileParameter.WRITE);
		addEEnumLiteral(fileParameterEEnum, FileParameter.EXEC);

		initEEnum(networkParameterEEnum, NetworkParameter.class, "NetworkParameter");
		addEEnumLiteral(networkParameterEEnum, NetworkParameter.BIND);
		addEEnumLiteral(networkParameterEEnum, NetworkParameter.CONNECT);
		addEEnumLiteral(networkParameterEEnum, NetworkParameter.SERVERBIND);
		addEEnumLiteral(networkParameterEEnum, NetworkParameter.ACCEPT);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.ALLOW);
		addEEnumLiteral(actionEEnum, Action.DENY);
		addEEnumLiteral(actionEEnum, Action.SUSPEND);
		addEEnumLiteral(actionEEnum, Action.SHUTDOWN);
		addEEnumLiteral(actionEEnum, Action.DESTROY);

		initEEnum(logEEnum, Log.class, "Log");
		addEEnumLiteral(logEEnum, Log.OFF);
		addEEnumLiteral(logEEnum, Log.INFO);
		addEEnumLiteral(logEEnum, Log.WARN);
		addEEnumLiteral(logEEnum, Log.ERROR);
		addEEnumLiteral(logEEnum, Log.DEBUG);
		addEEnumLiteral(logEEnum, Log.TRACE);

		initEEnum(databaseEEnum, Database.class, "Database");
		addEEnumLiteral(databaseEEnum, Database.ORACLE);
		addEEnumLiteral(databaseEEnum, Database.MYSQL);

		initEEnum(versionEEnum, Version.class, "Version");
		addEEnumLiteral(versionEEnum, Version.ONE);

		initEEnum(nativeActionEEnum, NativeAction.class, "NativeAction");
		addEEnumLiteral(nativeActionEEnum, NativeAction.BLACKLIST);
		addEEnumLiteral(nativeActionEEnum, NativeAction.GREYLIST);
		addEEnumLiteral(nativeActionEEnum, NativeAction.WHITELIST);

		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.FILE);
		addEEnumLiteral(categoryEEnum, Category.NETWORK);
		addEEnumLiteral(categoryEEnum, Category.CLASSLINK);
		addEEnumLiteral(categoryEEnum, Category.REFLECT);
		addEEnumLiteral(categoryEEnum, Category.THROWABLE);
		addEEnumLiteral(categoryEEnum, Category.NATIVE);
		addEEnumLiteral(categoryEEnum, Category.SQL);

		initEEnum(subCategoryEEnum, SubCategory.class, "SubCategory");
		addEEnumLiteral(subCategoryEEnum, SubCategory.CLASS);
		addEEnumLiteral(subCategoryEEnum, SubCategory.THROW);
		addEEnumLiteral(subCategoryEEnum, SubCategory.LIBRARY);
		addEEnumLiteral(subCategoryEEnum, SubCategory.DATABASE);

		initEEnum(reflectionParameterEEnum, ReflectionParameter.class, "ReflectionParameter");
		addEEnumLiteral(reflectionParameterEEnum, ReflectionParameter.CONSTRUCTOR);
		addEEnumLiteral(reflectionParameterEEnum, ReflectionParameter.METHOD);
		addEEnumLiteral(reflectionParameterEEnum, ReflectionParameter.FIELD);

		initEEnum(databaseModeEEnum, DatabaseMode.class, "DatabaseMode");
		addEEnumLiteral(databaseModeEEnum, DatabaseMode.ANSIQUOTES);
		addEEnumLiteral(databaseModeEEnum, DatabaseMode.NOBACKSLASHESCAPES);

		initEEnum(optionEEnum, Option.class, "Option");
		addEEnumLiteral(optionEEnum, Option.OFF);
		addEEnumLiteral(optionEEnum, Option.ON);

		initEEnum(classLinkParameterEEnum, ClassLinkParameter.class, "ClassLinkParameter");
		addEEnumLiteral(classLinkParameterEEnum, ClassLinkParameter.CLASS);
		addEEnumLiteral(classLinkParameterEEnum, ClassLinkParameter.CONSTRUCTOR);
		addEEnumLiteral(classLinkParameterEEnum, ClassLinkParameter.METHOD);
		addEEnumLiteral(classLinkParameterEEnum, ClassLinkParameter.FIELD);

		// Create resource
		createResource(eNS_URI);
	}

} //RulesPackageImpl
