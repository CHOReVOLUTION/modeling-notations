/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyService;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyServiceImpl extends ServiceImpl implements LegacyService {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<LegacyServiceInstance> instances;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected EList<String> uri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.LEGACY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyServiceInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList<LegacyServiceInstance>(LegacyServiceInstance.class, this, DeploymentPackage.LEGACY_SERVICE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUri() {
		if (uri == null) {
			uri = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPackage.LEGACY_SERVICE__URI);
		}
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.LEGACY_SERVICE__INSTANCES:
				return getInstances();
			case DeploymentPackage.LEGACY_SERVICE__URI:
				return getUri();
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
			case DeploymentPackage.LEGACY_SERVICE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends LegacyServiceInstance>)newValue);
				return;
			case DeploymentPackage.LEGACY_SERVICE__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends String>)newValue);
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
			case DeploymentPackage.LEGACY_SERVICE__INSTANCES:
				getInstances().clear();
				return;
			case DeploymentPackage.LEGACY_SERVICE__URI:
				getUri().clear();
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
			case DeploymentPackage.LEGACY_SERVICE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case DeploymentPackage.LEGACY_SERVICE__URI:
				return uri != null && !uri.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //LegacyServiceImpl
