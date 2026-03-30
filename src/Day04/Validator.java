package Day04;

public class Validator {

	public static boolean isShort(String username) {
		return username.length() < 5;
	}
	public static boolean isLong(String username) {
		return username.length() > 15;
	}
	public static boolean startsWithLetter(String username) {
		return Character.isLetter(username.charAt(0));
	}
	public static boolean isValidCharacter(char c) {
		return Character.isLetterOrDigit(c) || c == '_';
	}
	public static boolean hasOnlyValidCharacters(String username) {
		char[] chars = username.toCharArray();
		for(char c:chars)
			{
				if(!isValidCharacter(c))
				{
					return false;
				}
			}
		return true;
	}
    static String validateUsername(String username) {
    	if (isShort(username)) {
			return "Too short!";
		} else if (isLong(username)) {
			return "Too long!";
		} else if (!startsWithLetter(username)) {
			return "Must start with a letter!";
		} else if (!hasOnlyValidCharacters(username)) {
			return "Only letters, digits, underscores allowed!";
		} else {
			return "Valid username! ✓";
		}
    }

    public static void main(String[] args) {
        System.out.println(validateUsername("rahul_99"));
        System.out.println(validateUsername("hi"));
        System.out.println(validateUsername("99abc"));
        System.out.println(validateUsername("hello world"));
        System.out.println(validateUsername("this_username_is_way_too_long_bro"));
    }
}