package com.vmstate.enumclass;
import java.lang.*;
/**
 * This example demonstrates switch case with enum
 * @author Geo Thomas
 *
 */
enum Day 
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
public class EnumSample3 
{
    Day day;
    
    public EnumSample3(Day day) 
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
        EnumSample3 firstDay = new EnumSample3(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumSample3 thirdDay = new EnumSample3(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumSample3 fifthDay = new EnumSample3(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumSample3 sixthDay = new EnumSample3(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumSample3 seventhDay = new EnumSample3(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}