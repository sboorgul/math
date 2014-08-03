package com.math;

import java.util.Map;
import java.util.TreeMap;

public class DecimalMultiplicationWorksheetReceiver implements IWorksheetReceiver{
	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		System.out.println("Receiver Generating Number Multiplication worksheet");
		DecimalMultiplicationInput dmi = (DecimalMultiplicationInput) worksheetInput;
		int totalProblems = dmi.getTotalProblems();
		double startingNumber = dmi.getStartingNumber();
		double endingNumber = dmi.getEndingNumber();
		double startingMultiplier = dmi.getStartingMultiplier();
		double endingMultiplier = dmi.getEndingMultiplier();
		Map<Integer, DecimalMultiplication> multiplicationProblems = new TreeMap<Integer, DecimalMultiplication>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			double multiplicationNumber = MathUtilities
					.getRandomDoubleNumberInRange(startingNumber, endingNumber);
			double multiplier = MathUtilities.getRandomDoubleNumberInRange(
					startingMultiplier, endingMultiplier);
			DecimalMultiplication dm = new DecimalMultiplication(
					problemCount + 1, multiplicationNumber, multiplier,
					multiplicationNumber * multiplier);
			multiplicationProblems.put(problemCount + 1, dm);
		}
		DecimalMultiplicationOutput decimalMultiplicationOutput = new DecimalMultiplicationOutput();
		decimalMultiplicationOutput
				.setMultiplicationProblems(multiplicationProblems);
		return decimalMultiplicationOutput;
	}
}
