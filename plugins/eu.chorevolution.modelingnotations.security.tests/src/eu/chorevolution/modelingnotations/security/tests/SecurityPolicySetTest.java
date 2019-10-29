/**
 */
package eu.chorevolution.modelingnotations.security.tests;

import eu.chorevolution.modelingnotations.security.SecurityFactory;
import eu.chorevolution.modelingnotations.security.SecurityPolicySet;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPolicySetTest extends TestCase {

	/**
	 * The fixture for this Policy Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPolicySet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityPolicySetTest.class);
	}

	/**
	 * Constructs a new Policy Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPolicySetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Policy Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityPolicySet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Policy Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPolicySet getFixture() {
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
		setFixture(SecurityFactory.eINSTANCE.createSecurityPolicySet());
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

} //SecurityPolicySetTest
