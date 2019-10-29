/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.Choreography;
import eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec;
import eu.chorevolution.modelingnotations.ee.deployment.CloudNode;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableService;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentFactory;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyService;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.PackageType;
import eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact;
import eu.chorevolution.modelingnotations.ee.deployment.Service;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableServiceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyServiceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceImpactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packageTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeploymentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSpec() {
		return serviceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSpec_Dependencies() {
		return (EReference)serviceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSpec_ServiceType() {
		return (EAttribute)serviceSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSpec_Name() {
		return (EAttribute)serviceSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSpec_Role() {
		return (EAttribute)serviceSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDependency() {
		return serviceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_ServiceSpecName() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDependency_ServiceSpecRole() {
		return (EAttribute)serviceDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployableServiceSpec() {
		return deployableServiceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployableServiceSpec_ReplacementService() {
		return (EReference)deployableServiceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_PackageUri() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_PackageType() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_EndpointName() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_Port() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_CloudAccount() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_NumberOfInstances() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployableServiceSpec_ResourceImpact() {
		return (EReference)deployableServiceSpecEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_HaDeployment() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployableServiceSpec_SyslogServerName() {
		return (EAttribute)deployableServiceSpecEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyServiceSpec() {
		return legacyServiceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyServiceSpec_Uri() {
		return (EAttribute)legacyServiceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceSpec() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Uuid() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyService() {
		return legacyServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyService_Instances() {
		return (EReference)legacyServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyService_Uri() {
		return (EAttribute)legacyServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyServiceInstance() {
		return legacyServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegacyServiceInstance_ServiceSpec() {
		return (EReference)legacyServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyServiceInstance_Uri() {
		return (EAttribute)legacyServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreographySpec() {
		return choreographySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreographySpec_DeployableServices() {
		return (EReference)choreographySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreography() {
		return choreographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_ChoreographySpec() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_DeployableServices() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_LegacyServices() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployableService() {
		return deployableServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployableService_CloudNodes() {
		return (EReference)deployableServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployableService_Instances() {
		return (EReference)deployableServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInstance() {
		return serviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_CloudNode() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInstance_ServiceSpec() {
		return (EReference)serviceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInstance_InstanceId() {
		return (EAttribute)serviceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInstance_Uri() {
		return (EAttribute)serviceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudNode() {
		return cloudNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudNode_NodeId() {
		return (EAttribute)cloudNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudNode_Ip() {
		return (EAttribute)cloudNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudNode_Hostname() {
		return (EAttribute)cloudNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceImpact() {
		return resourceImpactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceImpact_CpuImpact() {
		return (EAttribute)resourceImpactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceImpact_RamImpact() {
		return (EAttribute)resourceImpactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceImpact_DiskSpeedImpact() {
		return (EAttribute)resourceImpactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceImpact_DiskCapacityImpact() {
		return (EAttribute)resourceImpactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceImpact_NetworkingImpact() {
		return (EAttribute)resourceImpactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceTypes() {
		return serviceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackageType() {
		return packageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceSpecEClass = createEClass(SERVICE_SPEC);
		createEReference(serviceSpecEClass, SERVICE_SPEC__DEPENDENCIES);
		createEAttribute(serviceSpecEClass, SERVICE_SPEC__SERVICE_TYPE);
		createEAttribute(serviceSpecEClass, SERVICE_SPEC__NAME);
		createEAttribute(serviceSpecEClass, SERVICE_SPEC__ROLE);

		serviceDependencyEClass = createEClass(SERVICE_DEPENDENCY);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__SERVICE_SPEC_NAME);
		createEAttribute(serviceDependencyEClass, SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE);

		deployableServiceSpecEClass = createEClass(DEPLOYABLE_SERVICE_SPEC);
		createEReference(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__PORT);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES);
		createEReference(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT);
		createEAttribute(deployableServiceSpecEClass, DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME);

		legacyServiceSpecEClass = createEClass(LEGACY_SERVICE_SPEC);
		createEAttribute(legacyServiceSpecEClass, LEGACY_SERVICE_SPEC__URI);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SERVICE_SPEC);
		createEAttribute(serviceEClass, SERVICE__UUID);

		legacyServiceEClass = createEClass(LEGACY_SERVICE);
		createEReference(legacyServiceEClass, LEGACY_SERVICE__INSTANCES);
		createEAttribute(legacyServiceEClass, LEGACY_SERVICE__URI);

		legacyServiceInstanceEClass = createEClass(LEGACY_SERVICE_INSTANCE);
		createEReference(legacyServiceInstanceEClass, LEGACY_SERVICE_INSTANCE__SERVICE_SPEC);
		createEAttribute(legacyServiceInstanceEClass, LEGACY_SERVICE_INSTANCE__URI);

		choreographySpecEClass = createEClass(CHOREOGRAPHY_SPEC);
		createEReference(choreographySpecEClass, CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES);

		choreographyEClass = createEClass(CHOREOGRAPHY);
		createEReference(choreographyEClass, CHOREOGRAPHY__CHOREOGRAPHY_SPEC);
		createEReference(choreographyEClass, CHOREOGRAPHY__DEPLOYABLE_SERVICES);
		createEReference(choreographyEClass, CHOREOGRAPHY__LEGACY_SERVICES);

		deployableServiceEClass = createEClass(DEPLOYABLE_SERVICE);
		createEReference(deployableServiceEClass, DEPLOYABLE_SERVICE__CLOUD_NODES);
		createEReference(deployableServiceEClass, DEPLOYABLE_SERVICE__INSTANCES);

		serviceInstanceEClass = createEClass(SERVICE_INSTANCE);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__CLOUD_NODE);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__SERVICE_SPEC);
		createEAttribute(serviceInstanceEClass, SERVICE_INSTANCE__INSTANCE_ID);
		createEAttribute(serviceInstanceEClass, SERVICE_INSTANCE__URI);

		cloudNodeEClass = createEClass(CLOUD_NODE);
		createEAttribute(cloudNodeEClass, CLOUD_NODE__NODE_ID);
		createEAttribute(cloudNodeEClass, CLOUD_NODE__IP);
		createEAttribute(cloudNodeEClass, CLOUD_NODE__HOSTNAME);

		resourceImpactEClass = createEClass(RESOURCE_IMPACT);
		createEAttribute(resourceImpactEClass, RESOURCE_IMPACT__CPU_IMPACT);
		createEAttribute(resourceImpactEClass, RESOURCE_IMPACT__RAM_IMPACT);
		createEAttribute(resourceImpactEClass, RESOURCE_IMPACT__DISK_SPEED_IMPACT);
		createEAttribute(resourceImpactEClass, RESOURCE_IMPACT__DISK_CAPACITY_IMPACT);
		createEAttribute(resourceImpactEClass, RESOURCE_IMPACT__NETWORKING_IMPACT);

		// Create enums
		serviceTypesEEnum = createEEnum(SERVICE_TYPES);
		packageTypeEEnum = createEEnum(PACKAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deployableServiceSpecEClass.getESuperTypes().add(this.getServiceSpec());
		legacyServiceSpecEClass.getESuperTypes().add(this.getServiceSpec());
		legacyServiceEClass.getESuperTypes().add(this.getService());
		deployableServiceEClass.getESuperTypes().add(this.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceSpecEClass, ServiceSpec.class, "ServiceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSpec_Dependencies(), this.getServiceDependency(), null, "dependencies", null, 0, -1, ServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSpec_ServiceType(), this.getServiceTypes(), "serviceType", "SOAP", 1, 1, ServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSpec_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSpec_Role(), ecorePackage.getEString(), "role", "", 0, -1, ServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDependencyEClass, ServiceDependency.class, "ServiceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDependency_ServiceSpecName(), ecorePackage.getEString(), "serviceSpecName", null, 1, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDependency_ServiceSpecRole(), ecorePackage.getEString(), "serviceSpecRole", null, 1, 1, ServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableServiceSpecEClass, DeployableServiceSpec.class, "DeployableServiceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployableServiceSpec_ReplacementService(), this.getServiceSpec(), null, "replacementService", null, 0, -1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_PackageUri(), ecorePackage.getEString(), "packageUri", "", 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_PackageType(), this.getPackageType(), "packageType", "TOMCAT", 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_EndpointName(), ecorePackage.getEString(), "endpointName", "", 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_Port(), ecorePackage.getEInt(), "port", "1", 0, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_CloudAccount(), ecorePackage.getEString(), "cloudAccount", null, 0, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", "1", 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployableServiceSpec_ResourceImpact(), this.getResourceImpact(), null, "resourceImpact", null, 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_HaDeployment(), ecorePackage.getEBoolean(), "haDeployment", "false", 1, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployableServiceSpec_SyslogServerName(), ecorePackage.getEString(), "syslogServerName", null, 0, 1, DeployableServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyServiceSpecEClass, LegacyServiceSpec.class, "LegacyServiceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyServiceSpec_Uri(), ecorePackage.getEString(), "uri", null, 1, -1, LegacyServiceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_ServiceSpec(), this.getServiceSpec(), null, "serviceSpec", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyServiceEClass, LegacyService.class, "LegacyService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyService_Instances(), this.getLegacyServiceInstance(), null, "instances", null, 0, -1, LegacyService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyService_Uri(), ecorePackage.getEString(), "uri", null, 1, -1, LegacyService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyServiceInstanceEClass, LegacyServiceInstance.class, "LegacyServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLegacyServiceInstance_ServiceSpec(), this.getLegacyServiceSpec(), null, "serviceSpec", null, 1, 1, LegacyServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegacyServiceInstance_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, LegacyServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographySpecEClass, ChoreographySpec.class, "ChoreographySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreographySpec_DeployableServices(), this.getDeployableServiceSpec(), null, "deployableServices", null, 0, -1, ChoreographySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreography_ChoreographySpec(), this.getChoreographySpec(), null, "choreographySpec", null, 1, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_DeployableServices(), this.getDeployableService(), null, "deployableServices", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_LegacyServices(), this.getLegacyService(), null, "legacyServices", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployableServiceEClass, DeployableService.class, "DeployableService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployableService_CloudNodes(), this.getCloudNode(), null, "cloudNodes", null, 0, -1, DeployableService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployableService_Instances(), this.getServiceInstance(), null, "instances", null, 0, -1, DeployableService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInstanceEClass, ServiceInstance.class, "ServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInstance_CloudNode(), this.getCloudNode(), null, "cloudNode", null, 1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInstance_ServiceSpec(), this.getDeployableServiceSpec(), null, "serviceSpec", null, 1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInstance_InstanceId(), ecorePackage.getEString(), "instanceId", null, 1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInstance_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudNodeEClass, CloudNode.class, "CloudNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudNode_NodeId(), ecorePackage.getEString(), "nodeId", null, 1, 1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudNode_Ip(), ecorePackage.getEString(), "ip", null, 1, 1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudNode_Hostname(), ecorePackage.getEString(), "hostname", null, 1, 1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceImpactEClass, ResourceImpact.class, "ResourceImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceImpact_CpuImpact(), ecorePackage.getEInt(), "cpuImpact", "1", 1, 1, ResourceImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceImpact_RamImpact(), ecorePackage.getEInt(), "ramImpact", "1", 1, 1, ResourceImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceImpact_DiskSpeedImpact(), ecorePackage.getEInt(), "diskSpeedImpact", "1", 1, 1, ResourceImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceImpact_DiskCapacityImpact(), ecorePackage.getEInt(), "diskCapacityImpact", "1", 1, 1, ResourceImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceImpact_NetworkingImpact(), ecorePackage.getEInt(), "networkingImpact", "1", 1, 1, ResourceImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceTypesEEnum, ServiceTypes.class, "ServiceTypes");
		addEEnumLiteral(serviceTypesEEnum, ServiceTypes.SOAP);
		addEEnumLiteral(serviceTypesEEnum, ServiceTypes.REST);
		addEEnumLiteral(serviceTypesEEnum, ServiceTypes.COAP);

		initEEnum(packageTypeEEnum, PackageType.class, "PackageType");
		addEEnumLiteral(packageTypeEEnum, PackageType.COMMAND_LINE);
		addEEnumLiteral(packageTypeEEnum, PackageType.TOMCAT);

		// Create resource
		createResource(eNS_URI);
	}

} //DeploymentPackageImpl
