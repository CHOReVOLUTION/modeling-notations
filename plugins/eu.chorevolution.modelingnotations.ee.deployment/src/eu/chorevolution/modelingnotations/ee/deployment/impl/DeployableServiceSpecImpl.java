/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.PackageType;
import eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployable Service Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getReplacementService <em>Replacement Service</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getPackageUri <em>Package Uri</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getCloudAccount <em>Cloud Account</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getResourceImpact <em>Resource Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#isHaDeployment <em>Ha Deployment</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceSpecImpl#getSyslogServerName <em>Syslog Server Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployableServiceSpecImpl extends ServiceSpecImpl implements DeployableServiceSpec {
	/**
	 * The cached value of the '{@link #getReplacementService() <em>Replacement Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementService()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceSpec> replacementService;

	/**
	 * The default value of the '{@link #getPackageUri() <em>Package Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageUri()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_URI_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPackageUri() <em>Package Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageUri()
	 * @generated
	 * @ordered
	 */
	protected String packageUri = PACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final PackageType PACKAGE_TYPE_EDEFAULT = PackageType.TOMCAT;

	/**
	 * The cached value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected PackageType packageType = PACKAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected String endpointName = ENDPOINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudAccount() <em>Cloud Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudAccount() <em>Cloud Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudAccount()
	 * @generated
	 * @ordered
	 */
	protected String cloudAccount = CLOUD_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_INSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected int numberOfInstances = NUMBER_OF_INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceImpact() <em>Resource Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceImpact()
	 * @generated
	 * @ordered
	 */
	protected ResourceImpact resourceImpact;

	/**
	 * The default value of the '{@link #isHaDeployment() <em>Ha Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaDeployment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HA_DEPLOYMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHaDeployment() <em>Ha Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaDeployment()
	 * @generated
	 * @ordered
	 */
	protected boolean haDeployment = HA_DEPLOYMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyslogServerName() <em>Syslog Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyslogServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSLOG_SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyslogServerName() <em>Syslog Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyslogServerName()
	 * @generated
	 * @ordered
	 */
	protected String syslogServerName = SYSLOG_SERVER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployableServiceSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYABLE_SERVICE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceSpec> getReplacementService() {
		if (replacementService == null) {
			replacementService = new EObjectResolvingEList<ServiceSpec>(ServiceSpec.class, this, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE);
		}
		return replacementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageUri() {
		return packageUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageUri(String newPackageUri) {
		String oldPackageUri = packageUri;
		packageUri = newPackageUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI, oldPackageUri, packageUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getPackageType() {
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageType(PackageType newPackageType) {
		PackageType oldPackageType = packageType;
		packageType = newPackageType == null ? PACKAGE_TYPE_EDEFAULT : newPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointName() {
		return endpointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointName(String newEndpointName) {
		String oldEndpointName = endpointName;
		endpointName = newEndpointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME, oldEndpointName, endpointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloudAccount() {
		return cloudAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudAccount(String newCloudAccount) {
		String oldCloudAccount = cloudAccount;
		cloudAccount = newCloudAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT, oldCloudAccount, cloudAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(int newNumberOfInstances) {
		int oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceImpact getResourceImpact() {
		if (resourceImpact != null && resourceImpact.eIsProxy()) {
			InternalEObject oldResourceImpact = (InternalEObject)resourceImpact;
			resourceImpact = (ResourceImpact)eResolveProxy(oldResourceImpact);
			if (resourceImpact != oldResourceImpact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT, oldResourceImpact, resourceImpact));
			}
		}
		return resourceImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceImpact basicGetResourceImpact() {
		return resourceImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceImpact(ResourceImpact newResourceImpact) {
		ResourceImpact oldResourceImpact = resourceImpact;
		resourceImpact = newResourceImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT, oldResourceImpact, resourceImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHaDeployment() {
		return haDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaDeployment(boolean newHaDeployment) {
		boolean oldHaDeployment = haDeployment;
		haDeployment = newHaDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT, oldHaDeployment, haDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyslogServerName() {
		return syslogServerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyslogServerName(String newSyslogServerName) {
		String oldSyslogServerName = syslogServerName;
		syslogServerName = newSyslogServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME, oldSyslogServerName, syslogServerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE:
				return getReplacementService();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI:
				return getPackageUri();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE:
				return getPackageType();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME:
				return getEndpointName();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT:
				return getPort();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT:
				return getCloudAccount();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT:
				if (resolve) return getResourceImpact();
				return basicGetResourceImpact();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT:
				return isHaDeployment();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME:
				return getSyslogServerName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE:
				getReplacementService().clear();
				getReplacementService().addAll((Collection<? extends ServiceSpec>)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI:
				setPackageUri((String)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE:
				setPackageType((PackageType)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME:
				setEndpointName((String)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT:
				setPort((Integer)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT:
				setCloudAccount((String)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES:
				setNumberOfInstances((Integer)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT:
				setResourceImpact((ResourceImpact)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT:
				setHaDeployment((Boolean)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME:
				setSyslogServerName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE:
				getReplacementService().clear();
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI:
				setPackageUri(PACKAGE_URI_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE:
				setPackageType(PACKAGE_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME:
				setEndpointName(ENDPOINT_NAME_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT:
				setCloudAccount(CLOUD_ACCOUNT_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES:
				setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT:
				setResourceImpact((ResourceImpact)null);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT:
				setHaDeployment(HA_DEPLOYMENT_EDEFAULT);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME:
				setSyslogServerName(SYSLOG_SERVER_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__REPLACEMENT_SERVICE:
				return replacementService != null && !replacementService.isEmpty();
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_URI:
				return PACKAGE_URI_EDEFAULT == null ? packageUri != null : !PACKAGE_URI_EDEFAULT.equals(packageUri);
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PACKAGE_TYPE:
				return packageType != PACKAGE_TYPE_EDEFAULT;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__ENDPOINT_NAME:
				return ENDPOINT_NAME_EDEFAULT == null ? endpointName != null : !ENDPOINT_NAME_EDEFAULT.equals(endpointName);
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__PORT:
				return port != PORT_EDEFAULT;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__CLOUD_ACCOUNT:
				return CLOUD_ACCOUNT_EDEFAULT == null ? cloudAccount != null : !CLOUD_ACCOUNT_EDEFAULT.equals(cloudAccount);
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__NUMBER_OF_INSTANCES:
				return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__RESOURCE_IMPACT:
				return resourceImpact != null;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__HA_DEPLOYMENT:
				return haDeployment != HA_DEPLOYMENT_EDEFAULT;
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC__SYSLOG_SERVER_NAME:
				return SYSLOG_SERVER_NAME_EDEFAULT == null ? syslogServerName != null : !SYSLOG_SERVER_NAME_EDEFAULT.equals(syslogServerName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageUri: ");
		result.append(packageUri);
		result.append(", packageType: ");
		result.append(packageType);
		result.append(", endpointName: ");
		result.append(endpointName);
		result.append(", port: ");
		result.append(port);
		result.append(", cloudAccount: ");
		result.append(cloudAccount);
		result.append(", numberOfInstances: ");
		result.append(numberOfInstances);
		result.append(", haDeployment: ");
		result.append(haDeployment);
		result.append(", syslogServerName: ");
		result.append(syslogServerName);
		result.append(')');
		return result.toString();
	}

} //DeployableServiceSpecImpl
