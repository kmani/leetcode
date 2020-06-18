package recurse;

import java.util.HashMap;

public class ClimbStairs {
	HashMap<Integer, Integer> map = new HashMap<>();

	public int climbStairs(final int n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}

		int result;

		if (n < 3) {
			result = n;
		}
		else {
			result = climbStairs(n - 1) + climbStairs(n - 2);
		}

		map.put(n, result);

		return result;
	}
}
