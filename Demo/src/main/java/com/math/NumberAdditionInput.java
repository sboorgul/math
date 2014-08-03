package com.math;

public class NumberAdditionInput implements IWorksheetInput{
	private int totalProblems;
	private int level;
	private int startingNumber;
	private int endingNumber;

	public NumberAdditionInput() {

	}

	public NumberAdditionInput(int totalProblems, int level,
			int startingNumber, int endingNumber) {
		this.totalProblems = totalProblems;
		this.level = level;
		this.startingNumber = startingNumber;
		this.endingNumber = endingNumber;
	}
	
	public NumberAdditionInput(NumberAdditionInput input) {
		this.totalProblems = input.totalProblems;
		this.level = input.level;
		this.startingNumber = input.startingNumber;
		this.endingNumber = input.endingNumber;
	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		this.totalProblems = totalProblems;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

}
