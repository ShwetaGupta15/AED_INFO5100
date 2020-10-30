package A6;

import java.util.*;

public class Mreview implements Comparable<Mreview>
{
	private String title;
	private ArrayList<Integer> ratings;
	
	public Mreview ()
	{
		this.title = "Kill Bill";
		this.ratings = new ArrayList<Integer>();		
	}
	
	public Mreview(String ttl)
	{
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
	}
	
	public Mreview(String ttl, int firstRating)
	{
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
		ratings.add(firstRating);
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void addRating(int r)
	{
		ratings.add(r);
	}
	
	public int numRatings()
	{
		return this.ratings.size();
	}
	public double aveRating() 
	{
		int sum = 0;
		for(int i = 0; i<numRatings(); i++)
		{
			sum += ratings.get(i);
		}
		return sum/numRatings();
	}
	
@Override
	public int compareTo(Mreview o) 
	{
		// TODO Auto-generated method stub
		return (this.title).compareTo(o.title);		
	}
	
@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		
		Mreview m1 = (Mreview)obj;
		if(m1.title == null)
			return false;
		
		if (this.title != m1.title)
			return false;
		
		System.out.println("Equal Method is called to compare if two titles are same :");
		return true;		
	}
	
	public String toString()
	{
		if(numRatings() == 0)
			return getTitle()+" "+"has no rating \n";
		
		else 
			return "Movie Title: "+getTitle()+ "\n"+"Has average rating of :"+ aveRating()+ "\nOut of:"+numRatings()+ "\n";
	}
}
