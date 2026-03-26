package Day03.Simple_Bank_Account;

public class Main {

	public static void main(String[] args) 
		{ 
			SavingsAccount acc = new SavingsAccount("Rahul", 1000); 
			acc.display(); 
			acc.deposit(500); 
			acc.withdraw(200); 
			acc.withdraw(2000);
			acc.addInterest(); 
			acc.display(); 
		}
}
