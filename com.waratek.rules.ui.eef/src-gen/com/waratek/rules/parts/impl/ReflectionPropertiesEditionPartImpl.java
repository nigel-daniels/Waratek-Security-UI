/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
import com.waratek.rules.parts.ReflectionPropertiesEditionPart;
import com.waratek.rules.parts.RulesViewsRepository;

import com.waratek.rules.providers.RulesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class ReflectionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ReflectionPropertiesEditionPart {

	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected EMFComboViewer reflectionParameter;
	protected Text qualifiedName;
	protected Text signature;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReflectionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence reflectionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = reflectionStep.addStep(RulesViewsRepository.Reflection.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.Reflection.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.Reflection.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.Reflection.Properties.reflectionParameter);
		propertiesStep.addStep(RulesViewsRepository.Reflection.Properties.qualifiedName);
		propertiesStep.addStep(RulesViewsRepository.Reflection.Properties.signature);
		
		
		composer = new PartComposer(reflectionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.Reflection.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.Reflection.Properties.action) {
					return createActionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.Reflection.Properties.log) {
					return createLogEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.Reflection.Properties.reflectionParameter) {
					return createReflectionParameterEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.Reflection.Properties.qualifiedName) {
					return createQualifiedNameText(parent);
				}
				if (key == RulesViewsRepository.Reflection.Properties.signature) {
					return createSignatureText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(RulesMessages.ReflectionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createActionEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.Reflection.Properties.action, RulesMessages.ReflectionPropertiesEditionPart_ActionLabel);
		action = new EMFComboViewer(parent);
		action.setContentProvider(new ArrayContentProvider());
		action.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData actionData = new GridData(GridData.FILL_HORIZONTAL);
		action.getCombo().setLayoutData(actionData);
		action.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.Reflection.Properties.action);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Reflection.Properties.action, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.Reflection.Properties.log, RulesMessages.ReflectionPropertiesEditionPart_LogLabel);
		log = new EMFComboViewer(parent);
		log.setContentProvider(new ArrayContentProvider());
		log.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData logData = new GridData(GridData.FILL_HORIZONTAL);
		log.getCombo().setLayoutData(logData);
		log.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.Reflection.Properties.log);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Reflection.Properties.log, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createReflectionParameterEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.Reflection.Properties.reflectionParameter, RulesMessages.ReflectionPropertiesEditionPart_ReflectionParameterLabel);
		reflectionParameter = new EMFComboViewer(parent);
		reflectionParameter.setContentProvider(new ArrayContentProvider());
		reflectionParameter.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData reflectionParameterData = new GridData(GridData.FILL_HORIZONTAL);
		reflectionParameter.getCombo().setLayoutData(reflectionParameterData);
		reflectionParameter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.reflectionParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReflectionParameter()));
			}

		});
		reflectionParameter.setID(RulesViewsRepository.Reflection.Properties.reflectionParameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Reflection.Properties.reflectionParameter, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createReflectionParameterEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQualifiedNameText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Reflection.Properties.qualifiedName, RulesMessages.ReflectionPropertiesEditionPart_QualifiedNameLabel);
		qualifiedName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData qualifiedNameData = new GridData(GridData.FILL_HORIZONTAL);
		qualifiedName.setLayoutData(qualifiedNameData);
		qualifiedName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.qualifiedName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedName.getText()));
			}

		});
		qualifiedName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.qualifiedName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedName.getText()));
				}
			}

		});
		EditingUtils.setID(qualifiedName, RulesViewsRepository.Reflection.Properties.qualifiedName);
		EditingUtils.setEEFtype(qualifiedName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Reflection.Properties.qualifiedName, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createQualifiedNameText

		// End of user code
		return parent;
	}

	
	protected Composite createSignatureText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Reflection.Properties.signature, RulesMessages.ReflectionPropertiesEditionPart_SignatureLabel);
		signature = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData signatureData = new GridData(GridData.FILL_HORIZONTAL);
		signature.setLayoutData(signatureData);
		signature.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.signature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, signature.getText()));
			}

		});
		signature.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectionPropertiesEditionPartImpl.this, RulesViewsRepository.Reflection.Properties.signature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, signature.getText()));
				}
			}

		});
		EditingUtils.setID(signature, RulesViewsRepository.Reflection.Properties.signature);
		EditingUtils.setEEFtype(signature, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Reflection.Properties.signature, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSignatureText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#getReflectionParameter()
	 * 
	 */
	public Enumerator getReflectionParameter() {
		Enumerator selection = (Enumerator) ((StructuredSelection) reflectionParameter.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#initReflectionParameter(Object input, Enumerator current)
	 */
	public void initReflectionParameter(Object input, Enumerator current) {
		reflectionParameter.setInput(input);
		reflectionParameter.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.reflectionParameter);
		if (eefElementEditorReadOnlyState && reflectionParameter.isEnabled()) {
			reflectionParameter.setEnabled(false);
			reflectionParameter.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reflectionParameter.isEnabled()) {
			reflectionParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#setReflectionParameter(Enumerator newValue)
	 * 
	 */
	public void setReflectionParameter(Enumerator newValue) {
		reflectionParameter.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.reflectionParameter);
		if (eefElementEditorReadOnlyState && reflectionParameter.isEnabled()) {
			reflectionParameter.setEnabled(false);
			reflectionParameter.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reflectionParameter.isEnabled()) {
			reflectionParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#getQualifiedName()
	 * 
	 */
	public String getQualifiedName() {
		return qualifiedName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#setQualifiedName(String newValue)
	 * 
	 */
	public void setQualifiedName(String newValue) {
		if (newValue != null) {
			qualifiedName.setText(newValue);
		} else {
			qualifiedName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.qualifiedName);
		if (eefElementEditorReadOnlyState && qualifiedName.isEnabled()) {
			qualifiedName.setEnabled(false);
			qualifiedName.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !qualifiedName.isEnabled()) {
			qualifiedName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#getSignature()
	 * 
	 */
	public String getSignature() {
		return signature.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectionPropertiesEditionPart#setSignature(String newValue)
	 * 
	 */
	public void setSignature(String newValue) {
		if (newValue != null) {
			signature.setText(newValue);
		} else {
			signature.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Reflection.Properties.signature);
		if (eefElementEditorReadOnlyState && signature.isEnabled()) {
			signature.setEnabled(false);
			signature.setToolTipText(RulesMessages.Reflection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !signature.isEnabled()) {
			signature.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.Reflection_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
