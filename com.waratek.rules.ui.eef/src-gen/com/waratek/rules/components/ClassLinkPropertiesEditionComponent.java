/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.ClassLink;
import com.waratek.rules.ClassLinkParameter;
import com.waratek.rules.Log;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.ClassLinkPropertiesEditionPart;
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
public class ClassLinkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ClassLinkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject classLink, String editing_mode) {
		super(editingContext, classLink, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.ClassLink.class;
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
			
			final ClassLink classLink = (ClassLink)elt;
			final ClassLinkPropertiesEditionPart basePart = (ClassLinkPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.ClassLink.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(classLink, RulesPackage.eINSTANCE.getRule_Action()), classLink.getAction());
			}
			if (isAccessible(RulesViewsRepository.ClassLink.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(classLink, RulesPackage.eINSTANCE.getRule_Log()), classLink.getLog());
			}
			if (isAccessible(RulesViewsRepository.ClassLink.Properties.classLinkParameter)) {
				basePart.initClassLinkParameter(EEFUtils.choiceOfValues(classLink, RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter()), classLink.getClassLinkParameter());
			}
			if (isAccessible(RulesViewsRepository.ClassLink.Properties.qualifiedName))
				basePart.setQualifiedName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, classLink.getQualifiedName()));
			
			if (isAccessible(RulesViewsRepository.ClassLink.Properties.signature))
				basePart.setSignature(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, classLink.getSignature()));
			
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
		if (editorKey == RulesViewsRepository.ClassLink.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.ClassLink.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.ClassLink.Properties.classLinkParameter) {
			return RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter();
		}
		if (editorKey == RulesViewsRepository.ClassLink.Properties.qualifiedName) {
			return RulesPackage.eINSTANCE.getClassLink_QualifiedName();
		}
		if (editorKey == RulesViewsRepository.ClassLink.Properties.signature) {
			return RulesPackage.eINSTANCE.getClassLink_Signature();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ClassLink classLink = (ClassLink)semanticObject;
		if (RulesViewsRepository.ClassLink.Properties.action == event.getAffectedEditor()) {
			classLink.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.ClassLink.Properties.log == event.getAffectedEditor()) {
			classLink.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.ClassLink.Properties.classLinkParameter == event.getAffectedEditor()) {
			classLink.setClassLinkParameter((ClassLinkParameter)event.getNewValue());
		}
		if (RulesViewsRepository.ClassLink.Properties.qualifiedName == event.getAffectedEditor()) {
			classLink.setQualifiedName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.ClassLink.Properties.signature == event.getAffectedEditor()) {
			classLink.setSignature((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ClassLinkPropertiesEditionPart basePart = (ClassLinkPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ClassLink.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ClassLink.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.ClassLink.Properties.classLinkParameter))
				basePart.setClassLinkParameter((ClassLinkParameter)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getClassLink_QualifiedName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ClassLink.Properties.qualifiedName)) {
				if (msg.getNewValue() != null) {
					basePart.setQualifiedName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setQualifiedName("");
				}
			}
			if (RulesPackage.eINSTANCE.getClassLink_Signature().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.ClassLink.Properties.signature)) {
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
			RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter(),
			RulesPackage.eINSTANCE.getClassLink_QualifiedName(),
			RulesPackage.eINSTANCE.getClassLink_Signature()		);
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
				if (RulesViewsRepository.ClassLink.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ClassLink.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ClassLink.Properties.classLinkParameter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getClassLink_ClassLinkParameter().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ClassLink.Properties.qualifiedName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getClassLink_QualifiedName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getClassLink_QualifiedName().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.ClassLink.Properties.signature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getClassLink_Signature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getClassLink_Signature().getEAttributeType(), newValue);
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
