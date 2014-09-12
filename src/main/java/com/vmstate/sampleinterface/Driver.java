package com.vmstate.sampleinterface;
/**
 * 
 * @author Rajesh Abraham
 *
 */
public class Driver 
{
	public static void main (String [] args)
	{
		//Vehicle myVehicle= new HondaAccord();
		Vehicle myVehicle = new Mercedes300();
		myVehicle.accelerate();
	}
}
