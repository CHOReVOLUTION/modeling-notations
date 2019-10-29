/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceSpec()
 * @model
 * @generated
 */
public interface ServiceSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceSpec_Dependencies()
	 * @model
	 * @generated
	 */
	EList<ServiceDependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * The default value is <code>"SOAP"</code>.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes
	 * @see #setServiceType(ServiceTypes)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceSpec_ServiceType()
	 * @model default="SOAP" required="true"
	 * @generated
	 */
	ServiceTypes getServiceType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(ServiceTypes value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceSpec_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getServiceSpec_Role()
	 * @model default=""
	 * @generated
	 */
	EList<String> getRole();

} // ServiceSpec
