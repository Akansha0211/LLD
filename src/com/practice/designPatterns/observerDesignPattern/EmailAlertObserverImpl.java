package com.practice.designPatterns.observerDesignPattern;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	String emailId;
	StockObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable) {
		this.observable = observable;
		this.emailId = emailId;
	}
	@Override
	public void update() {
		sendMail(emailId, "product is in stcok hurry up!");
	}
	private void sendMail(String emailId, String msg) {
		System.out.println("mail sent to :" + emailId);
	}

}
