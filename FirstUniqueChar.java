package mock;

import java.util.HashMap;

public class FirstUniqueChar {
	public int firstUniqChar(final String s) {
		final HashMap<Character, Integer> valueMap = new HashMap<>();

		for (final Character character : s.toCharArray()) {
			valueMap.put(character, valueMap.getOrDefault(character, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (valueMap.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}
}
