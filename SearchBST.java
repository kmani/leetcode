package recurse;

import dataset.TreeNode;

public class SearchBST {
	public TreeNode searchBST(final TreeNode root, final int val) {
		if (root == null || root.val == val) {
			return root;
		}

		if (root.val > val) {
			return searchBST(root.left, val);
		}
		else {
			return searchBST(root.right, val);
		}
	}
}
