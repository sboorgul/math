package com.math;

public class DecimalSubtraction {
	private int problemNumber;
	private double subtractFrom;
	private double subtractTo;
	private String formattedSubtractFrom;
	private String formattedSubtractTo;
	private double answer;
	private String formattedAnswer;

	public DecimalSubtraction() {

	}

	public DecimalSubtraction(int problemNumber, double subtractFrom,
			double subtractTo, double answer) {
		this.problemNumber = problemNumber;
		this.setSubtractFrom(subtractFrom);
		this.setSubtractTo(subtractTo);
		this.setAnswer(answer);
	}

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
	}

	public double getSubtractFrom() {
		return subtractFrom;
	}

	public void setSubtractFrom(double subtractFrom) {
		this.subtractFrom = subtractFrom;
		this.setFormattedSubtractFrom(MathUtilities.getFormatedNumber(subtractFrom));
	}

	public double getSubtractTo() {
		return subtractTo;
	}

	public void setSubtractTo(double subtractTo) {
		this.subtractTo = subtractTo;
		this.setFormattedSubtractTo(MathUtilities.getFormatedNumber(subtractTo));		
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
		this.setFormattedAnswer(MathUtilities.getFormatedNumber(answer));		
	}

	public String getFormattedSubtractFrom() {
		return formattedSubtractFrom;
	}

	public void setFormattedSubtractFrom(String formattedSubtractFrom) {
		this.formattedSubtractFrom = formattedSubtractFrom;
	}

	public String getFormattedSubtractTo() {
		return formattedSubtractTo;
	}

	public void setFormattedSubtractTo(String formattedSubtractTo) {
		this.formattedSubtractTo = formattedSubtractTo;
	}

	public String getFormattedAnswer() {
		return formattedAnswer;
	}

	public void setFormattedAnswer(String formattedAnswer) {
		this.formattedAnswer = formattedAnswer;
	}

	
}
