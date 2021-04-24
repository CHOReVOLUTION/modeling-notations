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
 * A representation of the model object '<em><b>Message Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getChoreographyMessage <em>Choreography Message</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getMessage <em>Message</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getHasDataItemsRelations <em>Has Data Items Relations</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getMessageRelation()
 * @model
 * @generated
 */
public interface MessageRelation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Choreography Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Message</em>' reference.
	 * @see #setChoreographyMessage(ChoreographyMessage)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getMessageRelation_ChoreographyMessage()
	 * @model
	 * @generated
	 */
	ChoreographyMessage getChoreographyMessage();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getChoreographyMessage <em>Choreography Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Message</em>' reference.
	 * @see #getChoreographyMessage()
	 * @generated
	 */
	void setChoreographyMessage(ChoreographyMessage value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getMessageRelation_Message()
	 * @model
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Has Data Items Relations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.adapter.DataItemRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data Items Relations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getMessageRelation_HasDataItemsRelations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataItemRelation> getHasDataItemsRelations();

} // MessageRelation
