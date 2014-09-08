package com.vmstate.abstractmodifier;

public abstract class Animal  // Is this class is an abstract class , we cannot remove the "abstract" key word from this class
{
	public void name()
	{
		System.out.println("My name is.............");
	}
	
	public abstract void eat();  // abstract method does not need body
	public abstract void sleep();
}
