package com.vmstate.enumclass;
/**
 * This example demonstrates simple usage of enum class
 * Java enum class restrict a variable to have only one of a predefined values
 * Values in the enumerated list are called enums
 * It reduces the number of bugs in the code
 * @author Geo 
 *
 */

public class EnumSample1 
{
	public enum Margin
	
	{
		TOP,RIGHT, BOTTOM, LEFT
	}
	
	public static void main(String[] args)
	{
		int count = 1;
		
		 for (Margin m : Margin.values())
		{
		System.out.println("Margin " + count++ + " = " +m);
		
		}
		 
	}
	
	
}


