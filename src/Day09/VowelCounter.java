package Day09;

public class VowelCounter {
	static int countVowels(String sentence) {
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (char ch : sentence.toCharArray()) {
			if (vowels.contains(String.valueOf(ch))) {
				// TODO: increment count
				count++;
			}
		}
		// TODO: return count
		return count;
	}
	
	public static int countConsonants(String s)
	{
		String vowels="aeiouAEIOU";
		int count=0;
		for(char ch : s.toCharArray())
		{
			if(!vowels.contains(String.valueOf(ch))&& Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] sentences = { "Hello World", "Python is fun", "aeiou", "rhythm" };
		// TODO: loop through sentences and print results
		for(String s:sentences)
		{
			System.out.println(s+" → "+countVowels(s)+" vowels");
		}
		for(String s:sentences)
		{
			System.out.println(s+" → "+countConsonants(s)+" Consonants");
		}
		
	}
}
