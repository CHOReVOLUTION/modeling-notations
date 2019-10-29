/**
 * Copyright Text    
 *  Copyright 2015 The CHOReVOLUTION project
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.chorevolution.modelingnotations.gidl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.chorevolution.modelingnotations.gidl.GidlPackage#getProtocolTypes()
 * @model
 * @generated
 */
public enum ProtocolTypes implements Enumerator {
	/**
	 * The '<em><b>REST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REST_VALUE
	 * @generated
	 * @ordered
	 */
	REST(0, "REST", "REST"),

	/**
	 * The '<em><b>SOAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOAP_VALUE
	 * @generated
	 * @ordered
	 */
	SOAP(1, "SOAP", "SOAP"),

	/**
	 * The '<em><b>Co AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_AP(2, "CoAP", "CoAP"),

	/**
	 * The '<em><b>MQTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(3, "MQTT", "MQTT"),

	/**
	 * The '<em><b>AMQP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMQP_VALUE
	 * @generated
	 * @ordered
	 */
	AMQP(4, "AMQP", "AMQP"),

	/**
	 * The '<em><b>DDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DDS_VALUE
	 * @generated
	 * @ordered
	 */
	DDS(5, "DDS", "DDS"),

	/**
	 * The '<em><b>Semi Space</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_SPACE(6, "SemiSpace", "SemiSpace"),

	/**
	 * The '<em><b>Zero MQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_MQ_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_MQ(7, "ZeroMQ", "ZeroMQ"),

	/**
	 * The '<em><b>Web Sockets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SOCKETS_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SOCKETS(8, "WebSockets", "WebSockets"),

	/**
	 * The '<em><b>DPWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPWS_VALUE
	 * @generated
	 * @ordered
	 */
	DPWS(9, "DPWS", "DPWS"),

	/**
	 * The '<em><b>XMPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMPP_VALUE
	 * @generated
	 * @ordered
	 */
	XMPP(10, "XMPP", "XMPP");

	/**
	 * The '<em><b>REST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REST_VALUE = 0;

	/**
	 * The '<em><b>SOAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOAP_VALUE = 1;

	/**
	 * The '<em><b>Co AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Co AP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO_AP
	 * @model name="CoAP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_AP_VALUE = 2;

	/**
	 * The '<em><b>MQTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MQTT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 3;

	/**
	 * The '<em><b>AMQP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMQP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMQP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMQP_VALUE = 4;

	/**
	 * The '<em><b>DDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DDS_VALUE = 5;

	/**
	 * The '<em><b>Semi Space</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semi Space</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMI_SPACE
	 * @model name="SemiSpace"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_SPACE_VALUE = 6;

	/**
	 * The '<em><b>Zero MQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zero MQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO_MQ
	 * @model name="ZeroMQ"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_MQ_VALUE = 7;

	/**
	 * The '<em><b>Web Sockets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web Sockets</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_SOCKETS
	 * @model name="WebSockets"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SOCKETS_VALUE = 8;

	/**
	 * The '<em><b>DPWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPWS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPWS_VALUE = 9;

	/**
	 * The '<em><b>XMPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMPP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMPP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XMPP_VALUE = 10;

	/**
	 * An array of all the '<em><b>Protocol Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolTypes[] VALUES_ARRAY =
		new ProtocolTypes[] {
			REST,
			SOAP,
			CO_AP,
			MQTT,
			AMQP,
			DDS,
			SEMI_SPACE,
			ZERO_MQ,
			WEB_SOCKETS,
			DPWS,
			XMPP,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolTypes get(int value) {
		switch (value) {
			case REST_VALUE: return REST;
			case SOAP_VALUE: return SOAP;
			case CO_AP_VALUE: return CO_AP;
			case MQTT_VALUE: return MQTT;
			case AMQP_VALUE: return AMQP;
			case DDS_VALUE: return DDS;
			case SEMI_SPACE_VALUE: return SEMI_SPACE;
			case ZERO_MQ_VALUE: return ZERO_MQ;
			case WEB_SOCKETS_VALUE: return WEB_SOCKETS;
			case DPWS_VALUE: return DPWS;
			case XMPP_VALUE: return XMPP;
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
	private ProtocolTypes(int value, String name, String literal) {
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
	
} //ProtocolTypes
