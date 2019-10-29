/**
 */
package eu.chorevolution.modelingnotations.servicething;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Thing Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInterfaceDescription <em>Interface Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInteractionProtocolDescription <em>Interaction Protocol Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getQosDescription <em>Qos Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getIdentityDescription <em>Identity Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getSecurityDescription <em>Security Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getID <em>ID</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel()
 * @model
 * @generated
 */
public interface ServiceThingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Description</em>' containment reference.
	 * @see #setInterfaceDescription(InterfaceDescription)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_InterfaceDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceDescription getInterfaceDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInterfaceDescription <em>Interface Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Description</em>' containment reference.
	 * @see #getInterfaceDescription()
	 * @generated
	 */
	void setInterfaceDescription(InterfaceDescription value);

	/**
	 * Returns the value of the '<em><b>Interaction Protocol Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Protocol Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Protocol Description</em>' containment reference.
	 * @see #setInteractionProtocolDescription(InteractionProtocolDescription)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_InteractionProtocolDescription()
	 * @model containment="true"
	 * @generated
	 */
	InteractionProtocolDescription getInteractionProtocolDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getInteractionProtocolDescription <em>Interaction Protocol Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Protocol Description</em>' containment reference.
	 * @see #getInteractionProtocolDescription()
	 * @generated
	 */
	void setInteractionProtocolDescription(InteractionProtocolDescription value);

	/**
	 * Returns the value of the '<em><b>Qos Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qos Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos Description</em>' containment reference.
	 * @see #setQosDescription(QoSDescription)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_QosDescription()
	 * @model containment="true"
	 * @generated
	 */
	QoSDescription getQosDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getQosDescription <em>Qos Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qos Description</em>' containment reference.
	 * @see #getQosDescription()
	 * @generated
	 */
	void setQosDescription(QoSDescription value);

	/**
	 * Returns the value of the '<em><b>Identity Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Description</em>' containment reference.
	 * @see #setIdentityDescription(IdentityDescription)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_IdentityDescription()
	 * @model containment="true"
	 * @generated
	 */
	IdentityDescription getIdentityDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getIdentityDescription <em>Identity Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Description</em>' containment reference.
	 * @see #getIdentityDescription()
	 * @generated
	 */
	void setIdentityDescription(IdentityDescription value);

	/**
	 * Returns the value of the '<em><b>Security Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Description</em>' containment reference.
	 * @see #setSecurityDescription(SecurityDescription)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_SecurityDescription()
	 * @model containment="true"
	 * @generated
	 */
	SecurityDescription getSecurityDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getSecurityDescription <em>Security Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Description</em>' containment reference.
	 * @see #getSecurityDescription()
	 * @generated
	 */
	void setSecurityDescription(SecurityDescription value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

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
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_Endpoint()
	 * @model required="true"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage#getServiceThingModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ServiceThingModel
