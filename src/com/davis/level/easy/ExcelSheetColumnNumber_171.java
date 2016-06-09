package com.davis.level.easy;

public class ExcelSheetColumnNumber_171 {

	public static int titleToNumber(String s) {

		final int BASE_NUMBER = 26;

		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			int currentNumber = Character.getNumericValue(s.charAt(i)) - 9;
//			System.out.println("currentNumber : " + currentNumber);
			result += currentNumber * Math.pow(BASE_NUMBER, s.length() - 1 - i);
//			System.out.println("result : " + result);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("BA"));
		System.out.println(titleToNumber("ABA"));
	}

}
