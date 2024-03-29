/**
 */
package org.nasdanika.models.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bank.BankPackage;
import org.nasdanika.models.bank.Banker;
import org.nasdanika.models.bank.BankerTransaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Banker Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BankerTransactionImpl extends TransactionImpl<Banker> implements BankerTransaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankerTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.BANKER_TRANSACTION;
	}

} //BankerTransactionImpl
