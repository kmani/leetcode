package mock;

import java.util.ArrayList;

import dataset.TreeNode;

public class KthSmallestBST {
	public ArrayList<Integer> inorder(final TreeNode root, final ArrayList<Integer> arr) {
		if (root == null) {
			return arr;
		}

		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);

		return arr;
	}

	public int kthSmallest(final TreeNode root, final int k) {
		final ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
		return nums.get(k - 1);
	}
}
