package mock;

public class UtilFunctions {

	public static void rotate(final char[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void reverse(final char[] nums, int start, int end) {
		while (start < end) {
			final char temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void shiftArray(final int[] arr, final int index) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		printArray(arr);
	}

	public static void shiftArray(final char[] arr, final int index) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		printArray(arr);
	}

	public static void printArray(final char[] arr) {

		for (final char element : arr) {
			System.out.print(element);
		}
		System.out.println();

	}

	public static void printArray(final int[] arr) {

		for (final int element : arr) {
			System.out.print(element);
		}
		System.out.println();

	}

	public static void main(final String[] args) {
		shiftArray(new int[] { 1, 2, 3, 4 }, 0);
	}
}
