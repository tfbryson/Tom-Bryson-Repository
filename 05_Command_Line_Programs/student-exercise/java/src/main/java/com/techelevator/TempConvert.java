package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class TempConvert { 

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); //Calls for special class in Java which enables us to take user input, thus "System.in" (System.out being for output). We create the Scanner(class) Object (userInput). Error message originally shown because we need to import the class into our project.

		System.out.println("Please enter the temperature: "); //Prompts user to input int temp value (whole number). Will error if anything other than an integer is input.
		int temp = userInput.nextInt(); //int temp is assigned value for user input, which is also our scanner. The scanner now has a data type, a variable name, and a value when input by user. 
		userInput.nextLine(); //after user inputs value, the nextLine() advances the scanner past current line. 

		System.out.println("Is the temperature in (C)elcius or (F)arenheit? "); //after user input value, a second prompt to the user requesting a string value. Will terminate if another value aside from "C" or "F" is entered. Is case-sensitive.

		String tempInput = userInput.nextLine(); // prompt for user to input a string value.  

		if (tempInput.equals("C")) { //boolean if/else. tempInput.equals assigns to the object in parenthesis. Returns true if the value is entered. Program will terminate if this object (or the other assigned object in the second part of the loop) return anything other than what was assigned.

			int tempInF = (int) ((temp * 1.8) + 32); //int (data type) tempInF (variable) assigned to int(int temp (what the user input) x 1.8) + 32). The formula for F was provided.
			System.out.println(temp + "C is " + tempInF + "F."); // system will print user input temp + "C is " + the temperature in F provided by the formula above + the letter "F". This gives us  "numeric value (for) C is numeric value (for) F."
		
		} else if (tempInput.equals("F")) { //second part of loop. The opposite condition, essentially, provided the user did not input "C" and instead input "F". 
			
			int tempInC = (int)((temp - 32) / 1.8); // int (data type) tempInC (variable) assigned to the int itself multipled by the user input temp less 32 then divided by 1.8.
			System.out.println(temp + "F is " + tempInC + "C."); // system will print user input value + "F is " + the temperature value in C provided by the formula above + the letter "C." 
			
		}
	}
}
