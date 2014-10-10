/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.forms;

// Start of user code for imports
import com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart;
import com.waratek.rules.parts.RulesViewsRepository;

import com.waratek.rules.providers.RulesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public class ReflectConstructorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ReflectConstructorPropertiesEditionPart {

	protected Text id;
	protected Text comment;
	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected Text packageName;
	protected Text className;
	protected Text constructorSignature;



	/**
	 * For {@link ISection} use only.
	 */
	public ReflectConstructorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReflectConstructorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence reflectConstructorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = reflectConstructorStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.id);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.comment);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.packageName);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.className);
		propertiesStep.addStep(RulesViewsRepository.ReflectConstructor.Properties.constructorSignature);
		
		
		composer = new PartComposer(reflectConstructorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.ReflectConstructor.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.comment) {
					return createCommentText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.action) {
					return createActionEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.log) {
					return createLogEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.packageName) {
					return createPackageNameText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.className) {
					return createClassNameText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectConstructor.Properties.constructorSignature) {
					return createConstructorSignatureText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(RulesMessages.ReflectConstructorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.id, RulesMessages.ReflectConstructorPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectConstructorPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectConstructor.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectConstructor.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, RulesViewsRepository.ReflectConstructor.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.id, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.comment, RulesMessages.ReflectConstructorPropertiesEditionPart_CommentLabel);
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectConstructorPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectConstructor.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectConstructor.Properties.comment,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comment.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, RulesViewsRepository.ReflectConstructor.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.comment, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

		// End of user code
		return parent;
	}

	
	protected Composite createActionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.ReflectConstructor.Properties.action);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.action, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.ReflectConstructor.Properties.log);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.log, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPackageNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.packageName, RulesMessages.ReflectConstructorPropertiesEditionPart_PackageNameLabel);
		packageName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		packageName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData packageNameData = new GridData(GridData.FILL_HORIZONTAL);
		packageName.setLayoutData(packageNameData);
		packageName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectConstructorPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectConstructor.Properties.packageName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectConstructor.Properties.packageName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, packageName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		packageName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
				}
			}
		});
		EditingUtils.setID(packageName, RulesViewsRepository.ReflectConstructor.Properties.packageName);
		EditingUtils.setEEFtype(packageName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.packageName, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPackageNameText

		// End of user code
		return parent;
	}

	
	protected Composite createClassNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.className, RulesMessages.ReflectConstructorPropertiesEditionPart_ClassNameLabel);
		className = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		className.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData classNameData = new GridData(GridData.FILL_HORIZONTAL);
		className.setLayoutData(classNameData);
		className.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectConstructorPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectConstructor.Properties.className,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectConstructor.Properties.className,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, className.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		className.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.className, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
				}
			}
		});
		EditingUtils.setID(className, RulesViewsRepository.ReflectConstructor.Properties.className);
		EditingUtils.setEEFtype(className, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.className, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassNameText

		// End of user code
		return parent;
	}

	
	protected Composite createConstructorSignatureText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, RulesMessages.ReflectConstructorPropertiesEditionPart_ConstructorSignatureLabel);
		constructorSignature = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		constructorSignature.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData constructorSignatureData = new GridData(GridData.FILL_HORIZONTAL);
		constructorSignature.setLayoutData(constructorSignatureData);
		constructorSignature.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectConstructorPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectConstructor.Properties.constructorSignature,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constructorSignature.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectConstructor.Properties.constructorSignature,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, constructorSignature.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectConstructorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		constructorSignature.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectConstructorPropertiesEditionPartForm.this, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constructorSignature.getText()));
				}
			}
		});
		EditingUtils.setID(constructorSignature, RulesViewsRepository.ReflectConstructor.Properties.constructorSignature);
		EditingUtils.setEEFtype(constructorSignature, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectConstructor.Properties.constructorSignature, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectConstructorPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectConstructor.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(RulesMessages.ReflectConstructor_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
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
