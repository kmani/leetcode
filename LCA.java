package mock;

import dataset.TreeNode;

public class LCA {
	public TreeNode lowestCommonAncestor(final TreeNode root, final TreeNode p, final TreeNode q) {
		if (root == null) {
			return root;
		}

		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		}

		if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}

		return root;
	}
}
