package test;

public class WaterStorage {

	// Return the maximum water that can be stored
	static int maxWater(final int height[], final int n) {

		// To store the maximum water so far
		int max = 0;

		// Both the pointers are pointing at the first
		// and the last buildings respectively
		int i = 0, j = n - 1;

		// While the water can be stored between
		// the currently chosen buildings
		while (i < j) {

			// Update maximum water so far and increment i
			if (height[i] < height[j]) {
				max = Math.max(max, (j - i - 1) * height[i]);
				i++;
			}

			// Update maximum water so far and decrement j
			else if (height[j] < height[i]) {
				max = Math.max(max, (j - i - 1) * height[j]);
				j--;
			}

			// Any of the pointers can be updated (or both)
			else {
				max = Math.max(max, (j - i - 1) * height[i]);
				i++;
				j--;
			}
		}

		return max;
	}

	// Driver code
	public static void main(final String[] args) {
		final int height[] = { 2, 1, 3, 4, 6, 5 };
		final int n = height.length;

		System.out.print(maxWater(height, n));
	}
}