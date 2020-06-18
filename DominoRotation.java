package mock;

public class DominoRotation {
	public static int minDominoRotations(final int[] A, final int[] B) {
		if (A.length != B.length) {
			return -1;
		}

		final int[] countA = new int[7]; // countA[i] records the occurrence of i in A.
		final int[] countB = new int[7]; // countB[i] records the occurrence of i in B.
		final int[] same = new int[7]; // same[k] records the occurrence of k, where k == A[i] == B[i].

		for (int i = 0; i < A.length; ++i) {
			++countA[A[i]];
			++countB[B[i]];
			if (A[i] == B[i]) {
				++same[A[i]];
			}
		}

		UtilFunctions.printArray(countA);
		UtilFunctions.printArray(countB);
		UtilFunctions.printArray(same);

		for (int i = 1; i < 7; ++i) {
			if (countA[i] + countB[i] - same[i] >= A.length) {
				return Math.min(countA[i], countB[i]) - same[i];
			}
		}
		return -1;
	}

	public static void main(final String[] args) {
		final int[] A = new int[] { 2, 1, 2, 4, 2, 2 }, B = new int[] { 5, 2, 6, 2, 3, 2 };

		System.out.println(minDominoRotations(A, B));
	}
}
