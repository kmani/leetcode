package mock;

import java.util.HashMap;
import java.util.Stack;

public class FreqStack {
	HashMap<Integer, Integer> freq = new HashMap<>();
	HashMap<Integer, Stack<Integer>> m = new HashMap<>();
	int maxfreq = 0;

	public void push(final int x) {
		final int f = freq.getOrDefault(x, 0) + 1;
		freq.put(x, f);
		maxfreq = Math.max(maxfreq, f);
		if (!m.containsKey(f)) {
			m.put(f, new Stack<Integer>());
		}
		m.get(f).add(x);
	}

	public int pop() {
		final int x = m.get(maxfreq).pop();
		freq.put(x, maxfreq - 1);
		if (m.get(maxfreq).size() == 0) {
			maxfreq--;
		}
		return x;
	}
}