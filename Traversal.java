package mock;

import java.util.ArrayList;
import java.util.List;

import dataset.TreeNode;

public class Traversal {
	public List<Integer> inorderTraversal(final TreeNode root) {
		final List<Integer> res = new ArrayList<>();
		// method 1: recursion

		helper(root, res);
		return res;
	}

	// helper function for method 1
	private void helper(final TreeNode root, final List<Integer> res) {
		if (root != null) {
			if (root.left != null) {
				helper(root.left, res);
			}
			res.add(root.val);
			if (root.right != null) {
				helper(root.right, res);
			}
		}
	}
}
