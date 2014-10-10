/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.forms;

// Start of user code for imports
import com.waratek.rules.parts.RulesViewsRepository;
import com.waratek.rules.parts.SQLInjectionPropertiesEditionPart;

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
public class SQLInjectionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SQLInjectionPropertiesEditionPart {

	protected Text id;
	protected Text comment;
	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected EMFComboViewer database;



	/**
	 * For {@link ISection} use only.
	 */
	public SQLInjectionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SQLInjectionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sQLInjectionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sQLInjectionStep.addStep(RulesViewsRepository.SQLInjection.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.id);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.comment);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.database);
		
		
		composer = new PartComposer(sQLInjectionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.SQLInjection.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.comment) {
					return createCommentText(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.action) {
					return createActionEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.log) {
					return createLogEMFComboViewer(widgetFactory, parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.database) {
					return createDatabaseEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(RulesMessages.SQLInjectionPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, RulesViewsRepository.SQLInjection.Properties.id, RulesMessages.SQLInjectionPropertiesEditionPart_IdLabel);
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
							SQLInjectionPropertiesEditionPartForm.this,
							RulesViewsRepository.SQLInjection.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SQLInjectionPropertiesEditionPartForm.this,
									RulesViewsRepository.SQLInjection.Properties.id,
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
									SQLInjectionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartForm.this, RulesViewsRepository.SQLInjection.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, RulesViewsRepository.SQLInjection.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.id, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.SQLInjection.Properties.comment, RulesMessages.SQLInjectionPropertiesEditionPart_CommentLabel);
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
							SQLInjectionPropertiesEditionPartForm.this,
							RulesViewsRepository.SQLInjection.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SQLInjectionPropertiesEditionPartForm.this,
									RulesViewsRepository.SQLInjection.Properties.comment,
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
									SQLInjectionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartForm.this, RulesViewsRepository.SQLInjection.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, RulesViewsRepository.SQLInjection.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.comment, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

		// End of user code
		return parent;
	}

	
	protected Composite createActionEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.SQLInjection.Properties.action, RulesMessages.SQLInjectionPropertiesEditionPart_ActionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartForm.this, RulesViewsRepository.SQLInjection.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.SQLInjection.Properties.action);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.action, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.SQLInjection.Properties.log, RulesMessages.SQLInjectionPropertiesEditionPart_LogLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartForm.this, RulesViewsRepository.SQLInjection.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.SQLInjection.Properties.log);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.log, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createDatabaseEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RulesViewsRepository.SQLInjection.Properties.database, RulesMessages.SQLInjectionPropertiesEditionPart_DatabaseLabel);
		database = new EMFComboViewer(parent);
		database.setContentProvider(new ArrayContentProvider());
		database.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData databaseData = new GridData(GridData.FILL_HORIZONTAL);
		database.getCombo().setLayoutData(databaseData);
		database.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartForm.this, RulesViewsRepository.SQLInjection.Properties.database, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDatabase()));
			}

		});
		database.setID(RulesViewsRepository.SQLInjection.Properties.database);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.database, RulesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDatabaseEMFComboViewer

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
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getDatabase()
	 * 
	 */
	public Enumerator getDatabase() {
		Enumerator selection = (Enumerator) ((StructuredSelection) database.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#initDatabase(Object input, Enumerator current)
	 */
	public void initDatabase(Object input, Enumerator current) {
		database.setInput(input);
		database.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.database);
		if (eefElementEditorReadOnlyState && database.isEnabled()) {
			database.setEnabled(false);
			database.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !database.isEnabled()) {
			database.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setDatabase(Enumerator newValue)
	 * 
	 */
	public void setDatabase(Enumerator newValue) {
		database.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.database);
		if (eefElementEditorReadOnlyState && database.isEnabled()) {
			database.setEnabled(false);
			database.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !database.isEnabled()) {
			database.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.SQLInjection_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
