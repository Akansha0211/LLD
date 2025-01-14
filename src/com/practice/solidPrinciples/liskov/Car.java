package com.practice.solidPrinciples.liskov;

public class Car extends EngineVehicle{

	@Override
	public Integer getNumberOfWheels() {
		return 4;
	}
}
