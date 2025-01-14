package com.practice.solidPrinciples.interfaceSegmented;

public class Waiter implements WaiterInterface{

	@Override
	public void serveCustomers() {
		System.out.println("Servingthe customers");
	}

	@Override
	public void takeOrder() {
		System.out.println("Taking orders");
	}	
}
