/**
 * Generated with Acceleo
 */
package com.waratek.rules.components;

// Start of user code for imports
import com.waratek.rules.Action;
import com.waratek.rules.Log;
import com.waratek.rules.Network;
import com.waratek.rules.NetworkParameter;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.parts.NetworkPropertiesEditionPart;
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
public class NetworkPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public NetworkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject network, String editing_mode) {
		super(editingContext, network, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RulesViewsRepository.class;
		partKey = RulesViewsRepository.Network.class;
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
			
			final Network network = (Network)elt;
			final NetworkPropertiesEditionPart basePart = (NetworkPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RulesViewsRepository.Network.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, network.getId()));
			
			if (isAccessible(RulesViewsRepository.Network.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, network.getComment()));
			
			if (isAccessible(RulesViewsRepository.Network.Properties.action)) {
				basePart.initAction(EEFUtils.choiceOfValues(network, RulesPackage.eINSTANCE.getRule_Action()), network.getAction());
			}
			if (isAccessible(RulesViewsRepository.Network.Properties.log)) {
				basePart.initLog(EEFUtils.choiceOfValues(network, RulesPackage.eINSTANCE.getRule_Log()), network.getLog());
			}
			if (isAccessible(RulesViewsRepository.Network.Properties.host))
				basePart.setHost(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, network.getHost()));
			
			if (isAccessible(RulesViewsRepository.Network.Properties.port))
				basePart.setPort(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, network.getPort()));
			
			if (isAccessible(RulesViewsRepository.Network.Properties.networkParameter)) {
				basePart.initNetworkParameter(EEFUtils.choiceOfValues(network, RulesPackage.eINSTANCE.getNetwork_NetworkParameter()), network.getNetworkParameter());
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
		if (editorKey == RulesViewsRepository.Network.Properties.id) {
			return RulesPackage.eINSTANCE.getRule_Id();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.comment) {
			return RulesPackage.eINSTANCE.getRule_Comment();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.action) {
			return RulesPackage.eINSTANCE.getRule_Action();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.log) {
			return RulesPackage.eINSTANCE.getRule_Log();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.host) {
			return RulesPackage.eINSTANCE.getNetwork_Host();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.port) {
			return RulesPackage.eINSTANCE.getNetwork_Port();
		}
		if (editorKey == RulesViewsRepository.Network.Properties.networkParameter) {
			return RulesPackage.eINSTANCE.getNetwork_NetworkParameter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Network network = (Network)semanticObject;
		if (RulesViewsRepository.Network.Properties.id == event.getAffectedEditor()) {
			network.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.Network.Properties.comment == event.getAffectedEditor()) {
			network.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.Network.Properties.action == event.getAffectedEditor()) {
			network.setAction((Action)event.getNewValue());
		}
		if (RulesViewsRepository.Network.Properties.log == event.getAffectedEditor()) {
			network.setLog((Log)event.getNewValue());
		}
		if (RulesViewsRepository.Network.Properties.host == event.getAffectedEditor()) {
			network.setHost((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.Network.Properties.port == event.getAffectedEditor()) {
			network.setPort((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RulesViewsRepository.Network.Properties.networkParameter == event.getAffectedEditor()) {
			network.setNetworkParameter((NetworkParameter)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			NetworkPropertiesEditionPart basePart = (NetworkPropertiesEditionPart)editingPart;
			if (RulesPackage.eINSTANCE.getRule_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Network.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Network.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (RulesPackage.eINSTANCE.getRule_Action().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Network.Properties.action))
				basePart.setAction((Action)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getRule_Log().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Network.Properties.log))
				basePart.setLog((Log)msg.getNewValue());
			
			if (RulesPackage.eINSTANCE.getNetwork_Host().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Network.Properties.host)) {
				if (msg.getNewValue() != null) {
					basePart.setHost(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setHost("");
				}
			}
			if (RulesPackage.eINSTANCE.getNetwork_Port().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RulesViewsRepository.Network.Properties.port)) {
				if (msg.getNewValue() != null) {
					basePart.setPort(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPort("");
				}
			}
			if (RulesPackage.eINSTANCE.getNetwork_NetworkParameter().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RulesViewsRepository.Network.Properties.networkParameter))
				basePart.setNetworkParameter((NetworkParameter)msg.getNewValue());
			
			
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
			RulesPackage.eINSTANCE.getNetwork_Host(),
			RulesPackage.eINSTANCE.getNetwork_Port(),
			RulesPackage.eINSTANCE.getNetwork_NetworkParameter()		);
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
				if (RulesViewsRepository.Network.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Id().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Comment().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.action == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Action().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.log == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getRule_Log().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.host == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getNetwork_Host().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getNetwork_Host().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.port == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getNetwork_Port().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getNetwork_Port().getEAttributeType(), newValue);
				}
				if (RulesViewsRepository.Network.Properties.networkParameter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RulesPackage.eINSTANCE.getNetwork_NetworkParameter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RulesPackage.eINSTANCE.getNetwork_NetworkParameter().getEAttributeType(), newValue);
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
