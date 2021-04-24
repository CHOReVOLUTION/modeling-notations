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
package eu.chorevolution.modelingnotations.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getCommunication <em>Communication</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getRessourceURL <em>Ressource URL</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet()
 * @model
 * @generated
 */
public interface SecurityPolicySet extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.security.Authentication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet_Authentication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Authentication> getAuthentication();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.security.Communication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Communication> getCommunication();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressource URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource URL</em>' attribute.
	 * @see #setRessourceURL(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet_RessourceURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRessourceURL();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getRessourceURL <em>Ressource URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource URL</em>' attribute.
	 * @see #getRessourceURL()
	 * @generated
	 */
	void setRessourceURL(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityPolicySet_ServiceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.SecurityPolicySet#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // SecurityPolicySet
