package com.math;

import java.util.Map;
import java.util.TreeMap;

public class NumberDivisionWorksheetReceiver implements IWorksheetReceiver {

	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		System.out.println("Receiver Generating Number Division worksheet");
		NumberDivisionInput ndi = (NumberDivisionInput) worksheetInput;
		int totalProblems = ndi.getTotalProblems();
		int startingDividend = ndi.getStartingDividend();
		int endingDividend = ndi.getEndingDividend();
		int startingDivisor = ndi.getStartingDivisor();
		int endingDivisor = ndi.getEndingDivisor();
		Map<Integer, NumberDivision> divisionProblems = new TreeMap<Integer, NumberDivision>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			int dividend = MathUtilities.getRandomIntegerNumberInRange(
					startingDividend, endingDividend);
			int divisor = MathUtilities.getRandomIntegerNumberInRange(
					startingDivisor, endingDivisor);
			int tmp;
			if (dividend<divisor){
				tmp=dividend;
				dividend=divisor;
				divisor=tmp;
			}
			NumberDivision nd = new NumberDivision(problemCount + 1, dividend,
					divisor, dividend/divisor);
			divisionProblems.put(problemCount + 1, nd);
		}
		NumberDivisionOutput numberDivisionOutput = new NumberDivisionOutput();
		numberDivisionOutput.setDivisionProblems(divisionProblems);
		return numberDivisionOutput;
	}
}
