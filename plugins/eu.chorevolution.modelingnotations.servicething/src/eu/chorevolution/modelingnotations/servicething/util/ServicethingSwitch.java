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
package eu.chorevolution.modelingnotations.servicething.util;

import eu.chorevolution.modelingnotations.servicething.*;

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
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage
 * @generated
 */
public class ServicethingSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicethingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicethingSwitch() {
		if (modelPackage == null) {
			modelPackage = ServicethingPackage.eINSTANCE;
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
			case ServicethingPackage.SERVICE_THING_MODEL: {
				ServiceThingModel serviceThingModel = (ServiceThingModel)theEObject;
				T result = caseServiceThingModel(serviceThingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.INTERFACE_DESCRIPTION: {
				InterfaceDescription interfaceDescription = (InterfaceDescription)theEObject;
				T result = caseInterfaceDescription(interfaceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.INTERACTION_PROTOCOL_DESCRIPTION: {
				InteractionProtocolDescription interactionProtocolDescription = (InteractionProtocolDescription)theEObject;
				T result = caseInteractionProtocolDescription(interactionProtocolDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.QO_SDESCRIPTION: {
				QoSDescription qoSDescription = (QoSDescription)theEObject;
				T result = caseQoSDescription(qoSDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.IDENTITY_DESCRIPTION: {
				IdentityDescription identityDescription = (IdentityDescription)theEObject;
				T result = caseIdentityDescription(identityDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.SECURITY_DESCRIPTION: {
				SecurityDescription securityDescription = (SecurityDescription)theEObject;
				T result = caseSecurityDescription(securityDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.WSDL_MODEL: {
				WSDLModel wsdlModel = (WSDLModel)theEObject;
				T result = caseWSDLModel(wsdlModel);
				if (result == null) result = caseInterfaceDescription(wsdlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.WADL_MODEL: {
				WADLModel wadlModel = (WADLModel)theEObject;
				T result = caseWADLModel(wadlModel);
				if (result == null) result = caseInterfaceDescription(wadlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.COAP_MODEL: {
				COAPModel coapModel = (COAPModel)theEObject;
				T result = caseCOAPModel(coapModel);
				if (result == null) result = caseInterfaceDescription(coapModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.IPLTS_MODEL: {
				IPLTSModel ipltsModel = (IPLTSModel)theEObject;
				T result = caseIPLTSModel(ipltsModel);
				if (result == null) result = caseInteractionProtocolDescription(ipltsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.WSBPEL_MODEL: {
				WSBPELModel wsbpelModel = (WSBPELModel)theEObject;
				T result = caseWSBPELModel(wsbpelModel);
				if (result == null) result = caseInteractionProtocolDescription(wsbpelModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.WSSP_MODEL: {
				WSSPModel wsspModel = (WSSPModel)theEObject;
				T result = caseWSSPModel(wsspModel);
				if (result == null) result = caseSecurityDescription(wsspModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.WSLA_MODEL: {
				WSLAModel wslaModel = (WSLAModel)theEObject;
				T result = caseWSLAModel(wslaModel);
				if (result == null) result = caseQoSDescription(wslaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicethingPackage.IDENTITY_MODEL: {
				IdentityModel identityModel = (IdentityModel)theEObject;
				T result = caseIdentityModel(identityModel);
				if (result == null) result = caseIdentityDescription(identityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Thing Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Thing Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceThingModel(ServiceThingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDescription(InterfaceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Protocol Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Protocol Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProtocolDescription(InteractionProtocolDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo SDescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo SDescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoSDescription(QoSDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityDescription(IdentityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDescription(SecurityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSDL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSDL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSDLModel(WSDLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WADL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WADL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWADLModel(WADLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COAP Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COAP Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOAPModel(COAPModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPLTS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPLTS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPLTSModel(IPLTSModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSBPEL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSBPEL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSBPELModel(WSBPELModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSSP Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSSP Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSSPModel(WSSPModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSLA Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSLA Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSLAModel(WSLAModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityModel(IdentityModel object) {
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

} //ServicethingSwitch
