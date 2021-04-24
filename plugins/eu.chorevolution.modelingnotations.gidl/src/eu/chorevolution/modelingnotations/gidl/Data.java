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
package eu.chorevolution.modelingnotations.gidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.Data#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.Data#getContext <em>Context</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.Data#getHasDataType <em>Has Data Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.gidl.Data#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getData_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(ContextTypes)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getData_Context()
	 * @model dataType="eu.chorevolution.modelingnotations.gidl.ContextTypesObject"
	 * @generated
	 */
	ContextTypes getContext();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.Data#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextTypes value);

	/**
	 * Returns the value of the '<em><b>Has Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.gidl.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data Type</em>' containment reference list.
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getData_HasDataType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataType> getHasDataType();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' attribute.
	 * @see #setMedia(MediaTypes)
	 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getData_Media()
	 * @model dataType="eu.chorevolution.modelingnotations.gidl.MediaTypesObject"
	 * @generated
	 */
	MediaTypes getMedia();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.gidl.Data#getMedia <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' attribute.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(MediaTypes value);

} // Data
