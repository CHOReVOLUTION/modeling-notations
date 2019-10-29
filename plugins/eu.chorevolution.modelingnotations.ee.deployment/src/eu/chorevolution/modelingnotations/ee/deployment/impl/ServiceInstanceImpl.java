/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.CloudNode;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl#getCloudNode <em>Cloud Node</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl#getServiceSpec <em>Service Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceInstanceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInstanceImpl extends MinimalEObjectImpl.Container implements ServiceInstance {
	/**
	 * The cached value of the '{@link #getCloudNode() <em>Cloud Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudNode()
	 * @generated
	 * @ordered
	 */
	protected CloudNode cloudNode;

	/**
	 * The cached value of the '{@link #getServiceSpec() <em>Service Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpec()
	 * @generated
	 * @ordered
	 */
	protected DeployableServiceSpec serviceSpec;

	/**
	 * The default value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String instanceId = INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNode getCloudNode() {
		if (cloudNode != null && cloudNode.eIsProxy()) {
			InternalEObject oldCloudNode = (InternalEObject)cloudNode;
			cloudNode = (CloudNode)eResolveProxy(oldCloudNode);
			if (cloudNode != oldCloudNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE, oldCloudNode, cloudNode));
			}
		}
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNode basicGetCloudNode() {
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudNode(CloudNode newCloudNode) {
		CloudNode oldCloudNode = cloudNode;
		cloudNode = newCloudNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE, oldCloudNode, cloudNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableServiceSpec getServiceSpec() {
		if (serviceSpec != null && serviceSpec.eIsProxy()) {
			InternalEObject oldServiceSpec = (InternalEObject)serviceSpec;
			serviceSpec = (DeployableServiceSpec)eResolveProxy(oldServiceSpec);
			if (serviceSpec != oldServiceSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC, oldServiceSpec, serviceSpec));
			}
		}
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableServiceSpec basicGetServiceSpec() {
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSpec(DeployableServiceSpec newServiceSpec) {
		DeployableServiceSpec oldServiceSpec = serviceSpec;
		serviceSpec = newServiceSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC, oldServiceSpec, serviceSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceId() {
		return instanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceId(String newInstanceId) {
		String oldInstanceId = instanceId;
		instanceId = newInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_INSTANCE__INSTANCE_ID, oldInstanceId, instanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_INSTANCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE:
				if (resolve) return getCloudNode();
				return basicGetCloudNode();
			case DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC:
				if (resolve) return getServiceSpec();
				return basicGetServiceSpec();
			case DeploymentPackage.SERVICE_INSTANCE__INSTANCE_ID:
				return getInstanceId();
			case DeploymentPackage.SERVICE_INSTANCE__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE:
				setCloudNode((CloudNode)newValue);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC:
				setServiceSpec((DeployableServiceSpec)newValue);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__INSTANCE_ID:
				setInstanceId((String)newValue);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__URI:
				setUri((String)newValue);
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
			case DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE:
				setCloudNode((CloudNode)null);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC:
				setServiceSpec((DeployableServiceSpec)null);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__INSTANCE_ID:
				setInstanceId(INSTANCE_ID_EDEFAULT);
				return;
			case DeploymentPackage.SERVICE_INSTANCE__URI:
				setUri(URI_EDEFAULT);
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
			case DeploymentPackage.SERVICE_INSTANCE__CLOUD_NODE:
				return cloudNode != null;
			case DeploymentPackage.SERVICE_INSTANCE__SERVICE_SPEC:
				return serviceSpec != null;
			case DeploymentPackage.SERVICE_INSTANCE__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceId != null : !INSTANCE_ID_EDEFAULT.equals(instanceId);
			case DeploymentPackage.SERVICE_INSTANCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (instanceId: ");
		result.append(instanceId);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ServiceInstanceImpl
