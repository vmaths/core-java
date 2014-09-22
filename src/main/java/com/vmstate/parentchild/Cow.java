package com.vmstate.parentchild;
/**
 * This example demonstrates subclass of the animal class
 * Cow class extends from animal class it should include all the methods from animal class 
 * with out abstract key word
 * 
 * @author Rajesh Abraham
 *
 */

public class Cow extends Animal 
{

	// eat() method is defined as abstract in Animal class
	public void eat()
	{
		System.out.println("eat() method in concrete (Cow) class. Eating ...naomnom...");
	}
	
	// Sleep() method is defined as concrete method in Animal class
	public void sleep()
	{
		System.out.println("sleep() method in concrete (Cow) class. Sleeping ...ZZZ...");
	}
	
	public void doMilk()
	{
		System.out.println("doMilk() method. I can give milk");
	}
}
