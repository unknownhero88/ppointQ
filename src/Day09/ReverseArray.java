package Day09;

import java.util.Arrays;

public class ReverseArray {
	static int[] reverseArray(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// TODO: map the position backwards
			result[arr.length-i-1]=arr[i];
		}
		return result;
	}

	public static String reverseString(String s)
	{
		StringBuilder s1= new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			s1.append(s.charAt(s.length()-i-1));
		}
		return s1.toString();
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(reverseArray(new int[] { 10, 20, 30 })));
		System.out.println(Arrays.toString(reverseArray(new int[] { 7 })));
		System.out.println(reverseString("tnioPsremmargorP"));
		System.out.println(reverseString("olleH"));
	}
}