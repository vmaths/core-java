package com.vmstate.exceptionhandling;
/**
 * This example demonstrates simple usage of ExceptionHandling
 * @author Rajesh Abraham
 *
 */

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{

		try {
			String[] strings = {"Welcome!"};
			System.out.println(strings[1]);
			}
		catch (ArrayIndexOutOfBoundsException e) 
			{
			//e.printStackTrace();
			System.out.println("There was an error");
			}
		
		System.out.println("The application is still running!");
		
	}

}

