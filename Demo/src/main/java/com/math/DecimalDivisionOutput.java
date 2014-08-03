package com.math;

import java.util.Map;

public class DecimalDivisionOutput implements IWorksheetOutput {
	private Map<Integer, DecimalDivision> divisionProblems;

	public Map<Integer, DecimalDivision> getDivisionProblems() {
		return divisionProblems;
	}

	public void setDivisionProblems(
			Map<Integer, DecimalDivision> divisionProblems) {
		this.divisionProblems = divisionProblems;
	}
}
