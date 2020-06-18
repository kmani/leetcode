package test;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(final int[] nums, final int target) {
		final int[] dummy = nums;
		int[] dummyAnswer = new int[2];
		final int[] answer = new int[2];
		Arrays.sort(dummy);

		int i = 0;
		int j = nums.length - 1, sum = 0;

		while (i <= j) {
			sum = dummy[i] + dummy[j];

			if (sum == target) {
				dummyAnswer = new int[] { dummy[i], dummy[j] };
			}
			else if (sum > target) {
				j--;
			}
			else {
				i++;
			}
		}

		return null;
	}

	public static void main(final String[] args) {
		final int[] x = twoSum(new int[] { 3, 1, 2, 4, 5, 67, 7, 2, 1, 34, 6, 7 }, 101);

		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
