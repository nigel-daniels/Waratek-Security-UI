/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.Log;
import com.waratek.rules.ReflectClass;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.ReflectClassPropertiesEditionPart;
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
public class ReflectClassPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ReflectClassPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject reflectClass, String editing_mode) {
		super(editingContext, reflectClass, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.ReflectClass.class;
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
			
			final ReflectClass reflectClass = (ReflectClass)elt;
			final ReflectClassPropertiesEditionPart basePart = (ReflectClassPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectClass.getId()));
			
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectClass.getComment()));
			
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(reflectClass, RulesPackage.eINSTANCE.getRule_Action()), reflectClass.getAction());
			}
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(reflectClass, RulesPackage.eINSTANCE.getRule_Log()), reflectClass.getLog());
			}
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.packageName))
				basePart.setPackageName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectClass.getPackageName()));
			
			if (isAccessible(RulesViewsRepository.ReflectClass.Properties.className))
				basePart.setClassName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, reflectClass.getClassName()));
			
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
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.id) {
			return RulesPackage.eINSTANCE.getRule_Id();
		}
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.comment) {
			return RulesPackage.eINSTANCE.getRule_Comment();
		}
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.packageName) {
			return RulesPackage.eINSTANCE.getReflection_PackageName();
		}
		if (editorKey == RulesViewsRepository.ReflectClass.Properties.className) {
			return RulesPackage.eINSTANCE.getReflectClass_ClassName();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ReflectClass reflectClass = (ReflectClass)semanticObject;
		if (RulesViewsRepository.ReflectClass.Properties.id == event.getAffectedEditor()) {
			reflectClass.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectClass.Properties.comment == event.getAffectedEditor()) {
			reflectClass.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectClass.Properties.action == event.getAffectedEditor()) {
			reflectClass.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.ReflectClass.Properties.log == event.getAffectedEditor()) {
			reflectClass.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.ReflectClass.Properties.packageName == event.getAffectedEditor()) {
			reflectClass.setPackageName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ReflectClass.Properties.className == event.getAffectedEditor()) {
			reflectClass.setClassName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ReflectClassPropertiesEditionPart basePart = (ReflectClassPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectClass.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectClass.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ReflectClass.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ReflectClass.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getReflection_PackageName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectClass.Properties.packageName)) {
				if (msg.getNewValue() != null) {
					basePart.setPackageName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPackageName("");
				}
			}
			if (RulesPackage.eINSTANCE.getReflectClass_ClassName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ReflectClass.Properties.className)) {
				if (msg.getNewValue() != null) {
					basePart.setClassName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setClassName("");
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
			RulesPackage.eINSTANCE.getReflectClass_ClassName()		);
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
				if (RulesViewsRepository.ReflectClass.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectClass.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectClass.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectClass.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectClass.Properties.packageName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflection_PackageName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflection_PackageName().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ReflectClass.Properties.className == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getReflectClass_ClassName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getReflectClass_ClassName().getEAttributeType(), newValue);
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
