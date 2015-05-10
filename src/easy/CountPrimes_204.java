package easy;

public class CountPrimes_204 {

	public static int countPrimes(int n) {

		if (n == 0 || n == 1) {
			return 0;
		}

		boolean[] flags = new boolean[n];

		flags[0] = true;
		flags[1] = true;

		for (int i = 2; i < n; i++) {
			if (flags[i]) {
				continue;
			} else {
				for (int j = 2; i * j < n; j++) {
					flags[i * j] = true;
				}
			}
		}

		int counts = 0;

		for (int i = 2; i < n; i++) {
			if (!flags[i]) {
				counts++;
			}
		}

		return counts;
	}

	public static void main(String[] args) {
		System.out.println(countPrimes(0));
		System.out.println(countPrimes(1));
		System.out.println(countPrimes(2));
		System.out.println(countPrimes(4));
		System.out.println(countPrimes(7));
	}

}
