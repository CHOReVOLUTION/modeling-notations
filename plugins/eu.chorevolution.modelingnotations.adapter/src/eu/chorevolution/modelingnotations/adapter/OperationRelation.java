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
 * A representation of the model object '<em><b>Operation Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getChoreographyTasks <em>Choreography Tasks</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getOperations <em>Operations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.OperationRelation#getHasMessagesRelations <em>Has Messages Relations</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getOperationRelation()
 * @model
 * @generated
 */
public interface OperationRelation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Choreography Tasks</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Tasks</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getOperationRelation_ChoreographyTasks()
	 * @model extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<ChoreographyTask> getChoreographyTasks();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getOperationRelation_Operations()
	 * @model
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Has Messages Relations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.MessageRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Messages Relations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getOperationRelation_HasMessagesRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MessageRelation> getHasMessagesRelations();

} // OperationRelation
