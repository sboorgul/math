package com.math;

public class DecimalMultiplication {
	private int problemNumber;
	private double multiplicationNumber;
	private String formatMultiplicationNumber;
	private double multiplier;
	private String formatMultiplier;
	private double answer;

	public DecimalMultiplication() {

	}
	
	public DecimalMultiplication(int problemNumber, double multiplicationNumber,
			double multiplier, double answer) {
		this.setProblemNumber(problemNumber);
		this.setMultiplicationNumber(multiplicationNumber);
		this.setMultiplier(multiplier);
		this.setAnswer(answer);
	}

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
		
	}

	public double getMultiplicationNumber() {
		return multiplicationNumber;
	}

	public void setMultiplicationNumber(double multiplicationNumber) {
		this.multiplicationNumber = multiplicationNumber;
		this.setFormatMultiplicationNumber(MathUtilities.getFormatedNumber(multiplicationNumber));
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
		this.setFormatMultiplier(MathUtilities.getFormatedNumber(multiplier));		
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public String getFormatMultiplicationNumber() {
		return formatMultiplicationNumber;
	}

	public void setFormatMultiplicationNumber(String formatMultiplicationNumber) {
		this.formatMultiplicationNumber = formatMultiplicationNumber;
	}

	public String getFormatMultiplier() {
		return formatMultiplier;
	}

	public void setFormatMultiplier(String formatMultiplier) {
		this.formatMultiplier = formatMultiplier;
	}
	
}
