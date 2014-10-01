package com.vmstate.sampleinterface;
/**
 * All the methods of interface are abstract and should be overridden in subclasses
 * @author Rajesh Abraham
 */
public class HondaAccord implements Vehicle 
{
	// As per rule HondaAccord class implements all the methods of vehicle interface
	@Override
	public void accelerate() 
	{
		System.out.println("Accelerate Honda Accord");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub

	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub

	}

}
