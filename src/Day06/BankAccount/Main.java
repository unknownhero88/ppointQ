package Day06.BankAccount;

public class Main {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Rahul", 1000);
		acc.deposit(500);
		try {
			acc.withdraw(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			acc.withdraw(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		acc.statement();
	}
}