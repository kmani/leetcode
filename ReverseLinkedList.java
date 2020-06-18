package mock;

import dataset.ListNode;

public class ReverseLinkedList {
	public ListNode reverseList(final ListNode head) {
		/* recursive solution */
		return reverseListInt(head, null);
	}

	private ListNode reverseListInt(final ListNode head, final ListNode previous) {
		if (head == null) {
			return previous;
		}
		final ListNode next = head.next;
		head.next = previous;
		return reverseListInt(next, head);
	}
}
