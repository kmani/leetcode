package test;

import dataset.TreeNode;

public class FlattenTreeNode {
	public void flatten(final TreeNode root) {
		flatten(root, null);
	}

	private TreeNode flatten(final TreeNode root, TreeNode pre) {
		if (root == null) {
			return pre;
		}
		pre = flatten(root.right, pre);
		pre = flatten(root.left, pre);

		root.right = pre;
		root.left = null;
		pre = root;
		return pre;
	}
}
