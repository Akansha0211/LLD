package com.practice.solidPrinciples.openClosed;

public class FileInvoiceDao implements InvoiceDao{

	@Override
	public void save(Invoice invoice) {
		System.out.println("saves to file");
	}
}
