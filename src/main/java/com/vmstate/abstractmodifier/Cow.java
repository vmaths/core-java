package com.vmstate.abstractmodifier;
/**
 * This example demonstrates subclass of the animal class
 * Cow class extends from animal class it should include all the methods from animal class with out abstract key word
 * 
 * @author Rajesh Abraham
 *
 */

public class Cow extends Animal 
{

	public void name()
	{
		System.out.println("I am a Cow");
	}
	
	public void eat()
	{
		System.out.println("naomnom");
	}
	
	public void sleep()
	{
		System.out.println("ZZZZZZZZZ");
	}
}
