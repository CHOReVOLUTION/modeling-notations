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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

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
	@Override
	public ServiceThingModel createServiceThingModel() {
		ServiceThingModelImpl serviceThingModel = new ServiceThingModelImpl();
		return serviceThingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSDLModel createWSDLModel() {
		WSDLModelImpl wsdlModel = new WSDLModelImpl();
		return wsdlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WADLModel createWADLModel() {
		WADLModelImpl wadlModel = new WADLModelImpl();
		return wadlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public COAPModel createCOAPModel() {
		COAPModelImpl coapModel = new COAPModelImpl();
		return coapModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPLTSModel createIPLTSModel() {
		IPLTSModelImpl ipltsModel = new IPLTSModelImpl();
		return ipltsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSBPELModel createWSBPELModel() {
		WSBPELModelImpl wsbpelModel = new WSBPELModelImpl();
		return wsbpelModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSSPModel createWSSPModel() {
		WSSPModelImpl wsspModel = new WSSPModelImpl();
		return wsspModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WSLAModel createWSLAModel() {
		WSLAModelImpl wslaModel = new WSLAModelImpl();
		return wslaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentityModel createIdentityModel() {
		IdentityModelImpl identityModel = new IdentityModelImpl();
		return identityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
