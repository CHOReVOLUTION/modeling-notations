/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.util;

import eu.chorevolution.modelingnotations.ee.deployment.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSwitch() {
		if (modelPackage == null) {
			modelPackage = DeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeploymentPackage.SERVICE_SPEC: {
				ServiceSpec serviceSpec = (ServiceSpec)theEObject;
				T result = caseServiceSpec(serviceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.SERVICE_DEPENDENCY: {
				ServiceDependency serviceDependency = (ServiceDependency)theEObject;
				T result = caseServiceDependency(serviceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.DEPLOYABLE_SERVICE_SPEC: {
				DeployableServiceSpec deployableServiceSpec = (DeployableServiceSpec)theEObject;
				T result = caseDeployableServiceSpec(deployableServiceSpec);
				if (result == null) result = caseServiceSpec(deployableServiceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.LEGACY_SERVICE_SPEC: {
				LegacyServiceSpec legacyServiceSpec = (LegacyServiceSpec)theEObject;
				T result = caseLegacyServiceSpec(legacyServiceSpec);
				if (result == null) result = caseServiceSpec(legacyServiceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.LEGACY_SERVICE: {
				LegacyService legacyService = (LegacyService)theEObject;
				T result = caseLegacyService(legacyService);
				if (result == null) result = caseService(legacyService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE: {
				LegacyServiceInstance legacyServiceInstance = (LegacyServiceInstance)theEObject;
				T result = caseLegacyServiceInstance(legacyServiceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.CHOREOGRAPHY_SPEC: {
				ChoreographySpec choreographySpec = (ChoreographySpec)theEObject;
				T result = caseChoreographySpec(choreographySpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.CHOREOGRAPHY: {
				Choreography choreography = (Choreography)theEObject;
				T result = caseChoreography(choreography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.DEPLOYABLE_SERVICE: {
				DeployableService deployableService = (DeployableService)theEObject;
				T result = caseDeployableService(deployableService);
				if (result == null) result = caseService(deployableService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.SERVICE_INSTANCE: {
				ServiceInstance serviceInstance = (ServiceInstance)theEObject;
				T result = caseServiceInstance(serviceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.CLOUD_NODE: {
				CloudNode cloudNode = (CloudNode)theEObject;
				T result = caseCloudNode(cloudNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentPackage.RESOURCE_IMPACT: {
				ResourceImpact resourceImpact = (ResourceImpact)theEObject;
				T result = caseResourceImpact(resourceImpact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpec(ServiceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDependency(ServiceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Service Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableServiceSpec(DeployableServiceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Service Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyServiceSpec(LegacyServiceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyService(LegacyService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyServiceInstance(LegacyServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographySpec(ChoreographySpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreography(Choreography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableService(DeployableService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInstance(ServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudNode(CloudNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceImpact(ResourceImpact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeploymentSwitch
