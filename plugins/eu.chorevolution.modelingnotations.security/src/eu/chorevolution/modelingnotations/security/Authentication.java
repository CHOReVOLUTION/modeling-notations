/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Parameters Names</em>' attribute list.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getAuthentication_CustomParametersNames()
	 * @model
	 * @generated
	 */
	EList<String> getCustomParametersNames();

} // Authentication
