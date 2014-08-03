package com.math;


public class NumberDivisionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private int startingDividend;
	private int endingDividend;
	private int startingDivisor;
	private int endingDivisor;
	private NumberDivisionInput numberDivisionInput;
	private NumberDivisionOutput numberDivisionOutput;

	public NumberDivisionInputAction() {

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

	public NumberDivisionInput getNumberDivisionInput() {
		NumberDivisionInput numberDivisionInput = new NumberDivisionInput(
				this.getTotalProblems(),
				this.getStartingDividend(),
				this.getEndingDividend(),
				this.getStartingDivisor(),
				this.getEndingDivisor()
				);
		return numberDivisionInput;
	}

	public void setNumberDivisionInput(NumberDivisionInput numberDivisionInput) {
		this.numberDivisionInput = numberDivisionInput;
	}

	public NumberDivisionOutput getNumberDivisionOutput() {
		return numberDivisionOutput;
	}

	public void setNumberDivisionOutput(
			NumberDivisionOutput numberDivisionOutput) {
		this.numberDivisionOutput = numberDivisionOutput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		NumberDivisionWorksheetReceiver numberDivisionWorksheetReceiver = new NumberDivisionWorksheetReceiver();
		IWorksheetCommand ndc = new NumberDivisionWorksheetCommand(
				numberDivisionWorksheetReceiver);

		WorksheetInvoker nmi = new WorksheetInvoker(ndc,
				this.getNumberDivisionInput());
		NumberDivisionOutput numberDivisionOutput = (NumberDivisionOutput) nmi
				.createWorksheet();
		this.setNumberDivisionOutput(numberDivisionOutput);
		return SUCCESS;
	}

}
