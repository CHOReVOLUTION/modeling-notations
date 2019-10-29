/**
 * Copyright 2015 The CHOReVOLUTION project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.chorevolution.modelingnotations.chorarch.impl;

import eu.chorevolution.modelingnotations.chorarch.ChorArchModel;
import eu.chorevolution.modelingnotations.chorarch.ChorarchPackage;
import eu.chorevolution.modelingnotations.chorarch.Component;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chor Arch Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl#getChoreographyID <em>Choreography ID</em>}</li>
 *   <li>{@link eu.chorevolution.modelingnotations.chorarch.impl.ChorArchModelImpl#getChoreographyName <em>Choreography Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChorArchModelImpl extends MinimalEObjectImpl.Container implements ChorArchModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2015 The CHOReVOLUTION project\r\n\r\nLicensed under the Apache License, Version 2.0 (the \"License\");\r\nyou may not use this file except in compliance with the License.\r\nYou may obtain a copy of the License at\r\n\r\n      http://www.apache.org/licenses/LICENSE-2.0\r\n\r\nUnless required by applicable law or agreed to in writing, software\r\ndistributed under the License is distributed on an \"AS IS\" BASIS,\r\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\nSee the License for the specific language governing permissions and\r\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The default value of the '{@link #getChoreographyID() <em>Choreography ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOREOGRAPHY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoreographyID() <em>Choreography ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyID()
	 * @generated
	 * @ordered
	 */
	protected String choreographyID = CHOREOGRAPHY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChoreographyName() <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOREOGRAPHY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoreographyName() <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyName()
	 * @generated
	 * @ordered
	 */
	protected String choreographyName = CHOREOGRAPHY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChorArchModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChorarchPackage.Literals.CHOR_ARCH_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoreographyID() {
		return choreographyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyID(String newChoreographyID) {
		String oldChoreographyID = choreographyID;
		choreographyID = newChoreographyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_ID, oldChoreographyID, choreographyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoreographyName() {
		return choreographyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyName(String newChoreographyName) {
		String oldChoreographyName = choreographyName;
		choreographyName = newChoreographyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME, oldChoreographyName, choreographyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS:
				return getComponents();
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_ID:
				return getChoreographyID();
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME:
				return getChoreographyName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_ID:
				setChoreographyID((String)newValue);
				return;
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME:
				setChoreographyName((String)newValue);
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
			case ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS:
				getComponents().clear();
				return;
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_ID:
				setChoreographyID(CHOREOGRAPHY_ID_EDEFAULT);
				return;
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME:
				setChoreographyName(CHOREOGRAPHY_NAME_EDEFAULT);
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
			case ChorarchPackage.CHOR_ARCH_MODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_ID:
				return CHOREOGRAPHY_ID_EDEFAULT == null ? choreographyID != null : !CHOREOGRAPHY_ID_EDEFAULT.equals(choreographyID);
			case ChorarchPackage.CHOR_ARCH_MODEL__CHOREOGRAPHY_NAME:
				return CHOREOGRAPHY_NAME_EDEFAULT == null ? choreographyName != null : !CHOREOGRAPHY_NAME_EDEFAULT.equals(choreographyName);
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
		result.append(" (choreographyID: ");
		result.append(choreographyID);
		result.append(", choreographyName: ");
		result.append(choreographyName);
		result.append(')');
		return result.toString();
	}

} //ChorArchModelImpl
