package com.math;


public class NumberAdditionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private int level;
	private int startingNumber;
	private int endingNumber;
	private NumberAdditionOutput numberAdditionOutput;

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

	public NumberAdditionOutput getNumberAdditionOutput() {
		return numberAdditionOutput;
	}

	public void setNumberAdditionOutput(
			NumberAdditionOutput numberAdditionOutput) {
		this.numberAdditionOutput = numberAdditionOutput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		NumberAdditionWorksheetReceiver numberAdditionWorksheetReceiver = new NumberAdditionWorksheetReceiver();
		IWorksheetCommand nwc = new NumberWorksheetCommand(
				numberAdditionWorksheetReceiver);
		IWorksheetInput worksheetInput = new NumberAdditionInput(
				this.getTotalProblems(), this.getLevel(),
				this.getStartingNumber(), this.getEndingNumber());
		WorksheetInvoker wsi = new WorksheetInvoker(nwc, worksheetInput);
		NumberAdditionOutput numberAdditionOutput = (NumberAdditionOutput) wsi
				.createWorksheet();
		this.setNumberAdditionOutput(numberAdditionOutput);
		return SUCCESS;
	}

}
