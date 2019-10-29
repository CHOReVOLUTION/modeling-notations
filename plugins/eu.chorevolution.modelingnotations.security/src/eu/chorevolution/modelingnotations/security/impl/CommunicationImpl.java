/**
 */
package eu.chorevolution.modelingnotations.security.impl;

import eu.chorevolution.modelingnotations.security.Communication;
import eu.chorevolution.modelingnotations.security.SecurityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.CommunicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.CommunicationImpl#getSecuredCommunication <em>Secured Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication {
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
	 * The default value of the '{@link #getSecuredCommunication() <em>Secured Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SECURED_COMMUNICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecuredCommunication() <em>Secured Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredCommunication()
	 * @generated
	 * @ordered
	 */
	protected Boolean securedCommunication = SECURED_COMMUNICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.COMMUNICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMUNICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSecuredCommunication() {
		return securedCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuredCommunication(Boolean newSecuredCommunication) {
		Boolean oldSecuredCommunication = securedCommunication;
		securedCommunication = newSecuredCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMUNICATION__SECURED_COMMUNICATION, oldSecuredCommunication, securedCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.COMMUNICATION__NAME:
				return getName();
			case SecurityPackage.COMMUNICATION__SECURED_COMMUNICATION:
				return getSecuredCommunication();
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
			case SecurityPackage.COMMUNICATION__NAME:
				setName((String)newValue);
				return;
			case SecurityPackage.COMMUNICATION__SECURED_COMMUNICATION:
				setSecuredCommunication((Boolean)newValue);
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
			case SecurityPackage.COMMUNICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPackage.COMMUNICATION__SECURED_COMMUNICATION:
				setSecuredCommunication(SECURED_COMMUNICATION_EDEFAULT);
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
			case SecurityPackage.COMMUNICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPackage.COMMUNICATION__SECURED_COMMUNICATION:
				return SECURED_COMMUNICATION_EDEFAULT == null ? securedCommunication != null : !SECURED_COMMUNICATION_EDEFAULT.equals(securedCommunication);
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
		result.append(", SecuredCommunication: ");
		result.append(securedCommunication);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
