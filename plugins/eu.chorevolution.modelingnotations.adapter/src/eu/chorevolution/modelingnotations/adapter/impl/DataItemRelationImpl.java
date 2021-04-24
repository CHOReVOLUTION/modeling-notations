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
import eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem;
import eu.chorevolution.modelingnotations.adapter.DataItem;
import eu.chorevolution.modelingnotations.adapter.DataItemRelation;
import eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Item Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl#getChoreographyDataItem <em>Choreography Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl#getDataItem <em>Data Item</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl#getHasEnumerationItemsRelations <em>Has Enumeration Items Relations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.DataItemRelationImpl#getTransformationRule <em>Transformation Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataItemRelationImpl extends MinimalEObjectImpl.Container implements DataItemRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getChoreographyDataItem() <em>Choreography Data Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyDataItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoreographyDataItem> choreographyDataItem;

	/**
	 * The cached value of the '{@link #getDataItem() <em>Data Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataItem()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> dataItem;

	/**
	 * The cached value of the '{@link #getHasEnumerationItemsRelations() <em>Has Enumeration Items Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEnumerationItemsRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationItemRelation> hasEnumerationItemsRelations;

	/**
	 * The default value of the '{@link #getTransformationRule() <em>Transformation Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationRule()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationRule() <em>Transformation Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationRule()
	 * @generated
	 * @ordered
	 */
	protected String transformationRule = TRANSFORMATION_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.DATA_ITEM_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoreographyDataItem> getChoreographyDataItem() {
		if (choreographyDataItem == null) {
			choreographyDataItem = new EObjectResolvingEList<ChoreographyDataItem>(ChoreographyDataItem.class, this, AdapterPackage.DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM);
		}
		return choreographyDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataItem> getDataItem() {
		if (dataItem == null) {
			dataItem = new EObjectResolvingEList<DataItem>(DataItem.class, this, AdapterPackage.DATA_ITEM_RELATION__DATA_ITEM);
		}
		return dataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationItemRelation> getHasEnumerationItemsRelations() {
		if (hasEnumerationItemsRelations == null) {
			hasEnumerationItemsRelations = new EObjectContainmentEList<EnumerationItemRelation>(EnumerationItemRelation.class, this, AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS);
		}
		return hasEnumerationItemsRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransformationRule() {
		return transformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransformationRule(String newTransformationRule) {
		String oldTransformationRule = transformationRule;
		transformationRule = newTransformationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.DATA_ITEM_RELATION__TRANSFORMATION_RULE, oldTransformationRule, transformationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS:
				return ((InternalEList<?>)getHasEnumerationItemsRelations()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM:
				return getChoreographyDataItem();
			case AdapterPackage.DATA_ITEM_RELATION__DATA_ITEM:
				return getDataItem();
			case AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS:
				return getHasEnumerationItemsRelations();
			case AdapterPackage.DATA_ITEM_RELATION__TRANSFORMATION_RULE:
				return getTransformationRule();
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
			case AdapterPackage.DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM:
				getChoreographyDataItem().clear();
				getChoreographyDataItem().addAll((Collection<? extends ChoreographyDataItem>)newValue);
				return;
			case AdapterPackage.DATA_ITEM_RELATION__DATA_ITEM:
				getDataItem().clear();
				getDataItem().addAll((Collection<? extends DataItem>)newValue);
				return;
			case AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS:
				getHasEnumerationItemsRelations().clear();
				getHasEnumerationItemsRelations().addAll((Collection<? extends EnumerationItemRelation>)newValue);
				return;
			case AdapterPackage.DATA_ITEM_RELATION__TRANSFORMATION_RULE:
				setTransformationRule((String)newValue);
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
			case AdapterPackage.DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM:
				getChoreographyDataItem().clear();
				return;
			case AdapterPackage.DATA_ITEM_RELATION__DATA_ITEM:
				getDataItem().clear();
				return;
			case AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS:
				getHasEnumerationItemsRelations().clear();
				return;
			case AdapterPackage.DATA_ITEM_RELATION__TRANSFORMATION_RULE:
				setTransformationRule(TRANSFORMATION_RULE_EDEFAULT);
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
			case AdapterPackage.DATA_ITEM_RELATION__CHOREOGRAPHY_DATA_ITEM:
				return choreographyDataItem != null && !choreographyDataItem.isEmpty();
			case AdapterPackage.DATA_ITEM_RELATION__DATA_ITEM:
				return dataItem != null && !dataItem.isEmpty();
			case AdapterPackage.DATA_ITEM_RELATION__HAS_ENUMERATION_ITEMS_RELATIONS:
				return hasEnumerationItemsRelations != null && !hasEnumerationItemsRelations.isEmpty();
			case AdapterPackage.DATA_ITEM_RELATION__TRANSFORMATION_RULE:
				return TRANSFORMATION_RULE_EDEFAULT == null ? transformationRule != null : !TRANSFORMATION_RULE_EDEFAULT.equals(transformationRule);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transformationRule: ");
		result.append(transformationRule);
		result.append(')');
		return result.toString();
	}

} //DataItemRelationImpl
