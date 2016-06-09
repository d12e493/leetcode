package com.davis.level.easy;

public class CountAndSay_38 {

	public static String countAndSay(int n) {

		StringBuilder str = new StringBuilder("1");

		int i = 1;

		while (i < n) {
			String[] strArray = str.toString().split("(?!^)");
			str.setLength(0);;
			int count = 0;
			String countString = strArray[0];
			for (int j = 0; j < strArray.length; j++) {
				String eachString = strArray[j];
				if (eachString.equals(countString)) {
					count++;
				} else {
					str.append(count).append(countString);
					countString = eachString;
					count = 1;
				}
			}
			str.append(count).append(countString);
			i++;
//			System.out.println(i+" : "+str);
		}

		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}

}
