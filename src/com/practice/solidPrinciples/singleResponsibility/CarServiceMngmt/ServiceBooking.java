package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;
public class ServiceBooking{
	
    public void bookingCarService(Car car) {
    	System.out.println("Service booked for:" + car.getModel() + ", Reg: " + car.getRegistrationNumber());
    }
}