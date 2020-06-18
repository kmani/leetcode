package recurse;

public class Fibonacci {
	int[] array = new int[31];

	public Fibonacci() {
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
	}

	public int fib(final int N) {
		if (array[N] != -1) {
			return array[N];
		}

		int result;

		if (N < 2) {
			result = N;
		}
		else {
			result = fib(N - 1) + fib(N - 2);
		}

		array[N] = result;

		return array[N];
	}

	public static void main(final String[] args) {
		final Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.fib(6));
	}
}
