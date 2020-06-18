package medium;

public class CustomSort {
	public String customSortString(final String S, final String T) {
		final int[] count = new int[26];

		for (final char c : T.toCharArray()) {
			++count[c - 'a'];
		} // count each char in T.

		final StringBuilder sb = new StringBuilder();

		for (final char c : S.toCharArray()) {
			while (count[c - 'a']-- > 0) {
				sb.append(c);
			} // sort chars both in T and S by the order of S.
		}

		for (char c = 'a'; c <= 'z'; ++c) {
			while (count[c - 'a']-- > 0) {
				sb.append(c);
			} // group chars in T but not in S.
		}
		return sb.toString();
	}
}
