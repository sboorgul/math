package com.math;

import java.util.Map;

public class NumberDivisionOutput implements IWorksheetOutput {
	private Map<Integer, NumberDivision> divisionProblems;

	public Map<Integer, NumberDivision> getDivisionProblems() {
		return divisionProblems;
	}

	public void setDivisionProblems(
			Map<Integer, NumberDivision> divisionProblems) {
		this.divisionProblems = divisionProblems;
	}
}
