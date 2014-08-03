package com.math;

import java.util.Map;
import java.util.TreeMap;

public class NumberMultiplicationWorksheetReceiver implements
		IWorksheetReceiver {

	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		System.out.println("Receiver Generating Number Multiplication worksheet");
		NumberMultiplicationInput nmi = (NumberMultiplicationInput) worksheetInput;
		int totalProblems = nmi.getTotalProblems();
		int startingNumber = nmi.getStartingNumber();
		int endingNumber = nmi.getEndingNumber();
		int startingMultiplier = nmi.getStartingMultiplier();
		int endingMultiplier = nmi.getEndingMultiplier();
		Map<Integer, NumberMultiplication> multiplicationProblems = new TreeMap<Integer, NumberMultiplication>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			int multiplicationNumber = MathUtilities
					.getRandomIntegerNumberInRange(startingNumber, endingNumber);
			int multiplier = MathUtilities.getRandomIntegerNumberInRange(
					startingMultiplier, endingMultiplier);
			NumberMultiplication nm = new NumberMultiplication(
					problemCount + 1, multiplicationNumber, multiplier,
					multiplicationNumber * multiplier);
			multiplicationProblems.put(problemCount + 1, nm);
		}
		NumberMultiplicationOutput numberMultiplicationOutput = new NumberMultiplicationOutput();
		numberMultiplicationOutput
				.setMultiplicationProblems(multiplicationProblems);
		return numberMultiplicationOutput;
	}
}
