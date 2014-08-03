package com.math;

public class DecimalAdditionInput implements IWorksheetInput {
	private int totalProblems;
	private int level;
	private double startingNumber;
	private double endingNumber;

	public DecimalAdditionInput() {

	}

	public DecimalAdditionInput(int totalProblems, int level,
			double startingNumber, double endingNumber) {
		this.totalProblems = totalProblems;
		this.level = level;
		this.startingNumber = startingNumber;
		this.endingNumber = endingNumber;
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

	public double getStartingNumber() {
		return startingNumber;
	}

	public void setStartingNumber(double startingNumber) {
		this.startingNumber = startingNumber;
	}

	public double getEndingNumber() {
		return endingNumber;
	}

	public void setEndingNumber(double endingNumber) {
		this.endingNumber = endingNumber;
	}

}
