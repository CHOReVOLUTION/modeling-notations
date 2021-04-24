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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMaxOccurs <em>Max Occurs</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyDataItem()
 * @model abstract="true"
 * @generated
 */
public interface ChoreographyDataItem extends EObject {
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
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyDataItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.adapter.OccurencesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @see #setMinOccurs(OccurencesType)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyDataItem_MinOccurs()
	 * @model required="true"
	 * @generated
	 */
	OccurencesType getMinOccurs();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(OccurencesType value);

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.adapter.OccurencesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @see #setMaxOccurs(OccurencesType)
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage#getChoreographyDataItem_MaxOccurs()
	 * @model required="true"
	 * @generated
	 */
	OccurencesType getMaxOccurs();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.adapter.OccurencesType
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(OccurencesType value);

} // ChoreographyDataItem
