package com.vmstatemethods;

import java.util.Scanner;
/**
 * This example demonstrates sample for methods
 * @author Rajesh Abraham
 *
 */
public class SampleForMethods 
{
	public static void main(String[] args)
	{
		double burgerPrice = 1.48;
		double bucketPrice = 2.49;
		double spritePrice = 1.49;
		int burgerAmount;
		int friesAmount;
		int spriteAmount;
		double taxRate = 1.08;
		double endPrice;
		greeting();
		prices(burgerPrice, bucketPrice, spritePrice);
		burgerAmount = burgerNumber();
		friesAmount = friesNumber();
		spriteAmount = spriteNumber();
		endPrice= calculateNumber(burgerAmount,friesAmount, spriteAmount, burgerPrice, bucketPrice,spritePrice, taxRate );
		System.out.println(" Your end price is  $:"+ endPrice);
	}
	
		static void greeting()
		{
			System.out.println("Welcome to what a Burger");
		}
		
		static void prices(double a, double b, double c)
		{
			//System.out.println("Prices for the cheese burger: $"+2.47);
			//System.out.println("Prices for the cheese burger: $"+a);
			//System.out.println("Bucket of fries; $"+b);
			//System.out.println("Two gallons of Sprite Price:$"+c);
		}
		
		static int burgerNumber()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("How many Cheese burgers  u like?");
			int z;
			z=in.nextInt();
			return z;
		}
		
		static int friesNumber()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("How many amount of Fries?");
			int y;
			y=in.nextInt();
			return y;
			
		}
		
		static int spriteNumber()
		{
			Scanner in = new Scanner(System.in);
			System.out.println(" How many Gallon of sprite u want?");
			int x;
			x=in.nextInt();
			return x;
			
		}
		
		static double calculateNumber(int a, int b, int c, double d, double e, double f, double g)
		{
			double h;
			h = (g *((a*d)+(b*e)+(c*f)));
			return h;
		}
}
