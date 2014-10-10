/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
import com.waratek.rules.parts.Native_PropertiesEditionPart;
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
 * @author Copyright 2014 Waratek Ltd.
 * 
 */
public class Native_PropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Native_PropertiesEditionPart {

	protected Text id;
	protected Text comment;
	protected EMFComboViewer action;
	protected EMFComboViewer log;
	protected Text path;
	protected Text checksum;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Native_PropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence native_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = native_Step.addStep(RulesViewsRepository.Native_.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.id);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.comment);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.action);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.log);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.path);
		propertiesStep.addStep(RulesViewsRepository.Native_.Properties.checksum);
		
		
		composer = new PartComposer(native_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.Native_.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.id) {
					return createIdText(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.comment) {
					return createCommentText(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.action) {
					return createActionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.log) {
					return createLogEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.path) {
					return createPathText(parent);
				}
				if (key == RulesViewsRepository.Native_.Properties.checksum) {
					return createChecksumText(parent);
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
		propertiesGroup.setText(RulesMessages.Native_PropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.id, RulesMessages.Native_PropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, RulesViewsRepository.Native_.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.id, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.comment, RulesMessages.Native_PropertiesEditionPart_CommentLabel);
		comment = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, RulesViewsRepository.Native_.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.comment, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

		// End of user code
		return parent;
	}

	
	protected Composite createActionEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.action, RulesMessages.Native_PropertiesEditionPart_ActionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.action, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAction()));
			}

		});
		action.setID(RulesViewsRepository.Native_.Properties.action);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.action, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createActionEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLogEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.log, RulesMessages.Native_PropertiesEditionPart_LogLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.log, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLog()));
			}

		});
		log.setID(RulesViewsRepository.Native_.Properties.log);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.log, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createLogEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createPathText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.path, RulesMessages.Native_PropertiesEditionPart_PathLabel);
		path = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData pathData = new GridData(GridData.FILL_HORIZONTAL);
		path.setLayoutData(pathData);
		path.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.path, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, path.getText()));
			}

		});
		path.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.path, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, path.getText()));
				}
			}

		});
		EditingUtils.setID(path, RulesViewsRepository.Native_.Properties.path);
		EditingUtils.setEEFtype(path, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.path, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPathText

		// End of user code
		return parent;
	}

	
	protected Composite createChecksumText(Composite parent) {
		createDescription(parent, RulesViewsRepository.Native_.Properties.checksum, RulesMessages.Native_PropertiesEditionPart_ChecksumLabel);
		checksum = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData checksumData = new GridData(GridData.FILL_HORIZONTAL);
		checksum.setLayoutData(checksumData);
		checksum.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.checksum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, checksum.getText()));
			}

		});
		checksum.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Native_PropertiesEditionPartImpl.this, RulesViewsRepository.Native_.Properties.checksum, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, checksum.getText()));
				}
			}

		});
		EditingUtils.setID(checksum, RulesViewsRepository.Native_.Properties.checksum);
		EditingUtils.setEEFtype(checksum, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.Native_.Properties.checksum, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChecksumText

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
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getAction()
	 * 
	 */
	public Enumerator getAction() {
		Enumerator selection = (Enumerator) ((StructuredSelection) action.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#initAction(Object input, Enumerator current)
	 */
	public void initAction(Object input, Enumerator current) {
		action.setInput(input);
		action.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setAction(Enumerator newValue)
	 * 
	 */
	public void setAction(Enumerator newValue) {
		action.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.action);
		if (eefElementEditorReadOnlyState && action.isEnabled()) {
			action.setEnabled(false);
			action.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !action.isEnabled()) {
			action.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getLog()
	 * 
	 */
	public Enumerator getLog() {
		Enumerator selection = (Enumerator) ((StructuredSelection) log.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#initLog(Object input, Enumerator current)
	 */
	public void initLog(Object input, Enumerator current) {
		log.setInput(input);
		log.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setLog(Enumerator newValue)
	 * 
	 */
	public void setLog(Enumerator newValue) {
		log.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.log);
		if (eefElementEditorReadOnlyState && log.isEnabled()) {
			log.setEnabled(false);
			log.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !log.isEnabled()) {
			log.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getPath()
	 * 
	 */
	public String getPath() {
		return path.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setPath(String newValue)
	 * 
	 */
	public void setPath(String newValue) {
		if (newValue != null) {
			path.setText(newValue);
		} else {
			path.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.path);
		if (eefElementEditorReadOnlyState && path.isEnabled()) {
			path.setEnabled(false);
			path.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !path.isEnabled()) {
			path.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#getChecksum()
	 * 
	 */
	public String getChecksum() {
		return checksum.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.Native_PropertiesEditionPart#setChecksum(String newValue)
	 * 
	 */
	public void setChecksum(String newValue) {
		if (newValue != null) {
			checksum.setText(newValue);
		} else {
			checksum.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.Native_.Properties.checksum);
		if (eefElementEditorReadOnlyState && checksum.isEnabled()) {
			checksum.setEnabled(false);
			checksum.setToolTipText(RulesMessages.Native__ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !checksum.isEnabled()) {
			checksum.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.Native__Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
