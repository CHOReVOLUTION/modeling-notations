/**
 */
package eu.chorevolution.modelingnotations.security.tests;

import eu.chorevolution.modelingnotations.security.Communication;
import eu.chorevolution.modelingnotations.security.SecurityFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationTest extends TestCase {

	/**
	 * The fixture for this Communication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Communication fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationTest.class);
	}

	/**
	 * Constructs a new Communication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Communication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Communication fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Communication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Communication getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SecurityFactory.eINSTANCE.createCommunication());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CommunicationTest
