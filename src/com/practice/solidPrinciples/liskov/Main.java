package com.practice.solidPrinciples.liskov;

public class Main {
	public static void main(String[] args) {
		
		Bike obj = new MotorCycle();
		obj.turnOnEngine();
		
		Bike obj1 = new Bicycle(); // giving object of Bicycle breaks teh functionility
		obj1.turnOnEngine();
	}
}
