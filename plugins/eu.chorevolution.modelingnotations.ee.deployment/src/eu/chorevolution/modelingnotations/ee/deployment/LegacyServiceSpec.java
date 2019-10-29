/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Service Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getLegacyServiceSpec()
 * @model
 * @generated
 */
public interface LegacyServiceSpec extends ServiceSpec {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getLegacyServiceSpec_Uri()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getUri();

} // LegacyServiceSpec
