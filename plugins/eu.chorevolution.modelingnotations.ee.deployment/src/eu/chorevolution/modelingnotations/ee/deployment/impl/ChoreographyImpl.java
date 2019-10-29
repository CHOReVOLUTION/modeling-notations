/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.Choreography;
import eu.chorevolution.modelingnotations.ee.deployment.ChoreographySpec;
import eu.chorevolution.modelingnotations.ee.deployment.DeployableService;
import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyService;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl#getChoreographySpec <em>Choreography Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl#getDeployableServices <em>Deployable Services</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ChoreographyImpl#getLegacyServices <em>Legacy Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographyImpl extends MinimalEObjectImpl.Container implements Choreography {
	/**
	 * The cached value of the '{@link #getChoreographySpec() <em>Choreography Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographySpec()
	 * @generated
	 * @ordered
	 */
	protected ChoreographySpec choreographySpec;

	/**
	 * The cached value of the '{@link #getDeployableServices() <em>Deployable Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployableServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployableService> deployableServices;

	/**
	 * The cached value of the '{@link #getLegacyServices() <em>Legacy Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegacyServices()
	 * @generated
	 * @ordered
	 */
	protected LegacyService legacyServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.CHOREOGRAPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographySpec getChoreographySpec() {
		if (choreographySpec != null && choreographySpec.eIsProxy()) {
			InternalEObject oldChoreographySpec = (InternalEObject)choreographySpec;
			choreographySpec = (ChoreographySpec)eResolveProxy(oldChoreographySpec);
			if (choreographySpec != oldChoreographySpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC, oldChoreographySpec, choreographySpec));
			}
		}
		return choreographySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographySpec basicGetChoreographySpec() {
		return choreographySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographySpec(ChoreographySpec newChoreographySpec) {
		ChoreographySpec oldChoreographySpec = choreographySpec;
		choreographySpec = newChoreographySpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC, oldChoreographySpec, choreographySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployableService> getDeployableServices() {
		if (deployableServices == null) {
			deployableServices = new EObjectResolvingEList<DeployableService>(DeployableService.class, this, DeploymentPackage.CHOREOGRAPHY__DEPLOYABLE_SERVICES);
		}
		return deployableServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyService getLegacyServices() {
		if (legacyServices != null && legacyServices.eIsProxy()) {
			InternalEObject oldLegacyServices = (InternalEObject)legacyServices;
			legacyServices = (LegacyService)eResolveProxy(oldLegacyServices);
			if (legacyServices != oldLegacyServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES, oldLegacyServices, legacyServices));
			}
		}
		return legacyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyService basicGetLegacyServices() {
		return legacyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyServices(LegacyService newLegacyServices) {
		LegacyService oldLegacyServices = legacyServices;
		legacyServices = newLegacyServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES, oldLegacyServices, legacyServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC:
				if (resolve) return getChoreographySpec();
				return basicGetChoreographySpec();
			case DeploymentPackage.CHOREOGRAPHY__DEPLOYABLE_SERVICES:
				return getDeployableServices();
			case DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES:
				if (resolve) return getLegacyServices();
				return basicGetLegacyServices();
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
			case DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC:
				setChoreographySpec((ChoreographySpec)newValue);
				return;
			case DeploymentPackage.CHOREOGRAPHY__DEPLOYABLE_SERVICES:
				getDeployableServices().clear();
				getDeployableServices().addAll((Collection<? extends DeployableService>)newValue);
				return;
			case DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES:
				setLegacyServices((LegacyService)newValue);
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
			case DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC:
				setChoreographySpec((ChoreographySpec)null);
				return;
			case DeploymentPackage.CHOREOGRAPHY__DEPLOYABLE_SERVICES:
				getDeployableServices().clear();
				return;
			case DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES:
				setLegacyServices((LegacyService)null);
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
			case DeploymentPackage.CHOREOGRAPHY__CHOREOGRAPHY_SPEC:
				return choreographySpec != null;
			case DeploymentPackage.CHOREOGRAPHY__DEPLOYABLE_SERVICES:
				return deployableServices != null && !deployableServices.isEmpty();
			case DeploymentPackage.CHOREOGRAPHY__LEGACY_SERVICES:
				return legacyServices != null;
		}
		return super.eIsSet(featureID);
	}

} //ChoreographyImpl
