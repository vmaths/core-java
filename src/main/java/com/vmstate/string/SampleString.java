package com.vmstate.string;

/**
 * @author Seany Rose
 * 		   The equals() method of the String class is to compare the
 *         contents of two Strings and the relational equality operator '=='
 *         compares the references (or pointers) of two objects (checks if the
 *         memory location is the same).
 */
public class SampleString {

	public static void main(String[] args) {

		// case 1: s1 and s2 are pointing to the same memory location
		System.out.println("Case 1: ");
		String s1 = "Dallas"; // String literal
		String s2 = "Dallas"; // String literal

		System.out.println("s1, s2 point to same memory location (s1==s2) ? "
				+ (s1 == s2));
		System.out.println("s1, s2 have the same value (s1.equals(s2)) ? "
				+ (s1.equals(s2)));
		System.out.println("------------------------------------------------");

		// case 2: s3 and s4 are two different String objects. So they point to
		// the different memory location
		System.out.println("Case 2: ");
		String s3 = new String("Dallas"); // String object;
		String s4 = new String("Dallas"); // String object;

		System.out.println("s3, s4 point to same memory location (s3==s4) ? "
				+ (s3 == s4));
		System.out.println("s3, s4 have the same value (s3.equals(s4)) ? "
				+ (s3.equals(s4)));
		System.out.println("------------------------------");

		System.out.println("Case 3: ");
		String s5 = "Dallas";
		String s6 = new String("Dallas"); // new String() will always store value in a new memory location.

		System.out.println("s5, s6 point to same memory location (s5==s6) ? "
				+ (s5 == s6));
		System.out.println("s5, s6 have the same value (s5.equals(s6)) ? "
				+ (s5.equals(s6)));
		System.out.println("--------------------------------------------");

		System.out.println("Case 4: ");
		String s7 = s6; // pointing to the same reference i.e both the values
						// and memory location will be same.

		System.out.println("s6, s7 point to same memory location (s6==s7) ? "
				+ (s6 == s7));
		System.out.println("s6, s7 have the same value (s6.equals(s7)) ? "
				+ (s6.equals(s7)));
		System.out.println("--------------------------------------------");

	}

}
