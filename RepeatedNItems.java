package test;

import java.util.HashMap;

public class RepeatedNItems {
	public int repeatedNTimes(final int[] A) {
		final HashMap<Integer, Integer> countMap = new HashMap<>();

		for (final int i : A) {
			countMap.put(i, countMap.getOrDefault(i, 0) + 1);
		}

		for (final int i : A) {
			if (countMap.get(i) == A.length / 2) {
				return i;
			}
		}

		return -1;
	}
}
