package easy;

public class NumberOf1Bits_191 {

	public static int hammingWeight(int n) {

		int count = 0;

		while (n != 0) {
			count += n & 1;
			n = n >>> 1;
		}

		return count;
	}

	public static void main(String[] args) {
		int a = 00010011;
		int b = 0010;
		System.out.println(a & 1);
		System.out.println(b);
		System.out.println(hammingWeight(a));
		System.out.println(hammingWeight(b));
	}

}
