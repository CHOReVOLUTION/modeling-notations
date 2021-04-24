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
package eu.chorevolution.modelingnotations.adapter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.chorevolution.modelingnotations.adapter.AdapterFactory
 * @model kind="package"
 * @generated
 */
public interface AdapterPackage extends EPackage {
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
	String eNAME = "adapter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.chorevolution/modelingnotations/adapter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adapter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterPackage eINSTANCE = eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getAdapterModel()
	 * @generated
	 */
	int ADAPTER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Choreography Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Has Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL__HAS_OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Has Operations Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl <em>Message Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessageRelation()
	 * @generated
	 */
	int MESSAGE_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Choreography Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RELATION__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Has Data Items Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS = 2;

	/**
	 * The number of structural features of the '<em>Message Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl <em>Data Item Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDataItemRelation()
	 * @generated
	 */
	int DATA_ITEM_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Choreography Data Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Data Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION__DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Has Enumeration Items Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Transformation Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION__TRANSFORMATION_RULE = 3;

	/**
	 * The number of structural features of the '<em>Data Item Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Item Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl <em>Choreography Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyMessage()
	 * @generated
	 */
	int CHOREOGRAPHY_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Choreography Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_MESSAGE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Choreography Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Choreography Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.MessageImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Message Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HAS_MESSAGE_DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyDataItemImpl <em>Choreography Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyDataItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyDataItem()
	 * @generated
	 */
	int CHOREOGRAPHY_DATA_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DATA_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DATA_ITEM__MIN_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DATA_ITEM__MAX_OCCURS = 2;

	/**
	 * The number of structural features of the '<em>Choreography Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Choreography Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_DATA_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl <em>Choreography Complex Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyComplexItem()
	 * @generated
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM__NAME = CHOREOGRAPHY_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM__MIN_OCCURS = CHOREOGRAPHY_DATA_ITEM__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM__MAX_OCCURS = CHOREOGRAPHY_DATA_ITEM__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Has Choreography Data Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography Complex Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM_FEATURE_COUNT = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choreography Complex Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_COMPLEX_ITEM_OPERATION_COUNT = CHOREOGRAPHY_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl <em>Choreography Simple Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographySimpleItem()
	 * @generated
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM__NAME = CHOREOGRAPHY_DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM__MIN_OCCURS = CHOREOGRAPHY_DATA_ITEM__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM__MAX_OCCURS = CHOREOGRAPHY_DATA_ITEM__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM__TYPE = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Choreography Enumeration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography Simple Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM_FEATURE_COUNT = CHOREOGRAPHY_DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choreography Simple Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_SIMPLE_ITEM_OPERATION_COUNT = CHOREOGRAPHY_DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemImpl <em>Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.DataItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__MIN_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__MAX_OCCURS = 2;

	/**
	 * The number of structural features of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ComplexItemImpl <em>Complex Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ComplexItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getComplexItem()
	 * @generated
	 */
	int COMPLEX_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM__MIN_OCCURS = DATA_ITEM__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM__MAX_OCCURS = DATA_ITEM__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Has Data Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM__HAS_DATA_ITEMS = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM__TYPE_NAME = DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_OPERATION_COUNT = DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl <em>Simple Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getSimpleItem()
	 * @generated
	 */
	int SIMPLE_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM__NAME = DATA_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM__MIN_OCCURS = DATA_ITEM__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM__MAX_OCCURS = DATA_ITEM__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM__TYPE = DATA_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Enumeration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM__HAS_ENUMERATION_ITEMS = DATA_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM_FEATURE_COUNT = DATA_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ITEM_OPERATION_COUNT = DATA_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyEnumerationItemImpl <em>Choreography Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyEnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyEnumerationItem()
	 * @generated
	 */
	int CHOREOGRAPHY_ENUMERATION_ITEM = 11;

	/**
	 * The number of structural features of the '<em>Choreography Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Choreography Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ENUMERATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getEnumerationItem()
	 * @generated
	 */
	int ENUMERATION_ITEM = 12;

	/**
	 * The number of structural features of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.StringEnumerationItemImpl <em>String Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.StringEnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getStringEnumerationItem()
	 * @generated
	 */
	int STRING_ENUMERATION_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENUMERATION_ITEM__VALUE = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENUMERATION_ITEM_FEATURE_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENUMERATION_ITEM_OPERATION_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.IntegerEnumerationItemImpl <em>Integer Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.IntegerEnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getIntegerEnumerationItem()
	 * @generated
	 */
	int INTEGER_ENUMERATION_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ENUMERATION_ITEM__VALUE = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ENUMERATION_ITEM_FEATURE_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ENUMERATION_ITEM_OPERATION_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl <em>Enumeration Item Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getEnumerationItemRelation()
	 * @generated
	 */
	int ENUMERATION_ITEM_RELATION = 15;

	/**
	 * The feature id for the '<em><b>Choreography Enumeration Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Enumeration Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Item Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Item Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ITEM_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyTaskImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyTask()
	 * @generated
	 */
	int CHOREOGRAPHY_TASK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Choreography Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__HAS_CHOREOGRAPHY_MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.OperationImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HAS_MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl <em>Operation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOperationRelation()
	 * @generated
	 */
	int OPERATION_RELATION = 18;

	/**
	 * The feature id for the '<em><b>Choreography Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RELATION__CHOREOGRAPHY_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RELATION__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Has Messages Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RELATION__HAS_MESSAGES_RELATIONS = 2;

	/**
	 * The number of structural features of the '<em>Operation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DoubleEnumerationItemImpl <em>Double Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.DoubleEnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDoubleEnumerationItem()
	 * @generated
	 */
	int DOUBLE_ENUMERATION_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ENUMERATION_ITEM__VALUE = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ENUMERATION_ITEM_FEATURE_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ENUMERATION_ITEM_OPERATION_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DateEnumerationItemImpl <em>Date Enumeration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.impl.DateEnumerationItemImpl
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDateEnumerationItem()
	 * @generated
	 */
	int DATE_ENUMERATION_ITEM = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ENUMERATION_ITEM__VALUE = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ENUMERATION_ITEM_FEATURE_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Enumeration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ENUMERATION_ITEM_OPERATION_COUNT = CHOREOGRAPHY_ENUMERATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.SimpleTypes <em>Simple Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleTypes
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getSimpleTypes()
	 * @generated
	 */
	int SIMPLE_TYPES = 21;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.OccurencesType <em>Occurences Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOccurencesType()
	 * @generated
	 */
	int OCCURENCES_TYPE = 22;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.AdapterType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterType
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getAdapterType()
	 * @generated
	 */
	int ADAPTER_TYPE = 23;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType <em>Choreography Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyMessageType()
	 * @generated
	 */
	int CHOREOGRAPHY_MESSAGE_TYPE = 24;

	/**
	 * The meta object id for the '{@link eu.chorevolution.modelingnotations.adapter.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.chorevolution.modelingnotations.adapter.MessageType
	 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel
	 * @generated
	 */
	EClass getAdapterModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasChoreographyTasks <em>Has Choreography Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Choreography Tasks</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasChoreographyTasks()
	 * @see #getAdapterModel()
	 * @generated
	 */
	EReference getAdapterModel_HasChoreographyTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperations <em>Has Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Operations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperations()
	 * @see #getAdapterModel()
	 * @generated
	 */
	EReference getAdapterModel_HasOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperationsRelations <em>Has Operations Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Operations Relations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperationsRelations()
	 * @see #getAdapterModel()
	 * @generated
	 */
	EReference getAdapterModel_HasOperationsRelations();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel#getType()
	 * @see #getAdapterModel()
	 * @generated
	 */
	EAttribute getAdapterModel_Type();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation <em>Message Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Relation</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageRelation
	 * @generated
	 */
	EClass getMessageRelation();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getChoreographyMessage <em>Choreography Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choreography Message</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageRelation#getChoreographyMessage()
	 * @see #getMessageRelation()
	 * @generated
	 */
	EReference getMessageRelation_ChoreographyMessage();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageRelation#getMessage()
	 * @see #getMessageRelation()
	 * @generated
	 */
	EReference getMessageRelation_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getHasDataItemsRelations <em>Has Data Items Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Data Items Relations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageRelation#getHasDataItemsRelations()
	 * @see #getMessageRelation()
	 * @generated
	 */
	EReference getMessageRelation_HasDataItemsRelations();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation <em>Data Item Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item Relation</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation
	 * @generated
	 */
	EClass getDataItemRelation();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getChoreographyDataItem <em>Choreography Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choreography Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation#getChoreographyDataItem()
	 * @see #getDataItemRelation()
	 * @generated
	 */
	EReference getDataItemRelation_ChoreographyDataItem();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getDataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation#getDataItem()
	 * @see #getDataItemRelation()
	 * @generated
	 */
	EReference getDataItemRelation_DataItem();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getHasEnumerationItemsRelations <em>Has Enumeration Items Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Enumeration Items Relations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation#getHasEnumerationItemsRelations()
	 * @see #getDataItemRelation()
	 * @generated
	 */
	EReference getDataItemRelation_HasEnumerationItemsRelations();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getTransformationRule <em>Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Rule</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation#getTransformationRule()
	 * @see #getDataItemRelation()
	 * @generated
	 */
	EAttribute getDataItemRelation_TransformationRule();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage <em>Choreography Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Message</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessage
	 * @generated
	 */
	EClass getChoreographyMessage();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getName()
	 * @see #getChoreographyMessage()
	 * @generated
	 */
	EAttribute getChoreographyMessage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getHasChoreographyDataItem <em>Has Choreography Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Choreography Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getHasChoreographyDataItem()
	 * @see #getChoreographyMessage()
	 * @generated
	 */
	EReference getChoreographyMessage_HasChoreographyDataItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getType()
	 * @see #getChoreographyMessage()
	 * @generated
	 */
	EAttribute getChoreographyMessage_Type();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eu.chorevolution.modelingnotations.adapter.Message#getHasMessageDataItem <em>Has Message Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Message Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Message#getHasMessageDataItem()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_HasMessageDataItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem <em>Choreography Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem
	 * @generated
	 */
	EClass getChoreographyDataItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getName()
	 * @see #getChoreographyDataItem()
	 * @generated
	 */
	EAttribute getChoreographyDataItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMinOccurs()
	 * @see #getChoreographyDataItem()
	 * @generated
	 */
	EAttribute getChoreographyDataItem_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMaxOccurs()
	 * @see #getChoreographyDataItem()
	 * @generated
	 */
	EAttribute getChoreographyDataItem_MaxOccurs();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem <em>Choreography Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Complex Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem
	 * @generated
	 */
	EClass getChoreographyComplexItem();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getHasChoreographyDataItems <em>Has Choreography Data Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Choreography Data Items</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getHasChoreographyDataItems()
	 * @see #getChoreographyComplexItem()
	 * @generated
	 */
	EReference getChoreographyComplexItem_HasChoreographyDataItems();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem#getTypeName()
	 * @see #getChoreographyComplexItem()
	 * @generated
	 */
	EAttribute getChoreographyComplexItem_TypeName();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem <em>Choreography Simple Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Simple Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem
	 * @generated
	 */
	EClass getChoreographySimpleItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem#getType()
	 * @see #getChoreographySimpleItem()
	 * @generated
	 */
	EAttribute getChoreographySimpleItem_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem#getHasChoreographyEnumerationItems <em>Has Choreography Enumeration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Choreography Enumeration Items</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem#getHasChoreographyEnumerationItems()
	 * @see #getChoreographySimpleItem()
	 * @generated
	 */
	EReference getChoreographySimpleItem_HasChoreographyEnumerationItems();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DataItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItem#getName()
	 * @see #getDataItem()
	 * @generated
	 */
	EAttribute getDataItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DataItem#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItem#getMinOccurs()
	 * @see #getDataItem()
	 * @generated
	 */
	EAttribute getDataItem_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DataItem#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItem#getMaxOccurs()
	 * @see #getDataItem()
	 * @generated
	 */
	EAttribute getDataItem_MaxOccurs();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ComplexItem <em>Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ComplexItem
	 * @generated
	 */
	EClass getComplexItem();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.ComplexItem#getHasDataItems <em>Has Data Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Data Items</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ComplexItem#getHasDataItems()
	 * @see #getComplexItem()
	 * @generated
	 */
	EReference getComplexItem_HasDataItems();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ComplexItem#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ComplexItem#getTypeName()
	 * @see #getComplexItem()
	 * @generated
	 */
	EAttribute getComplexItem_TypeName();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.SimpleItem <em>Simple Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleItem
	 * @generated
	 */
	EClass getSimpleItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.SimpleItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleItem#getType()
	 * @see #getSimpleItem()
	 * @generated
	 */
	EAttribute getSimpleItem_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.SimpleItem#getHasEnumerationItems <em>Has Enumeration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Enumeration Items</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleItem#getHasEnumerationItems()
	 * @see #getSimpleItem()
	 * @generated
	 */
	EReference getSimpleItem_HasEnumerationItems();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem
	 * @generated
	 */
	EClass getChoreographyEnumerationItem();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItem
	 * @generated
	 */
	EClass getEnumerationItem();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.StringEnumerationItem <em>String Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.StringEnumerationItem
	 * @generated
	 */
	EClass getStringEnumerationItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.StringEnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.StringEnumerationItem#getValue()
	 * @see #getStringEnumerationItem()
	 * @generated
	 */
	EAttribute getStringEnumerationItem_Value();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem <em>Integer Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem
	 * @generated
	 */
	EClass getIntegerEnumerationItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem#getValue()
	 * @see #getIntegerEnumerationItem()
	 * @generated
	 */
	EAttribute getIntegerEnumerationItem_Value();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation <em>Enumeration Item Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Item Relation</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation
	 * @generated
	 */
	EClass getEnumerationItemRelation();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choreography Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getChoreographyEnumerationItem()
	 * @see #getEnumerationItemRelation()
	 * @generated
	 */
	EReference getEnumerationItemRelation_ChoreographyEnumerationItem();

	/**
	 * Returns the meta object for the reference '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getEnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getEnumerationItem()
	 * @see #getEnumerationItemRelation()
	 * @generated
	 */
	EReference getEnumerationItemRelation_EnumerationItem();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Task</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyTask
	 * @generated
	 */
	EClass getChoreographyTask();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyTask#getName()
	 * @see #getChoreographyTask()
	 * @generated
	 */
	EAttribute getChoreographyTask_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask#getHasChoreographyMessages <em>Has Choreography Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Choreography Messages</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyTask#getHasChoreographyMessages()
	 * @see #getChoreographyTask()
	 * @generated
	 */
	EReference getChoreographyTask_HasChoreographyMessages();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.Operation#getHasMessages <em>Has Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Messages</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.Operation#getHasMessages()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_HasMessages();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.OperationRelation <em>Operation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Relation</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.OperationRelation
	 * @generated
	 */
	EClass getOperationRelation();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getChoreographyTasks <em>Choreography Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choreography Tasks</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.OperationRelation#getChoreographyTasks()
	 * @see #getOperationRelation()
	 * @generated
	 */
	EReference getOperationRelation_ChoreographyTasks();

	/**
	 * Returns the meta object for the reference list '{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.OperationRelation#getOperations()
	 * @see #getOperationRelation()
	 * @generated
	 */
	EReference getOperationRelation_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getHasMessagesRelations <em>Has Messages Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Messages Relations</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.OperationRelation#getHasMessagesRelations()
	 * @see #getOperationRelation()
	 * @generated
	 */
	EReference getOperationRelation_HasMessagesRelations();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem <em>Double Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem
	 * @generated
	 */
	EClass getDoubleEnumerationItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem#getValue()
	 * @see #getDoubleEnumerationItem()
	 * @generated
	 */
	EAttribute getDoubleEnumerationItem_Value();

	/**
	 * Returns the meta object for class '{@link eu.chorevolution.modelingnotations.adapter.DateEnumerationItem <em>Date Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Enumeration Item</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DateEnumerationItem
	 * @generated
	 */
	EClass getDateEnumerationItem();

	/**
	 * Returns the meta object for the attribute '{@link eu.chorevolution.modelingnotations.adapter.DateEnumerationItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.DateEnumerationItem#getValue()
	 * @see #getDateEnumerationItem()
	 * @generated
	 */
	EAttribute getDateEnumerationItem_Value();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.adapter.SimpleTypes <em>Simple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Types</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleTypes
	 * @generated
	 */
	EEnum getSimpleTypes();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.adapter.OccurencesType <em>Occurences Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occurences Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @generated
	 */
	EEnum getOccurencesType();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.adapter.AdapterType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterType
	 * @generated
	 */
	EEnum getAdapterType();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType <em>Choreography Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choreography Message Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType
	 * @generated
	 */
	EEnum getChoreographyMessageType();

	/**
	 * Returns the meta object for enum '{@link eu.chorevolution.modelingnotations.adapter.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdapterFactory getAdapterFactory();

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
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getAdapterModel()
		 * @generated
		 */
		EClass ADAPTER_MODEL = eINSTANCE.getAdapterModel();

		/**
		 * The meta object literal for the '<em><b>Has Choreography Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS = eINSTANCE.getAdapterModel_HasChoreographyTasks();

		/**
		 * The meta object literal for the '<em><b>Has Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_MODEL__HAS_OPERATIONS = eINSTANCE.getAdapterModel_HasOperations();

		/**
		 * The meta object literal for the '<em><b>Has Operations Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS = eINSTANCE.getAdapterModel_HasOperationsRelations();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER_MODEL__TYPE = eINSTANCE.getAdapterModel_Type();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl <em>Message Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessageRelation()
		 * @generated
		 */
		EClass MESSAGE_RELATION = eINSTANCE.getMessageRelation();

		/**
		 * The meta object literal for the '<em><b>Choreography Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE = eINSTANCE.getMessageRelation_ChoreographyMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_RELATION__MESSAGE = eINSTANCE.getMessageRelation_Message();

		/**
		 * The meta object literal for the '<em><b>Has Data Items Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS = eINSTANCE.getMessageRelation_HasDataItemsRelations();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl <em>Data Item Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDataItemRelation()
		 * @generated
		 */
		EClass DATA_ITEM_RELATION = eINSTANCE.getDataItemRelation();

		/**
		 * The meta object literal for the '<em><b>Choreography Data Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM = eINSTANCE.getDataItemRelation_ChoreographyDataItem();

		/**
		 * The meta object literal for the '<em><b>Data Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM_RELATION__DATA_ITEM = eINSTANCE.getDataItemRelation_DataItem();

		/**
		 * The meta object literal for the '<em><b>Has Enumeration Items Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS = eINSTANCE.getDataItemRelation_HasEnumerationItemsRelations();

		/**
		 * The meta object literal for the '<em><b>Transformation Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM_RELATION__TRANSFORMATION_RULE = eINSTANCE.getDataItemRelation_TransformationRule();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl <em>Choreography Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyMessage()
		 * @generated
		 */
		EClass CHOREOGRAPHY_MESSAGE = eINSTANCE.getChoreographyMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_MESSAGE__NAME = eINSTANCE.getChoreographyMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Has Choreography Data Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM = eINSTANCE.getChoreographyMessage_HasChoreographyDataItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_MESSAGE__TYPE = eINSTANCE.getChoreographyMessage_Type();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.MessageImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Has Message Data Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__HAS_MESSAGE_DATA_ITEM = eINSTANCE.getMessage_HasMessageDataItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyDataItemImpl <em>Choreography Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyDataItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyDataItem()
		 * @generated
		 */
		EClass CHOREOGRAPHY_DATA_ITEM = eINSTANCE.getChoreographyDataItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_DATA_ITEM__NAME = eINSTANCE.getChoreographyDataItem_Name();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_DATA_ITEM__MIN_OCCURS = eINSTANCE.getChoreographyDataItem_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_DATA_ITEM__MAX_OCCURS = eINSTANCE.getChoreographyDataItem_MaxOccurs();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl <em>Choreography Complex Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyComplexItem()
		 * @generated
		 */
		EClass CHOREOGRAPHY_COMPLEX_ITEM = eINSTANCE.getChoreographyComplexItem();

		/**
		 * The meta object literal for the '<em><b>Has Choreography Data Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS = eINSTANCE.getChoreographyComplexItem_HasChoreographyDataItems();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME = eINSTANCE.getChoreographyComplexItem_TypeName();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl <em>Choreography Simple Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographySimpleItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographySimpleItem()
		 * @generated
		 */
		EClass CHOREOGRAPHY_SIMPLE_ITEM = eINSTANCE.getChoreographySimpleItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_SIMPLE_ITEM__TYPE = eINSTANCE.getChoreographySimpleItem_Type();

		/**
		 * The meta object literal for the '<em><b>Has Choreography Enumeration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS = eINSTANCE.getChoreographySimpleItem_HasChoreographyEnumerationItems();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemImpl <em>Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.DataItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM__NAME = eINSTANCE.getDataItem_Name();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM__MIN_OCCURS = eINSTANCE.getDataItem_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEM__MAX_OCCURS = eINSTANCE.getDataItem_MaxOccurs();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ComplexItemImpl <em>Complex Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ComplexItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getComplexItem()
		 * @generated
		 */
		EClass COMPLEX_ITEM = eINSTANCE.getComplexItem();

		/**
		 * The meta object literal for the '<em><b>Has Data Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM__HAS_DATA_ITEMS = eINSTANCE.getComplexItem_HasDataItems();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_ITEM__TYPE_NAME = eINSTANCE.getComplexItem_TypeName();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl <em>Simple Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getSimpleItem()
		 * @generated
		 */
		EClass SIMPLE_ITEM = eINSTANCE.getSimpleItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ITEM__TYPE = eINSTANCE.getSimpleItem_Type();

		/**
		 * The meta object literal for the '<em><b>Has Enumeration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ITEM__HAS_ENUMERATION_ITEMS = eINSTANCE.getSimpleItem_HasEnumerationItems();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyEnumerationItemImpl <em>Choreography Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyEnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyEnumerationItem()
		 * @generated
		 */
		EClass CHOREOGRAPHY_ENUMERATION_ITEM = eINSTANCE.getChoreographyEnumerationItem();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemImpl <em>Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getEnumerationItem()
		 * @generated
		 */
		EClass ENUMERATION_ITEM = eINSTANCE.getEnumerationItem();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.StringEnumerationItemImpl <em>String Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.StringEnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getStringEnumerationItem()
		 * @generated
		 */
		EClass STRING_ENUMERATION_ITEM = eINSTANCE.getStringEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ENUMERATION_ITEM__VALUE = eINSTANCE.getStringEnumerationItem_Value();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.IntegerEnumerationItemImpl <em>Integer Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.IntegerEnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getIntegerEnumerationItem()
		 * @generated
		 */
		EClass INTEGER_ENUMERATION_ITEM = eINSTANCE.getIntegerEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ENUMERATION_ITEM__VALUE = eINSTANCE.getIntegerEnumerationItem_Value();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl <em>Enumeration Item Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getEnumerationItemRelation()
		 * @generated
		 */
		EClass ENUMERATION_ITEM_RELATION = eINSTANCE.getEnumerationItemRelation();

		/**
		 * The meta object literal for the '<em><b>Choreography Enumeration Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM = eINSTANCE.getEnumerationItemRelation_ChoreographyEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Enumeration Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM = eINSTANCE.getEnumerationItemRelation_EnumerationItem();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.ChoreographyTaskImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyTask()
		 * @generated
		 */
		EClass CHOREOGRAPHY_TASK = eINSTANCE.getChoreographyTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_TASK__NAME = eINSTANCE.getChoreographyTask_Name();

		/**
		 * The meta object literal for the '<em><b>Has Choreography Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_TASK__HAS_CHOREOGRAPHY_MESSAGES = eINSTANCE.getChoreographyTask_HasChoreographyMessages();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.OperationImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Has Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__HAS_MESSAGES = eINSTANCE.getOperation_HasMessages();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl <em>Operation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOperationRelation()
		 * @generated
		 */
		EClass OPERATION_RELATION = eINSTANCE.getOperationRelation();

		/**
		 * The meta object literal for the '<em><b>Choreography Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RELATION__CHOREOGRAPHY_TASKS = eINSTANCE.getOperationRelation_ChoreographyTasks();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RELATION__OPERATIONS = eINSTANCE.getOperationRelation_Operations();

		/**
		 * The meta object literal for the '<em><b>Has Messages Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RELATION__HAS_MESSAGES_RELATIONS = eINSTANCE.getOperationRelation_HasMessagesRelations();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DoubleEnumerationItemImpl <em>Double Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.DoubleEnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDoubleEnumerationItem()
		 * @generated
		 */
		EClass DOUBLE_ENUMERATION_ITEM = eINSTANCE.getDoubleEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ENUMERATION_ITEM__VALUE = eINSTANCE.getDoubleEnumerationItem_Value();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.impl.DateEnumerationItemImpl <em>Date Enumeration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.impl.DateEnumerationItemImpl
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getDateEnumerationItem()
		 * @generated
		 */
		EClass DATE_ENUMERATION_ITEM = eINSTANCE.getDateEnumerationItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_ENUMERATION_ITEM__VALUE = eINSTANCE.getDateEnumerationItem_Value();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.SimpleTypes <em>Simple Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.SimpleTypes
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getSimpleTypes()
		 * @generated
		 */
		EEnum SIMPLE_TYPES = eINSTANCE.getSimpleTypes();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.OccurencesType <em>Occurences Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getOccurencesType()
		 * @generated
		 */
		EEnum OCCURENCES_TYPE = eINSTANCE.getOccurencesType();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.AdapterType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.AdapterType
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getAdapterType()
		 * @generated
		 */
		EEnum ADAPTER_TYPE = eINSTANCE.getAdapterType();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType <em>Choreography Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getChoreographyMessageType()
		 * @generated
		 */
		EEnum CHOREOGRAPHY_MESSAGE_TYPE = eINSTANCE.getChoreographyMessageType();

		/**
		 * The meta object literal for the '{@link eu.chorevolution.modelingnotations.adapter.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.chorevolution.modelingnotations.adapter.MessageType
		 * @see eu.chorevolution.modelingnotations.adapter.impl.AdapterPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

	}

} //AdapterPackage
