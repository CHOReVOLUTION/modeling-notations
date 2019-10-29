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
import eu.chorevolution.modelingnotations.adapter.EnumerationItem;
import eu.chorevolution.modelingnotations.adapter.SimpleItem;
import eu.chorevolution.modelingnotations.adapter.SimpleTypes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.SimpleItemImpl#getHasEnumerationItems <em>Has Enumeration Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleItemImpl extends DataItemImpl implements SimpleItem {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypes TYPE_EDEFAULT = SimpleTypes.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasEnumerationItems() <em>Has Enumeration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEnumerationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationItem> hasEnumerationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.SIMPLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SimpleTypes newType) {
		SimpleTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.SIMPLE_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationItem> getHasEnumerationItems() {
		if (hasEnumerationItems == null) {
			hasEnumerationItems = new EObjectContainmentEList<EnumerationItem>(EnumerationItem.class, this, AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS);
		}
		return hasEnumerationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS:
				return ((InternalEList<?>)getHasEnumerationItems()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.SIMPLE_ITEM__TYPE:
				return getType();
			case AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS:
				return getHasEnumerationItems();
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
			case AdapterPackage.SIMPLE_ITEM__TYPE:
				setType((SimpleTypes)newValue);
				return;
			case AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS:
				getHasEnumerationItems().clear();
				getHasEnumerationItems().addAll((Collection<? extends EnumerationItem>)newValue);
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
			case AdapterPackage.SIMPLE_ITEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS:
				getHasEnumerationItems().clear();
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
			case AdapterPackage.SIMPLE_ITEM__TYPE:
				return type != TYPE_EDEFAULT;
			case AdapterPackage.SIMPLE_ITEM__HAS_ENUMERATION_ITEMS:
				return hasEnumerationItems != null && !hasEnumerationItems.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SimpleItemImpl
