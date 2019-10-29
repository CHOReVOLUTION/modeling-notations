/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.chorevolution/modelingnotations/deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceSpec()
	 * @generated
	 */
	int SERVICE_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__SERVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__NAME = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceDependency()
	 * @generated
	 */
	int SERVICE_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Service Spec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__SERVICE_SPEC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Spec Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE = 1;

	/**
	 * The number of structural features of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl <em>Deployable Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getDeployableServiceSpec()
	 * @generated
	 */
	int DEPLOYABLE_SERVICE_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__DEPENDENCIES = SERVICE_SPEC__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__SERVICE_TYPE = SERVICE_SPEC__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__NAME = SERVICE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__ROLE = SERVICE_SPEC__ROLE;

	/**
	 * The feature id for the '<em><b>Replacement Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE = SERVICE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI = SERVICE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE = SERVICE_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME = SERVICE_SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__PORT = SERVICE_SPEC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cloud Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT = SERVICE_SPEC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES = SERVICE_SPEC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT = SERVICE_SPEC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ha Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT = SERVICE_SPEC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Syslog Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME = SERVICE_SPEC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Deployable Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC_FEATURE_COUNT = SERVICE_SPEC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Deployable Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_SPEC_OPERATION_COUNT = SERVICE_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceSpecImpl <em>Legacy Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceSpecImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyServiceSpec()
	 * @generated
	 */
	int LEGACY_SERVICE_SPEC = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC__DEPENDENCIES = SERVICE_SPEC__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC__SERVICE_TYPE = SERVICE_SPEC__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC__NAME = SERVICE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC__ROLE = SERVICE_SPEC__ROLE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC__URI = SERVICE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legacy Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC_FEATURE_COUNT = SERVICE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legacy Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_SPEC_OPERATION_COUNT = SERVICE_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__UUID = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl <em>Legacy Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyService()
	 * @generated
	 */
	int LEGACY_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE__SERVICE_SPEC = SERVICE__SERVICE_SPEC;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE__UUID = SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE__INSTANCES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE__URI = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Legacy Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Legacy Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl <em>Legacy Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyServiceInstance()
	 * @generated
	 */
	int LEGACY_SERVICE_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_INSTANCE__SERVICE_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_INSTANCE__URI = 1;

	/**
	 * The number of structural features of the '<em>Legacy Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERVICE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographySpecImpl <em>Choreography Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographySpecImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getChoreographySpec()
	 * @generated
	 */
	int CHOREOGRAPHY_SPEC = 7;

	/**
	 * The feature id for the '<em><b>Deployable Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Choreography Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Choreography Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 8;

	/**
	 * The feature id for the '<em><b>Choreography Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CHOREOGRAPHY_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Deployable Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__DEPLOYABLE_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Legacy Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__LEGACY_SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl <em>Deployable Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getDeployableService()
	 * @generated
	 */
	int DEPLOYABLE_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE__SERVICE_SPEC = SERVICE__SERVICE_SPEC;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE__UUID = SERVICE__UUID;

	/**
	 * The feature id for the '<em><b>Cloud Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE__CLOUD_NODES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE__INSTANCES = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deployable Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deployable Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceInstance()
	 * @generated
	 */
	int SERVICE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Cloud Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__CLOUD_NODE = 0;

	/**
	 * The feature id for the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__SERVICE_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__INSTANCE_ID = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__URI = 3;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.CloudNodeImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getCloudNode()
	 * @generated
	 */
	int CLOUD_NODE = 11;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__NODE_ID = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__IP = 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__HOSTNAME = 2;

	/**
	 * The number of structural features of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl <em>Resource Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getResourceImpact()
	 * @generated
	 */
	int RESOURCE_IMPACT = 12;

	/**
	 * The feature id for the '<em><b>Cpu Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT__CPU_IMPACT = 0;

	/**
	 * The feature id for the '<em><b>Ram Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT__RAM_IMPACT = 1;

	/**
	 * The feature id for the '<em><b>Disk Speed Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT__DISK_SPEED_IMPACT = 2;

	/**
	 * The feature id for the '<em><b>Disk Capacity Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT__DISK_CAPACITY_IMPACT = 3;

	/**
	 * The feature id for the '<em><b>Networking Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT__NETWORKING_IMPACT = 4;

	/**
	 * The number of structural features of the '<em>Resource Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_IMPACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes <em>Service Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceTypes()
	 * @generated
	 */
	int SERVICE_TYPES = 13;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.ee.deployment.PackageType <em>Package Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.ee.deployment.PackageType
	 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec
	 * @generated
	 */
	EClass getServiceSpec();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getDependencies()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getServiceType()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EAttribute getServiceSpec_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getName()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EAttribute getServiceSpec_Name();

	/**
	 * Returns the meta object for the attribute list '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getRole()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EAttribute getServiceSpec_Role();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Dependency</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency
	 * @generated
	 */
	EClass getServiceDependency();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecName <em>Service Spec Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Spec Name</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecName()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ServiceSpecName();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecRole <em>Service Spec Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Spec Role</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecRole()
	 * @see #getServiceDependency()
	 * @generated
	 */
	EAttribute getServiceDependency_ServiceSpecRole();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec <em>Deployable Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec
	 * @generated
	 */
	EClass getDeployableServiceSpec();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getReplacementService <em>Replacement Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replacement Service</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getReplacementService()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EReference getDeployableServiceSpec_ReplacementService();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageUri <em>Package Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageUri()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_PackageUri();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Type</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageType()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_PackageType();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getEndpointName <em>Endpoint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Name</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getEndpointName()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_EndpointName();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPort()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_Port();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getCloudAccount <em>Cloud Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Account</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getCloudAccount()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_CloudAccount();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getNumberOfInstances()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_NumberOfInstances();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getResourceImpact <em>Resource Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getResourceImpact()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EReference getDeployableServiceSpec_ResourceImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#isHaDeployment <em>Ha Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ha Deployment</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#isHaDeployment()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_HaDeployment();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getSyslogServerName <em>Syslog Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syslog Server Name</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getSyslogServerName()
	 * @see #getDeployableServiceSpec()
	 * @generated
	 */
	EAttribute getDeployableServiceSpec_SyslogServerName();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec <em>Legacy Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec
	 * @generated
	 */
	EClass getLegacyServiceSpec();

	/**
	 * Returns the meta object for the attribute list '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec#getUri()
	 * @see #getLegacyServiceSpec()
	 * @generated
	 */
	EAttribute getLegacyServiceSpec_Uri();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Service#getServiceSpec()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceSpec();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Service#getUuid()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Uuid();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyService <em>Legacy Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Service</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyService
	 * @generated
	 */
	EClass getLegacyService();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyService#getInstances()
	 * @see #getLegacyService()
	 * @generated
	 */
	EReference getLegacyService_Instances();

	/**
	 * Returns the meta object for the attribute list '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyService#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyService#getUri()
	 * @see #getLegacyService()
	 * @generated
	 */
	EAttribute getLegacyService_Uri();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance <em>Legacy Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Service Instance</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance
	 * @generated
	 */
	EClass getLegacyServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getServiceSpec()
	 * @see #getLegacyServiceInstance()
	 * @generated
	 */
	EReference getLegacyServiceInstance_ServiceSpec();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getUri()
	 * @see #getLegacyServiceInstance()
	 * @generated
	 */
	EAttribute getLegacyServiceInstance_Uri();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec <em>Choreography Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec
	 * @generated
	 */
	EClass getChoreographySpec();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec#getDeployableServices <em>Deployable Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployable Services</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec#getDeployableServices()
	 * @see #getChoreographySpec()
	 * @generated
	 */
	EReference getChoreographySpec_DeployableServices();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getChoreographySpec <em>Choreography Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choreography Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Choreography#getChoreographySpec()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_ChoreographySpec();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getDeployableServices <em>Deployable Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployable Services</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Choreography#getDeployableServices()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_DeployableServices();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getLegacyServices <em>Legacy Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Legacy Services</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Choreography#getLegacyServices()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_LegacyServices();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService <em>Deployable Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Service</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableService
	 * @generated
	 */
	EClass getDeployableService();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getCloudNodes <em>Cloud Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloud Nodes</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getCloudNodes()
	 * @see #getDeployableService()
	 * @generated
	 */
	EReference getDeployableService_CloudNodes();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getInstances()
	 * @see #getDeployableService()
	 * @generated
	 */
	EReference getDeployableService_Instances();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance
	 * @generated
	 */
	EClass getServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getCloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud Node</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getCloudNode()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_CloudNode();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Spec</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getServiceSpec()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_ServiceSpec();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getInstanceId()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EAttribute getServiceInstance_InstanceId();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getUri()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EAttribute getServiceInstance_Uri();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Node</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.CloudNode
	 * @generated
	 */
	EClass getCloudNode();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getNodeId()
	 * @see #getCloudNode()
	 * @generated
	 */
	EAttribute getCloudNode_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getIp()
	 * @see #getCloudNode()
	 * @generated
	 */
	EAttribute getCloudNode_Ip();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getHostname()
	 * @see #getCloudNode()
	 * @generated
	 */
	EAttribute getCloudNode_Hostname();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact <em>Resource Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact
	 * @generated
	 */
	EClass getResourceImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getCpuImpact <em>Cpu Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getCpuImpact()
	 * @see #getResourceImpact()
	 * @generated
	 */
	EAttribute getResourceImpact_CpuImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getRamImpact <em>Ram Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getRamImpact()
	 * @see #getResourceImpact()
	 * @generated
	 */
	EAttribute getResourceImpact_RamImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskSpeedImpact <em>Disk Speed Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Speed Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskSpeedImpact()
	 * @see #getResourceImpact()
	 * @generated
	 */
	EAttribute getResourceImpact_DiskSpeedImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskCapacityImpact <em>Disk Capacity Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Capacity Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskCapacityImpact()
	 * @see #getResourceImpact()
	 * @generated
	 */
	EAttribute getResourceImpact_DiskCapacityImpact();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getNetworkingImpact <em>Networking Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networking Impact</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getNetworkingImpact()
	 * @see #getResourceImpact()
	 * @generated
	 */
	EAttribute getResourceImpact_NetworkingImpact();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes <em>Service Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Types</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes
	 * @generated
	 */
	EEnum getServiceTypes();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.ee.deployment.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Package Type</em>'.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.PackageType
	 * @generated
	 */
	EEnum getPackageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceSpec()
		 * @generated
		 */
		EClass SERVICE_SPEC = eINSTANCE.getServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPEC__DEPENDENCIES = eINSTANCE.getServiceSpec_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPEC__SERVICE_TYPE = eINSTANCE.getServiceSpec_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPEC__NAME = eINSTANCE.getServiceSpec_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPEC__ROLE = eINSTANCE.getServiceSpec_Role();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl <em>Service Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceDependency()
		 * @generated
		 */
		EClass SERVICE_DEPENDENCY = eINSTANCE.getServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Service Spec Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__SERVICE_SPEC_NAME = eINSTANCE.getServiceDependency_ServiceSpecName();

		/**
		 * The meta object literal for the '<em><b>Service Spec Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE = eINSTANCE.getServiceDependency_ServiceSpecRole();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl <em>Deployable Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getDeployableServiceSpec()
		 * @generated
		 */
		EClass DEPLOYABLE_SERVICE_SPEC = eINSTANCE.getDeployableServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Replacement Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE = eINSTANCE.getDeployableServiceSpec_ReplacementService();

		/**
		 * The meta object literal for the '<em><b>Package Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI = eINSTANCE.getDeployableServiceSpec_PackageUri();

		/**
		 * The meta object literal for the '<em><b>Package Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE = eINSTANCE.getDeployableServiceSpec_PackageType();

		/**
		 * The meta object literal for the '<em><b>Endpoint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME = eINSTANCE.getDeployableServiceSpec_EndpointName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__PORT = eINSTANCE.getDeployableServiceSpec_Port();

		/**
		 * The meta object literal for the '<em><b>Cloud Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT = eINSTANCE.getDeployableServiceSpec_CloudAccount();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES = eINSTANCE.getDeployableServiceSpec_NumberOfInstances();

		/**
		 * The meta object literal for the '<em><b>Resource Impact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT = eINSTANCE.getDeployableServiceSpec_ResourceImpact();

		/**
		 * The meta object literal for the '<em><b>Ha Deployment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT = eINSTANCE.getDeployableServiceSpec_HaDeployment();

		/**
		 * The meta object literal for the '<em><b>Syslog Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME = eINSTANCE.getDeployableServiceSpec_SyslogServerName();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceSpecImpl <em>Legacy Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceSpecImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyServiceSpec()
		 * @generated
		 */
		EClass LEGACY_SERVICE_SPEC = eINSTANCE.getLegacyServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERVICE_SPEC__URI = eINSTANCE.getLegacyServiceSpec_Uri();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_SPEC = eINSTANCE.getService_ServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__UUID = eINSTANCE.getService_Uuid();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl <em>Legacy Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyService()
		 * @generated
		 */
		EClass LEGACY_SERVICE = eINSTANCE.getLegacyService();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERVICE__INSTANCES = eINSTANCE.getLegacyService_Instances();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERVICE__URI = eINSTANCE.getLegacyService_Uri();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl <em>Legacy Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getLegacyServiceInstance()
		 * @generated
		 */
		EClass LEGACY_SERVICE_INSTANCE = eINSTANCE.getLegacyServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Service Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERVICE_INSTANCE__SERVICE_SPEC = eINSTANCE.getLegacyServiceInstance_ServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERVICE_INSTANCE__URI = eINSTANCE.getLegacyServiceInstance_Uri();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographySpecImpl <em>Choreography Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographySpecImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getChoreographySpec()
		 * @generated
		 */
		EClass CHOREOGRAPHY_SPEC = eINSTANCE.getChoreographySpec();

		/**
		 * The meta object literal for the '<em><b>Deployable Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES = eINSTANCE.getChoreographySpec_DeployableServices();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '<em><b>Choreography Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__CHOREOGRAPHY_SPEC = eINSTANCE.getChoreography_ChoreographySpec();

		/**
		 * The meta object literal for the '<em><b>Deployable Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__DEPLOYABLE_SERVICES = eINSTANCE.getChoreography_DeployableServices();

		/**
		 * The meta object literal for the '<em><b>Legacy Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__LEGACY_SERVICES = eINSTANCE.getChoreography_LegacyServices();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl <em>Deployable Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getDeployableService()
		 * @generated
		 */
		EClass DEPLOYABLE_SERVICE = eINSTANCE.getDeployableService();

		/**
		 * The meta object literal for the '<em><b>Cloud Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_SERVICE__CLOUD_NODES = eINSTANCE.getDeployableService_CloudNodes();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_SERVICE__INSTANCES = eINSTANCE.getDeployableService_Instances();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceInstance()
		 * @generated
		 */
		EClass SERVICE_INSTANCE = eINSTANCE.getServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Cloud Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__CLOUD_NODE = eINSTANCE.getServiceInstance_CloudNode();

		/**
		 * The meta object literal for the '<em><b>Service Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__SERVICE_SPEC = eINSTANCE.getServiceInstance_ServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE__INSTANCE_ID = eINSTANCE.getServiceInstance_InstanceId();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE__URI = eINSTANCE.getServiceInstance_Uri();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.CloudNodeImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getCloudNode()
		 * @generated
		 */
		EClass CLOUD_NODE = eINSTANCE.getCloudNode();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_NODE__NODE_ID = eINSTANCE.getCloudNode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_NODE__IP = eINSTANCE.getCloudNode_Ip();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_NODE__HOSTNAME = eINSTANCE.getCloudNode_Hostname();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl <em>Resource Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getResourceImpact()
		 * @generated
		 */
		EClass RESOURCE_IMPACT = eINSTANCE.getResourceImpact();

		/**
		 * The meta object literal for the '<em><b>Cpu Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPACT__CPU_IMPACT = eINSTANCE.getResourceImpact_CpuImpact();

		/**
		 * The meta object literal for the '<em><b>Ram Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPACT__RAM_IMPACT = eINSTANCE.getResourceImpact_RamImpact();

		/**
		 * The meta object literal for the '<em><b>Disk Speed Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPACT__DISK_SPEED_IMPACT = eINSTANCE.getResourceImpact_DiskSpeedImpact();

		/**
		 * The meta object literal for the '<em><b>Disk Capacity Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPACT__DISK_CAPACITY_IMPACT = eINSTANCE.getResourceImpact_DiskCapacityImpact();

		/**
		 * The meta object literal for the '<em><b>Networking Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_IMPACT__NETWORKING_IMPACT = eINSTANCE.getResourceImpact_NetworkingImpact();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes <em>Service Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getServiceTypes()
		 * @generated
		 */
		EEnum SERVICE_TYPES = eINSTANCE.getServiceTypes();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.ee.deployment.PackageType <em>Package Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.ee.deployment.PackageType
		 * @see eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentPackageImpl#getPackageType()
		 * @generated
		 */
		EEnum PACKAGE_TYPE = eINSTANCE.getPackageType();

	}

} //DeploymentPackage
