/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.forms;

// Start of user code for imports
import com.waratek.rules.parts.ReflectFieldPropertiesEditionPart;
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
public class ReflectFieldPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ReflectFieldPropertiesEditionPart {

	protected Text id;
	protected Text comment;
	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected Text packageName;
	protected Text className;
	protected Text fieldName;



	/**
	 * For {@link ISection} use only.
	 */
	public ReflectFieldPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReflectFieldPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence reflectFieldStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = reflectFieldStep.addStep(RulesViewsRepository.ReflectField.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.id);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.comment);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.packageName);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.className);
		propertiesStep.addStep(RulesViewsRepository.ReflectField.Properties.fieldName);
		
		
		composer = new PartComposer(reflectFieldStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.ReflectField.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.comment) {
					return createCommentText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.action) {
					return createActionEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.log) {
					return createLogEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.packageName) {
					return createPackageNameText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.className) {
					return createClassNameText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.ReflectField.Properties.fieldName) {
					return createFieldNameText(widgetFactory, parent);
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
		propertiesSection.setText(RulesMessages.ReflectFieldPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.id, RulesMessages.ReflectFieldPropertiesEditionPart_IdLabel);
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
							ReflectFieldPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectField.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectFieldPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectField.Properties.id,
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
									ReflectFieldPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, RulesViewsRepository.ReflectField.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.id, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.comment, RulesMessages.ReflectFieldPropertiesEditionPart_CommentLabel);
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
							ReflectFieldPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectField.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectFieldPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectField.Properties.comment,
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
									ReflectFieldPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, RulesViewsRepository.ReflectField.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.comment, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

		// End of user code
		return parent;
	}

	
	protected Composite createActionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.action, RulesMessages.ReflectFieldPropertiesEditionPart_ActionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.ReflectField.Properties.action);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.action, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.log, RulesMessages.ReflectFieldPropertiesEditionPart_LogLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.ReflectField.Properties.log);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.log, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPackageNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.packageName, RulesMessages.ReflectFieldPropertiesEditionPart_PackageNameLabel);
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
							ReflectFieldPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectField.Properties.packageName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectFieldPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectField.Properties.packageName,
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
									ReflectFieldPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
				}
			}
		});
		EditingUtils.setID(packageName, RulesViewsRepository.ReflectField.Properties.packageName);
		EditingUtils.setEEFtype(packageName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.packageName, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPackageNameText

		// End of user code
		return parent;
	}

	
	protected Composite createClassNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.className, RulesMessages.ReflectFieldPropertiesEditionPart_ClassNameLabel);
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
							ReflectFieldPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectField.Properties.className,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectFieldPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectField.Properties.className,
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
									ReflectFieldPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.className, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, className.getText()));
				}
			}
		});
		EditingUtils.setID(className, RulesViewsRepository.ReflectField.Properties.className);
		EditingUtils.setEEFtype(className, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.className, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClassNameText

		// End of user code
		return parent;
	}

	
	protected Composite createFieldNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.ReflectField.Properties.fieldName, RulesMessages.ReflectFieldPropertiesEditionPart_FieldNameLabel);
		fieldName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fieldName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fieldNameData = new GridData(GridData.FILL_HORIZONTAL);
		fieldName.setLayoutData(fieldNameData);
		fieldName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ReflectFieldPropertiesEditionPartForm.this,
							RulesViewsRepository.ReflectField.Properties.fieldName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fieldName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ReflectFieldPropertiesEditionPartForm.this,
									RulesViewsRepository.ReflectField.Properties.fieldName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fieldName.getText()));
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
									ReflectFieldPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fieldName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReflectFieldPropertiesEditionPartForm.this, RulesViewsRepository.ReflectField.Properties.fieldName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fieldName.getText()));
				}
			}
		});
		EditingUtils.setID(fieldName, RulesViewsRepository.ReflectField.Properties.fieldName);
		EditingUtils.setEEFtype(fieldName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.ReflectField.Properties.fieldName, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFieldNameText

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
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getPackageName()
	 * 
	 */
	public String getPackageName() {
		return packageName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setPackageName(String newValue)
	 * 
	 */
	public void setPackageName(String newValue) {
		if (newValue != null) {
			packageName.setText(newValue);
		} else {
			packageName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.packageName);
		if (eefElementEditorReadOnlyState && packageName.isEnabled()) {
			packageName.setEnabled(false);
			packageName.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packageName.isEnabled()) {
			packageName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getClassName()
	 * 
	 */
	public String getClassName() {
		return className.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setClassName(String newValue)
	 * 
	 */
	public void setClassName(String newValue) {
		if (newValue != null) {
			className.setText(newValue);
		} else {
			className.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.className);
		if (eefElementEditorReadOnlyState && className.isEnabled()) {
			className.setEnabled(false);
			className.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !className.isEnabled()) {
			className.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#getFieldName()
	 * 
	 */
	public String getFieldName() {
		return fieldName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.ReflectFieldPropertiesEditionPart#setFieldName(String newValue)
	 * 
	 */
	public void setFieldName(String newValue) {
		if (newValue != null) {
			fieldName.setText(newValue);
		} else {
			fieldName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.ReflectField.Properties.fieldName);
		if (eefElementEditorReadOnlyState && fieldName.isEnabled()) {
			fieldName.setEnabled(false);
			fieldName.setToolTipText(RulesMessages.ReflectField_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fieldName.isEnabled()) {
			fieldName.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.ReflectField_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
