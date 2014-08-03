package com.math;


public class NumberSubtractionInputAction   {
	private String SUCCESS = "success";
	private int totalProblems;
	private int startSubtractFromRange;
	private int endSubtractFromRange;
	private int startSubtractToRange;
	private int endSubtractToRange;
	private NumberSubtractionOutput numberSubtractionOutput;

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

	public NumberSubtractionOutput getNumberSubtractionOutput() {
		return numberSubtractionOutput;
	}

	public void setNumberSubtractionOutput(
			NumberSubtractionOutput numberSubtractionOutput) {
		this.numberSubtractionOutput = numberSubtractionOutput;
	}

	public NumberSubtractionInput getNumberSubtractionInput() {
		NumberSubtractionInput numberSubtractionInput = new NumberSubtractionInput(
				this.getTotalProblems(), this.getStartSubtractFromRange(),
				this.getEndSubtractFromRange(), this.getStartSubtractToRange(),
				this.getEndSubtractToRange());
		return numberSubtractionInput;
	}

	public String show() {
		return SUCCESS;
	}

	public String generate() {
		NumberSubtractionWorksheetReceiver numberSubtractionWorksheetReceiver = new NumberSubtractionWorksheetReceiver();
		IWorksheetCommand nmc = new DecimalWorksheetCommand(numberSubtractionWorksheetReceiver);

		WorksheetInvoker nmi = new WorksheetInvoker(nmc,
				this.getNumberSubtractionInput());
		NumberSubtractionOutput numberSubtractionOutput = (NumberSubtractionOutput) nmi
				.createWorksheet();
		this.setNumberSubtractionOutput(numberSubtractionOutput);
		return SUCCESS;
	}
}
