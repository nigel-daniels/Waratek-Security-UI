/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.Database;
import com.waratek.rules.Log;
import com.waratek.rules.RulesPackage;
import com.waratek.rules.SQLInjection;

import com.waratek.rules.parts.RulesViewsRepository;
import com.waratek.rules.parts.SQLInjectionPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
public class SQLInjectionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SQLInjectionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sQLInjection, String editing_mode) {
		super(editingContext, sQLInjection, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.SQLInjection.class;
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
			
			final SQLInjection sQLInjection = (SQLInjection)elt;
			final SQLInjectionPropertiesEditionPart basePart = (SQLInjectionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.SQLInjection.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(sQLInjection, RulesPackage.eINSTANCE.getRule_Action()), sQLInjection.getAction());
			}
			if (isAccessible(RulesViewsRepository.SQLInjection.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(sQLInjection, RulesPackage.eINSTANCE.getRule_Log()), sQLInjection.getLog());
			}
			if (isAccessible(RulesViewsRepository.SQLInjection.Properties.database)) {
				basePart.initDatabase(EEFUtils.choiceOfValues(sQLInjection, RulesPackage.eINSTANCE.getSQLInjection_Database()), sQLInjection.getDatabase());
			}
			if (isAccessible(RulesViewsRepository.SQLInjection.Properties.ansiQuotes)) {
				basePart.setAnsiQuotes(sQLInjection.isAnsiQuotes());
			}
			if (isAccessible(RulesViewsRepository.SQLInjection.Properties.noBackSlashEscapes)) {
				basePart.setNoBackSlashEscapes(sQLInjection.isNoBackSlashEscapes());
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
		if (editorKey == RulesViewsRepository.SQLInjection.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.SQLInjection.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.SQLInjection.Properties.database) {
			return RulesPackage.eINSTANCE.getSQLInjection_Database();
		}
		if (editorKey == RulesViewsRepository.SQLInjection.Properties.ansiQuotes) {
			return RulesPackage.eINSTANCE.getSQLInjection_AnsiQuotes();
		}
		if (editorKey == RulesViewsRepository.SQLInjection.Properties.noBackSlashEscapes) {
			return RulesPackage.eINSTANCE.getSQLInjection_NoBackSlashEscapes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SQLInjection sQLInjection = (SQLInjection)semanticObject;
		if (RulesViewsRepository.SQLInjection.Properties.action == event.getAffectedEditor()) {
			sQLInjection.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.SQLInjection.Properties.log == event.getAffectedEditor()) {
			sQLInjection.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.SQLInjection.Properties.database == event.getAffectedEditor()) {
			sQLInjection.setDatabase((Database)event.getNewValue());
		}
		if (RulesViewsRepository.SQLInjection.Properties.ansiQuotes == event.getAffectedEditor()) {
			sQLInjection.setAnsiQuotes((Boolean)event.getNewValue());
		}
		if (RulesViewsRepository.SQLInjection.Properties.noBackSlashEscapes == event.getAffectedEditor()) {
			sQLInjection.setNoBackSlashEscapes((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			SQLInjectionPropertiesEditionPart basePart = (SQLInjectionPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.SQLInjection.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.SQLInjection.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getSQLInjection_Database().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.SQLInjection.Properties.database))
				basePart.setDatabase((Database)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getSQLInjection_AnsiQuotes().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.SQLInjection.Properties.ansiQuotes))
				basePart.setAnsiQuotes((Boolean)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getSQLInjection_NoBackSlashEscapes().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.SQLInjection.Properties.noBackSlashEscapes))
				basePart.setNoBackSlashEscapes((Boolean)msg.getNewValue());
			
			
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
			RulesPackage.eINSTANCE.getSQLInjection_Database(),
			RulesPackage.eINSTANCE.getSQLInjection_AnsiQuotes(),
			RulesPackage.eINSTANCE.getSQLInjection_NoBackSlashEscapes()		);
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
				if (RulesViewsRepository.SQLInjection.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.SQLInjection.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.SQLInjection.Properties.database == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getSQLInjection_Database().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getSQLInjection_Database().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.SQLInjection.Properties.ansiQuotes == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getSQLInjection_AnsiQuotes().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getSQLInjection_AnsiQuotes().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.SQLInjection.Properties.noBackSlashEscapes == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getSQLInjection_NoBackSlashEscapes().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getSQLInjection_NoBackSlashEscapes().getEAttributeType(), newValue);
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
