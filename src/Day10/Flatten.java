package Day10;

import java.util.*;

public class Flatten {

	static List<Integer> flatten(List<Object> nested) {
		List<Integer> result = new ArrayList<>();
		// TODO: loop through nested

		for (Object i : nested) {
			// if item is an Integer, add it directly
			if (i instanceof Integer n) {
				result.add(n);
			}
			// if item is a List, loop through its elements and add each
			else {
				List<Integer> li = (List<Integer>) i;
				for (Integer j : li) {
					result.add(j);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(flatten(Arrays.asList(1, Arrays.asList(2, 3), 4, Arrays.asList(5, 6))));
		System.out.println(flatten(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6))));
		System.out.println(flatten(Arrays.asList(1, 2, 3)));
		System.out.println(flatten(Collections.emptyList()));
	}
}