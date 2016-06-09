package com.davis.level.easy;

public class PalindromeNumber_9 {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		final int BASE_MULTIPLE = 10;
		int divide = 1;
		// 計�?��?��?�幾位數??��??
		while (x / divide >= BASE_MULTIPLE) {
			divide = divide * BASE_MULTIPLE;
		}

		System.out.println("divide : " + divide);

		// �??��比�?��?左�?��?��??��??��?�數�?
		while (x > 0) {
			int left = x / divide;
			int right = x % 10;
			if (left != right) {
				return false;
			}
			// ?��等�?��??��縮�??�數字�?�繼續�?��??
			x = x % divide / BASE_MULTIPLE;
			// ?��?��左右??�內縮�??��，除?��?��底�??100??
			divide /= 100;
		}

		return true;
	}

	public static void main(String[] args) {
		int a = 12321;
		int b = 12341;
		int c = 123321;
		int d = 123421;
		System.out.println(a + " : " + isPalindrome(a));
		System.out.println(b + " : " + isPalindrome(b));
		System.out.println(c + " : " + isPalindrome(c));
		System.out.println(d + " : " + isPalindrome(d));
	}

}
