package Assignment5;

public class Candy extends DessertItem
{
	private double weight;
	private int pricePerPound;
	private int cost;
	
	public Candy(String name, double weight, double pricePerPouund)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	public int getCost()
	{
		cost = (int)Math.round(this.weight * this.pricePerPound);
		return cost;
	}
	
	public int getPricePerPound() 
	{
		return pricePerPound;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}
