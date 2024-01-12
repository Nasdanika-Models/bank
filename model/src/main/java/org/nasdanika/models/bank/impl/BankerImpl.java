/**
 */
package org.nasdanika.models.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bank.BankPackage;
import org.nasdanika.models.bank.Banker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Banker</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BankerImpl extends PartyImpl implements Banker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.BANKER;
	}

} //BankerImpl
