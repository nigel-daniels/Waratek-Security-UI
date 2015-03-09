/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
import com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart;
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
public class ReflectConstructorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ReflectConstructorPropertiesEditionPart {

	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected Text packageName;
	protected Text className;
	protected Text constructorSignature;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReflectConstructorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence reflectConstructorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = reflectConstructorStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.packageName);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.className);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.constructorSignature);
		
		
		composer = new PartComposer(reflectConstructorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.ReflectConstructor.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.action) {
					return createActionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.log) {
					return createLogEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.packageName) {
					return createPackageNameText(parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.className) {
					return createClassNameText(parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.constructorSignature) {
					return createConstructorSignatureText(parent);
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
		propertiesGroup.setText(RulesMessages.ReflectConstructorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createActionEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.action, RulesMessages.ReflectConstructorPropertiesEditionPart_ActionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.ReflectConstructor.Properties.action);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.action, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.log, RulesMessages.ReflectConstructorPropertiesEditionPart_LogLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.ReflectConstructor.Properties.log);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.log, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPackageNameText(Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.packageName, RulesMessages.ReflectConstructorPropertiesEditionPart_PackageNameLabel);
		packageName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData packageNameData = new GridData(GridData.FILL_HORIZONTAL);
		packageName.setLayoutData(packageNameData);
		packageName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
			}

		});
		packageName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
				}
			}

		});
		EditingUtils.setID(packageName, RulesViewsRepository.ReflectConstructor.Properties.packageName);
		EditingUtils.setEEFtype(packageName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.packageName, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPackageNameText

		// End of user code
		return parent;
	}

	
	protected Composite createClassNameText(Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.className, RulesMessages.ReflectConstructorPropertiesEditionPart_ClassNameLabel);
		className = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData classNameData = new GridData(GridData.FILL_HORIZONTAL);
		className.setLayoutData(classNameData);
		className.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.className, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
			}

		});
		className.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.className, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
				}
			}

		});
		EditingUtils.setID(className, RulesViewsRepository.ReflectConstructor.Properties.className);
		EditingUtils.setEEFtype(className, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.className, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassNameText

		// End of user code
		return parent;
	}

	
	protected Composite createConstructorSignatureText(Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, RulesMessages.ReflectConstructorPropertiesEditionPart_ConstructorSignatureLabel);
		constructorSignature = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData constructorSignatureData = new GridData(GridData.FILL_HORIZONTAL);
		constructorSignature.setLayoutData(constructorSignatureData);
		constructorSignature.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constructorSignature.getText()));
			}

		});
		constructorSignature.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartImpl.this, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constructorSignature.getText()));
				}
			}

		});
		EditingUtils.setID(constructorSignature, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature);
		EditingUtils.setEEFtype(constructorSignature, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConstructorSignatureText

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
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getPackageName()
	 * 
	 */
	public String getPackageName() {
		return packageName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setPackageName(String newValue)
	 * 
	 */
	public void setPackageName(String newValue) {
		if (newValue != null) {
			packageName.setText(newValue);
		} else {
			packageName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.packageName);
		if (eefElementEditorReadOnlyState && packageName.isEnabled()) {
			packageName.setEnabled(false);
			packageName.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packageName.isEnabled()) {
			packageName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getClassName()
	 * 
	 */
	public String getClassName() {
		return className.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setClassName(String newValue)
	 * 
	 */
	public void setClassName(String newValue) {
		if (newValue != null) {
			className.setText(newValue);
		} else {
			className.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.className);
		if (eefElementEditorReadOnlyState && className.isEnabled()) {
			className.setEnabled(false);
			className.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !className.isEnabled()) {
			className.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getConstructorSignature()
	 * 
	 */
	public String getConstructorSignature() {
		return constructorSignature.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setConstructorSignature(String newValue)
	 * 
	 */
	public void setConstructorSignature(String newValue) {
		if (newValue != null) {
			constructorSignature.setText(newValue);
		} else {
			constructorSignature.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.constructorSignature);
		if (eefElementEditorReadOnlyState && constructorSignature.isEnabled()) {
			constructorSignature.setEnabled(false);
			constructorSignature.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !constructorSignature.isEnabled()) {
			constructorSignature.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.ReflectConstructor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
