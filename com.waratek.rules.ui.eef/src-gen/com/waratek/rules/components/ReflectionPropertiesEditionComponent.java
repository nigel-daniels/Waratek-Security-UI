/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.Log;
import com.waratek.rules.Reflection;
import com.waratek.rules.ReflectionParameter;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.ReflectionPropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * 
 * 
 */
public class ReflectionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ReflectionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject reflection, String editing_mode) {
		super(editingContext, reflection, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.Reflection.class;
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
			
			final Reflection reflection = (Reflection)elt;
			final ReflectionPropertiesEditionPart basePart = (ReflectionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.Reflection.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(reflection, RulesPackage.eINSTANCE.getRule_Action()), reflection.getAction());
			}
			if (isAccessible(RulesViewsRepository.Reflection.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(reflection, RulesPackage.eINSTANCE.getRule_Log()), reflection.getLog());
			}
			if (isAccessible(RulesViewsRepository.Reflection.Properties.reflectionParameter)) {
				basePart.initReflectionParameter(EEFUtils.choiceOfValues(reflection, RulesPackage.eINSTANCE.getReflection_ReflectionParameter()), reflection.getReflectionParameter());
			}
			if (isAccessible(RulesViewsRepository.Reflection.Properties.qualifiedName))
				basePart.setQualifiedName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflection.getQualifiedName()));
			
			if (isAccessible(RulesViewsRepository.Reflection.Properties.signature))
				basePart.setSignature(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflection.getSignature()));
			
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
		if (editorKey == RulesViewsRepository.Reflection.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.Reflection.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.Reflection.Properties.reflectionParameter) {
			return RulesPackage.eINSTANCE.getReflection_ReflectionParameter();
		}
		if (editorKey == RulesViewsRepository.Reflection.Properties.qualifiedName) {
			return RulesPackage.eINSTANCE.getReflection_QualifiedName();
		}
		if (editorKey == RulesViewsRepository.Reflection.Properties.signature) {
			return RulesPackage.eINSTANCE.getReflection_Signature();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Reflection reflection = (Reflection)semanticObject;
		if (RulesViewsRepository.Reflection.Properties.action == event.getAffectedEditor()) {
			reflection.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.Reflection.Properties.log == event.getAffectedEditor()) {
			reflection.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.Reflection.Properties.reflectionParameter == event.getAffectedEditor()) {
			reflection.setReflectionParameter((ReflectionParameter)event.getNewValue());
		}
		if (RulesViewsRepository.Reflection.Properties.qualifiedName == event.getAffectedEditor()) {
			reflection.setQualifiedName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.Reflection.Properties.signature == event.getAffectedEditor()) {
			reflection.setSignature((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ReflectionPropertiesEditionPart basePart = (ReflectionPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Reflection.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Reflection.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getReflection_ReflectionParameter().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Reflection.Properties.reflectionParameter))
				basePart.setReflectionParameter((ReflectionParameter)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getReflection_QualifiedName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Reflection.Properties.qualifiedName)) {
				if (msg.getNewValue() != null) {
					basePart.setQualifiedName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setQualifiedName("");
				}
			}
			if (RulesPackage.eINSTANCE.getReflection_Signature().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Reflection.Properties.signature)) {
				if (msg.getNewValue() != null) {
					basePart.setSignature(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSignature("");
				}
			}
			
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
			RulesPackage.eINSTANCE.getRule_Action(),
			RulesPackage.eINSTANCE.getRule_Log(),
			RulesPackage.eINSTANCE.getReflection_ReflectionParameter(),
			RulesPackage.eINSTANCE.getReflection_QualifiedName(),
			RulesPackage.eINSTANCE.getReflection_Signature()		);
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
				if (RulesViewsRepository.Reflection.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Reflection.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Reflection.Properties.reflectionParameter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflection_ReflectionParameter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflection_ReflectionParameter().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Reflection.Properties.qualifiedName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflection_QualifiedName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflection_QualifiedName().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Reflection.Properties.signature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflection_Signature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflection_Signature().getEAttributeType(), newValue);
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
