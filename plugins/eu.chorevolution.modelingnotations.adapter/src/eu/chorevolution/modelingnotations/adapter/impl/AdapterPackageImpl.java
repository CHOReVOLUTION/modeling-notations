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
package eu.chorevolution.modelingnotations.adapter.impl;

import eu.chorevolution.modelingnotations.adapter.AdapterFactory;
import eu.chorevolution.modelingnotations.adapter.AdapterModel;
import eu.chorevolution.modelingnotations.adapter.AdapterPackage;
import eu.chorevolution.modelingnotations.adapter.AdapterType;
import eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyMessage;
import eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType;
import eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyTask;
import eu.chorevolution.modelingnotations.adapter.ComplexItem;
import eu.chorevolution.modelingnotations.adapter.DataItem;
import eu.chorevolution.modelingnotations.adapter.DataItemRelation;
import eu.chorevolution.modelingnotations.adapter.DateEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.EnumerationItem;
import eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation;
import eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.Message;
import eu.chorevolution.modelingnotations.adapter.MessageRelation;
import eu.chorevolution.modelingnotations.adapter.MessageType;
import eu.chorevolution.modelingnotations.adapter.OccurencesType;
import eu.chorevolution.modelingnotations.adapter.Operation;
import eu.chorevolution.modelingnotations.adapter.OperationRelation;
import eu.chorevolution.modelingnotations.adapter.SimpleItem;
import eu.chorevolution.modelingnotations.adapter.SimpleTypes;
import eu.chorevolution.modelingnotations.adapter.StringEnumerationItem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterPackageImpl extends EPackageImpl implements AdapterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyDataItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyComplexItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographySimpleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyEnumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEnumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEnumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationItemRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEnumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEnumerationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum occurencesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adapterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum choreographyMessageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdapterPackageImpl() {
		super(eNS_URI, AdapterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AdapterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdapterPackage init() {
		if (isInited) return (AdapterPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdapterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdapterPackageImpl theAdapterPackage = registeredAdapterPackage instanceof AdapterPackageImpl ? (AdapterPackageImpl)registeredAdapterPackage : new AdapterPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAdapterPackage.createPackageContents();

		// Initialize created meta-data
		theAdapterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdapterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdapterPackage.eNS_URI, theAdapterPackage);
		return theAdapterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapterModel() {
		return adapterModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapterModel_HasChoreographyTasks() {
		return (EReference)adapterModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapterModel_HasOperations() {
		return (EReference)adapterModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdapterModel_HasOperationsRelations() {
		return (EReference)adapterModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdapterModel_Type() {
		return (EAttribute)adapterModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageRelation() {
		return messageRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageRelation_ChoreographyMessage() {
		return (EReference)messageRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageRelation_Message() {
		return (EReference)messageRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageRelation_HasDataItemsRelations() {
		return (EReference)messageRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataItemRelation() {
		return dataItemRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataItemRelation_ChoreographyDataItem() {
		return (EReference)dataItemRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataItemRelation_DataItem() {
		return (EReference)dataItemRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataItemRelation_HasEnumerationItemsRelations() {
		return (EReference)dataItemRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataItemRelation_TransformationRule() {
		return (EAttribute)dataItemRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographyMessage() {
		return choreographyMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyMessage_Name() {
		return (EAttribute)choreographyMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoreographyMessage_HasChoreographyDataItem() {
		return (EReference)choreographyMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyMessage_Type() {
		return (EAttribute)choreographyMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessage_HasMessageDataItem() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Type() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographyDataItem() {
		return choreographyDataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyDataItem_Name() {
		return (EAttribute)choreographyDataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyDataItem_MinOccurs() {
		return (EAttribute)choreographyDataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyDataItem_MaxOccurs() {
		return (EAttribute)choreographyDataItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographyComplexItem() {
		return choreographyComplexItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoreographyComplexItem_HasChoreographyDataItems() {
		return (EReference)choreographyComplexItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyComplexItem_TypeName() {
		return (EAttribute)choreographyComplexItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographySimpleItem() {
		return choreographySimpleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographySimpleItem_Type() {
		return (EAttribute)choreographySimpleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoreographySimpleItem_HasChoreographyEnumerationItems() {
		return (EReference)choreographySimpleItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataItem() {
		return dataItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataItem_Name() {
		return (EAttribute)dataItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataItem_MinOccurs() {
		return (EAttribute)dataItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataItem_MaxOccurs() {
		return (EAttribute)dataItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexItem() {
		return complexItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplexItem_HasDataItems() {
		return (EReference)complexItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplexItem_TypeName() {
		return (EAttribute)complexItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleItem() {
		return simpleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleItem_Type() {
		return (EAttribute)simpleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleItem_HasEnumerationItems() {
		return (EReference)simpleItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographyEnumerationItem() {
		return choreographyEnumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationItem() {
		return enumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringEnumerationItem() {
		return stringEnumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringEnumerationItem_Value() {
		return (EAttribute)stringEnumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerEnumerationItem() {
		return integerEnumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerEnumerationItem_Value() {
		return (EAttribute)integerEnumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationItemRelation() {
		return enumerationItemRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationItemRelation_ChoreographyEnumerationItem() {
		return (EReference)enumerationItemRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationItemRelation_EnumerationItem() {
		return (EReference)enumerationItemRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoreographyTask() {
		return choreographyTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoreographyTask_Name() {
		return (EAttribute)choreographyTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoreographyTask_HasChoreographyMessages() {
		return (EReference)choreographyTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_HasMessages() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationRelation() {
		return operationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationRelation_ChoreographyTasks() {
		return (EReference)operationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationRelation_Operations() {
		return (EReference)operationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationRelation_HasMessagesRelations() {
		return (EReference)operationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleEnumerationItem() {
		return doubleEnumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleEnumerationItem_Value() {
		return (EAttribute)doubleEnumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateEnumerationItem() {
		return dateEnumerationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateEnumerationItem_Value() {
		return (EAttribute)dateEnumerationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSimpleTypes() {
		return simpleTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOccurencesType() {
		return occurencesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdapterType() {
		return adapterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChoreographyMessageType() {
		return choreographyMessageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageType() {
		return messageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterFactory getAdapterFactory() {
		return (AdapterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adapterModelEClass = createEClass(ADAPTER_MODEL);
		createEReference(adapterModelEClass, ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS);
		createEReference(adapterModelEClass, ADAPTER_MODEL__HAS_OPERATIONS);
		createEReference(adapterModelEClass, ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS);
		createEAttribute(adapterModelEClass, ADAPTER_MODEL__TYPE);

		messageRelationEClass = createEClass(MESSAGE_RELATION);
		createEReference(messageRelationEClass, MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE);
		createEReference(messageRelationEClass, MESSAGE_RELATION__MESSAGE);
		createEReference(messageRelationEClass, MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS);

		dataItemRelationEClass = createEClass(DATA_ITEM_RELATION);
		createEReference(dataItemRelationEClass, DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM);
		createEReference(dataItemRelationEClass, DATA_ITEM_RELATION__DATA_ITEM);
		createEReference(dataItemRelationEClass, DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS);
		createEAttribute(dataItemRelationEClass, DATA_ITEM_RELATION__TRANSFORMATION_RULE);

		choreographyMessageEClass = createEClass(CHOREOGRAPHY_MESSAGE);
		createEAttribute(choreographyMessageEClass, CHOREOGRAPHY_MESSAGE__NAME);
		createEReference(choreographyMessageEClass, CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM);
		createEAttribute(choreographyMessageEClass, CHOREOGRAPHY_MESSAGE__TYPE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEReference(messageEClass, MESSAGE__HAS_MESSAGE_DATA_ITEM);
		createEAttribute(messageEClass, MESSAGE__TYPE);

		choreographyDataItemEClass = createEClass(CHOREOGRAPHY_DATA_ITEM);
		createEAttribute(choreographyDataItemEClass, CHOREOGRAPHY_DATA_ITEM__NAME);
		createEAttribute(choreographyDataItemEClass, CHOREOGRAPHY_DATA_ITEM__MIN_OCCURS);
		createEAttribute(choreographyDataItemEClass, CHOREOGRAPHY_DATA_ITEM__MAX_OCCURS);

		choreographyComplexItemEClass = createEClass(CHOREOGRAPHY_COMPLEX_ITEM);
		createEReference(choreographyComplexItemEClass, CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS);
		createEAttribute(choreographyComplexItemEClass, CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME);

		choreographySimpleItemEClass = createEClass(CHOREOGRAPHY_SIMPLE_ITEM);
		createEAttribute(choreographySimpleItemEClass, CHOREOGRAPHY_SIMPLE_ITEM__TYPE);
		createEReference(choreographySimpleItemEClass, CHOREOGRAPHY_SIMPLE_ITEM__HAS_CHOREOGRAPHY_ENUMERATION_ITEMS);

		dataItemEClass = createEClass(DATA_ITEM);
		createEAttribute(dataItemEClass, DATA_ITEM__NAME);
		createEAttribute(dataItemEClass, DATA_ITEM__MIN_OCCURS);
		createEAttribute(dataItemEClass, DATA_ITEM__MAX_OCCURS);

		complexItemEClass = createEClass(COMPLEX_ITEM);
		createEReference(complexItemEClass, COMPLEX_ITEM__HAS_DATA_ITEMS);
		createEAttribute(complexItemEClass, COMPLEX_ITEM__TYPE_NAME);

		simpleItemEClass = createEClass(SIMPLE_ITEM);
		createEAttribute(simpleItemEClass, SIMPLE_ITEM__TYPE);
		createEReference(simpleItemEClass, SIMPLE_ITEM__HAS_ENUMERATION_ITEMS);

		choreographyEnumerationItemEClass = createEClass(CHOREOGRAPHY_ENUMERATION_ITEM);

		enumerationItemEClass = createEClass(ENUMERATION_ITEM);

		stringEnumerationItemEClass = createEClass(STRING_ENUMERATION_ITEM);
		createEAttribute(stringEnumerationItemEClass, STRING_ENUMERATION_ITEM__VALUE);

		integerEnumerationItemEClass = createEClass(INTEGER_ENUMERATION_ITEM);
		createEAttribute(integerEnumerationItemEClass, INTEGER_ENUMERATION_ITEM__VALUE);

		enumerationItemRelationEClass = createEClass(ENUMERATION_ITEM_RELATION);
		createEReference(enumerationItemRelationEClass, ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM);
		createEReference(enumerationItemRelationEClass, ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM);

		choreographyTaskEClass = createEClass(CHOREOGRAPHY_TASK);
		createEAttribute(choreographyTaskEClass, CHOREOGRAPHY_TASK__NAME);
		createEReference(choreographyTaskEClass, CHOREOGRAPHY_TASK__HAS_CHOREOGRAPHY_MESSAGES);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__HAS_MESSAGES);

		operationRelationEClass = createEClass(OPERATION_RELATION);
		createEReference(operationRelationEClass, OPERATION_RELATION__CHOREOGRAPHY_TASKS);
		createEReference(operationRelationEClass, OPERATION_RELATION__OPERATIONS);
		createEReference(operationRelationEClass, OPERATION_RELATION__HAS_MESSAGES_RELATIONS);

		doubleEnumerationItemEClass = createEClass(DOUBLE_ENUMERATION_ITEM);
		createEAttribute(doubleEnumerationItemEClass, DOUBLE_ENUMERATION_ITEM__VALUE);

		dateEnumerationItemEClass = createEClass(DATE_ENUMERATION_ITEM);
		createEAttribute(dateEnumerationItemEClass, DATE_ENUMERATION_ITEM__VALUE);

		// Create enums
		simpleTypesEEnum = createEEnum(SIMPLE_TYPES);
		occurencesTypeEEnum = createEEnum(OCCURENCES_TYPE);
		adapterTypeEEnum = createEEnum(ADAPTER_TYPE);
		choreographyMessageTypeEEnum = createEEnum(CHOREOGRAPHY_MESSAGE_TYPE);
		messageTypeEEnum = createEEnum(MESSAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		choreographyComplexItemEClass.getESuperTypes().add(this.getChoreographyDataItem());
		choreographySimpleItemEClass.getESuperTypes().add(this.getChoreographyDataItem());
		complexItemEClass.getESuperTypes().add(this.getDataItem());
		simpleItemEClass.getESuperTypes().add(this.getDataItem());
		stringEnumerationItemEClass.getESuperTypes().add(this.getChoreographyEnumerationItem());
		stringEnumerationItemEClass.getESuperTypes().add(this.getEnumerationItem());
		integerEnumerationItemEClass.getESuperTypes().add(this.getChoreographyEnumerationItem());
		integerEnumerationItemEClass.getESuperTypes().add(this.getEnumerationItem());
		doubleEnumerationItemEClass.getESuperTypes().add(this.getChoreographyEnumerationItem());
		doubleEnumerationItemEClass.getESuperTypes().add(this.getEnumerationItem());
		dateEnumerationItemEClass.getESuperTypes().add(this.getChoreographyEnumerationItem());
		dateEnumerationItemEClass.getESuperTypes().add(this.getEnumerationItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(adapterModelEClass, AdapterModel.class, "AdapterModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdapterModel_HasChoreographyTasks(), this.getChoreographyTask(), null, "hasChoreographyTasks", null, 1, -1, AdapterModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapterModel_HasOperations(), this.getOperation(), null, "hasOperations", null, 1, -1, AdapterModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdapterModel_HasOperationsRelations(), this.getOperationRelation(), null, "hasOperationsRelations", null, 1, -1, AdapterModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdapterModel_Type(), this.getAdapterType(), "type", null, 0, 1, AdapterModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageRelationEClass, MessageRelation.class, "MessageRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageRelation_ChoreographyMessage(), this.getChoreographyMessage(), null, "choreographyMessage", null, 0, 1, MessageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageRelation_Message(), this.getMessage(), null, "message", null, 0, 1, MessageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageRelation_HasDataItemsRelations(), this.getDataItemRelation(), null, "hasDataItemsRelations", null, 1, -1, MessageRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemRelationEClass, DataItemRelation.class, "DataItemRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataItemRelation_ChoreographyDataItem(), this.getChoreographyDataItem(), null, "choreographyDataItem", null, 0, -1, DataItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItemRelation_DataItem(), this.getDataItem(), null, "dataItem", null, 0, -1, DataItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataItemRelation_HasEnumerationItemsRelations(), this.getEnumerationItemRelation(), null, "hasEnumerationItemsRelations", null, 0, -1, DataItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItemRelation_TransformationRule(), ecorePackage.getEString(), "transformationRule", null, 0, 1, DataItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyMessageEClass, ChoreographyMessage.class, "ChoreographyMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreographyMessage_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChoreographyMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreographyMessage_HasChoreographyDataItem(), this.getChoreographyDataItem(), null, "hasChoreographyDataItem", null, 1, 1, ChoreographyMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreographyMessage_Type(), this.getChoreographyMessageType(), "type", null, 0, 1, ChoreographyMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_HasMessageDataItem(), this.getDataItem(), null, "hasMessageDataItem", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Type(), this.getMessageType(), "type", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyDataItemEClass, ChoreographyDataItem.class, "ChoreographyDataItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreographyDataItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChoreographyDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreographyDataItem_MinOccurs(), this.getOccurencesType(), "minOccurs", null, 1, 1, ChoreographyDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreographyDataItem_MaxOccurs(), this.getOccurencesType(), "maxOccurs", null, 1, 1, ChoreographyDataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyComplexItemEClass, ChoreographyComplexItem.class, "ChoreographyComplexItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreographyComplexItem_HasChoreographyDataItems(), this.getChoreographyDataItem(), null, "hasChoreographyDataItems", null, 1, -1, ChoreographyComplexItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreographyComplexItem_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ChoreographyComplexItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographySimpleItemEClass, ChoreographySimpleItem.class, "ChoreographySimpleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreographySimpleItem_Type(), this.getSimpleTypes(), "type", null, 1, 1, ChoreographySimpleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreographySimpleItem_HasChoreographyEnumerationItems(), this.getChoreographyEnumerationItem(), null, "hasChoreographyEnumerationItems", null, 0, -1, ChoreographySimpleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemEClass, DataItem.class, "DataItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItem_MinOccurs(), this.getOccurencesType(), "minOccurs", null, 1, 1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataItem_MaxOccurs(), this.getOccurencesType(), "maxOccurs", null, 1, 1, DataItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexItemEClass, ComplexItem.class, "ComplexItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexItem_HasDataItems(), this.getDataItem(), null, "hasDataItems", null, 1, -1, ComplexItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexItem_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ComplexItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleItemEClass, SimpleItem.class, "SimpleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleItem_Type(), this.getSimpleTypes(), "type", null, 1, 1, SimpleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleItem_HasEnumerationItems(), this.getEnumerationItem(), null, "hasEnumerationItems", null, 0, -1, SimpleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyEnumerationItemEClass, ChoreographyEnumerationItem.class, "ChoreographyEnumerationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationItemEClass, EnumerationItem.class, "EnumerationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEnumerationItemEClass, StringEnumerationItem.class, "StringEnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringEnumerationItem_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringEnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEnumerationItemEClass, IntegerEnumerationItem.class, "IntegerEnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerEnumerationItem_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerEnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationItemRelationEClass, EnumerationItemRelation.class, "EnumerationItemRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationItemRelation_ChoreographyEnumerationItem(), this.getChoreographyEnumerationItem(), null, "choreographyEnumerationItem", null, 1, 1, EnumerationItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationItemRelation_EnumerationItem(), this.getEnumerationItem(), null, "enumerationItem", null, 1, 1, EnumerationItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choreographyTaskEClass, ChoreographyTask.class, "ChoreographyTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreographyTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChoreographyTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreographyTask_HasChoreographyMessages(), this.getChoreographyMessage(), null, "hasChoreographyMessages", null, 1, 2, ChoreographyTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_HasMessages(), this.getMessage(), null, "hasMessages", null, 1, 2, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationRelationEClass, OperationRelation.class, "OperationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationRelation_ChoreographyTasks(), this.getChoreographyTask(), null, "choreographyTasks", null, 0, -1, OperationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationRelation_Operations(), this.getOperation(), null, "operations", null, 0, -1, OperationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationRelation_HasMessagesRelations(), this.getMessageRelation(), null, "hasMessagesRelations", null, 1, -1, OperationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleEnumerationItemEClass, DoubleEnumerationItem.class, "DoubleEnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleEnumerationItem_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleEnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEnumerationItemEClass, DateEnumerationItem.class, "DateEnumerationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateEnumerationItem_Value(), ecorePackage.getEDate(), "value", null, 1, 1, DateEnumerationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleTypesEEnum, SimpleTypes.class, "SimpleTypes");
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.STRING);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.INTEGER);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.BOOLEAN);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.DATE);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.TIME);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.DOUBLE);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.DATE_TIME);

		initEEnum(occurencesTypeEEnum, OccurencesType.class, "OccurencesType");
		addEEnumLiteral(occurencesTypeEEnum, OccurencesType.ZERO);
		addEEnumLiteral(occurencesTypeEEnum, OccurencesType.ONE);
		addEEnumLiteral(occurencesTypeEEnum, OccurencesType.UNBOUNDED);

		initEEnum(adapterTypeEEnum, AdapterType.class, "AdapterType");
		addEEnumLiteral(adapterTypeEEnum, AdapterType.CHOREOGRAPHY_TO_SERVICE);
		addEEnumLiteral(adapterTypeEEnum, AdapterType.SERVICE_TO_CHOREOGRAPHY);

		initEEnum(choreographyMessageTypeEEnum, ChoreographyMessageType.class, "ChoreographyMessageType");
		addEEnumLiteral(choreographyMessageTypeEEnum, ChoreographyMessageType.INITIATING);
		addEEnumLiteral(choreographyMessageTypeEEnum, ChoreographyMessageType.RETURN);

		initEEnum(messageTypeEEnum, MessageType.class, "MessageType");
		addEEnumLiteral(messageTypeEEnum, MessageType.INPUT);
		addEEnumLiteral(messageTypeEEnum, MessageType.OUTPUT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getAdapterModel_HasChoreographyTasks(),
		   source,
		   new String[] {
			   "wildcards", "",
			   "name", ""
		   });
		addAnnotation
		  (getOperationRelation_ChoreographyTasks(),
		   source,
		   new String[] {
			   "wildcards", "",
			   "name", ""
		   });
	}

} //AdapterPackageImpl
