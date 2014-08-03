package com.math;

import java.util.Map;

public class DecimalMultiplicationOutput implements IWorksheetOutput{
	private Map<Integer, DecimalMultiplication> multiplicationProblems;

	public Map<Integer, DecimalMultiplication> getMultiplicationProblems() {
		return multiplicationProblems;
	}

	public void setMultiplicationProblems(
			Map<Integer, DecimalMultiplication> multiplicationProblems) {
		this.multiplicationProblems = multiplicationProblems;
	}
}
