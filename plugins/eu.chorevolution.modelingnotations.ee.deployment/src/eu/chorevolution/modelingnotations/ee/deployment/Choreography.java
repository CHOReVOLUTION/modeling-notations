/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getChoreographySpec <em>Choreography Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getDeployableServices <em>Deployable Services</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getLegacyServices <em>Legacy Services</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends EObject {
	/**
	 * Returns the value of the '<em><b>Choreography Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Spec</em>' reference.
	 * @see #setChoreographySpec(ChoreographySpec)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreography_ChoreographySpec()
	 * @model required="true"
	 * @generated
	 */
	ChoreographySpec getChoreographySpec();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getChoreographySpec <em>Choreography Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Spec</em>' reference.
	 * @see #getChoreographySpec()
	 * @generated
	 */
	void setChoreographySpec(ChoreographySpec value);

	/**
	 * Returns the value of the '<em><b>Deployable Services</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployable Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployable Services</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreography_DeployableServices()
	 * @model
	 * @generated
	 */
	EList<DeployableService> getDeployableServices();

	/**
	 * Returns the value of the '<em><b>Legacy Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legacy Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Services</em>' reference.
	 * @see #setLegacyServices(LegacyService)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreography_LegacyServices()
	 * @model
	 * @generated
	 */
	LegacyService getLegacyServices();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography#getLegacyServices <em>Legacy Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Services</em>' reference.
	 * @see #getLegacyServices()
	 * @generated
	 */
	void setLegacyServices(LegacyService value);

} // Choreography
