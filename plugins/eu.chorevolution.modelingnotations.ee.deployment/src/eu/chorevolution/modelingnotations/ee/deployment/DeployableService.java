/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployable Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getCloudNodes <em>Cloud Nodes</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableService()
 * @model
 * @generated
 */
public interface DeployableService extends Service {
	/**
	 * Returns the value of the '<em><b>Cloud Nodes</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Nodes</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableService_CloudNodes()
	 * @model
	 * @generated
	 */
	EList<CloudNode> getCloudNodes();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableService_Instances()
	 * @model
	 * @generated
	 */
	EList<ServiceInstance> getInstances();

} // DeployableService
