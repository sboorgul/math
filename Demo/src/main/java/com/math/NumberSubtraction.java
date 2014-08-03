package com.math;

public class NumberSubtraction {
	private int problemNumber;
	private int subtractFrom;
	private int subtractTo;
	private int answer;

	public NumberSubtraction() {

	}

	public NumberSubtraction(int problemNumber, int subtractFrom,
			int subtractTo, int answer) {
		this.problemNumber = problemNumber;
		this.subtractFrom = subtractFrom;
		this.subtractTo = subtractTo;
		this.answer = answer;
	}

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
	}

	public int getSubtractFrom() {
		return subtractFrom;
	}

	public void setSubtractFrom(int subtractFrom) {
		this.subtractFrom = subtractFrom;
	}

	public int getSubtractTo() {
		return subtractTo;
	}

	public void setSubtractTo(int subtractTo) {
		this.subtractTo = subtractTo;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
