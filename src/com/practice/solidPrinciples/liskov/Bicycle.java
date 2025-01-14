package com.practice.solidPrinciples.liskov;

public class Bicycle implements Bike {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("there is no engine");		
	}
	@Override
	public void accelerate() {
		System.out.println("pedal speed increased");
	}	
}
