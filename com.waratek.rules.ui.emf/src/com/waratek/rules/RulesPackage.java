/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.waratek.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.waratek.com/rules/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = com.waratek.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.RuleDocumentImpl <em>Rule Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.RuleDocumentImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getRuleDocument()
	 * @generated
	 */
	int RULE_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DOCUMENT__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DOCUMENT__LINES = 1;

	/**
	 * The number of structural features of the '<em>Rule Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.LinesImpl <em>Lines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.LinesImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getLines()
	 * @generated
	 */
	int LINES = 10;

	/**
	 * The number of structural features of the '<em>Lines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.RuleImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = LINES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LOG = LINES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = LINES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = LINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.FileImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_PARAMETER = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.NetworkImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__HOST = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PORT = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_PARAMETER = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.ReflectionImpl <em>Reflection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.ReflectionImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getReflection()
	 * @generated
	 */
	int REFLECTION = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Reflection Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION__REFLECTION_PARAMETER = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION__QUALIFIED_NAME = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION__SIGNATURE = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reflection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTION_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.ThrowableClassImpl <em>Throwable Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.ThrowableClassImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getThrowableClass()
	 * @generated
	 */
	int THROWABLE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_CLASS__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_CLASS__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_CLASS__CLASS_NAME = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throwable Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_CLASS_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Throwable Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_CLASS_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.ClassLinkImpl <em>Class Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.ClassLinkImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getClassLink()
	 * @generated
	 */
	int CLASS_LINK = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Class Link Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK__CLASS_LINK_PARAMETER = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK__QUALIFIED_NAME = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK__SIGNATURE = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LINK_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.NativeImpl <em>Native</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.NativeImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getNative()
	 * @generated
	 */
	int NATIVE = 7;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__PATH = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__CHECKSUM = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE__NATIVE_ACTION = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Native</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.SQLInjectionImpl <em>SQL Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.SQLInjectionImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getSQLInjection()
	 * @generated
	 */
	int SQL_INJECTION = 8;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION__ACTION = RULE__ACTION;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION__LOG = RULE__LOG;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION__DATABASE = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ansi Quotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION__ANSI_QUOTES = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Back Slash Escapes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION__NO_BACK_SLASH_ESCAPES = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SQL Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SQL Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INJECTION_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.impl.CommentImpl
	 * @see com.waratek.rules.impl.RulesPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = LINES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = LINES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = LINES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.waratek.rules.FileParameter <em>File Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.FileParameter
	 * @see com.waratek.rules.impl.RulesPackageImpl#getFileParameter()
	 * @generated
	 */
	int FILE_PARAMETER = 11;

	/**
	 * The meta object id for the '{@link com.waratek.rules.NetworkParameter <em>Network Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.NetworkParameter
	 * @see com.waratek.rules.impl.RulesPackageImpl#getNetworkParameter()
	 * @generated
	 */
	int NETWORK_PARAMETER = 12;

	/**
	 * The meta object id for the '{@link com.waratek.rules.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Action
	 * @see com.waratek.rules.impl.RulesPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 13;

	/**
	 * The meta object id for the '{@link com.waratek.rules.Log <em>Log</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Log
	 * @see com.waratek.rules.impl.RulesPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 14;

	/**
	 * The meta object id for the '{@link com.waratek.rules.Database <em>Database</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Database
	 * @see com.waratek.rules.impl.RulesPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 15;


	/**
	 * The meta object id for the '{@link com.waratek.rules.Version <em>Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Version
	 * @see com.waratek.rules.impl.RulesPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 16;


	/**
	 * The meta object id for the '{@link com.waratek.rules.NativeAction <em>Native Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.NativeAction
	 * @see com.waratek.rules.impl.RulesPackageImpl#getNativeAction()
	 * @generated
	 */
	int NATIVE_ACTION = 17;


	/**
	 * The meta object id for the '{@link com.waratek.rules.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Category
	 * @see com.waratek.rules.impl.RulesPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 18;

	/**
	 * The meta object id for the '{@link com.waratek.rules.SubCategory <em>Sub Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.SubCategory
	 * @see com.waratek.rules.impl.RulesPackageImpl#getSubCategory()
	 * @generated
	 */
	int SUB_CATEGORY = 19;

	/**
	 * The meta object id for the '{@link com.waratek.rules.ReflectionParameter <em>Reflection Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.ReflectionParameter
	 * @see com.waratek.rules.impl.RulesPackageImpl#getReflectionParameter()
	 * @generated
	 */
	int REFLECTION_PARAMETER = 20;


	/**
	 * The meta object id for the '{@link com.waratek.rules.DatabaseMode <em>Database Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.DatabaseMode
	 * @see com.waratek.rules.impl.RulesPackageImpl#getDatabaseMode()
	 * @generated
	 */
	int DATABASE_MODE = 21;

	/**
	 * The meta object id for the '{@link com.waratek.rules.Option <em>Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.Option
	 * @see com.waratek.rules.impl.RulesPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 22;

	/**
	 * The meta object id for the '{@link com.waratek.rules.ClassLinkParameter <em>Class Link Parameter</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.waratek.rules.ClassLinkParameter
	 * @see com.waratek.rules.impl.RulesPackageImpl#getClassLinkParameter()
	 * @generated
	 */
	int CLASS_LINK_PARAMETER = 23;

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.RuleDocument <em>Rule Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Document</em>'.
	 * @see com.waratek.rules.RuleDocument
	 * @generated
	 */
	EClass getRuleDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.RuleDocument#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.waratek.rules.RuleDocument#getVersion()
	 * @see #getRuleDocument()
	 * @generated
	 */
	EAttribute getRuleDocument_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link com.waratek.rules.RuleDocument#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see com.waratek.rules.RuleDocument#getLines()
	 * @see #getRuleDocument()
	 * @generated
	 */
	EReference getRuleDocument_Lines();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see com.waratek.rules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see com.waratek.rules.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Action();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Rule#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log</em>'.
	 * @see com.waratek.rules.Rule#getLog()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Log();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.waratek.rules.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.waratek.rules.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.File#getFileParameter <em>File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Parameter</em>'.
	 * @see com.waratek.rules.File#getFileParameter()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileParameter();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see com.waratek.rules.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Network#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.waratek.rules.Network#getHost()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Network#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.waratek.rules.Network#getPort()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Network#getNetworkParameter <em>Network Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Parameter</em>'.
	 * @see com.waratek.rules.Network#getNetworkParameter()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_NetworkParameter();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Reflection <em>Reflection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflection</em>'.
	 * @see com.waratek.rules.Reflection
	 * @generated
	 */
	EClass getReflection();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Reflection#getReflectionParameter <em>Reflection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reflection Parameter</em>'.
	 * @see com.waratek.rules.Reflection#getReflectionParameter()
	 * @see #getReflection()
	 * @generated
	 */
	EAttribute getReflection_ReflectionParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Reflection#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see com.waratek.rules.Reflection#getQualifiedName()
	 * @see #getReflection()
	 * @generated
	 */
	EAttribute getReflection_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Reflection#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see com.waratek.rules.Reflection#getSignature()
	 * @see #getReflection()
	 * @generated
	 */
	EAttribute getReflection_Signature();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.ThrowableClass <em>Throwable Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwable Class</em>'.
	 * @see com.waratek.rules.ThrowableClass
	 * @generated
	 */
	EClass getThrowableClass();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.ThrowableClass#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see com.waratek.rules.ThrowableClass#getClassName()
	 * @see #getThrowableClass()
	 * @generated
	 */
	EAttribute getThrowableClass_ClassName();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.ClassLink <em>Class Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Link</em>'.
	 * @see com.waratek.rules.ClassLink
	 * @generated
	 */
	EClass getClassLink();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.ClassLink#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see com.waratek.rules.ClassLink#getQualifiedName()
	 * @see #getClassLink()
	 * @generated
	 */
	EAttribute getClassLink_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.ClassLink#getClassLinkParameter <em>Class Link Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Link Parameter</em>'.
	 * @see com.waratek.rules.ClassLink#getClassLinkParameter()
	 * @see #getClassLink()
	 * @generated
	 */
	EAttribute getClassLink_ClassLinkParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.ClassLink#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see com.waratek.rules.ClassLink#getSignature()
	 * @see #getClassLink()
	 * @generated
	 */
	EAttribute getClassLink_Signature();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Native <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native</em>'.
	 * @see com.waratek.rules.Native
	 * @generated
	 */
	EClass getNative();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Native#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.waratek.rules.Native#getPath()
	 * @see #getNative()
	 * @generated
	 */
	EAttribute getNative_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Native#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see com.waratek.rules.Native#getChecksum()
	 * @see #getNative()
	 * @generated
	 */
	EAttribute getNative_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Native#getNativeAction <em>Native Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Action</em>'.
	 * @see com.waratek.rules.Native#getNativeAction()
	 * @see #getNative()
	 * @generated
	 */
	EAttribute getNative_NativeAction();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.SQLInjection <em>SQL Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Injection</em>'.
	 * @see com.waratek.rules.SQLInjection
	 * @generated
	 */
	EClass getSQLInjection();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.SQLInjection#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see com.waratek.rules.SQLInjection#getDatabase()
	 * @see #getSQLInjection()
	 * @generated
	 */
	EAttribute getSQLInjection_Database();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.SQLInjection#isAnsiQuotes <em>Ansi Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ansi Quotes</em>'.
	 * @see com.waratek.rules.SQLInjection#isAnsiQuotes()
	 * @see #getSQLInjection()
	 * @generated
	 */
	EAttribute getSQLInjection_AnsiQuotes();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.SQLInjection#isNoBackSlashEscapes <em>No Back Slash Escapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Back Slash Escapes</em>'.
	 * @see com.waratek.rules.SQLInjection#isNoBackSlashEscapes()
	 * @see #getSQLInjection()
	 * @generated
	 */
	EAttribute getSQLInjection_NoBackSlashEscapes();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see com.waratek.rules.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link com.waratek.rules.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.waratek.rules.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link com.waratek.rules.Lines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lines</em>'.
	 * @see com.waratek.rules.Lines
	 * @generated
	 */
	EClass getLines();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.FileParameter <em>File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Parameter</em>'.
	 * @see com.waratek.rules.FileParameter
	 * @generated
	 */
	EEnum getFileParameter();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.NetworkParameter <em>Network Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Parameter</em>'.
	 * @see com.waratek.rules.NetworkParameter
	 * @generated
	 */
	EEnum getNetworkParameter();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see com.waratek.rules.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log</em>'.
	 * @see com.waratek.rules.Log
	 * @generated
	 */
	EEnum getLog();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database</em>'.
	 * @see com.waratek.rules.Database
	 * @generated
	 */
	EEnum getDatabase();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version</em>'.
	 * @see com.waratek.rules.Version
	 * @generated
	 */
	EEnum getVersion();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.NativeAction <em>Native Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Native Action</em>'.
	 * @see com.waratek.rules.NativeAction
	 * @generated
	 */
	EEnum getNativeAction();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see com.waratek.rules.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.SubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub Category</em>'.
	 * @see com.waratek.rules.SubCategory
	 * @generated
	 */
	EEnum getSubCategory();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.ReflectionParameter <em>Reflection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reflection Parameter</em>'.
	 * @see com.waratek.rules.ReflectionParameter
	 * @generated
	 */
	EEnum getReflectionParameter();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.DatabaseMode <em>Database Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Mode</em>'.
	 * @see com.waratek.rules.DatabaseMode
	 * @generated
	 */
	EEnum getDatabaseMode();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Option</em>'.
	 * @see com.waratek.rules.Option
	 * @generated
	 */
	EEnum getOption();

	/**
	 * Returns the meta object for enum '{@link com.waratek.rules.ClassLinkParameter <em>Class Link Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Link Parameter</em>'.
	 * @see com.waratek.rules.ClassLinkParameter
	 * @generated
	 */
	EEnum getClassLinkParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.RuleDocumentImpl <em>Rule Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.RuleDocumentImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getRuleDocument()
		 * @generated
		 */
		EClass RULE_DOCUMENT = eINSTANCE.getRuleDocument();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_DOCUMENT__VERSION = eINSTANCE.getRuleDocument_Version();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DOCUMENT__LINES = eINSTANCE.getRuleDocument_Lines();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.RuleImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__LOG = eINSTANCE.getRule_Log();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.FileImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>File Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_PARAMETER = eINSTANCE.getFile_FileParameter();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.NetworkImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__HOST = eINSTANCE.getNetwork_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PORT = eINSTANCE.getNetwork_Port();

		/**
		 * The meta object literal for the '<em><b>Network Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NETWORK_PARAMETER = eINSTANCE.getNetwork_NetworkParameter();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.ReflectionImpl <em>Reflection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.ReflectionImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getReflection()
		 * @generated
		 */
		EClass REFLECTION = eINSTANCE.getReflection();

		/**
		 * The meta object literal for the '<em><b>Reflection Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLECTION__REFLECTION_PARAMETER = eINSTANCE.getReflection_ReflectionParameter();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLECTION__QUALIFIED_NAME = eINSTANCE.getReflection_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLECTION__SIGNATURE = eINSTANCE.getReflection_Signature();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.ThrowableClassImpl <em>Throwable Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.ThrowableClassImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getThrowableClass()
		 * @generated
		 */
		EClass THROWABLE_CLASS = eINSTANCE.getThrowableClass();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROWABLE_CLASS__CLASS_NAME = eINSTANCE.getThrowableClass_ClassName();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.ClassLinkImpl <em>Class Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.ClassLinkImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getClassLink()
		 * @generated
		 */
		EClass CLASS_LINK = eINSTANCE.getClassLink();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LINK__QUALIFIED_NAME = eINSTANCE.getClassLink_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Class Link Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LINK__CLASS_LINK_PARAMETER = eINSTANCE.getClassLink_ClassLinkParameter();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LINK__SIGNATURE = eINSTANCE.getClassLink_Signature();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.NativeImpl <em>Native</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.NativeImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getNative()
		 * @generated
		 */
		EClass NATIVE = eINSTANCE.getNative();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE__PATH = eINSTANCE.getNative_Path();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE__CHECKSUM = eINSTANCE.getNative_Checksum();

		/**
		 * The meta object literal for the '<em><b>Native Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE__NATIVE_ACTION = eINSTANCE.getNative_NativeAction();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.SQLInjectionImpl <em>SQL Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.SQLInjectionImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getSQLInjection()
		 * @generated
		 */
		EClass SQL_INJECTION = eINSTANCE.getSQLInjection();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INJECTION__DATABASE = eINSTANCE.getSQLInjection_Database();

		/**
		 * The meta object literal for the '<em><b>Ansi Quotes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INJECTION__ANSI_QUOTES = eINSTANCE.getSQLInjection_AnsiQuotes();

		/**
		 * The meta object literal for the '<em><b>No Back Slash Escapes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INJECTION__NO_BACK_SLASH_ESCAPES = eINSTANCE.getSQLInjection_NoBackSlashEscapes();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.CommentImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.impl.LinesImpl <em>Lines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.impl.LinesImpl
		 * @see com.waratek.rules.impl.RulesPackageImpl#getLines()
		 * @generated
		 */
		EClass LINES = eINSTANCE.getLines();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.FileParameter <em>File Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.FileParameter
		 * @see com.waratek.rules.impl.RulesPackageImpl#getFileParameter()
		 * @generated
		 */
		EEnum FILE_PARAMETER = eINSTANCE.getFileParameter();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.NetworkParameter <em>Network Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.NetworkParameter
		 * @see com.waratek.rules.impl.RulesPackageImpl#getNetworkParameter()
		 * @generated
		 */
		EEnum NETWORK_PARAMETER = eINSTANCE.getNetworkParameter();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Action
		 * @see com.waratek.rules.impl.RulesPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Log <em>Log</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Log
		 * @see com.waratek.rules.impl.RulesPackageImpl#getLog()
		 * @generated
		 */
		EEnum LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Database <em>Database</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Database
		 * @see com.waratek.rules.impl.RulesPackageImpl#getDatabase()
		 * @generated
		 */
		EEnum DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Version <em>Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Version
		 * @see com.waratek.rules.impl.RulesPackageImpl#getVersion()
		 * @generated
		 */
		EEnum VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.NativeAction <em>Native Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.NativeAction
		 * @see com.waratek.rules.impl.RulesPackageImpl#getNativeAction()
		 * @generated
		 */
		EEnum NATIVE_ACTION = eINSTANCE.getNativeAction();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Category
		 * @see com.waratek.rules.impl.RulesPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.SubCategory <em>Sub Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.SubCategory
		 * @see com.waratek.rules.impl.RulesPackageImpl#getSubCategory()
		 * @generated
		 */
		EEnum SUB_CATEGORY = eINSTANCE.getSubCategory();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.ReflectionParameter <em>Reflection Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.ReflectionParameter
		 * @see com.waratek.rules.impl.RulesPackageImpl#getReflectionParameter()
		 * @generated
		 */
		EEnum REFLECTION_PARAMETER = eINSTANCE.getReflectionParameter();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.DatabaseMode <em>Database Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.DatabaseMode
		 * @see com.waratek.rules.impl.RulesPackageImpl#getDatabaseMode()
		 * @generated
		 */
		EEnum DATABASE_MODE = eINSTANCE.getDatabaseMode();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.Option <em>Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.Option
		 * @see com.waratek.rules.impl.RulesPackageImpl#getOption()
		 * @generated
		 */
		EEnum OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link com.waratek.rules.ClassLinkParameter <em>Class Link Parameter</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.waratek.rules.ClassLinkParameter
		 * @see com.waratek.rules.impl.RulesPackageImpl#getClassLinkParameter()
		 * @generated
		 */
		EEnum CLASS_LINK_PARAMETER = eINSTANCE.getClassLinkParameter();

	}

} //RulesPackage
