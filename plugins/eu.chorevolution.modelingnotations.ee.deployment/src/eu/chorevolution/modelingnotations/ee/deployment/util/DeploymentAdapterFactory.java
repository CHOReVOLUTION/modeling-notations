/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.util;

import eu.chorevolution.modelingnotations.ee.deployment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage
 * @generated
 */
public class DeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSwitch<Adapter> modelSwitch =
		new DeploymentSwitch<Adapter>() {
			@Override
			public Adapter caseServiceSpec(ServiceSpec object) {
				return createServiceSpecAdapter();
			}
			@Override
			public Adapter caseServiceDependency(ServiceDependency object) {
				return createServiceDependencyAdapter();
			}
			@Override
			public Adapter caseDeployableServiceSpec(DeployableServiceSpec object) {
				return createDeployableServiceSpecAdapter();
			}
			@Override
			public Adapter caseLegacyServiceSpec(LegacyServiceSpec object) {
				return createLegacyServiceSpecAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseLegacyService(LegacyService object) {
				return createLegacyServiceAdapter();
			}
			@Override
			public Adapter caseLegacyServiceInstance(LegacyServiceInstance object) {
				return createLegacyServiceInstanceAdapter();
			}
			@Override
			public Adapter caseChoreographySpec(ChoreographySpec object) {
				return createChoreographySpecAdapter();
			}
			@Override
			public Adapter caseChoreography(Choreography object) {
				return createChoreographyAdapter();
			}
			@Override
			public Adapter caseDeployableService(DeployableService object) {
				return createDeployableServiceAdapter();
			}
			@Override
			public Adapter caseServiceInstance(ServiceInstance object) {
				return createServiceInstanceAdapter();
			}
			@Override
			public Adapter caseCloudNode(CloudNode object) {
				return createCloudNodeAdapter();
			}
			@Override
			public Adapter caseResourceImpact(ResourceImpact object) {
				return createResourceImpactAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec
	 * @generated
	 */
	public Adapter createServiceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency <em>Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency
	 * @generated
	 */
	public Adapter createServiceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec <em>Deployable Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec
	 * @generated
	 */
	public Adapter createDeployableServiceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec <em>Legacy Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec
	 * @generated
	 */
	public Adapter createLegacyServiceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyService <em>Legacy Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyService
	 * @generated
	 */
	public Adapter createLegacyServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance <em>Legacy Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance
	 * @generated
	 */
	public Adapter createLegacyServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec <em>Choreography Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec
	 * @generated
	 */
	public Adapter createChoreographySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.Choreography
	 * @generated
	 */
	public Adapter createChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableService <em>Deployable Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeployableService
	 * @generated
	 */
	public Adapter createDeployableServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ServiceInstance
	 * @generated
	 */
	public Adapter createServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.CloudNode
	 * @generated
	 */
	public Adapter createCloudNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact <em>Resource Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact
	 * @generated
	 */
	public Adapter createResourceImpactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeploymentAdapterFactory
