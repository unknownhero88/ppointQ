package Day05;

public class Recursion {

    static int factorial(int n) {
        // base case: if n == 0 or n == 1, return 1
    	if(n==1||n==0) return 1;
        // recursive: return n * factorial(n - 1)
        return n*factorial(n-1);
    }

    static int countWays(int n) {
        // base case: n==0 or n==1 → return 1
    	if(n==1||n==0) return 1;
        // recursive: countWays(n-1) + countWays(n-2)
        return countWays(n-1)+countWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(countWays(1));
        System.out.println(countWays(3));
        System.out.println(countWays(5));
    }
}
