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

import eu.chorevolution.modelingnotations.adapter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AdapterFactoryImpl extends EFactoryImpl implements AdapterFactory {
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
	public static AdapterFactory init() {
		try {
			AdapterFactory theAdapterFactory = (AdapterFactory)EPackage.Registry.INSTANCE.getEFactory(AdapterPackage.eNS_URI);
			if (theAdapterFactory != null) {
				return theAdapterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdapterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactoryImpl() {
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
			case AdapterPackage.ADAPTER_MODEL: return createAdapterModel();
			case AdapterPackage.MESSAGE_RELATION: return createMessageRelation();
			case AdapterPackage.DATA_ITEM_RELATION: return createDataItemRelation();
			case AdapterPackage.CHOREOGRAPHY_MESSAGE: return createChoreographyMessage();
			case AdapterPackage.MESSAGE: return createMessage();
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM: return createChoreographyComplexItem();
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM: return createChoreographySimpleItem();
			case AdapterPackage.COMPLEX_ITEM: return createComplexItem();
			case AdapterPackage.SIMPLE_ITEM: return createSimpleItem();
			case AdapterPackage.STRING_ENUMERATION_ITEM: return createStringEnumerationItem();
			case AdapterPackage.INTEGER_ENUMERATION_ITEM: return createIntegerEnumerationItem();
			case AdapterPackage.ENUMERATION_ITEM_RELATION: return createEnumerationItemRelation();
			case AdapterPackage.CHOREOGRAPHY_TASK: return createChoreographyTask();
			case AdapterPackage.OPERATION: return createOperation();
			case AdapterPackage.OPERATION_RELATION: return createOperationRelation();
			case AdapterPackage.DOUBLE_ENUMERATION_ITEM: return createDoubleEnumerationItem();
			case AdapterPackage.DATE_ENUMERATION_ITEM: return createDateEnumerationItem();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdapterPackage.SIMPLE_TYPES:
				return createSimpleTypesFromString(eDataType, initialValue);
			case AdapterPackage.OCCURENCES_TYPE:
				return createOccurencesTypeFromString(eDataType, initialValue);
			case AdapterPackage.ADAPTER_TYPE:
				return createAdapterTypeFromString(eDataType, initialValue);
			case AdapterPackage.CHOREOGRAPHY_MESSAGE_TYPE:
				return createChoreographyMessageTypeFromString(eDataType, initialValue);
			case AdapterPackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdapterPackage.SIMPLE_TYPES:
				return convertSimpleTypesToString(eDataType, instanceValue);
			case AdapterPackage.OCCURENCES_TYPE:
				return convertOccurencesTypeToString(eDataType, instanceValue);
			case AdapterPackage.ADAPTER_TYPE:
				return convertAdapterTypeToString(eDataType, instanceValue);
			case AdapterPackage.CHOREOGRAPHY_MESSAGE_TYPE:
				return convertChoreographyMessageTypeToString(eDataType, instanceValue);
			case AdapterPackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterModel createAdapterModel() {
		AdapterModelImpl adapterModel = new AdapterModelImpl();
		return adapterModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageRelation createMessageRelation() {
		MessageRelationImpl messageRelation = new MessageRelationImpl();
		return messageRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataItemRelation createDataItemRelation() {
		DataItemRelationImpl dataItemRelation = new DataItemRelationImpl();
		return dataItemRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographyMessage createChoreographyMessage() {
		ChoreographyMessageImpl choreographyMessage = new ChoreographyMessageImpl();
		return choreographyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographyComplexItem createChoreographyComplexItem() {
		ChoreographyComplexItemImpl choreographyComplexItem = new ChoreographyComplexItemImpl();
		return choreographyComplexItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographySimpleItem createChoreographySimpleItem() {
		ChoreographySimpleItemImpl choreographySimpleItem = new ChoreographySimpleItemImpl();
		return choreographySimpleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexItem createComplexItem() {
		ComplexItemImpl complexItem = new ComplexItemImpl();
		return complexItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleItem createSimpleItem() {
		SimpleItemImpl simpleItem = new SimpleItemImpl();
		return simpleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringEnumerationItem createStringEnumerationItem() {
		StringEnumerationItemImpl stringEnumerationItem = new StringEnumerationItemImpl();
		return stringEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerEnumerationItem createIntegerEnumerationItem() {
		IntegerEnumerationItemImpl integerEnumerationItem = new IntegerEnumerationItemImpl();
		return integerEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationItemRelation createEnumerationItemRelation() {
		EnumerationItemRelationImpl enumerationItemRelation = new EnumerationItemRelationImpl();
		return enumerationItemRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographyTask createChoreographyTask() {
		ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
		return choreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRelation createOperationRelation() {
		OperationRelationImpl operationRelation = new OperationRelationImpl();
		return operationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleEnumerationItem createDoubleEnumerationItem() {
		DoubleEnumerationItemImpl doubleEnumerationItem = new DoubleEnumerationItemImpl();
		return doubleEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateEnumerationItem createDateEnumerationItem() {
		DateEnumerationItemImpl dateEnumerationItem = new DateEnumerationItemImpl();
		return dateEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypes createSimpleTypesFromString(EDataType eDataType, String initialValue) {
		SimpleTypes result = SimpleTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurencesType createOccurencesTypeFromString(EDataType eDataType, String initialValue) {
		OccurencesType result = OccurencesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOccurencesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterType createAdapterTypeFromString(EDataType eDataType, String initialValue) {
		AdapterType result = AdapterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdapterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyMessageType createChoreographyMessageTypeFromString(EDataType eDataType, String initialValue) {
		ChoreographyMessageType result = ChoreographyMessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoreographyMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType, String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterPackage getAdapterPackage() {
		return (AdapterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdapterPackage getPackage() {
		return AdapterPackage.eINSTANCE;
	}

} //AdapterFactoryImpl
