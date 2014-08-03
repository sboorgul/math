package com.math;


public class DecimalSubtractionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private double startSubtractFromRange;
	private double endSubtractFromRange;
	private double startSubtractToRange;
	private double endSubtractToRange;
	private DecimalSubtractionInput decimalSubtractionInput;
	private DecimalSubtractionOutput decimalSubtractionOutput;

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

	public DecimalSubtractionInput getDecimalSubtractionInput() {
		DecimalSubtractionInput dsi = new DecimalSubtractionInput();
		this.setDecimalSubtractionInput(new DecimalSubtractionInput(this.getTotalProblems(),this.getStartSubtractFromRange(),this.getEndSubtractFromRange(),
				this.getStartSubtractToRange(),this.getEndSubtractToRange()));
		return this.decimalSubtractionInput;
	}

	public void setDecimalSubtractionInput(
			DecimalSubtractionInput decimalSubtractionInput) {
		this.decimalSubtractionInput = decimalSubtractionInput;
	}

	public DecimalSubtractionOutput getDecimalSubtractionOutput() {
		return decimalSubtractionOutput;
	}

	public void setDecimalSubtractionOutput(
			DecimalSubtractionOutput decimalSubtractionOutput) {
		this.decimalSubtractionOutput = decimalSubtractionOutput;
	}
	public String show() {
		return SUCCESS;
	}

	public String generate() {
		DecimalSubtractionWorksheetReceiver decimalSubtractionWorksheetReceiver = new DecimalSubtractionWorksheetReceiver();
		IWorksheetCommand nmc = new DecimalSubtractionWorksheetCommand(
				decimalSubtractionWorksheetReceiver);

		WorksheetInvoker nmi = new WorksheetInvoker(nmc,
				this.getDecimalSubtractionInput());
		DecimalSubtractionOutput numberSubtractionOutput = (DecimalSubtractionOutput) nmi
				.createWorksheet();
		this.setDecimalSubtractionOutput(numberSubtractionOutput);
		return SUCCESS;
	}
	
}
