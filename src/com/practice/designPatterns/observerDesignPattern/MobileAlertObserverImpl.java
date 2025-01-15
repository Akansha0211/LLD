package com.practice.designPatterns.observerDesignPattern;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

	String userName;
	StockObservable observable;
	
	public MobileAlertObserverImpl(String userName, StockObservable observable) {
		this.observable = observable;
		this.userName = userName;
	}

	@Override
	public void update() {
		sendMesageOnMobile(userName,"product is in stock hurry up!");
	}
	private void sendMesageOnMobile(String userName, String msg) {
		System.out.println("msg sent to :"+ userName);
	}
	
	
}
