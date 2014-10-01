package com.vmstate.sampleinterface;
/**
 * @author Rajesh Abraham
 */
public class Driver 
{
	public static void main (String [] args)
	{
		// Creating new object of HondaAccord, here type is Vehicle(that is an interface)
		
		Vehicle myVehicle= new HondaAccord();
		
		// By creating another object of Mercedes300 in the main class  accelerate() method can invoke 
		// in the same manner of HondaAccord class
		//Vehicle myVehicle = new Mercedes300();
		
		// myVehicle.accelerate() method invoke the accelerate method of HondaAccord class
		myVehicle.accelerate();
	}
}
