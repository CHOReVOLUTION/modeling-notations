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
 * A representation of the model object '<em><b>Enumeration Item Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getEnumerationItem <em>Enumeration Item</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getEnumerationItemRelation()
 * @model
 * @generated
 */
public interface EnumerationItemRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Choreography Enumeration Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Enumeration Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Enumeration Item</em>' reference.
	 * @see #setChoreographyEnumerationItem(ChoreographyEnumerationItem)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getEnumerationItemRelation_ChoreographyEnumerationItem()
	 * @model required="true"
	 * @generated
	 */
	ChoreographyEnumerationItem getChoreographyEnumerationItem();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Enumeration Item</em>' reference.
	 * @see #getChoreographyEnumerationItem()
	 * @generated
	 */
	void setChoreographyEnumerationItem(ChoreographyEnumerationItem value);

	/**
	 * Returns the value of the '<em><b>Enumeration Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Item</em>' reference.
	 * @see #setEnumerationItem(EnumerationItem)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getEnumerationItemRelation_EnumerationItem()
	 * @model required="true"
	 * @generated
	 */
	EnumerationItem getEnumerationItem();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation#getEnumerationItem <em>Enumeration Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Item</em>' reference.
	 * @see #getEnumerationItem()
	 * @generated
	 */
	void setEnumerationItem(EnumerationItem value);

} // EnumerationItemRelation
