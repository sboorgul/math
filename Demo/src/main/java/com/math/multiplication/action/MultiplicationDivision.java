package com.math.multiplication.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MultiplicationDivision  {
	private String SUCCESS = "success";
	private String totalProblems;
	private String maxNumber;
	private String maxMultiplier;
	private String number;
	private String multiplier;
	private int problemNumber;
	List<MultiplicationDivision> multiplications = new ArrayList<MultiplicationDivision>();
	
	public MultiplicationDivision(){
		
	}
	
	public MultiplicationDivision(String number, String multiplier,int problemNumber) {
		this.number = number;
		this.multiplier = multiplier;
		this.problemNumber=problemNumber;
	}
	
	public String getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(String totalProblems) {
		this.totalProblems = totalProblems;
	}

	public String getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(String maxNumber) {
		this.maxNumber = maxNumber;
	}

	public String getMaxMultiplier() {
		return maxMultiplier;
	}

	public void setMaxMultiplier(String maxMultiplier) {
		this.maxMultiplier = maxMultiplier;
	}
	
	

	public List<MultiplicationDivision> getMultiplications() {
		return multiplications;
	}

	public void setMultiplications(List<MultiplicationDivision> multiplications) {
		this.multiplications = multiplications;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(String multiplier) {
		this.multiplier = multiplier;
	}
	
	

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
	}

	public String execute() throws Exception {
		if (this.getTotalProblems()!=null){
		this.generate();
		}
		return SUCCESS;
	}
	
	public void generate() {
		List<MultiplicationDivision> multiplications = new ArrayList<MultiplicationDivision>();
		if (this.getTotalProblems()!=null){
		Random randomGenerator = new Random();
		int totalProblems = Integer.parseInt(this.getTotalProblems());
		int maxNumber=Integer.parseInt(this.getMaxNumber());
		int maxMultiplier=Integer.parseInt(this.getMaxMultiplier());
		for (int idx = 1; idx <= totalProblems; ++idx) {
			int number = randomGenerator.nextInt(maxNumber);
			int multiplier = randomGenerator.nextInt(maxMultiplier);
			multiplications.add(this.getFormattedProblem(number,multiplier,idx));
		}
		}
		this.setMultiplications(multiplications);
	}
	
	public MultiplicationDivision getFormattedProblem(int number,int multiplier,int problemNumber){
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
        if (number>multiplier){
        	 return new MultiplicationDivision(spaceNum+multiplier,spaceMul + number,problemNumber);	
          
        }
        else
        {
        	return new MultiplicationDivision(spaceNum+number,spaceMul + multiplier,problemNumber);
        }
	}

}

