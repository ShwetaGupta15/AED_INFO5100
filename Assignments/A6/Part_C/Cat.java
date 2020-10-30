package PartC;

import java.util.Calendar;
public class Cat extends Pet implements Boardable
{
	private String hairLength;
	private int startMonth, endMonth;
	private int startDay, endDay;
	private int startYear, endYear;
	
	public Cat(String pName, String oName, String color, String hairLength) 
	{
		super(pName, oName, color);
		this.hairLength = hairLength;
	}

	public String getHairLength()
	{
		return this.hairLength;
	}
	
	public String toString()
	{
		return getClass().getSimpleName().toUpperCase()+":\n"+getPetName()+" Owned by "+getOwnerName()+"\nColor : " +getColor()+ "\nSex : " + getSex()+ "\nHair : "+getHairLength(); 
	}
	@Override
	public void setBoardStart(int year, int month, int day) 
	{
		// TODO Auto-generated method stub
		this.startDay = day;
		this.startMonth = month;
		this.startYear = year;
	}

	@Override
	public void setBoardEnd(int year, int month, int day) 
	{
		// TODO Auto-generated method stub
		this.endDay = day;
		this.endMonth = month;
		this.endYear = year;
	}

	@Override
	public boolean boarding(int year, int month, int day) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		
		Calendar calStart = Calendar.getInstance();
		calStart.set(startYear,startMonth,startDay);
		
		
		Calendar calEnd = Calendar.getInstance();
		calEnd.set(endYear,endMonth,endDay );
		
		
		if(((cal.compareTo(calStart)>0)&&(cal.compareTo(calEnd)<0))||((cal.compareTo(calStart)==0)&&(cal.compareTo(calEnd)==0)))  // the given data is between start date and end date.
			return true;
		else 
			return false;
	}

	// main
	public static void main(String[] args)
	{
		
		Cat c = new Cat("Tom","Bob","Black","Short");
		try {
			c.setSex(3);
			c.toString();
			c.setBoardStart(8, 20, 2020);
			c.setBoardEnd(8, 29, 2020);
			boolean flag = c.boarding(8, 25, 2020);
			System.out.println(c+"\n");
			
			if(flag == true)
				System.out.println("Valid Data - Data is between Start Date and End Date ");
			else
				System.out.println("Invalid Data - Data is not between Start Date and End Date");	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
