package com.math;


public class DecimalAdditionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private int level;
	private int startingNumber;
	private int endingNumber;
	private DecimalAdditionOutput numberAdditionOutput;

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

	public DecimalAdditionOutput getDecimalAdditionOutput() {
		return numberAdditionOutput;
	}

	public void setDecimalAdditionOutput(
			DecimalAdditionOutput numberAdditionOutput) {
		this.numberAdditionOutput = numberAdditionOutput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		DecimalAdditionWorksheetReceiver decimalAdditionWorksheetReceiver = new DecimalAdditionWorksheetReceiver();
		IWorksheetCommand dwc = new DecimalWorksheetCommand(
				decimalAdditionWorksheetReceiver);
		IWorksheetInput worksheetInput = new DecimalAdditionInput(
				this.getTotalProblems(), this.getLevel(),
				this.getStartingNumber(), this.getEndingNumber());
		WorksheetInvoker wsi = new WorksheetInvoker(dwc, worksheetInput);
		DecimalAdditionOutput decimalAdditionOutput = (DecimalAdditionOutput) wsi
				.createWorksheet();
		this.setDecimalAdditionOutput(decimalAdditionOutput);
		return SUCCESS;
	}

}
