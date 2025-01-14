package com.practice.solidPrinciples.singleResponsibility;

public class SingleResponsibility {
	public static void main(String[] args) {
		Marker marker = new Marker("Whiteboard Marker", "Blue", 2023, 10);
		Invoice invoice = new Invoice(marker, 2);
		int total = invoice.calculateTotal();
		System.out.println("Total Price:" + total);
		
		InvoiceDao invoiceDao = new InvoiceDao(invoice);
		invoiceDao.saveToDB();
		
		InvoicePrinter invoicePrint = new InvoicePrinter(invoice);
		invoicePrint.printInvoice();
	}
}
