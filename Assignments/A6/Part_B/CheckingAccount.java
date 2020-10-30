package PartB;

public class CheckingAccount extends Account
{
	private final double minBal = 500;
	private final double fee = 100;
	
	public CheckingAccount(String fName, String lName, double cb)
	{
		super(fName,lName,cb);
	}
	
	@Override
	public double debitTransaction(double debitAccount)
	{
		chargeFee();
		super.debitTransaction(debitAccount);
		return curBalance;				
	}
	
	@Override
	public double creditTransaction(double creditAccount)
	{
		
		chargeFee();
		super.creditTransaction(creditAccount);
		return curBalance;
	}
	
	private void chargeFee()
	{
		if(this.curBalance < minBal)
			{
			this.curBalance = this.curBalance - fee;
			System.out.println("Low Balance - Extra fees Charged of $"+fee);
			System.out.println("Total Balance after Penalty :$ "+this.curBalance);
			}
	}
	
}
