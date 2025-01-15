package com.practice.designPatterns.observerDesignPattern;

public class Store {

	public static void main(String[] args) {
		StockObservable iphoneObservable = new IphoneObservableImpl();
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneObservable);
		
		iphoneObservable.add(observer1);
		iphoneObservable.add(observer2);
		iphoneObservable.add(observer3);
		
		iphoneObservable.setStockCount(10); // out of stock to available
		iphoneObservable.setStockCount(10); // nothing happens 
	}

}
