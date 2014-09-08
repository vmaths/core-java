package com.vmstate.abstractmodifier;
/**
 * This example demonstrates simple usage of Abstract Modifier
 * class Animal is an abstract class
 * if  this class is an abstract class , we cannot remove the "abstract" key word from this class
 * abstract method does not need body
 *@author Rajesh Abraham
 */

public abstract class Animal  // if  this class is an abstract class , we cannot remove the "abstract" key word from this class
{
	public void name()
	{
		System.out.println("My name is.............");
	}
	
	public abstract void eat();  // abstract method does not need body
	public abstract void sleep();
}
