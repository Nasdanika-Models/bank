/**
 */
package org.nasdanika.models.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bank.BankPackage;
import org.nasdanika.models.bank.OnlineSession;
import org.nasdanika.models.bank.OnlineTransaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OnlineTransactionImpl extends TransactionImpl<OnlineSession> implements OnlineTransaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.ONLINE_TRANSACTION;
	}

} //OnlineTransactionImpl
