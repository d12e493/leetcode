package com.davis.level.easy;

public class PalindromeNumber_9 {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		final int BASE_MULTIPLE = 10;
		int divide = 1;
		// è¨ˆç?—è?å?å¹¾ä½æ•¸??‹å??
		while (x / divide >= BASE_MULTIPLE) {
			divide = divide * BASE_MULTIPLE;
		}

		System.out.println("divide : " + divide);

		// ä¸??›´æ¯”å?æ?å·¦é?Šå?Œæ??³??Šç?„æ•¸å­?
		while (x > 0) {
			int left = x / divide;
			int right = x % 10;
			if (left != right) {
				return false;
			}
			// ?›¸ç­‰å?Œå??…§ç¸®ä??‹æ•¸å­—ï?Œç¹¼çºŒæ?”å??
			x = x % divide / BASE_MULTIPLE;
			// ?”±?–¼å·¦å³??„å…§ç¸®ä?? ¼ï¼Œé™¤?•¸?Ÿºåº•å??100??
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
