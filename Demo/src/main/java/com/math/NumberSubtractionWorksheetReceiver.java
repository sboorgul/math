package com.math;

import java.util.Map;
import java.util.TreeMap;

public class NumberSubtractionWorksheetReceiver implements IWorksheetReceiver {
	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		System.out
				.println("Receiver Generating Number Subtraction worksheet");
		NumberSubtractionInput nsi = (NumberSubtractionInput) worksheetInput;
		int totalProblems = nsi.getTotalProblems();
		int startingSubtractionFromNumber = nsi.getStartSubtractFromRange();
		int endingSubtractionFromNumber = nsi.getEndSubtractFromRange();
		int startingSubtractionToNumber = nsi.getStartSubtractToRange();
		int endingSubtractionToNumber = nsi.getEndSubtractToRange();

		Map<Integer, NumberSubtraction> subtractionProblems = new TreeMap<Integer, NumberSubtraction>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			int substractFrom = MathUtilities.getRandomIntegerNumberInRange(
					startingSubtractionFromNumber, endingSubtractionFromNumber);
			int substractTo = MathUtilities.getRandomIntegerNumberInRange(
					startingSubtractionToNumber, endingSubtractionToNumber);

			if (substractFrom < substractTo) {
				int tmp = substractFrom;
				substractFrom = substractTo;
				substractTo = tmp;
			}

			NumberSubtraction ns = new NumberSubtraction(problemCount + 1,
					substractFrom, substractTo, substractFrom - substractTo);
			subtractionProblems.put(problemCount + 1, ns);
		}
		NumberSubtractionOutput numberSubtractionOutput = new NumberSubtractionOutput();
		numberSubtractionOutput.setSubtractionProblems(subtractionProblems);
		return numberSubtractionOutput;
	}
}
