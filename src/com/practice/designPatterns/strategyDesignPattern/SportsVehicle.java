package com.practice.designPatterns.strategyDesignPattern;

public class SportsVehicle extends Vehicle {

	SportsVehicle() {
		super(new SportsDriveStrategy());
	}	
}
