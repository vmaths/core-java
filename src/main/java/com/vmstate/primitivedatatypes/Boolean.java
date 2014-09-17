package com.vmstate.primitivedatatypes;

/**
 * This example demonstrates the usage of Primitive Data types boolean
 * 
 * @author Rajesh Abraham
 *
 */

public class Boolean 
{
	public static void main(String[] args)
	
    {
	    boolean b1 = true;
	    boolean b2 = false;
	    System.out.println( "The Value of b1 is : "+ b1);
	    System.out.println( "The Value of b2 is : "+ b2);
	    
	    boolean b3 = !b1;
	    System.out.println( "The Value of b3 is : "+ b3);
	    
	    // translate a numeric value to boolean value
	    // for the result true
	    int i = 1;
	    boolean b4 = (i!=0);
	    System.out.println( "The Value of b4 is : "+ b4);
	  
	    // for the result false
	    int j = 0;
	    boolean b5 = (j!=0);
	    System.out.println( "The Value of b5 is : "+ b5);
	    
    }
}
