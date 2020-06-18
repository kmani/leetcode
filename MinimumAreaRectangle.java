package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinimumAreaRectangle {
	public int minAreaRect(final int[][] points) {

		final Map<Integer, List<Integer>> coordinates = new TreeMap<>();

		for (final int[] point : points) {
			final int x = point[0], y = point[1];
			coordinates.computeIfAbsent(x, z -> new ArrayList<>()).add(y);
		}

		int ans = Integer.MAX_VALUE;

		final Map<Integer, Integer> lastx = new HashMap<>();

		for (final int x : coordinates.keySet()) {
			final List<Integer> row = coordinates.get(x);

			Collections.sort(row);

			for (int i = 0; i < row.size(); ++i) {
				for (int j = i + 1; j < row.size(); ++j) {
					final int y1 = row.get(i), y2 = row.get(j);

					final int code = 40001 * y1 + y2;
					if (lastx.containsKey(code)) {
						ans = Math.min(ans, (x - lastx.get(code)) * (y2 - y1));
					}
					lastx.put(code, x);
				}
			}
		}

		return ans < Integer.MAX_VALUE ? ans : 0;
	}
}
