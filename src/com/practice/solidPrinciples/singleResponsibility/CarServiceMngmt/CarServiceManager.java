package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;

public class CarServiceManager {
	
	private final ServiceBooking booking;
	private final InvoiceGenerator invoice;
	private final EmailNotifierToCustomer emailNotification;
	
	public CarServiceManager() {
		this.booking = new ServiceBooking(); // create non-static methods in this class and access them using this object
		this.invoice = new InvoiceGenerator();
		this.emailNotification = new EmailNotifierToCustomer();		
	}
	public void handleCarService(Car car ,String name, String customerEmail) {
		booking.bookingCarService(car);
		invoice.generateInvoice(car);
		emailNotification.sendEmailConfirmation(name, customerEmail);		
	}
}
