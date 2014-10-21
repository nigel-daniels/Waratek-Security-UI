/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Rule;
import com.waratek.rules.RuleDocument;
import com.waratek.rules.RulesPackage;
import com.waratek.rules.Scope;

import com.waratek.rules.parts.RuleDocumentPropertiesEditionPart;
import com.waratek.rules.parts.RulesViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public class RuleDocumentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public RuleDocumentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ruleDocument, String editing_mode) {
		super(editingContext, ruleDocument, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.RuleDocument.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final RuleDocument ruleDocument = (RuleDocument)elt;
			final RuleDocumentPropertiesEditionPart basePart = (RuleDocumentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.RuleDocument.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ruleDocument.getName()));
			
			if (isAccessible(RulesViewsRepository.RuleDocument.Properties.scope)) {
				basePart.initScope(EEFUtils.choiceOfValues(ruleDocument, RulesPackage.eINSTANCE.getRuleDocument_Scope()), ruleDocument.getScope());
			}
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == RulesViewsRepository.RuleDocument.Properties.name) {
			return RulesPackage.eINSTANCE.getRuleDocument_Name();
		}
		if (editorKey == RulesViewsRepository.RuleDocument.Properties.scope) {
			return RulesPackage.eINSTANCE.getRuleDocument_Scope();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RuleDocument ruleDocument = (RuleDocument)semanticObject;
		if (RulesViewsRepository.RuleDocument.Properties.name == event.getAffectedEditor()) {
			ruleDocument.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.RuleDocument.Properties.scope == event.getAffectedEditor()) {
			ruleDocument.setScope((Scope)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			RuleDocumentPropertiesEditionPart basePart = (RuleDocumentPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRuleDocument_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.RuleDocument.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (RulesPackage.eINSTANCE.getRuleDocument_Scope().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.RuleDocument.Properties.scope))
				basePart.setScope((Scope)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			RulesPackage.eINSTANCE.getRuleDocument_Name(),
			RulesPackage.eINSTANCE.getRuleDocument_Scope()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (RulesViewsRepository.RuleDocument.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRuleDocument_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRuleDocument_Name().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.RuleDocument.Properties.scope == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRuleDocument_Scope().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRuleDocument_Scope().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}
