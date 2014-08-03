package com.math;

public class NumberSubtractionInput implements IWorksheetInput {
	private int totalProblems;
	private int startSubtractFromRange;
	private int endSubtractFromRange;
	private int startSubtractToRange;
	private int endSubtractToRange;

	public NumberSubtractionInput() {

	}

	public NumberSubtractionInput(int totalProblems,
			int startSubtractFromRange, int endSubtractFromRange,
			int startSubtractToRange, int endSubtractToRange) {
		this.totalProblems = totalProblems;
		this.startSubtractFromRange = startSubtractFromRange;
		this.endSubtractFromRange = endSubtractFromRange;
		this.startSubtractToRange = startSubtractToRange;
		this.endSubtractToRange = endSubtractToRange;
	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		this.totalProblems = totalProblems;
	}

	public int getStartSubtractFromRange() {
		return startSubtractFromRange;
	}

	public void setStartSubtractFromRange(int startSubtractFromRange) {
		this.startSubtractFromRange = startSubtractFromRange;
	}

	public int getEndSubtractFromRange() {
		return endSubtractFromRange;
	}

	public void setEndSubtractFromRange(int endSubtractFromRange) {
		this.endSubtractFromRange = endSubtractFromRange;
	}

	public int getStartSubtractToRange() {
		return startSubtractToRange;
	}

	public void setStartSubtractToRange(int startSubtractToRange) {
		this.startSubtractToRange = startSubtractToRange;
	}

	public int getEndSubtractToRange() {
		return endSubtractToRange;
	}

	public void setEndSubtractToRange(int endSubtractToRange) {
		this.endSubtractToRange = endSubtractToRange;
	}

}
