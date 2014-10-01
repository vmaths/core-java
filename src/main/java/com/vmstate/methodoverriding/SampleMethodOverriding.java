package com.vmstate.methodoverriding;
/**
 * Overriding where a subclass method provides a implementation of a method with the same method parameters
 * @author Rajesh Abraham
 */
public class SampleMethodOverriding 
{

	public static void main(String[] args)
	{
		Cycle cycle = new Cycle();
		cycle.printinfo();
		Bicycle bicycle= new Bicycle();
		//System.out.println(bicycle.weight);
		//System.out.println(bicycle.brand);
		bicycle.printinfo();
	}
}