

public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private String savingsNumber = "0";
	private String accountNumber;
	
	
	public SavingsAccount (String name, double initial)
	{
		super(name, initial);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber; 
	}
	
	public void postInterest()
	{
		double interest = (super.getBalance() * rate) / 12;
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	 public SavingsAccount(SavingsAccount savings, double initial)
	 {
		 super(savings, initial);
		 savingsNumber = "1";
		 accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	 }
	
	 
}
