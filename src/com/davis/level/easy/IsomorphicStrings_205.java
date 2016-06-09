package com.davis.level.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings_205 {

	public static boolean isIsomorphic(String s, String t) {

		Map<String, String> regularMap = new HashMap<String, String>();

		Set<String> nonDuplicate = new HashSet<String>();

		String[] sArray = s.split("(?!^)");
		String[] tArray = t.split("(?!^)");

		for (int i = 0; i < sArray.length; i++) {
			String eachString = sArray[i];
			if (regularMap.get(eachString) == null) {
				if(nonDuplicate.contains(tArray[i])){
					return false;
				}else{
					nonDuplicate.add(tArray[i]);
				}
				regularMap.put(eachString, tArray[i]);
			} else {
				if (!regularMap.get(eachString).equals(tArray[i])) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] true_array = { "ab", "aa" };
		// String[] false_array = { "qwertyuiop[]asdfghjkl;'\\zxcvbnm,./",
		// "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz" };
		// String[]
		// testArrray={"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789","bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"};

		System.out.println("true_array : "
				+ isIsomorphic(true_array[0], true_array[1]));
		// System.out.println("false_array : "
		// + isIsomorphic(false_array[0], false_array[1]));
		// System.out.println("testArrray : "
		// + isIsomorphic(testArrray[0], testArrray[1]));
	}
}
