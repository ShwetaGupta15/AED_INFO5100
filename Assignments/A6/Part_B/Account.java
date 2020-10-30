package PartB;

public class Account 
{
	protected String firstName;
	protected String lastName;
	protected double curBalance;
	
	public Account(String fName, String lName, double curBalance)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.curBalance = curBalance;
	}
	
	public String getAccType()
	{
		return this.getClass().getTypeName();
	}
	
	public double debitTransaction(double debitAccount)
	{
		System.out.println("\n\n$"+debitAccount+" has been debited from the Account");
		this.curBalance = this.curBalance - debitAccount;
		return curBalance;		
	}
	
	public double creditTransaction(double creditAccount)
	{
		System.out.println("\n\n$"+creditAccount+" has been credited to the Account");
		this.curBalance = this.curBalance + creditAccount;
		return this.curBalance;
	}
	
	public String toString()
	{
		return "Account Name : "+ this.firstName + " " + this.lastName + "\nAccount Type : "+ getAccType() +"\nBalance : "+this.curBalance;
	}
	
	
}
