package mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SpellChecker {
	public String[] spellchecker(final String[] wordlist, final String[] queries) {
		final Set<String> words = new HashSet<>(Arrays.asList(wordlist));

		final HashMap<String, String> cap = new HashMap<>();
		final HashMap<String, String> vowel = new HashMap<>();

		for (final String w : wordlist) {
			final String lower = w.toLowerCase(), devowel = lower.replaceAll("[aeiou]", "#");
			cap.putIfAbsent(lower, w);
			vowel.putIfAbsent(devowel, w);
		}
		for (int i = 0; i < queries.length; ++i) {
			if (words.contains(queries[i])) {
				continue;
			}
			final String lower = queries[i].toLowerCase(), devowel = lower.replaceAll("[aeiou]", "#");
			if (cap.containsKey(lower)) {
				queries[i] = cap.get(lower);
			}
			else if (vowel.containsKey(devowel)) {
				queries[i] = vowel.get(devowel);
			}
			else {
				queries[i] = "";
			}
		}
		return queries;
	}
}
