/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecName <em>Service Spec Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecRole <em>Service Spec Role</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceDependency()
 * @model
 * @generated
 */
public interface ServiceDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Spec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Spec Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Spec Name</em>' attribute.
	 * @see #setServiceSpecName(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceDependency_ServiceSpecName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceSpecName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecName <em>Service Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Spec Name</em>' attribute.
	 * @see #getServiceSpecName()
	 * @generated
	 */
	void setServiceSpecName(String value);

	/**
	 * Returns the value of the '<em><b>Service Spec Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Spec Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Spec Role</em>' attribute.
	 * @see #setServiceSpecRole(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceDependency_ServiceSpecRole()
	 * @model required="true"
	 * @generated
	 */
	String getServiceSpecRole();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency#getServiceSpecRole <em>Service Spec Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Spec Role</em>' attribute.
	 * @see #getServiceSpecRole()
	 * @generated
	 */
	void setServiceSpecRole(String value);

} // ServiceDependency
