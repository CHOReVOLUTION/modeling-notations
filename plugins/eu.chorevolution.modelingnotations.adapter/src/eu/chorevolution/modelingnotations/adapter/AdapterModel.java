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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasChoreographyTasks <em>Has Choreography Tasks</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperations <em>Has Operations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getHasOperationsRelations <em>Has Operations Relations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getAdapterModel()
 * @model
 * @generated
 */
public interface AdapterModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Has Choreography Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Choreography Tasks</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getAdapterModel_HasChoreographyTasks()
	 * @model containment="true" required="true"
	 *        extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<ChoreographyTask> getHasChoreographyTasks();

	/**
	 * Returns the value of the '<em><b>Has Operations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getAdapterModel_HasOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getHasOperations();

	/**
	 * Returns the value of the '<em><b>Has Operations Relations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.OperationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operations Relations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getAdapterModel_HasOperationsRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationRelation> getHasOperationsRelations();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.adapter.AdapterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterType
	 * @see #setType(AdapterType)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getAdapterModel_Type()
	 * @model
	 * @generated
	 */
	AdapterType getType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterType
	 * @see #getType()
	 * @generated
	 */
	void setType(AdapterType value);

} // AdapterModel
