package com.vmstate.parentchild;
/**This example demonstrates main class for the Abstract Modifier
 * 
 *@author Rajesh Abraham
 */

public class AbstractMain 
{
	public static void main (String[] args)
	{
		System.out.println("------------------------------------------------------------");
		System.out.println("Animal a  = new Animal(); // since the Animal class is abstract, we can not create new instances of the animal class directly");		
		Animal animalObj = new Cow();
		
		System.out.println("------------------------------------------------------------");		
		System.out.println("name() method is defined only in Animal class which is defined as abstract");
		animalObj.name();
		
		System.out.println("------------------------------------------------------------");
		System.out.println("eat() is defined as abstract in Animal class. It should be defined as concrete in Cow class");
		animalObj.eat();
		
		System.out.println("------------------------------------------------------------");
		System.out.println("sleep() class is defined as concrete in both Animal and Cow class. So calling sleep() method would be executed from concrete (Cow) class");
		animalObj.sleep();
		
		System.out.println("------------------------------------------------------------");
		// animalObj.doMilk(); will not work ???
		System.out.println("doMilk() can not be directly accessed by animalObj, because it is the method of child class");
		Cow cowObj = (Cow) animalObj;
		cowObj.doMilk();

	}
}
