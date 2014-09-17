package com.vmstate.primitivedatatypes;
/**
 * This example demonstrates the simple usage of Primitive Data types int, byte, short, long, double and float
 * A primitive data type is stored in fastest available memory, numeric, logical (true/false), or a single character
 * Primitive data types are written in lower case
 * All primitive numerics default to zero
 * @author Rajesh Abraham
 *
 */

public class IntByteShortLongDoubleFloat 
{
	
		public static void main(String[] args)
		{
			// int data type take 16 bits and ranges values from -2,147,483,648 to 2,147,483,647
			int i = 7243234;
		    System.out.println("The value of i is : " + i);
			
		    // byte data type take 8 bits and ranges values from -128 to 127
		    byte  b  = 5;
			System.out.println("The value of b is : " + b);

			// short data type take 16 bits and ranges values from -32,768 to 32,767
			short s  = 32500;
		    System.out.println("The value of s is : " + s);
    	        
	        // long data type take 64 bits and ranges values from -9.2237E+18 to 9.2237E+18 
		    // for long values a , a  literal numeric should be followed with the letter L
		    long l = 1000000000L;
	        System.out.println("The Long Value is : "+ l);
	       
	        // double data type take 64 bits
	        // double value take lower case letter 'd' after the numeric value 
	        double d = 3.14159;
	        System.out.println("The value of d is : " + d);
	          
	        // float data type take 32 bits
	        // float value take lower case letter 'f' after the numeric value
	        float f = 1234245.435234f;
	        System.out.println("The value of f is : "+ f);  
	       
	         
		}

	}



