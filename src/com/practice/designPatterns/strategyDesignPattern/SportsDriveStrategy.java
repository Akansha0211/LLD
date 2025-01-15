package com.practice.designPatterns.strategyDesignPattern;

public class SportsDriveStrategy implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Sports Drive Capability");
	}
}
