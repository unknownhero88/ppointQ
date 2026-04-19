package Day10;

import java.util.*;

public class Fibonacci {

	static List<Integer> fibonacci(int n) {
		if (n <= 0)
			return new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		result.add(0);
		if (n == 1)
			return result;
		result.add(1);
		// TODO: loop to generate the remaining n-2 numbers
		for (int i = 2; i < n; i++) {
			result.add(result.get(i - 1) + result.get(i - 2));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(8));
		System.out.println(fibonacci(10));
	}
}