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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.SimpleItem#getType <em>Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.SimpleItem#getHasEnumerationItems <em>Has Enumeration Items</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getSimpleItem()
 * @model
 * @generated
 */
public interface SimpleItem extends DataItem {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.adapter.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleTypes
	 * @see #setType(SimpleTypes)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getSimpleItem_Type()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypes getType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.SimpleItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleTypes value);

	/**
	 * Returns the value of the '<em><b>Has Enumeration Items</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.EnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Enumeration Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Enumeration Items</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getSimpleItem_HasEnumerationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationItem> getHasEnumerationItems();

} // SimpleItem
