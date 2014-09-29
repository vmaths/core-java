package com.vmstate.enumclass;
import java.lang.*;
/**
 * This example demonstrates the use of switch/case statements with enum
 * enum day contains values for days in a week
 * @author Geo Thomas
 *
 */
public class SwitchCaseEnum 
{	
	  enum Day 
	  {
	      SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	      THURSDAY, FRIDAY, SATURDAY 
	  }
	  
	  public class EnumWeek 
	  {
	    Day day;
	       
	     public  EnumWeek(Day day)
	     {
	         this.day = day;
	     }
	     
	     public void tellItLikeItIs() 
	     {
	         switch (day) 
	         {
	             case MONDAY:
	                 System.out.println("Mondays are bad.");
	                 break;
	                     
	             case FRIDAY:
	                 System.out.println("Fridays are better.");
	                 break;
	                          
	             case SATURDAY: case SUNDAY:
	                 System.out.println("Weekends are best.");
	                 break;
	                         
	             default:
	                 System.out.println("Midweek days are so-so.");
	                 break;
	         }
	     }
	   
	     public static void main(String[] args) 
	     {
	         EnumWeek firstDay = new EnumWeek(Day.MONDAY);
	         firstDay.tellItLikeItIs();
	         EnumWeek thirdDay = new EnumWeek(Day.WEDNESDAY);
	         thirdDay.tellItLikeItIs();
	         EnumWeek fifthDay = new EnumWeek(Day.FRIDAY);
	         fifthDay.tellItLikeItIs();
	         EnumWeek sixthDay = new EnumWeek(Day.SATURDAY);
	         sixthDay.tellItLikeItIs();
	         EnumWeek seventhDay = new EnumWeek(Day.SUNDAY);
	         seventhDay.tellItLikeItIs();
	         
	         
	   //using for loop to display all the values in enum Day
	        System.out.println("The values of enum Day and thier positions are:");
	        for (Day d: Day.values())
	   //ordinal() method is used to get the position of a the particular enumeration constant in the declaration    
	        System.out.println(d.ordinal()+":"+d);
	     }
	 }
}
