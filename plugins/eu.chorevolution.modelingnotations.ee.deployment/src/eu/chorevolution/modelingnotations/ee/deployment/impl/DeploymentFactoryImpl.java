/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentFactoryImpl extends EFactoryImpl implements DeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentFactory init() {
		try {
			DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
			if (theDeploymentFactory != null) {
				return theDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentPackage.SERVICE_SPEC: return createServiceSpec();
			case DeploymentPackage.SERVICE_DEPENDENCY: return createServiceDependency();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC: return createDeployableServiceSpec();
			case DeploymentPackage.LEGACY_SERVICE_SPEC: return createLegacyServiceSpec();
			case DeploymentPackage.SERVICE: return createService();
			case DeploymentPackage.LEGACY_SERVICE: return createLegacyService();
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE: return createLegacyServiceInstance();
			case DeploymentPackage.CHOREOGRAPHY_SPEC: return createChoreographySpec();
			case DeploymentPackage.CHOREOGRAPHY: return createChoreography();
			case DeploymentPackage.DEPLOYABLE_SERVICE: return createDeployableService();
			case DeploymentPackage.SERVICE_INSTANCE: return createServiceInstance();
			case DeploymentPackage.CLOUD_NODE: return createCloudNode();
			case DeploymentPackage.RESOURCE_IMPACT: return createResourceImpact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DeploymentPackage.SERVICE_TYPES:
				return createServiceTypesFromString(eDataType, initialValue);
			case DeploymentPackage.PACKAGE_TYPE:
				return createPackageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DeploymentPackage.SERVICE_TYPES:
				return convertServiceTypesToString(eDataType, instanceValue);
			case DeploymentPackage.PACKAGE_TYPE:
				return convertPackageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSpec createServiceSpec() {
		ServiceSpecImpl serviceSpec = new ServiceSpecImpl();
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDependency createServiceDependency() {
		ServiceDependencyImpl serviceDependency = new ServiceDependencyImpl();
		return serviceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableServiceSpec createDeployableServiceSpec() {
		DeployableServiceSpecImpl deployableServiceSpec = new DeployableServiceSpecImpl();
		return deployableServiceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyServiceSpec createLegacyServiceSpec() {
		LegacyServiceSpecImpl legacyServiceSpec = new LegacyServiceSpecImpl();
		return legacyServiceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyService createLegacyService() {
		LegacyServiceImpl legacyService = new LegacyServiceImpl();
		return legacyService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyServiceInstance createLegacyServiceInstance() {
		LegacyServiceInstanceImpl legacyServiceInstance = new LegacyServiceInstanceImpl();
		return legacyServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographySpec createChoreographySpec() {
		ChoreographySpecImpl choreographySpec = new ChoreographySpecImpl();
		return choreographySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableService createDeployableService() {
		DeployableServiceImpl deployableService = new DeployableServiceImpl();
		return deployableService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInstance createServiceInstance() {
		ServiceInstanceImpl serviceInstance = new ServiceInstanceImpl();
		return serviceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNode createCloudNode() {
		CloudNodeImpl cloudNode = new CloudNodeImpl();
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceImpact createResourceImpact() {
		ResourceImpactImpl resourceImpact = new ResourceImpactImpl();
		return resourceImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypes createServiceTypesFromString(EDataType eDataType, String initialValue) {
		ServiceTypes result = ServiceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType createPackageTypeFromString(EDataType eDataType, String initialValue) {
		PackageType result = PackageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentPackage getDeploymentPackage() {
		return (DeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentPackage getPackage() {
		return DeploymentPackage.eINSTANCE;
	}

} //DeploymentFactoryImpl
