package com.practice.solidPrinciples.dependencyPrinciple;

public class MacBook {
	private final Keyboard keyboard;
	private final Mouse mouse;
	
	// assigned using constructor injection
	public MacBook(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}	
	
	public void getMouseType() {
		mouse.mouseType();
	}
}
