package com.math;


public class DecimalMultiplicationInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private double startingNumber;
	private double endingNumber;
	private double startingMultiplier;
	private double endingMultiplier;
	private DecimalMultiplicationOutput decimalMultiplicationOutput;

	public DecimalMultiplicationInputAction() {

	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		try{
		this.totalProblems = totalProblems;
		}
		catch(Exception e){
			e.printStackTrace();
		}
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

	public DecimalMultiplicationOutput getDecimalMultiplicationOutput() {
		return decimalMultiplicationOutput;
	}

	public void setDecimalMultiplicationOutput(
			DecimalMultiplicationOutput decimalMultiplicationOutput) {
		this.decimalMultiplicationOutput = decimalMultiplicationOutput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		DecimalMultiplicationWorksheetReceiver decimalMultiplicationWorksheetReceiver = new DecimalMultiplicationWorksheetReceiver();
		IWorksheetCommand dwc = new DecimalMultiplicationWorksheetCommand(
				decimalMultiplicationWorksheetReceiver);
		IWorksheetInput worksheetInput = new DecimalMultiplicationInput(
				this.getTotalProblems(), this.getStartingNumber(),
				this.getEndingNumber(), this.getStartingMultiplier(),
				this.getEndingMultiplier());
		WorksheetInvoker wsi = new WorksheetInvoker(dwc, worksheetInput);
		DecimalMultiplicationOutput decimalMultiplicationOutput = (DecimalMultiplicationOutput) wsi
				.createWorksheet();
		this.setDecimalMultiplicationOutput(decimalMultiplicationOutput);
		return SUCCESS;
	}
}
