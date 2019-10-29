/**
 */
package eu.chorevolution.modelingnotations.ee.deployment.impl;

import eu.chorevolution.modelingnotations.ee.deployment.DeploymentPackage;
import eu.chorevolution.modelingnotations.ee.deployment.ResourceImpact;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl#getCpuImpact <em>Cpu Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl#getRamImpact <em>Ram Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl#getDiskSpeedImpact <em>Disk Speed Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl#getDiskCapacityImpact <em>Disk Capacity Impact</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.ee.deployment.impl.ResourceImpactImpl#getNetworkingImpact <em>Networking Impact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpactImpl extends MinimalEObjectImpl.Container implements ResourceImpact {
	/**
	 * The default value of the '{@link #getCpuImpact() <em>Cpu Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_IMPACT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCpuImpact() <em>Cpu Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuImpact()
	 * @generated
	 * @ordered
	 */
	protected int cpuImpact = CPU_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamImpact() <em>Ram Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_IMPACT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRamImpact() <em>Ram Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamImpact()
	 * @generated
	 * @ordered
	 */
	protected int ramImpact = RAM_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskSpeedImpact() <em>Disk Speed Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpeedImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_SPEED_IMPACT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDiskSpeedImpact() <em>Disk Speed Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskSpeedImpact()
	 * @generated
	 * @ordered
	 */
	protected int diskSpeedImpact = DISK_SPEED_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskCapacityImpact() <em>Disk Capacity Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskCapacityImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int DISK_CAPACITY_IMPACT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDiskCapacityImpact() <em>Disk Capacity Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskCapacityImpact()
	 * @generated
	 * @ordered
	 */
	protected int diskCapacityImpact = DISK_CAPACITY_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkingImpact() <em>Networking Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingImpact()
	 * @generated
	 * @ordered
	 */
	protected static final int NETWORKING_IMPACT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNetworkingImpact() <em>Networking Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingImpact()
	 * @generated
	 * @ordered
	 */
	protected int networkingImpact = NETWORKING_IMPACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.RESOURCE_IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuImpact() {
		return cpuImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuImpact(int newCpuImpact) {
		int oldCpuImpact = cpuImpact;
		cpuImpact = newCpuImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.RESOURCE_IMPACT__CPU_IMPACT, oldCpuImpact, cpuImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRamImpact() {
		return ramImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamImpact(int newRamImpact) {
		int oldRamImpact = ramImpact;
		ramImpact = newRamImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.RESOURCE_IMPACT__RAM_IMPACT, oldRamImpact, ramImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiskSpeedImpact() {
		return diskSpeedImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskSpeedImpact(int newDiskSpeedImpact) {
		int oldDiskSpeedImpact = diskSpeedImpact;
		diskSpeedImpact = newDiskSpeedImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.RESOURCE_IMPACT__DISK_SPEED_IMPACT, oldDiskSpeedImpact, diskSpeedImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiskCapacityImpact() {
		return diskCapacityImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskCapacityImpact(int newDiskCapacityImpact) {
		int oldDiskCapacityImpact = diskCapacityImpact;
		diskCapacityImpact = newDiskCapacityImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.RESOURCE_IMPACT__DISK_CAPACITY_IMPACT, oldDiskCapacityImpact, diskCapacityImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNetworkingImpact() {
		return networkingImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkingImpact(int newNetworkingImpact) {
		int oldNetworkingImpact = networkingImpact;
		networkingImpact = newNetworkingImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.RESOURCE_IMPACT__NETWORKING_IMPACT, oldNetworkingImpact, networkingImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.RESOURCE_IMPACT__CPU_IMPACT:
				return getCpuImpact();
			case DeploymentPackage.RESOURCE_IMPACT__RAM_IMPACT:
				return getRamImpact();
			case DeploymentPackage.RESOURCE_IMPACT__DISK_SPEED_IMPACT:
				return getDiskSpeedImpact();
			case DeploymentPackage.RESOURCE_IMPACT__DISK_CAPACITY_IMPACT:
				return getDiskCapacityImpact();
			case DeploymentPackage.RESOURCE_IMPACT__NETWORKING_IMPACT:
				return getNetworkingImpact();
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
			case DeploymentPackage.RESOURCE_IMPACT__CPU_IMPACT:
				setCpuImpact((Integer)newValue);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__RAM_IMPACT:
				setRamImpact((Integer)newValue);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_SPEED_IMPACT:
				setDiskSpeedImpact((Integer)newValue);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_CAPACITY_IMPACT:
				setDiskCapacityImpact((Integer)newValue);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__NETWORKING_IMPACT:
				setNetworkingImpact((Integer)newValue);
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
			case DeploymentPackage.RESOURCE_IMPACT__CPU_IMPACT:
				setCpuImpact(CPU_IMPACT_EDEFAULT);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__RAM_IMPACT:
				setRamImpact(RAM_IMPACT_EDEFAULT);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_SPEED_IMPACT:
				setDiskSpeedImpact(DISK_SPEED_IMPACT_EDEFAULT);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_CAPACITY_IMPACT:
				setDiskCapacityImpact(DISK_CAPACITY_IMPACT_EDEFAULT);
				return;
			case DeploymentPackage.RESOURCE_IMPACT__NETWORKING_IMPACT:
				setNetworkingImpact(NETWORKING_IMPACT_EDEFAULT);
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
			case DeploymentPackage.RESOURCE_IMPACT__CPU_IMPACT:
				return cpuImpact != CPU_IMPACT_EDEFAULT;
			case DeploymentPackage.RESOURCE_IMPACT__RAM_IMPACT:
				return ramImpact != RAM_IMPACT_EDEFAULT;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_SPEED_IMPACT:
				return diskSpeedImpact != DISK_SPEED_IMPACT_EDEFAULT;
			case DeploymentPackage.RESOURCE_IMPACT__DISK_CAPACITY_IMPACT:
				return diskCapacityImpact != DISK_CAPACITY_IMPACT_EDEFAULT;
			case DeploymentPackage.RESOURCE_IMPACT__NETWORKING_IMPACT:
				return networkingImpact != NETWORKING_IMPACT_EDEFAULT;
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
		result.append(" (cpuImpact: ");
		result.append(cpuImpact);
		result.append(", ramImpact: ");
		result.append(ramImpact);
		result.append(", diskSpeedImpact: ");
		result.append(diskSpeedImpact);
		result.append(", diskCapacityImpact: ");
		result.append(diskCapacityImpact);
		result.append(", networkingImpact: ");
		result.append(networkingImpact);
		result.append(')');
		return result.toString();
	}

} //ResourceImpactImpl
