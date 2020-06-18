package mock;

import dataset.ListNode;

public class RemoveValueFromLinkedList {
	public static ListNode removeElements(ListNode head, final int val) {

		ListNode temp;
		if (head == null) {
			return null;
		}

		while (head.val == val) {
			temp = head.next;
			head.next = null;
			head = temp;

			if (head == null) {
				return null;
			}
		}

		ListNode current = head;
		ListNode prev = head;

		while (true) {
			if (current == null) {
				break;
			}

			if (current.val == val) {
				prev.next = current.next;
				current.next = null;
				current = prev.next;
			}
			else {
				prev = current;
				current = current.next;
			}
		}

		return head;
	}

	public static void main(final String[] args) {
		final ListNode l1 = new ListNode(1);
		final ListNode l2 = new ListNode(2);
		final ListNode l3 = new ListNode(34);
		final ListNode l4 = new ListNode(1);
		final ListNode l5 = new ListNode(34);
		final ListNode l6 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;

		final ListNode answer = removeElements(l1, 34);
		answer.print();
	}
}

// // System.out.println("current: " + current.val);
//
// if (current.next.val == val) {
// // System.out.println("toRemove: " + current.next.val);
//
// toRemove = current.next;
// current.next = toRemove.next;
// toRemove.next = null;
// }
//
// current = current.next;