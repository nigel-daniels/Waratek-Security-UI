/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.Log;
import com.waratek.rules.ReflectMethod;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.ReflectMethodPropertiesEditionPart;
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
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public class ReflectMethodPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ReflectMethodPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject reflectMethod, String editing_mode) {
		super(editingContext, reflectMethod, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.ReflectMethod.class;
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
			
			final ReflectMethod reflectMethod = (ReflectMethod)elt;
			final ReflectMethodPropertiesEditionPart basePart = (ReflectMethodPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectMethod.getId()));
			
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectMethod.getComment()));
			
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(reflectMethod, RulesPackage.eINSTANCE.getRule_Action()), reflectMethod.getAction());
			}
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(reflectMethod, RulesPackage.eINSTANCE.getRule_Log()), reflectMethod.getLog());
			}
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.packageName))
				basePart.setPackageName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectMethod.getPackageName()));
			
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.className))
				basePart.setClassName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectMethod.getClassName()));
			
			if (isAccessible(RulesViewsRepository.ReflectMethod.Properties.methodSignature))
				basePart.setMethodSignature(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectMethod.getMethodSignature()));
			
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
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.id) {
			return RulesPackage.eINSTANCE.getRule_Id();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.comment) {
			return RulesPackage.eINSTANCE.getRule_Comment();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.packageName) {
			return RulesPackage.eINSTANCE.getReflection_PackageName();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.className) {
			return RulesPackage.eINSTANCE.getReflectMethod_ClassName();
		}
		if (editorKey == RulesViewsRepository.ReflectMethod.Properties.methodSignature) {
			return RulesPackage.eINSTANCE.getReflectMethod_MethodSignature();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ReflectMethod reflectMethod = (ReflectMethod)semanticObject;
		if (RulesViewsRepository.ReflectMethod.Properties.id == event.getAffectedEditor()) {
			reflectMethod.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectMethod.Properties.comment == event.getAffectedEditor()) {
			reflectMethod.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectMethod.Properties.action == event.getAffectedEditor()) {
			reflectMethod.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.ReflectMethod.Properties.log == event.getAffectedEditor()) {
			reflectMethod.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.ReflectMethod.Properties.packageName == event.getAffectedEditor()) {
			reflectMethod.setPackageName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectMethod.Properties.className == event.getAffectedEditor()) {
			reflectMethod.setClassName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectMethod.Properties.methodSignature == event.getAffectedEditor()) {
			reflectMethod.setMethodSignature((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ReflectMethodPropertiesEditionPart basePart = (ReflectMethodPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectMethod.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectMethod.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ReflectMethod.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ReflectMethod.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getReflection_PackageName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectMethod.Properties.packageName)) {
				if (msg.getNewValue() != null) {
					basePart.setPackageName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPackageName("");
				}
			}
			if (RulesPackage.eINSTANCE.getReflectMethod_ClassName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectMethod.Properties.className)) {
				if (msg.getNewValue() != null) {
					basePart.setClassName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassName("");
				}
			}
			if (RulesPackage.eINSTANCE.getReflectMethod_MethodSignature().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectMethod.Properties.methodSignature)) {
				if (msg.getNewValue() != null) {
					basePart.setMethodSignature(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMethodSignature("");
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
			RulesPackage.eINSTANCE.getRule_Id(),
			RulesPackage.eINSTANCE.getRule_Comment(),
			RulesPackage.eINSTANCE.getRule_Action(),
			RulesPackage.eINSTANCE.getRule_Log(),
			RulesPackage.eINSTANCE.getReflection_PackageName(),
			RulesPackage.eINSTANCE.getReflectMethod_ClassName(),
			RulesPackage.eINSTANCE.getReflectMethod_MethodSignature()		);
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
				if (RulesViewsRepository.ReflectMethod.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.packageName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflection_PackageName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflection_PackageName().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.className == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflectMethod_ClassName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflectMethod_ClassName().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectMethod.Properties.methodSignature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflectMethod_MethodSignature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflectMethod_MethodSignature().getEAttributeType(), newValue);
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
