package PartC;

public class Pet 
{
	private String petName;
	private String ownerName;
	private String color;
	protected Integer sex; 	
	public static final int male = 1;
	public static final int female = 2;
	public static final int spayed = 3;
	public static final int neutered = 4;
	
	public Pet(String pName, String oName, String color)
	{
		this.petName = pName;
		this.ownerName = oName;
		this.color = color;
	}
	
	public String getPetName()
	{
		return this.petName;
	}
	
	public String getOwnerName()
	{
		return ownerName;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setSex(int sexId) throws Exception
	{
		if (sexId > 0 && sexId < 5)
			this.sex = sexId;
		else
			throw new Exception("Error in value for Sex! Please select value from 1 to 4.");
	}
	
	public String getSex() 
	{
		switch(this.sex)
		{
		case 1 : return "Male";
		case 2 : return "Female";
		case 3 : return "Spayed";
		case 4 : return "Neutered";
		default: return " ";
		}
	}
	
	public String toString()
	{
		System.out.println("****** PET DETAILS ******\n");
		return getPetName()+" Owned by " + getOwnerName()+"\nColor : "+getColor() + "\nSex   : "+ getSex();
	}
	//Main Method
	public static void main(String[] agrs) 
	{			
		Pet p = new Pet("Spot","Mary","Black & White");
		try {
			p.setSex(1);
			System.out.println(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}