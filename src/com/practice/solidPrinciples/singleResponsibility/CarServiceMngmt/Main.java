package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Toyota Camry", "KA01AB1234", 2020);
		Customer customer = new Customer("Akansha", "akansha.saxena0211@gmail.com");
		CarServiceManager manager = new CarServiceManager();
		manager.handleCarService(car, customer.getName(), customer.getEmailId());

	}

}
