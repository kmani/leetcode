package traversal;

public class FloodFill {
	int maxRows;
	int maxCols;

	public int[][] floodFill(final int[][] image, final int row, final int column, final int newColor) {
		final int oldColor = image[row][column];
		maxRows = image.length;
		maxCols = image[0].length;

		helper(image, row, column, oldColor, newColor);
		return image;
	}

	private void helper(final int[][] image, final int row, final int column, final int oldColor, final int newColor) {

		if (row < 0 || row >= maxRows || column < 0 || column >= maxCols) {
			return;
		}

		if (image[row][column] == oldColor) {
			image[row][column] = newColor;
		}
		else {
			return;
		}

		helper(image, row, column + 1, oldColor, newColor);
		helper(image, row + 1, column, oldColor, newColor);
		helper(image, row, column - 1, oldColor, newColor);
		helper(image, row - 1, column, oldColor, newColor);
	}
}
