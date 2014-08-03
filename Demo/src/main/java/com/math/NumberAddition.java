package com.math;

import java.util.ArrayList;
import java.util.List;

public class NumberAddition {
	List<NumberAddition> additions = new ArrayList<NumberAddition>();
    private int problemNumber;
	private int answer;
	private List<NumberAdditionFormat> numbers;
    private String additionOperator;
    private final String ADDITION_OPERATOR="+";
    
	public NumberAddition() {

	}

	public NumberAddition(int problemNumber, 
			 List<NumberAdditionFormat> numbers,int answer) {
		this.problemNumber = problemNumber;		
		this.numbers = numbers;
		this.answer = answer;		
	}

	public List<NumberAddition> getAdditions() {
		return additions;
	}

	public void setAdditions(List<NumberAddition> additions) {
		this.additions = additions;
	}

	public int getProblemNumber() {
		return problemNumber;
	}

	public void setProblemNumber(int problemNumber) {
		this.problemNumber = problemNumber;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public List<NumberAdditionFormat> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<NumberAdditionFormat> numbers) {
		this.numbers = numbers;
	}

	public String getAdditionOperator() {
	  if (this.additionOperator==null){
		  this.setAdditionOperator(ADDITION_OPERATOR);
	  }
		return additionOperator;
	}

	public void setAdditionOperator(String additionOperator) {
		this.additionOperator = additionOperator;
	}


}
