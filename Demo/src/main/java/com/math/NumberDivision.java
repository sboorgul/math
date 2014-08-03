package com.math;

public class NumberDivision {
	private int problemNumber;
	private int dividend;
	private String formatDividend;
	private int divisor;
	private int answer;

	public NumberDivision() {

	}

	public NumberDivision(int problemNumber, int dividend,
			 int divisor, int answer) {
		this.setProblemNumber(problemNumber);
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

	public int getDividend() {
		return dividend;
	}

	public void setDividend(int dividend) {
		this.setFormatDividend(MathUtilities.getFormatedNumber(dividend));		
		this.dividend = dividend;
	}

	public String getFormatDividend() {
		return formatDividend;
	}

	public void setFormatDividend(String formatDividend) {
		this.formatDividend = formatDividend;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
