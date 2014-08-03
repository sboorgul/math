package com.math;

import java.util.Map;

public class NumberSubtractionOutput implements IWorksheetOutput {
	private Map<Integer, NumberSubtraction> subtractionProblems;

	public Map<Integer, NumberSubtraction> getSubtractionProblems() {
		return subtractionProblems;
	}

	public void setSubtractionProblems(
			Map<Integer, NumberSubtraction> subtractionProblems) {
		this.subtractionProblems = subtractionProblems;
	}
}
