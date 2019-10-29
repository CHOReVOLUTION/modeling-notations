/**
 * Copyright Text    
 *  Copyright 2015 The CHOReVOLUTION project
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.chorevolution.modelingnotations.adapter.impl;

import eu.chorevolution.modelingnotations.adapter.AdapterPackage;
import eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyMessage;
import eu.chorevolution.modelingnotations.adapter.ChoreographyMessageType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl#getHasChoreographyDataItem <em>Has Choreography Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyMessageImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographyMessageImpl extends MinimalEObjectImpl.Container implements ChoreographyMessage {
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
	 * The cached value of the '{@link #getHasChoreographyDataItem() <em>Has Choreography Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChoreographyDataItem()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyDataItem hasChoreographyDataItem;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChoreographyMessageType TYPE_EDEFAULT = ChoreographyMessageType.INITIATING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyMessageType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.CHOREOGRAPHY_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyDataItem getHasChoreographyDataItem() {
		return hasChoreographyDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasChoreographyDataItem(ChoreographyDataItem newHasChoreographyDataItem, NotificationChain msgs) {
		ChoreographyDataItem oldHasChoreographyDataItem = hasChoreographyDataItem;
		hasChoreographyDataItem = newHasChoreographyDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM, oldHasChoreographyDataItem, newHasChoreographyDataItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasChoreographyDataItem(ChoreographyDataItem newHasChoreographyDataItem) {
		if (newHasChoreographyDataItem != hasChoreographyDataItem) {
			NotificationChain msgs = null;
			if (hasChoreographyDataItem != null)
				msgs = ((InternalEObject)hasChoreographyDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM, null, msgs);
			if (newHasChoreographyDataItem != null)
				msgs = ((InternalEObject)newHasChoreographyDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM, null, msgs);
			msgs = basicSetHasChoreographyDataItem(newHasChoreographyDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM, newHasChoreographyDataItem, newHasChoreographyDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyMessageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ChoreographyMessageType newType) {
		ChoreographyMessageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_MESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM:
				return basicSetHasChoreographyDataItem(null, msgs);
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
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__NAME:
				return getName();
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM:
				return getHasChoreographyDataItem();
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__TYPE:
				return getType();
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
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__NAME:
				setName((String)newValue);
				return;
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM:
				setHasChoreographyDataItem((ChoreographyDataItem)newValue);
				return;
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__TYPE:
				setType((ChoreographyMessageType)newValue);
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
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM:
				setHasChoreographyDataItem((ChoreographyDataItem)null);
				return;
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__HAS_CHOREOGRAPHY_DATA_ITEM:
				return hasChoreographyDataItem != null;
			case AdapterPackage.CHOREOGRAPHY_MESSAGE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ChoreographyMessageImpl
