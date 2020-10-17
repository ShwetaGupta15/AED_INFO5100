package Assignment5;

public abstract class DessertItem 
{
	public String name;
	
	public DessertItem() 
	{
		System.out.println("Welocme to M & M Dessert Shoppe");
	}
		
	public DessertItem(String name) 
	{
		if (name.length() <= DessertShoppe.costWidht)
			this.name = name;
		else
			this.name = name.substring(0, DessertShoppe.costWidht);
	
	}
	
	public final String getName()
	{
		return name;
	}
	public abstract int getCost();
}