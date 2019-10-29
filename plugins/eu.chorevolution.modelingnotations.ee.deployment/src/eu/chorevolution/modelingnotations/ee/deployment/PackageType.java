/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Package Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getPackageType()
 * @model
 * @generated
 */
public enum PackageType implements Enumerator {
	/**
	 * The '<em><b>COMMAND LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND_LINE(0, "COMMAND_LINE", "COMMAND_LINE"),

	/**
	 * The '<em><b>TOMCAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOMCAT_VALUE
	 * @generated
	 * @ordered
	 */
	TOMCAT(1, "TOMCAT", "TOMCAT");

	/**
	 * The '<em><b>COMMAND LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMAND LINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAND_LINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_LINE_VALUE = 0;

	/**
	 * The '<em><b>TOMCAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOMCAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOMCAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOMCAT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Package Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackageType[] VALUES_ARRAY =
		new PackageType[] {
			COMMAND_LINE,
			TOMCAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PackageType get(int value) {
		switch (value) {
			case COMMAND_LINE_VALUE: return COMMAND_LINE;
			case TOMCAT_VALUE: return TOMCAT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PackageType
