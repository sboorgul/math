package com.math;

public class NumberMultiplicationInput implements IWorksheetInput {
	private int totalProblems;
	private int startingNumber;
	private int endingNumber;
	private int startingMultiplier;
	private int endingMultiplier;

	public NumberMultiplicationInput(){
		
	}
	
	public NumberMultiplicationInput(int totalProblems, int startingNumber,
			int endingNumber, int startingMultiplier, int endingMultiplier) {
		this.totalProblems = totalProblems;
		this.startingNumber = startingNumber;
		this.endingNumber = endingNumber;
		this.startingMultiplier = startingMultiplier;
		this.endingMultiplier = endingMultiplier;
	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		this.totalProblems = totalProblems;
	}

	public int getStartingNumber() {
		return startingNumber;
	}

	public void setStartingNumber(int startingNumber) {
		this.startingNumber = startingNumber;
	}

	public int getEndingNumber() {
		return endingNumber;
	}

	public void setEndingNumber(int endingNumber) {
		this.endingNumber = endingNumber;
	}

	public int getStartingMultiplier() {
		return startingMultiplier;
	}

	public void setStartingMultiplier(int startingMultiplier) {
		this.startingMultiplier = startingMultiplier;
	}

	public int getEndingMultiplier() {
		return endingMultiplier;
	}

	public void setEndingMultiplier(int endingMultiplier) {
		this.endingMultiplier = endingMultiplier;
	}


}
