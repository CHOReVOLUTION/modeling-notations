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
package eu.chorevolution.modelingnotations.adapter.impl;

import eu.chorevolution.modelingnotations.adapter.AdapterPackage;
import eu.chorevolution.modelingnotations.adapter.ChoreographyMessage;
import eu.chorevolution.modelingnotations.adapter.DataItemRelation;
import eu.chorevolution.modelingnotations.adapter.Message;
import eu.chorevolution.modelingnotations.adapter.MessageRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl#getChoreographyMessage <em>Choreography Message</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.MessageRelationImpl#getHasDataItemsRelations <em>Has Data Items Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageRelationImpl extends MinimalEObjectImpl.Container implements MessageRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getChoreographyMessage() <em>Choreography Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyMessage()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyMessage choreographyMessage;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The cached value of the '{@link #getHasDataItemsRelations() <em>Has Data Items Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDataItemsRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItemRelation> hasDataItemsRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.MESSAGE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographyMessage getChoreographyMessage() {
		if (choreographyMessage != null && choreographyMessage.eIsProxy()) {
			InternalEObject oldChoreographyMessage = (InternalEObject)choreographyMessage;
			choreographyMessage = (ChoreographyMessage)eResolveProxy(oldChoreographyMessage);
			if (choreographyMessage != oldChoreographyMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE, oldChoreographyMessage, choreographyMessage));
			}
		}
		return choreographyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyMessage basicGetChoreographyMessage() {
		return choreographyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoreographyMessage(ChoreographyMessage newChoreographyMessage) {
		ChoreographyMessage oldChoreographyMessage = choreographyMessage;
		choreographyMessage = newChoreographyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE, oldChoreographyMessage, choreographyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterPackage.MESSAGE_RELATION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.MESSAGE_RELATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataItemRelation> getHasDataItemsRelations() {
		if (hasDataItemsRelations == null) {
			hasDataItemsRelations = new EObjectContainmentEList<DataItemRelation>(DataItemRelation.class, this, AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS);
		}
		return hasDataItemsRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS:
				return ((InternalEList<?>)getHasDataItemsRelations()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE:
				if (resolve) return getChoreographyMessage();
				return basicGetChoreographyMessage();
			case AdapterPackage.MESSAGE_RELATION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS:
				return getHasDataItemsRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE:
				setChoreographyMessage((ChoreographyMessage)newValue);
				return;
			case AdapterPackage.MESSAGE_RELATION__MESSAGE:
				setMessage((Message)newValue);
				return;
			case AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS:
				getHasDataItemsRelations().clear();
				getHasDataItemsRelations().addAll((Collection<? extends DataItemRelation>)newValue);
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
			case AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE:
				setChoreographyMessage((ChoreographyMessage)null);
				return;
			case AdapterPackage.MESSAGE_RELATION__MESSAGE:
				setMessage((Message)null);
				return;
			case AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS:
				getHasDataItemsRelations().clear();
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
			case AdapterPackage.MESSAGE_RELATION__CHOREOGRAPHY_MESSAGE:
				return choreographyMessage != null;
			case AdapterPackage.MESSAGE_RELATION__MESSAGE:
				return message != null;
			case AdapterPackage.MESSAGE_RELATION__HAS_DATA_ITEMS_RELATIONS:
				return hasDataItemsRelations != null && !hasDataItemsRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageRelationImpl
