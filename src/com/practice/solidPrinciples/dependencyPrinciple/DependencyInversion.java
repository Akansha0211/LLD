package com.practice.solidPrinciples.dependencyPrinciple;

public class DependencyInversion {

	public static void main(String[] args) {
		WiredKeyboard keyboard = new WiredKeyboard();
		WiredMouse mouse = new WiredMouse();
		MacBook mac = new MacBook(keyboard, mouse);
		
		mac.getMouseType();
		
	}

}
