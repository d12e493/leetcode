package com.davis.level.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {

	public static boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length == 0) {
			return false;
		}

		Set<Integer> integerSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (integerSet.contains(current)) {
				return true;
			} else {
				integerSet.add(current);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] test = new int[] { 11, 22, 33, 11 };
		System.out.println(Arrays.toString(test) + " : " + containsDuplicate(test));

		int[] test1 = new int[] { 11, 22, 33 };
		System.out.println(Arrays.toString(test1) + " : " + containsDuplicate(test1));

	}

}
