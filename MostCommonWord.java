package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {
	public String mostCommonWord(final String paragraph, final String[] banned) {
		final Set<String> bannedSet = new HashSet<>();
		final HashMap<String, Integer> map = new HashMap<>();

		final String[] words = paragraph.split(" ");
		final int max = Integer.MIN_VALUE;
		int current = 0;
		String result = null;

		for (String word : words) {
			word = word.toLowerCase();

			current = map.getOrDefault(word, 0) + 1;
			map.put(word, current);

			if (current > max && bannedSet.contains(word.toLowerCase())) {
				result = word;
			}
		}

		return "";
	}
}
