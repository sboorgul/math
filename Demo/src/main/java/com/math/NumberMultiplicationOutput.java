package com.math;

import java.util.Map;

public class NumberMultiplicationOutput implements IWorksheetOutput {
	private Map<Integer, NumberMultiplication> multiplicationProblems;

	public Map<Integer, NumberMultiplication> getMultiplicationProblems() {
		return multiplicationProblems;
	}

	public void setMultiplicationProblems(
			Map<Integer, NumberMultiplication> multiplicationProblems) {
		this.multiplicationProblems = multiplicationProblems;
	}
}
