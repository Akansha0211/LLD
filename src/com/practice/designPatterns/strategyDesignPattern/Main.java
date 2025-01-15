package com.practice.designPatterns.strategyDesignPattern;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new GoodsVehicle();
		vehicle.drive();
		
//		Vehicle vehicle = new Vehicle(new NormalDriveStrategy());
//		vehicle.drive();
	}

}
