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
package eu.chorevolution.modelingnotations.chorarch.impl;

import eu.chorevolution.modelingnotations.chorarch.Adapter;
import eu.chorevolution.modelingnotations.chorarch.AdditionalComponent;
import eu.chorevolution.modelingnotations.chorarch.BindingComponent;
import eu.chorevolution.modelingnotations.chorarch.BusinessComponent;
import eu.chorevolution.modelingnotations.chorarch.ChorArchModel;
import eu.chorevolution.modelingnotations.chorarch.ChorarchFactory;
import eu.chorevolution.modelingnotations.chorarch.ChorarchPackage;
import eu.chorevolution.modelingnotations.chorarch.ClientAppComponent;
import eu.chorevolution.modelingnotations.chorarch.Component;
import eu.chorevolution.modelingnotations.chorarch.ConsumerCoordinationDelegate;
import eu.chorevolution.modelingnotations.chorarch.ConsumerInterface;
import eu.chorevolution.modelingnotations.chorarch.Interface;
import eu.chorevolution.modelingnotations.chorarch.ProsumerCoordinationDelegate;
import eu.chorevolution.modelingnotations.chorarch.ProviderInterface;
import eu.chorevolution.modelingnotations.chorarch.RestServiceComponent;
import eu.chorevolution.modelingnotations.chorarch.SecurityFilter;
import eu.chorevolution.modelingnotations.chorarch.ThingComponent;
import eu.chorevolution.modelingnotations.chorarch.WebServiceComponent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChorarchPackageImpl extends EPackageImpl implements ChorarchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chorArchModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prosumerCoordinationDelegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restServiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerCoordinationDelegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientAppComponentEClass = null;

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
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChorarchPackageImpl() {
		super(eNS_URI, ChorarchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChorarchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChorarchPackage init() {
		if (isInited) return (ChorarchPackage)EPackage.Registry.INSTANCE.getEPackage(ChorarchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChorarchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChorarchPackageImpl theChorarchPackage = registeredChorarchPackage instanceof ChorarchPackageImpl ? (ChorarchPackageImpl)registeredChorarchPackage : new ChorarchPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theChorarchPackage.createPackageContents();

		// Initialize created meta-data
		theChorarchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChorarchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChorarchPackage.eNS_URI, theChorarchPackage);
		return theChorarchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChorArchModel() {
		return chorArchModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChorArchModel_Components() {
		return (EReference)chorArchModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChorArchModel_ChoreographyID() {
		return (EAttribute)chorArchModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChorArchModel_ChoreographyName() {
		return (EAttribute)chorArchModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessComponent() {
		return businessComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessComponent_Uri() {
		return (EAttribute)businessComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityFilter() {
		return securityFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityFilter_Global() {
		return (EAttribute)securityFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingComponent() {
		return bindingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProsumerCoordinationDelegate() {
		return prosumerCoordinationDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Roles() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Interfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalComponent() {
		return additionalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalComponent_Location() {
		return (EAttribute)additionalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebServiceComponent() {
		return webServiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestServiceComponent() {
		return restServiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThingComponent() {
		return thingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_PortNumber() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_ServiceDescription() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumerCoordinationDelegate() {
		return consumerCoordinationDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumerInterface() {
		return consumerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsumerInterface_ServiceRequired() {
		return (EReference)consumerInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProviderInterface() {
		return providerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProviderInterface_ServiceProvided() {
		return (EReference)providerInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClientAppComponent() {
		return clientAppComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChorarchFactory getChorarchFactory() {
		return (ChorarchFactory)getEFactoryInstance();
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
		chorArchModelEClass = createEClass(CHOR_ARCH_MODEL);
		createEReference(chorArchModelEClass, CHOR_ARCH_MODEL__COMPONENTS);
		createEAttribute(chorArchModelEClass, CHOR_ARCH_MODEL__CHOREOGRAPHY_ID);
		createEAttribute(chorArchModelEClass, CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME);

		businessComponentEClass = createEClass(BUSINESS_COMPONENT);
		createEAttribute(businessComponentEClass, BUSINESS_COMPONENT__URI);

		adapterEClass = createEClass(ADAPTER);

		securityFilterEClass = createEClass(SECURITY_FILTER);
		createEAttribute(securityFilterEClass, SECURITY_FILTER__GLOBAL);

		bindingComponentEClass = createEClass(BINDING_COMPONENT);

		prosumerCoordinationDelegateEClass = createEClass(PROSUMER_COORDINATION_DELEGATE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__ROLES);
		createEReference(componentEClass, COMPONENT__INTERFACES);

		additionalComponentEClass = createEClass(ADDITIONAL_COMPONENT);
		createEAttribute(additionalComponentEClass, ADDITIONAL_COMPONENT__LOCATION);

		webServiceComponentEClass = createEClass(WEB_SERVICE_COMPONENT);

		restServiceComponentEClass = createEClass(REST_SERVICE_COMPONENT);

		thingComponentEClass = createEClass(THING_COMPONENT);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__PORT_NUMBER);
		createEAttribute(interfaceEClass, INTERFACE__SERVICE_DESCRIPTION);

		consumerCoordinationDelegateEClass = createEClass(CONSUMER_COORDINATION_DELEGATE);

		consumerInterfaceEClass = createEClass(CONSUMER_INTERFACE);
		createEReference(consumerInterfaceEClass, CONSUMER_INTERFACE__SERVICE_REQUIRED);

		providerInterfaceEClass = createEClass(PROVIDER_INTERFACE);
		createEReference(providerInterfaceEClass, PROVIDER_INTERFACE__SERVICE_PROVIDED);

		clientAppComponentEClass = createEClass(CLIENT_APP_COMPONENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessComponentEClass.getESuperTypes().add(this.getComponent());
		adapterEClass.getESuperTypes().add(this.getAdditionalComponent());
		securityFilterEClass.getESuperTypes().add(this.getAdditionalComponent());
		bindingComponentEClass.getESuperTypes().add(this.getAdditionalComponent());
		prosumerCoordinationDelegateEClass.getESuperTypes().add(this.getAdditionalComponent());
		additionalComponentEClass.getESuperTypes().add(this.getComponent());
		webServiceComponentEClass.getESuperTypes().add(this.getBusinessComponent());
		restServiceComponentEClass.getESuperTypes().add(this.getBusinessComponent());
		thingComponentEClass.getESuperTypes().add(this.getBusinessComponent());
		consumerCoordinationDelegateEClass.getESuperTypes().add(this.getAdditionalComponent());
		consumerInterfaceEClass.getESuperTypes().add(this.getInterface());
		providerInterfaceEClass.getESuperTypes().add(this.getInterface());
		clientAppComponentEClass.getESuperTypes().add(this.getBusinessComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(chorArchModelEClass, ChorArchModel.class, "ChorArchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChorArchModel_Components(), this.getComponent(), null, "components", null, 0, -1, ChorArchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChorArchModel_ChoreographyID(), ecorePackage.getEString(), "choreographyID", null, 1, 1, ChorArchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChorArchModel_ChoreographyName(), ecorePackage.getEString(), "choreographyName", null, 1, 1, ChorArchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessComponentEClass, BusinessComponent.class, "BusinessComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessComponent_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, BusinessComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterEClass, Adapter.class, "Adapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityFilterEClass, SecurityFilter.class, "SecurityFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityFilter_Global(), ecorePackage.getEBoolean(), "global", "false", 1, 1, SecurityFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingComponentEClass, BindingComponent.class, "BindingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prosumerCoordinationDelegateEClass, ProsumerCoordinationDelegate.class, "ProsumerCoordinationDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", "", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Roles(), ecorePackage.getEString(), "roles", null, 1, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalComponentEClass, AdditionalComponent.class, "AdditionalComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalComponent_Location(), ecorePackage.getEString(), "location", null, 1, 1, AdditionalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webServiceComponentEClass, WebServiceComponent.class, "WebServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restServiceComponentEClass, RestServiceComponent.class, "RestServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingComponentEClass, ThingComponent.class, "ThingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_ServiceDescription(), ecorePackage.getEString(), "serviceDescription", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumerCoordinationDelegateEClass, ConsumerCoordinationDelegate.class, "ConsumerCoordinationDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumerInterfaceEClass, ConsumerInterface.class, "ConsumerInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumerInterface_ServiceRequired(), this.getProviderInterface(), this.getProviderInterface_ServiceProvided(), "serviceRequired", null, 0, -1, ConsumerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerInterfaceEClass, ProviderInterface.class, "ProviderInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProviderInterface_ServiceProvided(), this.getConsumerInterface(), this.getConsumerInterface_ServiceRequired(), "serviceProvided", null, 0, -1, ProviderInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientAppComponentEClass, ClientAppComponent.class, "ClientAppComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ChorarchPackageImpl
