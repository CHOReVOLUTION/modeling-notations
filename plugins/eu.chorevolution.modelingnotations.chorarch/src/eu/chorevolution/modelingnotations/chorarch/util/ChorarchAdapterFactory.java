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
package eu.chorevolution.modelingnotations.chorarch.util;

import eu.chorevolution.modelingnotations.chorarch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage
 * @generated
 */
public class ChorarchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChorarchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChorarchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChorarchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChorarchSwitch<Adapter> modelSwitch =
		new ChorarchSwitch<Adapter>() {
			@Override
			public Adapter caseChorArchModel(ChorArchModel object) {
				return createChorArchModelAdapter();
			}
			@Override
			public Adapter caseBusinessComponent(BusinessComponent object) {
				return createBusinessComponentAdapter();
			}
			@Override
			public Adapter caseAdapter(eu.chorevolution.modelingnotations.chorarch.Adapter object) {
				return createAdapterAdapter();
			}
			@Override
			public Adapter caseSecurityFilter(SecurityFilter object) {
				return createSecurityFilterAdapter();
			}
			@Override
			public Adapter caseBindingComponent(BindingComponent object) {
				return createBindingComponentAdapter();
			}
			@Override
			public Adapter caseProsumerCoordinationDelegate(ProsumerCoordinationDelegate object) {
				return createProsumerCoordinationDelegateAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseAdditionalComponent(AdditionalComponent object) {
				return createAdditionalComponentAdapter();
			}
			@Override
			public Adapter caseWebServiceComponent(WebServiceComponent object) {
				return createWebServiceComponentAdapter();
			}
			@Override
			public Adapter caseRestServiceComponent(RestServiceComponent object) {
				return createRestServiceComponentAdapter();
			}
			@Override
			public Adapter caseThingComponent(ThingComponent object) {
				return createThingComponentAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseConsumerCoordinationDelegate(ConsumerCoordinationDelegate object) {
				return createConsumerCoordinationDelegateAdapter();
			}
			@Override
			public Adapter caseConsumerInterface(ConsumerInterface object) {
				return createConsumerInterfaceAdapter();
			}
			@Override
			public Adapter caseProviderInterface(ProviderInterface object) {
				return createProviderInterfaceAdapter();
			}
			@Override
			public Adapter caseClientAppComponent(ClientAppComponent object) {
				return createClientAppComponentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel <em>Chor Arch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorArchModel
	 * @generated
	 */
	public Adapter createChorArchModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.BusinessComponent <em>Business Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.BusinessComponent
	 * @generated
	 */
	public Adapter createBusinessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.Adapter
	 * @generated
	 */
	public Adapter createAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.SecurityFilter <em>Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.SecurityFilter
	 * @generated
	 */
	public Adapter createSecurityFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.BindingComponent <em>Binding Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.BindingComponent
	 * @generated
	 */
	public Adapter createBindingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ProsumerCoordinationDelegate <em>Prosumer Coordination Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ProsumerCoordinationDelegate
	 * @generated
	 */
	public Adapter createProsumerCoordinationDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.AdditionalComponent <em>Additional Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.AdditionalComponent
	 * @generated
	 */
	public Adapter createAdditionalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.WebServiceComponent <em>Web Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.WebServiceComponent
	 * @generated
	 */
	public Adapter createWebServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.RestServiceComponent <em>Rest Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.RestServiceComponent
	 * @generated
	 */
	public Adapter createRestServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ThingComponent <em>Thing Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ThingComponent
	 * @generated
	 */
	public Adapter createThingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerCoordinationDelegate <em>Consumer Coordination Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerCoordinationDelegate
	 * @generated
	 */
	public Adapter createConsumerCoordinationDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerInterface <em>Consumer Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerInterface
	 * @generated
	 */
	public Adapter createConsumerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ProviderInterface <em>Provider Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ProviderInterface
	 * @generated
	 */
	public Adapter createProviderInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.chorarch.ClientAppComponent <em>Client App Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.chorarch.ClientAppComponent
	 * @generated
	 */
	public Adapter createClientAppComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChorarchAdapterFactory
