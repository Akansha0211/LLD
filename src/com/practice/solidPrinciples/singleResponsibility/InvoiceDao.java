package com.practice.solidPrinciples.singleResponsibility;

public class InvoiceDao {

	Invoice invoice;
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	public void saveToDB() {
		System.out.println("saves to database");
	}
}
