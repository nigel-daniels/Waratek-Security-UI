/**
 * Generated with Acceleo
 */
package com.waratek.rules.parts.impl;

// Start of user code for imports
import com.waratek.rules.parts.RuleDocumentPropertiesEditionPart;
import com.waratek.rules.parts.RulesViewsRepository;

import com.waratek.rules.providers.RulesMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class RuleDocumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RuleDocumentPropertiesEditionPart {

	protected EMFComboViewer version;
	protected ReferencesTable lines;
	protected List<ViewerFilter> linesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RuleDocumentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ruleDocumentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ruleDocumentStep.addStep(RulesViewsRepository.RuleDocument.Properties.class);
		propertiesStep.addStep(RulesViewsRepository.RuleDocument.Properties.version);
		propertiesStep.addStep(RulesViewsRepository.RuleDocument.Properties.lines);
		
		
		composer = new PartComposer(ruleDocumentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RulesViewsRepository.RuleDocument.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RulesViewsRepository.RuleDocument.Properties.version) {
					return createVersionEMFComboViewer(parent);
				}
				if (key == RulesViewsRepository.RuleDocument.Properties.lines) {
					return createLinesAdvancedTableComposition(parent);
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
		propertiesGroup.setText(RulesMessages.RuleDocumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createVersionEMFComboViewer(Composite parent) {
		createDescription(parent, RulesViewsRepository.RuleDocument.Properties.version, RulesMessages.RuleDocumentPropertiesEditionPart_VersionLabel);
		version = new EMFComboViewer(parent);
		version.setContentProvider(new ArrayContentProvider());
		version.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.getCombo().setLayoutData(versionData);
		version.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVersion()));
			}

		});
		version.setID(RulesViewsRepository.RuleDocument.Properties.version);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RulesViewsRepository.RuleDocument.Properties.version, RulesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLinesAdvancedTableComposition(Composite parent) {
		this.lines = new ReferencesTable(getDescription(RulesViewsRepository.RuleDocument.Properties.lines, RulesMessages.RuleDocumentPropertiesEditionPart_LinesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.lines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				lines.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.lines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				lines.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.lines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				lines.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.lines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				lines.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.linesFilters) {
			this.lines.addFilter(filter);
		}
		this.lines.setHelpText(propertiesEditionComponent.getHelpContent(RulesViewsRepository.RuleDocument.Properties.lines, RulesViewsRepository.SWT_KIND));
		this.lines.createControls(parent);
		this.lines.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RuleDocumentPropertiesEditionPartImpl.this, RulesViewsRepository.RuleDocument.Properties.lines, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linesData = new GridData(GridData.FILL_HORIZONTAL);
		linesData.horizontalSpan = 3;
		this.lines.setLayoutData(linesData);
		this.lines.setLowerBound(0);
		this.lines.setUpperBound(-1);
		lines.setID(RulesViewsRepository.RuleDocument.Properties.lines);
		lines.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createLinesAdvancedTableComposition

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
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#getVersion()
	 * 
	 */
	public Enumerator getVersion() {
		Enumerator selection = (Enumerator) ((StructuredSelection) version.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#initVersion(Object input, Enumerator current)
	 */
	public void initVersion(Object input, Enumerator current) {
		version.setInput(input);
		version.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.RuleDocument.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(RulesMessages.RuleDocument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#setVersion(Enumerator newValue)
	 * 
	 */
	public void setVersion(Enumerator newValue) {
		version.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.RuleDocument.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(RulesMessages.RuleDocument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#initLines(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLines(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		lines.setContentProvider(contentProvider);
		lines.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(RulesViewsRepository.RuleDocument.Properties.lines);
		if (eefElementEditorReadOnlyState && lines.isEnabled()) {
			lines.setEnabled(false);
			lines.setToolTipText(RulesMessages.RuleDocument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lines.isEnabled()) {
			lines.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#updateLines()
	 * 
	 */
	public void updateLines() {
	lines.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#addFilterLines(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLines(ViewerFilter filter) {
		linesFilters.add(filter);
		if (this.lines != null) {
			this.lines.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#addBusinessFilterLines(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLines(ViewerFilter filter) {
		linesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.waratek.rules.parts.RuleDocumentPropertiesEditionPart#isContainedInLinesTable(EObject element)
	 * 
	 */
	public boolean isContainedInLinesTable(EObject element) {
		return ((ReferencesTableSettings)lines.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RulesMessages.RuleDocument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
