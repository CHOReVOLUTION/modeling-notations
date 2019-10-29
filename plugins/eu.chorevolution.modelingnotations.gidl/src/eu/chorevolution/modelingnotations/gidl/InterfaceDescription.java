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
package eu.chorevolution.modelingnotations.gidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.InterfaceDescription#getRole <em>Role</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.InterfaceDescription#getHasOperations <em>Has Operations</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getInterfaceDescription()
 * @model
 * @generated
 */
public interface InterfaceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(RoleTypes)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getInterfaceDescription_Role()
	 * @model dataType="eu.chorevolution.modelingnotations.gidl.RoleTypesObject" required="true"
	 * @generated
	 */
	RoleTypes getRole();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.InterfaceDescription#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleTypes value);

	/**
	 * Returns the value of the '<em><b>Has Operations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.gidl.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operations</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getInterfaceDescription_HasOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getHasOperations();

} // InterfaceDescription
