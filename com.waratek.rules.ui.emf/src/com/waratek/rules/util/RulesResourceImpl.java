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

import com.waratek.rules.Category;
import com.waratek.rules.Comment;
import com.waratek.rules.Rule;
import com.waratek.rules.RuleDocument;
import com.waratek.rules.RulesFactory;
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
	public static final String	copyright	= "Copyright 2015 Waratek Ltd.";

	// Rule file general strings
	public static final String VERSION_1 = "VERSION 1.0";
	public static final String COMMENT = "#";
	
	// Rule separators
	public static final String SEPERATOR_PRIMARY = ":";
	public static final String SEPERATOR_SECONDARY = ";";
	public static final String SEPERATOR_TERTIARY = ",";
			
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
	 * @param outputStream the stream
	 * @param options the save options.
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
				{outputStream.write(line.getBytes(), 0, line.length());}
			
			System.out.print(line);
			}
		}
	
	 /**
	   * Called to load the resource.
	   * 
	   * @param inputStream the stream
	   * @param options the load options.
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
			  {ruleDocument.setVersion(Version.ONE);}
		  // This line is a comment
		  else if (line.startsWith(COMMENT))
			  {
			  Comment comment = RulesFactory.eINSTANCE.createComment();
			  
			  if (line.length() >= 2)
				  {
				  if (line.startsWith(COMMENT + " ")) 
					  {comment.setComment(line.substring(2, line.length()));}
				  else
					  {comment.setComment(line.substring(1, line.length()));}
				  }
			  ruleDocument.getLines().add(comment);
			  }
		  // This line is a rule
		  else if (line.contains(SEPERATOR_PRIMARY))
			  {
			  Rule rule = createRule(line);
			  
			  if (rule != null)
				  {ruleDocument.getLines().add(rule);}
			  }
		  // If there was a non rule line or other cruft in here
		  // we ignore it, it should be overwritten on the next save
		  // Note this applies to blank lines at this point!
		  }
	  
	  this.getContents().add(ruleDocument);
	  }

	  private Rule createRule(String line)
		  {
		  Rule rule = null;
		  
		  StringTokenizer stringTokenizer = new StringTokenizer(line, SEPERATOR_PRIMARY);
		  
		  if (stringTokenizer.hasMoreTokens())
			  {
			  String category = stringTokenizer.nextToken();
			  
			  if (category.equals(Category.FILE.getName())) {}
			  }

		  
		  return rule;
		  }
	} // RulesResourceImpl
