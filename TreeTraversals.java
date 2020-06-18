package traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversals {
	public List<List<Integer>> levelOrder(final TreeNode root) {
		final Queue<TreeNode> queue = new LinkedList<>();
		final List<List<Integer>> wrapList = new LinkedList<>();

		if (root == null) {
			return wrapList;
		}

		queue.offer(root);
		while (!queue.isEmpty()) {
			final int levelNum = queue.size();
			final List<Integer> subList = new LinkedList<>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		return wrapList;
	}
}
