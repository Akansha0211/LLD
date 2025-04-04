package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;
/*

You're building a simple backend service for a car service center. You are given a class that does multiple things:

java
Copy
Edit
public class CarService {
    public void bookService(String carModel) {
        // logic to book a service
    }

    public void generateInvoice(String carModel) {
        // logic to calculate price and generate invoice
    }

    public void sendEmailConfirmation(String customerEmail) {
        // logic to send email to customer
    }
}
🧠 Your Task:
Refactor this code to follow the Single Responsibility Principle.

Each class should be responsible for only one reason to change.

You'll likely end up with multiple classes like:

ServiceBooking

InvoiceGenerator

EmailNotifier

Each one responsible for a single thing, instead of one monolithic class doing it all.

 */
public class Car{

    private final String model;
    private final String registrationNumber;
    private final int year;

    public Car(String model, String registrationNumber, int year){
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.year = year;
    }

    public String getModel(){
        return model;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public int getYear(){
        return year;
    }
}