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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.BusinessComponent#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getBusinessComponent()
 * @model abstract="true"
 * @generated
 */
public interface BusinessComponent extends Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getBusinessComponent_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.chorarch.BusinessComponent#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // BusinessComponent
