module org.nasdanika.models.bank {
	exports org.nasdanika.models.bank;
	exports org.nasdanika.models.bank.impl;
	exports org.nasdanika.models.bank.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
}