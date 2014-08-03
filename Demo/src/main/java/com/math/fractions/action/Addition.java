package com.math.fractions.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import com.math.fractions.to.Fraction;
import com.math.multiplication.action.MultiplicationAddition;

public class Addition   {
	private String SUCCESS = "success";
	private List<Fraction> fractions;
	private Map<String, List<Fraction>> fractionsMap;
	private String totalProblems;
	private String level;
	private String maxNumerator;
	private String maxDenominator;
	private List<String> operations;
	private String selectedOperation;

	public List<Fraction> getFractions() {
		if (this.fractions == null) {
			this.setFractions(new ArrayList<Fraction>());
		}
		return fractions;
	}

	public void setFractions(List<Fraction> fractions) {
		this.fractions = fractions;
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

	public String getTotalProblems() {
		return totalProblems;
	}

	public void setTotalProblems(String totalProblems) {
		this.totalProblems = totalProblems;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMaxNumerator() {
		return maxNumerator;
	}

	public void setMaxNumerator(String maxNumerator) {
		this.maxNumerator = maxNumerator;
	}

	public String getMaxDenominator() {
		return maxDenominator;
	}

	public void setMaxDenominator(String maxDenominator) {
		this.maxDenominator = maxDenominator;
	}
	
	public String getSelectedOperation() {
		return selectedOperation;
	}

	public void setSelectedOperation(String selectedOperation) {
		this.selectedOperation = selectedOperation;
	}

	public String execute() throws Exception {
		this.generate();
		return SUCCESS;
	}
	
	

	public List<String> getOperations() {
		if (this.operations==null){
			operations=new ArrayList();
			operations.add("+");
			operations.add("-");
			operations.add("x");
			operations.add("-:-");
		}
		return operations;
	}

	public void setOperations(List<String> operations) {
		this.operations = operations;
	}

	public void generate() {
		List<Fraction> fractions = new ArrayList<Fraction>();
		Map<String, List<Fraction>> fractionsMap = new TreeMap<String, List<Fraction>>();
		String operator="+";
		if (this.getTotalProblems() != null) {
			Random randomGenerator = new Random();
			int totalProblems = Integer.parseInt(this.getTotalProblems());
			int maxNumerator = Integer.parseInt(this.getMaxNumerator());
			int maxDenominator = Integer.parseInt(this.getMaxDenominator());
			for (int idx = 1; idx <= totalProblems; ++idx) {
				fractions = new ArrayList<Fraction>();
				operator=this.getSelectedOperation();
				for (int i = 1; i <= Integer.parseInt(this.getLevel()); i++) {
					int numerator = randomGenerator.nextInt(maxNumerator);
					int denominator = randomGenerator.nextInt(maxDenominator);
					if (numerator==0){
						numerator=2;
					}
					if (denominator==0){
						denominator=2;
					}
					if (i==Integer.parseInt(this.getLevel())){
						operator="=";
					}
					if (numerator > denominator) {
						fractions.add(new Fraction(denominator,numerator,operator));
					} else {
						fractions.add(new Fraction(numerator,denominator,operator));
					}
				}
				fractionsMap.put(String.valueOf(idx), fractions);
			}
		}
		this.setFractionsMap(fractionsMap);
	}

}
