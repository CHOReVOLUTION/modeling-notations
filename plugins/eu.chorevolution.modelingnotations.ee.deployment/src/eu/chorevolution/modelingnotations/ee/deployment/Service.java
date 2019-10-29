/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getServiceSpec <em>Service Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Spec</em>' reference.
	 * @see #setServiceSpec(ServiceSpec)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getService_ServiceSpec()
	 * @model required="true"
	 * @generated
	 */
	ServiceSpec getServiceSpec();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getServiceSpec <em>Service Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Spec</em>' reference.
	 * @see #getServiceSpec()
	 * @generated
	 */
	void setServiceSpec(ServiceSpec value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getService_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.Service#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Service
