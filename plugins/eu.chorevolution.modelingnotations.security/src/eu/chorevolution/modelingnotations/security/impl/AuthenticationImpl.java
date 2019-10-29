/**
 */
package eu.chorevolution.modelingnotations.security.impl;

import eu.chorevolution.modelingnotations.security.Authentication;
import eu.chorevolution.modelingnotations.security.AuthenticationElement;
import eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded;
import eu.chorevolution.modelingnotations.security.CredentialType;
import eu.chorevolution.modelingnotations.security.SecurityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getCredentialType <em>Credential Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getGenericAccount <em>Generic Account</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getGenericCredential <em>Generic Credential</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getAuthNElement <em>Auth NElement</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getAuthNTypeForwarded <em>Auth NType Forwarded</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl#getCustomParametersNames <em>Custom Parameters Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
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
	 * The default value of the '{@link #getCredentialType() <em>Credential Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialType()
	 * @generated
	 * @ordered
	 */
	protected static final CredentialType CREDENTIAL_TYPE_EDEFAULT = CredentialType.USERNAME_PASSWORD;

	/**
	 * The cached value of the '{@link #getCredentialType() <em>Credential Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentialType()
	 * @generated
	 * @ordered
	 */
	protected CredentialType credentialType = CREDENTIAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenericAccount() <em>Generic Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericAccount() <em>Generic Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAccount()
	 * @generated
	 * @ordered
	 */
	protected String genericAccount = GENERIC_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenericCredential() <em>Generic Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericCredential()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_CREDENTIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericCredential() <em>Generic Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericCredential()
	 * @generated
	 * @ordered
	 */
	protected String genericCredential = GENERIC_CREDENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthNElement() <em>Auth NElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthNElement()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationElement AUTH_NELEMENT_EDEFAULT = AuthenticationElement.LASTNAME;

	/**
	 * The cached value of the '{@link #getAuthNElement() <em>Auth NElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthNElement()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationElement authNElement = AUTH_NELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthNTypeForwarded() <em>Auth NType Forwarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthNTypeForwarded()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationTypeForwarded AUTH_NTYPE_FORWARDED_EDEFAULT = AuthenticationTypeForwarded.USER_ACCOUNT;

	/**
	 * The cached value of the '{@link #getAuthNTypeForwarded() <em>Auth NType Forwarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthNTypeForwarded()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationTypeForwarded authNTypeForwarded = AUTH_NTYPE_FORWARDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomParametersNames() <em>Custom Parameters Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomParametersNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> customParametersNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.AUTHENTICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialType getCredentialType() {
		return credentialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentialType(CredentialType newCredentialType) {
		CredentialType oldCredentialType = credentialType;
		credentialType = newCredentialType == null ? CREDENTIAL_TYPE_EDEFAULT : newCredentialType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__CREDENTIAL_TYPE, oldCredentialType, credentialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericAccount() {
		return genericAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericAccount(String newGenericAccount) {
		String oldGenericAccount = genericAccount;
		genericAccount = newGenericAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__GENERIC_ACCOUNT, oldGenericAccount, genericAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericCredential() {
		return genericCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericCredential(String newGenericCredential) {
		String oldGenericCredential = genericCredential;
		genericCredential = newGenericCredential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__GENERIC_CREDENTIAL, oldGenericCredential, genericCredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationElement getAuthNElement() {
		return authNElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthNElement(AuthenticationElement newAuthNElement) {
		AuthenticationElement oldAuthNElement = authNElement;
		authNElement = newAuthNElement == null ? AUTH_NELEMENT_EDEFAULT : newAuthNElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__AUTH_NELEMENT, oldAuthNElement, authNElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationTypeForwarded getAuthNTypeForwarded() {
		return authNTypeForwarded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthNTypeForwarded(AuthenticationTypeForwarded newAuthNTypeForwarded) {
		AuthenticationTypeForwarded oldAuthNTypeForwarded = authNTypeForwarded;
		authNTypeForwarded = newAuthNTypeForwarded == null ? AUTH_NTYPE_FORWARDED_EDEFAULT : newAuthNTypeForwarded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION__AUTH_NTYPE_FORWARDED, oldAuthNTypeForwarded, authNTypeForwarded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCustomParametersNames() {
		if (customParametersNames == null) {
			customParametersNames = new EDataTypeUniqueEList<String>(String.class, this, SecurityPackage.AUTHENTICATION__CUSTOM_PARAMETERS_NAMES);
		}
		return customParametersNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION__NAME:
				return getName();
			case SecurityPackage.AUTHENTICATION__CREDENTIAL_TYPE:
				return getCredentialType();
			case SecurityPackage.AUTHENTICATION__GENERIC_ACCOUNT:
				return getGenericAccount();
			case SecurityPackage.AUTHENTICATION__GENERIC_CREDENTIAL:
				return getGenericCredential();
			case SecurityPackage.AUTHENTICATION__AUTH_NELEMENT:
				return getAuthNElement();
			case SecurityPackage.AUTHENTICATION__AUTH_NTYPE_FORWARDED:
				return getAuthNTypeForwarded();
			case SecurityPackage.AUTHENTICATION__CUSTOM_PARAMETERS_NAMES:
				return getCustomParametersNames();
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
			case SecurityPackage.AUTHENTICATION__NAME:
				setName((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__CREDENTIAL_TYPE:
				setCredentialType((CredentialType)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__GENERIC_ACCOUNT:
				setGenericAccount((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__GENERIC_CREDENTIAL:
				setGenericCredential((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__AUTH_NELEMENT:
				setAuthNElement((AuthenticationElement)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__AUTH_NTYPE_FORWARDED:
				setAuthNTypeForwarded((AuthenticationTypeForwarded)newValue);
				return;
			case SecurityPackage.AUTHENTICATION__CUSTOM_PARAMETERS_NAMES:
				getCustomParametersNames().clear();
				getCustomParametersNames().addAll((Collection<? extends String>)newValue);
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
			case SecurityPackage.AUTHENTICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__CREDENTIAL_TYPE:
				setCredentialType(CREDENTIAL_TYPE_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__GENERIC_ACCOUNT:
				setGenericAccount(GENERIC_ACCOUNT_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__GENERIC_CREDENTIAL:
				setGenericCredential(GENERIC_CREDENTIAL_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__AUTH_NELEMENT:
				setAuthNElement(AUTH_NELEMENT_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__AUTH_NTYPE_FORWARDED:
				setAuthNTypeForwarded(AUTH_NTYPE_FORWARDED_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION__CUSTOM_PARAMETERS_NAMES:
				getCustomParametersNames().clear();
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
			case SecurityPackage.AUTHENTICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPackage.AUTHENTICATION__CREDENTIAL_TYPE:
				return credentialType != CREDENTIAL_TYPE_EDEFAULT;
			case SecurityPackage.AUTHENTICATION__GENERIC_ACCOUNT:
				return GENERIC_ACCOUNT_EDEFAULT == null ? genericAccount != null : !GENERIC_ACCOUNT_EDEFAULT.equals(genericAccount);
			case SecurityPackage.AUTHENTICATION__GENERIC_CREDENTIAL:
				return GENERIC_CREDENTIAL_EDEFAULT == null ? genericCredential != null : !GENERIC_CREDENTIAL_EDEFAULT.equals(genericCredential);
			case SecurityPackage.AUTHENTICATION__AUTH_NELEMENT:
				return authNElement != AUTH_NELEMENT_EDEFAULT;
			case SecurityPackage.AUTHENTICATION__AUTH_NTYPE_FORWARDED:
				return authNTypeForwarded != AUTH_NTYPE_FORWARDED_EDEFAULT;
			case SecurityPackage.AUTHENTICATION__CUSTOM_PARAMETERS_NAMES:
				return customParametersNames != null && !customParametersNames.isEmpty();
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
		result.append(", credentialType: ");
		result.append(credentialType);
		result.append(", genericAccount: ");
		result.append(genericAccount);
		result.append(", genericCredential: ");
		result.append(genericCredential);
		result.append(", authNElement: ");
		result.append(authNElement);
		result.append(", AuthNTypeForwarded: ");
		result.append(authNTypeForwarded);
		result.append(", customParametersNames: ");
		result.append(customParametersNames);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
