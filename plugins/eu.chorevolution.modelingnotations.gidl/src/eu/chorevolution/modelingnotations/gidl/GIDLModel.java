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
 * A representation of the model object '<em><b>GIDL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.GIDLModel#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.GIDLModel#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.GIDLModel#getHasInterfaces <em>Has Interfaces</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getGIDLModel()
 * @model
 * @generated
 */
public interface GIDLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Address</em>' attribute.
	 * @see #setHostAddress(String)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getGIDLModel_HostAddress()
	 * @model required="true"
	 * @generated
	 */
	String getHostAddress();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.GIDLModel#getHostAddress <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Address</em>' attribute.
	 * @see #getHostAddress()
	 * @generated
	 */
	void setHostAddress(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(ProtocolTypes)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getGIDLModel_Protocol()
	 * @model dataType="eu.chorevolution.modelingnotations.gidl.ProtocolTypesObject" required="true"
	 * @generated
	 */
	ProtocolTypes getProtocol();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.GIDLModel#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolTypes value);

	/**
	 * Returns the value of the '<em><b>Has Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.gidl.InterfaceDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interfaces</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getGIDLModel_HasInterfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceDescription> getHasInterfaces();

} // GIDLModel
