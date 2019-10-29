/**
 */
package eu.chorevolution.modelingnotations.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Communication#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.Communication#getSecuredCommunication <em>Secured Communication</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getCommunication_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Communication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Secured Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secured Communication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured Communication</em>' attribute.
	 * @see #setSecuredCommunication(Boolean)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getCommunication_SecuredCommunication()
	 * @model
	 * @generated
	 */
	Boolean getSecuredCommunication();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.Communication#getSecuredCommunication <em>Secured Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured Communication</em>' attribute.
	 * @see #getSecuredCommunication()
	 * @generated
	 */
	void setSecuredCommunication(Boolean value);

} // Communication
