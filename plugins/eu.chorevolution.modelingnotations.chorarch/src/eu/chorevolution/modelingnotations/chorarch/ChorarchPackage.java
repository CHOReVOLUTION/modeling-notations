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
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchFactory
 * @model kind="package"
 * @generated
 */
public interface ChorarchPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chorarch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.chorevolution/modelingnotations/chorarch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chorarch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChorarchPackage eINSTANCE = eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl <em>Chor Arch Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getChorArchModel()
	 * @generated
	 */
	int CHOR_ARCH_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOR_ARCH_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Choreography ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOR_ARCH_MODEL__CHOREOGRAPHY_ID = 1;

	/**
	 * The feature id for the '<em><b>Choreography Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME = 2;

	/**
	 * The number of structural features of the '<em>Chor Arch Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOR_ARCH_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Chor Arch Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOR_ARCH_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACES = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.BusinessComponentImpl <em>Business Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.BusinessComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getBusinessComponent()
	 * @generated
	 */
	int BUSINESS_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__URI = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.AdditionalComponentImpl <em>Additional Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.AdditionalComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getAdditionalComponent()
	 * @generated
	 */
	int ADDITIONAL_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT__INTERFACES = COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT__LOCATION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Additional Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.AdapterImpl <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.AdapterImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__NAME = ADDITIONAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__ROLES = ADDITIONAL_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__INTERFACES = ADDITIONAL_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER__LOCATION = ADDITIONAL_COMPONENT__LOCATION;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = ADDITIONAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_OPERATION_COUNT = ADDITIONAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.SecurityFilterImpl <em>Security Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.SecurityFilterImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getSecurityFilter()
	 * @generated
	 */
	int SECURITY_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER__NAME = ADDITIONAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER__ROLES = ADDITIONAL_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER__INTERFACES = ADDITIONAL_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER__LOCATION = ADDITIONAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER__GLOBAL = ADDITIONAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER_FEATURE_COUNT = ADDITIONAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FILTER_OPERATION_COUNT = ADDITIONAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.BindingComponentImpl <em>Binding Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.BindingComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getBindingComponent()
	 * @generated
	 */
	int BINDING_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT__NAME = ADDITIONAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT__ROLES = ADDITIONAL_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT__INTERFACES = ADDITIONAL_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT__LOCATION = ADDITIONAL_COMPONENT__LOCATION;

	/**
	 * The number of structural features of the '<em>Binding Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT_FEATURE_COUNT = ADDITIONAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_COMPONENT_OPERATION_COUNT = ADDITIONAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ProsumerCoordinationDelegateImpl <em>Prosumer Coordination Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ProsumerCoordinationDelegateImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getProsumerCoordinationDelegate()
	 * @generated
	 */
	int PROSUMER_COORDINATION_DELEGATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE__NAME = ADDITIONAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE__ROLES = ADDITIONAL_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE__INTERFACES = ADDITIONAL_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE__LOCATION = ADDITIONAL_COMPONENT__LOCATION;

	/**
	 * The number of structural features of the '<em>Prosumer Coordination Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE_FEATURE_COUNT = ADDITIONAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prosumer Coordination Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSUMER_COORDINATION_DELEGATE_OPERATION_COUNT = ADDITIONAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.WebServiceComponentImpl <em>Web Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.WebServiceComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getWebServiceComponent()
	 * @generated
	 */
	int WEB_SERVICE_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT__NAME = BUSINESS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT__ROLES = BUSINESS_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT__INTERFACES = BUSINESS_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT__URI = BUSINESS_COMPONENT__URI;

	/**
	 * The number of structural features of the '<em>Web Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT_FEATURE_COUNT = BUSINESS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_COMPONENT_OPERATION_COUNT = BUSINESS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.RestServiceComponentImpl <em>Rest Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.RestServiceComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getRestServiceComponent()
	 * @generated
	 */
	int REST_SERVICE_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT__NAME = BUSINESS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT__ROLES = BUSINESS_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT__INTERFACES = BUSINESS_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT__URI = BUSINESS_COMPONENT__URI;

	/**
	 * The number of structural features of the '<em>Rest Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT_FEATURE_COUNT = BUSINESS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rest Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_COMPONENT_OPERATION_COUNT = BUSINESS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ThingComponentImpl <em>Thing Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ThingComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getThingComponent()
	 * @generated
	 */
	int THING_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT__NAME = BUSINESS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT__ROLES = BUSINESS_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT__INTERFACES = BUSINESS_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT__URI = BUSINESS_COMPONENT__URI;

	/**
	 * The number of structural features of the '<em>Thing Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT_FEATURE_COUNT = BUSINESS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thing Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_COMPONENT_OPERATION_COUNT = BUSINESS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.InterfaceImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PORT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SERVICE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ConsumerCoordinationDelegateImpl <em>Consumer Coordination Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ConsumerCoordinationDelegateImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getConsumerCoordinationDelegate()
	 * @generated
	 */
	int CONSUMER_COORDINATION_DELEGATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE__NAME = ADDITIONAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE__ROLES = ADDITIONAL_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE__INTERFACES = ADDITIONAL_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE__LOCATION = ADDITIONAL_COMPONENT__LOCATION;

	/**
	 * The number of structural features of the '<em>Consumer Coordination Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE_FEATURE_COUNT = ADDITIONAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consumer Coordination Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_COORDINATION_DELEGATE_OPERATION_COUNT = ADDITIONAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ConsumerInterfaceImpl <em>Consumer Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ConsumerInterfaceImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getConsumerInterface()
	 * @generated
	 */
	int CONSUMER_INTERFACE = 13;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_INTERFACE__PORT_NUMBER = INTERFACE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_INTERFACE__SERVICE_DESCRIPTION = INTERFACE__SERVICE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Service Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_INTERFACE__SERVICE_REQUIRED = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consumer Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Consumer Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ProviderInterfaceImpl <em>Provider Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ProviderInterfaceImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getProviderInterface()
	 * @generated
	 */
	int PROVIDER_INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_INTERFACE__PORT_NUMBER = INTERFACE__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Service Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_INTERFACE__SERVICE_DESCRIPTION = INTERFACE__SERVICE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Service Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_INTERFACE__SERVICE_PROVIDED = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provider Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ClientAppComponentImpl <em>Client App Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ClientAppComponentImpl
	 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getClientAppComponent()
	 * @generated
	 */
	int CLIENT_APP_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT__NAME = BUSINESS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT__ROLES = BUSINESS_COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT__INTERFACES = BUSINESS_COMPONENT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT__URI = BUSINESS_COMPONENT__URI;

	/**
	 * The number of structural features of the '<em>Client App Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT_FEATURE_COUNT = BUSINESS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client App Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_APP_COMPONENT_OPERATION_COUNT = BUSINESS_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel <em>Chor Arch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chor Arch Model</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorArchModel
	 * @generated
	 */
	EClass getChorArchModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getComponents()
	 * @see #getChorArchModel()
	 * @generated
	 */
	EReference getChorArchModel_Components();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyID <em>Choreography ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choreography ID</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyID()
	 * @see #getChorArchModel()
	 * @generated
	 */
	EAttribute getChorArchModel_ChoreographyID();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyName <em>Choreography Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choreography Name</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyName()
	 * @see #getChorArchModel()
	 * @generated
	 */
	EAttribute getChorArchModel_ChoreographyName();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.BusinessComponent <em>Business Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.BusinessComponent
	 * @generated
	 */
	EClass getBusinessComponent();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.BusinessComponent#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.BusinessComponent#getUri()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EAttribute getBusinessComponent_Uri();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Adapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.SecurityFilter <em>Security Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Filter</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.SecurityFilter
	 * @generated
	 */
	EClass getSecurityFilter();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.SecurityFilter#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.SecurityFilter#isGlobal()
	 * @see #getSecurityFilter()
	 * @generated
	 */
	EAttribute getSecurityFilter_Global();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.BindingComponent <em>Binding Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.BindingComponent
	 * @generated
	 */
	EClass getBindingComponent();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ProsumerCoordinationDelegate <em>Prosumer Coordination Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prosumer Coordination Delegate</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ProsumerCoordinationDelegate
	 * @generated
	 */
	EClass getProsumerCoordinationDelegate();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute list '{@link eu.chorevolution.modelingnotations.chorarch.Component#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Component#getRoles()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.chorarch.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Component#getInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfaces();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.AdditionalComponent <em>Additional Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.AdditionalComponent
	 * @generated
	 */
	EClass getAdditionalComponent();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.AdditionalComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.AdditionalComponent#getLocation()
	 * @see #getAdditionalComponent()
	 * @generated
	 */
	EAttribute getAdditionalComponent_Location();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.WebServiceComponent <em>Web Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.WebServiceComponent
	 * @generated
	 */
	EClass getWebServiceComponent();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.RestServiceComponent <em>Rest Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.RestServiceComponent
	 * @generated
	 */
	EClass getRestServiceComponent();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ThingComponent <em>Thing Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ThingComponent
	 * @generated
	 */
	EClass getThingComponent();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.Interface#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Interface#getPortNumber()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_PortNumber();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.chorarch.Interface#getServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Description</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.Interface#getServiceDescription()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_ServiceDescription();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerCoordinationDelegate <em>Consumer Coordination Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer Coordination Delegate</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerCoordinationDelegate
	 * @generated
	 */
	EClass getConsumerCoordinationDelegate();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerInterface <em>Consumer Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer Interface</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerInterface
	 * @generated
	 */
	EClass getConsumerInterface();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerInterface#getServiceRequired <em>Service Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Required</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerInterface#getServiceRequired()
	 * @see #getConsumerInterface()
	 * @generated
	 */
	EReference getConsumerInterface_ServiceRequired();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ProviderInterface <em>Provider Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Interface</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ProviderInterface
	 * @generated
	 */
	EClass getProviderInterface();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.chorarch.ProviderInterface#getServiceProvided <em>Service Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Provided</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ProviderInterface#getServiceProvided()
	 * @see #getProviderInterface()
	 * @generated
	 */
	EReference getProviderInterface_ServiceProvided();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.chorarch.ClientAppComponent <em>Client App Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client App Component</em>'.
	 * @see eu.chorevolution.modelingnotations.chorarch.ClientAppComponent
	 * @generated
	 */
	EClass getClientAppComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChorarchFactory getChorarchFactory();

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
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl <em>Chor Arch Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getChorArchModel()
		 * @generated
		 */
		EClass CHOR_ARCH_MODEL = eINSTANCE.getChorArchModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOR_ARCH_MODEL__COMPONENTS = eINSTANCE.getChorArchModel_Components();

		/**
		 * The meta object literal for the '<em><b>Choreography ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOR_ARCH_MODEL__CHOREOGRAPHY_ID = eINSTANCE.getChorArchModel_ChoreographyID();

		/**
		 * The meta object literal for the '<em><b>Choreography Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME = eINSTANCE.getChorArchModel_ChoreographyName();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.BusinessComponentImpl <em>Business Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.BusinessComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getBusinessComponent()
		 * @generated
		 */
		EClass BUSINESS_COMPONENT = eINSTANCE.getBusinessComponent();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_COMPONENT__URI = eINSTANCE.getBusinessComponent_Uri();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.AdapterImpl <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.AdapterImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.SecurityFilterImpl <em>Security Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.SecurityFilterImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getSecurityFilter()
		 * @generated
		 */
		EClass SECURITY_FILTER = eINSTANCE.getSecurityFilter();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_FILTER__GLOBAL = eINSTANCE.getSecurityFilter_Global();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.BindingComponentImpl <em>Binding Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.BindingComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getBindingComponent()
		 * @generated
		 */
		EClass BINDING_COMPONENT = eINSTANCE.getBindingComponent();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ProsumerCoordinationDelegateImpl <em>Prosumer Coordination Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ProsumerCoordinationDelegateImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getProsumerCoordinationDelegate()
		 * @generated
		 */
		EClass PROSUMER_COORDINATION_DELEGATE = eINSTANCE.getProsumerCoordinationDelegate();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ROLES = eINSTANCE.getComponent_Roles();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.AdditionalComponentImpl <em>Additional Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.AdditionalComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getAdditionalComponent()
		 * @generated
		 */
		EClass ADDITIONAL_COMPONENT = eINSTANCE.getAdditionalComponent();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_COMPONENT__LOCATION = eINSTANCE.getAdditionalComponent_Location();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.WebServiceComponentImpl <em>Web Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.WebServiceComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getWebServiceComponent()
		 * @generated
		 */
		EClass WEB_SERVICE_COMPONENT = eINSTANCE.getWebServiceComponent();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.RestServiceComponentImpl <em>Rest Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.RestServiceComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getRestServiceComponent()
		 * @generated
		 */
		EClass REST_SERVICE_COMPONENT = eINSTANCE.getRestServiceComponent();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ThingComponentImpl <em>Thing Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ThingComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getThingComponent()
		 * @generated
		 */
		EClass THING_COMPONENT = eINSTANCE.getThingComponent();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.InterfaceImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__PORT_NUMBER = eINSTANCE.getInterface_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Service Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__SERVICE_DESCRIPTION = eINSTANCE.getInterface_ServiceDescription();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ConsumerCoordinationDelegateImpl <em>Consumer Coordination Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ConsumerCoordinationDelegateImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getConsumerCoordinationDelegate()
		 * @generated
		 */
		EClass CONSUMER_COORDINATION_DELEGATE = eINSTANCE.getConsumerCoordinationDelegate();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ConsumerInterfaceImpl <em>Consumer Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ConsumerInterfaceImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getConsumerInterface()
		 * @generated
		 */
		EClass CONSUMER_INTERFACE = eINSTANCE.getConsumerInterface();

		/**
		 * The meta object literal for the '<em><b>Service Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER_INTERFACE__SERVICE_REQUIRED = eINSTANCE.getConsumerInterface_ServiceRequired();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ProviderInterfaceImpl <em>Provider Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ProviderInterfaceImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getProviderInterface()
		 * @generated
		 */
		EClass PROVIDER_INTERFACE = eINSTANCE.getProviderInterface();

		/**
		 * The meta object literal for the '<em><b>Service Provided</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER_INTERFACE__SERVICE_PROVIDED = eINSTANCE.getProviderInterface_ServiceProvided();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.chorarch.impl.ClientAppComponentImpl <em>Client App Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ClientAppComponentImpl
		 * @see eu.chorevolution.modelingnotations.chorarch.impl.ChorarchPackageImpl#getClientAppComponent()
		 * @generated
		 */
		EClass CLIENT_APP_COMPONENT = eINSTANCE.getClientAppComponent();

	}

} //ChorarchPackage
