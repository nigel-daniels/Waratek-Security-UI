/**
 * Generated with Acceleo
 */
package com.waratek.rules.providers;

import com.waratek.rules.util.RulesAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class RulesEEFAdapterFactory extends RulesAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createRuleDocumentAdapter()
	 * 
	 */
	public Adapter createRuleDocumentAdapter() {
		return new RuleDocumentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createFileAdapter()
	 * 
	 */
	public Adapter createFileAdapter() {
		return new FilePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createNetworkAdapter()
	 * 
	 */
	public Adapter createNetworkAdapter() {
		return new NetworkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createReflectionAdapter()
	 * 
	 */
	public Adapter createReflectionAdapter() {
		return new ReflectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createThrowableClassAdapter()
	 * 
	 */
	public Adapter createThrowableClassAdapter() {
		return new ThrowableClassPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createClassLinkAdapter()
	 * 
	 */
	public Adapter createClassLinkAdapter() {
		return new ClassLinkPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createNativeAdapter()
	 * 
	 */
	public Adapter createNativeAdapter() {
		return new Native_PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createSQLInjectionAdapter()
	 * 
	 */
	public Adapter createSQLInjectionAdapter() {
		return new SQLInjectionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.waratek.rules.util.RulesAdapterFactory#createCommentAdapter()
	 * 
	 */
	public Adapter createCommentAdapter() {
		return new CommentPropertiesEditionProvider();
	}

}
