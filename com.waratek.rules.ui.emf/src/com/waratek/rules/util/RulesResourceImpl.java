/**
 * Copyright 2015 Waratek Ltd.
 */
package com.waratek.rules.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

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
	    throw new UnsupportedOperationException();
	  }

	} // RulesResourceImpl
