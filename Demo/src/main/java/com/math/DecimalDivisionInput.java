package com.math;

public class DecimalDivisionInput implements IWorksheetInput {
	private int totalProblems;
	private double startingDividend;
	private double endingDividend;
	private double startingDivisor;
	private double endingDivisor;

	public DecimalDivisionInput() {

	}

	public DecimalDivisionInput(int totalProblems, double startingDividend,
			double endingDividend, double startingDivisor, double endingDivisor) {
		this.totalProblems = totalProblems;
		this.startingDividend = startingDividend;
		this.endingDividend = endingDividend;
		this.startingDivisor = startingDivisor;
		this.endingDivisor = endingDivisor;
	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		this.totalProblems = totalProblems;
	}

	public double getStartingDividend() {
		return startingDividend;
	}

	public void setStartingDividend(double startingDividend) {
		this.startingDividend = startingDividend;
	}

	public double getEndingDividend() {
		return endingDividend;
	}

	public void setEndingDividend(double endingDividend) {
		this.endingDividend = endingDividend;
	}

	public double getStartingDivisor() {
		return startingDivisor;
	}

	public void setStartingDivisor(double startingDivisor) {
		this.startingDivisor = startingDivisor;
	}

	public double getEndingDivisor() {
		return endingDivisor;
	}

	public void setEndingDivisor(double endingDivisor) {
		this.endingDivisor = endingDivisor;
	}

}
