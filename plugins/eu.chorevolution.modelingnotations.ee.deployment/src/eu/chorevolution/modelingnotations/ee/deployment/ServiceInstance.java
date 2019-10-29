/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getCloudNode <em>Cloud Node</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getServiceSpec <em>Service Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceInstance()
 * @model
 * @generated
 */
public interface ServiceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Node</em>' reference.
	 * @see #setCloudNode(CloudNode)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceInstance_CloudNode()
	 * @model required="true"
	 * @generated
	 */
	CloudNode getCloudNode();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getCloudNode <em>Cloud Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Node</em>' reference.
	 * @see #getCloudNode()
	 * @generated
	 */
	void setCloudNode(CloudNode value);

	/**
	 * Returns the value of the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Spec</em>' reference.
	 * @see #setServiceSpec(DeployableServiceSpec)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceInstance_ServiceSpec()
	 * @model required="true"
	 * @generated
	 */
	DeployableServiceSpec getServiceSpec();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getServiceSpec <em>Service Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Spec</em>' reference.
	 * @see #getServiceSpec()
	 * @generated
	 */
	void setServiceSpec(DeployableServiceSpec value);

	/**
	 * Returns the value of the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Id</em>' attribute.
	 * @see #setInstanceId(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceInstance_InstanceId()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceId();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getInstanceId <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Id</em>' attribute.
	 * @see #getInstanceId()
	 * @generated
	 */
	void setInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceInstance_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ServiceInstance
