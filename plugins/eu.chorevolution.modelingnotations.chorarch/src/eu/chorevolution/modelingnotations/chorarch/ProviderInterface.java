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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.ProviderInterface#getServiceProvided <em>Service Provided</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getProviderInterface()
 * @model
 * @generated
 */
public interface ProviderInterface extends Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Service Provided</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.chorarch.ConsumerInterface}.
	 * It is bidirectional and its opposite is '{@link eu.chorevolution.modelingnotations.chorarch.ConsumerInterface#getServiceRequired <em>Service Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provided</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.chorarch.ChorarchPackage#getProviderInterface_ServiceProvided()
	 * @see eu.chorevolution.modelingnotations.chorarch.ConsumerInterface#getServiceRequired
	 * @model opposite="serviceRequired"
	 * @generated
	 */
	EList<ConsumerInterface> getServiceProvided();

} // ProviderInterface
