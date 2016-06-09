package com.davis.level.easy;

public class AddDigits_258 {

	/**
	 * in	out
	 * 0	0
	 * 1	1
	 * 2	2
	 * 3	3
	 * 4	4
	 * 5	5
	 * 6	6
	 * 7	7
	 * 8	8
	 * 9	9
	 * 10	1
	 * 11	2
	 * 12	3
	 * 13	4
	 * 14	5
	 * 15	6
	 * 16	7
	 * 17	8
	 * 18	9
	 * 19	1
	 * 20	2
	 */
	
	public static int addDigits(int num) {
		if (num == 0) {
			return 0;
		} else {
			return (num - 1) % 9 + 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(addDigits(357));
	}

}
