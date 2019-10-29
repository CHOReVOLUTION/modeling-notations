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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getHasChoreographyDataItem <em>Has Choreography Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyMessage()
 * @model
 * @generated
 */
public interface ChoreographyMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyMessage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Choreography Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Choreography Data Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Choreography Data Item</em>' containment reference.
	 * @see #setHasChoreographyDataItem(ChoreographyDataItem)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyMessage_HasChoreographyDataItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ChoreographyDataItem getHasChoreographyDataItem();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getHasChoreographyDataItem <em>Has Choreography Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Choreography Data Item</em>' containment reference.
	 * @see #getHasChoreographyDataItem()
	 * @generated
	 */
	void setHasChoreographyDataItem(ChoreographyDataItem value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType
	 * @see #setType(ChoreographyMessageType)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyMessage_Type()
	 * @model
	 * @generated
	 */
	ChoreographyMessageType getType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChoreographyMessageType value);

} // ChoreographyMessage
