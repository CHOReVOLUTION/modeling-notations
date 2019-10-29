/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getServiceSpec <em>Service Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getLegacyServiceInstance()
 * @model
 * @generated
 */
public interface LegacyServiceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Spec</em>' reference.
	 * @see #setServiceSpec(LegacyServiceSpec)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getLegacyServiceInstance_ServiceSpec()
	 * @model required="true"
	 * @generated
	 */
	LegacyServiceSpec getServiceSpec();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getServiceSpec <em>Service Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Spec</em>' reference.
	 * @see #getServiceSpec()
	 * @generated
	 */
	void setServiceSpec(LegacyServiceSpec value);

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
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getLegacyServiceInstance_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // LegacyServiceInstance
