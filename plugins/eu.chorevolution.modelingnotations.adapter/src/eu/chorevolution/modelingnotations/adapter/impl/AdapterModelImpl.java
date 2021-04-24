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

import eu.chorevolution.modelingnotations.adapter.AdapterModel;
import eu.chorevolution.modelingnotations.adapter.AdapterPackage;
import eu.chorevolution.modelingnotations.adapter.AdapterType;
import eu.chorevolution.modelingnotations.adapter.ChoreographyTask;
import eu.chorevolution.modelingnotations.adapter.Operation;
import eu.chorevolution.modelingnotations.adapter.OperationRelation;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl#getHasChoreographyTasks <em>Has Choreography Tasks</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl#getHasOperations <em>Has Operations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl#getHasOperationsRelations <em>Has Operations Relations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.AdapterModelImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdapterModelImpl extends MinimalEObjectImpl.Container implements AdapterModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getHasChoreographyTasks() <em>Has Choreography Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasChoreographyTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoreographyTask> hasChoreographyTasks;

	/**
	 * The cached value of the '{@link #getHasOperations() <em>Has Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> hasOperations;

	/**
	 * The cached value of the '{@link #getHasOperationsRelations() <em>Has Operations Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperationsRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationRelation> hasOperationsRelations;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AdapterType TYPE_EDEFAULT = AdapterType.CHOREOGRAPHY_TO_SERVICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AdapterType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.ADAPTER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChoreographyTask> getHasChoreographyTasks() {
		if (hasChoreographyTasks == null) {
			hasChoreographyTasks = new EObjectContainmentEList<ChoreographyTask>(ChoreographyTask.class, this, AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS);
		}
		return hasChoreographyTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getHasOperations() {
		if (hasOperations == null) {
			hasOperations = new EObjectContainmentEList<Operation>(Operation.class, this, AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS);
		}
		return hasOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationRelation> getHasOperationsRelations() {
		if (hasOperationsRelations == null) {
			hasOperationsRelations = new EObjectContainmentEList<OperationRelation>(OperationRelation.class, this, AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS);
		}
		return hasOperationsRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(AdapterType newType) {
		AdapterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ADAPTER_MODEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS:
				return ((InternalEList<?>)getHasChoreographyTasks()).basicRemove(otherEnd, msgs);
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS:
				return ((InternalEList<?>)getHasOperations()).basicRemove(otherEnd, msgs);
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS:
				return ((InternalEList<?>)getHasOperationsRelations()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS:
				return getHasChoreographyTasks();
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS:
				return getHasOperations();
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS:
				return getHasOperationsRelations();
			case AdapterPackage.ADAPTER_MODEL__TYPE:
				return getType();
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
			case AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS:
				getHasChoreographyTasks().clear();
				getHasChoreographyTasks().addAll((Collection<? extends ChoreographyTask>)newValue);
				return;
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS:
				getHasOperations().clear();
				getHasOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS:
				getHasOperationsRelations().clear();
				getHasOperationsRelations().addAll((Collection<? extends OperationRelation>)newValue);
				return;
			case AdapterPackage.ADAPTER_MODEL__TYPE:
				setType((AdapterType)newValue);
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
			case AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS:
				getHasChoreographyTasks().clear();
				return;
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS:
				getHasOperations().clear();
				return;
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS:
				getHasOperationsRelations().clear();
				return;
			case AdapterPackage.ADAPTER_MODEL__TYPE:
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
			case AdapterPackage.ADAPTER_MODEL__HAS_CHOREOGRAPHY_TASKS:
				return hasChoreographyTasks != null && !hasChoreographyTasks.isEmpty();
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS:
				return hasOperations != null && !hasOperations.isEmpty();
			case AdapterPackage.ADAPTER_MODEL__HAS_OPERATIONS_RELATIONS:
				return hasOperationsRelations != null && !hasOperationsRelations.isEmpty();
			case AdapterPackage.ADAPTER_MODEL__TYPE:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AdapterModelImpl
