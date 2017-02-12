package com.practice.java.strings;

public class SwapString {
	public static void main(String args[])
	{
		String fName="Mangesh";
		String lName="Pande";
		System.out.println("First Name "+fName);
		System.out.println("First Name "+lName);
		
		fName = fName + lName;
		lName = fName.substring(0, fName.length()-lName.length());
		fName = fName.substring(lName.length());
		
		System.out.println("*** String swapped ***");		
		System.out.println("First Name "+fName);
		System.out.println("First Name "+lName);
	}
}
