package org.nasdanika.models.bank.processors.ecore;

import org.nasdanika.common.Context;
import org.nasdanika.models.bank.BankPackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = BankPackage.eNS_URI)
public class EcoreGenBankProcessorsFactory {

	private Context context;
	
	public EcoreGenBankProcessorsFactory(Context context) {
		this.context = context;
	}
	
}
