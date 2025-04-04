package com.practice.solidPrinciples.singleResponsibility.CarServiceMngmt;

public class Customer {

	private final String name;
	private final String emailId;
	
	public Customer(String name, String emailId) {
		this.name= name;
		this.emailId = emailId;
	}
	public String getName() {
		return name;		
	}
	public String getEmailId() {
		return emailId;
	}	
	
	// Private Final 
	/*
	 * 

* ✅ 1. private – Access Modifier
Limits access to the field only within the class.

No other class (not even subclasses or same-package classes) can directly access it.

Promotes encapsulation – one of the key OOP principles.

class Car {
    private String model;

    public String getModel() {
        return model;  // this is the only way to access `model` outside
    }
}

✅ 2. final – Immutability Modifier
Once the variable is assigned, it cannot be changed.

For primitive types, the value is fixed.

For objects, the reference is fixed (you can't assign a new object),
 but internal fields can still change unless those are also immutable.
 
 public class Car {
    private final String model;

    public Car(String model) {
        this.model = model;  // allowed: first assignment
    }

    public void setModel(String model) {
        this.model = model;  // ❌ compile-time error: cannot assign a value to final variable
    }
}

 

 So private final together means:
Only this class can access the field.

It can be assigned only once, typically in the constructor.

The field becomes effectively read-only from outside.
*
*/
}
