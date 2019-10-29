/**
 */
package eu.chorevolution.modelingnotations.servicething.util;

import eu.chorevolution.modelingnotations.servicething.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage
 * @generated
 */
public class ServicethingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicethingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicethingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicethingPackage.eINSTANCE;
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
	protected ServicethingSwitch<Adapter> modelSwitch =
		new ServicethingSwitch<Adapter>() {
			@Override
			public Adapter caseServiceThingModel(ServiceThingModel object) {
				return createServiceThingModelAdapter();
			}
			@Override
			public Adapter caseInterfaceDescription(InterfaceDescription object) {
				return createInterfaceDescriptionAdapter();
			}
			@Override
			public Adapter caseInteractionProtocolDescription(InteractionProtocolDescription object) {
				return createInteractionProtocolDescriptionAdapter();
			}
			@Override
			public Adapter caseQoSDescription(QoSDescription object) {
				return createQoSDescriptionAdapter();
			}
			@Override
			public Adapter caseIdentityDescription(IdentityDescription object) {
				return createIdentityDescriptionAdapter();
			}
			@Override
			public Adapter caseSecurityDescription(SecurityDescription object) {
				return createSecurityDescriptionAdapter();
			}
			@Override
			public Adapter caseWSDLModel(WSDLModel object) {
				return createWSDLModelAdapter();
			}
			@Override
			public Adapter caseWADLModel(WADLModel object) {
				return createWADLModelAdapter();
			}
			@Override
			public Adapter caseCOAPModel(COAPModel object) {
				return createCOAPModelAdapter();
			}
			@Override
			public Adapter caseIPLTSModel(IPLTSModel object) {
				return createIPLTSModelAdapter();
			}
			@Override
			public Adapter caseWSBPELModel(WSBPELModel object) {
				return createWSBPELModelAdapter();
			}
			@Override
			public Adapter caseWSSPModel(WSSPModel object) {
				return createWSSPModelAdapter();
			}
			@Override
			public Adapter caseWSLAModel(WSLAModel object) {
				return createWSLAModelAdapter();
			}
			@Override
			public Adapter caseIdentityModel(IdentityModel object) {
				return createIdentityModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.ServiceThingModel <em>Service Thing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.ServiceThingModel
	 * @generated
	 */
	public Adapter createServiceThingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.InterfaceDescription <em>Interface Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.InterfaceDescription
	 * @generated
	 */
	public Adapter createInterfaceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription <em>Interaction Protocol Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.InteractionProtocolDescription
	 * @generated
	 */
	public Adapter createInteractionProtocolDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.QoSDescription <em>Qo SDescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.QoSDescription
	 * @generated
	 */
	public Adapter createQoSDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.IdentityDescription <em>Identity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.IdentityDescription
	 * @generated
	 */
	public Adapter createIdentityDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.SecurityDescription <em>Security Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.SecurityDescription
	 * @generated
	 */
	public Adapter createSecurityDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.WSDLModel <em>WSDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.WSDLModel
	 * @generated
	 */
	public Adapter createWSDLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.WADLModel <em>WADL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.WADLModel
	 * @generated
	 */
	public Adapter createWADLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.COAPModel <em>COAP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.COAPModel
	 * @generated
	 */
	public Adapter createCOAPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.IPLTSModel <em>IPLTS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.IPLTSModel
	 * @generated
	 */
	public Adapter createIPLTSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.WSBPELModel <em>WSBPEL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.WSBPELModel
	 * @generated
	 */
	public Adapter createWSBPELModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.WSSPModel <em>WSSP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.WSSPModel
	 * @generated
	 */
	public Adapter createWSSPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.WSLAModel <em>WSLA Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.WSLAModel
	 * @generated
	 */
	public Adapter createWSLAModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.chorevolution.modelingnotations.servicething.IdentityModel <em>Identity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.chorevolution.modelingnotations.servicething.IdentityModel
	 * @generated
	 */
	public Adapter createIdentityModelAdapter() {
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

} //ServicethingAdapterFactory
