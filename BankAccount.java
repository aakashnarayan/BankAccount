package package1;

public class BankAccount 
{
	//fields
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	public BankAccount(String accountName, int accountNumber)
	{
		name = accountName;
		accNum = accountNumber;
		balance = 0;
	}
	public BankAccount(String accountName, int accountNumber, double startBalance)
	{
		name = accountName;
		accNum = accountNumber;
		balance = startBalance;
	}
	
	//methods
	public void deposit(double depositAmount)
	{
		balance+=depositAmount;
	}
	public void withdraw(double withdrawAmount)
	{
		balance-=withdrawAmount;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Account name is " + name + ", account number is " + accNum + ", and balance is " + balance + "." ;
	}
	}
