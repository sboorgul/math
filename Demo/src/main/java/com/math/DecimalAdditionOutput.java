package com.math;

import java.util.Map;

public class DecimalAdditionOutput  implements IWorksheetOutput {
	private Map<Integer,DecimalAddition> decimalProblems;

	public Map<Integer, DecimalAddition> getDecimalProblems() {
		return decimalProblems;
	}

	public void setDecimalProblems(Map<Integer, DecimalAddition> decimalProblems) {
		this.decimalProblems = decimalProblems;
	}

}
