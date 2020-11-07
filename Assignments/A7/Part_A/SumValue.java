package A7;

import java.util.*;

public class SumValue 
{
	
	/*generate array of random numbers*/
	static void generateRandomArray(int[] arr)
	{
		Random rand  = new Random();
		for(int i = 0; i<arr.length;i++)
		{
		arr[i] = rand.nextInt(4000000);  
		}
		
	}
	
	/*get sum of an array using 4 threads*/
	public static long sum(int[] array) throws InterruptedException
	{
		long totalSum = 0;
		int arrLength = (array.length/4);  											// Dividing the thread in 4 parts
		MultiThreadSum thrd1 = new MultiThreadSum(array, 0, arrLength);   				/* First part of the thread*/
		MultiThreadSum thrd2 = new MultiThreadSum(array, arrLength, arrLength*2); 		/* Second part of the thread*/
		MultiThreadSum thrd3 = new MultiThreadSum(array, arrLength*2, arrLength*3);		/* Third part of the thread*/
		MultiThreadSum thrd4 = new MultiThreadSum(array, arrLength*3, arrLength*4);		/* Fourth part of the thread*/
		
		thrd1.start();
		thrd2.start();
		thrd3.start();
		thrd4.start();
		
		thrd1.join();
		thrd2.join();
		thrd3.join();
		thrd4.join();
		
		totalSum = thrd1.getSum()+thrd2.getSum()+thrd3.getSum()+thrd4.getSum();
				
		return totalSum;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
	int[] arr = new int[4000000];
	generateRandomArray(arr);
	long sum = sum(arr);
	System.out.println("Total Sum of 4 threads : " + sum);
	}
}

class MultiThreadSum extends Thread
{
	 private int[] arr;
	 private int start;
	 private int end;
	 private long sum;
	 
	 public MultiThreadSum(int arr[], int start, int end) 
	 {
	 this.start = start;
	 this.end = end;
	 this.arr = arr;
	 }

	 public long getSum() 
	 {
	 return sum;
	 }

@Override
	public void run() 
	{
	for (int i = start; i < end; i++) 
	{
		sum += arr[i];
	}
	}
}

