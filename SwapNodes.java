package mock;

import java.util.ArrayList;

import dataset.ListNode;

public class SwapNodes {
	class Solution {
		public ListNode swapPairs(final ListNode head) {
			ListNode newHead = head;

			final ArrayList<ListNode> allNodes = new ArrayList<>();

			while (newHead != null) {
				allNodes.add(newHead);
				newHead = newHead.next;
			}

			int temp;
			for (int i = 0; i < allNodes.size(); i = i + 2) {
				temp = allNodes.get(i).val;
				allNodes.get(i).val = allNodes.get(i + 1).val;
				allNodes.get(i + 1).val = temp;
			}

			return head;
		}
	}
}
