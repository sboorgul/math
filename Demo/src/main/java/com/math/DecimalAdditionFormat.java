package com.math;

import java.text.DecimalFormat;

public class DecimalAdditionFormat {
	private String decimalAdditionalInfo;
	private double decimal;
	private String formatedDecimal;
	public DecimalAdditionFormat(){

	}
	
	public DecimalAdditionFormat(String decimalAdditionalInfo, double decimal,
			String formatedDecimal) {
		this();
		this.setDecimalAdditionalInfo(decimalAdditionalInfo);
		this.setDecimal(decimal);
	}

	public String getDecimalAdditionalInfo() {
		return decimalAdditionalInfo;
	}

	public void setDecimalAdditionalInfo(String decimalAdditionalInfo) {
		this.decimalAdditionalInfo = decimalAdditionalInfo;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {

		this.decimal = decimal;
		this.setFormatedDecimal(MathUtilities.getFormatedNumber(decimal));
	}

	public String getFormatedDecimal() {
		return formatedDecimal;
	}

	public void setFormatedDecimal(String formattedDecimal) {
		this.formatedDecimal = formattedDecimal;
	}

}
