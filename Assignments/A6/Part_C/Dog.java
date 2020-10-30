package PartC;

import java.util.*;


public class Dog extends Pet implements Boardable
{
	private String size;
	private int startMonth, endMonth;
	private int startDay, endDay;
	private int startYear, endYear;
	
	public Dog(String pName, String oName, String color, String size) 
	{
		super(pName, oName, color);
		this.size = size;
	}
	
	public String getSize()
	{
		return this.size;
	}
	public String toString()
	{
		return getClass().getSimpleName().toUpperCase()+":\n"+getPetName()+" Owned by "+getOwnerName()+"\nColor : "+getColor()+"\nSex : "+getSex()+"\nSize : "+getSize(); 
	}
	@Override
	public void setBoardStart(int month, int day, int year) 
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
		Dog d = new Dog("Spot","Susan","White","Medium");
		try {d.setSex(3);
		d.toString();
		
		d.setBoardStart(2020,8,25);
		d.setBoardEnd(2017,9,26);
		boolean board= d.boarding(2018,12,5);
		
		System.out.println(d+"\n");
		
		if(board == true)
			System.out.println("Valid Data - Data is between Start Date and End Date ");
		else
			System.out.println("Invalid Data - Data is not between Start Date and End Date");	
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

