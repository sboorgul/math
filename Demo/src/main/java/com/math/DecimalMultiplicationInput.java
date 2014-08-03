package com.math;

public class DecimalMultiplicationInput implements IWorksheetInput{
	private int totalProblems;
	private double startingNumber;
	private double endingNumber;
	private double startingMultiplier;
	private double endingMultiplier;

	public DecimalMultiplicationInput(){
		
	}
	
	public DecimalMultiplicationInput(int totalProblems, double startingNumber,
			double endingNumber, double startingMultiplier, double endingMultiplier) {
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

	public double getStartingMultiplier() {
		return startingMultiplier;
	}

	public void setStartingMultiplier(double startingMultiplier) {
		this.startingMultiplier = startingMultiplier;
	}

	public double getEndingMultiplier() {
		return endingMultiplier;
	}

	public void setEndingMultiplier(double endingMultiplier) {
		this.endingMultiplier = endingMultiplier;
	}

}
