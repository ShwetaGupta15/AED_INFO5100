package Assignment5;

public class DessertShoppe 
{
	public final static float taxRate = 2; // 2% tax
	public final static String name = "M & M Dessert Shoppe";
	public final static int maxIteamNameSize = 20;
	public final static int costWidht = 10;
	
	public static String cents2dollarsAndCents(int cents) 
	{
		String s = "";
		
		if (cents < 0) {
			s += "-";
			cents *= -1;
		}
		
		int dollars = cents / 100;
		cents = cents % 100;
		
		if (dollars > 0) 
			s += dollars;
		
		s += ".";
		
		if (cents < 10)
			s += "0";
		
		s += cents;
		
		return s;
	}
	
	public  void main(String[] args) {
		System.out.println(DessertShoppe.name.length());
	}
	
	
	
}
