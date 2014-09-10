package com.vmstate.basicjava;
	import java.util.Scanner;
	import java.math.BigInteger;
	/**
	 * This example demonstrates the simple addition of two large numbers
	 * 
	 * @author Rajesh Abraham
	 *
	 */
	 
	public class AddingLargeNumbers 
	{
	  public static void main(String[] args)
	  	{
		  String number1, number2, number3;
		  Scanner in = new Scanner(System.in);
	 
		  System.out.println("Enter first large number :");

		  number1 = in.nextLine();
	 
		  System.out.println("Enter second large number :");
		  number2 = in.nextLine();
	// number3 = ADD(number1 + number2);
		  BigInteger first = new BigInteger(number1);
	  	BigInteger second = new BigInteger(number2);
	//System.out.println("total ="+ number3);
	 
	    //System.out.println("Addition = " + first.add(second));
		System.out.println("The Result = " + first + second);
	  }
	} 

