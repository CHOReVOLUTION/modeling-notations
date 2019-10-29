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
package eu.chorevolution.modelingnotations.adapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage
 * @generated
 */
public interface AdapterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterFactory eINSTANCE = eu.chorevolution.modelingnotations.adapter.impl.AdapterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	AdapterModel createAdapterModel();

	/**
	 * Returns a new object of class '<em>Message Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Relation</em>'.
	 * @generated
	 */
	MessageRelation createMessageRelation();

	/**
	 * Returns a new object of class '<em>Data Item Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Item Relation</em>'.
	 * @generated
	 */
	DataItemRelation createDataItemRelation();

	/**
	 * Returns a new object of class '<em>Choreography Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography Message</em>'.
	 * @generated
	 */
	ChoreographyMessage createChoreographyMessage();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Choreography Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography Complex Item</em>'.
	 * @generated
	 */
	ChoreographyComplexItem createChoreographyComplexItem();

	/**
	 * Returns a new object of class '<em>Choreography Simple Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography Simple Item</em>'.
	 * @generated
	 */
	ChoreographySimpleItem createChoreographySimpleItem();

	/**
	 * Returns a new object of class '<em>Complex Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Item</em>'.
	 * @generated
	 */
	ComplexItem createComplexItem();

	/**
	 * Returns a new object of class '<em>Simple Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Item</em>'.
	 * @generated
	 */
	SimpleItem createSimpleItem();

	/**
	 * Returns a new object of class '<em>String Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Enumeration Item</em>'.
	 * @generated
	 */
	StringEnumerationItem createStringEnumerationItem();

	/**
	 * Returns a new object of class '<em>Integer Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Enumeration Item</em>'.
	 * @generated
	 */
	IntegerEnumerationItem createIntegerEnumerationItem();

	/**
	 * Returns a new object of class '<em>Enumeration Item Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Item Relation</em>'.
	 * @generated
	 */
	EnumerationItemRelation createEnumerationItemRelation();

	/**
	 * Returns a new object of class '<em>Choreography Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography Task</em>'.
	 * @generated
	 */
	ChoreographyTask createChoreographyTask();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Operation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Relation</em>'.
	 * @generated
	 */
	OperationRelation createOperationRelation();

	/**
	 * Returns a new object of class '<em>Double Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Enumeration Item</em>'.
	 * @generated
	 */
	DoubleEnumerationItem createDoubleEnumerationItem();

	/**
	 * Returns a new object of class '<em>Date Enumeration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Enumeration Item</em>'.
	 * @generated
	 */
	DateEnumerationItem createDateEnumerationItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdapterPackage getAdapterPackage();

} //AdapterFactory
