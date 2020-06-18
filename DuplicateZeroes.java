package mock;

public class DuplicateZeroes {
	public static void main(final String[] args) {
		duplicateZeros(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 });
	}

	public static void duplicateZeros(final int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				UtilFunctions.shiftArray(arr, i + 1);
				if (i != arr.length - 1) {
					arr[i + 1] = 0;
					i++;
				}
			}
		}
	}
}
