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
import eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem;
import eu.chorevolution.modelingnotations.adapter.EnumerationItem;
import eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Item Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl#getChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.EnumerationItemRelationImpl#getEnumerationItem <em>Enumeration Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationItemRelationImpl extends MinimalEObjectImpl.Container implements EnumerationItemRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getChoreographyEnumerationItem() <em>Choreography Enumeration Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyEnumerationItem()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyEnumerationItem choreographyEnumerationItem;

	/**
	 * The cached value of the '{@link #getEnumerationItem() <em>Enumeration Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationItem()
	 * @generated
	 * @ordered
	 */
	protected EnumerationItem enumerationItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.ENUMERATION_ITEM_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoreographyEnumerationItem getChoreographyEnumerationItem() {
		if (choreographyEnumerationItem != null && choreographyEnumerationItem.eIsProxy()) {
			InternalEObject oldChoreographyEnumerationItem = (InternalEObject)choreographyEnumerationItem;
			choreographyEnumerationItem = (ChoreographyEnumerationItem)eResolveProxy(oldChoreographyEnumerationItem);
			if (choreographyEnumerationItem != oldChoreographyEnumerationItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM, oldChoreographyEnumerationItem, choreographyEnumerationItem));
			}
		}
		return choreographyEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyEnumerationItem basicGetChoreographyEnumerationItem() {
		return choreographyEnumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoreographyEnumerationItem(ChoreographyEnumerationItem newChoreographyEnumerationItem) {
		ChoreographyEnumerationItem oldChoreographyEnumerationItem = choreographyEnumerationItem;
		choreographyEnumerationItem = newChoreographyEnumerationItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM, oldChoreographyEnumerationItem, choreographyEnumerationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationItem getEnumerationItem() {
		if (enumerationItem != null && enumerationItem.eIsProxy()) {
			InternalEObject oldEnumerationItem = (InternalEObject)enumerationItem;
			enumerationItem = (EnumerationItem)eResolveProxy(oldEnumerationItem);
			if (enumerationItem != oldEnumerationItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM, oldEnumerationItem, enumerationItem));
			}
		}
		return enumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationItem basicGetEnumerationItem() {
		return enumerationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerationItem(EnumerationItem newEnumerationItem) {
		EnumerationItem oldEnumerationItem = enumerationItem;
		enumerationItem = newEnumerationItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM, oldEnumerationItem, enumerationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM:
				if (resolve) return getChoreographyEnumerationItem();
				return basicGetChoreographyEnumerationItem();
			case AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM:
				if (resolve) return getEnumerationItem();
				return basicGetEnumerationItem();
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
			case AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM:
				setChoreographyEnumerationItem((ChoreographyEnumerationItem)newValue);
				return;
			case AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM:
				setEnumerationItem((EnumerationItem)newValue);
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
			case AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM:
				setChoreographyEnumerationItem((ChoreographyEnumerationItem)null);
				return;
			case AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM:
				setEnumerationItem((EnumerationItem)null);
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
			case AdapterPackage.ENUMERATION_ITEM_RELATION__CHOREOGRAPHY_ENUMERATION_ITEM:
				return choreographyEnumerationItem != null;
			case AdapterPackage.ENUMERATION_ITEM_RELATION__ENUMERATION_ITEM:
				return enumerationItem != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationItemRelationImpl
