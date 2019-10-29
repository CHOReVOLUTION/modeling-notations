/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getCpuImpact <em>Cpu Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getRamImpact <em>Ram Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskSpeedImpact <em>Disk Speed Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskCapacityImpact <em>Disk Capacity Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getNetworkingImpact <em>Networking Impact</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact()
 * @model
 * @generated
 */
public interface ResourceImpact extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Impact</em>' attribute.
	 * @see #setCpuImpact(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact_CpuImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCpuImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getCpuImpact <em>Cpu Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Impact</em>' attribute.
	 * @see #getCpuImpact()
	 * @generated
	 */
	void setCpuImpact(int value);

	/**
	 * Returns the value of the '<em><b>Ram Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Impact</em>' attribute.
	 * @see #setRamImpact(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact_RamImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRamImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getRamImpact <em>Ram Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Impact</em>' attribute.
	 * @see #getRamImpact()
	 * @generated
	 */
	void setRamImpact(int value);

	/**
	 * Returns the value of the '<em><b>Disk Speed Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Speed Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Speed Impact</em>' attribute.
	 * @see #setDiskSpeedImpact(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact_DiskSpeedImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDiskSpeedImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskSpeedImpact <em>Disk Speed Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Speed Impact</em>' attribute.
	 * @see #getDiskSpeedImpact()
	 * @generated
	 */
	void setDiskSpeedImpact(int value);

	/**
	 * Returns the value of the '<em><b>Disk Capacity Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk Capacity Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk Capacity Impact</em>' attribute.
	 * @see #setDiskCapacityImpact(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact_DiskCapacityImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDiskCapacityImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getDiskCapacityImpact <em>Disk Capacity Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Capacity Impact</em>' attribute.
	 * @see #getDiskCapacityImpact()
	 * @generated
	 */
	void setDiskCapacityImpact(int value);

	/**
	 * Returns the value of the '<em><b>Networking Impact</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networking Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networking Impact</em>' attribute.
	 * @see #setNetworkingImpact(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getResourceImpact_NetworkingImpact()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNetworkingImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact#getNetworkingImpact <em>Networking Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networking Impact</em>' attribute.
	 * @see #getNetworkingImpact()
	 * @generated
	 */
	void setNetworkingImpact(int value);

} // ResourceImpact
