package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;

public class InvoiceGenerator{
	public void generateInvoice(Car car) {
		System.out.println("Invoice generated for: " + car.getModel() + ", year: " + car.getYear());;
	}
}