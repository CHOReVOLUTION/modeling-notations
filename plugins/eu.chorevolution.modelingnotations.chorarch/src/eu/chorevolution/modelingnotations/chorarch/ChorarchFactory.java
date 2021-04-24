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
package eu.chorevolution.modelingnotations.chorarch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage
 * @generated
 */
public interface ChorarchFactory extends EFactory {
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
	ChorarchFactory eINSTANCE = eu.chorevolution.modelingnotations.chorarch.impl.ChorarchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chor Arch Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chor Arch Model</em>'.
	 * @generated
	 */
	ChorArchModel createChorArchModel();

	/**
	 * Returns a new object of class '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter</em>'.
	 * @generated
	 */
	Adapter createAdapter();

	/**
	 * Returns a new object of class '<em>Security Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Filter</em>'.
	 * @generated
	 */
	SecurityFilter createSecurityFilter();

	/**
	 * Returns a new object of class '<em>Binding Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Component</em>'.
	 * @generated
	 */
	BindingComponent createBindingComponent();

	/**
	 * Returns a new object of class '<em>Prosumer Coordination Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prosumer Coordination Delegate</em>'.
	 * @generated
	 */
	ProsumerCoordinationDelegate createProsumerCoordinationDelegate();

	/**
	 * Returns a new object of class '<em>Web Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Service Component</em>'.
	 * @generated
	 */
	WebServiceComponent createWebServiceComponent();

	/**
	 * Returns a new object of class '<em>Rest Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest Service Component</em>'.
	 * @generated
	 */
	RestServiceComponent createRestServiceComponent();

	/**
	 * Returns a new object of class '<em>Thing Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing Component</em>'.
	 * @generated
	 */
	ThingComponent createThingComponent();

	/**
	 * Returns a new object of class '<em>Consumer Coordination Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumer Coordination Delegate</em>'.
	 * @generated
	 */
	ConsumerCoordinationDelegate createConsumerCoordinationDelegate();

	/**
	 * Returns a new object of class '<em>Consumer Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumer Interface</em>'.
	 * @generated
	 */
	ConsumerInterface createConsumerInterface();

	/**
	 * Returns a new object of class '<em>Provider Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider Interface</em>'.
	 * @generated
	 */
	ProviderInterface createProviderInterface();

	/**
	 * Returns a new object of class '<em>Client App Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client App Component</em>'.
	 * @generated
	 */
	ClientAppComponent createClientAppComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChorarchPackage getChorarchPackage();

} //ChorarchFactory
