/**
 * Generated with Acceleo
 */
package com.waratek.rules.providers;

import com.waratek.rules.parts.RulesViewsRepository;

import com.waratek.rules.parts.forms.ClassLinkPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.CommentPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.FilePropertiesEditionPartForm;
import com.waratek.rules.parts.forms.Native_PropertiesEditionPartForm;
import com.waratek.rules.parts.forms.NetworkPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.ReflectionPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.RuleDocumentPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.SQLInjectionPropertiesEditionPartForm;
import com.waratek.rules.parts.forms.ThrowableClassPropertiesEditionPartForm;

import com.waratek.rules.parts.impl.ClassLinkPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.CommentPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.FilePropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.Native_PropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.NetworkPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.ReflectionPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.RuleDocumentPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.SQLInjectionPropertiesEditionPartImpl;
import com.waratek.rules.parts.impl.ThrowableClassPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class RulesPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RulesViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RulesViewsRepository.RuleDocument.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new RuleDocumentPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new RuleDocumentPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.File.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new FilePropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new FilePropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.Network.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new NetworkPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new NetworkPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.Reflection.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new ReflectionPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new ReflectionPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.ThrowableClass.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new ThrowableClassPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new ThrowableClassPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.ClassLink.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new ClassLinkPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new ClassLinkPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.Native_.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new Native_PropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new Native_PropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.SQLInjection.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new SQLInjectionPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new SQLInjectionPropertiesEditionPartForm(component);
		}
		if (key == RulesViewsRepository.Comment.class) {
			if (kind == RulesViewsRepository.SWT_KIND)
				return new CommentPropertiesEditionPartImpl(component);
			if (kind == RulesViewsRepository.FORM_KIND)
				return new CommentPropertiesEditionPartForm(component);
		}
		return null;
	}

}
