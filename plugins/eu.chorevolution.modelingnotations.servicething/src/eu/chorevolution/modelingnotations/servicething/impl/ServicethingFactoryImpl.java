/**
 */
package eu.chorevolution.modelingnotations.servicething.impl;

import eu.chorevolution.modelingnotations.servicething.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicethingFactoryImpl extends EFactoryImpl implements ServicethingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicethingFactory init() {
		try {
			ServicethingFactory theServicethingFactory = (ServicethingFactory)EPackage.Registry.INSTANCE.getEFactory(ServicethingPackage.eNS_URI);
			if (theServicethingFactory != null) {
				return theServicethingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicethingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicethingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServicethingPackage.SERVICE_THING_MODEL: return createServiceThingModel();
			case ServicethingPackage.WSDL_MODEL: return createWSDLModel();
			case ServicethingPackage.WADL_MODEL: return createWADLModel();
			case ServicethingPackage.COAP_MODEL: return createCOAPModel();
			case ServicethingPackage.IPLTS_MODEL: return createIPLTSModel();
			case ServicethingPackage.WSBPEL_MODEL: return createWSBPELModel();
			case ServicethingPackage.WSSP_MODEL: return createWSSPModel();
			case ServicethingPackage.WSLA_MODEL: return createWSLAModel();
			case ServicethingPackage.IDENTITY_MODEL: return createIdentityModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceThingModel createServiceThingModel() {
		ServiceThingModelImpl serviceThingModel = new ServiceThingModelImpl();
		return serviceThingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLModel createWSDLModel() {
		WSDLModelImpl wsdlModel = new WSDLModelImpl();
		return wsdlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WADLModel createWADLModel() {
		WADLModelImpl wadlModel = new WADLModelImpl();
		return wadlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COAPModel createCOAPModel() {
		COAPModelImpl coapModel = new COAPModelImpl();
		return coapModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPLTSModel createIPLTSModel() {
		IPLTSModelImpl ipltsModel = new IPLTSModelImpl();
		return ipltsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSBPELModel createWSBPELModel() {
		WSBPELModelImpl wsbpelModel = new WSBPELModelImpl();
		return wsbpelModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSSPModel createWSSPModel() {
		WSSPModelImpl wsspModel = new WSSPModelImpl();
		return wsspModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSLAModel createWSLAModel() {
		WSLAModelImpl wslaModel = new WSLAModelImpl();
		return wslaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityModel createIdentityModel() {
		IdentityModelImpl identityModel = new IdentityModelImpl();
		return identityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicethingPackage getServicethingPackage() {
		return (ServicethingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicethingPackage getPackage() {
		return ServicethingPackage.eINSTANCE;
	}

} //ServicethingFactoryImpl
