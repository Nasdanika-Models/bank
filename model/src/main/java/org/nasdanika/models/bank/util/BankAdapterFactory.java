/**
 */
package org.nasdanika.models.bank.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.bank.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.bank.BankPackage
 * @generated
 */
public class BankAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BankPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BankPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankSwitch<Adapter> modelSwitch =
		new BankSwitch<Adapter>() {
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter caseContactMethod(ContactMethod object) {
				return createContactMethodAdapter();
			}
			@Override
			public Adapter caseEMail(EMail object) {
				return createEMailAdapter();
			}
			@Override
			public Adapter casePhone(Phone object) {
				return createPhoneAdapter();
			}
			@Override
			public Adapter casePostalAddress(PostalAddress object) {
				return createPostalAddressAdapter();
			}
			@Override
			public Adapter caseWebAddress(WebAddress object) {
				return createWebAddressAdapter();
			}
			@Override
			public Adapter caseBank(Bank object) {
				return createBankAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public <T extends TransactionInitiator> Adapter caseTransaction(Transaction<T> object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseTransactionInitiator(TransactionInitiator object) {
				return createTransactionInitiatorAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseMerchant(Merchant object) {
				return createMerchantAdapter();
			}
			@Override
			public Adapter casePointOfSale(PointOfSale object) {
				return createPointOfSaleAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseMobilePhone(MobilePhone object) {
				return createMobilePhoneAdapter();
			}
			@Override
			public Adapter caseCard(Card object) {
				return createCardAdapter();
			}
			@Override
			public Adapter caseDeviceTransaction(DeviceTransaction object) {
				return createDeviceTransactionAdapter();
			}
			@Override
			public Adapter caseCustomerAccount(CustomerAccount object) {
				return createCustomerAccountAdapter();
			}
			@Override
			public Adapter caseInternalAccount(InternalAccount object) {
				return createInternalAccountAdapter();
			}
			@Override
			public Adapter caseBanker(Banker object) {
				return createBankerAdapter();
			}
			@Override
			public Adapter caseBankerTransaction(BankerTransaction object) {
				return createBankerTransactionAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTokenTransaction(TokenTransaction object) {
				return createTokenTransactionAdapter();
			}
			@Override
			public Adapter caseOnlineSession(OnlineSession object) {
				return createOnlineSessionAdapter();
			}
			@Override
			public Adapter caseOnlineTransaction(OnlineTransaction object) {
				return createOnlineTransactionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.ContactMethod <em>Contact Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.ContactMethod
	 * @generated
	 */
	public Adapter createContactMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.EMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.EMail
	 * @generated
	 */
	public Adapter createEMailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Phone
	 * @generated
	 */
	public Adapter createPhoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.PostalAddress
	 * @generated
	 */
	public Adapter createPostalAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.WebAddress <em>Web Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.WebAddress
	 * @generated
	 */
	public Adapter createWebAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Bank
	 * @generated
	 */
	public Adapter createBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.TransactionInitiator <em>Transaction Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.TransactionInitiator
	 * @generated
	 */
	public Adapter createTransactionInitiatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Merchant <em>Merchant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Merchant
	 * @generated
	 */
	public Adapter createMerchantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.PointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.PointOfSale
	 * @generated
	 */
	public Adapter createPointOfSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.MobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.MobilePhone
	 * @generated
	 */
	public Adapter createMobilePhoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.DeviceTransaction <em>Device Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.DeviceTransaction
	 * @generated
	 */
	public Adapter createDeviceTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.CustomerAccount
	 * @generated
	 */
	public Adapter createCustomerAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.InternalAccount <em>Internal Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.InternalAccount
	 * @generated
	 */
	public Adapter createInternalAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Banker <em>Banker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Banker
	 * @generated
	 */
	public Adapter createBankerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.BankerTransaction <em>Banker Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.BankerTransaction
	 * @generated
	 */
	public Adapter createBankerTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.TokenTransaction <em>Token Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.TokenTransaction
	 * @generated
	 */
	public Adapter createTokenTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.OnlineSession <em>Online Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.OnlineSession
	 * @generated
	 */
	public Adapter createOnlineSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.bank.OnlineTransaction <em>Online Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.bank.OnlineTransaction
	 * @generated
	 */
	public Adapter createOnlineTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BankAdapterFactory
