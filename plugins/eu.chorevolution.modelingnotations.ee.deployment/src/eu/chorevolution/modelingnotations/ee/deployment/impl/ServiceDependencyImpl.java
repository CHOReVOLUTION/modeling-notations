/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl#getServiceSpecName <em>Service Spec Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceDependencyImpl#getServiceSpecRole <em>Service Spec Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDependencyImpl extends MinimalEObjectImpl.Container implements ServiceDependency {
	/**
	 * The default value of the '{@link #getServiceSpecName() <em>Service Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_SPEC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceSpecName() <em>Service Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecName()
	 * @generated
	 * @ordered
	 */
	protected String serviceSpecName = SERVICE_SPEC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceSpecRole() <em>Service Spec Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_SPEC_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceSpecRole() <em>Service Spec Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpecRole()
	 * @generated
	 * @ordered
	 */
	protected String serviceSpecRole = SERVICE_SPEC_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.SERVICE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceSpecName() {
		return serviceSpecName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSpecName(String newServiceSpecName) {
		String oldServiceSpecName = serviceSpecName;
		serviceSpecName = newServiceSpecName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_NAME, oldServiceSpecName, serviceSpecName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceSpecRole() {
		return serviceSpecRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSpecRole(String newServiceSpecRole) {
		String oldServiceSpecRole = serviceSpecRole;
		serviceSpecRole = newServiceSpecRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE, oldServiceSpecRole, serviceSpecRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_NAME:
				return getServiceSpecName();
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE:
				return getServiceSpecRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_NAME:
				setServiceSpecName((String)newValue);
				return;
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE:
				setServiceSpecRole((String)newValue);
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
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_NAME:
				setServiceSpecName(SERVICE_SPEC_NAME_EDEFAULT);
				return;
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE:
				setServiceSpecRole(SERVICE_SPEC_ROLE_EDEFAULT);
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
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_NAME:
				return SERVICE_SPEC_NAME_EDEFAULT == null ? serviceSpecName != null : !SERVICE_SPEC_NAME_EDEFAULT.equals(serviceSpecName);
			case DeploymentPackage.SERVICE_DEPENDENCY__SERVICE_SPEC_ROLE:
				return SERVICE_SPEC_ROLE_EDEFAULT == null ? serviceSpecRole != null : !SERVICE_SPEC_ROLE_EDEFAULT.equals(serviceSpecRole);
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
		result.append(" (serviceSpecName: ");
		result.append(serviceSpecName);
		result.append(", serviceSpecRole: ");
		result.append(serviceSpecRole);
		result.append(')');
		return result.toString();
	}

} //ServiceDependencyImpl
