package com.math;

import java.util.Map;
import java.util.TreeMap;

public class DecimalSubtractionWorksheetReceiver implements IWorksheetReceiver{
	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		DecimalSubtractionInput dsi = (DecimalSubtractionInput) worksheetInput;
		int totalProblems = dsi.getTotalProblems();
		double startingSubtractionFromDecimal = dsi.getStartSubtractFromRange();
		double endingSubtractionFromDecimal = dsi.getEndSubtractFromRange();
		double startingSubtractionToDecimal = dsi.getStartSubtractToRange();
		double endingSubtractionToDecimal = dsi.getEndSubtractFromRange();

		Map<Integer, DecimalSubtraction> subtractionProblems = new TreeMap<Integer, DecimalSubtraction>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			double substractFrom = MathUtilities.getRandomDoubleNumberInRange(
					startingSubtractionFromDecimal, endingSubtractionFromDecimal);
			double substractTo = MathUtilities.getRandomDoubleNumberInRange(
					startingSubtractionToDecimal, endingSubtractionToDecimal);

			if (substractFrom < substractTo) {
				double tmp = substractFrom;
				substractFrom = substractTo;
				substractTo = tmp;
			}

			DecimalSubtraction ns = new DecimalSubtraction(problemCount + 1,
					substractFrom, substractTo, substractFrom - substractTo);
			subtractionProblems.put(problemCount + 1, ns);
		}
		DecimalSubtractionOutput decimalSubtractionOutput = new DecimalSubtractionOutput();
		decimalSubtractionOutput.setDecimalSubtractionProblems(subtractionProblems);
		return decimalSubtractionOutput;
	}
}
