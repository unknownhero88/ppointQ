package Day06.BankAccount;

import java.util.ArrayList;

class BankAccount {
	String owner;
	double balance;
	ArrayList<String> history = new ArrayList<>();

	BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	void deposit(double amount) {
		this.balance += amount;
		history.add("+ ₹" + amount);
	}

	void withdraw(double amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			history.add("- ₹" + amount);
		} else {
			throw new IllegalArgumentException("Insufficient funds!");
		}
	}

	void statement() {
		System.out.println("── Statement: " + this.owner + " ──\r\n" + "Balance: ₹" + this.balance + "");
		for (String s : history)
			System.out.println(s);
	}
}
