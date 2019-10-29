/**
 */
package eu.chorevolution.modelingnotations.security.tests;

import eu.chorevolution.modelingnotations.security.Authentication;
import eu.chorevolution.modelingnotations.security.SecurityFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationTest extends TestCase {

	/**
	 * The fixture for this Authentication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Authentication fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthenticationTest.class);
	}

	/**
	 * Constructs a new Authentication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Authentication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Authentication fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Authentication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Authentication getFixture() {
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
		setFixture(SecurityFactory.eINSTANCE.createAuthentication());
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

} //AuthenticationTest
