/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.chorevolution.modelingnotations.chorarch.impl;

import eu.chorevolution.modelingnotations.chorarch.*;

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
public class ChorarchFactoryImpl extends EFactoryImpl implements ChorarchFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChorarchFactory init() {
		try {
			ChorarchFactory theChorarchFactory = (ChorarchFactory)EPackage.Registry.INSTANCE.getEFactory(ChorarchPackage.eNS_URI);
			if (theChorarchFactory != null) {
				return theChorarchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChorarchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChorarchFactoryImpl() {
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
			case ChorarchPackage.CHOR_ARCH_MODEL: return createChorArchModel();
			case ChorarchPackage.ADAPTER: return createAdapter();
			case ChorarchPackage.SECURITY_FILTER: return createSecurityFilter();
			case ChorarchPackage.BINDING_COMPONENT: return createBindingComponent();
			case ChorarchPackage.PROSUMER_COORDINATION_DELEGATE: return createProsumerCoordinationDelegate();
			case ChorarchPackage.WEB_SERVICE_COMPONENT: return createWebServiceComponent();
			case ChorarchPackage.REST_SERVICE_COMPONENT: return createRestServiceComponent();
			case ChorarchPackage.THING_COMPONENT: return createThingComponent();
			case ChorarchPackage.CONSUMER_COORDINATION_DELEGATE: return createConsumerCoordinationDelegate();
			case ChorarchPackage.CONSUMER_INTERFACE: return createConsumerInterface();
			case ChorarchPackage.PROVIDER_INTERFACE: return createProviderInterface();
			case ChorarchPackage.CLIENT_APP_COMPONENT: return createClientAppComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChorArchModel createChorArchModel() {
		ChorArchModelImpl chorArchModel = new ChorArchModelImpl();
		return chorArchModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAdapter() {
		AdapterImpl adapter = new AdapterImpl();
		return adapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFilter createSecurityFilter() {
		SecurityFilterImpl securityFilter = new SecurityFilterImpl();
		return securityFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingComponent createBindingComponent() {
		BindingComponentImpl bindingComponent = new BindingComponentImpl();
		return bindingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProsumerCoordinationDelegate createProsumerCoordinationDelegate() {
		ProsumerCoordinationDelegateImpl prosumerCoordinationDelegate = new ProsumerCoordinationDelegateImpl();
		return prosumerCoordinationDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebServiceComponent createWebServiceComponent() {
		WebServiceComponentImpl webServiceComponent = new WebServiceComponentImpl();
		return webServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestServiceComponent createRestServiceComponent() {
		RestServiceComponentImpl restServiceComponent = new RestServiceComponentImpl();
		return restServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingComponent createThingComponent() {
		ThingComponentImpl thingComponent = new ThingComponentImpl();
		return thingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumerCoordinationDelegate createConsumerCoordinationDelegate() {
		ConsumerCoordinationDelegateImpl consumerCoordinationDelegate = new ConsumerCoordinationDelegateImpl();
		return consumerCoordinationDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumerInterface createConsumerInterface() {
		ConsumerInterfaceImpl consumerInterface = new ConsumerInterfaceImpl();
		return consumerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderInterface createProviderInterface() {
		ProviderInterfaceImpl providerInterface = new ProviderInterfaceImpl();
		return providerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientAppComponent createClientAppComponent() {
		ClientAppComponentImpl clientAppComponent = new ClientAppComponentImpl();
		return clientAppComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChorarchPackage getChorarchPackage() {
		return (ChorarchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChorarchPackage getPackage() {
		return ChorarchPackage.eINSTANCE;
	}

} //ChorarchFactoryImpl
