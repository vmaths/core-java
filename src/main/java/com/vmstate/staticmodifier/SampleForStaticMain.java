package com.vmstate.staticmodifier;
/**
 * This example illustrates the usage of static modifier 
 * @author Rajesh Abraham
 */
public class SampleForStaticMain 
{
	public static void main(String[] args)
	{
		Box b1 = new Box("USPS");
		Box b2 = new Box("FeDex");
		Box b3 = new Box("UPS");
		
		b1.printName();
		b2.printName();
		b3.printName();
		
		Box.printNumberOfBoxes();
		//The static method printNumberOfBoxes() from the type Box should be accessed in a static way
		b2.printNumberOfBoxes();
		b3.printNumberOfBoxes();
	}
}
