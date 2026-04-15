package Day08;

import java.util.*;

public class BracketChecker {
	static boolean isBalanced(String s) {
//		System.out.println(s);
		Deque<Character> stack = new ArrayDeque<>();
		for (char ch : s.toCharArray()) {
			if ("([{".indexOf(ch) >= 0) {
				stack.push(ch);
			} else if (")]}".indexOf(ch) >= 0) {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				// TODO: check if top matches the closing bracket
				if ((ch == ')' && top != '(') ||
	                    (ch == ']' && top != '[') ||
	                    (ch == '}' && top != '{')) {
	                    return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String[] tests = { "(())", "([{}])", "(()", "([)]", "","({[]})" };
		for (String t : tests)
			System.out.print('"' + t + '"' + " → " + isBalanced(t)+" ");
	}
}
