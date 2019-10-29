/**
 */
package eu.chorevolution.modelingnotations.servicething.impl;

import eu.chorevolution.modelingnotations.servicething.IdentityDescription;
import eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription;
import eu.chorevolution.modelingnotations.servicething.InterfaceDescription;
import eu.chorevolution.modelingnotations.servicething.QoSDescription;
import eu.chorevolution.modelingnotations.servicething.SecurityDescription;
import eu.chorevolution.modelingnotations.servicething.ServiceThingModel;
import eu.chorevolution.modelingnotations.servicething.ServicethingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Thing Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getInterfaceDescription <em>Interface Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getInteractionProtocolDescription <em>Interaction Protocol Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getQosDescription <em>Qos Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getIdentityDescription <em>Identity Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getSecurityDescription <em>Security Description</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getID <em>ID</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.servicething.impl.ServiceThingModelImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceThingModelImpl extends MinimalEObjectImpl.Container implements ServiceThingModel {
	/**
	 * The cached value of the '{@link #getInterfaceDescription() <em>Interface Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDescription()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDescription interfaceDescription;

	/**
	 * The cached value of the '{@link #getInteractionProtocolDescription() <em>Interaction Protocol Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected InteractionProtocolDescription interactionProtocolDescription;

	/**
	 * The cached value of the '{@link #getQosDescription() <em>Qos Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQosDescription()
	 * @generated
	 * @ordered
	 */
	protected QoSDescription qosDescription;

	/**
	 * The cached value of the '{@link #getIdentityDescription() <em>Identity Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityDescription()
	 * @generated
	 * @ordered
	 */
	protected IdentityDescription identityDescription;

	/**
	 * The cached value of the '{@link #getSecurityDescription() <em>Security Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDescription()
	 * @generated
	 * @ordered
	 */
	protected SecurityDescription securityDescription;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceThingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicethingPackage.Literals.SERVICE_THING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDescription getInterfaceDescription() {
		return interfaceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceDescription(InterfaceDescription newInterfaceDescription, NotificationChain msgs) {
		InterfaceDescription oldInterfaceDescription = interfaceDescription;
		interfaceDescription = newInterfaceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION, oldInterfaceDescription, newInterfaceDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDescription(InterfaceDescription newInterfaceDescription) {
		if (newInterfaceDescription != interfaceDescription) {
			NotificationChain msgs = null;
			if (interfaceDescription != null)
				msgs = ((InternalEObject)interfaceDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION, null, msgs);
			if (newInterfaceDescription != null)
				msgs = ((InternalEObject)newInterfaceDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION, null, msgs);
			msgs = basicSetInterfaceDescription(newInterfaceDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION, newInterfaceDescription, newInterfaceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProtocolDescription getInteractionProtocolDescription() {
		return interactionProtocolDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionProtocolDescription(InteractionProtocolDescription newInteractionProtocolDescription, NotificationChain msgs) {
		InteractionProtocolDescription oldInteractionProtocolDescription = interactionProtocolDescription;
		interactionProtocolDescription = newInteractionProtocolDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION, oldInteractionProtocolDescription, newInteractionProtocolDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionProtocolDescription(InteractionProtocolDescription newInteractionProtocolDescription) {
		if (newInteractionProtocolDescription != interactionProtocolDescription) {
			NotificationChain msgs = null;
			if (interactionProtocolDescription != null)
				msgs = ((InternalEObject)interactionProtocolDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION, null, msgs);
			if (newInteractionProtocolDescription != null)
				msgs = ((InternalEObject)newInteractionProtocolDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION, null, msgs);
			msgs = basicSetInteractionProtocolDescription(newInteractionProtocolDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION, newInteractionProtocolDescription, newInteractionProtocolDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSDescription getQosDescription() {
		return qosDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQosDescription(QoSDescription newQosDescription, NotificationChain msgs) {
		QoSDescription oldQosDescription = qosDescription;
		qosDescription = newQosDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION, oldQosDescription, newQosDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQosDescription(QoSDescription newQosDescription) {
		if (newQosDescription != qosDescription) {
			NotificationChain msgs = null;
			if (qosDescription != null)
				msgs = ((InternalEObject)qosDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION, null, msgs);
			if (newQosDescription != null)
				msgs = ((InternalEObject)newQosDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION, null, msgs);
			msgs = basicSetQosDescription(newQosDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION, newQosDescription, newQosDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityDescription getIdentityDescription() {
		return identityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentityDescription(IdentityDescription newIdentityDescription, NotificationChain msgs) {
		IdentityDescription oldIdentityDescription = identityDescription;
		identityDescription = newIdentityDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION, oldIdentityDescription, newIdentityDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityDescription(IdentityDescription newIdentityDescription) {
		if (newIdentityDescription != identityDescription) {
			NotificationChain msgs = null;
			if (identityDescription != null)
				msgs = ((InternalEObject)identityDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION, null, msgs);
			if (newIdentityDescription != null)
				msgs = ((InternalEObject)newIdentityDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION, null, msgs);
			msgs = basicSetIdentityDescription(newIdentityDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION, newIdentityDescription, newIdentityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDescription getSecurityDescription() {
		return securityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityDescription(SecurityDescription newSecurityDescription, NotificationChain msgs) {
		SecurityDescription oldSecurityDescription = securityDescription;
		securityDescription = newSecurityDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION, oldSecurityDescription, newSecurityDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityDescription(SecurityDescription newSecurityDescription) {
		if (newSecurityDescription != securityDescription) {
			NotificationChain msgs = null;
			if (securityDescription != null)
				msgs = ((InternalEObject)securityDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION, null, msgs);
			if (newSecurityDescription != null)
				msgs = ((InternalEObject)newSecurityDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION, null, msgs);
			msgs = basicSetSecurityDescription(newSecurityDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION, newSecurityDescription, newSecurityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
				return basicSetInterfaceDescription(null, msgs);
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
				return basicSetInteractionProtocolDescription(null, msgs);
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
				return basicSetQosDescription(null, msgs);
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
				return basicSetIdentityDescription(null, msgs);
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
				return basicSetSecurityDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
				return getInterfaceDescription();
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
				return getInteractionProtocolDescription();
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
				return getQosDescription();
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
				return getIdentityDescription();
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
				return getSecurityDescription();
			case ServicethingPackage.SERVICE_THING_MODEL__ID:
				return getID();
			case ServicethingPackage.SERVICE_THING_MODEL__NAME:
				return getName();
			case ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT:
				return getEndpoint();
			case ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
				setInterfaceDescription((InterfaceDescription)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
				setInteractionProtocolDescription((InteractionProtocolDescription)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
				setQosDescription((QoSDescription)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
				setIdentityDescription((IdentityDescription)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
				setSecurityDescription((SecurityDescription)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__ID:
				setID((String)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__NAME:
				setName((String)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
				setInterfaceDescription((InterfaceDescription)null);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
				setInteractionProtocolDescription((InteractionProtocolDescription)null);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
				setQosDescription((QoSDescription)null);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
				setIdentityDescription((IdentityDescription)null);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
				setSecurityDescription((SecurityDescription)null);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__ID:
				setID(ID_EDEFAULT);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicethingPackage.SERVICE_THING_MODEL__INTERFACE_DESCRIPTION:
				return interfaceDescription != null;
			case ServicethingPackage.SERVICE_THING_MODEL__INTERACTION_PROTOCOL_DESCRIPTION:
				return interactionProtocolDescription != null;
			case ServicethingPackage.SERVICE_THING_MODEL__QOS_DESCRIPTION:
				return qosDescription != null;
			case ServicethingPackage.SERVICE_THING_MODEL__IDENTITY_DESCRIPTION:
				return identityDescription != null;
			case ServicethingPackage.SERVICE_THING_MODEL__SECURITY_DESCRIPTION:
				return securityDescription != null;
			case ServicethingPackage.SERVICE_THING_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicethingPackage.SERVICE_THING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicethingPackage.SERVICE_THING_MODEL__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case ServicethingPackage.SERVICE_THING_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ServiceThingModelImpl
