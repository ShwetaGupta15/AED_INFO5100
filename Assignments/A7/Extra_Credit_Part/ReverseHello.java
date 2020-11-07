package A7;

import java.util.*;

public class ReverseHello extends Thread
{
	public static int start = 0;
	public static int count = 50;
	  String myString = "Hello from Thread:";
	  String revString = " ";
	
	
	public ReverseHello(int s) 
	{
	this.start = s;
	}
	
	@Override
	public void run () 
	{
	    String myString = "Hello from Thread : ";
		String revString = "";
		if (start < count) 
		{
			start++;
			Thread t1 = new ReverseHello(start);				
			String finStr = myString.concat(String.valueOf(start)).concat(" !");
			//System.out.println(finStr);
			String[] myStrArr = finStr.split(" ");
			
			for(int i = myStrArr.length-1; i>=0;i--)
			{
				if (i == myStrArr.length-1)
					revString = revString + myStrArr[i];
				else
					revString = revString + " " + myStrArr[i];
			}
			System.out.println("--------------------------------");
			System.out.println("**Normal String**  : " + finStr);
			System.out.println("--------------------------------");
			System.out.println("**Reverse String** : " + revString);
			System.out.println("--------------------------------");
			t1.start();		
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thread th = new ReverseHello(start);
		th.start();
		th.join();
		
	}
}


	

