/**
 * Copyright Text    
 *  Copyright 2015 The CHOReVOLUTION project
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.chorevolution.modelingnotations.adapter.util;

import eu.chorevolution.modelingnotations.adapter.*;

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
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage
 * @generated
 */
public class AdapterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterSwitch() {
		if (modelPackage == null) {
			modelPackage = AdapterPackage.eINSTANCE;
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
			case AdapterPackage.ADAPTER_MODEL: {
				AdapterModel adapterModel = (AdapterModel)theEObject;
				T result = caseAdapterModel(adapterModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.MESSAGE_RELATION: {
				MessageRelation messageRelation = (MessageRelation)theEObject;
				T result = caseMessageRelation(messageRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.DATA_ITEM_RELATION: {
				DataItemRelation dataItemRelation = (DataItemRelation)theEObject;
				T result = caseDataItemRelation(dataItemRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_MESSAGE: {
				ChoreographyMessage choreographyMessage = (ChoreographyMessage)theEObject;
				T result = caseChoreographyMessage(choreographyMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_DATA_ITEM: {
				ChoreographyDataItem choreographyDataItem = (ChoreographyDataItem)theEObject;
				T result = caseChoreographyDataItem(choreographyDataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM: {
				ChoreographyComplexItem choreographyComplexItem = (ChoreographyComplexItem)theEObject;
				T result = caseChoreographyComplexItem(choreographyComplexItem);
				if (result == null) result = caseChoreographyDataItem(choreographyComplexItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_SIMPLE_ITEM: {
				ChoreographySimpleItem choreographySimpleItem = (ChoreographySimpleItem)theEObject;
				T result = caseChoreographySimpleItem(choreographySimpleItem);
				if (result == null) result = caseChoreographyDataItem(choreographySimpleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.DATA_ITEM: {
				DataItem dataItem = (DataItem)theEObject;
				T result = caseDataItem(dataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.COMPLEX_ITEM: {
				ComplexItem complexItem = (ComplexItem)theEObject;
				T result = caseComplexItem(complexItem);
				if (result == null) result = caseDataItem(complexItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.SIMPLE_ITEM: {
				SimpleItem simpleItem = (SimpleItem)theEObject;
				T result = caseSimpleItem(simpleItem);
				if (result == null) result = caseDataItem(simpleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_ENUMERATION_ITEM: {
				ChoreographyEnumerationItem choreographyEnumerationItem = (ChoreographyEnumerationItem)theEObject;
				T result = caseChoreographyEnumerationItem(choreographyEnumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.ENUMERATION_ITEM: {
				EnumerationItem enumerationItem = (EnumerationItem)theEObject;
				T result = caseEnumerationItem(enumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.STRING_ENUMERATION_ITEM: {
				StringEnumerationItem stringEnumerationItem = (StringEnumerationItem)theEObject;
				T result = caseStringEnumerationItem(stringEnumerationItem);
				if (result == null) result = caseChoreographyEnumerationItem(stringEnumerationItem);
				if (result == null) result = caseEnumerationItem(stringEnumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.INTEGER_ENUMERATION_ITEM: {
				IntegerEnumerationItem integerEnumerationItem = (IntegerEnumerationItem)theEObject;
				T result = caseIntegerEnumerationItem(integerEnumerationItem);
				if (result == null) result = caseChoreographyEnumerationItem(integerEnumerationItem);
				if (result == null) result = caseEnumerationItem(integerEnumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.ENUMERATION_ITEM_RELATION: {
				EnumerationItemRelation enumerationItemRelation = (EnumerationItemRelation)theEObject;
				T result = caseEnumerationItemRelation(enumerationItemRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.CHOREOGRAPHY_TASK: {
				ChoreographyTask choreographyTask = (ChoreographyTask)theEObject;
				T result = caseChoreographyTask(choreographyTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.OPERATION_RELATION: {
				OperationRelation operationRelation = (OperationRelation)theEObject;
				T result = caseOperationRelation(operationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.DOUBLE_ENUMERATION_ITEM: {
				DoubleEnumerationItem doubleEnumerationItem = (DoubleEnumerationItem)theEObject;
				T result = caseDoubleEnumerationItem(doubleEnumerationItem);
				if (result == null) result = caseChoreographyEnumerationItem(doubleEnumerationItem);
				if (result == null) result = caseEnumerationItem(doubleEnumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.DATE_ENUMERATION_ITEM: {
				DateEnumerationItem dateEnumerationItem = (DateEnumerationItem)theEObject;
				T result = caseDateEnumerationItem(dateEnumerationItem);
				if (result == null) result = caseChoreographyEnumerationItem(dateEnumerationItem);
				if (result == null) result = caseEnumerationItem(dateEnumerationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapterModel(AdapterModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageRelation(MessageRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItemRelation(DataItemRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyMessage(ChoreographyMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyDataItem(ChoreographyDataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Complex Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyComplexItem(ChoreographyComplexItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Simple Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Simple Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographySimpleItem(ChoreographySimpleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItem(DataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexItem(ComplexItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleItem(SimpleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyEnumerationItem(ChoreographyEnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationItem(EnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringEnumerationItem(StringEnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerEnumerationItem(IntegerEnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Item Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Item Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationItemRelation(EnumerationItemRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choreography Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreographyTask(ChoreographyTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationRelation(OperationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleEnumerationItem(DoubleEnumerationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Enumeration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateEnumerationItem(DateEnumerationItem object) {
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

} //AdapterSwitch
