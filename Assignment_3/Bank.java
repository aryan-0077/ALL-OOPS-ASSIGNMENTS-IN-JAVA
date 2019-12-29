class BankAccount
{
	private double balance;
	private int number_deposits;
	private int number_withdrawls;
	private double interest_rate;
	private int monthly_charge;
	private double amount_deposit;
		private double amount_withdrawl;
		private double monthly_interest;
		
		double getBalance()
		{
			return balance;
		}
		
		int getNumberWithdrawls()
		{
			return number_withdrawls;
		}
		
		int getNumberDeposits()
		{
			return number_deposits;
		}
		
		void setNumberDeposits(int n)
		{
			this.number_deposits=n;
		}
		
		void setNumberWithdrwa(int n)
		{
			this.number_withdrawls=n;
		}
		
		void setMonthlyCharge(int n)
		{
			this.monthly_charge=n;
		}
		
		int getMonthlycharge(){
			return monthly_charge;
		}
		
		double getInterestRate()
		{
			return interest_rate;
		}
		
	BankAccount(double balance, double interest_rate)
	{
		this.balance= balance;
		this.interest_rate = interest_rate;
	}
	
	void deposit(double amount_deposit)
	{	
		System.out.println("Deposited amount : "+ amount_deposit);
		this.amount_deposit= amount_deposit;
		this.balance= this.balance+this.amount_deposit;
		(this.number_deposits)++;
		
	}
	
	void withdraw(double amount_withdrawl)
	{
		System.out.println("Withdrawl amount : "+ amount_withdrawl);
		this.amount_withdrawl= amount_withdrawl;
		this.balance= this.balance-this.amount_withdrawl;
		(this.number_withdrawls)++;
		
	}
	
	void calcinterest()
	{
		this.monthly_interest=getInterestRate() * balance/12;
		this.balance= balance+this.monthly_interest;
		
	}
	
	void monthlyProcess(int monthly_charge)
	{
		this.monthly_charge=monthly_charge;
		this.balance=this.balance- monthly_charge;
		
		setNumberDeposits(0);
		setNumberWithdrwa(0);
		setMonthlyCharge(0);
			
	}
}

class SavingsAccount extends BankAccount{
	
	boolean status;
	
	SavingsAccount(double balance, double interest_rate)
	{
		super(balance, interest_rate);
	}
	
	boolean isActive()
	{
		if(getBalance() > 25)
			return true;
		
		else
			return false;
		
	}
	
	void withdraw(double amount_withdrawl)
	{	status=isActive();
		if(status==true)
			super.withdraw(amount_withdrawl);
		
		else
			System.out.println("Account is inactive.");
	
	}
	
	void deposit(double amount_deposit)
	{
		super.deposit(amount_deposit);
		
		status=isActive();
		
	}
	
	void MonthlyProcess()
	{
		if(getNumberWithdrawls() > 4)
		{
			monthlyProcess( getMonthlycharge() + 1) ;
		
		}
		status=isActive();
		
	}
	
	void display()
	{
		System.out.println("Balance : "+ getBalance()+ "\n"+ "Number of deposit : " + getNumberDeposits()+ "\n"+ "Get number of withdraw : "+ getNumberWithdrawls());
		
	}
	
	
}


class Bank{
	
	public static void main(String args[])
	{
		SavingsAccount s[]=new SavingsAccount[4];
		s[0]= new SavingsAccount(100, 10);
		s[1]=new SavingsAccount(21, 05);
		s[2]= new SavingsAccount(200, 15);
		s[3]=new  SavingsAccount(120, 04);
		
		s[0].display();
		s[0].calcinterest();
		s[0].deposit(50);
		s[0].withdraw(128);
		s[0].withdraw(10);
		s[0].display();
		
		s[1].display();
		s[1].calcinterest();
		s[1].deposit(40);
		s[1].withdraw(68);
		s[1].withdraw(80);
		s[1].display();
		
		
		s[2].display();
		s[2].calcinterest();
		s[2].deposit(50);
		s[2].withdraw(28);
		s[2].withdraw(70);
		s[2].display();
		
		s[3].display();
		s[3].calcinterest();
		s[3].deposit(59);
		s[3].withdraw(10);
		s[3].withdraw(23);
		s[3].display();
		
	}
	
}
		

