/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceInstance;
import eu.chorevolution.modelingnotations.ee.deployment.LegacyServiceSpec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl#getServiceSpec <em>Service Spec</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.LegacyServiceInstanceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegacyServiceInstanceImpl extends MinimalEObjectImpl.Container implements LegacyServiceInstance {
	/**
	 * The cached value of the '{@link #getServiceSpec() <em>Service Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSpec()
	 * @generated
	 * @ordered
	 */
	protected LegacyServiceSpec serviceSpec;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.LEGACY_SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyServiceSpec getServiceSpec() {
		if (serviceSpec != null && serviceSpec.eIsProxy()) {
			InternalEObject oldServiceSpec = (InternalEObject)serviceSpec;
			serviceSpec = (LegacyServiceSpec)eResolveProxy(oldServiceSpec);
			if (serviceSpec != oldServiceSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC, oldServiceSpec, serviceSpec));
			}
		}
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyServiceSpec basicGetServiceSpec() {
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceSpec(LegacyServiceSpec newServiceSpec) {
		LegacyServiceSpec oldServiceSpec = serviceSpec;
		serviceSpec = newServiceSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC, oldServiceSpec, serviceSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.LEGACY_SERVICE_INSTANCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC:
				if (resolve) return getServiceSpec();
				return basicGetServiceSpec();
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC:
				setServiceSpec((LegacyServiceSpec)newValue);
				return;
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__URI:
				setUri((String)newValue);
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
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC:
				setServiceSpec((LegacyServiceSpec)null);
				return;
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__URI:
				setUri(URI_EDEFAULT);
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
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__SERVICE_SPEC:
				return serviceSpec != null;
			case DeploymentPackage.LEGACY_SERVICE_INSTANCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //LegacyServiceInstanceImpl
