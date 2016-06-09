package com.davis.level.easy;

public class PowerOfTwo_231 {

	public static boolean isPowerOfTwo(int n) {

		if (n > 0) {
			int countOne = 0;

			while (n > 0) {
				countOne += n & 1;
				n >>= 1;
			}

			return countOne == 1;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int test1 = 16;
		int test2 = 17;
		System.out.println(test1 + " : " + isPowerOfTwo(test1));
		System.out.println(test2 + " : " + isPowerOfTwo(test2));
		
		int test3 = 64;
		System.out.println(test3 + " : " + isPowerOfTwo(test3));
	}

}
