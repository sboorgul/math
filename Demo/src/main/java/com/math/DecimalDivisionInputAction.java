package com.math;


public class DecimalDivisionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private double startingDividend;
	private double endingDividend;
	private double startingDivisor;
	private double endingDivisor;
	private DecimalDivisionOutput decimalDivisionOutput;
	
	public DecimalDivisionInputAction(){
		
	}
	
	public DecimalDivisionInputAction(int totalProblems,
			double startingDividend, double endingDividend,
			double startingDivisor, double endingDivisor) {
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

	public DecimalDivisionOutput getDecimalDivisionOutput() {
		return decimalDivisionOutput;
	}

	public void setDecimalDivisionOutput(DecimalDivisionOutput decimalDivisionOutput) {
		this.decimalDivisionOutput = decimalDivisionOutput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		DecimalDivisionWorksheetReceiver decimalDivisionWorksheetReceiver = new DecimalDivisionWorksheetReceiver();
		IWorksheetCommand dwc = new DecimalDivisionWorksheetCommand(
				decimalDivisionWorksheetReceiver);
		IWorksheetInput worksheetInput = new DecimalDivisionInput(
				this.getTotalProblems(), 
				this.getStartingDividend(),
				this.getEndingDividend(),
				this.getStartingDivisor(),
				this.getEndingDivisor());
		WorksheetInvoker wsi = new WorksheetInvoker(dwc, worksheetInput);
		DecimalDivisionOutput decimalDivisionOutput = (DecimalDivisionOutput) wsi
				.createWorksheet();
		this.setDecimalDivisionOutput(decimalDivisionOutput);
		return SUCCESS;
	}
}
