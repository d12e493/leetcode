package easy;

public class PalindromeNumber_9 {

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		final int BASE_MULTIPLE = 10;
		int divide = 1;
		// 計算要從幾位數開始
		while (x / divide >= BASE_MULTIPLE) {
			divide = divide * BASE_MULTIPLE;
		}

		System.out.println("divide : " + divide);

		// 一直比對最左邊和最右邊的數字
		while (x > 0) {
			int left = x / divide;
			int right = x % 10;
			if (left != right) {
				return false;
			}
			// 相等後往內縮一個數字，繼續比對
			x = x % divide / BASE_MULTIPLE;
			// 由於左右各內縮一格，除數基底小100倍
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
