package Day04;

public class ATM {

    static int withdraw(int balance, int amount) {
        try {
        	if(amount<=0) 
        		throw new IllegalArgumentException("Invalid amount!");
        	if(amount>balance)
        		throw new IllegalArgumentException("Insufficient funds!");
        	balance-=amount;
        	System.out.println("Withdrew ₹"+amount+". New balance: ₹"+balance);
        }catch(IllegalArgumentException e) {
			System.out.println( e.getMessage());
			return balance;
		}
        return balance;
    }

    public static void main(String[] args) {
        int balance = 5000;
        System.out.println("Welcome! Balance: ₹" + balance);
        balance = withdraw(balance, 1000);  // normal
        balance = withdraw(balance, 9999);  // over balance
        balance = withdraw(balance, -500);  // negative
        balance = withdraw(balance, 0);     // zero
    }
}
