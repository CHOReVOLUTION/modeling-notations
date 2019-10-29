/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.provider;


import eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployableServiceSpecItemProvider extends ServiceSpecItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableServiceSpecItemProvider(AdapterFactory adapterFactory) {
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

			addReplacementServicePropertyDescriptor(object);
			addPackageUriPropertyDescriptor(object);
			addPackageTypePropertyDescriptor(object);
			addEndpointNamePropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addCloudAccountPropertyDescriptor(object);
			addNumberOfInstancesPropertyDescriptor(object);
			addResourceImpactPropertyDescriptor(object);
			addHaDeploymentPropertyDescriptor(object);
			addSyslogServerNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Replacement Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplacementServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_replacementService_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_replacementService_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_packageUri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_packageUri_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_packageType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_packageType_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_endpointName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_endpointName_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_port_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloud Account feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudAccountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_cloudAccount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_cloudAccount_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_numberOfInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_numberOfInstances_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Impact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceImpactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_resourceImpact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_resourceImpact_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ha Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHaDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_haDeployment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_haDeployment_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Syslog Server Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyslogServerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeployableServiceSpec_syslogServerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeployableServiceSpec_syslogServerName_feature", "_UI_DeployableServiceSpec_type"),
				 DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DeployableServiceSpec.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeployableServiceSpec"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeployableServiceSpec)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeployableServiceSpec_type") :
			getString("_UI_DeployableServiceSpec_type") + " " + label;
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

		switch (notification.getFeatureID(DeployableServiceSpec.class)) {
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT:
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
