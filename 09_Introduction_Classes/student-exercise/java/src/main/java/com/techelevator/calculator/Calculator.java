package com.techelevator.calculator;

public class Calculator {

	private int result;

	public Calculator() {
		result = 0;
	}

	public Calculator(int startingResult) {
		result = startingResult;
	}

	public int getResult() {
		return result;
	}

	public int add(int addend) {
		return result += addend;
	}

	public int subtract(int subtrahend) {
		return result -= subtrahend;
	}

	public int multiply(int multiplier) {
		return result *= multiplier;
	}

	public int power(int exponent) {
//		if (exponent < 0) {
//			exponent *= -1;
//		}
//		
//		for (int i = 0; i < exponent; i++) {
//			result *= result;
//		}
		result = (int) Math.pow(result, Math.abs(exponent)); 
		return result;
	}

	public void reset() {
		result = 0;
	}

}