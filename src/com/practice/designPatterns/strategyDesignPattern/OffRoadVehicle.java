package com.practice.designPatterns.strategyDesignPattern;

public class OffRoadVehicle extends Vehicle {

//	OffRoadVehicle(DriveStrategy driveObj) {
//		super(driveObj);
//	}
	
	OffRoadVehicle(){
		super(new SportsDriveStrategy()); // passing object o
	}

}
