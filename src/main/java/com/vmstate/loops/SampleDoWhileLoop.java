package com.vmstate.loops;

/**
 * This example demonstrates simple usage of do while loop
 * The do wile loop is similar to while loop, but do while loop is guaranteed to execute at least one time
 *
 * @author Rajesh Abraham
 *
 */
public class SampleDoWhileLoop 
{
		   public static void main(String args[])
		   {
		      int x = 1;
		      // boolean expression appears at the end of the loop, so the statements in the loop execute
		      // once before the boolean is tested
		      do{
		         System.out.println("value of x : " + x ); //loop body, statements to execute
		         x++;
		      }while( x < 20 ); // condition-boolean expression
		   }
}

