package Day07;

public class NumberClassifier {

	static boolean isPalindrome(int n) {
		int len = 0;
		int temp = n;
		int s = 0;
		while (n > 0) {
			int r = n % 10;
			s = s * 10 + r;
			n /= 10;
			len++;
		}
		if (len == 1)
			return false;
		return temp == s; // compare string form with its reverse
	}

	static boolean isArmstrong(int n) {

		int len = 0;

		int temp = n;
		while (n > 0) {
			n /= 10;
			len++;
		}
		if (len == 1)
			return false;
		n = temp;
		int s = 0;
		while (n > 0) {
			int r = n % 10;
			s = (int) ((int) s + Math.pow(r, len));
			n /= 10;
		}

		return temp == s; // digit ^ numDigits, sum == n
	}

	static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;

		else {
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;
			return true;
		}
//		return false; // check divisors 2..sqrt(n)
	}

	public static void main(String[] args) {
		int[] nums = { 2, 11, 121, 153, 370, 1634 };
		for (int n : nums) {
			System.out.print(n + ": ");
			if (isPalindrome(n))
				System.out.print("Palindrome ");
			if (isArmstrong(n))
				System.out.print("Armstrong ");
			if (isPrime(n))
				System.out.print("Prime");
			System.out.println();
		}
	}
}
