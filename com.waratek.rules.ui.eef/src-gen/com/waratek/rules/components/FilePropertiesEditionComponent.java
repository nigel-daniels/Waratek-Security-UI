/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.File;
import com.waratek.rules.FileParameter;
import com.waratek.rules.Log;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.FilePropertiesEditionPart;
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
public class FilePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public FilePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject file, String editing_mode) {
		super(editingContext, file, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.File.class;
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
			
			final File file = (File)elt;
			final FilePropertiesEditionPart basePart = (FilePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.File.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, file.getId()));
			
			if (isAccessible(RulesViewsRepository.File.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, file.getComment()));
			
			if (isAccessible(RulesViewsRepository.File.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(file, RulesPackage.eINSTANCE.getRule_Action()), file.getAction());
			}
			if (isAccessible(RulesViewsRepository.File.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(file, RulesPackage.eINSTANCE.getRule_Log()), file.getLog());
			}
			if (isAccessible(RulesViewsRepository.File.Properties.path))
				basePart.setPath(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, file.getPath()));
			
			if (isAccessible(RulesViewsRepository.File.Properties.fileParameter)) {
				basePart.initFileParameter(EEFUtils.choiceOfValues(file, RulesPackage.eINSTANCE.getFile_FileParameter()), file.getFileParameter());
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
		if (editorKey == RulesViewsRepository.File.Properties.id) {
			return RulesPackage.eINSTANCE.getRule_Id();
		}
		if (editorKey == RulesViewsRepository.File.Properties.comment) {
			return RulesPackage.eINSTANCE.getRule_Comment();
		}
		if (editorKey == RulesViewsRepository.File.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.File.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.File.Properties.path) {
			return RulesPackage.eINSTANCE.getFile_Path();
		}
		if (editorKey == RulesViewsRepository.File.Properties.fileParameter) {
			return RulesPackage.eINSTANCE.getFile_FileParameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		File file = (File)semanticObject;
		if (RulesViewsRepository.File.Properties.id == event.getAffectedEditor()) {
			file.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.File.Properties.comment == event.getAffectedEditor()) {
			file.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.File.Properties.action == event.getAffectedEditor()) {
			file.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.File.Properties.log == event.getAffectedEditor()) {
			file.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.File.Properties.path == event.getAffectedEditor()) {
			file.setPath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.File.Properties.fileParameter == event.getAffectedEditor()) {
			file.setFileParameter((FileParameter)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			FilePropertiesEditionPart basePart = (FilePropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.File.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.File.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.File.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.File.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getFile_Path().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.File.Properties.path)) {
				if (msg.getNewValue() != null) {
					basePart.setPath(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPath("");
				}
			}
			if (RulesPackage.eINSTANCE.getFile_FileParameter().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.File.Properties.fileParameter))
				basePart.setFileParameter((FileParameter)msg.getNewValue());
			
			
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
			RulesPackage.eINSTANCE.getFile_Path(),
			RulesPackage.eINSTANCE.getFile_FileParameter()		);
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
				if (RulesViewsRepository.File.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.File.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.File.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.File.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.File.Properties.path == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getFile_Path().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getFile_Path().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.File.Properties.fileParameter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getFile_FileParameter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getFile_FileParameter().getEAttributeType(), newValue);
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
