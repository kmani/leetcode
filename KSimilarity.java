package hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KSimilarity {
	public int kSimilarity(final String A, final String B) {

		final Queue<String> queue = new LinkedList<>();
		final Set<String> visited = new HashSet<>();
		queue.offer(A);
		visited.add(A);
		int level = 0;

		while (!queue.isEmpty()) {
			final int size = queue.size();
			for (int i = 0; i < size; i++) {
				final String currentNode = queue.poll();

				if (currentNode.equals(B)) {
					return level;
				}

				for (final String neighbour : getNeighbours(currentNode, B)) {
					if (!visited.contains(neighbour)) {
						queue.offer(neighbour);
						visited.add(neighbour);
					}
				}
			}
			level++;
		}

		return -1;
	}

	private List<String> getNeighbours(final String S, final String B) {

		final List<String> result = new ArrayList<>();
		final char[] sourceCharArray = S.toCharArray();

		int i = 0;
		for (i = 0; i < sourceCharArray.length; i++) {
			if (sourceCharArray[i] != B.charAt(i)) {
				break;
			}
		}

		for (int j = i + 1; j < sourceCharArray.length; j++) {
			if (sourceCharArray[j] == B.charAt(i)) {
				swap(sourceCharArray, i, j);
				result.add(new String(sourceCharArray));
				swap(sourceCharArray, i, j);
			}
		}

		return result;
	}

	private void swap(final char[] arr, final int i, final int j) {

		final char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
