package Day07;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> names = Arrays.asList("rahul", "PRIYA", "arjun", "SNEHA");

		// Write your stream pipelines below

		List<Integer> evens = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even: " + evens);

		List<Integer> squares = nums.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println("Squares: " + squares);

		int sum = nums.stream().mapToInt(x -> x).sum();
		System.out.println("Sum: " + sum);

		List<String> titleCase = names.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
				.collect(Collectors.toList());

		System.out.println("Names: " + titleCase);

		List<Integer> above5AndOdd = nums.stream().filter(x -> x > 5 && x % 2 != 0).collect(Collectors.toList());

		System.out.println("Above5 and odd: " + above5AndOdd);

	}
}
