package com.math;

import java.io.IOException;
import java.io.StringReader;

public class NumberAdditionFormat {
	private String numberAdditionalInfo;
	private int number;
    private String formatedNumber;
	public NumberAdditionFormat(){
		
	}
	
	public NumberAdditionFormat(int number){
		this.number=number;
		this.setFormatedNumber(number);
	}	
	
	public String getNumberAdditionalInfo() {
		return numberAdditionalInfo;
	}

	public void setNumberAdditionalInfo(String numberAdditionalInfo) {
		this.numberAdditionalInfo = numberAdditionalInfo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		this.setFormatedNumber(number);
	}
	
	
	
	public String getFormatedNumber() {
		return formatedNumber;
	}

	public void setFormatedNumber(int number) {
		String formatedNumber="";
		String numberToFormat=String.valueOf(number);
		for (int i=0;i<numberToFormat.length();i++){
			formatedNumber=formatedNumber+" "+numberToFormat.charAt(i);
		}
		this.formatedNumber = formatedNumber;
	}
}
