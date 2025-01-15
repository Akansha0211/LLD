package com.practice.designPatterns.strategyDesignPattern;

public class GoodsVehicle extends Vehicle{

//	GoodsVehicle(DriveStrategy driveObj) {
//		super(driveObj);
//	}

	GoodsVehicle() {
		super(new NormalDriveStrategy() );
	}	
}
