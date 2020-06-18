package mock;

import java.util.ArrayList;

public class AddDigits {
	public static int addDigits(final int num) {

		int result = helper(num);
		System.out.println("First: " + result);

		while (result >= 10) {
			result = helper(result);
		}

		return result;
	}

	private static Integer helper(int num) {
		final ArrayList<Integer> intList = new ArrayList<>();

		while (num >= 10) {
			intList.add(num % 10);
			num = num / 10;
		}

		intList.add(num);

		int result = 0;
		for (final Integer item : intList) {
			result += item;
		}

		System.out.println("Function: " + result);
		return result;
	}

	public static void main(final String[] args) {
		System.out.println(addDigits(1234));
	}
}
