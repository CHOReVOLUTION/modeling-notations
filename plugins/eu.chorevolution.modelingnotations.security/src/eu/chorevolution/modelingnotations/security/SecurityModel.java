/**
 */
package eu.chorevolution.modelingnotations.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityModel#getSecuritypolicyset <em>Securitypolicyset</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.security.SecurityModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Securitypolicyset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitypolicyset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitypolicyset</em>' containment reference.
	 * @see #setSecuritypolicyset(SecurityPolicySet)
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityModel_Securitypolicyset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecurityPolicySet getSecuritypolicyset();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.SecurityModel#getSecuritypolicyset <em>Securitypolicyset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitypolicyset</em>' containment reference.
	 * @see #getSecuritypolicyset()
	 * @generated
	 */
	void setSecuritypolicyset(SecurityPolicySet value);

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
	 * @see eu.chorevolution.modelingnotations.security.SecurityPackage#getSecurityModel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.security.SecurityModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SecurityModel
