package Assignment5;

public class CheckOut 
{
	private DessertItem[] dItem;
	private int numberOfItems;
	private final int reciept = 50;
	
	public CheckOut()
	{
		this.dItem = new DessertItem[50];
		this.numberOfItems = 0;
	}
	
	public int numberOfItems()
	{
		return numberOfItems;
	}
	
	public void enterItem(DessertItem d)
	{
		this.dItem[numberOfItems] =d;
		numberOfItems++;
	}
	public void clear()
	{
		for(int i = 0; i<this.numberOfItems; i++)
			this.dItem[i] = null;
		
		numberOfItems = 0;
	}
	
	public int totalCost ()
	{
		int sum = 0;
		for(int i = 0; i<this.numberOfItems; i++)
			sum += dItem[i].getCost();
				
		return sum;
	}
	public int totalTax() {
		return (int)Math.round(this.totalCost() * DessertShoppe.taxRate / 100.00);
	}
	
	
	public String toString() {
		String s = "";		
		
		
		s += "    " + DessertShoppe.name + "\n";
		s += "    " + "--------------------" + "\n";
		
		for(int j = 0; j < numberOfItems; j++)
		{
		
			String l = dItem[j].getName();		// items of every line
			
			String p = DessertShoppe.cents2dollarsAndCents(dItem[j].getCost());	// price of every item
			if (p.length() > DessertShoppe.costWidht)		// verify the price is within length
				p = p.substring(0, DessertShoppe.costWidht);
			
			if (dItem[j] instanceof IceCream) 
			{												// print if ice cream
				while(l.length() < this.reciept - p.length())
				{
					l += " ";
				}
				s += l + p + "\n";
			}
			else if (dItem[j] instanceof Sundae) {		// print if Sundae
				
				s += ((Sundae)dItem[j]).getToppingName() + " Sundae with\n";
				
				while(l.length() < this.reciept - p.length()){
					l += " ";
				}
				s += l + p + "\n";
			}
			else if (dItem[j] instanceof Candy){		// print if Candy
				s += ((Candy) dItem[j]).getWeight() + " lbs @ " + 
						DessertShoppe.cents2dollarsAndCents(((Candy) dItem[j]).getPricePerPound()) + " /lb.\n";
				
				while(l.length() < this.reciept - p.length()){
					l += " ";
				}
				s += l + p + "\n";	
			}
			else {		// print if Cookie
				s += ((Cookie)dItem[j]).getNumber() + " @ " + 
						DessertShoppe.cents2dollarsAndCents(((Cookie)dItem[j]).getPricePerDozen()) + " /dz\n";
				
				while(l.length() < this.reciept - p.length()){
					l += " ";
				}
				s += l + p + "\n";			
			}	
		}
		
		String line = "\nTax";		
		String tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());	// print tax
		while(line.length() <= this.reciept - tax.length())
			line += " ";
		s += line + tax;
		
		String totalCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());	// print total cost
		line = "\nTotal Cost";
		while(line.length() <= this.reciept - totalCost.length())
			line += " ";
		s += line + totalCost;
	
		return s;
	}
}

