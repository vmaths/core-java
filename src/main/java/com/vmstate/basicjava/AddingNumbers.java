package com.vmstate.basicjava;
import java.util.Scanner;
public class AddingNumbers
{
//test
	public static void main(String args[]) 
	{
		int x, y, z;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers to calculate their sum\n ");
		
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);
	}
	
}


