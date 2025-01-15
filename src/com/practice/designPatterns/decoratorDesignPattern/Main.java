package com.practice.designPatterns.decoratorDesignPattern;

public class Main {
	public static void main(String[] args) {
		// Margherita + Extra cheese + mushroom
		
		BasePizza pizza= new Mushroom(new ExtraCheese(new Margherita()));
		System.out.println(pizza.cost()); // 125
		
	}
}
