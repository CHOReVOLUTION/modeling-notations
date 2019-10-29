/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.chorevolution.modelingnotations.chorarch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chor Arch Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getComponents <em>Components</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyID <em>Choreography ID</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyName <em>Choreography Name</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getChorArchModel()
 * @model
 * @generated
 */
public interface ChorArchModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.chorarch.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getChorArchModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Choreography ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography ID</em>' attribute.
	 * @see #setChoreographyID(String)
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getChorArchModel_ChoreographyID()
	 * @model required="true"
	 * @generated
	 */
	String getChoreographyID();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyID <em>Choreography ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography ID</em>' attribute.
	 * @see #getChoreographyID()
	 * @generated
	 */
	void setChoreographyID(String value);

	/**
	 * Returns the value of the '<em><b>Choreography Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Name</em>' attribute.
	 * @see #setChoreographyName(String)
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getChorArchModel_ChoreographyName()
	 * @model required="true"
	 * @generated
	 */
	String getChoreographyName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.chorarch.ChorArchModel#getChoreographyName <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Name</em>' attribute.
	 * @see #getChoreographyName()
	 * @generated
	 */
	void setChoreographyName(String value);

} // ChorArchModel
