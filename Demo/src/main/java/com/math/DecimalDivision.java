package com.math;

public class DecimalDivision {
	private int problemNumber;
	private double dividend;
	private String formatDividend;
	private double divisor;
	private String formatDivisor;
	private double answer;
	private String formatAnswer;

	public DecimalDivision(){
		
	}
	
	public DecimalDivision(int problemNumber, double dividend, double divisor,
			double answer) {
		this.problemNumber = problemNumber;
		this.setDividend(dividend);
		this.setDivisor(divisor);
		this.setAnswer(answer);
	}

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
	}

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
		this.setFormatDividend(MathUtilities.getFormatedNumber(dividend));
	}

	public String getFormatDividend() {
		return formatDividend;
	}

	public void setFormatDividend(String formatDividend) {
		this.formatDividend = formatDividend;
	}

	public double getDivisor() {
		return divisor;
	}

	public void setDivisor(double divisor) {
		this.divisor = divisor;
		this.setFormatDivisor(MathUtilities.getFormatedNumber(divisor));		
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
		this.setFormatAnswer(MathUtilities.getFormatedNumber(answer));
	}

	public String getFormatDivisor() {
		return formatDivisor;
	}

	public void setFormatDivisor(String formatDivisor) {
		this.formatDivisor = formatDivisor;
	}

	public String getFormatAnswer() {
		return formatAnswer;
	}

	public void setFormatAnswer(String formatAnswer) {
		this.formatAnswer = formatAnswer;
	}
	
	
}
