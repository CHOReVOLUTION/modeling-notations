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
import eu.chorevolution.modelingnotations.adapter.ChoreographyTask;
import eu.chorevolution.modelingnotations.adapter.MessageRelation;
import eu.chorevolution.modelingnotations.adapter.Operation;
import eu.chorevolution.modelingnotations.adapter.OperationRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl#getChoreographyTasks <em>Choreography Tasks</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.adapter.impl.OperationRelationImpl#getHasMessagesRelations <em>Has Messages Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationRelationImpl extends MinimalEObjectImpl.Container implements OperationRelation {
	/**
	 * The cached value of the '{@link #getChoreographyTasks() <em>Choreography Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoreographyTask> choreographyTasks;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getHasMessagesRelations() <em>Has Messages Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessagesRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageRelation> hasMessagesRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.OPERATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoreographyTask> getChoreographyTasks() {
		if (choreographyTasks == null) {
			choreographyTasks = new EObjectResolvingEList<ChoreographyTask>(ChoreographyTask.class, this, AdapterPackage.OPERATION_RELATION__CHOREOGRAPHY_TASKS);
		}
		return choreographyTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectResolvingEList<Operation>(Operation.class, this, AdapterPackage.OPERATION_RELATION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageRelation> getHasMessagesRelations() {
		if (hasMessagesRelations == null) {
			hasMessagesRelations = new EObjectContainmentEList<MessageRelation>(MessageRelation.class, this, AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS);
		}
		return hasMessagesRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS:
				return ((InternalEList<?>)getHasMessagesRelations()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.OPERATION_RELATION__CHOREOGRAPHY_TASKS:
				return getChoreographyTasks();
			case AdapterPackage.OPERATION_RELATION__OPERATIONS:
				return getOperations();
			case AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS:
				return getHasMessagesRelations();
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
			case AdapterPackage.OPERATION_RELATION__CHOREOGRAPHY_TASKS:
				getChoreographyTasks().clear();
				getChoreographyTasks().addAll((Collection<? extends ChoreographyTask>)newValue);
				return;
			case AdapterPackage.OPERATION_RELATION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS:
				getHasMessagesRelations().clear();
				getHasMessagesRelations().addAll((Collection<? extends MessageRelation>)newValue);
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
			case AdapterPackage.OPERATION_RELATION__CHOREOGRAPHY_TASKS:
				getChoreographyTasks().clear();
				return;
			case AdapterPackage.OPERATION_RELATION__OPERATIONS:
				getOperations().clear();
				return;
			case AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS:
				getHasMessagesRelations().clear();
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
			case AdapterPackage.OPERATION_RELATION__CHOREOGRAPHY_TASKS:
				return choreographyTasks != null && !choreographyTasks.isEmpty();
			case AdapterPackage.OPERATION_RELATION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case AdapterPackage.OPERATION_RELATION__HAS_MESSAGES_RELATIONS:
				return hasMessagesRelations != null && !hasMessagesRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationRelationImpl
