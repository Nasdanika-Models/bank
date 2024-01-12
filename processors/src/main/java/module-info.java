module org.nasdanika.models.bank.processors {
		
	requires transitive org.nasdanika.models.bank;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.bank.processors.ecore;
	opens org.nasdanika.models.bank.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.bank.processors.doc;
	opens org.nasdanika.models.bank.processors.doc; // For loading resources
	
}
