package mock;

public class SearchRotatedArray {
	public int search(final int[] nums, final int target) {

		final int low = 0, high = nums.length;
		int mid = 0;

		while (low < high) {
			mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid;
			}

		}
		return 0;
	}
}
