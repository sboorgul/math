package com.math;

import java.util.Map;

public class NumberAdditionOutput implements IWorksheetOutput {
	private Map<Integer,NumberAddition> numberProblems;

	public Map<Integer, NumberAddition> getNumberProblems() {
		return numberProblems;
	}

	public void setNumberProblems(Map<Integer, NumberAddition> numberProblems) {
		this.numberProblems = numberProblems;
	}
}
