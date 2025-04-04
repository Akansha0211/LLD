package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;

public class EmailNotifierToCustomer {

	public void sendEmailConfirmation(String name , String customerEmail) {
		System.out.println("Email sent to:" + customerEmail);
		// add actual email sending logic..
	}
}
