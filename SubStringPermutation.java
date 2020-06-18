package mock;

public class SubStringPermutation {
	public static boolean checkInclusion(final String s1, final String s2) {

		if (s2.length() < s1.length()) {
			return false;
		}
		int i = 0;
		while (i <= s2.length()) {
			if (s2.contains(rotateString(s1, i))) {
				return true;
			}
			i++;
		}

		return false;
	}

	private static CharSequence rotateString(final String s1, final int shiftCount) {

		final char[] charArray = s1.toCharArray();
		int i = 0;

		while (i < shiftCount) {
			UtilFunctions.rotate(charArray, 1);
			i++;
		}

		System.out.println("shiftCount: " + shiftCount + "--- value: " + String.valueOf(charArray));

		return java.nio.CharBuffer.wrap(charArray);
	}

	public static void main(final String[] args) {
		System.out.println("Answer: " + checkInclusion("adc", "dcda"));
	}
}
