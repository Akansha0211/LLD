package com.practice.solidPrinciples.liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Vehicle> vehicleList = new ArrayList<>();
		
		vehicleList.add(new MotorCycle());
		vehicleList.add(new Car());
		vehicleList.add(new Bicycle()); // due to it we will get null poiner exception
		
		for(Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.getNumberOfWheels().toString());
		}
		for(Vehicle vehicle : vehicleList) {
			//System.out.println(vehicle.hasEngine()); won't be able to access hasEngine() method 
		}
		List<EngineVehicle> engineVehicleList = new ArrayList<>();
		engineVehicleList.add(new Car());
		engineVehicleList.add(new MotorCycle());
		//engineVehicleList.add(new Bicycle());  can't add it
		// so below code will not fail
		for(EngineVehicle list: engineVehicleList) {
			System.out.println(list.hasEngine());
		}
	}
}
