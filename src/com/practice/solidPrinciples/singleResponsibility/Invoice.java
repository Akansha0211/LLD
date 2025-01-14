package com.practice.solidPrinciples.singleResponsibility;

public class Invoice {

	// has -a
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int qty) {
		this.marker = marker;
		this.quantity = qty;
	}
	public int calculateTotal() {
		int price = ((marker.price) * this.quantity);
		return price;
	}
}
