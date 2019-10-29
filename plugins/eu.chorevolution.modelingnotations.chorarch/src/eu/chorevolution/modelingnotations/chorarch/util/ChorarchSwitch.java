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
package eu.chorevolution.modelingnotations.chorarch.util;

import eu.chorevolution.modelingnotations.chorarch.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage
 * @generated
 */
public class ChorarchSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChorarchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChorarchSwitch() {
		if (modelPackage == null) {
			modelPackage = ChorarchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChorarchPackage.CHOR_ARCH_MODEL: {
				ChorArchModel chorArchModel = (ChorArchModel)theEObject;
				T result = caseChorArchModel(chorArchModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.BUSINESS_COMPONENT: {
				BusinessComponent businessComponent = (BusinessComponent)theEObject;
				T result = caseBusinessComponent(businessComponent);
				if (result == null) result = caseComponent(businessComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.ADAPTER: {
				Adapter adapter = (Adapter)theEObject;
				T result = caseAdapter(adapter);
				if (result == null) result = caseAdditionalComponent(adapter);
				if (result == null) result = caseComponent(adapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.SECURITY_FILTER: {
				SecurityFilter securityFilter = (SecurityFilter)theEObject;
				T result = caseSecurityFilter(securityFilter);
				if (result == null) result = caseAdditionalComponent(securityFilter);
				if (result == null) result = caseComponent(securityFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.BINDING_COMPONENT: {
				BindingComponent bindingComponent = (BindingComponent)theEObject;
				T result = caseBindingComponent(bindingComponent);
				if (result == null) result = caseAdditionalComponent(bindingComponent);
				if (result == null) result = caseComponent(bindingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.PROSUMER_COORDINATION_DELEGATE: {
				ProsumerCoordinationDelegate prosumerCoordinationDelegate = (ProsumerCoordinationDelegate)theEObject;
				T result = caseProsumerCoordinationDelegate(prosumerCoordinationDelegate);
				if (result == null) result = caseAdditionalComponent(prosumerCoordinationDelegate);
				if (result == null) result = caseComponent(prosumerCoordinationDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.ADDITIONAL_COMPONENT: {
				AdditionalComponent additionalComponent = (AdditionalComponent)theEObject;
				T result = caseAdditionalComponent(additionalComponent);
				if (result == null) result = caseComponent(additionalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.WEB_SERVICE_COMPONENT: {
				WebServiceComponent webServiceComponent = (WebServiceComponent)theEObject;
				T result = caseWebServiceComponent(webServiceComponent);
				if (result == null) result = caseBusinessComponent(webServiceComponent);
				if (result == null) result = caseComponent(webServiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.REST_SERVICE_COMPONENT: {
				RestServiceComponent restServiceComponent = (RestServiceComponent)theEObject;
				T result = caseRestServiceComponent(restServiceComponent);
				if (result == null) result = caseBusinessComponent(restServiceComponent);
				if (result == null) result = caseComponent(restServiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.THING_COMPONENT: {
				ThingComponent thingComponent = (ThingComponent)theEObject;
				T result = caseThingComponent(thingComponent);
				if (result == null) result = caseBusinessComponent(thingComponent);
				if (result == null) result = caseComponent(thingComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.CONSUMER_COORDINATION_DELEGATE: {
				ConsumerCoordinationDelegate consumerCoordinationDelegate = (ConsumerCoordinationDelegate)theEObject;
				T result = caseConsumerCoordinationDelegate(consumerCoordinationDelegate);
				if (result == null) result = caseAdditionalComponent(consumerCoordinationDelegate);
				if (result == null) result = caseComponent(consumerCoordinationDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.CONSUMER_INTERFACE: {
				ConsumerInterface consumerInterface = (ConsumerInterface)theEObject;
				T result = caseConsumerInterface(consumerInterface);
				if (result == null) result = caseInterface(consumerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.PROVIDER_INTERFACE: {
				ProviderInterface providerInterface = (ProviderInterface)theEObject;
				T result = caseProviderInterface(providerInterface);
				if (result == null) result = caseInterface(providerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChorarchPackage.CLIENT_APP_COMPONENT: {
				ClientAppComponent clientAppComponent = (ClientAppComponent)theEObject;
				T result = caseClientAppComponent(clientAppComponent);
				if (result == null) result = caseBusinessComponent(clientAppComponent);
				if (result == null) result = caseComponent(clientAppComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chor Arch Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chor Arch Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChorArchModel(ChorArchModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessComponent(BusinessComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapter(Adapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityFilter(SecurityFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingComponent(BindingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prosumer Coordination Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prosumer Coordination Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProsumerCoordinationDelegate(ProsumerCoordinationDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalComponent(AdditionalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebServiceComponent(WebServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestServiceComponent(RestServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingComponent(ThingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer Coordination Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer Coordination Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumerCoordinationDelegate(ConsumerCoordinationDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumerInterface(ConsumerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderInterface(ProviderInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client App Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client App Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientAppComponent(ClientAppComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChorarchSwitch
