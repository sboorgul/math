package com.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class NumberAdditionWorksheetReceiver implements IWorksheetReceiver {

	/* Requires Total Problems, levels, MaxNumber */
	@Override
	public IWorksheetOutput generateWorksheet(IWorksheetInput worksheetInput) {
		// TODO Auto-generated method stub
		System.out.println("Receiver Generating Number worksheet111");
		NumberAdditionInput nadi = (NumberAdditionInput) worksheetInput;
		int totalProblems = nadi.getTotalProblems();
		int levels = nadi.getLevel();
		int startingNumber = nadi.getStartingNumber();
		int endingNumber = nadi.getEndingNumber();
		System.out.println("received values "+totalProblems+" "+levels+" "+startingNumber+" "+endingNumber);
		Map<Integer, NumberAddition> numberProblems = new TreeMap<Integer, NumberAddition>();
		for (int problemCount = 0; problemCount < totalProblems; problemCount++) {
			List<NumberAdditionFormat> numbers = new ArrayList<NumberAdditionFormat>();
			
			int answer=0;
			for (int levCount = 0; levCount < levels; levCount++) {
				int num = MathUtilities.getRandomIntegerNumberInRange(
						startingNumber, endingNumber);
				NumberAdditionFormat numberAdditionFormat = new NumberAdditionFormat(num);
				if (levCount==0){
					numberAdditionFormat.setNumberAdditionalInfo("("+(problemCount+1)+")");
					
				}else if (levCount==levels-1){
					numberAdditionFormat.setNumberAdditionalInfo("+");
				}
				numbers.add(numberAdditionFormat);
				answer+=num;
			}
			System.out.println("Printing the generated number");
			for(NumberAdditionFormat numFormat : numbers){
				System.out.println(numFormat.getNumberAdditionalInfo());
				System.out.println(numFormat.getFormatedNumber());
			}
			NumberAddition numberAddition = new NumberAddition(problemCount+1,numbers,answer);
			numberProblems.put(problemCount+1, numberAddition);
		}
		NumberAdditionOutput numberAdditionOutput = new NumberAdditionOutput();
		numberAdditionOutput.setNumberProblems(numberProblems);
		return numberAdditionOutput;
	}
}
