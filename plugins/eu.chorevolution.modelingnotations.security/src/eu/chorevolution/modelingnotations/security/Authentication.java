/**
 */
package eu.chorevolution.modelingnotations.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getCredentialType <em>Credential Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericAccount <em>Generic Account</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericCredential <em>Generic Credential</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNElement <em>Auth NElement</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNTypeForwarded <em>Auth NType Forwarded</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Authentication#getCustomParametersNames <em>Custom Parameters Names</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication()
 * @model
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credential Type</b></em>' attribute.
	 * The default value is <code>"UsernamePassword"</code>.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.security.CredentialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credential Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.CredentialType
	 * @see #setCredentialType(CredentialType)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_CredentialType()
	 * @model default="UsernamePassword" id="true" required="true"
	 * @generated
	 */
	CredentialType getCredentialType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getCredentialType <em>Credential Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.CredentialType
	 * @see #getCredentialType()
	 * @generated
	 */
	void setCredentialType(CredentialType value);

	/**
	 * Returns the value of the '<em><b>Generic Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Account</em>' attribute.
	 * @see #setGenericAccount(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_GenericAccount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getGenericAccount();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericAccount <em>Generic Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Account</em>' attribute.
	 * @see #getGenericAccount()
	 * @generated
	 */
	void setGenericAccount(String value);

	/**
	 * Returns the value of the '<em><b>Generic Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Credential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Credential</em>' attribute.
	 * @see #setGenericCredential(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_GenericCredential()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getGenericCredential();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericCredential <em>Generic Credential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Credential</em>' attribute.
	 * @see #getGenericCredential()
	 * @generated
	 */
	void setGenericCredential(String value);

	/**
	 * Returns the value of the '<em><b>Auth NElement</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.security.AuthenticationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth NElement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth NElement</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationElement
	 * @see #setAuthNElement(AuthenticationElement)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_AuthNElement()
	 * @model
	 * @generated
	 */
	AuthenticationElement getAuthNElement();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNElement <em>Auth NElement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth NElement</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationElement
	 * @see #getAuthNElement()
	 * @generated
	 */
	void setAuthNElement(AuthenticationElement value);

	/**
	 * Returns the value of the '<em><b>Auth NType Forwarded</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth NType Forwarded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth NType Forwarded</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded
	 * @see #setAuthNTypeForwarded(AuthenticationTypeForwarded)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_AuthNTypeForwarded()
	 * @model required="true"
	 * @generated
	 */
	AuthenticationTypeForwarded getAuthNTypeForwarded();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNTypeForwarded <em>Auth NType Forwarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth NType Forwarded</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded
	 * @see #getAuthNTypeForwarded()
	 * @generated
	 */
	void setAuthNTypeForwarded(AuthenticationTypeForwarded value);

	/**
	 * Returns the value of the '<em><b>Custom Parameters Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Parameters Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Parameters Names</em>' attribute list.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_CustomParametersNames()
	 * @model
	 * @generated
	 */
	EList<String> getCustomParametersNames();

} // Authentication
