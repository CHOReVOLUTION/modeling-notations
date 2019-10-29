/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceDependency;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec;
import eu.chorevolution.modelingnotations.ee.deployment.ServiceTypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ServiceSpecImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecImpl extends MinimalEObjectImpl.Container implements ServiceSpec {
	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDependency> dependencies;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceTypes SERVICE_TYPE_EDEFAULT = ServiceTypes.SOAP;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected ServiceTypes serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<String> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.SERVICE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<ServiceDependency>(ServiceDependency.class, this, DeploymentPackage.SERVICE_SPEC__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypes getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(ServiceTypes newServiceType) {
		ServiceTypes oldServiceType = serviceType;
		serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_SPEC__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SERVICE_SPEC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRole() {
		if (role == null) {
			role = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPackage.SERVICE_SPEC__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.SERVICE_SPEC__DEPENDENCIES:
				return getDependencies();
			case DeploymentPackage.SERVICE_SPEC__SERVICE_TYPE:
				return getServiceType();
			case DeploymentPackage.SERVICE_SPEC__NAME:
				return getName();
			case DeploymentPackage.SERVICE_SPEC__ROLE:
				return getRole();
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
			case DeploymentPackage.SERVICE_SPEC__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ServiceDependency>)newValue);
				return;
			case DeploymentPackage.SERVICE_SPEC__SERVICE_TYPE:
				setServiceType((ServiceTypes)newValue);
				return;
			case DeploymentPackage.SERVICE_SPEC__NAME:
				setName((String)newValue);
				return;
			case DeploymentPackage.SERVICE_SPEC__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends String>)newValue);
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
			case DeploymentPackage.SERVICE_SPEC__DEPENDENCIES:
				getDependencies().clear();
				return;
			case DeploymentPackage.SERVICE_SPEC__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.SERVICE_SPEC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentPackage.SERVICE_SPEC__ROLE:
				getRole().clear();
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
			case DeploymentPackage.SERVICE_SPEC__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case DeploymentPackage.SERVICE_SPEC__SERVICE_TYPE:
				return serviceType != SERVICE_TYPE_EDEFAULT;
			case DeploymentPackage.SERVICE_SPEC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentPackage.SERVICE_SPEC__ROLE:
				return role != null && !role.isEmpty();
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
		result.append(" (serviceType: ");
		result.append(serviceType);
		result.append(", name: ");
		result.append(name);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ServiceSpecImpl
