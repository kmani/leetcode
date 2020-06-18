package mock;

public class ValidMountain {
	public static boolean validMountainArray(final int[] values) {
		boolean isIncreasing = true;
		boolean hasIncreased = false;
		boolean hasDecreased = false;
		boolean isDecreasing = false;

		if (values.length < 3) {
			return false;
		}

		for (int i = 1; i < values.length; i++) {
			if (values[i] > values[i - 1] && isIncreasing) {
				hasIncreased = true;
				System.out.println("Increasing: " + (i - 1) + " to " + i);
			}
			else if (values[i] < values[i - 1] && isDecreasing) {
				hasDecreased = true;
				System.out.println("Decreasing: " + (i - 1) + " to " + i);
			}
			else if (values[i] < values[i - 1] && !isDecreasing && isIncreasing) {
				isIncreasing = false;
				isDecreasing = true;
				hasDecreased = true;
				System.out.println("Changing: " + (i - 1) + " to " + i);
			}
			else {
				return false;
			}
		}

		if (!isIncreasing && isDecreasing && hasDecreased && hasIncreased) {
			return true;
		}
		return false;
	}

	public static void main(final String[] args) {
		System.out.println("Answer: " + validMountainArray(new int[] { 1, 3, 2 }));
	}
}
