package A6;

import java.util.*;

public class TestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mreview rev = new Mreview("Kill Bill", 3);
		rev.addRating(4);
		rev.addRating(3);
		
		System.out.println("The Ratings of the Movie are :\n" +rev);
		
		System.out.println("Average rating of the movie :\n" + rev.toString());
		
		
		Mreview m2 = new Mreview("Harry Potter");
		Mreview m3 = new Mreview("Lucy", 4);
		Mreview m4 = new Mreview("Ratatouille",5);
		ArrayList<Mreview> list = new ArrayList<Mreview>();
		list.add(m2);
		list.add(m3);
		list.add(m4);
		System.out.println(list+"\n");
	}

}
