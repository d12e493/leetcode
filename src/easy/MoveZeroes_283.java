package easy;

import java.util.Arrays;

public class MoveZeroes_283 {

	public static void moveZeroes(int[] nums) {

		if (nums == null || nums.length == 0) {
			return;
		}

		int nonZeroIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			int currentNumber = nums[i];
			if (currentNumber != 0) {
				nums[nonZeroIndex] = currentNumber;
				nonZeroIndex++;
			}
		}
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] testArray = new int[] { 2, 1, 5, 0, 23, 14, 0, 7 };
		moveZeroes(testArray);
		System.out.println(Arrays.toString(testArray));
	}

}
