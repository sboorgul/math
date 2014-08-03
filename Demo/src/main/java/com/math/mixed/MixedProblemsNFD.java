package com.math.mixed;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import com.math.fractions.to.Fraction;
import com.math.multiplication.action.MultiplicationAddition;

public class MixedProblemsNFD   {
	private String SUCCESS = "success";
	private List<String> availableMixedProblemNumberTypes=new ArrayList<String>();
	private String selectedMixedProblemNumberType;	
	private List<String> selectedMixedProblemNumberTypes=new ArrayList<String>();
	private int totalProblemNumbers;
	private int levelAddition;
	private int topMaxNumber;
	private int bottomMaxNumber;
	private List<String> availableMixedProblemFractionTypes=new ArrayList<String>();
	private String selectedMixedProblemFractionType;	
	private List<String> selectedMixedProblemFractionTypes=new ArrayList<String>();
	private int totalProblemFractions;
	private int levelFraction;
	private int maxNumerator;
	private int maxDenominator;
	private int maxMultiplier;
	private int maxDivisor;
	private Map<String, List<Fraction>> fractionsMap;
	private List<MultiplicationAddition> multiplications;
	private String[] defaultValues= new String [] {"+","-"};

	public MixedProblemsNFD() {
        this.getAvailableMixedProblemNumberTypes(); 
        this.getAvailableMixedProblemFractionTypes();
	}

	public List<String> getAvailableMixedProblemNumberTypes() {
		List<String> operations=new ArrayList<String>();
		if (this.availableMixedProblemNumberTypes.isEmpty()){
			operations.add("+");
			operations.add("-");
			operations.add("x");
			operations.add("-:-");
			this.setAvailableMixedProblemNumberTypes(operations);			
		}

		return availableMixedProblemNumberTypes;
	}

	private String[] getDefaultValues(){
		return this.defaultValues;
	}
	public void setAvailableMixedProblemNumberTypes(
			List<String> availableMixedProblemNumberTypes) {
		this.availableMixedProblemNumberTypes = availableMixedProblemNumberTypes;
	}

	public List<String> getSelectedMixedProblemNumberTypes() {
		if (this.selectedMixedProblemNumberTypes.isEmpty()) {
			String selection[] = this.getSelectedMixedProblemNumberType()
					.split(",");
			for (int i = 0; i < selection.length; i++) {
				selectedMixedProblemNumberTypes.add(selection[i].trim());
			}
		}
		return selectedMixedProblemNumberTypes;
	}

	public void setSelectedMixedProblemNumberTypes(
			List<String> selectedMixedProblemNumberTypes) {
		this.selectedMixedProblemNumberTypes = selectedMixedProblemNumberTypes;
	}

	public int getTotalProblemNumbers() {
		return totalProblemNumbers;
	}

	public void setTotalProblemNumbers(int totalProblemNumbers) {
		this.totalProblemNumbers = totalProblemNumbers;
	}

	public int getLevelAddition() {
		return levelAddition;
	}

	public void setLevelAddition(int levelAddition) {
		this.levelAddition = levelAddition;
	}

	public int getTopMaxNumber() {
		return topMaxNumber;
	}

	public void setTopMaxNumber(int topMaxNumber) {
		this.topMaxNumber = topMaxNumber;
	}

	public int getBottomMaxNumber() {
		return bottomMaxNumber;
	}

	public void setBottomMaxNumber(int bottomMaxNumber) {
		this.bottomMaxNumber = bottomMaxNumber;
	}

	public List getAvailableMixedProblemFractionTypes() {
		List<String> operations=new ArrayList<String>();
		if (this.availableMixedProblemFractionTypes.isEmpty()){
			operations.add("+");
			operations.add("-");
			operations.add("x");
			operations.add("-:-");
			this.setAvailableMixedProblemFractionTypes(operations);
		}

		return availableMixedProblemFractionTypes;
	}

	public void setAvailableMixedProblemFractionTypes(
			List<String> availableMixedProblemFractionTypes) {
		this.availableMixedProblemFractionTypes = availableMixedProblemFractionTypes;
	}

	public List<String> getSelectedMixedProblemFractionTypes() {
	  if (this.selectedMixedProblemFractionTypes.isEmpty()){	
	    String selection[]=this.getSelectedMixedProblemFractionType().split(",");	
	    for (int i=0;i<selection.length;i++){
	    	selectedMixedProblemFractionTypes.add(selection[i]);
	    }
	  }
		return selectedMixedProblemFractionTypes;
	}

	public void setSelectedMixedProblemFractionTypes(
			List<String> selectedMixedProblemFractionTypes) {
		this.selectedMixedProblemFractionTypes = selectedMixedProblemFractionTypes;
	}

	public int getTotalProblemFractions() {
		return totalProblemFractions;
	}

	public void setTotalProblemFractions(int totalProblemFractions) {
		this.totalProblemFractions = totalProblemFractions;
	}

	public int getLevelFraction() {
		return levelFraction;
	}

	public void setLevelFraction(int levelFraction) {
		this.levelFraction = levelFraction;
	}

	public int getMaxNumerator() {
		return maxNumerator;
	}

	public void setMaxNumerator(int maxNumerator) {
		this.maxNumerator = maxNumerator;
	}

	public int getMaxDenominator() {
		return maxDenominator;
	}

	public void setMaxDenominator(int maxDenominator) {
		this.maxDenominator = maxDenominator;
	}
	
	public String getSelectedMixedProblemNumberType() {
		return selectedMixedProblemNumberType;
	}

	public void setSelectedMixedProblemNumberType(
			String selectedMixedProblemNumberType) {
		this.selectedMixedProblemNumberType = selectedMixedProblemNumberType;
	}

	public String getSelectedMixedProblemFractionType() {
		return selectedMixedProblemFractionType;
	}

	public void setSelectedMixedProblemFractionType(
			String selectedMixedProblemFractionType) {
		this.selectedMixedProblemFractionType = selectedMixedProblemFractionType;
	}
	
	public int getMaxMultiplier() {
		return maxMultiplier;
	}

	public void setMaxMultiplier(int maxMultiplier) {
		this.maxMultiplier = maxMultiplier;
	}

	public int getMaxDivisor() {
		return maxDivisor;
	}

	public void setMaxDivisor(int maxDivisor) {
		this.maxDivisor = maxDivisor;
	}

	public String execute() throws Exception {
		this.generateNumberProblems();
		this.generate();
		return SUCCESS;
	}

	public Map<String, List<Fraction>> getFractionsMap() {
		if (fractionsMap == null) {
			this.setFractionsMap(new TreeMap());
		}
		return fractionsMap;
	}

	public void setFractionsMap(Map<String, List<Fraction>> fractionsMap) {
		this.fractionsMap = fractionsMap;
	}
	
	
	
	public List<MultiplicationAddition> getMultiplications() {
		return multiplications;
	}

	public void setMultiplications(List<MultiplicationAddition> multiplications) {
		this.multiplications = multiplications;
	}

	public void generateNumberProblems() {
		List<MultiplicationAddition> multiplications = new ArrayList<MultiplicationAddition>();
		if (this.getTotalProblemNumbers() > 0) {
			Random randomGenerator = new Random();
			int totalProblems = this.getTotalProblemNumbers();
			int topMaxNumber = this.getTopMaxNumber();
			int bottomMaxNumber = this.getBottomMaxNumber();
			int maxMultiplier = this.getMaxMultiplier();
			int maxDivisor = this.getMaxDivisor();
			int bottomNumber=0;
			int np = 0;
			int numberOfProblems = totalProblems/ this.getSelectedMixedProblemNumberTypes().size();
			for (String operator : this.getSelectedMixedProblemNumberTypes()) {

				for (int n = 0; n < numberOfProblems; n++) {
					int topNumber = randomGenerator.nextInt(topMaxNumber);
					if (operator.equals("x")){
						bottomNumber = randomGenerator.nextInt(maxMultiplier);
						multiplications.add(this.getFormattedProblem(
								topNumber, bottomNumber, ++np, operator));						
					} 
					else if (operator.equals("-:-")){
						bottomNumber = randomGenerator.nextInt(maxDivisor);
						multiplications.add(this.getFormattedProblem(
								topNumber, bottomNumber, ++np, operator));						
					} else if (operator.equals("+")){
						bottomNumber = randomGenerator.nextInt(bottomMaxNumber);
						multiplications.add(this.getFormattedProblem(
								topNumber, bottomNumber, ++np, operator));						
					}
					else if (operator.equals("-")) {
						bottomNumber = randomGenerator.nextInt(bottomMaxNumber);
						if (topNumber > bottomNumber) {
							multiplications.add(this.getFormattedProblem(
									topNumber, bottomNumber, ++np, operator));
						} else {
							multiplications.add(this.getFormattedProblem(
									bottomNumber,topNumber, ++np, operator));
						}
					} 

				}
			}
		}
		this.setMultiplications(multiplications);
	}
	
	public MultiplicationAddition getFormattedProblem(int number,int multiplier,int problemNumber,String operator){
        String spaceNum="";
        String spaceMul="";
        int numlen=Integer.toString(number).length();
        int mullen=Integer.toString(multiplier).length();
        if (numlen<=mullen){
			 for (int i=0;i<(mullen-numlen)+1;i++){
			   spaceNum=spaceNum+" ";
			 }
		 }
		 else{
			 for (int i=0;i<numlen-mullen-1;i++){
			   spaceMul=spaceMul+" ";
			 }

		 }
        return new MultiplicationAddition(spaceNum+number,operator+spaceMul + multiplier,problemNumber);
	}

	public void generate() {
		List<Fraction> fractions = new ArrayList<Fraction>();
		Map<String, List<Fraction>> fractionsMap = new TreeMap<String, List<Fraction>>();
		int problemIndx=0;
		if (this.getTotalProblemFractions() > 0) {
			Random randomGenerator = new Random();
			int totalProblems = this.getTotalProblemFractions();
			int maxNumerator = this.getMaxNumerator();
			int maxDenominator = this.getMaxDenominator();
			int numberOfProblems = this.getTotalProblemFractions()/this.getSelectedMixedProblemFractionTypes().size();
//			for (int t = 0; t < this.getSelectedMixedProblemFractionTypes()
//					.size(); t++) {
				for (String operator:this.getSelectedMixedProblemFractionTypes()) {
	
				 for (int n=0;n<numberOfProblems;n++)
				 {
						String opr = operator;
					 fractions = new ArrayList<Fraction>();
					for (int i = 0; i < this.getLevelFraction(); i++) {
						int numerator = randomGenerator.nextInt(maxNumerator);
						int denominator = randomGenerator
								.nextInt(maxDenominator);
						if (numerator == 0) {
							numerator = 2;
						}
						if (denominator == 0) {
							denominator = 2;
						}
						if (i == this.getLevelFraction()-1) {
							opr = "=";
						}
						if (numerator > denominator) {
							fractions.add(new Fraction(numerator, denominator,
									opr));
						} else {
							fractions.add(new Fraction(denominator, numerator,
									opr));
						}
					}
					fractionsMap.put(String.valueOf(++problemIndx), fractions);
				}
				}
			}
//		}
		this.setFractionsMap(fractionsMap);
	}

}
