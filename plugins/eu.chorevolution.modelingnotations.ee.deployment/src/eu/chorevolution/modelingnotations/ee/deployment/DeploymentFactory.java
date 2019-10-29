/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage
 * @generated
 */
public interface DeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentFactory eINSTANCE = eu.chorevolution.modelingnotations.ee.deployment.impl.DeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Spec</em>'.
	 * @generated
	 */
	ServiceSpec createServiceSpec();

	/**
	 * Returns a new object of class '<em>Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Dependency</em>'.
	 * @generated
	 */
	ServiceDependency createServiceDependency();

	/**
	 * Returns a new object of class '<em>Deployable Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployable Service Spec</em>'.
	 * @generated
	 */
	DeployableServiceSpec createDeployableServiceSpec();

	/**
	 * Returns a new object of class '<em>Legacy Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Service Spec</em>'.
	 * @generated
	 */
	LegacyServiceSpec createLegacyServiceSpec();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Legacy Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Service</em>'.
	 * @generated
	 */
	LegacyService createLegacyService();

	/**
	 * Returns a new object of class '<em>Legacy Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Service Instance</em>'.
	 * @generated
	 */
	LegacyServiceInstance createLegacyServiceInstance();

	/**
	 * Returns a new object of class '<em>Choreography Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography Spec</em>'.
	 * @generated
	 */
	ChoreographySpec createChoreographySpec();

	/**
	 * Returns a new object of class '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography</em>'.
	 * @generated
	 */
	Choreography createChoreography();

	/**
	 * Returns a new object of class '<em>Deployable Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployable Service</em>'.
	 * @generated
	 */
	DeployableService createDeployableService();

	/**
	 * Returns a new object of class '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Instance</em>'.
	 * @generated
	 */
	ServiceInstance createServiceInstance();

	/**
	 * Returns a new object of class '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Node</em>'.
	 * @generated
	 */
	CloudNode createCloudNode();

	/**
	 * Returns a new object of class '<em>Resource Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Impact</em>'.
	 * @generated
	 */
	ResourceImpact createResourceImpact();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentPackage getDeploymentPackage();

} //DeploymentFactory
