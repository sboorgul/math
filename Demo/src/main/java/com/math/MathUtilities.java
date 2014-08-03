package com.math;

import java.text.DecimalFormat;
import java.util.Random;

public final class MathUtilities {
	private static DecimalFormat decimalFormat = new DecimalFormat("#######.00");
	public MathUtilities(){
		decimalFormat.setMinimumFractionDigits(2);
		decimalFormat.setMaximumFractionDigits(2);
	}
	public static final int getRandomIntegerNumberInRange(int starting,
			int ending) {
		Random random = new Random();
		return random.nextInt((ending - starting) + 1) + starting;
	}

	public static final int getRandomIntegerNumber(int number) {
		Random random = new Random();
		return random.nextInt(number);
	}

	public static final double getRandomDoubleNumberInRange(double starting,
			double ending) {
		Random random = new Random();
		return random.nextDouble() * ((ending - starting) + 1) + starting;
	}

	public static final double getRandomIntegerNumber(double number) {
		Random random = new Random();
		return random.nextDouble() * number;
	}
	
	public static final String getFormatedNumber(String number) {
		return getFormattedNumber(number);
	}


	public static final String getFormatedNumber(int number) {
		String numberToFormat = String.valueOf(number);
		return getFormattedNumber(numberToFormat);
	}

	public static final String getFormatedNumber(double number) {
		String numberToFormat = String.valueOf(decimalFormat.format(number));
		return getFormattedNumber(numberToFormat);
	}
	
	private static String getFormattedNumber(
			String numberToFormat) {
		String formatedNumber="";
		for (int i = 0; i < numberToFormat.length(); i++) {
			formatedNumber = formatedNumber + " " + numberToFormat.charAt(i);
		}
		return formatedNumber;
	}
}
