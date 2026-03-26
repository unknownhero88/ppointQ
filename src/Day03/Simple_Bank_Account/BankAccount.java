package Day03.Simple_Bank_Account;

public class BankAccount 
	{ 
		protected String name;
		protected double balance;
		public BankAccount(String name, double balance) 
			{ 
				// store name and balance 
				this.name=name;
				this.balance=balance;
			
			} 
		public void deposit(double amt) 
			{ 
				/* add to balance */ 
				balance+=amt;
				System.out.println("Deposited: "+amt+" | Balance: "+balance);
			} 
		public void withdraw(double amt) 
			{ 
				/* subtract if enough */ 
				if(amt>balance)
					System.out.println("Insufficient funds!");
				else
					{
						balance-=amt;
							System.out.println("Withdrawn: "+amt+" | Balance: "+balance);
					}
			} 
		public void display() 
			{ 
				System.out.println("Name : "+name+" | balance: "+balance);
			} 
	} 