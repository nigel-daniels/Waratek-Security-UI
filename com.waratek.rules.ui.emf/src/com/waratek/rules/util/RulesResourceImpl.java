/**
 * Copyright 2015 Waratek Ltd.
 */
package com.waratek.rules.util;

import java.io.IOException;
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
	 * Called to save the resource. This implementation throws an exception;
	 * clients must override it.
	 * 
	 * @param outputStream
	 *            the stream
	 * @param options
	 *            the save options.
	 * @exception UnsupportedOperationException
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
			System.out.print(line);
			}
		//throw new UnsupportedOperationException();
		}
	
	} // RulesResourceImpl
