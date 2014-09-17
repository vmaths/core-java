package com.vmstate.decisionmaking;

/**
 * This example demonstrates simple usage of Switch statement
 * 
 * @author Rajesh Abraham
 *
 */

public class SampleSwitch {

	public static void main(String args[]) {
		// char grade = args[0].charAt(0);
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}
}
