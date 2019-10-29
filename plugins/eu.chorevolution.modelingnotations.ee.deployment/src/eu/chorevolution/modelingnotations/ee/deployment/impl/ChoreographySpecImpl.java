/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographySpecImpl#getDeployableServices <em>Deployable Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographySpecImpl extends MinimalEObjectImpl.Container implements ChoreographySpec {
	/**
	 * The cached value of the '{@link #getDeployableServices() <em>Deployable Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployableServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployableServiceSpec> deployableServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographySpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.CHOREOGRAPHY_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployableServiceSpec> getDeployableServices() {
		if (deployableServices == null) {
			deployableServices = new EObjectResolvingEList<DeployableServiceSpec>(DeployableServiceSpec.class, this, DeploymentPackage.CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES);
		}
		return deployableServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES:
				return getDeployableServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES:
				getDeployableServices().clear();
				getDeployableServices().addAll((Collection<? extends DeployableServiceSpec>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeploymentPackage.CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES:
				getDeployableServices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeploymentPackage.CHOREOGRAPHY_SPEC__DEPLOYABLE_SERVICES:
				return deployableServices != null && !deployableServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChoreographySpecImpl
