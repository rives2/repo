

public class CheckingAccount extends BankAccount
{
	private static final double FEE = .15;
	
	String accountNumber = getAccountNumber();
	
	public CheckingAccount(String name, double initial)
	{
		super(name, initial);
		setAccountNumber(accountNumber + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		
		return super.withdraw(amount + FEE);
	
	}
}


