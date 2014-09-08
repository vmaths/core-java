package com.vmstate.accessmodifiers;

public class SampleModifiers 
{

		int day = 1; // visible to the package. no modifiers are needed.
		public int week =7 ; // Visible to the world (public).
		protected int month = 31; // Visible to the package and all subclasses (Protected).
		private int year = 12; // Visible to the class only (private) most restrictive

		public int printWeek()
		{
			return week + day + month + year;
		}
}
