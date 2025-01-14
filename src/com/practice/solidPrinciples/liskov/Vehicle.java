package com.practice.solidPrinciples.liskov;

public class Vehicle {

	public Integer getNumberOfWheels() { // generic method common in all classes extending it
		return 2;
	}
}
