/**
 */
package eu.chorevolution.modelingnotations.security.impl;

import eu.chorevolution.modelingnotations.security.Authentication;
import eu.chorevolution.modelingnotations.security.Communication;
import eu.chorevolution.modelingnotations.security.SecurityPackage;
import eu.chorevolution.modelingnotations.security.SecurityPolicySet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl#getRessourceURL <em>Ressource URL</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityPolicySetImpl extends MinimalEObjectImpl.Container implements SecurityPolicySet {
	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EList<Authentication> authentication;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> communication;

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
	 * The default value of the '{@link #getRessourceURL() <em>Ressource URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String RESSOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRessourceURL() <em>Ressource URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceURL()
	 * @generated
	 * @ordered
	 */
	protected String ressourceURL = RESSOURCE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPolicySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_POLICY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authentication> getAuthentication() {
		if (authentication == null) {
			authentication = new EObjectContainmentEList<Authentication>(Authentication.class, this, SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION);
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Communication> getCommunication() {
		if (communication == null) {
			communication = new EObjectContainmentEList<Communication>(Communication.class, this, SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION);
		}
		return communication;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_POLICY_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRessourceURL() {
		return ressourceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessourceURL(String newRessourceURL) {
		String oldRessourceURL = ressourceURL;
		ressourceURL = newRessourceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_POLICY_SET__RESSOURCE_URL, oldRessourceURL, ressourceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_POLICY_SET__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION:
				return ((InternalEList<?>)getAuthentication()).basicRemove(otherEnd, msgs);
			case SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION:
				return ((InternalEList<?>)getCommunication()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION:
				return getAuthentication();
			case SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION:
				return getCommunication();
			case SecurityPackage.SECURITY_POLICY_SET__NAME:
				return getName();
			case SecurityPackage.SECURITY_POLICY_SET__RESSOURCE_URL:
				return getRessourceURL();
			case SecurityPackage.SECURITY_POLICY_SET__SERVICE_NAME:
				return getServiceName();
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
			case SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION:
				getAuthentication().clear();
				getAuthentication().addAll((Collection<? extends Authentication>)newValue);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION:
				getCommunication().clear();
				getCommunication().addAll((Collection<? extends Communication>)newValue);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__NAME:
				setName((String)newValue);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__RESSOURCE_URL:
				setRessourceURL((String)newValue);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__SERVICE_NAME:
				setServiceName((String)newValue);
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
			case SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION:
				getAuthentication().clear();
				return;
			case SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION:
				getCommunication().clear();
				return;
			case SecurityPackage.SECURITY_POLICY_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__RESSOURCE_URL:
				setRessourceURL(RESSOURCE_URL_EDEFAULT);
				return;
			case SecurityPackage.SECURITY_POLICY_SET__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
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
			case SecurityPackage.SECURITY_POLICY_SET__AUTHENTICATION:
				return authentication != null && !authentication.isEmpty();
			case SecurityPackage.SECURITY_POLICY_SET__COMMUNICATION:
				return communication != null && !communication.isEmpty();
			case SecurityPackage.SECURITY_POLICY_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPackage.SECURITY_POLICY_SET__RESSOURCE_URL:
				return RESSOURCE_URL_EDEFAULT == null ? ressourceURL != null : !RESSOURCE_URL_EDEFAULT.equals(ressourceURL);
			case SecurityPackage.SECURITY_POLICY_SET__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", ressourceURL: ");
		result.append(ressourceURL);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //SecurityPolicySetImpl
