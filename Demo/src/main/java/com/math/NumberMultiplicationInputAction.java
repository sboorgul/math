package com.math;


public class NumberMultiplicationInputAction   {
	private String SUCCESS = "success";
	private NumberMultiplicationInput numberMultiplicationInput;
	private NumberMultiplicationOutput numberMultiplicationOutput;
	private int totalProblems;
	private int startingNumber;
	private int endingNumber;
	private int startingMultiplier;
	private int endingMultiplier;
	public NumberMultiplicationInputAction() {

	}

	public NumberMultiplicationInputAction(
			NumberMultiplicationInput numberMultiplicationInput) {
		this.numberMultiplicationInput = numberMultiplicationInput;
	}

	public NumberMultiplicationInput getNumberMultiplicationInput() {
		NumberMultiplicationInput numberMultiplicationInput=new NumberMultiplicationInput(this.getTotalProblems(),this.getStartingNumber(),
				this.getEndingNumber(),this.getStartingMultiplier(),this.getEndingMultiplier());	
		return numberMultiplicationInput;
	}

	public void setNumberMultiplicationInput(
			NumberMultiplicationInput numberMultiplicationInput) {
		this.numberMultiplicationInput = numberMultiplicationInput;
	}

	public NumberMultiplicationOutput getNumberMultiplicationOutput() {
		return numberMultiplicationOutput;
	}

	public void setNumberMultiplicationOutput(
			NumberMultiplicationOutput numberMultiplicationOutput) {
		this.numberMultiplicationOutput = numberMultiplicationOutput;
	}

	public int getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(int totalProblems) {
		this.totalProblems = totalProblems;
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

	public int getStartingMultiplier() {
		return startingMultiplier;
	}

	public void setStartingMultiplier(int startingMultiplier) {
		this.startingMultiplier = startingMultiplier;
	}

	public int getEndingMultiplier() {
		return endingMultiplier;
	}

	public void setEndingMultiplier(int endingMultiplier) {
		this.endingMultiplier = endingMultiplier;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		NumberMultiplicationWorksheetReceiver numberMultiplicationWorksheetReceiver = new NumberMultiplicationWorksheetReceiver();
		IWorksheetCommand nmc = new DecimalWorksheetCommand(
				numberMultiplicationWorksheetReceiver);
		
		WorksheetInvoker nmi = new WorksheetInvoker(nmc,
				this.getNumberMultiplicationInput());
		NumberMultiplicationOutput numberMultiplicationOutput = (NumberMultiplicationOutput) nmi
				.createWorksheet();
		this.setNumberMultiplicationOutput(numberMultiplicationOutput);
		return SUCCESS;
	}
}
