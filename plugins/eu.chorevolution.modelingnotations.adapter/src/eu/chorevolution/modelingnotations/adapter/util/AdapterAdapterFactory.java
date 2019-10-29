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
package eu.chorevolution.modelingnotations.adapter.util;

import eu.chorevolution.modelingnotations.adapter.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.adapter.AdapterPackage
 * @generated
 */
public class AdapterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdapterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterSwitch<Adapter> modelSwitch =
		new AdapterSwitch<Adapter>() {
			@Override
			public Adapter caseAdapterModel(AdapterModel object) {
				return createAdapterModelAdapter();
			}
			@Override
			public Adapter caseMessageRelation(MessageRelation object) {
				return createMessageRelationAdapter();
			}
			@Override
			public Adapter caseDataItemRelation(DataItemRelation object) {
				return createDataItemRelationAdapter();
			}
			@Override
			public Adapter caseChoreographyMessage(ChoreographyMessage object) {
				return createChoreographyMessageAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseChoreographyDataItem(ChoreographyDataItem object) {
				return createChoreographyDataItemAdapter();
			}
			@Override
			public Adapter caseChoreographyComplexItem(ChoreographyComplexItem object) {
				return createChoreographyComplexItemAdapter();
			}
			@Override
			public Adapter caseChoreographySimpleItem(ChoreographySimpleItem object) {
				return createChoreographySimpleItemAdapter();
			}
			@Override
			public Adapter caseDataItem(DataItem object) {
				return createDataItemAdapter();
			}
			@Override
			public Adapter caseComplexItem(ComplexItem object) {
				return createComplexItemAdapter();
			}
			@Override
			public Adapter caseSimpleItem(SimpleItem object) {
				return createSimpleItemAdapter();
			}
			@Override
			public Adapter caseChoreographyEnumerationItem(ChoreographyEnumerationItem object) {
				return createChoreographyEnumerationItemAdapter();
			}
			@Override
			public Adapter caseEnumerationItem(EnumerationItem object) {
				return createEnumerationItemAdapter();
			}
			@Override
			public Adapter caseStringEnumerationItem(StringEnumerationItem object) {
				return createStringEnumerationItemAdapter();
			}
			@Override
			public Adapter caseIntegerEnumerationItem(IntegerEnumerationItem object) {
				return createIntegerEnumerationItemAdapter();
			}
			@Override
			public Adapter caseEnumerationItemRelation(EnumerationItemRelation object) {
				return createEnumerationItemRelationAdapter();
			}
			@Override
			public Adapter caseChoreographyTask(ChoreographyTask object) {
				return createChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperationRelation(OperationRelation object) {
				return createOperationRelationAdapter();
			}
			@Override
			public Adapter caseDoubleEnumerationItem(DoubleEnumerationItem object) {
				return createDoubleEnumerationItemAdapter();
			}
			@Override
			public Adapter caseDateEnumerationItem(DateEnumerationItem object) {
				return createDateEnumerationItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.AdapterModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.AdapterModel
	 * @generated
	 */
	public Adapter createAdapterModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.MessageRelation <em>Message Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.MessageRelation
	 * @generated
	 */
	public Adapter createMessageRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.DataItemRelation <em>Data Item Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItemRelation
	 * @generated
	 */
	public Adapter createDataItemRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyMessage <em>Choreography Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyMessage
	 * @generated
	 */
	public Adapter createChoreographyMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem <em>Choreography Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyDataItem
	 * @generated
	 */
	public Adapter createChoreographyDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem <em>Choreography Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyComplexItem
	 * @generated
	 */
	public Adapter createChoreographyComplexItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem <em>Choreography Simple Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographySimpleItem
	 * @generated
	 */
	public Adapter createChoreographySimpleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.DataItem
	 * @generated
	 */
	public Adapter createDataItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ComplexItem <em>Complex Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ComplexItem
	 * @generated
	 */
	public Adapter createComplexItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.SimpleItem <em>Simple Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.SimpleItem
	 * @generated
	 */
	public Adapter createSimpleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem <em>Choreography Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyEnumerationItem
	 * @generated
	 */
	public Adapter createChoreographyEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItem <em>Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItem
	 * @generated
	 */
	public Adapter createEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.StringEnumerationItem <em>String Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.StringEnumerationItem
	 * @generated
	 */
	public Adapter createStringEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem <em>Integer Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.IntegerEnumerationItem
	 * @generated
	 */
	public Adapter createIntegerEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation <em>Enumeration Item Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.EnumerationItemRelation
	 * @generated
	 */
	public Adapter createEnumerationItemRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.ChoreographyTask
	 * @generated
	 */
	public Adapter createChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.OperationRelation <em>Operation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.OperationRelation
	 * @generated
	 */
	public Adapter createOperationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem <em>Double Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.DoubleEnumerationItem
	 * @generated
	 */
	public Adapter createDoubleEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.adapter.DateEnumerationItem <em>Date Enumeration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.adapter.DateEnumerationItem
	 * @generated
	 */
	public Adapter createDateEnumerationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdapterAdapterFactory
