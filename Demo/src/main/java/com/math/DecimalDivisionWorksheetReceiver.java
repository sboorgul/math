package com.math;

import java.util.Map;
import java.util.TreeMap;

public class DecimalDivisionWorksheetReceiver implements IWorksheetReceiver{

	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		DecimalDivisionInput dmi = (DecimalDivisionInput) worksheetInput;
		int totalProblems = dmi.getTotalProblems();
		double startingDivisor = dmi.getStartingDivisor();
		double endingDivisor = dmi.getEndingDivisor();
		double startingDividend = dmi.getStartingDividend();
		double endingDividend = dmi.getEndingDividend();
		Map<Integer, DecimalDivision> divisionProblems = new TreeMap<Integer, DecimalDivision>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			double dividend = MathUtilities
					.getRandomDoubleNumberInRange(startingDividend, endingDividend);
			double divisor = MathUtilities.getRandomDoubleNumberInRange(
					startingDivisor, endingDivisor);
			if (dividend<divisor){
				double tmp=dividend;
				dividend=divisor;
				divisor=tmp;
			}
			DecimalDivision dm = new DecimalDivision(
					problemCount + 1, dividend, divisor,
					dividend/divisor);
			divisionProblems.put(problemCount + 1, dm);
		}
		DecimalDivisionOutput decimalDivisionOutput = new DecimalDivisionOutput();
		decimalDivisionOutput
				.setDivisionProblems(divisionProblems);
		return decimalDivisionOutput;
	}
}
