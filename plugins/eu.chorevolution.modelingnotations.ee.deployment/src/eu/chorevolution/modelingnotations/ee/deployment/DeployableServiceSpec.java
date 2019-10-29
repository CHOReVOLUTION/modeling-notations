/**
 */
package eu.chorevolution.modelingnotations.ee.deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployable Service Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getReplacementService <em>Replacement Service</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageUri <em>Package Uri</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPort <em>Port</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getCloudAccount <em>Cloud Account</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getResourceImpact <em>Resource Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#isHaDeployment <em>Ha Deployment</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getSyslogServerName <em>Syslog Server Name</em>}</li>
 * </ul>
 *
 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec()
 * @model
 * @generated
 */
public interface DeployableServiceSpec extends ServiceSpec {
	/**
	 * Returns the value of the '<em><b>Replacement Service</b></em>' reference list.
	 * The list contents are of type {@link eu.chorevolution.modelingnotations.ee.deployment.ServiceSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Service</em>' reference list.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_ReplacementService()
	 * @model
	 * @generated
	 */
	EList<ServiceSpec> getReplacementService();

	/**
	 * Returns the value of the '<em><b>Package Uri</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Uri</em>' attribute.
	 * @see #setPackageUri(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_PackageUri()
	 * @model default="" required="true"
	 * @generated
	 */
	String getPackageUri();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageUri <em>Package Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Uri</em>' attribute.
	 * @see #getPackageUri()
	 * @generated
	 */
	void setPackageUri(String value);

	/**
	 * Returns the value of the '<em><b>Package Type</b></em>' attribute.
	 * The default value is <code>"TOMCAT"</code>.
	 * The literals are from the enumeration {@link eu.chorevolution.modelingnotations.ee.deployment.PackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.PackageType
	 * @see #setPackageType(PackageType)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_PackageType()
	 * @model default="TOMCAT" required="true"
	 * @generated
	 */
	PackageType getPackageType();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPackageType <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Type</em>' attribute.
	 * @see eu.chorevolution.modelingnotations.ee.deployment.PackageType
	 * @see #getPackageType()
	 * @generated
	 */
	void setPackageType(PackageType value);

	/**
	 * Returns the value of the '<em><b>Endpoint Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Name</em>' attribute.
	 * @see #setEndpointName(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_EndpointName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getEndpointName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getEndpointName <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Name</em>' attribute.
	 * @see #getEndpointName()
	 * @generated
	 */
	void setEndpointName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_Port()
	 * @model default="1"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Cloud Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Account</em>' attribute.
	 * @see #setCloudAccount(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_CloudAccount()
	 * @model
	 * @generated
	 */
	String getCloudAccount();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getCloudAccount <em>Cloud Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Account</em>' attribute.
	 * @see #getCloudAccount()
	 * @generated
	 */
	void setCloudAccount(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' attribute.
	 * @see #setNumberOfInstances(int)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_NumberOfInstances()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNumberOfInstances();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' attribute.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(int value);

	/**
	 * Returns the value of the '<em><b>Resource Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Impact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Impact</em>' reference.
	 * @see #setResourceImpact(ResourceImpact)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_ResourceImpact()
	 * @model required="true"
	 * @generated
	 */
	ResourceImpact getResourceImpact();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getResourceImpact <em>Resource Impact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Impact</em>' reference.
	 * @see #getResourceImpact()
	 * @generated
	 */
	void setResourceImpact(ResourceImpact value);

	/**
	 * Returns the value of the '<em><b>Ha Deployment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ha Deployment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ha Deployment</em>' attribute.
	 * @see #setHaDeployment(boolean)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_HaDeployment()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHaDeployment();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#isHaDeployment <em>Ha Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ha Deployment</em>' attribute.
	 * @see #isHaDeployment()
	 * @generated
	 */
	void setHaDeployment(boolean value);

	/**
	 * Returns the value of the '<em><b>Syslog Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syslog Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syslog Server Name</em>' attribute.
	 * @see #setSyslogServerName(String)
	 * @see eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage#getDeployableServiceSpec_SyslogServerName()
	 * @model id="true"
	 * @generated
	 */
	String getSyslogServerName();

	/**
	 * Sets the value of the '{@link eu.chorevolution.modelingnotations.ee.deployment.DeployableServiceSpec#getSyslogServerName <em>Syslog Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syslog Server Name</em>' attribute.
	 * @see #getSyslogServerName()
	 * @generated
	 */
	void setSyslogServerName(String value);

} // DeployableServiceSpec
