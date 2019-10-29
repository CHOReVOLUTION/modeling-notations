/**
 */
package eu.chorevolution.modelingnotations.servicething;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingFactory
 * @model kind="package"
 * @generated
 */
public interface ServicethingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicething";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.chorevolution/modelingnotations/servicething";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "servicething";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicethingPackage eINSTANCE = eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl <em>Service Thing Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getServiceThingModel()
	 * @generated
	 */
	int SERVICE_THING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Interface Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__INTERFACE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Interaction Protocol Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Qos Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__QOS_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Identity Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__IDENTITY_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Security Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__SECURITY_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__NAME = 6;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__ENDPOINT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL__DESCRIPTION = 8;

	/**
	 * The number of structural features of the '<em>Service Thing Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Service Thing Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_THING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.InterfaceDescriptionImpl <em>Interface Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.InterfaceDescriptionImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getInterfaceDescription()
	 * @generated
	 */
	int INTERFACE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Interface Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.InteractionProtocolDescriptionImpl <em>Interaction Protocol Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.InteractionProtocolDescriptionImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getInteractionProtocolDescription()
	 * @generated
	 */
	int INTERACTION_PROTOCOL_DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Interaction Protocol Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROTOCOL_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interaction Protocol Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_PROTOCOL_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.QoSDescriptionImpl <em>Qo SDescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.QoSDescriptionImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getQoSDescription()
	 * @generated
	 */
	int QO_SDESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Qo SDescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Qo SDescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SDESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IdentityDescriptionImpl <em>Identity Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.IdentityDescriptionImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIdentityDescription()
	 * @generated
	 */
	int IDENTITY_DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Identity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Identity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.SecurityDescriptionImpl <em>Security Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.SecurityDescriptionImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getSecurityDescription()
	 * @generated
	 */
	int SECURITY_DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Security Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSDLModelImpl <em>WSDL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.WSDLModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSDLModel()
	 * @generated
	 */
	int WSDL_MODEL = 6;

	/**
	 * The number of structural features of the '<em>WSDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MODEL_FEATURE_COUNT = INTERFACE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MODEL_OPERATION_COUNT = INTERFACE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WADLModelImpl <em>WADL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.WADLModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWADLModel()
	 * @generated
	 */
	int WADL_MODEL = 7;

	/**
	 * The number of structural features of the '<em>WADL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WADL_MODEL_FEATURE_COUNT = INTERFACE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WADL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WADL_MODEL_OPERATION_COUNT = INTERFACE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.COAPModelImpl <em>COAP Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.COAPModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getCOAPModel()
	 * @generated
	 */
	int COAP_MODEL = 8;

	/**
	 * The number of structural features of the '<em>COAP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COAP_MODEL_FEATURE_COUNT = INTERFACE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>COAP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COAP_MODEL_OPERATION_COUNT = INTERFACE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IPLTSModelImpl <em>IPLTS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.IPLTSModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIPLTSModel()
	 * @generated
	 */
	int IPLTS_MODEL = 9;

	/**
	 * The number of structural features of the '<em>IPLTS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPLTS_MODEL_FEATURE_COUNT = INTERACTION_PROTOCOL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPLTS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPLTS_MODEL_OPERATION_COUNT = INTERACTION_PROTOCOL_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSBPELModelImpl <em>WSBPEL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.WSBPELModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSBPELModel()
	 * @generated
	 */
	int WSBPEL_MODEL = 10;

	/**
	 * The number of structural features of the '<em>WSBPEL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSBPEL_MODEL_FEATURE_COUNT = INTERACTION_PROTOCOL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSBPEL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSBPEL_MODEL_OPERATION_COUNT = INTERACTION_PROTOCOL_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSSPModelImpl <em>WSSP Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.WSSPModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSSPModel()
	 * @generated
	 */
	int WSSP_MODEL = 11;

	/**
	 * The number of structural features of the '<em>WSSP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSSP_MODEL_FEATURE_COUNT = SECURITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSSP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSSP_MODEL_OPERATION_COUNT = SECURITY_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSLAModelImpl <em>WSLA Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.WSLAModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSLAModel()
	 * @generated
	 */
	int WSLA_MODEL = 12;

	/**
	 * The number of structural features of the '<em>WSLA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSLA_MODEL_FEATURE_COUNT = QO_SDESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WSLA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSLA_MODEL_OPERATION_COUNT = QO_SDESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IdentityModelImpl <em>Identity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.servicething.impl.IdentityModelImpl
	 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIdentityModel()
	 * @generated
	 */
	int IDENTITY_MODEL = 13;

	/**
	 * The number of structural features of the '<em>Identity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_MODEL_FEATURE_COUNT = IDENTITY_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_MODEL_OPERATION_COUNT = IDENTITY_DESCRIPTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel <em>Service Thing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Thing Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel
	 * @generated
	 */
	EClass getServiceThingModel();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInterfaceDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EReference getServiceThingModel_InterfaceDescription();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInteractionProtocolDescription <em>Interaction Protocol Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Protocol Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInteractionProtocolDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EReference getServiceThingModel_InteractionProtocolDescription();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getQosDescription <em>Qos Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qos Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getQosDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EReference getServiceThingModel_QosDescription();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getIdentityDescription <em>Identity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identity Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getIdentityDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EReference getServiceThingModel_IdentityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getSecurityDescription <em>Security Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getSecurityDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EReference getServiceThingModel_SecurityDescription();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getID()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EAttribute getServiceThingModel_ID();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getName()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EAttribute getServiceThingModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getEndpoint()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EAttribute getServiceThingModel_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getDescription()
	 * @see #getServiceThingModel()
	 * @generated
	 */
	EAttribute getServiceThingModel_Description();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.InterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.InterfaceDescription
	 * @generated
	 */
	EClass getInterfaceDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription <em>Interaction Protocol Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Protocol Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription
	 * @generated
	 */
	EClass getInteractionProtocolDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.QoSDescription <em>Qo SDescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SDescription</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.QoSDescription
	 * @generated
	 */
	EClass getQoSDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.IdentityDescription <em>Identity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.IdentityDescription
	 * @generated
	 */
	EClass getIdentityDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.SecurityDescription <em>Security Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Description</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.SecurityDescription
	 * @generated
	 */
	EClass getSecurityDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.WSDLModel <em>WSDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.WSDLModel
	 * @generated
	 */
	EClass getWSDLModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.WADLModel <em>WADL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WADL Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.WADLModel
	 * @generated
	 */
	EClass getWADLModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.COAPModel <em>COAP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COAP Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.COAPModel
	 * @generated
	 */
	EClass getCOAPModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.IPLTSModel <em>IPLTS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPLTS Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.IPLTSModel
	 * @generated
	 */
	EClass getIPLTSModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.WSBPELModel <em>WSBPEL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSBPEL Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.WSBPELModel
	 * @generated
	 */
	EClass getWSBPELModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.WSSPModel <em>WSSP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSSP Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.WSSPModel
	 * @generated
	 */
	EClass getWSSPModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.WSLAModel <em>WSLA Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSLA Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.WSLAModel
	 * @generated
	 */
	EClass getWSLAModel();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.servicething.IdentityModel <em>Identity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Model</em>'.
	 * @see eu.chorevolution.modelingnotations.servicething.IdentityModel
	 * @generated
	 */
	EClass getIdentityModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicethingFactory getServicethingFactory();

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
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl <em>Service Thing Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getServiceThingModel()
		 * @generated
		 */
		EClass SERVICE_THING_MODEL = eINSTANCE.getServiceThingModel();

		/**
		 * The meta object literal for the '<em><b>Interface Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_THING_MODEL__INTERFACE_DESCRIPTION = eINSTANCE.getServiceThingModel_InterfaceDescription();

		/**
		 * The meta object literal for the '<em><b>Interaction Protocol Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION = eINSTANCE.getServiceThingModel_InteractionProtocolDescription();

		/**
		 * The meta object literal for the '<em><b>Qos Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_THING_MODEL__QOS_DESCRIPTION = eINSTANCE.getServiceThingModel_QosDescription();

		/**
		 * The meta object literal for the '<em><b>Identity Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_THING_MODEL__IDENTITY_DESCRIPTION = eINSTANCE.getServiceThingModel_IdentityDescription();

		/**
		 * The meta object literal for the '<em><b>Security Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_THING_MODEL__SECURITY_DESCRIPTION = eINSTANCE.getServiceThingModel_SecurityDescription();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_THING_MODEL__ID = eINSTANCE.getServiceThingModel_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_THING_MODEL__NAME = eINSTANCE.getServiceThingModel_Name();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_THING_MODEL__ENDPOINT = eINSTANCE.getServiceThingModel_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_THING_MODEL__DESCRIPTION = eINSTANCE.getServiceThingModel_Description();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.InterfaceDescriptionImpl <em>Interface Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.InterfaceDescriptionImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getInterfaceDescription()
		 * @generated
		 */
		EClass INTERFACE_DESCRIPTION = eINSTANCE.getInterfaceDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.InteractionProtocolDescriptionImpl <em>Interaction Protocol Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.InteractionProtocolDescriptionImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getInteractionProtocolDescription()
		 * @generated
		 */
		EClass INTERACTION_PROTOCOL_DESCRIPTION = eINSTANCE.getInteractionProtocolDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.QoSDescriptionImpl <em>Qo SDescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.QoSDescriptionImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getQoSDescription()
		 * @generated
		 */
		EClass QO_SDESCRIPTION = eINSTANCE.getQoSDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IdentityDescriptionImpl <em>Identity Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.IdentityDescriptionImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIdentityDescription()
		 * @generated
		 */
		EClass IDENTITY_DESCRIPTION = eINSTANCE.getIdentityDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.SecurityDescriptionImpl <em>Security Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.SecurityDescriptionImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getSecurityDescription()
		 * @generated
		 */
		EClass SECURITY_DESCRIPTION = eINSTANCE.getSecurityDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSDLModelImpl <em>WSDL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.WSDLModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSDLModel()
		 * @generated
		 */
		EClass WSDL_MODEL = eINSTANCE.getWSDLModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WADLModelImpl <em>WADL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.WADLModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWADLModel()
		 * @generated
		 */
		EClass WADL_MODEL = eINSTANCE.getWADLModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.COAPModelImpl <em>COAP Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.COAPModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getCOAPModel()
		 * @generated
		 */
		EClass COAP_MODEL = eINSTANCE.getCOAPModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IPLTSModelImpl <em>IPLTS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.IPLTSModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIPLTSModel()
		 * @generated
		 */
		EClass IPLTS_MODEL = eINSTANCE.getIPLTSModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSBPELModelImpl <em>WSBPEL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.WSBPELModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSBPELModel()
		 * @generated
		 */
		EClass WSBPEL_MODEL = eINSTANCE.getWSBPELModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSSPModelImpl <em>WSSP Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.WSSPModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSSPModel()
		 * @generated
		 */
		EClass WSSP_MODEL = eINSTANCE.getWSSPModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.WSLAModelImpl <em>WSLA Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.WSLAModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getWSLAModel()
		 * @generated
		 */
		EClass WSLA_MODEL = eINSTANCE.getWSLAModel();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.servicething.impl.IdentityModelImpl <em>Identity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.servicething.impl.IdentityModelImpl
		 * @see eu.chorevolution.modelingnotations.servicething.impl.ServicethingPackageImpl#getIdentityModel()
		 * @generated
		 */
		EClass IDENTITY_MODEL = eINSTANCE.getIdentityModel();

	}

} //ServicethingPackage
