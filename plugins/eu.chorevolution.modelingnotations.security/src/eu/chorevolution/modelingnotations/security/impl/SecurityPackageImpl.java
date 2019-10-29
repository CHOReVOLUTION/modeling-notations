/**
 */
package eu.chorevolution.modelingnotations.security.impl;

import eu.chorevolution.modelingnotations.security.Authentication;
import eu.chorevolution.modelingnotations.security.AuthenticationElement;
import eu.chorevolution.modelingnotations.security.AuthenticationTypeForwarded;
import eu.chorevolution.modelingnotations.security.Communication;
import eu.chorevolution.modelingnotations.security.CredentialType;
import eu.chorevolution.modelingnotations.security.SecurityFactory;
import eu.chorevolution.modelingnotations.security.SecurityModel;
import eu.chorevolution.modelingnotations.security.SecurityPackage;
import eu.chorevolution.modelingnotations.security.SecurityPolicySet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityPolicySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum credentialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationTypeForwardedEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityPolicySet() {
		return securityPolicySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPolicySet_Authentication() {
		return (EReference)securityPolicySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityPolicySet_Communication() {
		return (EReference)securityPolicySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPolicySet_Name() {
		return (EAttribute)securityPolicySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPolicySet_RessourceURL() {
		return (EAttribute)securityPolicySetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityPolicySet_ServiceName() {
		return (EAttribute)securityPolicySetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_Name() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_CredentialType() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_GenericAccount() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_GenericCredential() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_AuthNElement() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_AuthNTypeForwarded() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_CustomParametersNames() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Name() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_SecuredCommunication() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityModel() {
		return securityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_Securitypolicyset() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityModel_Name() {
		return (EAttribute)securityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCredentialType() {
		return credentialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationElement() {
		return authenticationElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationTypeForwarded() {
		return authenticationTypeForwardedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securityPolicySetEClass = createEClass(SECURITY_POLICY_SET);
		createEReference(securityPolicySetEClass, SECURITY_POLICY_SET__AUTHENTICATION);
		createEReference(securityPolicySetEClass, SECURITY_POLICY_SET__COMMUNICATION);
		createEAttribute(securityPolicySetEClass, SECURITY_POLICY_SET__NAME);
		createEAttribute(securityPolicySetEClass, SECURITY_POLICY_SET__RESSOURCE_URL);
		createEAttribute(securityPolicySetEClass, SECURITY_POLICY_SET__SERVICE_NAME);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__NAME);
		createEAttribute(authenticationEClass, AUTHENTICATION__CREDENTIAL_TYPE);
		createEAttribute(authenticationEClass, AUTHENTICATION__GENERIC_ACCOUNT);
		createEAttribute(authenticationEClass, AUTHENTICATION__GENERIC_CREDENTIAL);
		createEAttribute(authenticationEClass, AUTHENTICATION__AUTH_NELEMENT);
		createEAttribute(authenticationEClass, AUTHENTICATION__AUTH_NTYPE_FORWARDED);
		createEAttribute(authenticationEClass, AUTHENTICATION__CUSTOM_PARAMETERS_NAMES);

		communicationEClass = createEClass(COMMUNICATION);
		createEAttribute(communicationEClass, COMMUNICATION__NAME);
		createEAttribute(communicationEClass, COMMUNICATION__SECURED_COMMUNICATION);

		securityModelEClass = createEClass(SECURITY_MODEL);
		createEReference(securityModelEClass, SECURITY_MODEL__SECURITYPOLICYSET);
		createEAttribute(securityModelEClass, SECURITY_MODEL__NAME);

		// Create enums
		credentialTypeEEnum = createEEnum(CREDENTIAL_TYPE);
		authenticationElementEEnum = createEEnum(AUTHENTICATION_ELEMENT);
		authenticationTypeForwardedEEnum = createEEnum(AUTHENTICATION_TYPE_FORWARDED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(securityPolicySetEClass, SecurityPolicySet.class, "SecurityPolicySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityPolicySet_Authentication(), this.getAuthentication(), null, "authentication", null, 0, -1, SecurityPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityPolicySet_Communication(), this.getCommunication(), null, "communication", null, 0, -1, SecurityPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPolicySet_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SecurityPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPolicySet_RessourceURL(), theXMLTypePackage.getString(), "ressourceURL", null, 0, 1, SecurityPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityPolicySet_ServiceName(), theXMLTypePackage.getString(), "serviceName", null, 0, 1, SecurityPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_CredentialType(), this.getCredentialType(), "credentialType", "UsernamePassword", 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_GenericAccount(), theXMLTypePackage.getString(), "genericAccount", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_GenericCredential(), theXMLTypePackage.getString(), "genericCredential", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_AuthNElement(), this.getAuthenticationElement(), "authNElement", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_AuthNTypeForwarded(), this.getAuthenticationTypeForwarded(), "AuthNTypeForwarded", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthentication_CustomParametersNames(), ecorePackage.getEString(), "customParametersNames", null, 0, -1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunication_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_SecuredCommunication(), ecorePackage.getEBooleanObject(), "SecuredCommunication", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityModelEClass, SecurityModel.class, "SecurityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityModel_Securitypolicyset(), this.getSecurityPolicySet(), null, "securitypolicyset", null, 1, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityModel_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(credentialTypeEEnum, CredentialType.class, "CredentialType");
		addEEnumLiteral(credentialTypeEEnum, CredentialType.USERNAME_PASSWORD);
		addEEnumLiteral(credentialTypeEEnum, CredentialType.CUSTOM);

		initEEnum(authenticationElementEEnum, AuthenticationElement.class, "AuthenticationElement");
		addEEnumLiteral(authenticationElementEEnum, AuthenticationElement.LASTNAME);
		addEEnumLiteral(authenticationElementEEnum, AuthenticationElement.EMAIL);

		initEEnum(authenticationTypeForwardedEEnum, AuthenticationTypeForwarded.class, "AuthenticationTypeForwarded");
		addEEnumLiteral(authenticationTypeForwardedEEnum, AuthenticationTypeForwarded.USER_ACCOUNT);
		addEEnumLiteral(authenticationTypeForwardedEEnum, AuthenticationTypeForwarded.GENERIC_ACCOUNT);
		addEEnumLiteral(authenticationTypeForwardedEEnum, AuthenticationTypeForwarded.CUSTOM_ACCOUNT);

		// Create resource
		createResource(eNS_URI);
	}

} //SecurityPackageImpl
