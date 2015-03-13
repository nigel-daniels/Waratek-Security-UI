/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
import com.waratek.rules.parts.ClassLinkPropertiesEditionPart;
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
public class ClassLinkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ClassLinkPropertiesEditionPart {

	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected EMFComboViewer classLinkParameter;
	protected Text qualifiedName;
	protected Text signature;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ClassLinkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence classLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = classLinkStep.addStep(RulesViewsRepository.ClassLink.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.ClassLink.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.ClassLink.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.ClassLink.Properties.classLinkParameter);
		propertiesStep.addStep(RulesViewsRepository.ClassLink.Properties.qualifiedName);
		propertiesStep.addStep(RulesViewsRepository.ClassLink.Properties.signature);
		
		
		composer = new PartComposer(classLinkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.ClassLink.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.ClassLink.Properties.action) {
					return createActionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.ClassLink.Properties.log) {
					return createLogEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.ClassLink.Properties.classLinkParameter) {
					return createClassLinkParameterEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.ClassLink.Properties.qualifiedName) {
					return createQualifiedNameText(parent);
				}
				if (key == RulesViewsRepository.ClassLink.Properties.signature) {
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
		propertiesGroup.setText(RulesMessages.ClassLinkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createActionEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.ClassLink.Properties.action, RulesMessages.ClassLinkPropertiesEditionPart_ActionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.ClassLink.Properties.action);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ClassLink.Properties.action, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.ClassLink.Properties.log, RulesMessages.ClassLinkPropertiesEditionPart_LogLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.ClassLink.Properties.log);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ClassLink.Properties.log, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createClassLinkParameterEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.ClassLink.Properties.classLinkParameter, RulesMessages.ClassLinkPropertiesEditionPart_ClassLinkParameterLabel);
		classLinkParameter = new EMFComboViewer(parent);
		classLinkParameter.setContentProvider(new ArrayContentProvider());
		classLinkParameter.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData classLinkParameterData = new GridData(GridData.FILL_HORIZONTAL);
		classLinkParameter.getCombo().setLayoutData(classLinkParameterData);
		classLinkParameter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.classLinkParameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getClassLinkParameter()));
			}

		});
		classLinkParameter.setID(RulesViewsRepository.ClassLink.Properties.classLinkParameter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ClassLink.Properties.classLinkParameter, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassLinkParameterEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createQualifiedNameText(Composite parent) {
		createDescription(parent, RulesViewsRepository.ClassLink.Properties.qualifiedName, RulesMessages.ClassLinkPropertiesEditionPart_QualifiedNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.qualifiedName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.qualifiedName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualifiedName.getText()));
				}
			}

		});
		EditingUtils.setID(qualifiedName, RulesViewsRepository.ClassLink.Properties.qualifiedName);
		EditingUtils.setEEFtype(qualifiedName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ClassLink.Properties.qualifiedName, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createQualifiedNameText

		// End of user code
		return parent;
	}

	
	protected Composite createSignatureText(Composite parent) {
		createDescription(parent, RulesViewsRepository.ClassLink.Properties.signature, RulesMessages.ClassLinkPropertiesEditionPart_SignatureLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.signature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, signature.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClassLinkPropertiesEditionPartImpl.this, RulesViewsRepository.ClassLink.Properties.signature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, signature.getText()));
				}
			}

		});
		EditingUtils.setID(signature, RulesViewsRepository.ClassLink.Properties.signature);
		EditingUtils.setEEFtype(signature, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ClassLink.Properties.signature, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#getClassLinkParameter()
	 * 
	 */
	public Enumerator getClassLinkParameter() {
		Enumerator selection = (Enumerator) ((StructuredSelection) classLinkParameter.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#initClassLinkParameter(Object input, Enumerator current)
	 */
	public void initClassLinkParameter(Object input, Enumerator current) {
		classLinkParameter.setInput(input);
		classLinkParameter.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.classLinkParameter);
		if (eefElementEditorReadOnlyState && classLinkParameter.isEnabled()) {
			classLinkParameter.setEnabled(false);
			classLinkParameter.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !classLinkParameter.isEnabled()) {
			classLinkParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#setClassLinkParameter(Enumerator newValue)
	 * 
	 */
	public void setClassLinkParameter(Enumerator newValue) {
		classLinkParameter.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.classLinkParameter);
		if (eefElementEditorReadOnlyState && classLinkParameter.isEnabled()) {
			classLinkParameter.setEnabled(false);
			classLinkParameter.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !classLinkParameter.isEnabled()) {
			classLinkParameter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#getQualifiedName()
	 * 
	 */
	public String getQualifiedName() {
		return qualifiedName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#setQualifiedName(String newValue)
	 * 
	 */
	public void setQualifiedName(String newValue) {
		if (newValue != null) {
			qualifiedName.setText(newValue);
		} else {
			qualifiedName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.qualifiedName);
		if (eefElementEditorReadOnlyState && qualifiedName.isEnabled()) {
			qualifiedName.setEnabled(false);
			qualifiedName.setToolTipText(RulesMessages.ClassLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !qualifiedName.isEnabled()) {
			qualifiedName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#getSignature()
	 * 
	 */
	public String getSignature() {
		return signature.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ClassLinkPropertiesEditionPart#setSignature(String newValue)
	 * 
	 */
	public void setSignature(String newValue) {
		if (newValue != null) {
			signature.setText(newValue);
		} else {
			signature.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ClassLink.Properties.signature);
		if (eefElementEditorReadOnlyState && signature.isEnabled()) {
			signature.setEnabled(false);
			signature.setToolTipText(RulesMessages.ClassLink_ReadOnly);
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
		return RulesMessages.ClassLink_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
