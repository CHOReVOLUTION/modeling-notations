/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getIp <em>Ip</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getHostname <em>Hostname</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getCloudNode()
 * @model
 * @generated
 */
public interface CloudNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getCloudNode_NodeId()
	 * @model required="true"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getCloudNode_Ip()
	 * @model required="true"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getCloudNode_Hostname()
	 * @model required="true"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

} // CloudNode
