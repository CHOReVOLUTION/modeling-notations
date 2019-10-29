/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec#getDeployableServices <em>Deployable Services</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreographySpec()
 * @model
 * @generated
 */
public interface ChoreographySpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployable Services</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployable Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployable Services</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getChoreographySpec_DeployableServices()
	 * @model
	 * @generated
	 */
	EList<DeployableServiceSpec> getDeployableServices();

} // ChoreographySpec
