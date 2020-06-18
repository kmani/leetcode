package recurse;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<Integer> getRow(final int rowIndex) {
		if (rowIndex == 0) {
			final List<Integer> r = new ArrayList<>();
			r.add(1);
			return r;
		}
		if (rowIndex == 1) {
			final List<Integer> r = new ArrayList<>();
			r.add(1);
			r.add(1);
			return r;
		}

		final List<Integer> oldRow = getRow(rowIndex - 1);
		final List<Integer> newRow = new ArrayList<>();
		newRow.add(1);
		for (int i = 0; i < oldRow.size() - 1; i++) {
			newRow.add(oldRow.get(i) + oldRow.get(i + 1));
		}
		newRow.add(1);
		return newRow;

	}
}
