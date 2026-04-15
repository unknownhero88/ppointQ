package Day08;

public class Compress {
	static String compress(String s) {
		if (s.isEmpty())
			return "";
		StringBuilder sb = new StringBuilder();
		int count=1;
		// TODO: Iterate through 's', count consecutive characters
		// TODO: Append the character and its count (if > 1) to 'sb'
		// TODO: Don't forget to handle the final sequence of characters!
		for (int i = 1; i < s.length(); i++) {
	        if (s.charAt(i) == s.charAt(i - 1)) {
	            count++;
	        } else {
	            sb.append(s.charAt(i - 1));
	            if (count > 1) sb.append(count);
	            count = 1;
	        }
	    }

	    // Handle last group
	    sb.append(s.charAt(s.length() - 1));
	    if (count > 1) sb.append(count);

	    String compressed = sb.toString();
		return compressed.length()<s.length()?compressed:s; // Update this to return the shorter of the two
	}

	public static void main(String[] args) {
		String[] words = { "aabcccdddd", "abcd", "aaabba", "aaaaaa" };
		for (String w : words)
			System.out.println('"' + w + "\" → \"" + compress(w) + '"');
	}
}