package com.practice.solidPrinciples.dependencyPrinciple;

public class WiredMouse implements Mouse{

	@Override
	public void mouseType() {
		System.out.println("wired mouse");
	}
	
	
}
