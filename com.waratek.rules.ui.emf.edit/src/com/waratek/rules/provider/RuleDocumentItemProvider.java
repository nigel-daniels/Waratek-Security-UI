/**
 * Copyright 2014 Waratek Ltd.
 */
package com.waratek.rules.provider;


import com.waratek.rules.RuleDocument;
import com.waratek.rules.RulesFactory;
import com.waratek.rules.RulesPackage;

import com.waratek.rules.Version;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.waratek.rules.RuleDocument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleDocumentItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 Waratek Ltd.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDocumentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleDocument_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleDocument_version_feature", "_UI_RuleDocument_type"),
				 RulesPackage.Literals.RULE_DOCUMENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RulesPackage.Literals.RULE_DOCUMENT__RULES);
			childrenFeatures.add(RulesPackage.Literals.RULE_DOCUMENT__COMMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RuleDocument.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RuleDocument"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RuleDocument_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RuleDocument.class)) {
			case RulesPackage.RULE_DOCUMENT__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RulesPackage.RULE_DOCUMENT__RULES:
			case RulesPackage.RULE_DOCUMENT__COMMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createReflectPackage()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createReflectClass()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createReflectConstructor()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createReflectMethod()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createReflectField()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createThrowableClass()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createClassLink()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createNative()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__RULES,
				 RulesFactory.eINSTANCE.createSQLInjection()));

		newChildDescriptors.add
			(createChildParameter
				(RulesPackage.Literals.RULE_DOCUMENT__COMMENTS,
				 RulesFactory.eINSTANCE.createComment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RulesEditPlugin.INSTANCE;
	}

}
