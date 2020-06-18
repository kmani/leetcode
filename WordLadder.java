package test;

import java.util.LinkedList;
import java.util.Set;

class WordNode {
	String word;
	int numSteps;

	public WordNode(final String word, final int numSteps) {
		this.word = word;
		this.numSteps = numSteps;
	}
}

public class WordLadder {
	public int ladderLength(final String beginWord, final String endWord, final Set<String> wordDict) {
		final LinkedList<WordNode> queue = new LinkedList<>();
		queue.add(new WordNode(beginWord, 1));

		wordDict.add(endWord);

		while (!queue.isEmpty()) {
			final WordNode top = queue.remove();
			final String word = top.word;

			if (word.equals(endWord)) {
				return top.numSteps;
			}

			final char[] arr = word.toCharArray();

			for (int i = 0; i < arr.length; i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					final char temp = arr[i];
					if (arr[i] != c) {
						arr[i] = c;
					}

					final String newWord = new String(arr);
					if (wordDict.contains(newWord)) {
						queue.add(new WordNode(newWord, top.numSteps + 1));
						wordDict.remove(newWord);
					}

					arr[i] = temp;
				}
			}
		}

		return 0;
	}
}