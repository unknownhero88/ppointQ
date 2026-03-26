package Day03.Simple_Bank_Account;

class SavingsAccount extends BankAccount 
	{ 
		public SavingsAccount(String name, double balance)
			{ 
				super(name, balance); // call parent constructor 
			} 
		public void addInterest() 
			{ 
				/* add 5% interest */ 
				double intrest = balance*0.5;
				balance+=intrest;
				System.out.println("Interest added! New balance: "+balance);
			} 
	}