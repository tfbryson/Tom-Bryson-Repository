package com.techelevator;

public class FruitTree {

	//instance variables
	private String typeOfFruit;
	private int piecesOfFruitLeft; 
	
	//constructor
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	//getters
	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft > 0) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;

		}

		return false;

	}
}
