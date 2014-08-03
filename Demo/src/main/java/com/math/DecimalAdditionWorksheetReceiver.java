package com.math;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class DecimalAdditionWorksheetReceiver implements IWorksheetReceiver {

	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		System.out.println("Receiver Generating Number worksheet");
		DecimalAdditionInput dadi = (DecimalAdditionInput) worksheetInput;
		int totalProblems = dadi.getTotalProblems();
		int levels = dadi.getLevel();
		double startingNumber = dadi.getStartingNumber();
		double endingNumber = dadi.getEndingNumber();
		Map<Integer, DecimalAddition> numberProblems = new TreeMap<Integer,DecimalAddition>();
		Random random = new Random();
		double answer=0;
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			List<DecimalAdditionFormat> numbers = new ArrayList<DecimalAdditionFormat>();
			answer=0;
			for (int levCount = 0; levCount < levels; levCount++) {
				double decimal = random.nextDouble()*((endingNumber - startingNumber) + 1)
						+ startingNumber;

                DecimalAdditionFormat daf = new DecimalAdditionFormat();
                if (levCount==0){
                	daf.setDecimalAdditionalInfo("("+(problemCount+1)+")");
                }else if (levCount==levels-1){
                	daf.setDecimalAdditionalInfo("+");
                }
                daf.setDecimal(decimal);
                answer+=decimal;
				numbers.add(daf);
			}
			DecimalAddition decimalAddition = new DecimalAddition(numbers,problemCount+1,answer);
			numberProblems.put(problemCount,decimalAddition );
		}
		DecimalAdditionOutput decimalAdditionOutput = new DecimalAdditionOutput();
		decimalAdditionOutput.setDecimalProblems(numberProblems);
		return decimalAdditionOutput;
	}

}
