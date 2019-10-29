/**
 */
package eu.chorevolution.modelingnotations.servicething;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.servicething.ServicethingPackage
 * @generated
 */
public interface ServicethingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicethingFactory eINSTANCE = eu.chorevolution.modelingnotations.servicething.impl.ServicethingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Thing Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Thing Model</em>'.
	 * @generated
	 */
	ServiceThingModel createServiceThingModel();

	/**
	 * Returns a new object of class '<em>WSDL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSDL Model</em>'.
	 * @generated
	 */
	WSDLModel createWSDLModel();

	/**
	 * Returns a new object of class '<em>WADL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WADL Model</em>'.
	 * @generated
	 */
	WADLModel createWADLModel();

	/**
	 * Returns a new object of class '<em>COAP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COAP Model</em>'.
	 * @generated
	 */
	COAPModel createCOAPModel();

	/**
	 * Returns a new object of class '<em>IPLTS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPLTS Model</em>'.
	 * @generated
	 */
	IPLTSModel createIPLTSModel();

	/**
	 * Returns a new object of class '<em>WSBPEL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSBPEL Model</em>'.
	 * @generated
	 */
	WSBPELModel createWSBPELModel();

	/**
	 * Returns a new object of class '<em>WSSP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSSP Model</em>'.
	 * @generated
	 */
	WSSPModel createWSSPModel();

	/**
	 * Returns a new object of class '<em>WSLA Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSLA Model</em>'.
	 * @generated
	 */
	WSLAModel createWSLAModel();

	/**
	 * Returns a new object of class '<em>Identity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Model</em>'.
	 * @generated
	 */
	IdentityModel createIdentityModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicethingPackage getServicethingPackage();

} //ServicethingFactory
