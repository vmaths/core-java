package com.vmstate.parentchild;

/**
 * This example demonstrates simple usage of Abstract Modifier class 
 * Animal is an abstract class, if this class is an abstract class , the abstract key word  should be must
 *  
 * @author Rajesh Abraham
 */

public abstract class Animal {
	public void name() {
		System.out.println("name() method in abstract (Animal) class. My name is cow");
	}

	public abstract void eat(); // abstract method does not need body

	public void sleep() {
		System.out.println("sleep() method in abstract (Animal) class. Sleeping ...ZZZ...");
	}
}

