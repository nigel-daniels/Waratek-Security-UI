/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import com.waratek.rules.parts.RulesViewsRepository;
import com.waratek.rules.parts.SQLInjectionPropertiesEditionPart;
import com.waratek.rules.providers.RulesMessages;

// End of user code

/**
 * 
 * 
 */
public class SQLInjectionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SQLInjectionPropertiesEditionPart {

	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected EMFComboViewer database;
	protected Button ansiQuotes;
	protected Button noBackslashEscapes;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SQLInjectionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sQLInjectionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sQLInjectionStep.addStep(RulesViewsRepository.SQLInjection.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.database);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.ansiQuotes);
		propertiesStep.addStep(RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes);
		
		
		composer = new PartComposer(sQLInjectionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.SQLInjection.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.action) {
					return createActionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.log) {
					return createLogEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.database) {
					return createDatabaseEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.ansiQuotes) {
					return createAnsiQuotesCheckbox(parent);
				}
				if (key == RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes) {
					return createNoBackslashEscapesCheckbox(parent);
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
		propertiesGroup.setText(RulesMessages.SQLInjectionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createActionEMFComboViewer(Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartImpl.this, RulesViewsRepository.SQLInjection.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.SQLInjection.Properties.action);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.action, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartImpl.this, RulesViewsRepository.SQLInjection.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.SQLInjection.Properties.log);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.log, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createDatabaseEMFComboViewer(Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartImpl.this, RulesViewsRepository.SQLInjection.Properties.database, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDatabase()));
			}

		});
		database.setID(RulesViewsRepository.SQLInjection.Properties.database);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.database, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDatabaseEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createAnsiQuotesCheckbox(Composite parent) {
		ansiQuotes = new Button(parent, SWT.CHECK);
		ansiQuotes.setText(getDescription(RulesViewsRepository.SQLInjection.Properties.ansiQuotes, RulesMessages.SQLInjectionPropertiesEditionPart_AnsiQuotesLabel));
		ansiQuotes.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartImpl.this, RulesViewsRepository.SQLInjection.Properties.ansiQuotes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(ansiQuotes.getSelection())));
			}

		});
		GridData ansiQuotesData = new GridData(GridData.FILL_HORIZONTAL);
		ansiQuotesData.horizontalSpan = 2;
		ansiQuotes.setLayoutData(ansiQuotesData);
		EditingUtils.setID(ansiQuotes, RulesViewsRepository.SQLInjection.Properties.ansiQuotes);
		EditingUtils.setEEFtype(ansiQuotes, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.ansiQuotes, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAnsiQuotesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createNoBackslashEscapesCheckbox(Composite parent) {
		noBackslashEscapes = new Button(parent, SWT.CHECK);
		noBackslashEscapes.setText(getDescription(RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes, RulesMessages.SQLInjectionPropertiesEditionPart_NoBackslashEscapesLabel));
		noBackslashEscapes.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SQLInjectionPropertiesEditionPartImpl.this, RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(noBackslashEscapes.getSelection())));
			}

		});
		GridData noBackslashEscapesData = new GridData(GridData.FILL_HORIZONTAL);
		noBackslashEscapesData.horizontalSpan = 2;
		noBackslashEscapes.setLayoutData(noBackslashEscapesData);
		EditingUtils.setID(noBackslashEscapes, RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes);
		EditingUtils.setEEFtype(noBackslashEscapes, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNoBackslashEscapesCheckbox

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
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getAnsiQuotes()
	 * 
	 */
	public Boolean getAnsiQuotes() {
		return Boolean.valueOf(ansiQuotes.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setAnsiQuotes(Boolean newValue)
	 * 
	 */
	public void setAnsiQuotes(Boolean newValue) {
		if (newValue != null) {
			ansiQuotes.setSelection(newValue.booleanValue());
		} else {
			ansiQuotes.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.ansiQuotes);
		if (eefElementEditorReadOnlyState && ansiQuotes.isEnabled()) {
			ansiQuotes.setEnabled(false);
			ansiQuotes.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ansiQuotes.isEnabled()) {
			ansiQuotes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#getNoBackslashEscapes()
	 * 
	 */
	public Boolean getNoBackslashEscapes() {
		return Boolean.valueOf(noBackslashEscapes.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.SQLInjectionPropertiesEditionPart#setNoBackslashEscapes(Boolean newValue)
	 * 
	 */
	public void setNoBackslashEscapes(Boolean newValue) {
		if (newValue != null) {
			noBackslashEscapes.setSelection(newValue.booleanValue());
		} else {
			noBackslashEscapes.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.SQLInjection.Properties.noBackslashEscapes);
		if (eefElementEditorReadOnlyState && noBackslashEscapes.isEnabled()) {
			noBackslashEscapes.setEnabled(false);
			noBackslashEscapes.setToolTipText(RulesMessages.SQLInjection_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !noBackslashEscapes.isEnabled()) {
			noBackslashEscapes.setEnabled(true);
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
