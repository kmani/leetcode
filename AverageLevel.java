package traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {
	public List<Double> averageOfLevels(final TreeNode root) {

		final Queue<TreeNode> queueLevelNodes = new LinkedList<>();
		final List<Double> answer = new ArrayList<>();

		double levelSum = 0;
		double levelAverage;
		int size = 0;

		TreeNode node;

		queueLevelNodes.offer(root);

		while (!queueLevelNodes.isEmpty()) {
			levelSum = 0;
			size = queueLevelNodes.size();

			for (int i = 0; i < size; i++) {
				node = queueLevelNodes.poll();

				if (node.left != null) {
					queueLevelNodes.offer(node.left);
				}

				if (node.right != null) {
					queueLevelNodes.offer(node.right);
				}

				levelSum = levelSum + node.val;
			}

			levelAverage = levelSum / size;
			answer.add(levelAverage);
		}

		return answer;
	}
}
