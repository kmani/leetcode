package test;

import dataset.ListNode;

public class AddNumberFromList {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String value1 = "";
		String value2 = "";

		while (l1 != null) {
			value1 = value1.concat(String.valueOf(l1.val));
			l1 = l1.next;
		}

		value1 = reverseString(value1);

		final double x = Double.parseDouble(value1);

		while (l2 != null) {
			value2 = value2.concat(String.valueOf(l2.val));
			l2 = l2.next;
		}

		value2 = reverseString(value2);

		final double y = Double.parseDouble(value2);

		String result = String.format("%.0f", x + y);

		result = reverseString(result);

		System.out.println("result " + result);

		final ListNode head = new ListNode(Integer.parseInt(result.substring(0, 1)));
		ListNode current = head;

		for (int i = 1; i < result.length(); i++) {
			final ListNode nextNode = new ListNode(Integer.parseInt(result.substring(i, i + 1)));
			current.next = nextNode;
			current = current.next;
		}

		return head;
	}

	public static void main(final String[] args) {
	}

	private static String reverseString(final String word) {
		if (word.isEmpty()) {
			return word;
		}

		final char[] charArray = word.toCharArray();

		char temp;
		int i = 0;
		int j = charArray.length - 1;

		final boolean isOdd = word.length() % 2 == 1;

		while (true) {
			if (isOdd && i == j || i > j) {
				break;
			}

			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;

			i++;
			j--;
		}

		return String.valueOf(charArray);
	}
}
