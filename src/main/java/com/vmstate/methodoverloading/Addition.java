package com.vmstate.methodoverloading;
/**
 * Examples for method overloading class declaration
 * 
 * @author Rajesh Abraham
 *
 */

public class Addition 
{
	public static void add(int a , int b) 
	{
		int sum = a+b;
		System.out.println( "The sum of two numbers are : " + sum);
	}
	
	public static void add(String s1, String s2)
	{
		
		String sum = s1+s2;
		System.out.println(" The sum of two strings are : " + sum);
		
	}
	
	public static void add( double a, double b )
	{
		double sum = a+b;
		System.out.println("The sum of two double numbers are : " + sum);
	}
}

