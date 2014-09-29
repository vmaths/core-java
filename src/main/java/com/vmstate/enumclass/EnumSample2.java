package com.vmstate.enumclass;
import java.lang.*;
/**
 * An enum type is a special data type that enables for a variable to be a set of predefined constants
 * The variable must be equal to one of the values that have been predefined for it.
 * enum showing topics covered under Tutorials
 * @author Geo Thomas
 *
 * */
public class EnumSample2 
{
	enum Tutorials 
	{
	 topic1, topic2, topic3;
	}
	public static void main(String args[])
	{

	    Tutorials t1, t2, t3; 
	    
	    t1 = Tutorials.topic1; 
	    t2 = Tutorials.topic2; 
	    t3 = Tutorials.topic3; 
	   
	    // This method compares this enum with the specified object for order.
	    //This method returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
	    if(t1.compareTo(t2) > 0) {
	       System.out.println(t2 + " completed before " + t1); 
	    }
	    
	    if(t1.compareTo(t2) < 0) {
	       System.out.println(t1 + " completed before " + t2); 
	    }
	    
	    if(t1.compareTo(t3) == 0) { 
	       System.out.println(t1 + " completed with " + t3); 
	    }
	    
	    //This method returns true if the specified object is equal to this enum constant.
	    if(t1.equals(t2)) {
	        System.out.println(t1 + " is equal to " + t2); 
	     }
	    
	     else if(t2.equals(t3)) {
	        System.out.println(t2 + " is equal to " + t3); 
	     }
	    
	     else if(t1.equals(t3)) { 
	        System.out.println(t1 + " is equal to " + t3); 
	     }
	    
	     else {
	        System.out.println("all 3 topics are different"); 
	     }
	}
	}

