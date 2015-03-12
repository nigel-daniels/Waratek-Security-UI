/**
 * Copyright 2015 Waratek Ltd.
 */
package com.waratek.rules.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.waratek.rules.Action;
import com.waratek.rules.Category;
import com.waratek.rules.ClassLink;
import com.waratek.rules.Comment;
import com.waratek.rules.Database;
import com.waratek.rules.DatabaseMode;
import com.waratek.rules.File;
import com.waratek.rules.FileParameter;
import com.waratek.rules.Log;
import com.waratek.rules.Native;
import com.waratek.rules.Network;
import com.waratek.rules.NetworkParameter;
import com.waratek.rules.Option;
import com.waratek.rules.ReflectClass;
import com.waratek.rules.ReflectConstructor;
import com.waratek.rules.ReflectField;
import com.waratek.rules.ReflectMethod;
import com.waratek.rules.ReflectPackage;
import com.waratek.rules.ReflectionParameter;
import com.waratek.rules.Rule;
import com.waratek.rules.RuleDocument;
import com.waratek.rules.RulesFactory;
import com.waratek.rules.SQLInjection;
import com.waratek.rules.ThrowableClass;
import com.waratek.rules.Version;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.waratek.rules.util.RulesResourceFactoryImpl
 * @generated
 */
public class RulesResourceImpl extends ResourceImpl
	{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String	copyright			= "Copyright 2015 Waratek Ltd.";
	// Rule file general strings
	public static final String	VERSION_1			= "VERSION 1.0";
	public static final String	COMMENT				= "#";
	public static final String	PACKAGE				= ".*";
	public static final String 	ASSIGN				= "=";
	// Rule separators
	public static final String	SEPERATOR_PRIMARY	= ":";
	public static final String	SEPERATOR_SECONDARY	= ";";
	public static final String	SEPERATOR_TERTIARY	= ",";
	


	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public RulesResourceImpl(URI uri)
		{
		super(uri);
	}


	/**
	 * Called to save the resource.
	 * 
	 * @param outputStream
	 *            the stream
	 * @param options
	 *            the save options.
	 * @exception IOException
	 * @generated NOT
	 */
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException
		{
		RulesWriteResourceSwitch rulesResourceSwitch = new RulesWriteResourceSwitch();
		for (TreeIterator<EObject> iterator = this.getAllContents(); iterator.hasNext();)
			{
			EObject object = iterator.next();
			String line = rulesResourceSwitch.doSwitch(object);
			if (line != null)
				{
				outputStream.write(line.getBytes(), 0, line.length());
				}
			System.out.print(line);
			}
		}


	/**
	 * Called to load the resource.
	 * 
	 * @param inputStream
	 *            the stream
	 * @param options
	 *            the load options.
	 * @exception IOException
	 * @generated NOT
	 */
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
		{
		// Set up what we need to read the file
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line = null;
		// Create the root object
		RuleDocument ruleDocument = RulesFactory.eINSTANCE.createRuleDocument();
		// Now read the lines and add the appropriate parts to the root object
		while ((line = reader.readLine()) != null)
			{
			// This line is the document version
			if (line.equals(VERSION_1))
				{
				ruleDocument.setVersion(Version.ONE);
				}
			// This line is a comment
			else if (line.startsWith(COMMENT))
				{
				ruleDocument.getLines().add(createComment(line));
				}
			// This line is a rule
			else if (line.contains(SEPERATOR_PRIMARY))
				{
				Rule rule = createRule(line);
				if (rule != null)
					{
					ruleDocument.getLines().add(rule);
					}
				}
			// If there was a non rule line or other cruft in here
			// we ignore it, it should be overwritten on the next save
			// Note this applies to blank lines at this point!
			}
		this.getContents().add(ruleDocument);
		}


	/**
	 * This generates a comment line
	 * 
	 * @param line
	 * @return
	 */
	private Comment createComment(String line)
		{
		Comment comment = RulesFactory.eINSTANCE.createComment();
		if (line.length() >= 2)
			{
			if (line.startsWith(COMMENT + " "))
				{
				comment.setComment(line.substring(2, line.length()));
				}
			else
				{
				comment.setComment(line.substring(1, line.length()));
				}
			}
		return comment;
		}


	/**
	 * Top level call to create rules, simply decides what sort of rule this is.
	 * When version differences happen this will need to know in order to decide
	 * what to do.
	 * 
	 * If we cannot match the first part of the string to a rule category this returns null.
	 * 
	 * @param line
	 * @return
	 */
	private Rule createRule(String line)
		{
		Rule rule = null;
		StringTokenizer stringTokenizer = new StringTokenizer(line, SEPERATOR_PRIMARY);
		if (stringTokenizer.hasMoreTokens())
			{
			String category = stringTokenizer.nextToken();
			if (category.equals(Category.FILE.getName()))
				{
				rule = createFileRule(stringTokenizer);
				}
			else if (category.equals(Category.NETWORK.getName()))
				{
				rule = createNetworkRule(stringTokenizer);
				}
			else if (category.equals(Category.CLASSLINK.getName()))
				{
				rule = createClasslinkRule(stringTokenizer);
				}
			else if (category.equals(Category.REFLECT.getName()))
				{
				rule = createReflectionRule(stringTokenizer);
				}
			else if (category.equals(Category.THROWABLE.getName()))
				{
				rule = createThrowableRule(stringTokenizer);
				}
			else if (category.equals(Category.NATIVE.getName()))
				{
				rule = createNativeRule(stringTokenizer);
				}
			else if (category.equals(Category.SQL.getName()))
				{
				rule = createSQLRule(stringTokenizer);
				}
			}
		return rule;
		}


	/**
	 * Creates a file rule
	 * 
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createFileRule(StringTokenizer stringTokenizer)
		{
		File rule = RulesFactory.eINSTANCE.createFile();
		if (stringTokenizer.hasMoreTokens())
			{
			FileParameter fileParameter = FileParameter.getByName(stringTokenizer.nextToken());
			if (fileParameter != null)
				{
				rule.setFileParameter(fileParameter);
				}
			}
		if (stringTokenizer.hasMoreTokens())
			{
			rule.setPath(stringTokenizer.nextToken());
			}
		return finishRule(stringTokenizer, rule);
		}


	/**
	 * Create a file rule
	 * 
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createNetworkRule(StringTokenizer stringTokenizer)
		{
		Network rule = RulesFactory.eINSTANCE.createNetwork();
		if (stringTokenizer.hasMoreTokens())
			{
			NetworkParameter networkParameter = NetworkParameter.getByName(stringTokenizer.nextToken());
			if (networkParameter != null)
				{
				rule.setNetworkParameter(networkParameter);
				}
			}
		// Let's get what could be the host or the port
		String hostOrPort = stringTokenizer.nextToken();
		if (stringTokenizer.hasMoreTokens())
			{
			// Lets get what could be the port or the action
			String portOrAction = stringTokenizer.nextToken();
			// Now lets do some detective work to set things correctly!
			Action action = Action.getByName(portOrAction);
			if (action == null)
				{
				rule.setHost(hostOrPort);
				rule.setPort(portOrAction);
				return finishRule(stringTokenizer, rule);
				}
			else
				{
				try
					{
					Integer.parseInt(hostOrPort);
					rule.setPort(hostOrPort);
					rule.setAction(action);
					return setLog(stringTokenizer, rule);
					}
				catch (NumberFormatException e)
					{
					rule.setHost(hostOrPort);
					rule.setAction(action);
					return setLog(stringTokenizer, rule);
					}
				}
			}
		return (Rule) rule;
		}


	/**
	 * Create rule for class linking
	 * 
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createClasslinkRule(StringTokenizer stringTokenizer)
		{
		ClassLink rule = RulesFactory.eINSTANCE.createClassLink();
		if (stringTokenizer.hasMoreTokens())
			{
			// This is the class subcategory so we can skip it
			stringTokenizer.nextToken();
			if (stringTokenizer.hasMoreTokens())
				{
				rule.setDescriptorName(stringTokenizer.nextToken());
				}
			}
		return finishRule(stringTokenizer, rule);
		}

	/**
	 * Create rule for reflection
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createReflectionRule(StringTokenizer stringTokenizer)
		{
		if (stringTokenizer.hasMoreTokens())
			{
			// This is the class subcategory so we can skip it
			stringTokenizer.nextToken();
			if (stringTokenizer.hasMoreTokens())
				{
				// This could be a package rule or one of the other reflect
				// rules
				String packageName = stringTokenizer.nextToken();
				if (packageName.endsWith(PACKAGE))
					{
					// Ok it is a package rule, we're done here
					ReflectPackage rule = RulesFactory.eINSTANCE.createReflectPackage();
					rule.setPackageName(packageName);
					return finishRule(stringTokenizer, rule);
					}
				else
					{
					// Lets separate the class and package names
					String className = packageName.substring(packageName.lastIndexOf('.'), packageName.length());
					packageName = packageName.substring(0, packageName.lastIndexOf('.') - 1);
					// The next token should tell us what we are dealing with
					if (stringTokenizer.hasMoreTokens())
						{
						String reflectParameterOrAction = stringTokenizer.nextToken();
						ReflectionParameter reflectionParameter = ReflectionParameter.getByName(reflectParameterOrAction);
						if (reflectionParameter == null)
							{
							// The token was not a reflect parameter so this
							// must be a class rule
							ReflectClass rule = RulesFactory.eINSTANCE.createReflectClass();
							rule.setPackageName(packageName);
							rule.setClassName(className);
							Action action = Action.getByName(reflectParameterOrAction);
							if (action != null)
								{
								rule.setAction(action);
								}
							return setLog(stringTokenizer, rule);
							}
						else
							{
							// We did get a reflect parmeter so now we know what
							// to do!
							switch (reflectionParameter.getValue())
								{
								case ReflectionParameter.CONSTRUCTOR_VALUE:
									{
									ReflectConstructor rule = RulesFactory.eINSTANCE.createReflectConstructor();
									rule.setPackageName(packageName);
									rule.setClassName(className);
									if (stringTokenizer.hasMoreTokens())
										{
										rule.setConstructorSignature(stringTokenizer.nextToken());
										}
									return finishRule(stringTokenizer, rule);
									}
								case ReflectionParameter.METHOD_VALUE:
									{
									ReflectMethod rule = RulesFactory.eINSTANCE.createReflectMethod();
									rule.setPackageName(packageName);
									rule.setClassName(className);
									if (stringTokenizer.hasMoreTokens())
										{
										rule.setMethodSignature(stringTokenizer.nextToken());
										}
									return finishRule(stringTokenizer, rule);
									}
								case ReflectionParameter.FIELD_VALUE:
									{
									ReflectField rule = RulesFactory.eINSTANCE.createReflectField();
									rule.setPackageName(packageName);
									rule.setClassName(className);
									if (stringTokenizer.hasMoreTokens())
										{
										rule.setFieldName(stringTokenizer.nextToken());
										}
									return finishRule(stringTokenizer, rule);
									}
								}
							}
						}
					}
				}
			}
		return null;
		}

	/**
	 * Create a throwable rule
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createThrowableRule(StringTokenizer stringTokenizer)
		{
		ThrowableClass rule = RulesFactory.eINSTANCE.createThrowableClass();
		if (stringTokenizer.hasMoreTokens())
			{
			// This is the throw subcategory so we can skip it
			stringTokenizer.nextToken();
			if (stringTokenizer.hasMoreTokens())
				{
				rule.setClassName(stringTokenizer.nextToken());
				}
			}
		return finishRule(stringTokenizer, rule);
		}
	
	
	/**
	 * This rule creates the native rule
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createNativeRule(StringTokenizer stringTokenizer)
		{
		Native rule = RulesFactory.eINSTANCE.createNative();
		if (stringTokenizer.hasMoreTokens())
			{
			// This is the library subcategory so we can skip it
			stringTokenizer.nextToken();
			if (stringTokenizer.hasMoreTokens())
				{
				String parameters = stringTokenizer.nextToken();
				if (parameters.contains(SEPERATOR_SECONDARY))
					{
					rule.setPath(parameters.substring(0, parameters.indexOf(SEPERATOR_SECONDARY)-1));
					rule.setChecksum(parameters.substring(parameters.indexOf(SEPERATOR_SECONDARY), parameters.length()));
					}
				else
					{rule.setPath(parameters);}
				}
			}
		return finishRule(stringTokenizer, rule);
		}
	
	
	/**
	 * Create an SQL rule
	 * @param stringTokenizer
	 * @return
	 */
	private Rule createSQLRule(StringTokenizer stringTokenizer)
		{
		SQLInjection rule = RulesFactory.eINSTANCE.createSQLInjection();
		if (stringTokenizer.hasMoreTokens())
			{
			// This is the database subcategory so we can skip it
			stringTokenizer.nextToken();
			if (stringTokenizer.hasMoreTokens())
				{
				String parameters = stringTokenizer.nextToken();
				if (parameters.contains(SEPERATOR_SECONDARY))
					{
					// We must have a MySQL db
					rule.setDatabase(Database.MYSQL);
					
					String modes = parameters.substring(parameters.indexOf(SEPERATOR_SECONDARY), parameters.length());
					
					if (modes.contains(SEPERATOR_TERTIARY)) 
						{
						rule = setMode(modes.substring(0, modes.indexOf(SEPERATOR_TERTIARY)-1), rule);
						rule = setMode(modes.substring(modes.indexOf(SEPERATOR_TERTIARY),modes.length()), rule);
						}
					else
						{
						rule = setMode(modes, rule);
						}
					}
				else
					{
					// This must be a database with no special settings
					rule.setDatabase(Database.getByName(parameters));
					}
				}
			}
		return finishRule(stringTokenizer, rule);
		}
	
	/**
	 * Utility method to add the action and log for most rule cases
	 * 
	 * @param stringTokenizer
	 * @param rule
	 * @return
	 */
	private Rule finishRule(StringTokenizer stringTokenizer, Rule rule)
		{
		rule = setAction(stringTokenizer, rule);
		return setLog(stringTokenizer, rule);
		}


	/**
	 * Set the rule action
	 * 
	 * @param stringTokenizer
	 * @param rule
	 * @return
	 */
	private Rule setAction(StringTokenizer stringTokenizer, Rule rule)
		{
		if (stringTokenizer.hasMoreTokens())
			{
			Action action = Action.getByName(stringTokenizer.nextToken());
			if (action != null)
				{
				rule.setAction(action);
				}
			}
		return rule;
		}


	/**
	 * Set the rule log
	 * 
	 * @param stringTokenizer
	 * @param rule
	 * @return
	 */
	private Rule setLog(StringTokenizer stringTokenizer, Rule rule)
		{
		if (stringTokenizer.hasMoreTokens())
			{
			Log log = Log.getByName(stringTokenizer.nextToken());
			if (log != null)
				{
				rule.setLog(log);
				}
			}
		return rule;
		}
	
	/**
	 * A utility class to help set database modes
	 * @param mode
	 * @param rule
	 * @return
	 */
	private SQLInjection setMode(String mode, SQLInjection rule)
		{
		if (mode.contains(ASSIGN))
			{
			DatabaseMode dbMode = DatabaseMode.getByName(mode.substring(0, mode.indexOf(ASSIGN)-1));
			Option dbOption = Option.getByName(mode.substring(mode.indexOf(ASSIGN),mode.length()));
			
			if (dbMode != null && dbOption != null)
				{
				switch (dbMode.getValue())
					{
					case DatabaseMode.ANSIQUOTES_VALUE:
						{
						rule.setAnsiQuotes((dbOption.getValue() != 0));
						break;
						}
					case DatabaseMode.NOBACKSLASHESCAPES_VALUE:
						{
						rule.setNoBackSlashEscapes((dbOption.getValue() != 0));
						break;
						}
					}
				}
			
			}
		
		return rule;
		}
	} // RulesResourceImpl
