package Day10;

import java.util.Arrays;

public class AnagramChecker {

	static String removeSpaces(String s) {

		s = s.trim();
		StringBuilder s1 = new StringBuilder();
		for (Character ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {
				s1.append(ch);
			}
		}
		s = s1.toString().toLowerCase();
		return s;
	}

	static char[] sortString(String s) {

		char[] chArr = s.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			for (int j = i + 1; j < chArr.length; j++) {
				if (chArr[i] < chArr[j]) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;
				}
			}
		}
		return chArr;
	}

	static boolean isAnagram(String s1, String s2) {
		// TODO: remove spaces and convert both to the same case
		s1 = removeSpaces(s1);

		s2 = removeSpaces(s2);

		if (s1.length() != s2.length())
			return false;
		// TODO: convert each String to a char[] and sort it
		char[] chArr1 = sortString(s1);
		char[] chArr2 = sortString(s2);

		// TODO: compare the two sorted arrays and return the result
		s1 = String.copyValueOf(chArr1);
		s2 = String.copyValueOf(chArr2);

		return s1.equals(s2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("hello", "world"));
		System.out.println(isAnagram("Astronomer", "Moon starer"));
		System.out.println(isAnagram("abc", "ab"));
		System.out.println(isAnagram("", ""));
	}
}