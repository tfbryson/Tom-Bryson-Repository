package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
//
		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/*
		 * The String class gets special treatment in the Java language. One example of
		 * this is that there is a literal representation of a String (i.e. characters
		 * appearing between two double quotes. This is not the case for most classes
		 */

		String greeting = "Hello World!";
		System.out.println("greeting: " + greeting);

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String myString = "Making a String Object";
		boolean myBoolean = myString.endsWith("ect");
		System.out.println(myBoolean);

		int x = myString.indexOf("i");
		System.out.println(x);

		int y = myString.lastIndexOf("i");
		System.out.println(y);

		System.out.println(myString.length());

		for (int i = 0; i < myString.length(); i++) {
			System.out.println(myString.charAt(i));

		}

		String myOtherString = "Andy ";
		myOtherString.trim();
		System.out.println(myOtherString.length());

//	//	String myOtherString = "Andy ";
//		myOtherString = myOtherString.trim(); 
//		System.out.println(myOtherString.length()); //This is an example of how to fix

		/*
		 * Other commonly used methods:
		 *
		 * endsWith startsWith indexOf lastIndexOf length substring toLowerCase
		 * toUpperCase trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		String hello1 = "Push";
		String hello2 = "Push";

		/*
		 * Double equals will compare to see f the two variables, hello1 and hello2
		 * point to the same object in memory. Are they the same object?
		 */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/*
		 * So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method
		 */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String yetAnotherString = "Hello";
		String yetAnotherString2 = changeString(yetAnotherString);
 
		System.out.println(yetAnotherString2); 

	}

	public static String changeString(String userString) {

		userString = userString + " appending stuff";
		return userString;
	}
}
