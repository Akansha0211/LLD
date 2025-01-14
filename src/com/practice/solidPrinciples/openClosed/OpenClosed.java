package com.practice.solidPrinciples.openClosed;

public class OpenClosed {

	public static void main(String[] args) {
		Marker marker = new Marker("Red marker", "red", 2025, 50);
		Invoice invoice = new Invoice(marker, 5);
		int total = invoice.calculateTotal();
		System.out.println(total);
		FileInvoiceDao fidao = new FileInvoiceDao();
		fidao.save(invoice);
		
		DatabaseInvoiceDao didao = new DatabaseInvoiceDao(invoice);
		didao.save(invoice); // could have removed argument from implementation in class DatabaseInvoiceDao
	}
}
