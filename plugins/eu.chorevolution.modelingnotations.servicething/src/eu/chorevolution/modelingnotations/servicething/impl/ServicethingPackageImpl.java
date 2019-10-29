/**
 */
package eu.chorevolution.modelingnotations.servicething.impl;

import eu.chorevolution.modelingnotations.servicething.COAPModel;
import eu.chorevolution.modelingnotations.servicething.IPLTSModel;
import eu.chorevolution.modelingnotations.servicething.IdentityDescription;
import eu.chorevolution.modelingnotations.servicething.IdentityModel;
import eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription;
import eu.chorevolution.modelingnotations.servicething.InterfaceDescription;
import eu.chorevolution.modelingnotations.servicething.QoSDescription;
import eu.chorevolution.modelingnotations.servicething.SecurityDescription;
import eu.chorevolution.modelingnotations.servicething.ServiceThingModel;
import eu.chorevolution.modelingnotations.servicething.ServicethingFactory;
import eu.chorevolution.modelingnotations.servicething.ServicethingPackage;
import eu.chorevolution.modelingnotations.servicething.WADLModel;
import eu.chorevolution.modelingnotations.servicething.WSBPELModel;
import eu.chorevolution.modelingnotations.servicething.WSDLModel;
import eu.chorevolution.modelingnotations.servicething.WSLAModel;
import eu.chorevolution.modelingnotations.servicething.WSSPModel;

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
public class ServicethingPackageImpl extends EPackageImpl implements ServicethingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceThingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionProtocolDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wadlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coapModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipltsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsbpelModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsspModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wslaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityModelEClass = null;

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
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicethingPackageImpl() {
		super(eNS_URI, ServicethingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicethingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicethingPackage init() {
		if (isInited) return (ServicethingPackage)EPackage.Registry.INSTANCE.getEPackage(ServicethingPackage.eNS_URI);

		// Obtain or create and register package
		ServicethingPackageImpl theServicethingPackage = (ServicethingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicethingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicethingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theServicethingPackage.createPackageContents();

		// Initialize created meta-data
		theServicethingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicethingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicethingPackage.eNS_URI, theServicethingPackage);
		return theServicethingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceThingModel() {
		return serviceThingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceThingModel_InterfaceDescription() {
		return (EReference)serviceThingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceThingModel_InteractionProtocolDescription() {
		return (EReference)serviceThingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceThingModel_QosDescription() {
		return (EReference)serviceThingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceThingModel_IdentityDescription() {
		return (EReference)serviceThingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceThingModel_SecurityDescription() {
		return (EReference)serviceThingModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceThingModel_ID() {
		return (EAttribute)serviceThingModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceThingModel_Name() {
		return (EAttribute)serviceThingModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceThingModel_Endpoint() {
		return (EAttribute)serviceThingModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceThingModel_Description() {
		return (EAttribute)serviceThingModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDescription() {
		return interfaceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProtocolDescription() {
		return interactionProtocolDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoSDescription() {
		return qoSDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityDescription() {
		return identityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityDescription() {
		return securityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSDLModel() {
		return wsdlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWADLModel() {
		return wadlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOAPModel() {
		return coapModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPLTSModel() {
		return ipltsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSBPELModel() {
		return wsbpelModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSSPModel() {
		return wsspModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSLAModel() {
		return wslaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityModel() {
		return identityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicethingFactory getServicethingFactory() {
		return (ServicethingFactory)getEFactoryInstance();
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
		serviceThingModelEClass = createEClass(SERVICE_THING_MODEL);
		createEReference(serviceThingModelEClass, SERVICE_THING_MODEL__INTERFACE_DESCRIPTION);
		createEReference(serviceThingModelEClass, SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION);
		createEReference(serviceThingModelEClass, SERVICE_THING_MODEL__QOS_DESCRIPTION);
		createEReference(serviceThingModelEClass, SERVICE_THING_MODEL__IDENTITY_DESCRIPTION);
		createEReference(serviceThingModelEClass, SERVICE_THING_MODEL__SECURITY_DESCRIPTION);
		createEAttribute(serviceThingModelEClass, SERVICE_THING_MODEL__ID);
		createEAttribute(serviceThingModelEClass, SERVICE_THING_MODEL__NAME);
		createEAttribute(serviceThingModelEClass, SERVICE_THING_MODEL__ENDPOINT);
		createEAttribute(serviceThingModelEClass, SERVICE_THING_MODEL__DESCRIPTION);

		interfaceDescriptionEClass = createEClass(INTERFACE_DESCRIPTION);

		interactionProtocolDescriptionEClass = createEClass(INTERACTION_PROTOCOL_DESCRIPTION);

		qoSDescriptionEClass = createEClass(QO_SDESCRIPTION);

		identityDescriptionEClass = createEClass(IDENTITY_DESCRIPTION);

		securityDescriptionEClass = createEClass(SECURITY_DESCRIPTION);

		wsdlModelEClass = createEClass(WSDL_MODEL);

		wadlModelEClass = createEClass(WADL_MODEL);

		coapModelEClass = createEClass(COAP_MODEL);

		ipltsModelEClass = createEClass(IPLTS_MODEL);

		wsbpelModelEClass = createEClass(WSBPEL_MODEL);

		wsspModelEClass = createEClass(WSSP_MODEL);

		wslaModelEClass = createEClass(WSLA_MODEL);

		identityModelEClass = createEClass(IDENTITY_MODEL);
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
		wsdlModelEClass.getESuperTypes().add(this.getInterfaceDescription());
		wadlModelEClass.getESuperTypes().add(this.getInterfaceDescription());
		coapModelEClass.getESuperTypes().add(this.getInterfaceDescription());
		ipltsModelEClass.getESuperTypes().add(this.getInteractionProtocolDescription());
		wsbpelModelEClass.getESuperTypes().add(this.getInteractionProtocolDescription());
		wsspModelEClass.getESuperTypes().add(this.getSecurityDescription());
		wslaModelEClass.getESuperTypes().add(this.getQoSDescription());
		identityModelEClass.getESuperTypes().add(this.getIdentityDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceThingModelEClass, ServiceThingModel.class, "ServiceThingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceThingModel_InterfaceDescription(), this.getInterfaceDescription(), null, "interfaceDescription", null, 1, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceThingModel_InteractionProtocolDescription(), this.getInteractionProtocolDescription(), null, "interactionProtocolDescription", null, 0, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceThingModel_QosDescription(), this.getQoSDescription(), null, "qosDescription", null, 0, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceThingModel_IdentityDescription(), this.getIdentityDescription(), null, "identityDescription", null, 0, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceThingModel_SecurityDescription(), this.getSecurityDescription(), null, "securityDescription", null, 0, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceThingModel_ID(), ecorePackage.getEString(), "ID", null, 1, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceThingModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceThingModel_Endpoint(), ecorePackage.getEString(), "endpoint", null, 1, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceThingModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceThingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDescriptionEClass, InterfaceDescription.class, "InterfaceDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionProtocolDescriptionEClass, InteractionProtocolDescription.class, "InteractionProtocolDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qoSDescriptionEClass, QoSDescription.class, "QoSDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityDescriptionEClass, IdentityDescription.class, "IdentityDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityDescriptionEClass, SecurityDescription.class, "SecurityDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsdlModelEClass, WSDLModel.class, "WSDLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wadlModelEClass, WADLModel.class, "WADLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coapModelEClass, COAPModel.class, "COAPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ipltsModelEClass, IPLTSModel.class, "IPLTSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsbpelModelEClass, WSBPELModel.class, "WSBPELModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsspModelEClass, WSSPModel.class, "WSSPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wslaModelEClass, WSLAModel.class, "WSLAModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityModelEClass, IdentityModel.class, "IdentityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicethingPackageImpl
