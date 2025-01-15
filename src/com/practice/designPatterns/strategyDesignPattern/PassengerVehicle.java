package com.practice.designPatterns.strategyDesignPattern;

public class PassengerVehicle extends Vehicle{

	PassengerVehicle() {
		super(new NormalDriveStrategy());
		
	}

}
