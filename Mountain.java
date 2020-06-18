package mock;

public class Mountain {
	public static int peakIndexInMountainArray(final int[] array) {
		int left = 0, right = array.length - 1, mid;
		while (left < right) {

			mid = (left + right) / 2;

			if (array[mid] < array[mid + 1]) {
				left = mid + 1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}

	public static void main(final String[] args) {
		System.out.println(peakIndexInMountainArray(new int[] { 0, 1, 2, 3, 2, 1 }));
	}

	public int findInMountainArray(final int target, final MountainArray mountainArr) {
		int peak;
		int answer = -1;

		int left = 0, right = MountainArray.length() - 1;
		int mid;
		int currentValue, nextValue;

		while (left < right) {
			mid = left + (right - left) / 2;
			currentValue = MountainArray.get(mid);
			nextValue = MountainArray.get(mid + 1);

			if (currentValue < nextValue) {
				left = mid + 1;
			}
			else {
				right = mid;
			}
		}

		peak = right;

		left = 0;
		right = peak;

		while (left < right) {
			mid = left + (right - left) / 2;
			currentValue = MountainArray.get(mid);

			if (currentValue == target) {
				answer = mid;
			}

			if (currentValue > target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}

		if (answer != -1) {
			return answer;
		}

		left = peak;
		right = MountainArray.length() - 1;

		while (left < right) {
			mid = left + (right - left) / 2;
			currentValue = MountainArray.get(mid);

			if (currentValue == target) {
				answer = mid;
			}

			if (currentValue > target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}

		return answer;
	}
}

class MountainArray {
	public static int get(final int index) {
		return 0;
	}

	public static int length() {
		return 0;
	}
}
