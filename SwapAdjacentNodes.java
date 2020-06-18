package recurse;

import dataset.ListNode;

public class SwapAdjacentNodes {
	public ListNode swapPairs(ListNode head) {

		if (head != null && head.next != null) {
			return head;
		}

		final ListNode temp = head;

		head = head.next;
		head.next = temp;

		head.next.next = swapPairs(head.next.next);
		return head;

	}
}
