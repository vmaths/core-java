package com.vmstate.string;
/**
 * @author Seany Rose
 *  This class demonstrates different methods of String.
 */
public class ParsingStrings {

	public static void main(String[] args) {

		// demonstrates the length() operation on String
		stringLength();

		// demonstrates few uses of indexOf() operation on String
		stringIndex();

		// demonstrates the use of substring() on String
		stringExampleSubString();

		// omits leading and trailing whitespace on String
		stringTrim();

		// Demonstrates joining of 2 strings together
		stringConcatenation();

		// Replaces Strings
		stringReplaceExamples();

		// Demonstrates changing from lower case to upper case and vice-versa
		stringCase();
	}

	public static void stringLength() {
		String s1 = "Hello World";
		String s2 = "";
		String s3 = null;
		System.out.println("Length of String:" + s1.length());

		// s2 is an empty String
		System.out.println("Length of String:" + s2.length());

		/*
		 * since s3 is a null, calling length() method on s3 would return
		 * exception. Uncomment the following line to see running the program
		 * returning exception.
		 */
		// System.out.println("Length of String:"+s3.length());
	}

	public static void stringIndex() {
		String s1 = "Hello World";

		// index of first character is 0.
		System.out.println("Position of H:" + s1.indexOf("H"));
		System.out.println("Position of d:" + s1.indexOf("d"));

		// space is considered a character.
		System.out.println("Position of  :" + s1.indexOf(" "));
		System.out.println("Position of World:" + s1.indexOf("World"));

		// if the string pattern does not match it returns -1
		System.out.println("Position of z:" + s1.indexOf("z"));
	}

	public static void stringExampleSubString() {
		String s1 = "Hello World";
		String s2 = "";

		// starting at index 6
		System.out.println(s1.substring(6));

		// starting at index 4 and ending at index 7.
		System.out.println(s1.substring(4, 7));

		// this will return an StringIndexOutOfBoundsException. Uncomment to run
		// the example.
		// System.out.println(s2.substring(10));
	}

	public static void stringTrim() {
		String s1 = "Hello World";
		String s2 = "     Hello World         ";

		// will return as Hello World, after removing leading or trailing
		// whitespace
		System.out.println("trim s1:" + s1.trim());
		System.out.println("trim s2:" + s2.trim());
	}

	public static void stringConcatenation() {
		String s1 = "Hello";
		String s2 = "Kitty";

		// strings are concatenated with the + operator and concat() takes only
		// 1 argument
		System.out.println("My name is " + s1.concat(s2) + ".");

		String s3 = null;
		/*
		 * concat() method if called on null String reference variable, will
		 * throw NullPointerException uncomment the line below and run to see
		 * the result.
		 */
		// System.out.println(s.concat("abc"));

		/*
		 * While concatenating strings with + operator, a null reference
		 * variable changes to “null” (i..e a String containing null as its
		 * contents.
		 */
		System.out.println(s3 + "abc");

		// + operator can take any number of arguments.
		System.out.println("This" + " " + "is" + " " + "an" + " " + "example");
	}

	public static void stringReplaceExamples() {

		String s4 = new String("This is an exAmple is example.");

		// replaces one character with another character and is case sensitive
		System.out.println(s4.replace('a', '@'));

		// replaces one character sequence with the other.
		System.out.println(s4.replace("is", "IS"));

		// replaces T with R if it comes at the beginning of the line. ^ denotes
		// beginning of line.
		System.out.println(s4.replaceAll("^T", "R"));

		// replaces the first character sequence with the other
		System.out.println(s4.replaceFirst("is", "IS"));
	}

	public static void stringCase() {
		String s5 = new String("My name is Mathew.");
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());

	}

}
