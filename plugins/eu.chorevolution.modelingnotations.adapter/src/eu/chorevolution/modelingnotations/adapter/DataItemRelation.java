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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getChoreographyDataItem <em>Choreography Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getHasEnumerationItemsRelations <em>Has Enumeration Items Relations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getTransformationRule <em>Transformation Rule</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getDataItemRelation()
 * @model
 * @generated
 */
public interface DataItemRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Choreography Data Item</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Data Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Data Item</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getDataItemRelation_ChoreographyDataItem()
	 * @model
	 * @generated
	 */
	EList<ChoreographyDataItem> getChoreographyDataItem();

	/**
	 * Returns the value of the '<em><b>Data Item</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Item</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getDataItemRelation_DataItem()
	 * @model
	 * @generated
	 */
	EList<DataItem> getDataItem();

	/**
	 * Returns the value of the '<em><b>Has Enumeration Items Relations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Enumeration Items Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Enumeration Items Relations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getDataItemRelation_HasEnumerationItemsRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationItemRelation> getHasEnumerationItemsRelations();

	/**
	 * Returns the value of the '<em><b>Transformation Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Rule</em>' attribute.
	 * @see #setTransformationRule(String)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getDataItemRelation_TransformationRule()
	 * @model
	 * @generated
	 */
	String getTransformationRule();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation#getTransformationRule <em>Transformation Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Rule</em>' attribute.
	 * @see #getTransformationRule()
	 * @generated
	 */
	void setTransformationRule(String value);

} // DataItemRelation
