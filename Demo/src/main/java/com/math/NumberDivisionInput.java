package com.math;

public class NumberDivisionInput implements IWorksheetInput{
	private int totalProblems;
	private int startingDividend;
	private int endingDividend;
	private int startingDivisor;
	private int endingDivisor;

	public NumberDivisionInput(){
		
	}
	
	public NumberDivisionInput(int totalProblems, int startingDividend,
			int endingDividend, int startingDivisor, int endingDivisor) {
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

	public int getStartingDividend() {
		return startingDividend;
	}

	public void setStartingDividend(int startingDividend) {
		this.startingDividend = startingDividend;
	}

	public int getEndingDividend() {
		return endingDividend;
	}

	public void setEndingDividend(int endingDividend) {
		this.endingDividend = endingDividend;
	}

	public int getStartingDivisor() {
		return startingDivisor;
	}

	public void setStartingDivisor(int startingDivisor) {
		this.startingDivisor = startingDivisor;
	}

	public int getEndingDivisor() {
		return endingDivisor;
	}

	public void setEndingDivisor(int endingDivisor) {
		this.endingDivisor = endingDivisor;
	}
}
