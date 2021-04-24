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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/chorevolution/spec/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl <em>Policy Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getSecurityPolicySet()
	 * @generated
	 */
	int SECURITY_POLICY_SET = 0;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET__AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET__COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET__NAME = 2;

	/**
	 * The feature id for the '<em><b>Ressource URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET__RESSOURCE_URL = 3;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET__SERVICE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_POLICY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Credential Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CREDENTIAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Generic Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__GENERIC_ACCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Generic Credential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__GENERIC_CREDENTIAL = 3;

	/**
	 * The feature id for the '<em><b>Auth NElement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__AUTH_NELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Auth NType Forwarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__AUTH_NTYPE_FORWARDED = 5;

	/**
	 * The feature id for the '<em><b>Custom Parameters Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__CUSTOM_PARAMETERS_NAMES = 6;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.impl.CommunicationImpl
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Secured Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__SECURED_COMMUNICATION = 1;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.impl.SecurityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityModelImpl
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Securitypolicyset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITYPOLICYSET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.CredentialType <em>Credential Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.CredentialType
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getCredentialType()
	 * @generated
	 */
	int CREDENTIAL_TYPE = 4;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.AuthenticationElement <em>Authentication Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationElement
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthenticationElement()
	 * @generated
	 */
	int AUTHENTICATION_ELEMENT = 5;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded <em>Authentication Type Forwarded</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded
	 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthenticationTypeForwarded()
	 * @generated
	 */
	int AUTHENTICATION_TYPE_FORWARDED = 6;


	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet <em>Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Set</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet
	 * @generated
	 */
	EClass getSecurityPolicySet();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authentication</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet#getAuthentication()
	 * @see #getSecurityPolicySet()
	 * @generated
	 */
	EReference getSecurityPolicySet_Authentication();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet#getCommunication()
	 * @see #getSecurityPolicySet()
	 * @generated
	 */
	EReference getSecurityPolicySet_Communication();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet#getName()
	 * @see #getSecurityPolicySet()
	 * @generated
	 */
	EAttribute getSecurityPolicySet_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getRessourceURL <em>Ressource URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ressource URL</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet#getRessourceURL()
	 * @see #getSecurityPolicySet()
	 * @generated
	 */
	EAttribute getSecurityPolicySet_RessourceURL();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPolicySet#getServiceName()
	 * @see #getSecurityPolicySet()
	 * @generated
	 */
	EAttribute getSecurityPolicySet_ServiceName();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.security.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getCredentialType <em>Credential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credential Type</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getCredentialType()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_CredentialType();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericAccount <em>Generic Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Account</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getGenericAccount()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_GenericAccount();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getGenericCredential <em>Generic Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Credential</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getGenericCredential()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_GenericCredential();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNElement <em>Auth NElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth NElement</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getAuthNElement()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_AuthNElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Authentication#getAuthNTypeForwarded <em>Auth NType Forwarded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth NType Forwarded</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getAuthNTypeForwarded()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_AuthNTypeForwarded();

	/**
	 * Returns the meta object for the attribute list '{@link eu.chorevolution.modelingnotations.security.Authentication#getCustomParametersNames <em>Custom Parameters Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Custom Parameters Names</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Authentication#getCustomParametersNames()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_CustomParametersNames();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.security.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Communication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Communication#getName()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.Communication#getSecuredCommunication <em>Secured Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secured Communication</em>'.
	 * @see eu.chorevolution.modelingnotations.security.Communication#getSecuredCommunication()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_SecuredCommunication();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.security.SecurityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.security.SecurityModel#getSecuritypolicyset <em>Securitypolicyset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Securitypolicyset</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityModel#getSecuritypolicyset()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Securitypolicyset();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.security.SecurityModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.security.SecurityModel#getName()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_Name();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.security.CredentialType <em>Credential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credential Type</em>'.
	 * @see eu.chorevolution.modelingnotations.security.CredentialType
	 * @generated
	 */
	EEnum getCredentialType();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.security.AuthenticationElement <em>Authentication Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Element</em>'.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationElement
	 * @generated
	 */
	EEnum getAuthenticationElement();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded <em>Authentication Type Forwarded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Type Forwarded</em>'.
	 * @see eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded
	 * @generated
	 */
	EEnum getAuthenticationTypeForwarded();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl <em>Policy Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPolicySetImpl
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getSecurityPolicySet()
		 * @generated
		 */
		EClass SECURITY_POLICY_SET = eINSTANCE.getSecurityPolicySet();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_POLICY_SET__AUTHENTICATION = eINSTANCE.getSecurityPolicySet_Authentication();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_POLICY_SET__COMMUNICATION = eINSTANCE.getSecurityPolicySet_Communication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_POLICY_SET__NAME = eINSTANCE.getSecurityPolicySet_Name();

		/**
		 * The meta object literal for the '<em><b>Ressource URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_POLICY_SET__RESSOURCE_URL = eINSTANCE.getSecurityPolicySet_RessourceURL();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_POLICY_SET__SERVICE_NAME = eINSTANCE.getSecurityPolicySet_ServiceName();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.impl.AuthenticationImpl
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__NAME = eINSTANCE.getAuthentication_Name();

		/**
		 * The meta object literal for the '<em><b>Credential Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__CREDENTIAL_TYPE = eINSTANCE.getAuthentication_CredentialType();

		/**
		 * The meta object literal for the '<em><b>Generic Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__GENERIC_ACCOUNT = eINSTANCE.getAuthentication_GenericAccount();

		/**
		 * The meta object literal for the '<em><b>Generic Credential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__GENERIC_CREDENTIAL = eINSTANCE.getAuthentication_GenericCredential();

		/**
		 * The meta object literal for the '<em><b>Auth NElement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__AUTH_NELEMENT = eINSTANCE.getAuthentication_AuthNElement();

		/**
		 * The meta object literal for the '<em><b>Auth NType Forwarded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__AUTH_NTYPE_FORWARDED = eINSTANCE.getAuthentication_AuthNTypeForwarded();

		/**
		 * The meta object literal for the '<em><b>Custom Parameters Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__CUSTOM_PARAMETERS_NAMES = eINSTANCE.getAuthentication_CustomParametersNames();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.impl.CommunicationImpl
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__NAME = eINSTANCE.getCommunication_Name();

		/**
		 * The meta object literal for the '<em><b>Secured Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__SECURED_COMMUNICATION = eINSTANCE.getCommunication_SecuredCommunication();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.impl.SecurityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityModelImpl
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Securitypolicyset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITYPOLICYSET = eINSTANCE.getSecurityModel_Securitypolicyset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__NAME = eINSTANCE.getSecurityModel_Name();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.CredentialType <em>Credential Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.CredentialType
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getCredentialType()
		 * @generated
		 */
		EEnum CREDENTIAL_TYPE = eINSTANCE.getCredentialType();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.AuthenticationElement <em>Authentication Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.AuthenticationElement
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthenticationElement()
		 * @generated
		 */
		EEnum AUTHENTICATION_ELEMENT = eINSTANCE.getAuthenticationElement();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded <em>Authentication Type Forwarded</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded
		 * @see eu.chorevolution.modelingnotations.security.impl.SecurityPackageImpl#getAuthenticationTypeForwarded()
		 * @generated
		 */
		EEnum AUTHENTICATION_TYPE_FORWARDED = eINSTANCE.getAuthenticationTypeForwarded();

	}

} //SecurityPackage
