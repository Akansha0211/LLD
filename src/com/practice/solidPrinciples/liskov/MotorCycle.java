package com.practice.solidPrinciples.liskov;

public class MotorCycle implements Bike{

	boolean isEngineOn;
	int speed;
	
	public void turnOnEngine() {
		isEngineOn = true;
		System.out.println("Bike engine turned on");
	}
	public void accelerate() {
		speed = speed + 10;
	}
}
