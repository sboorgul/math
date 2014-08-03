package com.math;

import java.util.Map;

public class DecimalSubtractionOutput implements IWorksheetOutput{
	private Map<Integer,DecimalSubtraction> decimalSubtractionProblems;

	public Map<Integer, DecimalSubtraction> getDecimalSubtractionProblems() {
		return decimalSubtractionProblems;
	}

	public void setDecimalSubtractionProblems(
			Map<Integer, DecimalSubtraction> decimalSubtractionProblems) {
		this.decimalSubtractionProblems = decimalSubtractionProblems;
	}
}
