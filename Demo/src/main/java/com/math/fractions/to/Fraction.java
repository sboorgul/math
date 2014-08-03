package com.math.fractions.to;

import java.io.Serializable;

public class Fraction implements Serializable{
	private int numerator;
	private int denominator;
	private String operator;

	public Fraction() {

	}

	public Fraction(int numerator, int denominator,String operator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.operator=operator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	

}
