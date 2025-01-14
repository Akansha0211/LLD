package com.practice.solidPrinciples.openClosed;



public class DatabaseInvoiceDao implements InvoiceDao{

	Invoice invoice;
	public DatabaseInvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
//	public void saveToDB() {
//		System.out.println("saves to database");
//	}
//	public void saveToFile(String fileName) {
//		System.out.println("saves to file");
//	}
	@Override
	public void save(Invoice invoice) {
		System.out.println("saves to Database");
	}	
}
