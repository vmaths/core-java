package com.vmstate.sampleinterface;
/**
 * All the methods of interface are abstract and should be overridden in subclasses
 * 
 * @author Rajesh Abraham
 *
 */

public class Mercedes300 implements Vehicle 
{
	// As per rule Mercedes300 class implements all the methods of vehicle interface
	@Override
	public void accelerate() 
	{
		
		System.out.println("Accelerate Mercedes 300 ");
	}

	@Override
	public void brake() 
	{
		

	}

	@Override
	public void steering() 
	{
		

	}

}
