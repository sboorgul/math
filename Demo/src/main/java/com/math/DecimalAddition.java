package com.math;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DecimalAddition implements WorksheetOutput {
	List<DecimalAdditionFormat> decimals = new ArrayList<DecimalAdditionFormat>();
    private double problemNumber;
	private double answer;
	private DecimalFormat decimalFormat = new DecimalFormat("#######.00");
	public DecimalAddition(){
		decimalFormat.setMinimumFractionDigits(2);
		decimalFormat.setMaximumFractionDigits(2);
	}
	public DecimalAddition(List<DecimalAdditionFormat> decimals,
			int problemNumber, double answer) {
		this();
		this.decimals = decimals;
		this.problemNumber = problemNumber;
		this.answer = answer;
	}

	public List<DecimalAdditionFormat> getDecimals() {
		return decimals;
	}

	public void setDecimals(List<DecimalAdditionFormat> decimals) {
		this.decimals = decimals;
	}

	public double getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(double problemNumber) {
		this.problemNumber = problemNumber;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
	

}
