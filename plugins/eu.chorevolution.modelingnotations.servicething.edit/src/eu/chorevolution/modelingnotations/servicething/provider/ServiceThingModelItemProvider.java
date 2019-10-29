/**
 */
package eu.chorevolution.modelingnotations.servicething.provider;


import eu.chorevolution.modelingnotations.servicething.ServiceThingModel;
import eu.chorevolution.modelingnotations.servicething.ServicethingFactory;
import eu.chorevolution.modelingnotations.servicething.ServicethingPackage;

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
 * This is the item provider adapter for a {@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceThingModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceThingModelItemProvider(AdapterFactory adapterFactory) {
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

			addIDPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addEndpointPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceThingModel_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceThingModel_ID_feature", "_UI_ServiceThingModel_type"),
				 ServicethingPackage.Literals.SERVICE_THING_MODEL__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceThingModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceThingModel_name_feature", "_UI_ServiceThingModel_type"),
				 ServicethingPackage.Literals.SERVICE_THING_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceThingModel_endpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceThingModel_endpoint_feature", "_UI_ServiceThingModel_type"),
				 ServicethingPackage.Literals.SERVICE_THING_MODEL__ENDPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceThingModel_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceThingModel_description_feature", "_UI_ServiceThingModel_type"),
				 ServicethingPackage.Literals.SERVICE_THING_MODEL__DESCRIPTION,
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
			childrenFeatures.add(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION);
			childrenFeatures.add(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION);
			childrenFeatures.add(ServicethingPackage.Literals.SERVICE_THING_MODEL__QOS_DESCRIPTION);
			childrenFeatures.add(ServicethingPackage.Literals.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION);
			childrenFeatures.add(ServicethingPackage.Literals.SERVICE_THING_MODEL__SECURITY_DESCRIPTION);
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
	 * This returns ServiceThingModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceThingModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceThingModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceThingModel_type") :
			getString("_UI_ServiceThingModel_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceThingModel.class)) {
			case ServicethingPackage.SERVICE_THING_MODEL__ID:
			case ServicethingPackage.SERVICE_THING_MODEL__NAME:
			case ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT:
			case ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
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
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createWSDLModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createWADLModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createCOAPModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createIPLTSModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createWSBPELModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__QOS_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createWSLAModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createIdentityModel()));

		newChildDescriptors.add
			(createChildParameter
				(ServicethingPackage.Literals.SERVICE_THING_MODEL__SECURITY_DESCRIPTION,
				 ServicethingFactory.eINSTANCE.createWSSPModel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ServicethingEditPlugin.INSTANCE;
	}

}
