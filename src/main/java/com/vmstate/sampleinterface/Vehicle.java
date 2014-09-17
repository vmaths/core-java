package com.vmstate.sampleinterface;
/**
 * Interface is a contract between class and the outside world
 * interface does not have any method implementation
 * Interface may contain only static final variables
 * All methods in an interface are public and abstract
 * Can not contain a constructor as interfaces can not be instantiated
 * Interfaces can extend other interfaces
 * A class can implement any number of interfaces
 * A class that implements an interface has an is-a relationship with that data type
 * By default all the fields in interface are public and static
 * 
 * 
 * @author Rajesh Abraham
 *
 */

public interface Vehicle 
{
	public void accelerate();// method does not have a body 
	public void brake();
	public void steering();
}
