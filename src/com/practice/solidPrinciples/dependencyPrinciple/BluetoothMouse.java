package com.practice.solidPrinciples.dependencyPrinciple;

public class BluetoothMouse implements Mouse {

	@Override
	public void mouseType() {
		System.out.println("bluetooth mouse");
	}

}
