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
import eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem;
import eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem;

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
 * An implementation of the model object '<em><b>Choreography Complex Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl#getHasChoreographyDataItems <em>Has Choreography Data Items</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.ChoreographyComplexItemImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographyComplexItemImpl extends ChoreographyDataItemImpl implements ChoreographyComplexItem {
	/**
	 * The cached value of the '{@link #getHasChoreographyDataItems() <em>Has Choreography Data Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChoreographyDataItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoreographyDataItem> hasChoreographyDataItems;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyComplexItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.CHOREOGRAPHY_COMPLEX_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoreographyDataItem> getHasChoreographyDataItems() {
		if (hasChoreographyDataItems == null) {
			hasChoreographyDataItems = new EObjectContainmentEList<ChoreographyDataItem>(ChoreographyDataItem.class, this, AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS);
		}
		return hasChoreographyDataItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS:
				return ((InternalEList<?>)getHasChoreographyDataItems()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS:
				return getHasChoreographyDataItems();
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME:
				return getTypeName();
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
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS:
				getHasChoreographyDataItems().clear();
				getHasChoreographyDataItems().addAll((Collection<? extends ChoreographyDataItem>)newValue);
				return;
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME:
				setTypeName((String)newValue);
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
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS:
				getHasChoreographyDataItems().clear();
				return;
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
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
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__HAS_CHOREOGRAPHY_DATA_ITEMS:
				return hasChoreographyDataItems != null && !hasChoreographyDataItems.isEmpty();
			case AdapterPackage.CHOREOGRAPHY_COMPLEX_ITEM__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

} //ChoreographyComplexItemImpl
