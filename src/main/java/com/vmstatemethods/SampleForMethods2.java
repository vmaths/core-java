package com.vmstatemethods;
/**
 * This example demonstrate simple usage of methods 
 * @author Rajesh Abraham
 */
public class SampleForMethods2 
{
	public static void main(String [] args)
	{
		//calculate();
		int x=add(5,6);
		add(14,20);
		subtract();
		multiply();
		division();
		
	}
    /*public void calculate()
    {
    	int a=10, b=5;
    	int sum=a+b;
    	System.out.println(a+b);
    	
    	int diff=a-b;
    	System.out.println(a-b);
    	
    	int mult=a*b;
    	System.out.println(a*b);
    	
    	int div=a/b;
    	System.out.println(a/b);
    	
    	
    }*/

//public static void add(int a, int b)
public static int add(int a, int b)
{
	//int a=10, b=5;
	int sum=a+b;
	//System.out.println(sum);
	return sum;
}

public static void subtract()
{
	int a=10, b=5;
	int diff=a-b;
	System.out.println(diff);
}
public static void multiply()
{
	int a=10, b=5;
	int mult=a*b;
	System.out.println(mult);
}
public static void division()
{
	int a=10, b=5;
	int div=a/b;
	System.out.println(div);
}
}
