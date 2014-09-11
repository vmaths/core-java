package com.vmstate.staticmodifier;
/**
 * This class illustrates variable declarations and methods for main class
 * 
 * @author Rajesh Abraham
 *
 */

public class Box 
{
	public String name;
	public static int numberOfBoxes = 0;
	public Box(String n)
	{
		name=n;
		numberOfBoxes++;
	}
	
	public void printName()
	{
		System.out.println("My Name Is : " + name);
	}
	
	public static void printNumberOfBoxes()
	{
		System.out.println(" The Total Number Of Boxes : " + numberOfBoxes);
	}
}
