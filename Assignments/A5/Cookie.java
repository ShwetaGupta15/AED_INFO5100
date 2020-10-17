package Assignment5;


public class Cookie extends DessertItem
{
	private int number;
    private int pricePerDozen;
    private int cost;

    public Cookie(String name, int pricePerDozen, int number){
        super(name);
        this.pricePerDozen = pricePerDozen;
        this.number = number;
    }
    
    public int getNumber() 
    {
		return number;
	}

	public int getPricePerDozen() 
	{
		return pricePerDozen;
	}


    public int getCost(){
        return  (int)Math.round(number / 12 * pricePerDozen);
    }
}
