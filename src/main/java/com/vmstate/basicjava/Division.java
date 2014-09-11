package com.vmstate.basicjava;
import java.util.Scanner;
/**
 * This example demonstrates the division of two integer numbers * 
 *
 * @author Rajesh Abraham
 *
 */
public class Division 

{

  public static void main(String[] args)
  {
 	  int  a, b, result;
 
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input two integers");
 
	  a = input.nextInt();
	  b = input.nextInt();
 
	  result = a / b;
 
	  System.out.println("Result = " + result);
  }
}
  

