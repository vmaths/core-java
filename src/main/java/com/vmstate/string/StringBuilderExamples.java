package com.vmstate.string;
/**
 * This example demonstrates the usage of StringBuilder in Java class
 * @author Rajesh Abraham
 */
public class StringBuilderExamples 
{
public static void main(String[] args)
	{
		String s1= "Welcome ";
		StringBuilder sb = new StringBuilder(s1);
		sb.append("to California");
		System.out.println(sb);
	}

}


