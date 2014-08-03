package com.math;

public class DecimalSubtractionInput implements IWorksheetInput {
	private int totalProblems;
	private double startSubtractFromRange;
	private double endSubtractFromRange;
	private double startSubtractToRange;
	private double endSubtractToRange;

	public DecimalSubtractionInput(){
		
	}
	
	public DecimalSubtractionInput(int totalProblems,
			double startSubtractFromRange, double endSubtractFromRange,
			double startSubtractToRange, double endSubtractToRange) {
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

	public double getStartSubtractFromRange() {
		return startSubtractFromRange;
	}

	public void setStartSubtractFromRange(double startSubtractFromRange) {
		this.startSubtractFromRange = startSubtractFromRange;
	}

	public double getEndSubtractFromRange() {
		return endSubtractFromRange;
	}

	public void setEndSubtractFromRange(double endSubtractFromRange) {
		this.endSubtractFromRange = endSubtractFromRange;
	}

	public double getStartSubtractToRange() {
		return startSubtractToRange;
	}

	public void setStartSubtractToRange(double startSubtractToRange) {
		this.startSubtractToRange = startSubtractToRange;
	}

	public double getEndSubtractToRange() {
		return endSubtractToRange;
	}

	public void setEndSubtractToRange(double endSubtractToRange) {
		this.endSubtractToRange = endSubtractToRange;
	}

}
