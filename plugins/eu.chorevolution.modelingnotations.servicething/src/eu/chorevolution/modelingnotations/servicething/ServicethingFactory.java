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
package eu.chorevolution.modelingnotations.servicething;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage
 * @generated
 */
public interface ServicethingFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicethingFactory eINSTANCE = eu.chorevolution.modelingnotations.servicething.impl.ServicethingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Thing Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Thing Model</em>'.
	 * @generated
	 */
	ServiceThingModel createServiceThingModel();

	/**
	 * Returns a new object of class '<em>WSDL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL Model</em>'.
	 * @generated
	 */
	WSDLModel createWSDLModel();

	/**
	 * Returns a new object of class '<em>WADL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WADL Model</em>'.
	 * @generated
	 */
	WADLModel createWADLModel();

	/**
	 * Returns a new object of class '<em>COAP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COAP Model</em>'.
	 * @generated
	 */
	COAPModel createCOAPModel();

	/**
	 * Returns a new object of class '<em>IPLTS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPLTS Model</em>'.
	 * @generated
	 */
	IPLTSModel createIPLTSModel();

	/**
	 * Returns a new object of class '<em>WSBPEL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSBPEL Model</em>'.
	 * @generated
	 */
	WSBPELModel createWSBPELModel();

	/**
	 * Returns a new object of class '<em>WSSP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSSP Model</em>'.
	 * @generated
	 */
	WSSPModel createWSSPModel();

	/**
	 * Returns a new object of class '<em>WSLA Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSLA Model</em>'.
	 * @generated
	 */
	WSLAModel createWSLAModel();

	/**
	 * Returns a new object of class '<em>Identity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Model</em>'.
	 * @generated
	 */
	IdentityModel createIdentityModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicethingPackage getServicethingPackage();

} //ServicethingFactory
