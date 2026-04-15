package Day09;

import java.util.*;

public class FindDuplicates {
	static List<Integer> findDuplicates(int[] arr) {
		List<Integer> seen = new ArrayList<>();
		List<Integer> duplicates = new ArrayList<>();
		for (int item : arr) {
			if (seen.contains(item) && !duplicates.contains(item)) {
				// TODO: add to duplicates
				duplicates.add(item);
			}
			// TODO: add to seen
			seen.add(item);
		}
		return duplicates;
	}

	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[] { 1, 2, 3, 2, 4, 3, 5 }));
		System.out.println(findDuplicates(new int[] { 1, 2, 3 }));
		System.out.println(findDuplicates(new int[] { 5, 5, 5, 5 }));
	}
}