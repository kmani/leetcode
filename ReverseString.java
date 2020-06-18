package mock;

import java.util.ArrayList;

public class ReverseString {
	public static String reverseWords(final String s) {
		if (s.isEmpty()) {
			return s;
		}

		final String[] words = s.split(" ");
		final ArrayList<String> newWords = new ArrayList<>();

		for (final String word : words) {
			newWords.add(reverseString(word));
		}

		String result = "";

		for (final String word : newWords) {
			result = result.concat(" " + word);
		}

		return result.substring(1, result.length());
	}

	public static void main(final String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	private static String reverseString(final String word) {
		if (word.isEmpty()) {
			return word;
		}

		final char[] charArray = word.toCharArray();

		char temp;
		int i = 0;
		int j = charArray.length - 1;

		final boolean isOdd = word.length() % 2 == 1;

		while (true) {
			if (isOdd && i == j || i > j) {
				break;
			}

			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;

			i++;
			j--;
		}

		return String.valueOf(charArray);
	}
}
