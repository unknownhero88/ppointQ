package Day06;

public class Caesar {
	  static String encrypt(String text, int shift) {
	      StringBuilder sb = new StringBuilder();
	      for (char c : text.toCharArray()) {
	          if (Character.isUpperCase(c))
	              sb.append((char)('A' + (c - 'A' + shift) % 26));
	          else if (Character.isLowerCase(c))
	              sb.append((char)('a'+(c-'a'+shift)%26));
	          else
	              sb.append(c);
	      }
	      return sb.toString();
	  }
	  static String decrypt(String text, int shift) {
	      return encrypt(text, 26 - shift); // decrypt = shift backwards
	  }
	  public static void main(String[] args) {
	      System.out.println(encrypt("Hello World", 3));
	      System.out.println(decrypt("Khoor Zruog", 3));
	  }
	}
