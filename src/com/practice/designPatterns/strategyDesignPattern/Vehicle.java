package com.practice.designPatterns.strategyDesignPattern;

public class Vehicle {

	DriveStrategy driveObject;
	// dependency injection(done in constructor)
	Vehicle(DriveStrategy driveObj){
		this.driveObject = driveObj;
	}
	
	public void drive() {
		driveObject.drive();
	}
}
