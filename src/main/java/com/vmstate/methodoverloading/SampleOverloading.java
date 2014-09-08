package com.vmstate.methodoverloading;/*Overloading is two methods that have the same name, 
										 provided they have different method parameters */

public class SampleOverloading 
{
	public static void main (String[] args)
	{
		Addition.add(3, 4);
		Addition.add("My Name is ", " Peter Jones");
		Addition.add(456.23, 569.236);
	}
}
