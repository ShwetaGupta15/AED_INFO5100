package Assignment5;

public class IceCream extends DessertItem
{
	protected int iceCreamCcost;

    public IceCream(String name, int iceCreamCcost){
        super(name);
        this.iceCreamCcost = iceCreamCcost;
    }

    public int getCost(){
        return  iceCreamCcost;
    }
}
