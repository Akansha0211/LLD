package com.practice.solidPrinciples.singleResponsibility;

public class InvoicePrinter {
	
	Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	public void printInvoice() {
		System.out.println("prints invoice");
	}
}
