package com.math;


public class NumberMultiplication {
	private int problemNumber;
	private int multiplicationNumber;
	private String formatMultiplicationNumber;
	private int multiplier;
	private String formatMultiplier;
	private int answer;

	public NumberMultiplication(){
		
	}
	
	public NumberMultiplication(int problemNumber, int multiplicationNumber,
			int multiplier, int answer) {
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

	public int getMultiplicationNumber() {
		return multiplicationNumber;
	}

	public void setMultiplicationNumber(int multiplicationNumber) {
		this.multiplicationNumber = multiplicationNumber;
		this.setFormatMultiplicationNumber(MathUtilities.getFormatedNumber(multiplicationNumber));
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
		this.setFormatMultiplier(MathUtilities.getFormatedNumber(multiplier));		
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
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
