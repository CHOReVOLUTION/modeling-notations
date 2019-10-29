/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.CloudNode;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableService;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployable Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl#getCloudNodes <em>Cloud Nodes</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.DeployableServiceImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployableServiceImpl extends ServiceImpl implements DeployableService {
	/**
	 * The cached value of the '{@link #getCloudNodes() <em>Cloud Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudNode> cloudNodes;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployableServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYABLE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudNode> getCloudNodes() {
		if (cloudNodes == null) {
			cloudNodes = new EObjectResolvingEList<CloudNode>(CloudNode.class, this, DeploymentPackage.DEPLOYABLE_SERVICE__CLOUD_NODES);
		}
		return cloudNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<ServiceInstance>(ServiceInstance.class, this, DeploymentPackage.DEPLOYABLE_SERVICE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYABLE_SERVICE__CLOUD_NODES:
				return getCloudNodes();
			case DeploymentPackage.DEPLOYABLE_SERVICE__INSTANCES:
				return getInstances();
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
			case DeploymentPackage.DEPLOYABLE_SERVICE__CLOUD_NODES:
				getCloudNodes().clear();
				getCloudNodes().addAll((Collection<? extends CloudNode>)newValue);
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ServiceInstance>)newValue);
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
			case DeploymentPackage.DEPLOYABLE_SERVICE__CLOUD_NODES:
				getCloudNodes().clear();
				return;
			case DeploymentPackage.DEPLOYABLE_SERVICE__INSTANCES:
				getInstances().clear();
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
			case DeploymentPackage.DEPLOYABLE_SERVICE__CLOUD_NODES:
				return cloudNodes != null && !cloudNodes.isEmpty();
			case DeploymentPackage.DEPLOYABLE_SERVICE__INSTANCES:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployableServiceImpl
