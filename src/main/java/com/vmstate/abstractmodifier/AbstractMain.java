package com.vmstate.abstractmodifier;
/**This example demonstrates main class for the Abstract Modifier
 * 
 *@author Rajesh Abraham
 */

public class AbstractMain 
{
	public static void main (String[] args)
	{

		// Animal a  = new Animal(); // since the Animal class is abstract, we can not create new instances of the animal class directly		
		Animal animalObj = new Cow();
		
		System.out.println("------------------------------------------------------------");		
		// name() method is defined only in abstract (Animal) class as abstract method
		animalObj.name();
		
		System.out.println("------------------------------------------------------------");
		// eat() method is defined as abstract in Animal class. It should be defined as concrete method in Cow class
		animalObj.eat();
		
		System.out.println("------------------------------------------------------------");
		// sleep() class is defined as concrete in both Animal and Cow class. So calling sleep() method would be executed from concrete (Cow) class
		animalObj.sleep();
		


	}
}
