package Assignment5;

public class Sundae extends IceCream
{
	private String toppingName;
    private int topingCost;
    private int totalCost;

    public Sundae(String iceCreamName, int iceCreamCost, String toppingName, int topingCost)
    {
        super(iceCreamName, iceCreamCost);
        this.toppingName = toppingName;
        this.topingCost = topingCost; 
    }

	public int getCost()
	{
		totalCost = super.getCost()+this.topingCost ;
		return totalCost;
	}
	
	public String getToppingName()
	{
		return toppingName;
	}
	  
}
